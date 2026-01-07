{
  "filepath": "/tmp/Lang-57b/src/java/org/apache/commons/lang/text/StrBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StrBuilder",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable"
      ],
      "begin_line": 70,
      "end_line": 2364,
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
      "signature": "org.apache.commons.lang.text.StrBuilder.appendWithSeparators(java.lang.Object[], java.lang.String)",
      "begin_line": 745,
      "end_line": 755,
      "comment": "\n     * Appends an array placing separators between each value, but\n     * not before the first or after the last.\n     * Appending a null array will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param array  the array to append\n     * @param separator  the separator to use, null means no separator\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 746,col 9)-(line 753,col 9)",
        "(line 754,col 9)-(line 754,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendWithSeparators(java.util.Collection, java.lang.String)",
      "begin_line": 767,
      "end_line": 779,
      "comment": "\n     * Appends a collection placing separators between each value, but\n     * not before the first or after the last.\n     * Appending a null collection will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param coll  the collection to append\n     * @param separator  the separator to use, null means no separator\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 768,col 9)-(line 777,col 9)",
        "(line 778,col 9)-(line 778,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendWithSeparators(java.util.Iterator, java.lang.String)",
      "begin_line": 791,
      "end_line": 802,
      "comment": "\n     * Appends an iterator placing separators between each value, but\n     * not before the first or after the last.\n     * Appending a null iterator will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param it  the iterator to append\n     * @param separator  the separator to use, null means no separator\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 792,col 9)-(line 800,col 9)",
        "(line 801,col 9)-(line 801,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendPadding(int, char)",
      "begin_line": 812,
      "end_line": 820,
      "comment": "\n     * Appends the pad character to the builder the specified number of times.\n     * \n     * @param length  the length to append, negative means no append\n     * @param padChar  the character to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 813,col 9)-(line 818,col 9)",
        "(line 819,col 9)-(line 819,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadLeft(java.lang.Object, int, char)",
      "begin_line": 834,
      "end_line": 851,
      "comment": "\n     * Appends an object to the builder padding on the left to a fixed width.\n     * The \u003ccode\u003etoString\u003c/code\u003e of the object is used.\n     * If the object is larger than the length, the left hand side is lost.\n     * If the object is null, the null text value is used.\n     * \n     * @param obj  the object to append, null uses null text\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 835,col 9)-(line 849,col 9)",
        "(line 850,col 9)-(line 850,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadLeft(int, int, char)",
      "begin_line": 863,
      "end_line": 865,
      "comment": "\n     * Appends an object to the builder padding on the left to a fixed width.\n     * The \u003ccode\u003eString.valueOf\u003c/code\u003e of the \u003ccode\u003eint\u003c/code\u003e value is used.\n     * If the formatted value is larger than the length, the left hand side is lost.\n     * \n     * @param value  the value to append\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 864,col 9)-(line 864,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadRight(java.lang.Object, int, char)",
      "begin_line": 878,
      "end_line": 895,
      "comment": "\n     * Appends an object to the builder padding on the right to a fixed length.\n     * The \u003ccode\u003etoString\u003c/code\u003e of the object is used.\n     * If the object is larger than the length, the right hand side is lost.\n     * If the object is null, null text value is used.\n     * \n     * @param obj  the object to append, null uses null text\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 879,col 9)-(line 893,col 9)",
        "(line 894,col 9)-(line 894,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadRight(int, int, char)",
      "begin_line": 907,
      "end_line": 909,
      "comment": "\n     * Appends an object to the builder padding on the right to a fixed length.\n     * The \u003ccode\u003eString.valueOf\u003c/code\u003e of the \u003ccode\u003eint\u003c/code\u003e value is used.\n     * If the object is larger than the length, the right hand side is lost.\n     * \n     * @param value  the value to append\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 908,col 9)-(line 908,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, java.lang.Object)",
      "begin_line": 921,
      "end_line": 926,
      "comment": "\n     * Inserts the string representation of an object into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param obj  the object to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 922,col 9)-(line 924,col 9)",
        "(line 925,col 9)-(line 925,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, java.lang.String)",
      "begin_line": 937,
      "end_line": 951,
      "comment": "\n     * Inserts the string into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param str  the string to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 938,col 9)-(line 938,col 29)",
        "(line 939,col 9)-(line 941,col 9)",
        "(line 942,col 9)-(line 942,col 54)",
        "(line 943,col 9)-(line 949,col 9)",
        "(line 950,col 9)-(line 950,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, char[])",
      "begin_line": 962,
      "end_line": 975,
      "comment": "\n     * Inserts the character array into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param chars  the char array to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 963,col 9)-(line 963,col 29)",
        "(line 964,col 9)-(line 966,col 9)",
        "(line 967,col 9)-(line 967,col 31)",
        "(line 968,col 9)-(line 973,col 9)",
        "(line 974,col 9)-(line 974,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, char[], int, int)",
      "begin_line": 988,
      "end_line": 1006,
      "comment": "\n     * Inserts part of the character array into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param chars  the char array to insert\n     * @param offset  the offset into the character array to start at, must be valid\n     * @param length  the length of the character array part to copy, must be positive\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 989,col 9)-(line 989,col 29)",
        "(line 990,col 9)-(line 992,col 9)",
        "(line 993,col 9)-(line 995,col 9)",
        "(line 996,col 9)-(line 998,col 9)",
        "(line 999,col 9)-(line 1004,col 9)",
        "(line 1005,col 9)-(line 1005,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, boolean)",
      "begin_line": 1016,
      "end_line": 1037,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1017,col 9)-(line 1017,col 29)",
        "(line 1018,col 9)-(line 1035,col 9)",
        "(line 1036,col 9)-(line 1036,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, char)",
      "begin_line": 1047,
      "end_line": 1054,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1048,col 9)-(line 1048,col 29)",
        "(line 1049,col 9)-(line 1049,col 33)",
        "(line 1050,col 9)-(line 1050,col 73)",
        "(line 1051,col 9)-(line 1051,col 30)",
        "(line 1052,col 9)-(line 1052,col 15)",
        "(line 1053,col 9)-(line 1053,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, int)",
      "begin_line": 1064,
      "end_line": 1066,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1065,col 9)-(line 1065,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, long)",
      "begin_line": 1076,
      "end_line": 1078,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1077,col 9)-(line 1077,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, float)",
      "begin_line": 1088,
      "end_line": 1090,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1089,col 9)-(line 1089,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, double)",
      "begin_line": 1100,
      "end_line": 1102,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1101,col 9)-(line 1101,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteImpl(int, int, int)",
      "begin_line": 1113,
      "end_line": 1116,
      "comment": "\n     * Internal method to delete a range without validation.\n     *\n     * @param startIndex  the start index, must be valid\n     * @param endIndex  the end index (exclusive), must be valid\n     * @param len  the length, must be valid\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 1114,col 9)-(line 1114,col 80)",
        "(line 1115,col 9)-(line 1115,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.delete(int, int)",
      "begin_line": 1127,
      "end_line": 1134,
      "comment": "\n     * Deletes the characters between the two specified indices.\n     *\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1128,col 9)-(line 1128,col 55)",
        "(line 1129,col 9)-(line 1129,col 40)",
        "(line 1130,col 9)-(line 1132,col 9)",
        "(line 1133,col 9)-(line 1133,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteAll(char)",
      "begin_line": 1143,
      "end_line": 1158,
      "comment": "\n     * Deletes the character wherever it occurs in the builder.\n     *\n     * @param ch  the character to delete\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1144,col 9)-(line 1156,col 9)",
        "(line 1157,col 9)-(line 1157,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteFirst(char)",
      "begin_line": 1166,
      "end_line": 1174,
      "comment": "\n     * Deletes the character wherever it occurs in the builder.\n     *\n     * @param ch  the character to delete\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1167,col 9)-(line 1172,col 9)",
        "(line 1173,col 9)-(line 1173,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteAll(java.lang.String)",
      "begin_line": 1183,
      "end_line": 1193,
      "comment": "\n     * Deletes the string wherever it occurs in the builder.\n     *\n     * @param str  the string to delete, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1184,col 9)-(line 1184,col 51)",
        "(line 1185,col 9)-(line 1191,col 9)",
        "(line 1192,col 9)-(line 1192,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteFirst(java.lang.String)",
      "begin_line": 1201,
      "end_line": 1210,
      "comment": "\n     * Deletes the string wherever it occurs in the builder.\n     *\n     * @param str  the string to delete, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1202,col 9)-(line 1202,col 51)",
        "(line 1203,col 9)-(line 1208,col 9)",
        "(line 1209,col 9)-(line 1209,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteAll(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 1223,
      "end_line": 1225,
      "comment": "\n     * Deletes all parts of the builder that the matcher matches.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced deletion behaviour.\n     * For example you could write a matcher to delete all occurances\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1224,col 9)-(line 1224,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteFirst(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 1237,
      "end_line": 1239,
      "comment": "\n     * Deletes the first match within the builder using the specified matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced deletion behaviour.\n     * For example you could write a matcher to delete\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1238,col 9)-(line 1238,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceImpl(int, int, int, java.lang.String, int)",
      "begin_line": 1252,
      "end_line": 1262,
      "comment": "\n     * Internal method to delete a range without validation.\n     *\n     * @param startIndex  the start index, must be valid\n     * @param endIndex  the end index (exclusive), must be valid\n     * @param removeLen  the length to remove (endIndex - startIndex), must be valid\n     * @param insertStr  the string to replace with, null means delete range\n     * @param insertLen  the length of the insert string, must be valid\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 1253,col 9)-(line 1253,col 51)",
        "(line 1254,col 9)-(line 1258,col 9)",
        "(line 1259,col 9)-(line 1261,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replace(int, int, java.lang.String)",
      "begin_line": 1275,
      "end_line": 1280,
      "comment": "\n     * Replaces a portion of the string builder with another string.\n     * The length of the inserted string does not have to match the removed length.\n     *\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @param replaceStr  the string to replace with, null means delete range\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1276,col 9)-(line 1276,col 55)",
        "(line 1277,col 9)-(line 1277,col 71)",
        "(line 1278,col 9)-(line 1278,col 88)",
        "(line 1279,col 9)-(line 1279,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceAll(char, char)",
      "begin_line": 1291,
      "end_line": 1300,
      "comment": "\n     * Replaces the search character with the replace character\n     * throughout the builder.\n     *\n     * @param search  the search character\n     * @param replace  the replace character\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1292,col 9)-(line 1298,col 9)",
        "(line 1299,col 9)-(line 1299,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceFirst(char, char)",
      "begin_line": 1310,
      "end_line": 1320,
      "comment": "\n     * Replaces the first instance of the search character with the\n     * replace character in the builder.\n     *\n     * @param search  the search character\n     * @param replace  the replace character\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1311,col 9)-(line 1318,col 9)",
        "(line 1319,col 9)-(line 1319,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceAll(java.lang.String, java.lang.String)",
      "begin_line": 1330,
      "end_line": 1341,
      "comment": "\n     * Replaces the search string with the replace string throughout the builder.\n     *\n     * @param searchStr  the search string, null causes no action to occur\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1331,col 9)-(line 1331,col 69)",
        "(line 1332,col 9)-(line 1339,col 9)",
        "(line 1340,col 9)-(line 1340,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceFirst(java.lang.String, java.lang.String)",
      "begin_line": 1350,
      "end_line": 1360,
      "comment": "\n     * Replaces the first instance of the search string with the replace string.\n     *\n     * @param searchStr  the search string, null causes no action to occur\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1351,col 9)-(line 1351,col 69)",
        "(line 1352,col 9)-(line 1358,col 9)",
        "(line 1359,col 9)-(line 1359,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceAll(org.apache.commons.lang.text.StrMatcher, java.lang.String)",
      "begin_line": 1374,
      "end_line": 1376,
      "comment": "\n     * Replaces all matches within the builder with the replace string.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced replace behaviour.\n     * For example you could write a matcher to replace all occurances\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1375,col 9)-(line 1375,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceFirst(org.apache.commons.lang.text.StrMatcher, java.lang.String)",
      "begin_line": 1389,
      "end_line": 1391,
      "comment": "\n     * Replaces the first match within the builder with the replace string.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced replace behaviour.\n     * For example you could write a matcher to replace\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1390,col 9)-(line 1390,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replace(org.apache.commons.lang.text.StrMatcher, java.lang.String, int, int, int)",
      "begin_line": 1410,
      "end_line": 1415,
      "comment": "\n     * Advanced search and replaces within the builder using a matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced behaviour.\n     * For example you could write a matcher to delete all occurances\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the string to replace the match with, null is a delete\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @param replaceCount  the number of times to replace, -1 for replace all\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if start index is invalid\n     ",
      "child_ranges": [
        "(line 1413,col 9)-(line 1413,col 55)",
        "(line 1414,col 9)-(line 1414,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceImpl(org.apache.commons.lang.text.StrMatcher, java.lang.String, int, int, int)",
      "begin_line": 1432,
      "end_line": 1452,
      "comment": "\n     * Replaces within the builder using a matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced behaviour.\n     * For example you could write a matcher to delete all occurances\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the string to replace the match with, null is a delete\n     * @param from  the start index, must be valid\n     * @param to  the end index (exclusive), must be valid\n     * @param replaceCount  the number of times to replace, -1 for replace all\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 1435,col 9)-(line 1437,col 9)",
        "(line 1438,col 9)-(line 1438,col 72)",
        "(line 1439,col 9)-(line 1439,col 28)",
        "(line 1440,col 9)-(line 1450,col 9)",
        "(line 1451,col 9)-(line 1451,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.reverse()",
      "begin_line": 1460,
      "end_line": 1473,
      "comment": "\n     * Reverses the string builder placing each character in the opposite index.\n     * \n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1461,col 9)-(line 1463,col 9)",
        "(line 1465,col 9)-(line 1465,col 28)",
        "(line 1466,col 9)-(line 1466,col 28)",
        "(line 1467,col 9)-(line 1471,col 9)",
        "(line 1472,col 9)-(line 1472,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.trim()",
      "begin_line": 1482,
      "end_line": 1502,
      "comment": "\n     * Trims the builder by removing characters less than or equal to a space\n     * from the beginning and end.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1483,col 9)-(line 1485,col 9)",
        "(line 1486,col 9)-(line 1486,col 23)",
        "(line 1487,col 9)-(line 1487,col 28)",
        "(line 1488,col 9)-(line 1488,col 20)",
        "(line 1489,col 9)-(line 1491,col 9)",
        "(line 1492,col 9)-(line 1494,col 9)",
        "(line 1495,col 9)-(line 1497,col 9)",
        "(line 1498,col 9)-(line 1500,col 9)",
        "(line 1501,col 9)-(line 1501,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.startsWith(java.lang.String)",
      "begin_line": 1513,
      "end_line": 1530,
      "comment": "\n     * Checks whether this builder starts with the specified string.\n     * \u003cp\u003e\n     * Note that this method handles null input quietly, unlike String.\n     * \n     * @param str  the string to search for, null returns false\n     * @return true if the builder starts with the string\n     ",
      "child_ranges": [
        "(line 1514,col 9)-(line 1516,col 9)",
        "(line 1517,col 9)-(line 1517,col 31)",
        "(line 1518,col 9)-(line 1520,col 9)",
        "(line 1521,col 9)-(line 1523,col 9)",
        "(line 1524,col 9)-(line 1528,col 9)",
        "(line 1529,col 9)-(line 1529,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.endsWith(java.lang.String)",
      "begin_line": 1540,
      "end_line": 1558,
      "comment": "\n     * Checks whether this builder ends with the specified string.\n     * \u003cp\u003e\n     * Note that this method handles null input quietly, unlike String.\n     * \n     * @param str  the string to search for, null returns false\n     * @return true if the builder ends with the string\n     ",
      "child_ranges": [
        "(line 1541,col 9)-(line 1543,col 9)",
        "(line 1544,col 9)-(line 1544,col 31)",
        "(line 1545,col 9)-(line 1547,col 9)",
        "(line 1548,col 9)-(line 1550,col 9)",
        "(line 1551,col 9)-(line 1551,col 29)",
        "(line 1552,col 9)-(line 1556,col 9)",
        "(line 1557,col 9)-(line 1557,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.substring(int)",
      "begin_line": 1568,
      "end_line": 1570,
      "comment": "\n     * Extracts a portion of this string builder as a string.\n     * \n     * @param start  the start index, inclusive, must be valid\n     * @return the new string\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1569,col 9)-(line 1569,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.substring(int, int)",
      "begin_line": 1585,
      "end_line": 1588,
      "comment": "\n     * Extracts a portion of this string builder as a string.\n     * \u003cp\u003e\n     * Note: This method treats an endIndex greater than the length of the\n     * builder as equal to the length of the builder, and continues\n     * without error, unlike StringBuffer or String.\n     * \n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @return the new string\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1586,col 9)-(line 1586,col 55)",
        "(line 1587,col 9)-(line 1587,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.leftString(int)",
      "begin_line": 1602,
      "end_line": 1610,
      "comment": "\n     * Extracts the leftmost characters from the string builder without\n     * throwing an exception.\n     * \u003cp\u003e\n     * This method extracts the left \u003ccode\u003elength\u003c/code\u003e characters from\n     * the builder. If this many characters are not available, the whole\n     * builder is returned. Thus the returned string may be shorter than the\n     * length requested.\n     * \n     * @param length  the number of characters to extract, negative returns empty string\n     * @return the new string\n     ",
      "child_ranges": [
        "(line 1603,col 9)-(line 1609,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.rightString(int)",
      "begin_line": 1624,
      "end_line": 1632,
      "comment": "\n     * Extracts the rightmost characters from the string builder without\n     * throwing an exception.\n     * \u003cp\u003e\n     * This method extracts the right \u003ccode\u003elength\u003c/code\u003e characters from\n     * the builder. If this many characters are not available, the whole\n     * builder is returned. Thus the returned string may be shorter than the\n     * length requested.\n     * \n     * @param length  the number of characters to extract, negative returns empty string\n     * @return the new string\n     ",
      "child_ranges": [
        "(line 1625,col 9)-(line 1631,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.midString(int, int)",
      "begin_line": 1650,
      "end_line": 1662,
      "comment": "\n     * Extracts some characters from the middle of the string builder without\n     * throwing an exception.\n     * \u003cp\u003e\n     * This method extracts \u003ccode\u003elength\u003c/code\u003e characters from the builder\n     * at the specified index.\n     * If the index is negative it is treated as zero.\n     * If the index is greater than the builder size, it is treated as the builder size.\n     * If the length is negative, the empty string is returned.\n     * If insufficient characters are available in the builder, as much as possible is returned.\n     * Thus the returned string may be shorter than the length requested.\n     * \n     * @param index  the index to start at, negative means zero\n     * @param length  the number of characters to extract, negative returns empty string\n     * @return the new string\n     ",
      "child_ranges": [
        "(line 1651,col 9)-(line 1653,col 9)",
        "(line 1654,col 9)-(line 1656,col 9)",
        "(line 1657,col 9)-(line 1661,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.contains(char)",
      "begin_line": 1671,
      "end_line": 1679,
      "comment": "\n     * Checks if the string builder contains the specified char.\n     *\n     * @param ch  the character to find\n     * @return true if the builder contains the character\n     ",
      "child_ranges": [
        "(line 1672,col 9)-(line 1672,col 32)",
        "(line 1673,col 9)-(line 1677,col 9)",
        "(line 1678,col 9)-(line 1678,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.contains(java.lang.String)",
      "begin_line": 1687,
      "end_line": 1689,
      "comment": "\n     * Checks if the string builder contains the specified string.\n     *\n     * @param str  the string to find\n     * @return true if the builder contains the string\n     ",
      "child_ranges": [
        "(line 1688,col 9)-(line 1688,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.contains(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 1702,
      "end_line": 1704,
      "comment": "\n     * Checks if the string builder contains a string matched using the\n     * specified matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to search for the character\n     * \u0027a\u0027 followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @return true if the matcher finds a match in the builder\n     ",
      "child_ranges": [
        "(line 1703,col 9)-(line 1703,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.indexOf(char)",
      "begin_line": 1713,
      "end_line": 1715,
      "comment": "\n     * Searches the string builder to find the first reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @return the first index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1714,col 9)-(line 1714,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.indexOf(char, int)",
      "begin_line": 1724,
      "end_line": 1736,
      "comment": "\n     * Searches the string builder to find the first reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the first index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1725,col 9)-(line 1725,col 55)",
        "(line 1726,col 9)-(line 1728,col 9)",
        "(line 1729,col 9)-(line 1729,col 32)",
        "(line 1730,col 9)-(line 1734,col 9)",
        "(line 1735,col 9)-(line 1735,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.indexOf(java.lang.String)",
      "begin_line": 1746,
      "end_line": 1748,
      "comment": "\n     * Searches the string builder to find the first reference to the specified string.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @return the first index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1747,col 9)-(line 1747,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.indexOf(java.lang.String, int)",
      "begin_line": 1760,
      "end_line": 1787,
      "comment": "\n     * Searches the string builder to find the first reference to the specified\n     * string starting searching from the given index.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the first index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1761,col 9)-(line 1761,col 55)",
        "(line 1762,col 9)-(line 1764,col 9)",
        "(line 1765,col 9)-(line 1765,col 34)",
        "(line 1766,col 9)-(line 1768,col 9)",
        "(line 1769,col 9)-(line 1771,col 9)",
        "(line 1772,col 9)-(line 1774,col 9)",
        "(line 1775,col 9)-(line 1775,col 32)",
        "(line 1776,col 9)-(line 1776,col 36)",
        "(line 1777,col 9)-(line 1785,col 9)",
        "(line 1786,col 9)-(line 1786,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.indexOf(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 1799,
      "end_line": 1801,
      "comment": "\n     * Searches the string builder using the matcher to find the first match.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @return the first index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1800,col 9)-(line 1800,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.indexOf(org.apache.commons.lang.text.StrMatcher, int)",
      "begin_line": 1815,
      "end_line": 1828,
      "comment": "\n     * Searches the string builder using the matcher to find the first\n     * match searching from the given index.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the first index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1816,col 9)-(line 1816,col 55)",
        "(line 1817,col 9)-(line 1819,col 9)",
        "(line 1820,col 9)-(line 1820,col 23)",
        "(line 1821,col 9)-(line 1821,col 28)",
        "(line 1822,col 9)-(line 1826,col 9)",
        "(line 1827,col 9)-(line 1827,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.lastIndexOf(char)",
      "begin_line": 1837,
      "end_line": 1839,
      "comment": "\n     * Searches the string builder to find the last reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @return the last index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1838,col 9)-(line 1838,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.lastIndexOf(char, int)",
      "begin_line": 1848,
      "end_line": 1859,
      "comment": "\n     * Searches the string builder to find the last reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the last index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1849,col 9)-(line 1849,col 66)",
        "(line 1850,col 9)-(line 1852,col 9)",
        "(line 1853,col 9)-(line 1857,col 9)",
        "(line 1858,col 9)-(line 1858,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.lastIndexOf(java.lang.String)",
      "begin_line": 1869,
      "end_line": 1871,
      "comment": "\n     * Searches the string builder to find the last reference to the specified string.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @return the last index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1870,col 9)-(line 1870,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.lastIndexOf(java.lang.String, int)",
      "begin_line": 1883,
      "end_line": 1908,
      "comment": "\n     * Searches the string builder to find the last reference to the specified\n     * string starting searching from the given index.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the last index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1884,col 9)-(line 1884,col 66)",
        "(line 1885,col 9)-(line 1887,col 9)",
        "(line 1888,col 9)-(line 1888,col 34)",
        "(line 1889,col 9)-(line 1906,col 9)",
        "(line 1907,col 9)-(line 1907,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.lastIndexOf(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 1920,
      "end_line": 1922,
      "comment": "\n     * Searches the string builder using the matcher to find the last match.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @return the last index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1921,col 9)-(line 1921,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.lastIndexOf(org.apache.commons.lang.text.StrMatcher, int)",
      "begin_line": 1936,
      "end_line": 1949,
      "comment": "\n     * Searches the string builder using the matcher to find the last\n     * match searching from the given index.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the last index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1937,col 9)-(line 1937,col 66)",
        "(line 1938,col 9)-(line 1940,col 9)",
        "(line 1941,col 9)-(line 1941,col 28)",
        "(line 1942,col 9)-(line 1942,col 38)",
        "(line 1943,col 9)-(line 1947,col 9)",
        "(line 1948,col 9)-(line 1948,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.asTokenizer()",
      "begin_line": 1984,
      "end_line": 1986,
      "comment": "\n     * Creates a tokenizer that can tokenize the contents of this builder.\n     * \u003cp\u003e\n     * This method allows the contents of this builder to be tokenized.\n     * The tokenizer will be setup by default to tokenize on space, tab,\n     * newline and formfeed (as per StringTokenizer). These values can be\n     * changed on the tokenizer class, before retrieving the tokens.\n     * \u003cp\u003e\n     * The returned tokenizer is linked to this builder. You may intermix\n     * calls to the buider and tokenizer within certain limits, however\n     * there is no synchronization. Once the tokenizer has been used once,\n     * it must be {@link StrTokenizer#reset() reset} to pickup the latest\n     * changes in the builder. For example:\n     * \u003cpre\u003e\n     * StrBuilder b \u003d new StrBuilder();\n     * b.append(\"a b \");\n     * StrTokenizer t \u003d b.asTokenizer();\n     * String[] tokens1 \u003d t.getTokenArray();  // returns a,b\n     * b.append(\"c d \");\n     * String[] tokens2 \u003d t.getTokenArray();  // returns a,b (c and d ignored)\n     * t.reset();              // reset causes builder changes to be picked up\n     * String[] tokens3 \u003d t.getTokenArray();  // returns a,b,c,d\n     * \u003c/pre\u003e\n     * In addition to simply intermixing appends and tokenization, you can also\n     * call the set methods on the tokenizer to alter how it tokenizes. Just\n     * remember to call reset when you want to pickup builder changes.\n     * \u003cp\u003e\n     * Calling {@link StrTokenizer#reset(String)} or {@link StrTokenizer#reset(char[])}\n     * with a non-null value will break the link with the builder.\n     *\n     * @return a tokenizer that is linked to this builder\n     ",
      "child_ranges": [
        "(line 1985,col 9)-(line 1985,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.asReader()",
      "begin_line": 2008,
      "end_line": 2010,
      "comment": "\n     * Gets the contents of this builder as a Reader.\n     * \u003cp\u003e\n     * This method allows the contents of the builder to be read\n     * using any standard method that expects a Reader.\n     * \u003cp\u003e\n     * To use, simply create a \u003ccode\u003eStrBuilder\u003c/code\u003e, populate it with\n     * data, call \u003ccode\u003easReader\u003c/code\u003e, and then read away.\n     * \u003cp\u003e\n     * The internal character array is shared between the builder and the reader.\n     * This allows you to append to the builder after creating the reader,\n     * and the changes will be picked up.\n     * Note however, that no synchronization occurs, so you must perform\n     * all operations with the builder and the reader in one thread.\n     * \u003cp\u003e\n     * The returned reader supports marking, and ignores the flush method.\n     *\n     * @return a reader that reads from this builder\n     ",
      "child_ranges": [
        "(line 2009,col 9)-(line 2009,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.asWriter()",
      "begin_line": 2033,
      "end_line": 2035,
      "comment": "\n     * Gets this builder as a Writer that can be written to.\n     * \u003cp\u003e\n     * This method allows you to populate the contents of the builder\n     * using any standard method that takes a Writer.\n     * \u003cp\u003e\n     * To use, simply create a \u003ccode\u003eStrBuilder\u003c/code\u003e,\n     * call \u003ccode\u003easWriter\u003c/code\u003e, and populate away. The data is available\n     * at any time using the methods of the \u003ccode\u003eStrBuilder\u003c/code\u003e.\n     * \u003cp\u003e\n     * The internal character array is shared between the builder and the writer.\n     * This allows you to intermix calls that append to the builder and\n     * write using the writer and the changes will be occur correctly.\n     * Note however, that no synchronization occurs, so you must perform\n     * all operations with the builder and the writer in one thread.\n     * \u003cp\u003e\n     * The returned writer ignores the close and flush methods.\n     *\n     * @return a writer that populates this builder\n     ",
      "child_ranges": [
        "(line 2034,col 9)-(line 2034,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.equalsIgnoreCase(org.apache.commons.lang.text.StrBuilder)",
      "begin_line": 2075,
      "end_line": 2092,
      "comment": "\n     * Checks the contents of this builder against another to see if they\n     * contain the same character content ignoring case.\n     *\n     * @param other  the object to check, null returns false\n     * @return true if the builders contain the same characters in the same order\n     ",
      "child_ranges": [
        "(line 2076,col 9)-(line 2078,col 9)",
        "(line 2079,col 9)-(line 2081,col 9)",
        "(line 2082,col 9)-(line 2082,col 37)",
        "(line 2083,col 9)-(line 2083,col 39)",
        "(line 2084,col 9)-(line 2090,col 9)",
        "(line 2091,col 9)-(line 2091,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.equals(org.apache.commons.lang.text.StrBuilder)",
      "begin_line": 2101,
      "end_line": 2116,
      "comment": "\n     * Checks the contents of this builder against another to see if they\n     * contain the same character content.\n     *\n     * @param other  the object to check, null returns false\n     * @return true if the builders contain the same characters in the same order\n     ",
      "child_ranges": [
        "(line 2102,col 9)-(line 2104,col 9)",
        "(line 2105,col 9)-(line 2107,col 9)",
        "(line 2108,col 9)-(line 2108,col 37)",
        "(line 2109,col 9)-(line 2109,col 39)",
        "(line 2110,col 9)-(line 2114,col 9)",
        "(line 2115,col 9)-(line 2115,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.equals(java.lang.Object)",
      "begin_line": 2125,
      "end_line": 2130,
      "comment": "\n     * Checks the contents of this builder against another to see if they\n     * contain the same character content.\n     *\n     * @param obj  the object to check, null returns false\n     * @return true if the builders contain the same characters in the same order\n     ",
      "child_ranges": [
        "(line 2126,col 9)-(line 2128,col 9)",
        "(line 2129,col 9)-(line 2129,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.hashCode()",
      "begin_line": 2137,
      "end_line": 2144,
      "comment": "\n     * Gets a suitable hash code for this builder.\n     *\n     * @return a hash code\n     ",
      "child_ranges": [
        "(line 2138,col 9)-(line 2138,col 28)",
        "(line 2139,col 9)-(line 2139,col 21)",
        "(line 2140,col 9)-(line 2142,col 9)",
        "(line 2143,col 9)-(line 2143,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.toString()",
      "begin_line": 2156,
      "end_line": 2158,
      "comment": "\n     * Gets a String version of the string builder, creating a new instance\n     * each time the method is called.\n     * \u003cp\u003e\n     * Note that unlike StringBuffer, the string version returned is\n     * independent of the string builder.\n     *\n     * @return the builder as a String\n     ",
      "child_ranges": [
        "(line 2157,col 9)-(line 2157,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.toStringBuffer()",
      "begin_line": 2166,
      "end_line": 2168,
      "comment": "\n     * Gets a StringBuffer version of the string builder, creating a\n     * new instance each time the method is called.\n     *\n     * @return the builder as a StringBuffer\n     ",
      "child_ranges": [
        "(line 2167,col 9)-(line 2167,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.validateRange(int, int)",
      "begin_line": 2180,
      "end_line": 2191,
      "comment": "\n     * Validates parameters defining a range of the builder.\n     * \n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @return the new string\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 2181,col 9)-(line 2183,col 9)",
        "(line 2184,col 9)-(line 2186,col 9)",
        "(line 2187,col 9)-(line 2189,col 9)",
        "(line 2190,col 9)-(line 2190,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.validateIndex(int)",
      "begin_line": 2199,
      "end_line": 2203,
      "comment": "\n     * Validates parameters defining a single index in the builder.\n     * \n     * @param index  the index, must be valid\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 2200,col 9)-(line 2202,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StrBuilderTokenizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.text.StrTokenizer"
      ],
      "begin_line": 2209,
      "end_line": 2234,
      "comment": "\n     * Inner class to allow StrBuilder to operate as a tokenizer.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer.StrBuilderTokenizer()",
      "begin_line": 2212,
      "end_line": 2214,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2213,col 13)-(line 2213,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer.tokenize(char[], int, int)",
      "begin_line": 2217,
      "end_line": 2223,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2218,col 13)-(line 2222,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer.getContent()",
      "begin_line": 2226,
      "end_line": 2233,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2227,col 13)-(line 2227,col 44)",
        "(line 2228,col 13)-(line 2232,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StrBuilderReader",
      "is_interface": false,
      "parent_types": [
        "java.io.Reader"
      ],
      "begin_line": 2240,
      "end_line": 2315,
      "comment": "\n     * Inner class to allow StrBuilder to operate as a writer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 2242,
      "end_line": 2242,
      "comment": " The current stream position. "
    },
    {
      "type": "field",
      "varNames": [
        "mark"
      ],
      "begin_line": 2244,
      "end_line": 2244,
      "comment": " The last mark position. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.StrBuilderReader()",
      "begin_line": 2247,
      "end_line": 2249,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2248,col 13)-(line 2248,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.close()",
      "begin_line": 2252,
      "end_line": 2254,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.read()",
      "begin_line": 2257,
      "end_line": 2262,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2258,col 13)-(line 2260,col 13)",
        "(line 2261,col 13)-(line 2261,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.read(char[], int, int)",
      "begin_line": 2265,
      "end_line": 2282,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2266,col 13)-(line 2269,col 13)",
        "(line 2270,col 13)-(line 2272,col 13)",
        "(line 2273,col 13)-(line 2275,col 13)",
        "(line 2276,col 13)-(line 2278,col 13)",
        "(line 2279,col 13)-(line 2279,col 61)",
        "(line 2280,col 13)-(line 2280,col 23)",
        "(line 2281,col 13)-(line 2281,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.skip(long)",
      "begin_line": 2285,
      "end_line": 2294,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2286,col 13)-(line 2288,col 13)",
        "(line 2289,col 13)-(line 2291,col 13)",
        "(line 2292,col 13)-(line 2292,col 21)",
        "(line 2293,col 13)-(line 2293,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.ready()",
      "begin_line": 2297,
      "end_line": 2299,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2298,col 13)-(line 2298,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.markSupported()",
      "begin_line": 2302,
      "end_line": 2304,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2303,col 13)-(line 2303,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.mark(int)",
      "begin_line": 2307,
      "end_line": 2309,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2308,col 13)-(line 2308,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.reset()",
      "begin_line": 2312,
      "end_line": 2314,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2313,col 13)-(line 2313,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StrBuilderWriter",
      "is_interface": false,
      "parent_types": [
        "java.io.Writer"
      ],
      "begin_line": 2321,
      "end_line": 2362,
      "comment": "\n     * Inner class to allow StrBuilder to operate as a writer.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.StrBuilderWriter()",
      "begin_line": 2324,
      "end_line": 2326,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2325,col 13)-(line 2325,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.close()",
      "begin_line": 2329,
      "end_line": 2331,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.flush()",
      "begin_line": 2334,
      "end_line": 2336,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.write(int)",
      "begin_line": 2339,
      "end_line": 2341,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2340,col 13)-(line 2340,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.write(char[])",
      "begin_line": 2344,
      "end_line": 2346,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2345,col 13)-(line 2345,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.write(char[], int, int)",
      "begin_line": 2349,
      "end_line": 2351,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2350,col 13)-(line 2350,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.write(java.lang.String)",
      "begin_line": 2354,
      "end_line": 2356,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2355,col 13)-(line 2355,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.write(java.lang.String, int, int)",
      "begin_line": 2359,
      "end_line": 2361,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2360,col 13)-(line 2360,col 50)"
      ]
    }
  ]
}