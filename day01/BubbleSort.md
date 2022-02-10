# 버블 정렬
## 시간 복잡도 : O(N²)
**거품 정렬** 또는 **버블 정렬**은 두 인접한 데이터를 검사하여 정렬하는 방법   
![Bubble_sort_animation](https://user-images.githubusercontent.com/48544100/153213352-691d4ae1-ae0e-4bfd-8ee4-5c28e1bd93b9.gif)
   
## 장점
- 코드가 단순
- 구현이 쉬움   
   
## 단점
- 시간 복잡도가 상당히 느림   
   
## 동작 구현
**반복문**으로 구현   
```java
public class BubbleSort{
	
	public static void main(String[] args){
		
		int[] arr = {3, 5, 6, 2, 1, 4};
		
		int length = arr.length - 1;
		
		for(int i=0; i < length; i++){
			
			// 마지막 데이터까지 갈 필요 없기 때문에 -i 을 해줌 ( 증가하는 i만큼 덜 돌게됨 )
			for(int j=0; j < length-i; j++){
				// 현재 돌고있는 데이터가 인접한 데이터보다 값이 큰 경우 swap이 필요
				if(arr[j] > arr[j+i]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
		}
		
		for(int el : arr){
			System.out.print(el);
		}
		
	}
	
}
```
![1](https://user-images.githubusercontent.com/48544100/153218182-f4623453-a2dd-4588-8e75-ffc7d2670f9c.JPG)   
![2](https://user-images.githubusercontent.com/48544100/153218188-7bb0394c-fc91-43d7-a805-8932a8ca36d4.JPG)   
![3](https://user-images.githubusercontent.com/48544100/153218189-ed55ae05-787e-4c4d-aa8a-8fe87830c2ea.JPG)   
![4](https://user-images.githubusercontent.com/48544100/153218191-1023f76c-a52e-4580-b054-c520835cc9f6.JPG)   
![5](https://user-images.githubusercontent.com/48544100/153218193-e88978d6-2ab0-4090-a26a-9d9b0f7d3e28.JPG)   
![6](https://user-images.githubusercontent.com/48544100/153218195-817f1131-a8d9-4918-b634-55c2eb996e41.JPG)   
![7](https://user-images.githubusercontent.com/48544100/153218197-6918bd8d-1f6c-4afc-b237-ef90475bb9f3.JPG)   
![8](https://user-images.githubusercontent.com/48544100/153218200-8699771d-3f64-47dd-9fee-080861f1ea3c.JPG)   
![9](https://user-images.githubusercontent.com/48544100/153218202-f89ac345-9128-41f7-ac68-a3eb437fe662.JPG)   
![10](https://user-images.githubusercontent.com/48544100/153218205-d011f848-8055-49ce-b386-121a3f8e3c3c.JPG)   
![11](https://user-images.githubusercontent.com/48544100/153218207-cec948d4-6cd1-4253-ba30-6c4676482d9f.JPG)   
![12](https://user-images.githubusercontent.com/48544100/153218211-d17efcee-02cc-408e-bd99-0681f8fda55c.JPG)   
![13](https://user-images.githubusercontent.com/48544100/153218214-f4d56947-9e21-4de0-9be9-56a4541a3cf4.JPG)   
![14](https://user-images.githubusercontent.com/48544100/153218219-9490c30a-fb89-4965-a409-4d183131e3c1.JPG)   
![15](https://user-images.githubusercontent.com/48544100/153218224-2946e5c0-668d-4be3-9f91-6371e47f4a72.JPG)   
![16](https://user-images.githubusercontent.com/48544100/153218225-9bbae762-727b-4fda-88c8-5e36270e28aa.JPG)   
![17](https://user-images.githubusercontent.com/48544100/153218229-9bf33d84-7308-492c-b86d-e68ed303636a.JPG)   
