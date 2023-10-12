function reverseWordsInSentence(sentence) {
  const words = sentence.split(' ');
  const reversedWords = words.map(word => {
    return word.split('').reverse().join('');
  });
  const reversedSentence = reversedWords.join(' ');
  return reversedSentence;
}

// Prompt the user for input
const inputSentence = prompt("Enter a sentence:"); // Prompt will display a dialog to enter text

// Check if the user input is not null (e.g., the user didn't cancel the prompt)
if (inputSentence !== null) {
  const reversedSentence = reverseWordsInSentence(inputSentence);
  console.log("Reversed Sentence: " + reversedSentence);
} else {
  console.log("No input provided.");
}
