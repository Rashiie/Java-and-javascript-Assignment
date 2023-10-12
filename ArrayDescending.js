function sortArrayDescending(arr) {
  return arr.sort((a, b) => b - a);
}

// Prompt the user for input
const input = prompt("Enter a list of numbers separated by commas (e.g., 3, 1, 2):");
if (input !== null) {
  const inputArray = input.split(',').map(Number); // Split the input string into an array of numbers
  const sortedArray = sortArrayDescending(inputArray);
  console.log("Sorted Array (Descending): " + sortedArray);
} else {
  console.log("No input provided.");
}

