function sortDescending(arr) {
  let len = arr.length;
  for (let i = 0; i < len - 1; i++) {
    for (let j = i + 1; j < len; j++) {
      if (arr[i] < arr[j]) {
        // Swap elements if the current element is less than the next element
        let temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
  }
  return arr;
}

const array = [3, 1, 5, 2, 4];
const sortedArray = sortDescending(array);
console.log("Sorted in Descending Order:", sortedArray);
