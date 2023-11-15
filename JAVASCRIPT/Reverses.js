function reverseWords(sentence) {
  let reversedWord = "";
  let reversedSentence = "";

  for (let i = 0; i < sentence.length; i++) {
    if (sentence[i] !== " ") {
      reversedWord = sentence[i] + reversedWord;
    } else {
      reversedSentence += reversedWord + " ";
      reversedWord = "";
    }
  }

  reversedSentence += reversedWord; // Add the last word to the reversed sentence

  return reversedSentence;
}

const inputSentence = "This is a sunny day";
const reversedSentence = reverseWords(inputSentence);
console.log("Reversed Sentence:", reversedSentence);
