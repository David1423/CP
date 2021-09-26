#include<iostream>
int binarySearch(int *, int);

//main function
int main(){
    //declaring an array or sorted elements.
    int arr[]={1,2,13,34,55,76,87,98,109,310};
    int ele;

    std::cout<<"Enter any number";
    std::cin>>ele;
    int pos = binarySearch(arr, ele);
    if(pos!=-1)
    std::cout<<"Element found at "<<pos+1<<" place";
    else
    std::cout<<"Element not found";
    
    return 0;
}
int binarySearch(int *arr, int ele){

    int low=0;
    //int high=sizeof(arr)/sizeof(arr[0]);
    int high=10;
    int mid = 0;

    while(low<=high){
        
        mid=low+(high-low)/2;

        if(ele==arr[mid]){
            return mid;
        }
        else if (ele<arr[mid])
            high= mid;
        
        else if(ele>arr[mid])
            low=mid;
    }//while
    return -1;
}
