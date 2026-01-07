{
  "filepath": "/tmp/Lang-11b/src/main/java/org/apache/commons/lang3/text/StrBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StrBuilder",
      "is_interface": false,
      "parent_types": [
        "java.lang.CharSequence",
        "java.lang.Appendable",
        "java.io.Serializable"
      ],
      "begin_line": 74,
      "end_line": 2856,
      "comment": "\n * Builds a string from constituent parts providing a more flexible and powerful API\n * than StringBuffer.\n * \u003cp\u003e\n * The main differences from StringBuffer/StringBuilder are:\n * \u003cul\u003e\n * \u003cli\u003eNot synchronized\u003c/li\u003e\n * \u003cli\u003eNot final\u003c/li\u003e\n * \u003cli\u003eSubclasses have direct access to character array\u003c/li\u003e\n * \u003cli\u003eAdditional methods\n *  \u003cul\u003e\n *   \u003cli\u003eappendWithSeparators - adds an array of values, with a separator\u003c/li\u003e\n *   \u003cli\u003eappendPadding - adds a length padding characters\u003c/li\u003e\n *   \u003cli\u003eappendFixedLength - adds a fixed width field to the builder\u003c/li\u003e\n *   \u003cli\u003etoCharArray/getChars - simpler ways to get a range of the character array\u003c/li\u003e\n *   \u003cli\u003edelete - delete char or string\u003c/li\u003e\n *   \u003cli\u003ereplace - search and replace for a char or string\u003c/li\u003e\n *   \u003cli\u003eleftString/rightString/midString - substring without exceptions\u003c/li\u003e\n *   \u003cli\u003econtains - whether the builder contains a char or string\u003c/li\u003e\n *   \u003cli\u003esize/clear/isEmpty - collections style API methods\u003c/li\u003e\n *  \u003c/ul\u003e\n * \u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cli\u003eViews\n *  \u003cul\u003e\n *   \u003cli\u003easTokenizer - uses the internal buffer as the source of a StrTokenizer\u003c/li\u003e\n *   \u003cli\u003easReader - uses the internal buffer as the source of a Reader\u003c/li\u003e\n *   \u003cli\u003easWriter - allows a Writer to write directly to the internal buffer\u003c/li\u003e\n *  \u003c/ul\u003e\n * \u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * The aim has been to provide an API that mimics very closely what StringBuffer\n * provides, but with additional methods. It should be noted that some edge cases,\n * with invalid indices or null input, have been altered - see individual methods.\n * The biggest of these changes is that by default, null will not output the text\n * \u0027null\u0027. This can be controlled by a property, {@link #setNullText(String)}.\n * \u003cp\u003e\n * Prior to 3.0, this class implemented Cloneable but did not implement the \n * clone method so could not be used. From 3.0 onwards it no longer implements \n * the interface. \n *\n * @since 2.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "CAPACITY"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * The extra capacity for new builders.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "buffer"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " TODO make private?"
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " TODO make private?"
    },
    {
      "type": "field",
      "varNames": [
        "newLine"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " The new line. "
    },
    {
      "type": "field",
      "varNames": [
        "nullText"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " The null text. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilder()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Constructor that creates an empty builder initial capacity 32 characters.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilder(int)",
      "begin_line": 110,
      "end_line": 116,
      "comment": "\n     * Constructor that creates an empty builder the specified initial capacity.\n     *\n     * @param initialCapacity  the initial capacity, zero or less will be converted to 32\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 16)",
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 115,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilder(java.lang.String)",
      "begin_line": 124,
      "end_line": 132,
      "comment": "\n     * Constructor that creates a builder from the string, allocating\n     * 32 extra characters for growth.\n     *\n     * @param str  the string to copy, null treated as blank string\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 16)",
        "(line 126,col 9)-(line 131,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.getNewLineText()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * Gets the text to be appended when a new line is added.\n     *\n     * @return the new line text, null means use system default\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.setNewLineText(java.lang.String)",
      "begin_line": 150,
      "end_line": 153,
      "comment": "\n     * Sets the text to be appended when a new line is added.\n     *\n     * @param newLine  the new line text, null means use system default\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 31)",
        "(line 152,col 9)-(line 152,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.getNullText()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * Gets the text to be appended when null is added.\n     *\n     * @return the null text, null means no append\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.setNullText(java.lang.String)",
      "begin_line": 171,
      "end_line": 177,
      "comment": "\n     * Sets the text to be appended when null is added.\n     *\n     * @param nullText  the null text, null means no append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 33)",
        "(line 176,col 9)-(line 176,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.length()",
      "begin_line": 185,
      "end_line": 188,
      "comment": "\n     * Gets the length of the string builder.\n     *\n     * @return the length\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.setLength(int)",
      "begin_line": 198,
      "end_line": 214,
      "comment": "\n     * Updates the length of the builder by either dropping the last characters\n     * or adding filler of Unicode zero.\n     *\n     * @param length  the length to set to, must be zero or positive\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the length is negative\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 213,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.capacity()",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\n     * Gets the current size of the internal character array buffer.\n     *\n     * @return the capacity\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.ensureCapacity(int)",
      "begin_line": 232,
      "end_line": 239,
      "comment": "\n     * Checks the capacity and ensures that it is at least the size specified.\n     *\n     * @param capacity  the capacity to ensure\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.minimizeCapacity()",
      "begin_line": 246,
      "end_line": 253,
      "comment": "\n     * Minimizes the capacity to the actual length of the string.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 252,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.size()",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\n     * Gets the length of the string builder.\n     * \u003cp\u003e\n     * This method is the same as {@link #length()} and is provided to match the\n     * API of Collections.\n     *\n     * @return the length\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.isEmpty()",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\n     * Checks is the string builder is empty (convenience Collections API style method).\n     * \u003cp\u003e\n     * This method is the same as checking {@link #length()} and is provided to match the\n     * API of Collections.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the size is \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.clear()",
      "begin_line": 291,
      "end_line": 294,
      "comment": "\n     * Clears the string builder (convenience Collections API style method).\n     * \u003cp\u003e\n     * This method does not reduce the size of the internal character buffer.\n     * To do that, call \u003ccode\u003eclear()\u003c/code\u003e followed by {@link #minimizeCapacity()}.\n     * \u003cp\u003e\n     * This method is the same as {@link #setLength(int)} called with zero\n     * and is provided to match the API of Collections.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 17)",
        "(line 293,col 9)-(line 293,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.charAt(int)",
      "begin_line": 306,
      "end_line": 312,
      "comment": "\n     * Gets the character at the specified index.\n     *\n     * @see #setCharAt(int, char)\n     * @see #deleteCharAt(int)\n     * @param index  the index to retrieve, must be valid\n     * @return the character at the index\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 311,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.setCharAt(int, char)",
      "begin_line": 324,
      "end_line": 330,
      "comment": "\n     * Sets the character at the specified index.\n     *\n     * @see #charAt(int)\n     * @see #deleteCharAt(int)\n     * @param index  the index to set\n     * @param ch  the new character\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 328,col 27)",
        "(line 329,col 9)-(line 329,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.deleteCharAt(int)",
      "begin_line": 341,
      "end_line": 347,
      "comment": "\n     * Deletes the character at the specified index.\n     *\n     * @see #charAt(int)\n     * @see #setCharAt(int, char)\n     * @param index  the index to delete\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 40)",
        "(line 346,col 9)-(line 346,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.toCharArray()",
      "begin_line": 355,
      "end_line": 362,
      "comment": "\n     * Copies the builder\u0027s character array into a new character array.\n     * \n     * @return a new array that represents the contents of the builder\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 359,col 38)",
        "(line 360,col 9)-(line 360,col 52)",
        "(line 361,col 9)-(line 361,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.toCharArray(int, int)",
      "begin_line": 374,
      "end_line": 383,
      "comment": "\n     * Copies part of the builder\u0027s character array into a new character array.\n     * \n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except that\n     *  if too large it is treated as end of string\n     * @return a new array that holds part of the contents of the builder\n     * @throws IndexOutOfBoundsException if startIndex is invalid,\n     *  or if endIndex is invalid (but endIndex greater than size is valid)\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 55)",
        "(line 376,col 9)-(line 376,col 40)",
        "(line 377,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 380,col 37)",
        "(line 381,col 9)-(line 381,col 60)",
        "(line 382,col 9)-(line 382,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.getChars(char[])",
      "begin_line": 391,
      "end_line": 398,
      "comment": "\n     * Copies the character array into the specified array.\n     * \n     * @param destination  the destination array, null will cause an array to be created\n     * @return the input array, unless that was null or too small\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 27)",
        "(line 393,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 396,col 57)",
        "(line 397,col 9)-(line 397,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.getChars(int, int, char[], int)",
      "begin_line": 410,
      "end_line": 421,
      "comment": "\n     * Copies the character array into the specified array.\n     *\n     * @param startIndex  first index to copy, inclusive, must be valid\n     * @param endIndex  last index, exclusive, must be valid\n     * @param destination  the destination array, must not be null or too small\n     * @param destinationIndex  the index to start copying in destination\n     * @throws NullPointerException if the array is null\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 419,col 9)",
        "(line 420,col 9)-(line 420,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendNewLine()",
      "begin_line": 433,
      "end_line": 439,
      "comment": "\n     * Appends the new line string to this string builder.\n     * \u003cp\u003e\n     * The new line string can be altered using {@link #setNewLineText(String)}.\n     * This might be used to force the output to always use Unix line endings\n     * even when on Windows.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 438,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendNull()",
      "begin_line": 446,
      "end_line": 451,
      "comment": "\n     * Appends the text representing \u003ccode\u003enull\u003c/code\u003e to this string builder.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 450,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(java.lang.Object)",
      "begin_line": 460,
      "end_line": 465,
      "comment": "\n     * Appends an object to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param obj  the object to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 463,col 9)",
        "(line 464,col 9)-(line 464,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(java.lang.CharSequence)",
      "begin_line": 475,
      "end_line": 481,
      "comment": "\n     * Appends a CharSequence to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param seq  the CharSequence to append\n     * @return this, to enable chaining\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 479,col 9)",
        "(line 480,col 9)-(line 480,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(java.lang.CharSequence, int, int)",
      "begin_line": 493,
      "end_line": 499,
      "comment": "\n     * Appends part of a CharSequence to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param seq  the CharSequence to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 497,col 9)",
        "(line 498,col 9)-(line 498,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(java.lang.String)",
      "begin_line": 508,
      "end_line": 520,
      "comment": "\n     * Appends a string to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 511,col 9)",
        "(line 512,col 9)-(line 512,col 34)",
        "(line 513,col 9)-(line 518,col 9)",
        "(line 519,col 9)-(line 519,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(java.lang.String, int, int)",
      "begin_line": 531,
      "end_line": 548,
      "comment": "\n     * Appends part of a string to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 534,col 9)",
        "(line 535,col 9)-(line 537,col 9)",
        "(line 538,col 9)-(line 540,col 9)",
        "(line 541,col 9)-(line 546,col 9)",
        "(line 547,col 9)-(line 547,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(java.lang.StringBuffer)",
      "begin_line": 557,
      "end_line": 569,
      "comment": "\n     * Appends a string buffer to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string buffer to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 560,col 9)",
        "(line 561,col 9)-(line 561,col 34)",
        "(line 562,col 9)-(line 567,col 9)",
        "(line 568,col 9)-(line 568,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(java.lang.StringBuffer, int, int)",
      "begin_line": 580,
      "end_line": 597,
      "comment": "\n     * Appends part of a string buffer to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 581,col 9)-(line 583,col 9)",
        "(line 584,col 9)-(line 586,col 9)",
        "(line 587,col 9)-(line 589,col 9)",
        "(line 590,col 9)-(line 595,col 9)",
        "(line 596,col 9)-(line 596,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(org.apache.commons.lang3.text.StrBuilder)",
      "begin_line": 606,
      "end_line": 618,
      "comment": "\n     * Appends another string builder to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string builder to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 609,col 9)",
        "(line 610,col 9)-(line 610,col 34)",
        "(line 611,col 9)-(line 616,col 9)",
        "(line 617,col 9)-(line 617,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(org.apache.commons.lang3.text.StrBuilder, int, int)",
      "begin_line": 629,
      "end_line": 646,
      "comment": "\n     * Appends part of a string builder to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 630,col 9)-(line 632,col 9)",
        "(line 633,col 9)-(line 635,col 9)",
        "(line 636,col 9)-(line 638,col 9)",
        "(line 639,col 9)-(line 644,col 9)",
        "(line 645,col 9)-(line 645,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(char[])",
      "begin_line": 655,
      "end_line": 667,
      "comment": "\n     * Appends a char array to the string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param chars  the char array to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 656,col 9)-(line 658,col 9)",
        "(line 659,col 9)-(line 659,col 34)",
        "(line 660,col 9)-(line 665,col 9)",
        "(line 666,col 9)-(line 666,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(char[], int, int)",
      "begin_line": 678,
      "end_line": 695,
      "comment": "\n     * Appends a char array to the string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param chars  the char array to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 679,col 9)-(line 681,col 9)",
        "(line 682,col 9)-(line 684,col 9)",
        "(line 685,col 9)-(line 687,col 9)",
        "(line 688,col 9)-(line 693,col 9)",
        "(line 694,col 9)-(line 694,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(boolean)",
      "begin_line": 703,
      "end_line": 719,
      "comment": "\n     * Appends a boolean value to the string builder.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 704,col 9)-(line 717,col 9)",
        "(line 718,col 9)-(line 718,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(char)",
      "begin_line": 728,
      "end_line": 734,
      "comment": "\n     * Appends a char value to the string builder.\n     *\n     * @param ch  the value to append\n     * @return this, to enable chaining\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 730,col 9)-(line 730,col 27)",
        "(line 731,col 9)-(line 731,col 32)",
        "(line 732,col 9)-(line 732,col 28)",
        "(line 733,col 9)-(line 733,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(int)",
      "begin_line": 742,
      "end_line": 744,
      "comment": "\n     * Appends an int value to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 743,col 9)-(line 743,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(long)",
      "begin_line": 752,
      "end_line": 754,
      "comment": "\n     * Appends a long value to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 753,col 9)-(line 753,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(float)",
      "begin_line": 762,
      "end_line": 764,
      "comment": "\n     * Appends a float value to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 763,col 9)-(line 763,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(double)",
      "begin_line": 772,
      "end_line": 774,
      "comment": "\n     * Appends a double value to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 773,col 9)-(line 773,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(java.lang.Object)",
      "begin_line": 785,
      "end_line": 787,
      "comment": "\n     * Appends an object followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param obj  the object to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 786,col 9)-(line 786,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(java.lang.String)",
      "begin_line": 797,
      "end_line": 799,
      "comment": "\n     * Appends a string followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 798,col 9)-(line 798,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(java.lang.String, int, int)",
      "begin_line": 811,
      "end_line": 813,
      "comment": "\n     * Appends part of a string followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 812,col 9)-(line 812,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(java.lang.StringBuffer)",
      "begin_line": 823,
      "end_line": 825,
      "comment": "\n     * Appends a string buffer followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string buffer to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 824,col 9)-(line 824,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(java.lang.StringBuffer, int, int)",
      "begin_line": 837,
      "end_line": 839,
      "comment": "\n     * Appends part of a string buffer followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 838,col 9)-(line 838,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(org.apache.commons.lang3.text.StrBuilder)",
      "begin_line": 849,
      "end_line": 851,
      "comment": "\n     * Appends another string builder followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string builder to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 850,col 9)-(line 850,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(org.apache.commons.lang3.text.StrBuilder, int, int)",
      "begin_line": 863,
      "end_line": 865,
      "comment": "\n     * Appends part of a string builder followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 864,col 9)-(line 864,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(char[])",
      "begin_line": 875,
      "end_line": 877,
      "comment": "\n     * Appends a char array followed by a new line to the string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param chars  the char array to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 876,col 9)-(line 876,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(char[], int, int)",
      "begin_line": 889,
      "end_line": 891,
      "comment": "\n     * Appends a char array followed by a new line to the string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param chars  the char array to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 890,col 9)-(line 890,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(boolean)",
      "begin_line": 900,
      "end_line": 902,
      "comment": "\n     * Appends a boolean value followed by a new line to the string builder.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 901,col 9)-(line 901,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(char)",
      "begin_line": 911,
      "end_line": 913,
      "comment": "\n     * Appends a char value followed by a new line to the string builder.\n     *\n     * @param ch  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 912,col 9)-(line 912,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(int)",
      "begin_line": 922,
      "end_line": 924,
      "comment": "\n     * Appends an int value followed by a new line to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 923,col 9)-(line 923,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(long)",
      "begin_line": 933,
      "end_line": 935,
      "comment": "\n     * Appends a long value followed by a new line to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 934,col 9)-(line 934,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(float)",
      "begin_line": 944,
      "end_line": 946,
      "comment": "\n     * Appends a float value followed by a new line to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 945,col 9)-(line 945,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(double)",
      "begin_line": 955,
      "end_line": 957,
      "comment": "\n     * Appends a double value followed by a new line to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 956,col 9)-(line 956,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendAll(java.lang.Object[])",
      "begin_line": 969,
      "end_line": 976,
      "comment": "\n     * Appends each item in an array to the builder without any separators.\n     * Appending a null array will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param array  the array to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 970,col 9)-(line 974,col 9)",
        "(line 975,col 9)-(line 975,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendAll(java.lang.Iterable\u003c?\u003e)",
      "begin_line": 987,
      "end_line": 995,
      "comment": "\n     * Appends each item in a iterable to the builder without any separators.\n     * Appending a null iterable will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param iterable  the iterable to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 988,col 9)-(line 993,col 9)",
        "(line 994,col 9)-(line 994,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendAll(java.util.Iterator\u003c?\u003e)",
      "begin_line": 1006,
      "end_line": 1013,
      "comment": "\n     * Appends each item in an iterator to the builder without any separators.\n     * Appending a null iterator will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param it  the iterator to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1007,col 9)-(line 1011,col 9)",
        "(line 1012,col 9)-(line 1012,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendWithSeparators(java.lang.Object[], java.lang.String)",
      "begin_line": 1026,
      "end_line": 1036,
      "comment": "\n     * Appends an array placing separators between each value, but\n     * not before the first or after the last.\n     * Appending a null array will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param array  the array to append\n     * @param separator  the separator to use, null means no separator\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1027,col 9)-(line 1034,col 9)",
        "(line 1035,col 9)-(line 1035,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendWithSeparators(java.lang.Iterable\u003c?\u003e, java.lang.String)",
      "begin_line": 1048,
      "end_line": 1060,
      "comment": "\n     * Appends a iterable placing separators between each value, but\n     * not before the first or after the last.\n     * Appending a null iterable will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param iterable  the iterable to append\n     * @param separator  the separator to use, null means no separator\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1049,col 9)-(line 1058,col 9)",
        "(line 1059,col 9)-(line 1059,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendWithSeparators(java.util.Iterator\u003c?\u003e, java.lang.String)",
      "begin_line": 1072,
      "end_line": 1083,
      "comment": "\n     * Appends an iterator placing separators between each value, but\n     * not before the first or after the last.\n     * Appending a null iterator will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param it  the iterator to append\n     * @param separator  the separator to use, null means no separator\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1073,col 9)-(line 1081,col 9)",
        "(line 1082,col 9)-(line 1082,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendSeparator(java.lang.String)",
      "begin_line": 1106,
      "end_line": 1108,
      "comment": "\n     * Appends a separator if the builder is currently non-empty.\n     * Appending a null separator will have no effect.\n     * The separator is appended using {@link #append(String)}.\n     * \u003cp\u003e\n     * This method is useful for adding a separator each time around the\n     * loop except the first.\n     * \u003cpre\u003e\n     * for (Iterator it \u003d list.iterator(); it.hasNext(); ) {\n     *   appendSeparator(\",\");\n     *   append(it.next());\n     * }\n     * \u003c/pre\u003e\n     * Note that for this simple example, you should use\n     * {@link #appendWithSeparators(Iterable, String)}.\n     * \n     * @param separator  the separator to use, null means no separator\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1107,col 9)-(line 1107,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendSeparator(java.lang.String, java.lang.String)",
      "begin_line": 1137,
      "end_line": 1143,
      "comment": "\n     * Appends one of both separators to the StrBuilder.\n     * If the builder is currently empty it will append the defaultIfEmpty-separator\n     * Otherwise it will append the standard-separator\n     * \n     * Appending a null separator will have no effect.\n     * The separator is appended using {@link #append(String)}.\n     * \u003cp\u003e\n     * This method is for example useful for constructing queries\n     * \u003cpre\u003e\n     * StrBuilder whereClause \u003d new StrBuilder();\n     * if(searchCommand.getPriority() !\u003d null) {\n     *  whereClause.appendSeparator(\" and\", \" where\");\n     *  whereClause.append(\" priority \u003d ?\")\n     * }\n     * if(searchCommand.getComponent() !\u003d null) {\n     *  whereClause.appendSeparator(\" and\", \" where\");\n     *  whereClause.append(\" component \u003d ?\")\n     * }\n     * selectClause.append(whereClause)\n     * \u003c/pre\u003e\n     * \n     * @param standard the separator if builder is not empty, null means no separator\n     * @param defaultIfEmpty the separator if builder is empty, null means no separator\n     * @return this, to enable chaining\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 1138,col 9)-(line 1138,col 59)",
        "(line 1139,col 9)-(line 1141,col 9)",
        "(line 1142,col 9)-(line 1142,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendSeparator(char)",
      "begin_line": 1164,
      "end_line": 1169,
      "comment": "\n     * Appends a separator if the builder is currently non-empty.\n     * The separator is appended using {@link #append(char)}.\n     * \u003cp\u003e\n     * This method is useful for adding a separator each time around the\n     * loop except the first.\n     * \u003cpre\u003e\n     * for (Iterator it \u003d list.iterator(); it.hasNext(); ) {\n     *   appendSeparator(\u0027,\u0027);\n     *   append(it.next());\n     * }\n     * \u003c/pre\u003e\n     * Note that for this simple example, you should use\n     * {@link #appendWithSeparators(Iterable, String)}.\n     * \n     * @param separator  the separator to use\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1165,col 9)-(line 1167,col 9)",
        "(line 1168,col 9)-(line 1168,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendSeparator(char, char)",
      "begin_line": 1182,
      "end_line": 1189,
      "comment": "\n     * Append one of both separators to the builder\n     * If the builder is currently empty it will append the defaultIfEmpty-separator\n     * Otherwise it will append the standard-separator\n     *\n     * The separator is appended using {@link #append(char)}.\n     * @param standard the separator if builder is not empty\n     * @param defaultIfEmpty the separator if builder is empty\n     * @return this, to enable chaining\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 1183,col 9)-(line 1187,col 9)",
        "(line 1188,col 9)-(line 1188,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendSeparator(java.lang.String, int)",
      "begin_line": 1211,
      "end_line": 1216,
      "comment": "\n     * Appends a separator to the builder if the loop index is greater than zero.\n     * Appending a null separator will have no effect.\n     * The separator is appended using {@link #append(String)}.\n     * \u003cp\u003e\n     * This method is useful for adding a separator each time around the\n     * loop except the first.\n     * \u003cpre\u003e\n     * for (int i \u003d 0; i \u003c list.size(); i++) {\n     *   appendSeparator(\",\", i);\n     *   append(list.get(i));\n     * }\n     * \u003c/pre\u003e\n     * Note that for this simple example, you should use\n     * {@link #appendWithSeparators(Iterable, String)}.\n     * \n     * @param separator  the separator to use, null means no separator\n     * @param loopIndex  the loop index\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1212,col 9)-(line 1214,col 9)",
        "(line 1215,col 9)-(line 1215,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendSeparator(char, int)",
      "begin_line": 1238,
      "end_line": 1243,
      "comment": "\n     * Appends a separator to the builder if the loop index is greater than zero.\n     * The separator is appended using {@link #append(char)}.\n     * \u003cp\u003e\n     * This method is useful for adding a separator each time around the\n     * loop except the first.\n     * \u003cpre\u003e\n     * for (int i \u003d 0; i \u003c list.size(); i++) {\n     *   appendSeparator(\",\", i);\n     *   append(list.get(i));\n     * }\n     * \u003c/pre\u003e\n     * Note that for this simple example, you should use\n     * {@link #appendWithSeparators(Iterable, String)}.\n     * \n     * @param separator  the separator to use\n     * @param loopIndex  the loop index\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1239,col 9)-(line 1241,col 9)",
        "(line 1242,col 9)-(line 1242,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendPadding(int, char)",
      "begin_line": 1253,
      "end_line": 1261,
      "comment": "\n     * Appends the pad character to the builder the specified number of times.\n     * \n     * @param length  the length to append, negative means no append\n     * @param padChar  the character to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1254,col 9)-(line 1259,col 9)",
        "(line 1260,col 9)-(line 1260,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendFixedWidthPadLeft(java.lang.Object, int, char)",
      "begin_line": 1275,
      "end_line": 1295,
      "comment": "\n     * Appends an object to the builder padding on the left to a fixed width.\n     * The \u003ccode\u003etoString\u003c/code\u003e of the object is used.\n     * If the object is larger than the length, the left hand side is lost.\n     * If the object is null, the null text value is used.\n     * \n     * @param obj  the object to append, null uses null text\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1276,col 9)-(line 1293,col 9)",
        "(line 1294,col 9)-(line 1294,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendFixedWidthPadLeft(int, int, char)",
      "begin_line": 1307,
      "end_line": 1309,
      "comment": "\n     * Appends an object to the builder padding on the left to a fixed width.\n     * The \u003ccode\u003eString.valueOf\u003c/code\u003e of the \u003ccode\u003eint\u003c/code\u003e value is used.\n     * If the formatted value is larger than the length, the left hand side is lost.\n     * \n     * @param value  the value to append\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1308,col 9)-(line 1308,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendFixedWidthPadRight(java.lang.Object, int, char)",
      "begin_line": 1322,
      "end_line": 1342,
      "comment": "\n     * Appends an object to the builder padding on the right to a fixed length.\n     * The \u003ccode\u003etoString\u003c/code\u003e of the object is used.\n     * If the object is larger than the length, the right hand side is lost.\n     * If the object is null, null text value is used.\n     * \n     * @param obj  the object to append, null uses null text\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1323,col 9)-(line 1340,col 9)",
        "(line 1341,col 9)-(line 1341,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendFixedWidthPadRight(int, int, char)",
      "begin_line": 1354,
      "end_line": 1356,
      "comment": "\n     * Appends an object to the builder padding on the right to a fixed length.\n     * The \u003ccode\u003eString.valueOf\u003c/code\u003e of the \u003ccode\u003eint\u003c/code\u003e value is used.\n     * If the object is larger than the length, the right hand side is lost.\n     * \n     * @param value  the value to append\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1355,col 9)-(line 1355,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, java.lang.Object)",
      "begin_line": 1368,
      "end_line": 1373,
      "comment": "\n     * Inserts the string representation of an object into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param obj  the object to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1369,col 9)-(line 1371,col 9)",
        "(line 1372,col 9)-(line 1372,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, java.lang.String)",
      "begin_line": 1384,
      "end_line": 1399,
      "comment": "\n     * Inserts the string into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param str  the string to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1386,col 9)-(line 1386,col 29)",
        "(line 1387,col 9)-(line 1389,col 9)",
        "(line 1390,col 9)-(line 1390,col 54)",
        "(line 1391,col 9)-(line 1397,col 9)",
        "(line 1398,col 9)-(line 1398,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, char[])",
      "begin_line": 1410,
      "end_line": 1423,
      "comment": "\n     * Inserts the character array into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param chars  the char array to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1411,col 9)-(line 1411,col 29)",
        "(line 1412,col 9)-(line 1414,col 9)",
        "(line 1415,col 9)-(line 1415,col 31)",
        "(line 1416,col 9)-(line 1421,col 9)",
        "(line 1422,col 9)-(line 1422,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, char[], int, int)",
      "begin_line": 1436,
      "end_line": 1454,
      "comment": "\n     * Inserts part of the character array into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param chars  the char array to insert\n     * @param offset  the offset into the character array to start at, must be valid\n     * @param length  the length of the character array part to copy, must be positive\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 1437,col 9)-(line 1437,col 29)",
        "(line 1438,col 9)-(line 1440,col 9)",
        "(line 1441,col 9)-(line 1443,col 9)",
        "(line 1444,col 9)-(line 1446,col 9)",
        "(line 1447,col 9)-(line 1452,col 9)",
        "(line 1453,col 9)-(line 1453,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, boolean)",
      "begin_line": 1464,
      "end_line": 1485,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1465,col 9)-(line 1465,col 29)",
        "(line 1466,col 9)-(line 1483,col 9)",
        "(line 1484,col 9)-(line 1484,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, char)",
      "begin_line": 1495,
      "end_line": 1502,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1496,col 9)-(line 1496,col 29)",
        "(line 1497,col 9)-(line 1497,col 33)",
        "(line 1498,col 9)-(line 1498,col 73)",
        "(line 1499,col 9)-(line 1499,col 30)",
        "(line 1500,col 9)-(line 1500,col 15)",
        "(line 1501,col 9)-(line 1501,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, int)",
      "begin_line": 1512,
      "end_line": 1514,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1513,col 9)-(line 1513,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, long)",
      "begin_line": 1524,
      "end_line": 1526,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1525,col 9)-(line 1525,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, float)",
      "begin_line": 1536,
      "end_line": 1538,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1537,col 9)-(line 1537,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, double)",
      "begin_line": 1548,
      "end_line": 1550,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1549,col 9)-(line 1549,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.deleteImpl(int, int, int)",
      "begin_line": 1561,
      "end_line": 1564,
      "comment": "\n     * Internal method to delete a range without validation.\n     *\n     * @param startIndex  the start index, must be valid\n     * @param endIndex  the end index (exclusive), must be valid\n     * @param len  the length, must be valid\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 1562,col 9)-(line 1562,col 80)",
        "(line 1563,col 9)-(line 1563,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.delete(int, int)",
      "begin_line": 1575,
      "end_line": 1582,
      "comment": "\n     * Deletes the characters between the two specified indices.\n     *\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1576,col 9)-(line 1576,col 55)",
        "(line 1577,col 9)-(line 1577,col 40)",
        "(line 1578,col 9)-(line 1580,col 9)",
        "(line 1581,col 9)-(line 1581,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.deleteAll(char)",
      "begin_line": 1591,
      "end_line": 1606,
      "comment": "\n     * Deletes the character wherever it occurs in the builder.\n     *\n     * @param ch  the character to delete\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1592,col 9)-(line 1604,col 9)",
        "(line 1605,col 9)-(line 1605,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.deleteFirst(char)",
      "begin_line": 1614,
      "end_line": 1622,
      "comment": "\n     * Deletes the character wherever it occurs in the builder.\n     *\n     * @param ch  the character to delete\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1615,col 9)-(line 1620,col 9)",
        "(line 1621,col 9)-(line 1621,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.deleteAll(java.lang.String)",
      "begin_line": 1631,
      "end_line": 1641,
      "comment": "\n     * Deletes the string wherever it occurs in the builder.\n     *\n     * @param str  the string to delete, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1632,col 9)-(line 1632,col 51)",
        "(line 1633,col 9)-(line 1639,col 9)",
        "(line 1640,col 9)-(line 1640,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.deleteFirst(java.lang.String)",
      "begin_line": 1649,
      "end_line": 1658,
      "comment": "\n     * Deletes the string wherever it occurs in the builder.\n     *\n     * @param str  the string to delete, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1650,col 9)-(line 1650,col 51)",
        "(line 1651,col 9)-(line 1656,col 9)",
        "(line 1657,col 9)-(line 1657,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.deleteAll(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 1671,
      "end_line": 1673,
      "comment": "\n     * Deletes all parts of the builder that the matcher matches.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced deletion behaviour.\n     * For example you could write a matcher to delete all occurances\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1672,col 9)-(line 1672,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.deleteFirst(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 1685,
      "end_line": 1687,
      "comment": "\n     * Deletes the first match within the builder using the specified matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced deletion behaviour.\n     * For example you could write a matcher to delete\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1686,col 9)-(line 1686,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replaceImpl(int, int, int, java.lang.String, int)",
      "begin_line": 1700,
      "end_line": 1710,
      "comment": "\n     * Internal method to delete a range without validation.\n     *\n     * @param startIndex  the start index, must be valid\n     * @param endIndex  the end index (exclusive), must be valid\n     * @param removeLen  the length to remove (endIndex - startIndex), must be valid\n     * @param insertStr  the string to replace with, null means delete range\n     * @param insertLen  the length of the insert string, must be valid\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 1701,col 9)-(line 1701,col 51)",
        "(line 1702,col 9)-(line 1706,col 9)",
        "(line 1707,col 9)-(line 1709,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replace(int, int, java.lang.String)",
      "begin_line": 1723,
      "end_line": 1728,
      "comment": "\n     * Replaces a portion of the string builder with another string.\n     * The length of the inserted string does not have to match the removed length.\n     *\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @param replaceStr  the string to replace with, null means delete range\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1724,col 9)-(line 1724,col 55)",
        "(line 1725,col 9)-(line 1725,col 71)",
        "(line 1726,col 9)-(line 1726,col 88)",
        "(line 1727,col 9)-(line 1727,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replaceAll(char, char)",
      "begin_line": 1739,
      "end_line": 1748,
      "comment": "\n     * Replaces the search character with the replace character\n     * throughout the builder.\n     *\n     * @param search  the search character\n     * @param replace  the replace character\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1740,col 9)-(line 1746,col 9)",
        "(line 1747,col 9)-(line 1747,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replaceFirst(char, char)",
      "begin_line": 1758,
      "end_line": 1768,
      "comment": "\n     * Replaces the first instance of the search character with the\n     * replace character in the builder.\n     *\n     * @param search  the search character\n     * @param replace  the replace character\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1759,col 9)-(line 1766,col 9)",
        "(line 1767,col 9)-(line 1767,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replaceAll(java.lang.String, java.lang.String)",
      "begin_line": 1778,
      "end_line": 1789,
      "comment": "\n     * Replaces the search string with the replace string throughout the builder.\n     *\n     * @param searchStr  the search string, null causes no action to occur\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1779,col 9)-(line 1779,col 69)",
        "(line 1780,col 9)-(line 1787,col 9)",
        "(line 1788,col 9)-(line 1788,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replaceFirst(java.lang.String, java.lang.String)",
      "begin_line": 1798,
      "end_line": 1808,
      "comment": "\n     * Replaces the first instance of the search string with the replace string.\n     *\n     * @param searchStr  the search string, null causes no action to occur\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1799,col 9)-(line 1799,col 69)",
        "(line 1800,col 9)-(line 1806,col 9)",
        "(line 1807,col 9)-(line 1807,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replaceAll(org.apache.commons.lang3.text.StrMatcher, java.lang.String)",
      "begin_line": 1822,
      "end_line": 1824,
      "comment": "\n     * Replaces all matches within the builder with the replace string.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced replace behaviour.\n     * For example you could write a matcher to replace all occurances\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1823,col 9)-(line 1823,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replaceFirst(org.apache.commons.lang3.text.StrMatcher, java.lang.String)",
      "begin_line": 1837,
      "end_line": 1839,
      "comment": "\n     * Replaces the first match within the builder with the replace string.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced replace behaviour.\n     * For example you could write a matcher to replace\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1838,col 9)-(line 1838,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replace(org.apache.commons.lang3.text.StrMatcher, java.lang.String, int, int, int)",
      "begin_line": 1858,
      "end_line": 1863,
      "comment": "\n     * Advanced search and replaces within the builder using a matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced behaviour.\n     * For example you could write a matcher to delete all occurances\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the string to replace the match with, null is a delete\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @param replaceCount  the number of times to replace, -1 for replace all\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if start index is invalid\n     ",
      "child_ranges": [
        "(line 1861,col 9)-(line 1861,col 55)",
        "(line 1862,col 9)-(line 1862,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replaceImpl(org.apache.commons.lang3.text.StrMatcher, java.lang.String, int, int, int)",
      "begin_line": 1880,
      "end_line": 1900,
      "comment": "\n     * Replaces within the builder using a matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced behaviour.\n     * For example you could write a matcher to delete all occurances\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the string to replace the match with, null is a delete\n     * @param from  the start index, must be valid\n     * @param to  the end index (exclusive), must be valid\n     * @param replaceCount  the number of times to replace, -1 for replace all\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 1883,col 9)-(line 1885,col 9)",
        "(line 1886,col 9)-(line 1886,col 72)",
        "(line 1887,col 9)-(line 1887,col 28)",
        "(line 1888,col 9)-(line 1898,col 9)",
        "(line 1899,col 9)-(line 1899,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.reverse()",
      "begin_line": 1908,
      "end_line": 1921,
      "comment": "\n     * Reverses the string builder placing each character in the opposite index.\n     * \n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1909,col 9)-(line 1911,col 9)",
        "(line 1913,col 9)-(line 1913,col 28)",
        "(line 1914,col 9)-(line 1914,col 28)",
        "(line 1915,col 9)-(line 1919,col 9)",
        "(line 1920,col 9)-(line 1920,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.trim()",
      "begin_line": 1930,
      "end_line": 1950,
      "comment": "\n     * Trims the builder by removing characters less than or equal to a space\n     * from the beginning and end.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1931,col 9)-(line 1933,col 9)",
        "(line 1934,col 9)-(line 1934,col 23)",
        "(line 1935,col 9)-(line 1935,col 28)",
        "(line 1936,col 9)-(line 1936,col 20)",
        "(line 1937,col 9)-(line 1939,col 9)",
        "(line 1940,col 9)-(line 1942,col 9)",
        "(line 1943,col 9)-(line 1945,col 9)",
        "(line 1946,col 9)-(line 1948,col 9)",
        "(line 1949,col 9)-(line 1949,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.startsWith(java.lang.String)",
      "begin_line": 1961,
      "end_line": 1978,
      "comment": "\n     * Checks whether this builder starts with the specified string.\n     * \u003cp\u003e\n     * Note that this method handles null input quietly, unlike String.\n     * \n     * @param str  the string to search for, null returns false\n     * @return true if the builder starts with the string\n     ",
      "child_ranges": [
        "(line 1962,col 9)-(line 1964,col 9)",
        "(line 1965,col 9)-(line 1965,col 31)",
        "(line 1966,col 9)-(line 1968,col 9)",
        "(line 1969,col 9)-(line 1971,col 9)",
        "(line 1972,col 9)-(line 1976,col 9)",
        "(line 1977,col 9)-(line 1977,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.endsWith(java.lang.String)",
      "begin_line": 1988,
      "end_line": 2006,
      "comment": "\n     * Checks whether this builder ends with the specified string.\n     * \u003cp\u003e\n     * Note that this method handles null input quietly, unlike String.\n     * \n     * @param str  the string to search for, null returns false\n     * @return true if the builder ends with the string\n     ",
      "child_ranges": [
        "(line 1989,col 9)-(line 1991,col 9)",
        "(line 1992,col 9)-(line 1992,col 31)",
        "(line 1993,col 9)-(line 1995,col 9)",
        "(line 1996,col 9)-(line 1998,col 9)",
        "(line 1999,col 9)-(line 1999,col 29)",
        "(line 2000,col 9)-(line 2004,col 9)",
        "(line 2005,col 9)-(line 2005,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.subSequence(int, int)",
      "begin_line": 2013,
      "end_line": 2025,
      "comment": "\n     * {@inheritDoc}\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 2015,col 7)-(line 2017,col 7)",
        "(line 2018,col 7)-(line 2020,col 7)",
        "(line 2021,col 7)-(line 2023,col 7)",
        "(line 2024,col 7)-(line 2024,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.substring(int)",
      "begin_line": 2034,
      "end_line": 2036,
      "comment": "\n     * Extracts a portion of this string builder as a string.\n     * \n     * @param start  the start index, inclusive, must be valid\n     * @return the new string\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 2035,col 9)-(line 2035,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.substring(int, int)",
      "begin_line": 2051,
      "end_line": 2054,
      "comment": "\n     * Extracts a portion of this string builder as a string.\n     * \u003cp\u003e\n     * Note: This method treats an endIndex greater than the length of the\n     * builder as equal to the length of the builder, and continues\n     * without error, unlike StringBuffer or String.\n     * \n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @return the new string\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 2052,col 9)-(line 2052,col 55)",
        "(line 2053,col 9)-(line 2053,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.leftString(int)",
      "begin_line": 2068,
      "end_line": 2076,
      "comment": "\n     * Extracts the leftmost characters from the string builder without\n     * throwing an exception.\n     * \u003cp\u003e\n     * This method extracts the left \u003ccode\u003elength\u003c/code\u003e characters from\n     * the builder. If this many characters are not available, the whole\n     * builder is returned. Thus the returned string may be shorter than the\n     * length requested.\n     * \n     * @param length  the number of characters to extract, negative returns empty string\n     * @return the new string\n     ",
      "child_ranges": [
        "(line 2069,col 9)-(line 2075,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.rightString(int)",
      "begin_line": 2090,
      "end_line": 2098,
      "comment": "\n     * Extracts the rightmost characters from the string builder without\n     * throwing an exception.\n     * \u003cp\u003e\n     * This method extracts the right \u003ccode\u003elength\u003c/code\u003e characters from\n     * the builder. If this many characters are not available, the whole\n     * builder is returned. Thus the returned string may be shorter than the\n     * length requested.\n     * \n     * @param length  the number of characters to extract, negative returns empty string\n     * @return the new string\n     ",
      "child_ranges": [
        "(line 2091,col 9)-(line 2097,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.midString(int, int)",
      "begin_line": 2116,
      "end_line": 2128,
      "comment": "\n     * Extracts some characters from the middle of the string builder without\n     * throwing an exception.\n     * \u003cp\u003e\n     * This method extracts \u003ccode\u003elength\u003c/code\u003e characters from the builder\n     * at the specified index.\n     * If the index is negative it is treated as zero.\n     * If the index is greater than the builder size, it is treated as the builder size.\n     * If the length is negative, the empty string is returned.\n     * If insufficient characters are available in the builder, as much as possible is returned.\n     * Thus the returned string may be shorter than the length requested.\n     * \n     * @param index  the index to start at, negative means zero\n     * @param length  the number of characters to extract, negative returns empty string\n     * @return the new string\n     ",
      "child_ranges": [
        "(line 2117,col 9)-(line 2119,col 9)",
        "(line 2120,col 9)-(line 2122,col 9)",
        "(line 2123,col 9)-(line 2127,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.contains(char)",
      "begin_line": 2137,
      "end_line": 2145,
      "comment": "\n     * Checks if the string builder contains the specified char.\n     *\n     * @param ch  the character to find\n     * @return true if the builder contains the character\n     ",
      "child_ranges": [
        "(line 2138,col 9)-(line 2138,col 32)",
        "(line 2139,col 9)-(line 2143,col 9)",
        "(line 2144,col 9)-(line 2144,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.contains(java.lang.String)",
      "begin_line": 2153,
      "end_line": 2155,
      "comment": "\n     * Checks if the string builder contains the specified string.\n     *\n     * @param str  the string to find\n     * @return true if the builder contains the string\n     ",
      "child_ranges": [
        "(line 2154,col 9)-(line 2154,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.contains(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 2168,
      "end_line": 2170,
      "comment": "\n     * Checks if the string builder contains a string matched using the\n     * specified matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to search for the character\n     * \u0027a\u0027 followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @return true if the matcher finds a match in the builder\n     ",
      "child_ranges": [
        "(line 2169,col 9)-(line 2169,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.indexOf(char)",
      "begin_line": 2179,
      "end_line": 2181,
      "comment": "\n     * Searches the string builder to find the first reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @return the first index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2180,col 9)-(line 2180,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.indexOf(char, int)",
      "begin_line": 2190,
      "end_line": 2202,
      "comment": "\n     * Searches the string builder to find the first reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the first index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2191,col 9)-(line 2191,col 55)",
        "(line 2192,col 9)-(line 2194,col 9)",
        "(line 2195,col 9)-(line 2195,col 32)",
        "(line 2196,col 9)-(line 2200,col 9)",
        "(line 2201,col 9)-(line 2201,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.indexOf(java.lang.String)",
      "begin_line": 2212,
      "end_line": 2214,
      "comment": "\n     * Searches the string builder to find the first reference to the specified string.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @return the first index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2213,col 9)-(line 2213,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.indexOf(java.lang.String, int)",
      "begin_line": 2226,
      "end_line": 2253,
      "comment": "\n     * Searches the string builder to find the first reference to the specified\n     * string starting searching from the given index.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the first index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2227,col 9)-(line 2227,col 55)",
        "(line 2228,col 9)-(line 2230,col 9)",
        "(line 2231,col 9)-(line 2231,col 34)",
        "(line 2232,col 9)-(line 2234,col 9)",
        "(line 2235,col 9)-(line 2237,col 9)",
        "(line 2238,col 9)-(line 2240,col 9)",
        "(line 2241,col 9)-(line 2241,col 32)",
        "(line 2242,col 9)-(line 2242,col 36)",
        "(line 2243,col 9)-(line 2251,col 9)",
        "(line 2252,col 9)-(line 2252,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.indexOf(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 2265,
      "end_line": 2267,
      "comment": "\n     * Searches the string builder using the matcher to find the first match.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @return the first index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2266,col 9)-(line 2266,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.indexOf(org.apache.commons.lang3.text.StrMatcher, int)",
      "begin_line": 2281,
      "end_line": 2294,
      "comment": "\n     * Searches the string builder using the matcher to find the first\n     * match searching from the given index.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the first index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2282,col 9)-(line 2282,col 55)",
        "(line 2283,col 9)-(line 2285,col 9)",
        "(line 2286,col 9)-(line 2286,col 23)",
        "(line 2287,col 9)-(line 2287,col 28)",
        "(line 2288,col 9)-(line 2292,col 9)",
        "(line 2293,col 9)-(line 2293,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.lastIndexOf(char)",
      "begin_line": 2303,
      "end_line": 2305,
      "comment": "\n     * Searches the string builder to find the last reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @return the last index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2304,col 9)-(line 2304,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.lastIndexOf(char, int)",
      "begin_line": 2314,
      "end_line": 2325,
      "comment": "\n     * Searches the string builder to find the last reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the last index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2315,col 9)-(line 2315,col 66)",
        "(line 2316,col 9)-(line 2318,col 9)",
        "(line 2319,col 9)-(line 2323,col 9)",
        "(line 2324,col 9)-(line 2324,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.lastIndexOf(java.lang.String)",
      "begin_line": 2335,
      "end_line": 2337,
      "comment": "\n     * Searches the string builder to find the last reference to the specified string.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @return the last index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2336,col 9)-(line 2336,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.lastIndexOf(java.lang.String, int)",
      "begin_line": 2349,
      "end_line": 2374,
      "comment": "\n     * Searches the string builder to find the last reference to the specified\n     * string starting searching from the given index.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the last index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2350,col 9)-(line 2350,col 66)",
        "(line 2351,col 9)-(line 2353,col 9)",
        "(line 2354,col 9)-(line 2354,col 34)",
        "(line 2355,col 9)-(line 2372,col 9)",
        "(line 2373,col 9)-(line 2373,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.lastIndexOf(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 2386,
      "end_line": 2388,
      "comment": "\n     * Searches the string builder using the matcher to find the last match.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @return the last index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2387,col 9)-(line 2387,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.lastIndexOf(org.apache.commons.lang3.text.StrMatcher, int)",
      "begin_line": 2402,
      "end_line": 2415,
      "comment": "\n     * Searches the string builder using the matcher to find the last\n     * match searching from the given index.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the last index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2403,col 9)-(line 2403,col 66)",
        "(line 2404,col 9)-(line 2406,col 9)",
        "(line 2407,col 9)-(line 2407,col 28)",
        "(line 2408,col 9)-(line 2408,col 38)",
        "(line 2409,col 9)-(line 2413,col 9)",
        "(line 2414,col 9)-(line 2414,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.asTokenizer()",
      "begin_line": 2450,
      "end_line": 2452,
      "comment": "\n     * Creates a tokenizer that can tokenize the contents of this builder.\n     * \u003cp\u003e\n     * This method allows the contents of this builder to be tokenized.\n     * The tokenizer will be setup by default to tokenize on space, tab,\n     * newline and formfeed (as per StringTokenizer). These values can be\n     * changed on the tokenizer class, before retrieving the tokens.\n     * \u003cp\u003e\n     * The returned tokenizer is linked to this builder. You may intermix\n     * calls to the buider and tokenizer within certain limits, however\n     * there is no synchronization. Once the tokenizer has been used once,\n     * it must be {@link StrTokenizer#reset() reset} to pickup the latest\n     * changes in the builder. For example:\n     * \u003cpre\u003e\n     * StrBuilder b \u003d new StrBuilder();\n     * b.append(\"a b \");\n     * StrTokenizer t \u003d b.asTokenizer();\n     * String[] tokens1 \u003d t.getTokenArray();  // returns a,b\n     * b.append(\"c d \");\n     * String[] tokens2 \u003d t.getTokenArray();  // returns a,b (c and d ignored)\n     * t.reset();              // reset causes builder changes to be picked up\n     * String[] tokens3 \u003d t.getTokenArray();  // returns a,b,c,d\n     * \u003c/pre\u003e\n     * In addition to simply intermixing appends and tokenization, you can also\n     * call the set methods on the tokenizer to alter how it tokenizes. Just\n     * remember to call reset when you want to pickup builder changes.\n     * \u003cp\u003e\n     * Calling {@link StrTokenizer#reset(String)} or {@link StrTokenizer#reset(char[])}\n     * with a non-null value will break the link with the builder.\n     *\n     * @return a tokenizer that is linked to this builder\n     ",
      "child_ranges": [
        "(line 2451,col 9)-(line 2451,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.asReader()",
      "begin_line": 2474,
      "end_line": 2476,
      "comment": "\n     * Gets the contents of this builder as a Reader.\n     * \u003cp\u003e\n     * This method allows the contents of the builder to be read\n     * using any standard method that expects a Reader.\n     * \u003cp\u003e\n     * To use, simply create a \u003ccode\u003eStrBuilder\u003c/code\u003e, populate it with\n     * data, call \u003ccode\u003easReader\u003c/code\u003e, and then read away.\n     * \u003cp\u003e\n     * The internal character array is shared between the builder and the reader.\n     * This allows you to append to the builder after creating the reader,\n     * and the changes will be picked up.\n     * Note however, that no synchronization occurs, so you must perform\n     * all operations with the builder and the reader in one thread.\n     * \u003cp\u003e\n     * The returned reader supports marking, and ignores the flush method.\n     *\n     * @return a reader that reads from this builder\n     ",
      "child_ranges": [
        "(line 2475,col 9)-(line 2475,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.asWriter()",
      "begin_line": 2499,
      "end_line": 2501,
      "comment": "\n     * Gets this builder as a Writer that can be written to.\n     * \u003cp\u003e\n     * This method allows you to populate the contents of the builder\n     * using any standard method that takes a Writer.\n     * \u003cp\u003e\n     * To use, simply create a \u003ccode\u003eStrBuilder\u003c/code\u003e,\n     * call \u003ccode\u003easWriter\u003c/code\u003e, and populate away. The data is available\n     * at any time using the methods of the \u003ccode\u003eStrBuilder\u003c/code\u003e.\n     * \u003cp\u003e\n     * The internal character array is shared between the builder and the writer.\n     * This allows you to intermix calls that append to the builder and\n     * write using the writer and the changes will be occur correctly.\n     * Note however, that no synchronization occurs, so you must perform\n     * all operations with the builder and the writer in one thread.\n     * \u003cp\u003e\n     * The returned writer ignores the close and flush methods.\n     *\n     * @return a writer that populates this builder\n     ",
      "child_ranges": [
        "(line 2500,col 9)-(line 2500,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.equalsIgnoreCase(org.apache.commons.lang3.text.StrBuilder)",
      "begin_line": 2541,
      "end_line": 2558,
      "comment": "\n     * Checks the contents of this builder against another to see if they\n     * contain the same character content ignoring case.\n     *\n     * @param other  the object to check, null returns false\n     * @return true if the builders contain the same characters in the same order\n     ",
      "child_ranges": [
        "(line 2542,col 9)-(line 2544,col 9)",
        "(line 2545,col 9)-(line 2547,col 9)",
        "(line 2548,col 9)-(line 2548,col 37)",
        "(line 2549,col 9)-(line 2549,col 39)",
        "(line 2550,col 9)-(line 2556,col 9)",
        "(line 2557,col 9)-(line 2557,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.equals(org.apache.commons.lang3.text.StrBuilder)",
      "begin_line": 2567,
      "end_line": 2582,
      "comment": "\n     * Checks the contents of this builder against another to see if they\n     * contain the same character content.\n     *\n     * @param other  the object to check, null returns false\n     * @return true if the builders contain the same characters in the same order\n     ",
      "child_ranges": [
        "(line 2568,col 9)-(line 2570,col 9)",
        "(line 2571,col 9)-(line 2573,col 9)",
        "(line 2574,col 9)-(line 2574,col 37)",
        "(line 2575,col 9)-(line 2575,col 39)",
        "(line 2576,col 9)-(line 2580,col 9)",
        "(line 2581,col 9)-(line 2581,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.equals(java.lang.Object)",
      "begin_line": 2591,
      "end_line": 2597,
      "comment": "\n     * Checks the contents of this builder against another to see if they\n     * contain the same character content.\n     *\n     * @param obj  the object to check, null returns false\n     * @return true if the builders contain the same characters in the same order\n     ",
      "child_ranges": [
        "(line 2593,col 9)-(line 2595,col 9)",
        "(line 2596,col 9)-(line 2596,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.hashCode()",
      "begin_line": 2604,
      "end_line": 2612,
      "comment": "\n     * Gets a suitable hash code for this builder.\n     *\n     * @return a hash code\n     ",
      "child_ranges": [
        "(line 2606,col 9)-(line 2606,col 28)",
        "(line 2607,col 9)-(line 2607,col 21)",
        "(line 2608,col 9)-(line 2610,col 9)",
        "(line 2611,col 9)-(line 2611,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.toString()",
      "begin_line": 2624,
      "end_line": 2627,
      "comment": "\n     * Gets a String version of the string builder, creating a new instance\n     * each time the method is called.\n     * \u003cp\u003e\n     * Note that unlike StringBuffer, the string version returned is\n     * independent of the string builder.\n     *\n     * @return the builder as a String\n     ",
      "child_ranges": [
        "(line 2626,col 9)-(line 2626,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.toStringBuffer()",
      "begin_line": 2635,
      "end_line": 2637,
      "comment": "\n     * Gets a StringBuffer version of the string builder, creating a\n     * new instance each time the method is called.\n     *\n     * @return the builder as a StringBuffer\n     ",
      "child_ranges": [
        "(line 2636,col 9)-(line 2636,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.validateRange(int, int)",
      "begin_line": 2649,
      "end_line": 2660,
      "comment": "\n     * Validates parameters defining a range of the builder.\n     * \n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @return the new string\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 2650,col 9)-(line 2652,col 9)",
        "(line 2653,col 9)-(line 2655,col 9)",
        "(line 2656,col 9)-(line 2658,col 9)",
        "(line 2659,col 9)-(line 2659,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.validateIndex(int)",
      "begin_line": 2668,
      "end_line": 2672,
      "comment": "\n     * Validates parameters defining a single index in the builder.\n     * \n     * @param index  the index, must be valid\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 2669,col 9)-(line 2671,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StrBuilderTokenizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.StrTokenizer"
      ],
      "begin_line": 2678,
      "end_line": 2707,
      "comment": "\n     * Inner class to allow StrBuilder to operate as a tokenizer.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderTokenizer.StrBuilderTokenizer()",
      "begin_line": 2683,
      "end_line": 2685,
      "comment": "\n         * Default constructor.\n         ",
      "child_ranges": [
        "(line 2684,col 13)-(line 2684,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderTokenizer.tokenize(char[], int, int)",
      "begin_line": 2688,
      "end_line": 2695,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2690,col 13)-(line 2694,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderTokenizer.getContent()",
      "begin_line": 2698,
      "end_line": 2706,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2700,col 13)-(line 2700,col 44)",
        "(line 2701,col 13)-(line 2705,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StrBuilderReader",
      "is_interface": false,
      "parent_types": [
        "java.io.Reader"
      ],
      "begin_line": 2713,
      "end_line": 2798,
      "comment": "\n     * Inner class to allow StrBuilder to operate as a writer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 2715,
      "end_line": 2715,
      "comment": " The current stream position. "
    },
    {
      "type": "field",
      "varNames": [
        "mark"
      ],
      "begin_line": 2717,
      "end_line": 2717,
      "comment": " The last mark position. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.StrBuilderReader()",
      "begin_line": 2722,
      "end_line": 2724,
      "comment": "\n         * Default constructor.\n         ",
      "child_ranges": [
        "(line 2723,col 13)-(line 2723,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.close()",
      "begin_line": 2727,
      "end_line": 2730,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.read()",
      "begin_line": 2733,
      "end_line": 2739,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2735,col 13)-(line 2737,col 13)",
        "(line 2738,col 13)-(line 2738,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.read(char[], int, int)",
      "begin_line": 2742,
      "end_line": 2760,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2744,col 13)-(line 2747,col 13)",
        "(line 2748,col 13)-(line 2750,col 13)",
        "(line 2751,col 13)-(line 2753,col 13)",
        "(line 2754,col 13)-(line 2756,col 13)",
        "(line 2757,col 13)-(line 2757,col 61)",
        "(line 2758,col 13)-(line 2758,col 23)",
        "(line 2759,col 13)-(line 2759,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.skip(long)",
      "begin_line": 2763,
      "end_line": 2773,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2765,col 13)-(line 2767,col 13)",
        "(line 2768,col 13)-(line 2770,col 13)",
        "(line 2771,col 13)-(line 2771,col 21)",
        "(line 2772,col 13)-(line 2772,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.ready()",
      "begin_line": 2776,
      "end_line": 2779,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2778,col 13)-(line 2778,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.markSupported()",
      "begin_line": 2782,
      "end_line": 2785,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2784,col 13)-(line 2784,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.mark(int)",
      "begin_line": 2788,
      "end_line": 2791,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2790,col 13)-(line 2790,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.reset()",
      "begin_line": 2794,
      "end_line": 2797,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2796,col 13)-(line 2796,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StrBuilderWriter",
      "is_interface": false,
      "parent_types": [
        "java.io.Writer"
      ],
      "begin_line": 2804,
      "end_line": 2854,
      "comment": "\n     * Inner class to allow StrBuilder to operate as a writer.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter.StrBuilderWriter()",
      "begin_line": 2809,
      "end_line": 2811,
      "comment": "\n         * Default constructor.\n         ",
      "child_ranges": [
        "(line 2810,col 13)-(line 2810,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter.close()",
      "begin_line": 2814,
      "end_line": 2817,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter.flush()",
      "begin_line": 2820,
      "end_line": 2823,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter.write(int)",
      "begin_line": 2826,
      "end_line": 2829,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2828,col 13)-(line 2828,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter.write(char[])",
      "begin_line": 2832,
      "end_line": 2835,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2834,col 13)-(line 2834,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter.write(char[], int, int)",
      "begin_line": 2838,
      "end_line": 2841,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2840,col 13)-(line 2840,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter.write(java.lang.String)",
      "begin_line": 2844,
      "end_line": 2847,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2846,col 13)-(line 2846,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter.write(java.lang.String, int, int)",
      "begin_line": 2850,
      "end_line": 2853,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2852,col 13)-(line 2852,col 50)"
      ]
    }
  ]
}