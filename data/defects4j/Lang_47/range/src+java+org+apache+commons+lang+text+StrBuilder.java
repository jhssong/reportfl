{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/text/StrBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StrBuilder",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable"
      ],
      "begin_line": 70,
      "end_line": 2712,
      "comment": "\n * Builds a string from constituent parts providing a more flexible and powerful API\n * than StringBuffer.\n * \u003cp\u003e\n * The main differences from StringBuffer/StringBuilder are:\n * \u003cul\u003e\n * \u003cli\u003eNot synchronized\u003c/li\u003e\n * \u003cli\u003eNot final\u003c/li\u003e\n * \u003cli\u003eSubclasses have direct access to character array\u003c/li\u003e\n * \u003cli\u003eAdditional methods\n *  \u003cul\u003e\n *   \u003cli\u003eappendWithSeparators - adds an array of values, with a separator\u003c/li\u003e\n *   \u003cli\u003eappendPadding - adds a length padding characters\u003c/li\u003e\n *   \u003cli\u003eappendFixedLength - adds a fixed width field to the builder\u003c/li\u003e\n *   \u003cli\u003etoCharArray/getChars - simpler ways to get a range of the character array\u003c/li\u003e\n *   \u003cli\u003edelete - delete char or string\u003c/li\u003e\n *   \u003cli\u003ereplace - search and replace for a char or string\u003c/li\u003e\n *   \u003cli\u003eleftString/rightString/midString - substring without exceptions\u003c/li\u003e\n *   \u003cli\u003econtains - whether the builder contains a char or string\u003c/li\u003e\n *   \u003cli\u003esize/clear/isEmpty - collections style API methods\u003c/li\u003e\n *  \u003c/ul\u003e\n * \u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cli\u003eViews\n *  \u003cul\u003e\n *   \u003cli\u003easTokenizer - uses the internal buffer as the source of a StrTokenizer\u003c/li\u003e\n *   \u003cli\u003easReader - uses the internal buffer as the source of a Reader\u003c/li\u003e\n *   \u003cli\u003easWriter - allows a Writer to write directly to the internal buffer\u003c/li\u003e\n *  \u003c/ul\u003e\n * \u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * The aim has been to provide an API that mimics very closely what StringBuffer\n * provides, but with additional methods. It should be noted that some edge cases,\n * with invalid indices or null input, have been altered - see individual methods.\n * The biggest of these changes is that by default, null will not output the text\n * \u0027null\u0027. This can be controlled by a property, {@link #setNullText(String)}.\n *\n * @author Stephen Colebourne\n * @since 2.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "CAPACITY"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n     * The extra capacity for new builders.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "buffer"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Internal data storage. "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Current size of the buffer. "
    },
    {
      "type": "field",
      "varNames": [
        "newLine"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " The new line. "
    },
    {
      "type": "field",
      "varNames": [
        "nullText"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " The null text. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilder()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Constructor that creates an empty builder initial capacity 32 characters.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilder(int)",
      "begin_line": 106,
      "end_line": 112,
      "comment": "\n     * Constructor that creates an empty builder the specified initial capacity.\n     *\n     * @param initialCapacity  the initial capacity, zero or less will be converted to 32\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 16)",
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilder(java.lang.String)",
      "begin_line": 120,
      "end_line": 128,
      "comment": "\n     * Constructor that creates a builder from the string, allocating\n     * 32 extra characters for growth.\n     *\n     * @param str  the string to copy, null treated as blank string\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 16)",
        "(line 122,col 9)-(line 127,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.getNewLineText()",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Gets the text to be appended when a new line is added.\n     *\n     * @return the new line text, null means use system default\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.setNewLineText(java.lang.String)",
      "begin_line": 146,
      "end_line": 149,
      "comment": "\n     * Sets the text to be appended when a new line is added.\n     *\n     * @param newLine  the new line text, null means use system default\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 31)",
        "(line 148,col 9)-(line 148,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.getNullText()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * Gets the text to be appended when null is added.\n     *\n     * @return the null text, null means no append\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.setNullText(java.lang.String)",
      "begin_line": 167,
      "end_line": 173,
      "comment": "\n     * Sets the text to be appended when null is added.\n     *\n     * @param nullText  the null text, null means no append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 171,col 33)",
        "(line 172,col 9)-(line 172,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.length()",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * Gets the length of the string builder.\n     *\n     * @return the length\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.setLength(int)",
      "begin_line": 193,
      "end_line": 209,
      "comment": "\n     * Updates the length of the builder by either dropping the last characters\n     * or adding filler of unicode zero.\n     *\n     * @param length  the length to set to, must be zero or positive\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the length is negative\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 208,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.capacity()",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n     * Gets the current size of the internal character array buffer.\n     *\n     * @return the capacity\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.ensureCapacity(int)",
      "begin_line": 227,
      "end_line": 234,
      "comment": "\n     * Checks the capacity and ensures that it is at least the size specified.\n     *\n     * @param capacity  the capacity to ensure\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 233,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.minimizeCapacity()",
      "begin_line": 241,
      "end_line": 248,
      "comment": "\n     * Minimizes the capacity to the actual length of the string.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 247,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.size()",
      "begin_line": 259,
      "end_line": 261,
      "comment": "\n     * Gets the length of the string builder.\n     * \u003cp\u003e\n     * This method is the same as {@link #length()} and is provided to match the\n     * API of Collections.\n     *\n     * @return the length\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.isEmpty()",
      "begin_line": 271,
      "end_line": 273,
      "comment": "\n     * Checks is the string builder is empty (convenience Collections API style method).\n     * \u003cp\u003e\n     * This method is the same as checking {@link #length()} and is provided to match the\n     * API of Collections.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the size is \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.clear()",
      "begin_line": 286,
      "end_line": 289,
      "comment": "\n     * Clears the string builder (convenience Collections API style method).\n     * \u003cp\u003e\n     * This method does not reduce the size of the internal character buffer.\n     * To do that, call \u003ccode\u003eclear()\u003c/code\u003e followed by {@link #minimizeCapacity()}.\n     * \u003cp\u003e\n     * This method is the same as {@link #setLength(int)} called with zero\n     * and is provided to match the API of Collections.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 17)",
        "(line 288,col 9)-(line 288,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.charAt(int)",
      "begin_line": 301,
      "end_line": 306,
      "comment": "\n     * Gets the character at the specified index.\n     *\n     * @see #setCharAt(int, char)\n     * @see #deleteCharAt(int)\n     * @param index  the index to retrieve, must be valid\n     * @return the character at the index\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 305,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.setCharAt(int, char)",
      "begin_line": 318,
      "end_line": 324,
      "comment": "\n     * Sets the character at the specified index.\n     *\n     * @see #charAt(int)\n     * @see #deleteCharAt(int)\n     * @param index  the index to set\n     * @param ch  the new character\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 322,col 27)",
        "(line 323,col 9)-(line 323,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteCharAt(int)",
      "begin_line": 335,
      "end_line": 341,
      "comment": "\n     * Deletes the character at the specified index.\n     *\n     * @see #charAt(int)\n     * @see #setCharAt(int, char)\n     * @param index  the index to delete\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 339,col 40)",
        "(line 340,col 9)-(line 340,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.toCharArray()",
      "begin_line": 349,
      "end_line": 356,
      "comment": "\n     * Copies the builder\u0027s character array into a new character array.\n     * \n     * @return a new array that represents the contents of the builder\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 352,col 9)",
        "(line 353,col 9)-(line 353,col 38)",
        "(line 354,col 9)-(line 354,col 52)",
        "(line 355,col 9)-(line 355,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.toCharArray(int, int)",
      "begin_line": 368,
      "end_line": 377,
      "comment": "\n     * Copies part of the builder\u0027s character array into a new character array.\n     * \n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except that\n     *  if too large it is treated as end of string\n     * @return a new array that holds part of the contents of the builder\n     * @throws IndexOutOfBoundsException if startIndex is invalid,\n     *  or if endIndex is invalid (but endIndex greater than size is valid)\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 55)",
        "(line 370,col 9)-(line 370,col 40)",
        "(line 371,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 374,col 37)",
        "(line 375,col 9)-(line 375,col 60)",
        "(line 376,col 9)-(line 376,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.getChars(char[])",
      "begin_line": 385,
      "end_line": 392,
      "comment": "\n     * Copies the character array into the specified array.\n     * \n     * @param destination  the destination array, null will cause an array to be created\n     * @return the input array, unless that was null or too small\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 27)",
        "(line 387,col 9)-(line 389,col 9)",
        "(line 390,col 9)-(line 390,col 57)",
        "(line 391,col 9)-(line 391,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.getChars(int, int, char[], int)",
      "begin_line": 404,
      "end_line": 415,
      "comment": "\n     * Copies the character array into the specified array.\n     *\n     * @param startIndex  first index to copy, inclusive, must be valid\n     * @param endIndex  last index, exclusive, must be valid\n     * @param destination  the destination array, must not be null or too small\n     * @param destinationIndex  the index to start copying in destination\n     * @throws NullPointerException if the array is null\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 414,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendNewLine()",
      "begin_line": 427,
      "end_line": 433,
      "comment": "\n     * Appends the new line string to this string builder.\n     * \u003cp\u003e\n     * The new line string can be altered using {@link #setNewLineText(String)}.\n     * This might be used to force the output to always use Unix line endings\n     * even when on Windows.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 432,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendNull()",
      "begin_line": 440,
      "end_line": 445,
      "comment": "\n     * Appends the text representing \u003ccode\u003enull\u003c/code\u003e to this string builder.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 443,col 9)",
        "(line 444,col 9)-(line 444,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(java.lang.Object)",
      "begin_line": 454,
      "end_line": 459,
      "comment": "\n     * Appends an object to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param obj  the object to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 457,col 9)",
        "(line 458,col 9)-(line 458,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(java.lang.String)",
      "begin_line": 468,
      "end_line": 480,
      "comment": "\n     * Appends a string to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 471,col 9)",
        "(line 472,col 9)-(line 472,col 34)",
        "(line 473,col 9)-(line 478,col 9)",
        "(line 479,col 9)-(line 479,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(java.lang.String, int, int)",
      "begin_line": 491,
      "end_line": 508,
      "comment": "\n     * Appends part of a string to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 494,col 9)",
        "(line 495,col 9)-(line 497,col 9)",
        "(line 498,col 9)-(line 500,col 9)",
        "(line 501,col 9)-(line 506,col 9)",
        "(line 507,col 9)-(line 507,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(java.lang.StringBuffer)",
      "begin_line": 517,
      "end_line": 529,
      "comment": "\n     * Appends a string buffer to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string buffer to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 520,col 9)",
        "(line 521,col 9)-(line 521,col 34)",
        "(line 522,col 9)-(line 527,col 9)",
        "(line 528,col 9)-(line 528,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(java.lang.StringBuffer, int, int)",
      "begin_line": 540,
      "end_line": 557,
      "comment": "\n     * Appends part of a string buffer to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 541,col 9)-(line 543,col 9)",
        "(line 544,col 9)-(line 546,col 9)",
        "(line 547,col 9)-(line 549,col 9)",
        "(line 550,col 9)-(line 555,col 9)",
        "(line 556,col 9)-(line 556,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(org.apache.commons.lang.text.StrBuilder)",
      "begin_line": 566,
      "end_line": 578,
      "comment": "\n     * Appends another string builder to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string builder to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 567,col 9)-(line 569,col 9)",
        "(line 570,col 9)-(line 570,col 34)",
        "(line 571,col 9)-(line 576,col 9)",
        "(line 577,col 9)-(line 577,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(org.apache.commons.lang.text.StrBuilder, int, int)",
      "begin_line": 589,
      "end_line": 606,
      "comment": "\n     * Appends part of a string builder to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 590,col 9)-(line 592,col 9)",
        "(line 593,col 9)-(line 595,col 9)",
        "(line 596,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 604,col 9)",
        "(line 605,col 9)-(line 605,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(char[])",
      "begin_line": 615,
      "end_line": 627,
      "comment": "\n     * Appends a char array to the string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param chars  the char array to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 616,col 9)-(line 618,col 9)",
        "(line 619,col 9)-(line 619,col 34)",
        "(line 620,col 9)-(line 625,col 9)",
        "(line 626,col 9)-(line 626,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(char[], int, int)",
      "begin_line": 638,
      "end_line": 655,
      "comment": "\n     * Appends a char array to the string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param chars  the char array to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 639,col 9)-(line 641,col 9)",
        "(line 642,col 9)-(line 644,col 9)",
        "(line 645,col 9)-(line 647,col 9)",
        "(line 648,col 9)-(line 653,col 9)",
        "(line 654,col 9)-(line 654,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(boolean)",
      "begin_line": 663,
      "end_line": 679,
      "comment": "\n     * Appends a boolean value to the string builder.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 664,col 9)-(line 677,col 9)",
        "(line 678,col 9)-(line 678,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(char)",
      "begin_line": 687,
      "end_line": 692,
      "comment": "\n     * Appends a char value to the string builder.\n     *\n     * @param ch  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 688,col 9)-(line 688,col 27)",
        "(line 689,col 9)-(line 689,col 32)",
        "(line 690,col 9)-(line 690,col 28)",
        "(line 691,col 9)-(line 691,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(int)",
      "begin_line": 700,
      "end_line": 702,
      "comment": "\n     * Appends an int value to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 701,col 9)-(line 701,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(long)",
      "begin_line": 710,
      "end_line": 712,
      "comment": "\n     * Appends a long value to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 711,col 9)-(line 711,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(float)",
      "begin_line": 720,
      "end_line": 722,
      "comment": "\n     * Appends a float value to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 721,col 9)-(line 721,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(double)",
      "begin_line": 730,
      "end_line": 732,
      "comment": "\n     * Appends a double value to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 731,col 9)-(line 731,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendln(java.lang.Object)",
      "begin_line": 743,
      "end_line": 745,
      "comment": "\n     * Appends an object followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param obj  the object to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 744,col 9)-(line 744,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendln(java.lang.String)",
      "begin_line": 755,
      "end_line": 757,
      "comment": "\n     * Appends a string followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 756,col 9)-(line 756,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendln(java.lang.String, int, int)",
      "begin_line": 769,
      "end_line": 771,
      "comment": "\n     * Appends part of a string followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 770,col 9)-(line 770,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendln(java.lang.StringBuffer)",
      "begin_line": 781,
      "end_line": 783,
      "comment": "\n     * Appends a string buffer followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string buffer to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 782,col 9)-(line 782,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendln(java.lang.StringBuffer, int, int)",
      "begin_line": 795,
      "end_line": 797,
      "comment": "\n     * Appends part of a string buffer followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 796,col 9)-(line 796,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendln(org.apache.commons.lang.text.StrBuilder)",
      "begin_line": 807,
      "end_line": 809,
      "comment": "\n     * Appends another string builder followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string builder to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 808,col 9)-(line 808,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendln(org.apache.commons.lang.text.StrBuilder, int, int)",
      "begin_line": 821,
      "end_line": 823,
      "comment": "\n     * Appends part of a string builder followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 822,col 9)-(line 822,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendln(char[])",
      "begin_line": 833,
      "end_line": 835,
      "comment": "\n     * Appends a char array followed by a new line to the string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param chars  the char array to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 834,col 9)-(line 834,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendln(char[], int, int)",
      "begin_line": 847,
      "end_line": 849,
      "comment": "\n     * Appends a char array followed by a new line to the string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param chars  the char array to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 848,col 9)-(line 848,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendln(boolean)",
      "begin_line": 858,
      "end_line": 860,
      "comment": "\n     * Appends a boolean value followed by a new line to the string builder.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 859,col 9)-(line 859,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendln(char)",
      "begin_line": 869,
      "end_line": 871,
      "comment": "\n     * Appends a char value followed by a new line to the string builder.\n     *\n     * @param ch  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 870,col 9)-(line 870,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendln(int)",
      "begin_line": 880,
      "end_line": 882,
      "comment": "\n     * Appends an int value followed by a new line to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 881,col 9)-(line 881,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendln(long)",
      "begin_line": 891,
      "end_line": 893,
      "comment": "\n     * Appends a long value followed by a new line to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 892,col 9)-(line 892,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendln(float)",
      "begin_line": 902,
      "end_line": 904,
      "comment": "\n     * Appends a float value followed by a new line to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 903,col 9)-(line 903,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendln(double)",
      "begin_line": 913,
      "end_line": 915,
      "comment": "\n     * Appends a double value followed by a new line to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 914,col 9)-(line 914,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendAll(java.lang.Object[])",
      "begin_line": 927,
      "end_line": 934,
      "comment": "\n     * Appends each item in an array to the builder without any separators.\n     * Appending a null array will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param array  the array to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 928,col 9)-(line 932,col 9)",
        "(line 933,col 9)-(line 933,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendAll(java.util.Collection)",
      "begin_line": 945,
      "end_line": 953,
      "comment": "\n     * Appends each item in a collection to the builder without any separators.\n     * Appending a null collection will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param coll  the collection to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 946,col 9)-(line 951,col 9)",
        "(line 952,col 9)-(line 952,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendAll(java.util.Iterator)",
      "begin_line": 964,
      "end_line": 971,
      "comment": "\n     * Appends each item in an iterator to the builder without any separators.\n     * Appending a null iterator will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param it  the iterator to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 965,col 9)-(line 969,col 9)",
        "(line 970,col 9)-(line 970,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendWithSeparators(java.lang.Object[], java.lang.String)",
      "begin_line": 984,
      "end_line": 994,
      "comment": "\n     * Appends an array placing separators between each value, but\n     * not before the first or after the last.\n     * Appending a null array will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param array  the array to append\n     * @param separator  the separator to use, null means no separator\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 985,col 9)-(line 992,col 9)",
        "(line 993,col 9)-(line 993,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendWithSeparators(java.util.Collection, java.lang.String)",
      "begin_line": 1006,
      "end_line": 1018,
      "comment": "\n     * Appends a collection placing separators between each value, but\n     * not before the first or after the last.\n     * Appending a null collection will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param coll  the collection to append\n     * @param separator  the separator to use, null means no separator\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1007,col 9)-(line 1016,col 9)",
        "(line 1017,col 9)-(line 1017,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendWithSeparators(java.util.Iterator, java.lang.String)",
      "begin_line": 1030,
      "end_line": 1041,
      "comment": "\n     * Appends an iterator placing separators between each value, but\n     * not before the first or after the last.\n     * Appending a null iterator will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param it  the iterator to append\n     * @param separator  the separator to use, null means no separator\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1031,col 9)-(line 1039,col 9)",
        "(line 1040,col 9)-(line 1040,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendSeparator(java.lang.String)",
      "begin_line": 1064,
      "end_line": 1069,
      "comment": "\n     * Appends a separator if the builder is currently non-empty.\n     * Appending a null separator will have no effect.\n     * The separator is appended using {@link #append(String)}.\n     * \u003cp\u003e\n     * This method is useful for adding a separator each time around the\n     * loop except the first.\n     * \u003cpre\u003e\n     * for (Iterator it \u003d list.iterator(); it.hasNext(); ) {\n     *   appendSeparator(\",\");\n     *   append(it.next());\n     * }\n     * \u003c/pre\u003e\n     * Note that for this simple example, you should use\n     * {@link #appendWithSeparators(Collection, String)}.\n     * \n     * @param separator  the separator to use, null means no separator\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1065,col 9)-(line 1067,col 9)",
        "(line 1068,col 9)-(line 1068,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendSeparator(char)",
      "begin_line": 1090,
      "end_line": 1095,
      "comment": "\n     * Appends a separator if the builder is currently non-empty.\n     * The separator is appended using {@link #append(char)}.\n     * \u003cp\u003e\n     * This method is useful for adding a separator each time around the\n     * loop except the first.\n     * \u003cpre\u003e\n     * for (Iterator it \u003d list.iterator(); it.hasNext(); ) {\n     *   appendSeparator(\u0027,\u0027);\n     *   append(it.next());\n     * }\n     * \u003c/pre\u003e\n     * Note that for this simple example, you should use\n     * {@link #appendWithSeparators(Collection, String)}.\n     * \n     * @param separator  the separator to use\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1091,col 9)-(line 1093,col 9)",
        "(line 1094,col 9)-(line 1094,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendSeparator(java.lang.String, int)",
      "begin_line": 1118,
      "end_line": 1123,
      "comment": "\n     * Appends a separator to the builder if the loop index is greater than zero.\n     * Appending a null separator will have no effect.\n     * The separator is appended using {@link #append(String)}.\n     * \u003cp\u003e\n     * This method is useful for adding a separator each time around the\n     * loop except the first.\n     * \u003cpre\u003e\n     * for (int i \u003d 0; i \u003c list.size(); i++) {\n     *   appendSeparator(\",\", i);\n     *   append(list.get(i));\n     * }\n     * \u003c/pre\u003e\n     * Note that for this simple example, you should use\n     * {@link #appendWithSeparators(Collection, String)}.\n     * \n     * @param separator  the separator to use, null means no separator\n     * @param loopIndex  the loop index\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1119,col 9)-(line 1121,col 9)",
        "(line 1122,col 9)-(line 1122,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendSeparator(char, int)",
      "begin_line": 1145,
      "end_line": 1150,
      "comment": "\n     * Appends a separator to the builder if the loop index is greater than zero.\n     * The separator is appended using {@link #append(char)}.\n     * \u003cp\u003e\n     * This method is useful for adding a separator each time around the\n     * loop except the first.\n     * \u003cpre\u003e\n     * for (int i \u003d 0; i \u003c list.size(); i++) {\n     *   appendSeparator(\",\", i);\n     *   append(list.get(i));\n     * }\n     * \u003c/pre\u003e\n     * Note that for this simple example, you should use\n     * {@link #appendWithSeparators(Collection, String)}.\n     * \n     * @param separator  the separator to use\n     * @param loopIndex  the loop index\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1146,col 9)-(line 1148,col 9)",
        "(line 1149,col 9)-(line 1149,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendPadding(int, char)",
      "begin_line": 1160,
      "end_line": 1168,
      "comment": "\n     * Appends the pad character to the builder the specified number of times.\n     * \n     * @param length  the length to append, negative means no append\n     * @param padChar  the character to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1161,col 9)-(line 1166,col 9)",
        "(line 1167,col 9)-(line 1167,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadLeft(java.lang.Object, int, char)",
      "begin_line": 1182,
      "end_line": 1199,
      "comment": "\n     * Appends an object to the builder padding on the left to a fixed width.\n     * The \u003ccode\u003etoString\u003c/code\u003e of the object is used.\n     * If the object is larger than the length, the left hand side is lost.\n     * If the object is null, the null text value is used.\n     * \n     * @param obj  the object to append, null uses null text\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1183,col 9)-(line 1197,col 9)",
        "(line 1198,col 9)-(line 1198,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadLeft(int, int, char)",
      "begin_line": 1211,
      "end_line": 1213,
      "comment": "\n     * Appends an object to the builder padding on the left to a fixed width.\n     * The \u003ccode\u003eString.valueOf\u003c/code\u003e of the \u003ccode\u003eint\u003c/code\u003e value is used.\n     * If the formatted value is larger than the length, the left hand side is lost.\n     * \n     * @param value  the value to append\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1212,col 9)-(line 1212,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadRight(java.lang.Object, int, char)",
      "begin_line": 1226,
      "end_line": 1243,
      "comment": "\n     * Appends an object to the builder padding on the right to a fixed length.\n     * The \u003ccode\u003etoString\u003c/code\u003e of the object is used.\n     * If the object is larger than the length, the right hand side is lost.\n     * If the object is null, null text value is used.\n     * \n     * @param obj  the object to append, null uses null text\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1227,col 9)-(line 1241,col 9)",
        "(line 1242,col 9)-(line 1242,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadRight(int, int, char)",
      "begin_line": 1255,
      "end_line": 1257,
      "comment": "\n     * Appends an object to the builder padding on the right to a fixed length.\n     * The \u003ccode\u003eString.valueOf\u003c/code\u003e of the \u003ccode\u003eint\u003c/code\u003e value is used.\n     * If the object is larger than the length, the right hand side is lost.\n     * \n     * @param value  the value to append\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1256,col 9)-(line 1256,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, java.lang.Object)",
      "begin_line": 1269,
      "end_line": 1274,
      "comment": "\n     * Inserts the string representation of an object into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param obj  the object to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1270,col 9)-(line 1272,col 9)",
        "(line 1273,col 9)-(line 1273,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, java.lang.String)",
      "begin_line": 1285,
      "end_line": 1299,
      "comment": "\n     * Inserts the string into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param str  the string to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1286,col 9)-(line 1286,col 29)",
        "(line 1287,col 9)-(line 1289,col 9)",
        "(line 1290,col 9)-(line 1290,col 54)",
        "(line 1291,col 9)-(line 1297,col 9)",
        "(line 1298,col 9)-(line 1298,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, char[])",
      "begin_line": 1310,
      "end_line": 1323,
      "comment": "\n     * Inserts the character array into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param chars  the char array to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1311,col 9)-(line 1311,col 29)",
        "(line 1312,col 9)-(line 1314,col 9)",
        "(line 1315,col 9)-(line 1315,col 31)",
        "(line 1316,col 9)-(line 1321,col 9)",
        "(line 1322,col 9)-(line 1322,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, char[], int, int)",
      "begin_line": 1336,
      "end_line": 1354,
      "comment": "\n     * Inserts part of the character array into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param chars  the char array to insert\n     * @param offset  the offset into the character array to start at, must be valid\n     * @param length  the length of the character array part to copy, must be positive\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 1337,col 9)-(line 1337,col 29)",
        "(line 1338,col 9)-(line 1340,col 9)",
        "(line 1341,col 9)-(line 1343,col 9)",
        "(line 1344,col 9)-(line 1346,col 9)",
        "(line 1347,col 9)-(line 1352,col 9)",
        "(line 1353,col 9)-(line 1353,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, boolean)",
      "begin_line": 1364,
      "end_line": 1385,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1365,col 9)-(line 1365,col 29)",
        "(line 1366,col 9)-(line 1383,col 9)",
        "(line 1384,col 9)-(line 1384,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, char)",
      "begin_line": 1395,
      "end_line": 1402,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1396,col 9)-(line 1396,col 29)",
        "(line 1397,col 9)-(line 1397,col 33)",
        "(line 1398,col 9)-(line 1398,col 73)",
        "(line 1399,col 9)-(line 1399,col 30)",
        "(line 1400,col 9)-(line 1400,col 15)",
        "(line 1401,col 9)-(line 1401,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, int)",
      "begin_line": 1412,
      "end_line": 1414,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1413,col 9)-(line 1413,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, long)",
      "begin_line": 1424,
      "end_line": 1426,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1425,col 9)-(line 1425,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, float)",
      "begin_line": 1436,
      "end_line": 1438,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1437,col 9)-(line 1437,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, double)",
      "begin_line": 1448,
      "end_line": 1450,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1449,col 9)-(line 1449,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteImpl(int, int, int)",
      "begin_line": 1461,
      "end_line": 1464,
      "comment": "\n     * Internal method to delete a range without validation.\n     *\n     * @param startIndex  the start index, must be valid\n     * @param endIndex  the end index (exclusive), must be valid\n     * @param len  the length, must be valid\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 1462,col 9)-(line 1462,col 80)",
        "(line 1463,col 9)-(line 1463,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.delete(int, int)",
      "begin_line": 1475,
      "end_line": 1482,
      "comment": "\n     * Deletes the characters between the two specified indices.\n     *\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1476,col 9)-(line 1476,col 55)",
        "(line 1477,col 9)-(line 1477,col 40)",
        "(line 1478,col 9)-(line 1480,col 9)",
        "(line 1481,col 9)-(line 1481,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteAll(char)",
      "begin_line": 1491,
      "end_line": 1506,
      "comment": "\n     * Deletes the character wherever it occurs in the builder.\n     *\n     * @param ch  the character to delete\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1492,col 9)-(line 1504,col 9)",
        "(line 1505,col 9)-(line 1505,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteFirst(char)",
      "begin_line": 1514,
      "end_line": 1522,
      "comment": "\n     * Deletes the character wherever it occurs in the builder.\n     *\n     * @param ch  the character to delete\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1515,col 9)-(line 1520,col 9)",
        "(line 1521,col 9)-(line 1521,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteAll(java.lang.String)",
      "begin_line": 1531,
      "end_line": 1541,
      "comment": "\n     * Deletes the string wherever it occurs in the builder.\n     *\n     * @param str  the string to delete, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1532,col 9)-(line 1532,col 51)",
        "(line 1533,col 9)-(line 1539,col 9)",
        "(line 1540,col 9)-(line 1540,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteFirst(java.lang.String)",
      "begin_line": 1549,
      "end_line": 1558,
      "comment": "\n     * Deletes the string wherever it occurs in the builder.\n     *\n     * @param str  the string to delete, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1550,col 9)-(line 1550,col 51)",
        "(line 1551,col 9)-(line 1556,col 9)",
        "(line 1557,col 9)-(line 1557,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteAll(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 1571,
      "end_line": 1573,
      "comment": "\n     * Deletes all parts of the builder that the matcher matches.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced deletion behaviour.\n     * For example you could write a matcher to delete all occurances\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1572,col 9)-(line 1572,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteFirst(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 1585,
      "end_line": 1587,
      "comment": "\n     * Deletes the first match within the builder using the specified matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced deletion behaviour.\n     * For example you could write a matcher to delete\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1586,col 9)-(line 1586,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceImpl(int, int, int, java.lang.String, int)",
      "begin_line": 1600,
      "end_line": 1610,
      "comment": "\n     * Internal method to delete a range without validation.\n     *\n     * @param startIndex  the start index, must be valid\n     * @param endIndex  the end index (exclusive), must be valid\n     * @param removeLen  the length to remove (endIndex - startIndex), must be valid\n     * @param insertStr  the string to replace with, null means delete range\n     * @param insertLen  the length of the insert string, must be valid\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 1601,col 9)-(line 1601,col 51)",
        "(line 1602,col 9)-(line 1606,col 9)",
        "(line 1607,col 9)-(line 1609,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replace(int, int, java.lang.String)",
      "begin_line": 1623,
      "end_line": 1628,
      "comment": "\n     * Replaces a portion of the string builder with another string.\n     * The length of the inserted string does not have to match the removed length.\n     *\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @param replaceStr  the string to replace with, null means delete range\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1624,col 9)-(line 1624,col 55)",
        "(line 1625,col 9)-(line 1625,col 71)",
        "(line 1626,col 9)-(line 1626,col 88)",
        "(line 1627,col 9)-(line 1627,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceAll(char, char)",
      "begin_line": 1639,
      "end_line": 1648,
      "comment": "\n     * Replaces the search character with the replace character\n     * throughout the builder.\n     *\n     * @param search  the search character\n     * @param replace  the replace character\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1640,col 9)-(line 1646,col 9)",
        "(line 1647,col 9)-(line 1647,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceFirst(char, char)",
      "begin_line": 1658,
      "end_line": 1668,
      "comment": "\n     * Replaces the first instance of the search character with the\n     * replace character in the builder.\n     *\n     * @param search  the search character\n     * @param replace  the replace character\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1659,col 9)-(line 1666,col 9)",
        "(line 1667,col 9)-(line 1667,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceAll(java.lang.String, java.lang.String)",
      "begin_line": 1678,
      "end_line": 1689,
      "comment": "\n     * Replaces the search string with the replace string throughout the builder.\n     *\n     * @param searchStr  the search string, null causes no action to occur\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1679,col 9)-(line 1679,col 69)",
        "(line 1680,col 9)-(line 1687,col 9)",
        "(line 1688,col 9)-(line 1688,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceFirst(java.lang.String, java.lang.String)",
      "begin_line": 1698,
      "end_line": 1708,
      "comment": "\n     * Replaces the first instance of the search string with the replace string.\n     *\n     * @param searchStr  the search string, null causes no action to occur\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1699,col 9)-(line 1699,col 69)",
        "(line 1700,col 9)-(line 1706,col 9)",
        "(line 1707,col 9)-(line 1707,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceAll(org.apache.commons.lang.text.StrMatcher, java.lang.String)",
      "begin_line": 1722,
      "end_line": 1724,
      "comment": "\n     * Replaces all matches within the builder with the replace string.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced replace behaviour.\n     * For example you could write a matcher to replace all occurances\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1723,col 9)-(line 1723,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceFirst(org.apache.commons.lang.text.StrMatcher, java.lang.String)",
      "begin_line": 1737,
      "end_line": 1739,
      "comment": "\n     * Replaces the first match within the builder with the replace string.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced replace behaviour.\n     * For example you could write a matcher to replace\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1738,col 9)-(line 1738,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replace(org.apache.commons.lang.text.StrMatcher, java.lang.String, int, int, int)",
      "begin_line": 1758,
      "end_line": 1763,
      "comment": "\n     * Advanced search and replaces within the builder using a matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced behaviour.\n     * For example you could write a matcher to delete all occurances\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the string to replace the match with, null is a delete\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @param replaceCount  the number of times to replace, -1 for replace all\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if start index is invalid\n     ",
      "child_ranges": [
        "(line 1761,col 9)-(line 1761,col 55)",
        "(line 1762,col 9)-(line 1762,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceImpl(org.apache.commons.lang.text.StrMatcher, java.lang.String, int, int, int)",
      "begin_line": 1780,
      "end_line": 1800,
      "comment": "\n     * Replaces within the builder using a matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced behaviour.\n     * For example you could write a matcher to delete all occurances\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the string to replace the match with, null is a delete\n     * @param from  the start index, must be valid\n     * @param to  the end index (exclusive), must be valid\n     * @param replaceCount  the number of times to replace, -1 for replace all\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 1783,col 9)-(line 1785,col 9)",
        "(line 1786,col 9)-(line 1786,col 72)",
        "(line 1787,col 9)-(line 1787,col 28)",
        "(line 1788,col 9)-(line 1798,col 9)",
        "(line 1799,col 9)-(line 1799,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.reverse()",
      "begin_line": 1808,
      "end_line": 1821,
      "comment": "\n     * Reverses the string builder placing each character in the opposite index.\n     * \n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1809,col 9)-(line 1811,col 9)",
        "(line 1813,col 9)-(line 1813,col 28)",
        "(line 1814,col 9)-(line 1814,col 28)",
        "(line 1815,col 9)-(line 1819,col 9)",
        "(line 1820,col 9)-(line 1820,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.trim()",
      "begin_line": 1830,
      "end_line": 1850,
      "comment": "\n     * Trims the builder by removing characters less than or equal to a space\n     * from the beginning and end.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1831,col 9)-(line 1833,col 9)",
        "(line 1834,col 9)-(line 1834,col 23)",
        "(line 1835,col 9)-(line 1835,col 28)",
        "(line 1836,col 9)-(line 1836,col 20)",
        "(line 1837,col 9)-(line 1839,col 9)",
        "(line 1840,col 9)-(line 1842,col 9)",
        "(line 1843,col 9)-(line 1845,col 9)",
        "(line 1846,col 9)-(line 1848,col 9)",
        "(line 1849,col 9)-(line 1849,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.startsWith(java.lang.String)",
      "begin_line": 1861,
      "end_line": 1878,
      "comment": "\n     * Checks whether this builder starts with the specified string.\n     * \u003cp\u003e\n     * Note that this method handles null input quietly, unlike String.\n     * \n     * @param str  the string to search for, null returns false\n     * @return true if the builder starts with the string\n     ",
      "child_ranges": [
        "(line 1862,col 9)-(line 1864,col 9)",
        "(line 1865,col 9)-(line 1865,col 31)",
        "(line 1866,col 9)-(line 1868,col 9)",
        "(line 1869,col 9)-(line 1871,col 9)",
        "(line 1872,col 9)-(line 1876,col 9)",
        "(line 1877,col 9)-(line 1877,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.endsWith(java.lang.String)",
      "begin_line": 1888,
      "end_line": 1906,
      "comment": "\n     * Checks whether this builder ends with the specified string.\n     * \u003cp\u003e\n     * Note that this method handles null input quietly, unlike String.\n     * \n     * @param str  the string to search for, null returns false\n     * @return true if the builder ends with the string\n     ",
      "child_ranges": [
        "(line 1889,col 9)-(line 1891,col 9)",
        "(line 1892,col 9)-(line 1892,col 31)",
        "(line 1893,col 9)-(line 1895,col 9)",
        "(line 1896,col 9)-(line 1898,col 9)",
        "(line 1899,col 9)-(line 1899,col 29)",
        "(line 1900,col 9)-(line 1904,col 9)",
        "(line 1905,col 9)-(line 1905,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.substring(int)",
      "begin_line": 1916,
      "end_line": 1918,
      "comment": "\n     * Extracts a portion of this string builder as a string.\n     * \n     * @param start  the start index, inclusive, must be valid\n     * @return the new string\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1917,col 9)-(line 1917,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.substring(int, int)",
      "begin_line": 1933,
      "end_line": 1936,
      "comment": "\n     * Extracts a portion of this string builder as a string.\n     * \u003cp\u003e\n     * Note: This method treats an endIndex greater than the length of the\n     * builder as equal to the length of the builder, and continues\n     * without error, unlike StringBuffer or String.\n     * \n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @return the new string\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1934,col 9)-(line 1934,col 55)",
        "(line 1935,col 9)-(line 1935,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.leftString(int)",
      "begin_line": 1950,
      "end_line": 1958,
      "comment": "\n     * Extracts the leftmost characters from the string builder without\n     * throwing an exception.\n     * \u003cp\u003e\n     * This method extracts the left \u003ccode\u003elength\u003c/code\u003e characters from\n     * the builder. If this many characters are not available, the whole\n     * builder is returned. Thus the returned string may be shorter than the\n     * length requested.\n     * \n     * @param length  the number of characters to extract, negative returns empty string\n     * @return the new string\n     ",
      "child_ranges": [
        "(line 1951,col 9)-(line 1957,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.rightString(int)",
      "begin_line": 1972,
      "end_line": 1980,
      "comment": "\n     * Extracts the rightmost characters from the string builder without\n     * throwing an exception.\n     * \u003cp\u003e\n     * This method extracts the right \u003ccode\u003elength\u003c/code\u003e characters from\n     * the builder. If this many characters are not available, the whole\n     * builder is returned. Thus the returned string may be shorter than the\n     * length requested.\n     * \n     * @param length  the number of characters to extract, negative returns empty string\n     * @return the new string\n     ",
      "child_ranges": [
        "(line 1973,col 9)-(line 1979,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.midString(int, int)",
      "begin_line": 1998,
      "end_line": 2010,
      "comment": "\n     * Extracts some characters from the middle of the string builder without\n     * throwing an exception.\n     * \u003cp\u003e\n     * This method extracts \u003ccode\u003elength\u003c/code\u003e characters from the builder\n     * at the specified index.\n     * If the index is negative it is treated as zero.\n     * If the index is greater than the builder size, it is treated as the builder size.\n     * If the length is negative, the empty string is returned.\n     * If insufficient characters are available in the builder, as much as possible is returned.\n     * Thus the returned string may be shorter than the length requested.\n     * \n     * @param index  the index to start at, negative means zero\n     * @param length  the number of characters to extract, negative returns empty string\n     * @return the new string\n     ",
      "child_ranges": [
        "(line 1999,col 9)-(line 2001,col 9)",
        "(line 2002,col 9)-(line 2004,col 9)",
        "(line 2005,col 9)-(line 2009,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.contains(char)",
      "begin_line": 2019,
      "end_line": 2027,
      "comment": "\n     * Checks if the string builder contains the specified char.\n     *\n     * @param ch  the character to find\n     * @return true if the builder contains the character\n     ",
      "child_ranges": [
        "(line 2020,col 9)-(line 2020,col 32)",
        "(line 2021,col 9)-(line 2025,col 9)",
        "(line 2026,col 9)-(line 2026,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.contains(java.lang.String)",
      "begin_line": 2035,
      "end_line": 2037,
      "comment": "\n     * Checks if the string builder contains the specified string.\n     *\n     * @param str  the string to find\n     * @return true if the builder contains the string\n     ",
      "child_ranges": [
        "(line 2036,col 9)-(line 2036,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.contains(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 2050,
      "end_line": 2052,
      "comment": "\n     * Checks if the string builder contains a string matched using the\n     * specified matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to search for the character\n     * \u0027a\u0027 followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @return true if the matcher finds a match in the builder\n     ",
      "child_ranges": [
        "(line 2051,col 9)-(line 2051,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.indexOf(char)",
      "begin_line": 2061,
      "end_line": 2063,
      "comment": "\n     * Searches the string builder to find the first reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @return the first index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2062,col 9)-(line 2062,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.indexOf(char, int)",
      "begin_line": 2072,
      "end_line": 2084,
      "comment": "\n     * Searches the string builder to find the first reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the first index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2073,col 9)-(line 2073,col 55)",
        "(line 2074,col 9)-(line 2076,col 9)",
        "(line 2077,col 9)-(line 2077,col 32)",
        "(line 2078,col 9)-(line 2082,col 9)",
        "(line 2083,col 9)-(line 2083,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.indexOf(java.lang.String)",
      "begin_line": 2094,
      "end_line": 2096,
      "comment": "\n     * Searches the string builder to find the first reference to the specified string.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @return the first index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2095,col 9)-(line 2095,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.indexOf(java.lang.String, int)",
      "begin_line": 2108,
      "end_line": 2135,
      "comment": "\n     * Searches the string builder to find the first reference to the specified\n     * string starting searching from the given index.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the first index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2109,col 9)-(line 2109,col 55)",
        "(line 2110,col 9)-(line 2112,col 9)",
        "(line 2113,col 9)-(line 2113,col 34)",
        "(line 2114,col 9)-(line 2116,col 9)",
        "(line 2117,col 9)-(line 2119,col 9)",
        "(line 2120,col 9)-(line 2122,col 9)",
        "(line 2123,col 9)-(line 2123,col 32)",
        "(line 2124,col 9)-(line 2124,col 36)",
        "(line 2125,col 9)-(line 2133,col 9)",
        "(line 2134,col 9)-(line 2134,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.indexOf(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 2147,
      "end_line": 2149,
      "comment": "\n     * Searches the string builder using the matcher to find the first match.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @return the first index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2148,col 9)-(line 2148,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.indexOf(org.apache.commons.lang.text.StrMatcher, int)",
      "begin_line": 2163,
      "end_line": 2176,
      "comment": "\n     * Searches the string builder using the matcher to find the first\n     * match searching from the given index.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the first index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2164,col 9)-(line 2164,col 55)",
        "(line 2165,col 9)-(line 2167,col 9)",
        "(line 2168,col 9)-(line 2168,col 23)",
        "(line 2169,col 9)-(line 2169,col 28)",
        "(line 2170,col 9)-(line 2174,col 9)",
        "(line 2175,col 9)-(line 2175,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.lastIndexOf(char)",
      "begin_line": 2185,
      "end_line": 2187,
      "comment": "\n     * Searches the string builder to find the last reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @return the last index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2186,col 9)-(line 2186,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.lastIndexOf(char, int)",
      "begin_line": 2196,
      "end_line": 2207,
      "comment": "\n     * Searches the string builder to find the last reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the last index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2197,col 9)-(line 2197,col 66)",
        "(line 2198,col 9)-(line 2200,col 9)",
        "(line 2201,col 9)-(line 2205,col 9)",
        "(line 2206,col 9)-(line 2206,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.lastIndexOf(java.lang.String)",
      "begin_line": 2217,
      "end_line": 2219,
      "comment": "\n     * Searches the string builder to find the last reference to the specified string.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @return the last index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2218,col 9)-(line 2218,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.lastIndexOf(java.lang.String, int)",
      "begin_line": 2231,
      "end_line": 2256,
      "comment": "\n     * Searches the string builder to find the last reference to the specified\n     * string starting searching from the given index.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the last index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2232,col 9)-(line 2232,col 66)",
        "(line 2233,col 9)-(line 2235,col 9)",
        "(line 2236,col 9)-(line 2236,col 34)",
        "(line 2237,col 9)-(line 2254,col 9)",
        "(line 2255,col 9)-(line 2255,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.lastIndexOf(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 2268,
      "end_line": 2270,
      "comment": "\n     * Searches the string builder using the matcher to find the last match.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @return the last index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2269,col 9)-(line 2269,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.lastIndexOf(org.apache.commons.lang.text.StrMatcher, int)",
      "begin_line": 2284,
      "end_line": 2297,
      "comment": "\n     * Searches the string builder using the matcher to find the last\n     * match searching from the given index.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the last index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2285,col 9)-(line 2285,col 66)",
        "(line 2286,col 9)-(line 2288,col 9)",
        "(line 2289,col 9)-(line 2289,col 28)",
        "(line 2290,col 9)-(line 2290,col 38)",
        "(line 2291,col 9)-(line 2295,col 9)",
        "(line 2296,col 9)-(line 2296,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.asTokenizer()",
      "begin_line": 2332,
      "end_line": 2334,
      "comment": "\n     * Creates a tokenizer that can tokenize the contents of this builder.\n     * \u003cp\u003e\n     * This method allows the contents of this builder to be tokenized.\n     * The tokenizer will be setup by default to tokenize on space, tab,\n     * newline and formfeed (as per StringTokenizer). These values can be\n     * changed on the tokenizer class, before retrieving the tokens.\n     * \u003cp\u003e\n     * The returned tokenizer is linked to this builder. You may intermix\n     * calls to the buider and tokenizer within certain limits, however\n     * there is no synchronization. Once the tokenizer has been used once,\n     * it must be {@link StrTokenizer#reset() reset} to pickup the latest\n     * changes in the builder. For example:\n     * \u003cpre\u003e\n     * StrBuilder b \u003d new StrBuilder();\n     * b.append(\"a b \");\n     * StrTokenizer t \u003d b.asTokenizer();\n     * String[] tokens1 \u003d t.getTokenArray();  // returns a,b\n     * b.append(\"c d \");\n     * String[] tokens2 \u003d t.getTokenArray();  // returns a,b (c and d ignored)\n     * t.reset();              // reset causes builder changes to be picked up\n     * String[] tokens3 \u003d t.getTokenArray();  // returns a,b,c,d\n     * \u003c/pre\u003e\n     * In addition to simply intermixing appends and tokenization, you can also\n     * call the set methods on the tokenizer to alter how it tokenizes. Just\n     * remember to call reset when you want to pickup builder changes.\n     * \u003cp\u003e\n     * Calling {@link StrTokenizer#reset(String)} or {@link StrTokenizer#reset(char[])}\n     * with a non-null value will break the link with the builder.\n     *\n     * @return a tokenizer that is linked to this builder\n     ",
      "child_ranges": [
        "(line 2333,col 9)-(line 2333,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.asReader()",
      "begin_line": 2356,
      "end_line": 2358,
      "comment": "\n     * Gets the contents of this builder as a Reader.\n     * \u003cp\u003e\n     * This method allows the contents of the builder to be read\n     * using any standard method that expects a Reader.\n     * \u003cp\u003e\n     * To use, simply create a \u003ccode\u003eStrBuilder\u003c/code\u003e, populate it with\n     * data, call \u003ccode\u003easReader\u003c/code\u003e, and then read away.\n     * \u003cp\u003e\n     * The internal character array is shared between the builder and the reader.\n     * This allows you to append to the builder after creating the reader,\n     * and the changes will be picked up.\n     * Note however, that no synchronization occurs, so you must perform\n     * all operations with the builder and the reader in one thread.\n     * \u003cp\u003e\n     * The returned reader supports marking, and ignores the flush method.\n     *\n     * @return a reader that reads from this builder\n     ",
      "child_ranges": [
        "(line 2357,col 9)-(line 2357,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.asWriter()",
      "begin_line": 2381,
      "end_line": 2383,
      "comment": "\n     * Gets this builder as a Writer that can be written to.\n     * \u003cp\u003e\n     * This method allows you to populate the contents of the builder\n     * using any standard method that takes a Writer.\n     * \u003cp\u003e\n     * To use, simply create a \u003ccode\u003eStrBuilder\u003c/code\u003e,\n     * call \u003ccode\u003easWriter\u003c/code\u003e, and populate away. The data is available\n     * at any time using the methods of the \u003ccode\u003eStrBuilder\u003c/code\u003e.\n     * \u003cp\u003e\n     * The internal character array is shared between the builder and the writer.\n     * This allows you to intermix calls that append to the builder and\n     * write using the writer and the changes will be occur correctly.\n     * Note however, that no synchronization occurs, so you must perform\n     * all operations with the builder and the writer in one thread.\n     * \u003cp\u003e\n     * The returned writer ignores the close and flush methods.\n     *\n     * @return a writer that populates this builder\n     ",
      "child_ranges": [
        "(line 2382,col 9)-(line 2382,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.equalsIgnoreCase(org.apache.commons.lang.text.StrBuilder)",
      "begin_line": 2423,
      "end_line": 2440,
      "comment": "\n     * Checks the contents of this builder against another to see if they\n     * contain the same character content ignoring case.\n     *\n     * @param other  the object to check, null returns false\n     * @return true if the builders contain the same characters in the same order\n     ",
      "child_ranges": [
        "(line 2424,col 9)-(line 2426,col 9)",
        "(line 2427,col 9)-(line 2429,col 9)",
        "(line 2430,col 9)-(line 2430,col 37)",
        "(line 2431,col 9)-(line 2431,col 39)",
        "(line 2432,col 9)-(line 2438,col 9)",
        "(line 2439,col 9)-(line 2439,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.equals(org.apache.commons.lang.text.StrBuilder)",
      "begin_line": 2449,
      "end_line": 2464,
      "comment": "\n     * Checks the contents of this builder against another to see if they\n     * contain the same character content.\n     *\n     * @param other  the object to check, null returns false\n     * @return true if the builders contain the same characters in the same order\n     ",
      "child_ranges": [
        "(line 2450,col 9)-(line 2452,col 9)",
        "(line 2453,col 9)-(line 2455,col 9)",
        "(line 2456,col 9)-(line 2456,col 37)",
        "(line 2457,col 9)-(line 2457,col 39)",
        "(line 2458,col 9)-(line 2462,col 9)",
        "(line 2463,col 9)-(line 2463,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.equals(java.lang.Object)",
      "begin_line": 2473,
      "end_line": 2478,
      "comment": "\n     * Checks the contents of this builder against another to see if they\n     * contain the same character content.\n     *\n     * @param obj  the object to check, null returns false\n     * @return true if the builders contain the same characters in the same order\n     ",
      "child_ranges": [
        "(line 2474,col 9)-(line 2476,col 9)",
        "(line 2477,col 9)-(line 2477,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.hashCode()",
      "begin_line": 2485,
      "end_line": 2492,
      "comment": "\n     * Gets a suitable hash code for this builder.\n     *\n     * @return a hash code\n     ",
      "child_ranges": [
        "(line 2486,col 9)-(line 2486,col 28)",
        "(line 2487,col 9)-(line 2487,col 21)",
        "(line 2488,col 9)-(line 2490,col 9)",
        "(line 2491,col 9)-(line 2491,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.toString()",
      "begin_line": 2504,
      "end_line": 2506,
      "comment": "\n     * Gets a String version of the string builder, creating a new instance\n     * each time the method is called.\n     * \u003cp\u003e\n     * Note that unlike StringBuffer, the string version returned is\n     * independent of the string builder.\n     *\n     * @return the builder as a String\n     ",
      "child_ranges": [
        "(line 2505,col 9)-(line 2505,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.toStringBuffer()",
      "begin_line": 2514,
      "end_line": 2516,
      "comment": "\n     * Gets a StringBuffer version of the string builder, creating a\n     * new instance each time the method is called.\n     *\n     * @return the builder as a StringBuffer\n     ",
      "child_ranges": [
        "(line 2515,col 9)-(line 2515,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.validateRange(int, int)",
      "begin_line": 2528,
      "end_line": 2539,
      "comment": "\n     * Validates parameters defining a range of the builder.\n     * \n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @return the new string\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 2529,col 9)-(line 2531,col 9)",
        "(line 2532,col 9)-(line 2534,col 9)",
        "(line 2535,col 9)-(line 2537,col 9)",
        "(line 2538,col 9)-(line 2538,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.validateIndex(int)",
      "begin_line": 2547,
      "end_line": 2551,
      "comment": "\n     * Validates parameters defining a single index in the builder.\n     * \n     * @param index  the index, must be valid\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 2548,col 9)-(line 2550,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StrBuilderTokenizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.text.StrTokenizer"
      ],
      "begin_line": 2557,
      "end_line": 2582,
      "comment": "\n     * Inner class to allow StrBuilder to operate as a tokenizer.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer.StrBuilderTokenizer()",
      "begin_line": 2560,
      "end_line": 2562,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2561,col 13)-(line 2561,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer.tokenize(char[], int, int)",
      "begin_line": 2565,
      "end_line": 2571,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2566,col 13)-(line 2570,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer.getContent()",
      "begin_line": 2574,
      "end_line": 2581,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2575,col 13)-(line 2575,col 44)",
        "(line 2576,col 13)-(line 2580,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StrBuilderReader",
      "is_interface": false,
      "parent_types": [
        "java.io.Reader"
      ],
      "begin_line": 2588,
      "end_line": 2663,
      "comment": "\n     * Inner class to allow StrBuilder to operate as a writer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 2590,
      "end_line": 2590,
      "comment": " The current stream position. "
    },
    {
      "type": "field",
      "varNames": [
        "mark"
      ],
      "begin_line": 2592,
      "end_line": 2592,
      "comment": " The last mark position. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.StrBuilderReader()",
      "begin_line": 2595,
      "end_line": 2597,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2596,col 13)-(line 2596,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.close()",
      "begin_line": 2600,
      "end_line": 2602,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.read()",
      "begin_line": 2605,
      "end_line": 2610,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2606,col 13)-(line 2608,col 13)",
        "(line 2609,col 13)-(line 2609,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.read(char[], int, int)",
      "begin_line": 2613,
      "end_line": 2630,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2614,col 13)-(line 2617,col 13)",
        "(line 2618,col 13)-(line 2620,col 13)",
        "(line 2621,col 13)-(line 2623,col 13)",
        "(line 2624,col 13)-(line 2626,col 13)",
        "(line 2627,col 13)-(line 2627,col 61)",
        "(line 2628,col 13)-(line 2628,col 23)",
        "(line 2629,col 13)-(line 2629,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.skip(long)",
      "begin_line": 2633,
      "end_line": 2642,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2634,col 13)-(line 2636,col 13)",
        "(line 2637,col 13)-(line 2639,col 13)",
        "(line 2640,col 13)-(line 2640,col 21)",
        "(line 2641,col 13)-(line 2641,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.ready()",
      "begin_line": 2645,
      "end_line": 2647,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2646,col 13)-(line 2646,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.markSupported()",
      "begin_line": 2650,
      "end_line": 2652,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2651,col 13)-(line 2651,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.mark(int)",
      "begin_line": 2655,
      "end_line": 2657,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2656,col 13)-(line 2656,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.reset()",
      "begin_line": 2660,
      "end_line": 2662,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2661,col 13)-(line 2661,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StrBuilderWriter",
      "is_interface": false,
      "parent_types": [
        "java.io.Writer"
      ],
      "begin_line": 2669,
      "end_line": 2710,
      "comment": "\n     * Inner class to allow StrBuilder to operate as a writer.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.StrBuilderWriter()",
      "begin_line": 2672,
      "end_line": 2674,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2673,col 13)-(line 2673,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.close()",
      "begin_line": 2677,
      "end_line": 2679,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.flush()",
      "begin_line": 2682,
      "end_line": 2684,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.write(int)",
      "begin_line": 2687,
      "end_line": 2689,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2688,col 13)-(line 2688,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.write(char[])",
      "begin_line": 2692,
      "end_line": 2694,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2693,col 13)-(line 2693,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.write(char[], int, int)",
      "begin_line": 2697,
      "end_line": 2699,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2698,col 13)-(line 2698,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.write(java.lang.String)",
      "begin_line": 2702,
      "end_line": 2704,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2703,col 13)-(line 2703,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.write(java.lang.String, int, int)",
      "begin_line": 2707,
      "end_line": 2709,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2708,col 13)-(line 2708,col 50)"
      ]
    }
  ]
}