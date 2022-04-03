let arr=[1,2,3,4,5];
		function square(x){
			return x*x;
		}
		function map(arr,func){
			for(var i=0;i<arr.length;i++){
				arr[i]=func(arr[i]);
			}
			return arr;
		}
		document.write(map(arr,square));