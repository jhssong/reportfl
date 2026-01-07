{
  "filepath": "/tmp/Lang-65b/src/java/org/apache/commons/lang/text/StrBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StrBuilder",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable"
      ],
      "begin_line": 68,
      "end_line": 2308,
      "comment": "\n * Builds a string from constituent parts providing a more flexible and powerful API\n * than StringBuffer.\n * \u003cp\u003e\n * The main differences from StringBuffer/StringBuilder are:\n * \u003cul\u003e\n * \u003cli\u003eNot synchronized\u003c/li\u003e\n * \u003cli\u003eNot final\u003c/li\u003e\n * \u003cli\u003eSubclasses have direct access to character array\u003c/li\u003e\n * \u003cli\u003eAdditional methods\n *  \u003cul\u003e\n *   \u003cli\u003eappendWithSeparators - adds an array of values, with a separator\u003c/li\u003e\n *   \u003cli\u003eappendPadding - adds a length padding characters\u003c/li\u003e\n *   \u003cli\u003eappendFixedLength - adds a fixed width field to the builder\u003c/li\u003e\n *   \u003cli\u003etoCharArray/getChars - simpler ways to get a range of the character array\u003c/li\u003e\n *   \u003cli\u003edelete - delete char or string\u003c/li\u003e\n *   \u003cli\u003ereplace - search and replace for a char or string\u003c/li\u003e\n *   \u003cli\u003eleftString/rightString/midString - substring without exceptions\u003c/li\u003e\n *   \u003cli\u003econtains - whether the builder contains a char or string\u003c/li\u003e\n *   \u003cli\u003esize/clear/isEmpty - collections style API methods\u003c/li\u003e\n *  \u003c/ul\u003e\n * \u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cli\u003eViews\n *  \u003cul\u003e\n *   \u003cli\u003easTokenizer - uses the internal buffer as the source of a StrTokenizer\u003c/li\u003e\n *   \u003cli\u003easReader - uses the internal buffer as the source of a Reader\u003c/li\u003e\n *   \u003cli\u003easWriter - allows a Writer to write directly to the internal buffer\u003c/li\u003e\n *  \u003c/ul\u003e\n * \u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * The aim has been to provide an API that mimics very closely what StringBuffer\n * provides, but with additional methods. It should be noted that some edge cases,\n * with invalid indices or null input, have been altered - see individual methods.\n * The biggest of these changes is that by default, null will not output the text\n * \u0027null\u0027. This can be controlled by a property, {@link #setNullText(String)}.\n *\n * @author Stephen Colebourne\n * @since 2.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "CAPACITY"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * The extra capacity for new builders.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Serialization lock. "
    },
    {
      "type": "field",
      "varNames": [
        "buffer"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Internal data storage. "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Current size of the buffer. "
    },
    {
      "type": "field",
      "varNames": [
        "newLine"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " The new line. "
    },
    {
      "type": "field",
      "varNames": [
        "nullText"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " The null text. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilder()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Constructor that creates an empty builder initial capacity 32 characters.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilder(int)",
      "begin_line": 100,
      "end_line": 106,
      "comment": "\n     * Constructor that creates an empty builder the specified initial capacity.\n     *\n     * @param initialCapacity  the initial capacity, zero or less will be converted to 32\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 16)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilder(java.lang.String)",
      "begin_line": 114,
      "end_line": 122,
      "comment": "\n     * Constructor that creates a builder from the string, allocating\n     * 32 extra characters for growth.\n     *\n     * @param str  the string to copy, null treated as blank string\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 16)",
        "(line 116,col 9)-(line 121,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.getNewLineText()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n     * Gets the text to be appended when a new line is added.\n     *\n     * @return the new line text, null means use system default\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.setNewLineText(java.lang.String)",
      "begin_line": 140,
      "end_line": 143,
      "comment": "\n     * Sets the text to be appended when a new line is added.\n     *\n     * @param newLine  the new line text, null means use system default\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 31)",
        "(line 142,col 9)-(line 142,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.getNullText()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * Gets the text to be appended when null is added.\n     *\n     * @return the null text, null means no append\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.setNullText(java.lang.String)",
      "begin_line": 161,
      "end_line": 167,
      "comment": "\n     * Sets the text to be appended when null is added.\n     *\n     * @param nullText  the null text, null means no append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 33)",
        "(line 166,col 9)-(line 166,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.length()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\n     * Gets the length of the string builder.\n     *\n     * @return the length\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.setLength(int)",
      "begin_line": 187,
      "end_line": 203,
      "comment": "\n     * Updates the length of the builder by either dropping the last characters\n     * or adding filler of unicode zero.\n     *\n     * @param length  the length to set to, must be zero or positive\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the length is negative\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.capacity()",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\n     * Gets the current size of the internal character array buffer.\n     *\n     * @return the capacity\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.ensureCapacity(int)",
      "begin_line": 221,
      "end_line": 228,
      "comment": "\n     * Checks the capacity and ensures that it is at least the size specified.\n     *\n     * @param capacity  the capacity to ensure\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 227,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.minimizeCapacity()",
      "begin_line": 235,
      "end_line": 242,
      "comment": "\n     * Minimizes the capacity to the actual length of the string.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.size()",
      "begin_line": 253,
      "end_line": 255,
      "comment": "\n     * Gets the length of the string builder.\n     * \u003cp\u003e\n     * This method is the same as {@link #length()} and is provided to match the\n     * API of Collections.\n     *\n     * @return the length\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.isEmpty()",
      "begin_line": 265,
      "end_line": 267,
      "comment": "\n     * Checks is the string builder is empty (convenience Collections API style method).\n     * \u003cp\u003e\n     * This method is the same as checking {@link #length()} and is provided to match the\n     * API of Collections.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the size is \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.clear()",
      "begin_line": 280,
      "end_line": 283,
      "comment": "\n     * Clears the string builder (convenience Collections API style method).\n     * \u003cp\u003e\n     * This method does not reduce the size of the internal character buffer.\n     * To do that, call \u003ccode\u003eclear()\u003c/code\u003e followed by {@link #minimizeCapacity()}.\n     * \u003cp\u003e\n     * This method is the same as {@link #setLength(int)} called with zero\n     * and is provided to match the API of Collections.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 17)",
        "(line 282,col 9)-(line 282,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.charAt(int)",
      "begin_line": 295,
      "end_line": 300,
      "comment": "\n     * Gets the character at the specified index.\n     *\n     * @see #setCharAt(int, char)\n     * @see #deleteCharAt(int)\n     * @param index  the index to retrieve, must be valid\n     * @return the character at the index\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 299,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.setCharAt(int, char)",
      "begin_line": 312,
      "end_line": 318,
      "comment": "\n     * Sets the character at the specified index.\n     *\n     * @see #charAt(int)\n     * @see #deleteCharAt(int)\n     * @param index  the index to set\n     * @param ch  the new character\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 27)",
        "(line 317,col 9)-(line 317,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteCharAt(int)",
      "begin_line": 329,
      "end_line": 335,
      "comment": "\n     * Deletes the character at the specified index.\n     *\n     * @see #charAt(int)\n     * @see #setCharAt(int, char)\n     * @param index  the index to delete\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 332,col 9)",
        "(line 333,col 9)-(line 333,col 40)",
        "(line 334,col 9)-(line 334,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.toCharArray()",
      "begin_line": 343,
      "end_line": 350,
      "comment": "\n     * Copies the builder\u0027s character array into a new character array.\n     * \n     * @return a new array that represents the contents of the builder\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 347,col 38)",
        "(line 348,col 9)-(line 348,col 52)",
        "(line 349,col 9)-(line 349,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.toCharArray(int, int)",
      "begin_line": 362,
      "end_line": 371,
      "comment": "\n     * Copies part of the builder\u0027s character array into a new character array.\n     * \n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except that\n     *  if too large it is treated as end of string\n     * @return a new array that holds part of the contents of the builder\n     * @throws IndexOutOfBoundsException if startIndex is invalid,\n     *  or if endIndex is invalid (but endIndex greater than size is valid)\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 55)",
        "(line 364,col 9)-(line 364,col 40)",
        "(line 365,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 368,col 37)",
        "(line 369,col 9)-(line 369,col 60)",
        "(line 370,col 9)-(line 370,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.getChars(char[])",
      "begin_line": 379,
      "end_line": 386,
      "comment": "\n     * Copies the character array into the specified array.\n     * \n     * @param destination  the destination array, null will cause an array to be created\n     * @return the input array, unless that was null or too small\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 27)",
        "(line 381,col 9)-(line 383,col 9)",
        "(line 384,col 9)-(line 384,col 57)",
        "(line 385,col 9)-(line 385,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.getChars(int, int, char[], int)",
      "begin_line": 398,
      "end_line": 409,
      "comment": "\n     * Copies the character array into the specified array.\n     *\n     * @param startIndex  first index to copy, inclusive, must be valid\n     * @param endIndex  last index, exclusive, must be valid\n     * @param destination  the destination array, must not be null or too small\n     * @param destinationIndex  the index to start copying in destination\n     * @throws NullPointerException if the array is null\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 401,col 9)",
        "(line 402,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 408,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendNewLine()",
      "begin_line": 421,
      "end_line": 427,
      "comment": "\n     * Appends the new line string to this string builder.\n     * \u003cp\u003e\n     * The new line string can be altered using {@link #setNewLineText(String)}.\n     * This might be used to force the output to always use Unix line endings\n     * even when on Windows.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 426,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendNull()",
      "begin_line": 434,
      "end_line": 439,
      "comment": "\n     * Appends the text representing \u003ccode\u003enull\u003c/code\u003e to this string builder.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 438,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(java.lang.Object)",
      "begin_line": 448,
      "end_line": 453,
      "comment": "\n     * Appends an object to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param obj  the object to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 452,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(java.lang.String)",
      "begin_line": 462,
      "end_line": 474,
      "comment": "\n     * Appends a string to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 466,col 34)",
        "(line 467,col 9)-(line 472,col 9)",
        "(line 473,col 9)-(line 473,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(java.lang.String, int, int)",
      "begin_line": 485,
      "end_line": 502,
      "comment": "\n     * Appends part of a string to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 491,col 9)",
        "(line 492,col 9)-(line 494,col 9)",
        "(line 495,col 9)-(line 500,col 9)",
        "(line 501,col 9)-(line 501,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(java.lang.StringBuffer)",
      "begin_line": 511,
      "end_line": 523,
      "comment": "\n     * Appends a string buffer to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string buffer to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 514,col 9)",
        "(line 515,col 9)-(line 515,col 34)",
        "(line 516,col 9)-(line 521,col 9)",
        "(line 522,col 9)-(line 522,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(java.lang.StringBuffer, int, int)",
      "begin_line": 534,
      "end_line": 551,
      "comment": "\n     * Appends part of a string buffer to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 537,col 9)",
        "(line 538,col 9)-(line 540,col 9)",
        "(line 541,col 9)-(line 543,col 9)",
        "(line 544,col 9)-(line 549,col 9)",
        "(line 550,col 9)-(line 550,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(org.apache.commons.lang.text.StrBuilder)",
      "begin_line": 560,
      "end_line": 572,
      "comment": "\n     * Appends another string builder to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string builder to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 561,col 9)-(line 563,col 9)",
        "(line 564,col 9)-(line 564,col 34)",
        "(line 565,col 9)-(line 570,col 9)",
        "(line 571,col 9)-(line 571,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(org.apache.commons.lang.text.StrBuilder, int, int)",
      "begin_line": 583,
      "end_line": 600,
      "comment": "\n     * Appends part of a string builder to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 584,col 9)-(line 586,col 9)",
        "(line 587,col 9)-(line 589,col 9)",
        "(line 590,col 9)-(line 592,col 9)",
        "(line 593,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 599,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(char[])",
      "begin_line": 609,
      "end_line": 621,
      "comment": "\n     * Appends a char array to the string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param chars  the char array to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 612,col 9)",
        "(line 613,col 9)-(line 613,col 34)",
        "(line 614,col 9)-(line 619,col 9)",
        "(line 620,col 9)-(line 620,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(char[], int, int)",
      "begin_line": 632,
      "end_line": 649,
      "comment": "\n     * Appends a char array to the string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param chars  the char array to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 633,col 9)-(line 635,col 9)",
        "(line 636,col 9)-(line 638,col 9)",
        "(line 639,col 9)-(line 641,col 9)",
        "(line 642,col 9)-(line 647,col 9)",
        "(line 648,col 9)-(line 648,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(boolean)",
      "begin_line": 657,
      "end_line": 673,
      "comment": "\n     * Appends a boolean value to the string builder.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 658,col 9)-(line 671,col 9)",
        "(line 672,col 9)-(line 672,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(char)",
      "begin_line": 681,
      "end_line": 686,
      "comment": "\n     * Appends a char value to the string builder.\n     *\n     * @param ch  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 682,col 9)-(line 682,col 27)",
        "(line 683,col 9)-(line 683,col 32)",
        "(line 684,col 9)-(line 684,col 28)",
        "(line 685,col 9)-(line 685,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(int)",
      "begin_line": 694,
      "end_line": 696,
      "comment": "\n     * Appends an int value to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 695,col 9)-(line 695,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(long)",
      "begin_line": 704,
      "end_line": 706,
      "comment": "\n     * Appends a long value to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 705,col 9)-(line 705,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(float)",
      "begin_line": 714,
      "end_line": 716,
      "comment": "\n     * Appends a float value to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 715,col 9)-(line 715,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(double)",
      "begin_line": 724,
      "end_line": 726,
      "comment": "\n     * Appends a double value to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 725,col 9)-(line 725,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendWithSeparators(java.lang.Object[], java.lang.String)",
      "begin_line": 739,
      "end_line": 749,
      "comment": "\n     * Appends an array placing separators between each value, but\n     * not before the first or after the last.\n     * Appending a null array will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param array  the array to append\n     * @param separator  the separator to use, null means no separator\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 740,col 9)-(line 747,col 9)",
        "(line 748,col 9)-(line 748,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendWithSeparators(java.util.Collection, java.lang.String)",
      "begin_line": 761,
      "end_line": 773,
      "comment": "\n     * Appends a collection placing separators between each value, but\n     * not before the first or after the last.\n     * Appending a null collection will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param coll  the collection to append\n     * @param separator  the separator to use, null means no separator\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 762,col 9)-(line 771,col 9)",
        "(line 772,col 9)-(line 772,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendWithSeparators(java.util.Iterator, java.lang.String)",
      "begin_line": 785,
      "end_line": 796,
      "comment": "\n     * Appends an iterator placing separators between each value, but\n     * not before the first or after the last.\n     * Appending a null iterator will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param it  the iterator to append\n     * @param separator  the separator to use, null means no separator\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 786,col 9)-(line 794,col 9)",
        "(line 795,col 9)-(line 795,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendPadding(int, char)",
      "begin_line": 806,
      "end_line": 814,
      "comment": "\n     * Appends the pad character to the builder the specified number of times.\n     * \n     * @param length  the length to append, negative means no append\n     * @param padChar  the character to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 807,col 9)-(line 812,col 9)",
        "(line 813,col 9)-(line 813,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadLeft(java.lang.Object, int, char)",
      "begin_line": 828,
      "end_line": 845,
      "comment": "\n     * Appends an object to the builder padding on the left to a fixed width.\n     * The \u003ccode\u003etoString\u003c/code\u003e of the object is used.\n     * If the object is larger than the length, the left hand side is lost.\n     * If the object is null, the null text value is used.\n     * \n     * @param obj  the object to append, null uses null text\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 829,col 9)-(line 843,col 9)",
        "(line 844,col 9)-(line 844,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadLeft(int, int, char)",
      "begin_line": 857,
      "end_line": 859,
      "comment": "\n     * Appends an object to the builder padding on the left to a fixed width.\n     * The \u003ccode\u003eString.valueOf\u003c/code\u003e of the \u003ccode\u003eint\u003c/code\u003e value is used.\n     * If the formatted value is larger than the length, the left hand side is lost.\n     * \n     * @param value  the value to append\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 858,col 9)-(line 858,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadRight(java.lang.Object, int, char)",
      "begin_line": 872,
      "end_line": 889,
      "comment": "\n     * Appends an object to the builder padding on the right to a fixed length.\n     * The \u003ccode\u003etoString\u003c/code\u003e of the object is used.\n     * If the object is larger than the length, the right hand side is lost.\n     * If the object is null, null text value is used.\n     * \n     * @param obj  the object to append, null uses null text\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 873,col 9)-(line 887,col 9)",
        "(line 888,col 9)-(line 888,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadRight(int, int, char)",
      "begin_line": 901,
      "end_line": 903,
      "comment": "\n     * Appends an object to the builder padding on the right to a fixed length.\n     * The \u003ccode\u003eString.valueOf\u003c/code\u003e of the \u003ccode\u003eint\u003c/code\u003e value is used.\n     * If the object is larger than the length, the right hand side is lost.\n     * \n     * @param value  the value to append\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 902,col 9)-(line 902,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, java.lang.Object)",
      "begin_line": 915,
      "end_line": 920,
      "comment": "\n     * Inserts the string representation of an object into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param obj  the object to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 916,col 9)-(line 918,col 9)",
        "(line 919,col 9)-(line 919,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, java.lang.String)",
      "begin_line": 931,
      "end_line": 945,
      "comment": "\n     * Inserts the string into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param str  the string to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 932,col 9)-(line 932,col 29)",
        "(line 933,col 9)-(line 935,col 9)",
        "(line 936,col 9)-(line 936,col 54)",
        "(line 937,col 9)-(line 943,col 9)",
        "(line 944,col 9)-(line 944,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, char[])",
      "begin_line": 956,
      "end_line": 969,
      "comment": "\n     * Inserts the character array into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param chars  the char array to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 957,col 9)-(line 957,col 29)",
        "(line 958,col 9)-(line 960,col 9)",
        "(line 961,col 9)-(line 961,col 31)",
        "(line 962,col 9)-(line 967,col 9)",
        "(line 968,col 9)-(line 968,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, char[], int, int)",
      "begin_line": 982,
      "end_line": 1000,
      "comment": "\n     * Inserts part of the character array into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param chars  the char array to insert\n     * @param offset  the offset into the character array to start at, must be valid\n     * @param length  the length of the character array part to copy, must be positive\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 983,col 9)-(line 983,col 29)",
        "(line 984,col 9)-(line 986,col 9)",
        "(line 987,col 9)-(line 989,col 9)",
        "(line 990,col 9)-(line 992,col 9)",
        "(line 993,col 9)-(line 998,col 9)",
        "(line 999,col 9)-(line 999,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, boolean)",
      "begin_line": 1010,
      "end_line": 1031,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1011,col 9)-(line 1011,col 29)",
        "(line 1012,col 9)-(line 1029,col 9)",
        "(line 1030,col 9)-(line 1030,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, char)",
      "begin_line": 1041,
      "end_line": 1048,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1042,col 9)-(line 1042,col 29)",
        "(line 1043,col 9)-(line 1043,col 33)",
        "(line 1044,col 9)-(line 1044,col 73)",
        "(line 1045,col 9)-(line 1045,col 30)",
        "(line 1046,col 9)-(line 1046,col 15)",
        "(line 1047,col 9)-(line 1047,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, int)",
      "begin_line": 1058,
      "end_line": 1060,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1059,col 9)-(line 1059,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, long)",
      "begin_line": 1070,
      "end_line": 1072,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1071,col 9)-(line 1071,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, float)",
      "begin_line": 1082,
      "end_line": 1084,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1083,col 9)-(line 1083,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, double)",
      "begin_line": 1094,
      "end_line": 1096,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1095,col 9)-(line 1095,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteImpl(int, int, int)",
      "begin_line": 1107,
      "end_line": 1110,
      "comment": "\n     * Internal method to delete a range without validation.\n     *\n     * @param startIndex  the start index, must be valid\n     * @param endIndex  the end index (exclusive), must be valid\n     * @param len  the length, must be valid\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 1108,col 9)-(line 1108,col 80)",
        "(line 1109,col 9)-(line 1109,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.delete(int, int)",
      "begin_line": 1121,
      "end_line": 1128,
      "comment": "\n     * Deletes the characters between the two specified indices.\n     *\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1122,col 9)-(line 1122,col 55)",
        "(line 1123,col 9)-(line 1123,col 40)",
        "(line 1124,col 9)-(line 1126,col 9)",
        "(line 1127,col 9)-(line 1127,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteAll(char)",
      "begin_line": 1137,
      "end_line": 1152,
      "comment": "\n     * Deletes the character wherever it occurs in the builder.\n     *\n     * @param ch  the character to delete\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1138,col 9)-(line 1150,col 9)",
        "(line 1151,col 9)-(line 1151,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteFirst(char)",
      "begin_line": 1160,
      "end_line": 1168,
      "comment": "\n     * Deletes the character wherever it occurs in the builder.\n     *\n     * @param ch  the character to delete\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1161,col 9)-(line 1166,col 9)",
        "(line 1167,col 9)-(line 1167,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteAll(java.lang.String)",
      "begin_line": 1177,
      "end_line": 1187,
      "comment": "\n     * Deletes the string wherever it occurs in the builder.\n     *\n     * @param str  the string to delete, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1178,col 9)-(line 1178,col 51)",
        "(line 1179,col 9)-(line 1185,col 9)",
        "(line 1186,col 9)-(line 1186,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteFirst(java.lang.String)",
      "begin_line": 1195,
      "end_line": 1204,
      "comment": "\n     * Deletes the string wherever it occurs in the builder.\n     *\n     * @param str  the string to delete, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1196,col 9)-(line 1196,col 51)",
        "(line 1197,col 9)-(line 1202,col 9)",
        "(line 1203,col 9)-(line 1203,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteAll(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 1217,
      "end_line": 1219,
      "comment": "\n     * Deletes all parts of the builder that the matcher matches.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced deletion behaviour.\n     * For example you could write a matcher to delete all occurances\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1218,col 9)-(line 1218,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteFirst(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 1231,
      "end_line": 1233,
      "comment": "\n     * Deletes the first match within the builder using the specified matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced deletion behaviour.\n     * For example you could write a matcher to delete\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1232,col 9)-(line 1232,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceImpl(int, int, int, java.lang.String, int)",
      "begin_line": 1246,
      "end_line": 1256,
      "comment": "\n     * Internal method to delete a range without validation.\n     *\n     * @param startIndex  the start index, must be valid\n     * @param endIndex  the end index (exclusive), must be valid\n     * @param removeLen  the length to remove (endIndex - startIndex), must be valid\n     * @param insertStr  the string to replace with, null means delete range\n     * @param insertLen  the length of the insert string, must be valid\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 1247,col 9)-(line 1247,col 51)",
        "(line 1248,col 9)-(line 1252,col 9)",
        "(line 1253,col 9)-(line 1255,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replace(int, int, java.lang.String)",
      "begin_line": 1269,
      "end_line": 1274,
      "comment": "\n     * Replaces a portion of the string builder with another string.\n     * The length of the inserted string does not have to match the removed length.\n     *\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @param replaceStr  the string to replace with, null means delete range\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1270,col 9)-(line 1270,col 55)",
        "(line 1271,col 9)-(line 1271,col 71)",
        "(line 1272,col 9)-(line 1272,col 88)",
        "(line 1273,col 9)-(line 1273,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceAll(char, char)",
      "begin_line": 1285,
      "end_line": 1294,
      "comment": "\n     * Replaces the search character with the replace character\n     * throughout the builder.\n     *\n     * @param search  the search character\n     * @param replace  the replace character\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1286,col 9)-(line 1292,col 9)",
        "(line 1293,col 9)-(line 1293,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceFirst(char, char)",
      "begin_line": 1304,
      "end_line": 1314,
      "comment": "\n     * Replaces the first instance of the search character with the\n     * replace character in the builder.\n     *\n     * @param search  the search character\n     * @param replace  the replace character\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1305,col 9)-(line 1312,col 9)",
        "(line 1313,col 9)-(line 1313,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceAll(java.lang.String, java.lang.String)",
      "begin_line": 1324,
      "end_line": 1335,
      "comment": "\n     * Replaces the search string with the replace string throughout the builder.\n     *\n     * @param searchStr  the search string, null causes no action to occur\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1325,col 9)-(line 1325,col 69)",
        "(line 1326,col 9)-(line 1333,col 9)",
        "(line 1334,col 9)-(line 1334,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceFirst(java.lang.String, java.lang.String)",
      "begin_line": 1344,
      "end_line": 1354,
      "comment": "\n     * Replaces the first instance of the search string with the replace string.\n     *\n     * @param searchStr  the search string, null causes no action to occur\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1345,col 9)-(line 1345,col 69)",
        "(line 1346,col 9)-(line 1352,col 9)",
        "(line 1353,col 9)-(line 1353,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceAll(org.apache.commons.lang.text.StrMatcher, java.lang.String)",
      "begin_line": 1368,
      "end_line": 1370,
      "comment": "\n     * Replaces all matches within the builder with the replace string.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced replace behaviour.\n     * For example you could write a matcher to replace all occurances\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1369,col 9)-(line 1369,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceFirst(org.apache.commons.lang.text.StrMatcher, java.lang.String)",
      "begin_line": 1383,
      "end_line": 1385,
      "comment": "\n     * Replaces the first match within the builder with the replace string.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced replace behaviour.\n     * For example you could write a matcher to replace\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1384,col 9)-(line 1384,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replace(org.apache.commons.lang.text.StrMatcher, java.lang.String, int, int, int)",
      "begin_line": 1404,
      "end_line": 1409,
      "comment": "\n     * Advanced search and replaces within the builder using a matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced behaviour.\n     * For example you could write a matcher to delete all occurances\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the string to replace the match with, null is a delete\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @param replaceCount  the number of times to replace, -1 for replace all\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if start index is invalid\n     ",
      "child_ranges": [
        "(line 1407,col 9)-(line 1407,col 55)",
        "(line 1408,col 9)-(line 1408,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceImpl(org.apache.commons.lang.text.StrMatcher, java.lang.String, int, int, int)",
      "begin_line": 1426,
      "end_line": 1446,
      "comment": "\n     * Replaces within the builder using a matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced behaviour.\n     * For example you could write a matcher to delete all occurances\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the string to replace the match with, null is a delete\n     * @param from  the start index, must be valid\n     * @param to  the end index (exclusive), must be valid\n     * @param replaceCount  the number of times to replace, -1 for replace all\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 1429,col 9)-(line 1431,col 9)",
        "(line 1432,col 9)-(line 1432,col 72)",
        "(line 1433,col 9)-(line 1433,col 28)",
        "(line 1434,col 9)-(line 1444,col 9)",
        "(line 1445,col 9)-(line 1445,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.reverse()",
      "begin_line": 1454,
      "end_line": 1467,
      "comment": "\n     * Reverses the string builder placing each character in the opposite index.\n     * \n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1455,col 9)-(line 1457,col 9)",
        "(line 1459,col 9)-(line 1459,col 28)",
        "(line 1460,col 9)-(line 1460,col 28)",
        "(line 1461,col 9)-(line 1465,col 9)",
        "(line 1466,col 9)-(line 1466,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.trim()",
      "begin_line": 1476,
      "end_line": 1496,
      "comment": "\n     * Trims the builder by removing characters less than or equal to a space\n     * from the beginning and end.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1477,col 9)-(line 1479,col 9)",
        "(line 1480,col 9)-(line 1480,col 23)",
        "(line 1481,col 9)-(line 1481,col 28)",
        "(line 1482,col 9)-(line 1482,col 20)",
        "(line 1483,col 9)-(line 1485,col 9)",
        "(line 1486,col 9)-(line 1488,col 9)",
        "(line 1489,col 9)-(line 1491,col 9)",
        "(line 1492,col 9)-(line 1494,col 9)",
        "(line 1495,col 9)-(line 1495,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.startsWith(java.lang.String)",
      "begin_line": 1507,
      "end_line": 1524,
      "comment": "\n     * Checks whether this builder starts with the specified string.\n     * \u003cp\u003e\n     * Note that this method handles null input quietly, unlike String.\n     * \n     * @param str  the string to search for, null returns false\n     * @return true if the builder starts with the string\n     ",
      "child_ranges": [
        "(line 1508,col 9)-(line 1510,col 9)",
        "(line 1511,col 9)-(line 1511,col 31)",
        "(line 1512,col 9)-(line 1514,col 9)",
        "(line 1515,col 9)-(line 1517,col 9)",
        "(line 1518,col 9)-(line 1522,col 9)",
        "(line 1523,col 9)-(line 1523,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.endsWith(java.lang.String)",
      "begin_line": 1534,
      "end_line": 1552,
      "comment": "\n     * Checks whether this builder ends with the specified string.\n     * \u003cp\u003e\n     * Note that this method handles null input quietly, unlike String.\n     * \n     * @param str  the string to search for, null returns false\n     * @return true if the builder ends with the string\n     ",
      "child_ranges": [
        "(line 1535,col 9)-(line 1537,col 9)",
        "(line 1538,col 9)-(line 1538,col 31)",
        "(line 1539,col 9)-(line 1541,col 9)",
        "(line 1542,col 9)-(line 1544,col 9)",
        "(line 1545,col 9)-(line 1545,col 29)",
        "(line 1546,col 9)-(line 1550,col 9)",
        "(line 1551,col 9)-(line 1551,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.substring(int)",
      "begin_line": 1562,
      "end_line": 1564,
      "comment": "\n     * Extracts a portion of this string builder as a string.\n     * \n     * @param start  the start index, inclusive, must be valid\n     * @return the new string\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1563,col 9)-(line 1563,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.substring(int, int)",
      "begin_line": 1579,
      "end_line": 1582,
      "comment": "\n     * Extracts a portion of this string builder as a string.\n     * \u003cp\u003e\n     * Note: This method treats an endIndex greater than the length of the\n     * builder as equal to the length of the builder, and continues\n     * without error, unlike StringBuffer or String.\n     * \n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @return the new string\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1580,col 9)-(line 1580,col 55)",
        "(line 1581,col 9)-(line 1581,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.leftString(int)",
      "begin_line": 1596,
      "end_line": 1604,
      "comment": "\n     * Extracts the leftmost characters from the string builder without\n     * throwing an exception.\n     * \u003cp\u003e\n     * This method extracts the left \u003ccode\u003elength\u003c/code\u003e characters from\n     * the builder. If this many characters are not available, the whole\n     * builder is returned. Thus the returned string may be shorter than the\n     * length requested.\n     * \n     * @param length  the number of characters to extract, negative returns empty string\n     * @return the new string\n     ",
      "child_ranges": [
        "(line 1597,col 9)-(line 1603,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.rightString(int)",
      "begin_line": 1618,
      "end_line": 1626,
      "comment": "\n     * Extracts the rightmost characters from the string builder without\n     * throwing an exception.\n     * \u003cp\u003e\n     * This method extracts the right \u003ccode\u003elength\u003c/code\u003e characters from\n     * the builder. If this many characters are not available, the whole\n     * builder is returned. Thus the returned string may be shorter than the\n     * length requested.\n     * \n     * @param length  the number of characters to extract, negative returns empty string\n     * @return the new string\n     ",
      "child_ranges": [
        "(line 1619,col 9)-(line 1625,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.midString(int, int)",
      "begin_line": 1644,
      "end_line": 1656,
      "comment": "\n     * Extracts some characters from the middle of the string builder without\n     * throwing an exception.\n     * \u003cp\u003e\n     * This method extracts \u003ccode\u003elength\u003c/code\u003e characters from the builder\n     * at the specified index.\n     * If the index is negative it is treated as zero.\n     * If the index is greater than the builder size, it is treated as the builder size.\n     * If the length is negative, the empty string is returned.\n     * If insufficient characters are available in the builder, as much as possible is returned.\n     * Thus the returned string may be shorter than the length requested.\n     * \n     * @param index  the index to start at, negative means zero\n     * @param length  the number of characters to extract, negative returns empty string\n     * @return the new string\n     ",
      "child_ranges": [
        "(line 1645,col 9)-(line 1647,col 9)",
        "(line 1648,col 9)-(line 1650,col 9)",
        "(line 1651,col 9)-(line 1655,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.contains(char)",
      "begin_line": 1665,
      "end_line": 1673,
      "comment": "\n     * Checks if the string builder contains the specified char.\n     *\n     * @param ch  the character to find\n     * @return true if the builder contains the character\n     ",
      "child_ranges": [
        "(line 1666,col 9)-(line 1666,col 32)",
        "(line 1667,col 9)-(line 1671,col 9)",
        "(line 1672,col 9)-(line 1672,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.contains(java.lang.String)",
      "begin_line": 1681,
      "end_line": 1683,
      "comment": "\n     * Checks if the string builder contains the specified string.\n     *\n     * @param str  the string to find\n     * @return true if the builder contains the string\n     ",
      "child_ranges": [
        "(line 1682,col 9)-(line 1682,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.contains(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 1696,
      "end_line": 1698,
      "comment": "\n     * Checks if the string builder contains a string matched using the\n     * specified matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to search for the character\n     * \u0027a\u0027 followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @return true if the matcher finds a match in the builder\n     ",
      "child_ranges": [
        "(line 1697,col 9)-(line 1697,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.indexOf(char)",
      "begin_line": 1707,
      "end_line": 1709,
      "comment": "\n     * Searches the string builder to find the first reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @return the first index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1708,col 9)-(line 1708,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.indexOf(char, int)",
      "begin_line": 1718,
      "end_line": 1730,
      "comment": "\n     * Searches the string builder to find the first reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the first index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1719,col 9)-(line 1719,col 55)",
        "(line 1720,col 9)-(line 1722,col 9)",
        "(line 1723,col 9)-(line 1723,col 32)",
        "(line 1724,col 9)-(line 1728,col 9)",
        "(line 1729,col 9)-(line 1729,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.indexOf(java.lang.String)",
      "begin_line": 1740,
      "end_line": 1742,
      "comment": "\n     * Searches the string builder to find the first reference to the specified string.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @return the first index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1741,col 9)-(line 1741,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.indexOf(java.lang.String, int)",
      "begin_line": 1754,
      "end_line": 1780,
      "comment": "\n     * Searches the string builder to find the first reference to the specified\n     * string starting searching from the given index.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the first index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1755,col 9)-(line 1755,col 55)",
        "(line 1756,col 9)-(line 1758,col 9)",
        "(line 1759,col 9)-(line 1759,col 34)",
        "(line 1760,col 9)-(line 1762,col 9)",
        "(line 1763,col 9)-(line 1765,col 9)",
        "(line 1766,col 9)-(line 1768,col 9)",
        "(line 1769,col 9)-(line 1769,col 32)",
        "(line 1770,col 9)-(line 1778,col 9)",
        "(line 1779,col 9)-(line 1779,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.indexOf(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 1792,
      "end_line": 1794,
      "comment": "\n     * Searches the string builder using the matcher to find the first match.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @return the first index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1793,col 9)-(line 1793,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.indexOf(org.apache.commons.lang.text.StrMatcher, int)",
      "begin_line": 1808,
      "end_line": 1821,
      "comment": "\n     * Searches the string builder using the matcher to find the first\n     * match searching from the given index.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the first index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1809,col 9)-(line 1809,col 55)",
        "(line 1810,col 9)-(line 1812,col 9)",
        "(line 1813,col 9)-(line 1813,col 23)",
        "(line 1814,col 9)-(line 1814,col 28)",
        "(line 1815,col 9)-(line 1819,col 9)",
        "(line 1820,col 9)-(line 1820,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.lastIndexOf(char)",
      "begin_line": 1830,
      "end_line": 1832,
      "comment": "\n     * Searches the string builder to find the last reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @return the last index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1831,col 9)-(line 1831,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.lastIndexOf(char, int)",
      "begin_line": 1841,
      "end_line": 1852,
      "comment": "\n     * Searches the string builder to find the last reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the last index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1842,col 9)-(line 1842,col 66)",
        "(line 1843,col 9)-(line 1845,col 9)",
        "(line 1846,col 9)-(line 1850,col 9)",
        "(line 1851,col 9)-(line 1851,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.lastIndexOf(java.lang.String)",
      "begin_line": 1862,
      "end_line": 1864,
      "comment": "\n     * Searches the string builder to find the last reference to the specified string.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @return the last index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1863,col 9)-(line 1863,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.lastIndexOf(java.lang.String, int)",
      "begin_line": 1876,
      "end_line": 1901,
      "comment": "\n     * Searches the string builder to find the last reference to the specified\n     * string starting searching from the given index.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the last index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1877,col 9)-(line 1877,col 66)",
        "(line 1878,col 9)-(line 1880,col 9)",
        "(line 1881,col 9)-(line 1881,col 34)",
        "(line 1882,col 9)-(line 1899,col 9)",
        "(line 1900,col 9)-(line 1900,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.lastIndexOf(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 1913,
      "end_line": 1915,
      "comment": "\n     * Searches the string builder using the matcher to find the last match.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @return the last index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1914,col 9)-(line 1914,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.lastIndexOf(org.apache.commons.lang.text.StrMatcher, int)",
      "begin_line": 1929,
      "end_line": 1942,
      "comment": "\n     * Searches the string builder using the matcher to find the last\n     * match searching from the given index.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the last index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1930,col 9)-(line 1930,col 66)",
        "(line 1931,col 9)-(line 1933,col 9)",
        "(line 1934,col 9)-(line 1934,col 28)",
        "(line 1935,col 9)-(line 1935,col 38)",
        "(line 1936,col 9)-(line 1940,col 9)",
        "(line 1941,col 9)-(line 1941,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.asTokenizer()",
      "begin_line": 1959,
      "end_line": 1961,
      "comment": "\n     * Creates a tokenizer using the current contents of this builder.\n     * \u003cp\u003e\n     * This method allows the contents of the builder to be tokenized.\n     * The tokenizer will be setup to tokenize on space, tab, newline\n     * and formfeed (as per StringTokenizer). These values can be changed\n     * on the tokenizer class, before retrieving the tokens.\n     * \u003cp\u003e\n     * Note that the internal character array is shared between the two\n     * objects and no synchronization occurs. Once you call this method\n     * you must complete the tokenization before altering this buffer again.\n     *\n     * @return a StrTokenizer instance\n     ",
      "child_ranges": [
        "(line 1960,col 9)-(line 1960,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.asReader()",
      "begin_line": 1983,
      "end_line": 1985,
      "comment": "\n     * Gets the contents of this builder as a Reader.\n     * \u003cp\u003e\n     * This method allows the contents of the builder to be read\n     * using any standard method that expects a Reader.\n     * \u003cp\u003e\n     * To use, simply create a \u003ccode\u003eStrBuilder\u003c/code\u003e, populate it with\n     * data, call \u003ccode\u003easReader\u003c/code\u003e, and then read away.\n     * \u003cp\u003e\n     * The internal character array is shared between the builder and the reader.\n     * This allows you to append to the builder after creating the reader,\n     * and the changes will be picked up.\n     * Note however, that no synchronization occurs, so you must perform\n     * all operations with the builder and the reader in one thread.\n     * \u003cp\u003e\n     * The returned reader supports marking, and ignores the flush method.\n     *\n     * @return a reader that reads from this builder\n     ",
      "child_ranges": [
        "(line 1984,col 9)-(line 1984,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.asWriter()",
      "begin_line": 2008,
      "end_line": 2010,
      "comment": "\n     * Gets this builder as a Writer that can be written to.\n     * \u003cp\u003e\n     * This method allows you to populate the contents of the builder\n     * using any standard method that takes a Writer.\n     * \u003cp\u003e\n     * To use, simply create a \u003ccode\u003eStrBuilder\u003c/code\u003e,\n     * call \u003ccode\u003easWriter\u003c/code\u003e, and populate away. The data is available\n     * at any time using the methods of the \u003ccode\u003eStrBuilder\u003c/code\u003e.\n     * \u003cp\u003e\n     * The internal character array is shared between the builder and the writer.\n     * This allows you to intermix calls that append to the builder and\n     * write using the writer and the changes will be occur correctly.\n     * Note however, that no synchronization occurs, so you must perform\n     * all operations with the builder and the writer in one thread.\n     * \u003cp\u003e\n     * The returned writer ignores the close and flush methods.\n     *\n     * @return a writer that populates this builder\n     ",
      "child_ranges": [
        "(line 2009,col 9)-(line 2009,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.equalsIgnoreCase(org.apache.commons.lang.text.StrBuilder)",
      "begin_line": 2050,
      "end_line": 2067,
      "comment": "\n     * Checks the contents of this builder against another to see if they\n     * contain the same character content ignoring case.\n     *\n     * @param other  the object to check, null returns false\n     * @return true if the builders contain the same characters in the same order\n     ",
      "child_ranges": [
        "(line 2051,col 9)-(line 2053,col 9)",
        "(line 2054,col 9)-(line 2056,col 9)",
        "(line 2057,col 9)-(line 2057,col 37)",
        "(line 2058,col 9)-(line 2058,col 39)",
        "(line 2059,col 9)-(line 2065,col 9)",
        "(line 2066,col 9)-(line 2066,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.equals(org.apache.commons.lang.text.StrBuilder)",
      "begin_line": 2076,
      "end_line": 2091,
      "comment": "\n     * Checks the contents of this builder against another to see if they\n     * contain the same character content.\n     *\n     * @param other  the object to check, null returns false\n     * @return true if the builders contain the same characters in the same order\n     ",
      "child_ranges": [
        "(line 2077,col 9)-(line 2079,col 9)",
        "(line 2080,col 9)-(line 2082,col 9)",
        "(line 2083,col 9)-(line 2083,col 37)",
        "(line 2084,col 9)-(line 2084,col 39)",
        "(line 2085,col 9)-(line 2089,col 9)",
        "(line 2090,col 9)-(line 2090,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.equals(java.lang.Object)",
      "begin_line": 2100,
      "end_line": 2105,
      "comment": "\n     * Checks the contents of this builder against another to see if they\n     * contain the same character content.\n     *\n     * @param obj  the object to check, null returns false\n     * @return true if the builders contain the same characters in the same order\n     ",
      "child_ranges": [
        "(line 2101,col 9)-(line 2103,col 9)",
        "(line 2104,col 9)-(line 2104,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.hashCode()",
      "begin_line": 2112,
      "end_line": 2119,
      "comment": "\n     * Gets a suitable hash code for this builder.\n     *\n     * @return a hash code\n     ",
      "child_ranges": [
        "(line 2113,col 9)-(line 2113,col 28)",
        "(line 2114,col 9)-(line 2114,col 21)",
        "(line 2115,col 9)-(line 2117,col 9)",
        "(line 2118,col 9)-(line 2118,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.toString()",
      "begin_line": 2131,
      "end_line": 2133,
      "comment": "\n     * Gets a String version of the string builder, creating a new instance\n     * each time the method is called.\n     * \u003cp\u003e\n     * Note that unlike StringBuffer, the string version returned is\n     * independent of the string builder.\n     *\n     * @return the builder as a String\n     ",
      "child_ranges": [
        "(line 2132,col 9)-(line 2132,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.toStringBuffer()",
      "begin_line": 2141,
      "end_line": 2143,
      "comment": "\n     * Gets a StringBuffer version of the string builder, creating a\n     * new instance each time the method is called.\n     *\n     * @return the builder as a StringBuffer\n     ",
      "child_ranges": [
        "(line 2142,col 9)-(line 2142,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.validateRange(int, int)",
      "begin_line": 2155,
      "end_line": 2166,
      "comment": "\n     * Validates parameters defining a range of the builder.\n     * \n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @return the new string\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 2156,col 9)-(line 2158,col 9)",
        "(line 2159,col 9)-(line 2161,col 9)",
        "(line 2162,col 9)-(line 2164,col 9)",
        "(line 2165,col 9)-(line 2165,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.validateIndex(int)",
      "begin_line": 2174,
      "end_line": 2178,
      "comment": "\n     * Validates parameters defining a single index in the builder.\n     * \n     * @param index  the index, must be valid\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 2175,col 9)-(line 2177,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StrBuilderReader",
      "is_interface": false,
      "parent_types": [
        "java.io.Reader"
      ],
      "begin_line": 2184,
      "end_line": 2259,
      "comment": "\n     * Inner class to allow StrBuilder to operate as a writer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 2186,
      "end_line": 2186,
      "comment": " The current stream position. "
    },
    {
      "type": "field",
      "varNames": [
        "mark"
      ],
      "begin_line": 2188,
      "end_line": 2188,
      "comment": " The last mark position. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.StrBuilderReader()",
      "begin_line": 2191,
      "end_line": 2193,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2192,col 13)-(line 2192,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.close()",
      "begin_line": 2196,
      "end_line": 2198,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.read()",
      "begin_line": 2201,
      "end_line": 2206,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2202,col 13)-(line 2204,col 13)",
        "(line 2205,col 13)-(line 2205,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.read(char[], int, int)",
      "begin_line": 2209,
      "end_line": 2226,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2210,col 13)-(line 2213,col 13)",
        "(line 2214,col 13)-(line 2216,col 13)",
        "(line 2217,col 13)-(line 2219,col 13)",
        "(line 2220,col 13)-(line 2222,col 13)",
        "(line 2223,col 13)-(line 2223,col 45)",
        "(line 2224,col 13)-(line 2224,col 23)",
        "(line 2225,col 13)-(line 2225,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.skip(long)",
      "begin_line": 2229,
      "end_line": 2238,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2230,col 13)-(line 2232,col 13)",
        "(line 2233,col 13)-(line 2235,col 13)",
        "(line 2236,col 13)-(line 2236,col 21)",
        "(line 2237,col 13)-(line 2237,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.ready()",
      "begin_line": 2241,
      "end_line": 2243,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2242,col 13)-(line 2242,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.markSupported()",
      "begin_line": 2246,
      "end_line": 2248,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2247,col 13)-(line 2247,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.mark(int)",
      "begin_line": 2251,
      "end_line": 2253,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2252,col 13)-(line 2252,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.reset()",
      "begin_line": 2256,
      "end_line": 2258,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2257,col 13)-(line 2257,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StrBuilderWriter",
      "is_interface": false,
      "parent_types": [
        "java.io.Writer"
      ],
      "begin_line": 2265,
      "end_line": 2306,
      "comment": "\n     * Inner class to allow StrBuilder to operate as a writer.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.StrBuilderWriter()",
      "begin_line": 2268,
      "end_line": 2270,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2269,col 13)-(line 2269,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.close()",
      "begin_line": 2273,
      "end_line": 2275,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.flush()",
      "begin_line": 2278,
      "end_line": 2280,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.write(int)",
      "begin_line": 2283,
      "end_line": 2285,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2284,col 13)-(line 2284,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.write(char[])",
      "begin_line": 2288,
      "end_line": 2290,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2289,col 13)-(line 2289,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.write(char[], int, int)",
      "begin_line": 2293,
      "end_line": 2295,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2294,col 13)-(line 2294,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.write(java.lang.String)",
      "begin_line": 2298,
      "end_line": 2300,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2299,col 13)-(line 2299,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.write(java.lang.String, int, int)",
      "begin_line": 2303,
      "end_line": 2305,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2304,col 13)-(line 2304,col 50)"
      ]
    }
  ]
}