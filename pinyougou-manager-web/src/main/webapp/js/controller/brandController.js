//品牌控制层
app.controller('brandController', function($scope, $controller,brandService) {
		
	$controller('baseController',{$scope:$scope});
		
	
		//查询品牌列表
		$scope.findAll = function() {
			  brandService.findAll().success(
					  function(response) {
				$scope.list = response;//给列表变量赋值

			});
		}

		
	
		//分页
		$scope.findPage = function(page, rows) {
			brandService.findPage(page,rows)
					.success(function(response) {
						$scope.list = response.rows;//显示当前页数据 和实体类的成员变量对应
						$scope.paginationConf.totalItems = response.total;//更新总记录数
					}

					);
		}

		//添加一个品牌(又添加又保存)
		$scope.save=function(){				
			var serviceObject;//服务层对象  				
			if($scope.entity.id!=null){//如果有ID
				serviceObject=brandService.update( $scope.entity ); //修改  
			}else{
				serviceObject=brandService.add( $scope.entity  );//增加 
			}				
			serviceObject.success(
				function(response){
					if(response.success){
						//重新查询 
			        	$scope.reloadList();//重新加载
					}else{
						alert(response.message);
					}
				}		
			);				
		}

		//查询品牌
		$scope.findOne = function(id) {
			brandService.findOne(id).success(
					function(response) {
						//$scpoe.entity=response;
						$scope.entity = response;

					});
		}

		//删除品牌
		$scope.selectIds = [];//选中的ID集合

		//更新复选框
		$scope.updateSelection = function($event, id) {
			if ($event.target.checked) {//如果是被选中,则增加到数组
				$scope.selectIds.push(id);

			} else {

				var idx = $scope.selectIds.indexOf(id);
				$scope.selectIds.splice(idx, 1);//删除
			}
		}
		//批量删除品牌
		$scope.dele = function() {
			//获取选中的复选框
			brandService.dele($scope.selectIds).success(
					function(response) {
						if (response.success) {
							$scope.reloadList();//刷新列表
						}

					});

		}

		$scope.searchEntity = {};//定义搜索对象
		//搜所分页查询
		$scope.search = function(page, size) {
			brandService.search(page, size,$scope.searchEntity).success(function(response) {

				$scope.list = response.rows;//显示当前页数据
				$scope.paginationConf.totalItems = response.total;//总记录数
			});

		}

	});