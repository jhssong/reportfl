{
  "filepath": "/tmp/Lang-64b/src/java/org/apache/commons/lang/text/StrBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StrBuilder",
      "is_interface": false,
      "parent_types": [
        "java.lang.Cloneable"
      ],
      "begin_line": 69,
      "end_line": 2362,
      "comment": "\n * Builds a string from constituent parts providing a more flexible and powerful API\n * than StringBuffer.\n * \u003cp\u003e\n * The main differences from StringBuffer/StringBuilder are:\n * \u003cul\u003e\n * \u003cli\u003eNot synchronized\u003c/li\u003e\n * \u003cli\u003eNot final\u003c/li\u003e\n * \u003cli\u003eSubclasses have direct access to character array\u003c/li\u003e\n * \u003cli\u003eAdditional methods\n *  \u003cul\u003e\n *   \u003cli\u003eappendWithSeparators - adds an array of values, with a separator\u003c/li\u003e\n *   \u003cli\u003eappendPadding - adds a length padding characters\u003c/li\u003e\n *   \u003cli\u003eappendFixedLength - adds a fixed width field to the builder\u003c/li\u003e\n *   \u003cli\u003etoCharArray/getChars - simpler ways to get a range of the character array\u003c/li\u003e\n *   \u003cli\u003edelete - delete char or string\u003c/li\u003e\n *   \u003cli\u003ereplace - search and replace for a char or string\u003c/li\u003e\n *   \u003cli\u003eleftString/rightString/midString - substring without exceptions\u003c/li\u003e\n *   \u003cli\u003econtains - whether the builder contains a char or string\u003c/li\u003e\n *   \u003cli\u003esize/clear/isEmpty - collections style API methods\u003c/li\u003e\n *  \u003c/ul\u003e\n * \u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cli\u003eViews\n *  \u003cul\u003e\n *   \u003cli\u003easTokenizer - uses the internal buffer as the source of a StrTokenizer\u003c/li\u003e\n *   \u003cli\u003easReader - uses the internal buffer as the source of a Reader\u003c/li\u003e\n *   \u003cli\u003easWriter - allows a Writer to write directly to the internal buffer\u003c/li\u003e\n *  \u003c/ul\u003e\n * \u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * The aim has been to provide an API that mimics very closely what StringBuffer\n * provides, but with additional methods. It should be noted that some edge cases,\n * with invalid indices or null input, have been altered - see individual methods.\n * The biggest of these changes is that by default, null will not output the text\n * \u0027null\u0027. This can be controlled by a property, {@link #setNullText(String)}.\n *\n * @author Stephen Colebourne\n * @since 2.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "CAPACITY"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * The extra capacity for new builders.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "buffer"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Internal data storage. "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Current size of the buffer. "
    },
    {
      "type": "field",
      "varNames": [
        "newLine"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " The new line. "
    },
    {
      "type": "field",
      "varNames": [
        "nullText"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " The null text. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilder()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Constructor that creates an empty builder initial capacity 32 characters.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilder(int)",
      "begin_line": 105,
      "end_line": 111,
      "comment": "\n     * Constructor that creates an empty builder the specified initial capacity.\n     *\n     * @param initialCapacity  the initial capacity, zero or less will be converted to 32\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 16)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilder(java.lang.String)",
      "begin_line": 119,
      "end_line": 127,
      "comment": "\n     * Constructor that creates a builder from the string, allocating\n     * 32 extra characters for growth.\n     *\n     * @param str  the string to copy, null treated as blank string\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 16)",
        "(line 121,col 9)-(line 126,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.getNewLineText()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * Gets the text to be appended when a new line is added.\n     *\n     * @return the new line text, null means use system default\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.setNewLineText(java.lang.String)",
      "begin_line": 145,
      "end_line": 148,
      "comment": "\n     * Sets the text to be appended when a new line is added.\n     *\n     * @param newLine  the new line text, null means use system default\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 31)",
        "(line 147,col 9)-(line 147,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.getNullText()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * Gets the text to be appended when null is added.\n     *\n     * @return the null text, null means no append\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.setNullText(java.lang.String)",
      "begin_line": 166,
      "end_line": 172,
      "comment": "\n     * Sets the text to be appended when null is added.\n     *\n     * @param nullText  the null text, null means no append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 33)",
        "(line 171,col 9)-(line 171,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.length()",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n     * Gets the length of the string builder.\n     *\n     * @return the length\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.setLength(int)",
      "begin_line": 192,
      "end_line": 208,
      "comment": "\n     * Updates the length of the builder by either dropping the last characters\n     * or adding filler of unicode zero.\n     *\n     * @param length  the length to set to, must be zero or positive\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the length is negative\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 207,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.capacity()",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\n     * Gets the current size of the internal character array buffer.\n     *\n     * @return the capacity\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.ensureCapacity(int)",
      "begin_line": 226,
      "end_line": 233,
      "comment": "\n     * Checks the capacity and ensures that it is at least the size specified.\n     *\n     * @param capacity  the capacity to ensure\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.minimizeCapacity()",
      "begin_line": 240,
      "end_line": 247,
      "comment": "\n     * Minimizes the capacity to the actual length of the string.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 246,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.size()",
      "begin_line": 258,
      "end_line": 260,
      "comment": "\n     * Gets the length of the string builder.\n     * \u003cp\u003e\n     * This method is the same as {@link #length()} and is provided to match the\n     * API of Collections.\n     *\n     * @return the length\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.isEmpty()",
      "begin_line": 270,
      "end_line": 272,
      "comment": "\n     * Checks is the string builder is empty (convenience Collections API style method).\n     * \u003cp\u003e\n     * This method is the same as checking {@link #length()} and is provided to match the\n     * API of Collections.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the size is \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.clear()",
      "begin_line": 285,
      "end_line": 288,
      "comment": "\n     * Clears the string builder (convenience Collections API style method).\n     * \u003cp\u003e\n     * This method does not reduce the size of the internal character buffer.\n     * To do that, call \u003ccode\u003eclear()\u003c/code\u003e followed by {@link #minimizeCapacity()}.\n     * \u003cp\u003e\n     * This method is the same as {@link #setLength(int)} called with zero\n     * and is provided to match the API of Collections.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 17)",
        "(line 287,col 9)-(line 287,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.charAt(int)",
      "begin_line": 300,
      "end_line": 305,
      "comment": "\n     * Gets the character at the specified index.\n     *\n     * @see #setCharAt(int, char)\n     * @see #deleteCharAt(int)\n     * @param index  the index to retrieve, must be valid\n     * @return the character at the index\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 304,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.setCharAt(int, char)",
      "begin_line": 317,
      "end_line": 323,
      "comment": "\n     * Sets the character at the specified index.\n     *\n     * @see #charAt(int)\n     * @see #deleteCharAt(int)\n     * @param index  the index to set\n     * @param ch  the new character\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 320,col 9)",
        "(line 321,col 9)-(line 321,col 27)",
        "(line 322,col 9)-(line 322,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteCharAt(int)",
      "begin_line": 334,
      "end_line": 340,
      "comment": "\n     * Deletes the character at the specified index.\n     *\n     * @see #charAt(int)\n     * @see #setCharAt(int, char)\n     * @param index  the index to delete\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 338,col 40)",
        "(line 339,col 9)-(line 339,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.toCharArray()",
      "begin_line": 348,
      "end_line": 355,
      "comment": "\n     * Copies the builder\u0027s character array into a new character array.\n     * \n     * @return a new array that represents the contents of the builder\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 351,col 9)",
        "(line 352,col 9)-(line 352,col 38)",
        "(line 353,col 9)-(line 353,col 52)",
        "(line 354,col 9)-(line 354,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.toCharArray(int, int)",
      "begin_line": 367,
      "end_line": 376,
      "comment": "\n     * Copies part of the builder\u0027s character array into a new character array.\n     * \n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except that\n     *  if too large it is treated as end of string\n     * @return a new array that holds part of the contents of the builder\n     * @throws IndexOutOfBoundsException if startIndex is invalid,\n     *  or if endIndex is invalid (but endIndex greater than size is valid)\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 55)",
        "(line 369,col 9)-(line 369,col 40)",
        "(line 370,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 373,col 37)",
        "(line 374,col 9)-(line 374,col 60)",
        "(line 375,col 9)-(line 375,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.getChars(char[])",
      "begin_line": 384,
      "end_line": 391,
      "comment": "\n     * Copies the character array into the specified array.\n     * \n     * @param destination  the destination array, null will cause an array to be created\n     * @return the input array, unless that was null or too small\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 27)",
        "(line 386,col 9)-(line 388,col 9)",
        "(line 389,col 9)-(line 389,col 57)",
        "(line 390,col 9)-(line 390,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.getChars(int, int, char[], int)",
      "begin_line": 403,
      "end_line": 414,
      "comment": "\n     * Copies the character array into the specified array.\n     *\n     * @param startIndex  first index to copy, inclusive, must be valid\n     * @param endIndex  last index, exclusive, must be valid\n     * @param destination  the destination array, must not be null or too small\n     * @param destinationIndex  the index to start copying in destination\n     * @throws NullPointerException if the array is null\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 406,col 9)",
        "(line 407,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 412,col 9)",
        "(line 413,col 9)-(line 413,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendNewLine()",
      "begin_line": 426,
      "end_line": 432,
      "comment": "\n     * Appends the new line string to this string builder.\n     * \u003cp\u003e\n     * The new line string can be altered using {@link #setNewLineText(String)}.\n     * This might be used to force the output to always use Unix line endings\n     * even when on Windows.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 430,col 9)",
        "(line 431,col 9)-(line 431,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendNull()",
      "begin_line": 439,
      "end_line": 444,
      "comment": "\n     * Appends the text representing \u003ccode\u003enull\u003c/code\u003e to this string builder.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 442,col 9)",
        "(line 443,col 9)-(line 443,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(java.lang.Object)",
      "begin_line": 453,
      "end_line": 458,
      "comment": "\n     * Appends an object to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param obj  the object to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 456,col 9)",
        "(line 457,col 9)-(line 457,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(java.lang.String)",
      "begin_line": 467,
      "end_line": 479,
      "comment": "\n     * Appends a string to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 470,col 9)",
        "(line 471,col 9)-(line 471,col 34)",
        "(line 472,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 478,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(java.lang.String, int, int)",
      "begin_line": 490,
      "end_line": 507,
      "comment": "\n     * Appends part of a string to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 493,col 9)",
        "(line 494,col 9)-(line 496,col 9)",
        "(line 497,col 9)-(line 499,col 9)",
        "(line 500,col 9)-(line 505,col 9)",
        "(line 506,col 9)-(line 506,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(java.lang.StringBuffer)",
      "begin_line": 516,
      "end_line": 528,
      "comment": "\n     * Appends a string buffer to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string buffer to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 519,col 9)",
        "(line 520,col 9)-(line 520,col 34)",
        "(line 521,col 9)-(line 526,col 9)",
        "(line 527,col 9)-(line 527,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(java.lang.StringBuffer, int, int)",
      "begin_line": 539,
      "end_line": 556,
      "comment": "\n     * Appends part of a string buffer to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 540,col 9)-(line 542,col 9)",
        "(line 543,col 9)-(line 545,col 9)",
        "(line 546,col 9)-(line 548,col 9)",
        "(line 549,col 9)-(line 554,col 9)",
        "(line 555,col 9)-(line 555,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(org.apache.commons.lang.text.StrBuilder)",
      "begin_line": 565,
      "end_line": 577,
      "comment": "\n     * Appends another string builder to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string builder to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 568,col 9)",
        "(line 569,col 9)-(line 569,col 34)",
        "(line 570,col 9)-(line 575,col 9)",
        "(line 576,col 9)-(line 576,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(org.apache.commons.lang.text.StrBuilder, int, int)",
      "begin_line": 588,
      "end_line": 605,
      "comment": "\n     * Appends part of a string builder to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 589,col 9)-(line 591,col 9)",
        "(line 592,col 9)-(line 594,col 9)",
        "(line 595,col 9)-(line 597,col 9)",
        "(line 598,col 9)-(line 603,col 9)",
        "(line 604,col 9)-(line 604,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(char[])",
      "begin_line": 614,
      "end_line": 626,
      "comment": "\n     * Appends a char array to the string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param chars  the char array to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 615,col 9)-(line 617,col 9)",
        "(line 618,col 9)-(line 618,col 34)",
        "(line 619,col 9)-(line 624,col 9)",
        "(line 625,col 9)-(line 625,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(char[], int, int)",
      "begin_line": 637,
      "end_line": 654,
      "comment": "\n     * Appends a char array to the string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param chars  the char array to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 638,col 9)-(line 640,col 9)",
        "(line 641,col 9)-(line 643,col 9)",
        "(line 644,col 9)-(line 646,col 9)",
        "(line 647,col 9)-(line 652,col 9)",
        "(line 653,col 9)-(line 653,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(boolean)",
      "begin_line": 662,
      "end_line": 678,
      "comment": "\n     * Appends a boolean value to the string builder.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 663,col 9)-(line 676,col 9)",
        "(line 677,col 9)-(line 677,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(char)",
      "begin_line": 686,
      "end_line": 691,
      "comment": "\n     * Appends a char value to the string builder.\n     *\n     * @param ch  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 687,col 9)-(line 687,col 27)",
        "(line 688,col 9)-(line 688,col 32)",
        "(line 689,col 9)-(line 689,col 28)",
        "(line 690,col 9)-(line 690,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(int)",
      "begin_line": 699,
      "end_line": 701,
      "comment": "\n     * Appends an int value to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 700,col 9)-(line 700,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(long)",
      "begin_line": 709,
      "end_line": 711,
      "comment": "\n     * Appends a long value to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 710,col 9)-(line 710,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(float)",
      "begin_line": 719,
      "end_line": 721,
      "comment": "\n     * Appends a float value to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 720,col 9)-(line 720,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(double)",
      "begin_line": 729,
      "end_line": 731,
      "comment": "\n     * Appends a double value to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 730,col 9)-(line 730,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendWithSeparators(java.lang.Object[], java.lang.String)",
      "begin_line": 744,
      "end_line": 754,
      "comment": "\n     * Appends an array placing separators between each value, but\n     * not before the first or after the last.\n     * Appending a null array will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param array  the array to append\n     * @param separator  the separator to use, null means no separator\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 745,col 9)-(line 752,col 9)",
        "(line 753,col 9)-(line 753,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendWithSeparators(java.util.Collection, java.lang.String)",
      "begin_line": 766,
      "end_line": 778,
      "comment": "\n     * Appends a collection placing separators between each value, but\n     * not before the first or after the last.\n     * Appending a null collection will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param coll  the collection to append\n     * @param separator  the separator to use, null means no separator\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 767,col 9)-(line 776,col 9)",
        "(line 777,col 9)-(line 777,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendWithSeparators(java.util.Iterator, java.lang.String)",
      "begin_line": 790,
      "end_line": 801,
      "comment": "\n     * Appends an iterator placing separators between each value, but\n     * not before the first or after the last.\n     * Appending a null iterator will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param it  the iterator to append\n     * @param separator  the separator to use, null means no separator\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 791,col 9)-(line 799,col 9)",
        "(line 800,col 9)-(line 800,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendPadding(int, char)",
      "begin_line": 811,
      "end_line": 819,
      "comment": "\n     * Appends the pad character to the builder the specified number of times.\n     * \n     * @param length  the length to append, negative means no append\n     * @param padChar  the character to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 812,col 9)-(line 817,col 9)",
        "(line 818,col 9)-(line 818,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadLeft(java.lang.Object, int, char)",
      "begin_line": 833,
      "end_line": 850,
      "comment": "\n     * Appends an object to the builder padding on the left to a fixed width.\n     * The \u003ccode\u003etoString\u003c/code\u003e of the object is used.\n     * If the object is larger than the length, the left hand side is lost.\n     * If the object is null, the null text value is used.\n     * \n     * @param obj  the object to append, null uses null text\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 834,col 9)-(line 848,col 9)",
        "(line 849,col 9)-(line 849,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadLeft(int, int, char)",
      "begin_line": 862,
      "end_line": 864,
      "comment": "\n     * Appends an object to the builder padding on the left to a fixed width.\n     * The \u003ccode\u003eString.valueOf\u003c/code\u003e of the \u003ccode\u003eint\u003c/code\u003e value is used.\n     * If the formatted value is larger than the length, the left hand side is lost.\n     * \n     * @param value  the value to append\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 863,col 9)-(line 863,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadRight(java.lang.Object, int, char)",
      "begin_line": 877,
      "end_line": 894,
      "comment": "\n     * Appends an object to the builder padding on the right to a fixed length.\n     * The \u003ccode\u003etoString\u003c/code\u003e of the object is used.\n     * If the object is larger than the length, the right hand side is lost.\n     * If the object is null, null text value is used.\n     * \n     * @param obj  the object to append, null uses null text\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 878,col 9)-(line 892,col 9)",
        "(line 893,col 9)-(line 893,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadRight(int, int, char)",
      "begin_line": 906,
      "end_line": 908,
      "comment": "\n     * Appends an object to the builder padding on the right to a fixed length.\n     * The \u003ccode\u003eString.valueOf\u003c/code\u003e of the \u003ccode\u003eint\u003c/code\u003e value is used.\n     * If the object is larger than the length, the right hand side is lost.\n     * \n     * @param value  the value to append\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 907,col 9)-(line 907,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, java.lang.Object)",
      "begin_line": 920,
      "end_line": 925,
      "comment": "\n     * Inserts the string representation of an object into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param obj  the object to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 921,col 9)-(line 923,col 9)",
        "(line 924,col 9)-(line 924,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, java.lang.String)",
      "begin_line": 936,
      "end_line": 950,
      "comment": "\n     * Inserts the string into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param str  the string to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 937,col 9)-(line 937,col 29)",
        "(line 938,col 9)-(line 940,col 9)",
        "(line 941,col 9)-(line 941,col 54)",
        "(line 942,col 9)-(line 948,col 9)",
        "(line 949,col 9)-(line 949,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, char[])",
      "begin_line": 961,
      "end_line": 974,
      "comment": "\n     * Inserts the character array into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param chars  the char array to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 962,col 9)-(line 962,col 29)",
        "(line 963,col 9)-(line 965,col 9)",
        "(line 966,col 9)-(line 966,col 31)",
        "(line 967,col 9)-(line 972,col 9)",
        "(line 973,col 9)-(line 973,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, char[], int, int)",
      "begin_line": 987,
      "end_line": 1005,
      "comment": "\n     * Inserts part of the character array into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param chars  the char array to insert\n     * @param offset  the offset into the character array to start at, must be valid\n     * @param length  the length of the character array part to copy, must be positive\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 988,col 9)-(line 988,col 29)",
        "(line 989,col 9)-(line 991,col 9)",
        "(line 992,col 9)-(line 994,col 9)",
        "(line 995,col 9)-(line 997,col 9)",
        "(line 998,col 9)-(line 1003,col 9)",
        "(line 1004,col 9)-(line 1004,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, boolean)",
      "begin_line": 1015,
      "end_line": 1036,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1016,col 9)-(line 1016,col 29)",
        "(line 1017,col 9)-(line 1034,col 9)",
        "(line 1035,col 9)-(line 1035,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, char)",
      "begin_line": 1046,
      "end_line": 1053,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1047,col 9)-(line 1047,col 29)",
        "(line 1048,col 9)-(line 1048,col 33)",
        "(line 1049,col 9)-(line 1049,col 73)",
        "(line 1050,col 9)-(line 1050,col 30)",
        "(line 1051,col 9)-(line 1051,col 15)",
        "(line 1052,col 9)-(line 1052,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, int)",
      "begin_line": 1063,
      "end_line": 1065,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1064,col 9)-(line 1064,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, long)",
      "begin_line": 1075,
      "end_line": 1077,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1076,col 9)-(line 1076,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, float)",
      "begin_line": 1087,
      "end_line": 1089,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1088,col 9)-(line 1088,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, double)",
      "begin_line": 1099,
      "end_line": 1101,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1100,col 9)-(line 1100,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteImpl(int, int, int)",
      "begin_line": 1112,
      "end_line": 1115,
      "comment": "\n     * Internal method to delete a range without validation.\n     *\n     * @param startIndex  the start index, must be valid\n     * @param endIndex  the end index (exclusive), must be valid\n     * @param len  the length, must be valid\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 1113,col 9)-(line 1113,col 80)",
        "(line 1114,col 9)-(line 1114,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.delete(int, int)",
      "begin_line": 1126,
      "end_line": 1133,
      "comment": "\n     * Deletes the characters between the two specified indices.\n     *\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1127,col 9)-(line 1127,col 55)",
        "(line 1128,col 9)-(line 1128,col 40)",
        "(line 1129,col 9)-(line 1131,col 9)",
        "(line 1132,col 9)-(line 1132,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteAll(char)",
      "begin_line": 1142,
      "end_line": 1157,
      "comment": "\n     * Deletes the character wherever it occurs in the builder.\n     *\n     * @param ch  the character to delete\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1143,col 9)-(line 1155,col 9)",
        "(line 1156,col 9)-(line 1156,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteFirst(char)",
      "begin_line": 1165,
      "end_line": 1173,
      "comment": "\n     * Deletes the character wherever it occurs in the builder.\n     *\n     * @param ch  the character to delete\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1166,col 9)-(line 1171,col 9)",
        "(line 1172,col 9)-(line 1172,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteAll(java.lang.String)",
      "begin_line": 1182,
      "end_line": 1192,
      "comment": "\n     * Deletes the string wherever it occurs in the builder.\n     *\n     * @param str  the string to delete, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1183,col 9)-(line 1183,col 51)",
        "(line 1184,col 9)-(line 1190,col 9)",
        "(line 1191,col 9)-(line 1191,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteFirst(java.lang.String)",
      "begin_line": 1200,
      "end_line": 1209,
      "comment": "\n     * Deletes the string wherever it occurs in the builder.\n     *\n     * @param str  the string to delete, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1201,col 9)-(line 1201,col 51)",
        "(line 1202,col 9)-(line 1207,col 9)",
        "(line 1208,col 9)-(line 1208,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteAll(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 1222,
      "end_line": 1224,
      "comment": "\n     * Deletes all parts of the builder that the matcher matches.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced deletion behaviour.\n     * For example you could write a matcher to delete all occurances\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1223,col 9)-(line 1223,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteFirst(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 1236,
      "end_line": 1238,
      "comment": "\n     * Deletes the first match within the builder using the specified matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced deletion behaviour.\n     * For example you could write a matcher to delete\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1237,col 9)-(line 1237,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceImpl(int, int, int, java.lang.String, int)",
      "begin_line": 1251,
      "end_line": 1261,
      "comment": "\n     * Internal method to delete a range without validation.\n     *\n     * @param startIndex  the start index, must be valid\n     * @param endIndex  the end index (exclusive), must be valid\n     * @param removeLen  the length to remove (endIndex - startIndex), must be valid\n     * @param insertStr  the string to replace with, null means delete range\n     * @param insertLen  the length of the insert string, must be valid\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 1252,col 9)-(line 1252,col 51)",
        "(line 1253,col 9)-(line 1257,col 9)",
        "(line 1258,col 9)-(line 1260,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replace(int, int, java.lang.String)",
      "begin_line": 1274,
      "end_line": 1279,
      "comment": "\n     * Replaces a portion of the string builder with another string.\n     * The length of the inserted string does not have to match the removed length.\n     *\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @param replaceStr  the string to replace with, null means delete range\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1275,col 9)-(line 1275,col 55)",
        "(line 1276,col 9)-(line 1276,col 71)",
        "(line 1277,col 9)-(line 1277,col 88)",
        "(line 1278,col 9)-(line 1278,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceAll(char, char)",
      "begin_line": 1290,
      "end_line": 1299,
      "comment": "\n     * Replaces the search character with the replace character\n     * throughout the builder.\n     *\n     * @param search  the search character\n     * @param replace  the replace character\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1291,col 9)-(line 1297,col 9)",
        "(line 1298,col 9)-(line 1298,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceFirst(char, char)",
      "begin_line": 1309,
      "end_line": 1319,
      "comment": "\n     * Replaces the first instance of the search character with the\n     * replace character in the builder.\n     *\n     * @param search  the search character\n     * @param replace  the replace character\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1310,col 9)-(line 1317,col 9)",
        "(line 1318,col 9)-(line 1318,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceAll(java.lang.String, java.lang.String)",
      "begin_line": 1329,
      "end_line": 1340,
      "comment": "\n     * Replaces the search string with the replace string throughout the builder.\n     *\n     * @param searchStr  the search string, null causes no action to occur\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1330,col 9)-(line 1330,col 69)",
        "(line 1331,col 9)-(line 1338,col 9)",
        "(line 1339,col 9)-(line 1339,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceFirst(java.lang.String, java.lang.String)",
      "begin_line": 1349,
      "end_line": 1359,
      "comment": "\n     * Replaces the first instance of the search string with the replace string.\n     *\n     * @param searchStr  the search string, null causes no action to occur\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1350,col 9)-(line 1350,col 69)",
        "(line 1351,col 9)-(line 1357,col 9)",
        "(line 1358,col 9)-(line 1358,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceAll(org.apache.commons.lang.text.StrMatcher, java.lang.String)",
      "begin_line": 1373,
      "end_line": 1375,
      "comment": "\n     * Replaces all matches within the builder with the replace string.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced replace behaviour.\n     * For example you could write a matcher to replace all occurances\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1374,col 9)-(line 1374,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceFirst(org.apache.commons.lang.text.StrMatcher, java.lang.String)",
      "begin_line": 1388,
      "end_line": 1390,
      "comment": "\n     * Replaces the first match within the builder with the replace string.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced replace behaviour.\n     * For example you could write a matcher to replace\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1389,col 9)-(line 1389,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replace(org.apache.commons.lang.text.StrMatcher, java.lang.String, int, int, int)",
      "begin_line": 1409,
      "end_line": 1414,
      "comment": "\n     * Advanced search and replaces within the builder using a matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced behaviour.\n     * For example you could write a matcher to delete all occurances\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the string to replace the match with, null is a delete\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @param replaceCount  the number of times to replace, -1 for replace all\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if start index is invalid\n     ",
      "child_ranges": [
        "(line 1412,col 9)-(line 1412,col 55)",
        "(line 1413,col 9)-(line 1413,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceImpl(org.apache.commons.lang.text.StrMatcher, java.lang.String, int, int, int)",
      "begin_line": 1431,
      "end_line": 1451,
      "comment": "\n     * Replaces within the builder using a matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced behaviour.\n     * For example you could write a matcher to delete all occurances\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the string to replace the match with, null is a delete\n     * @param from  the start index, must be valid\n     * @param to  the end index (exclusive), must be valid\n     * @param replaceCount  the number of times to replace, -1 for replace all\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 1434,col 9)-(line 1436,col 9)",
        "(line 1437,col 9)-(line 1437,col 72)",
        "(line 1438,col 9)-(line 1438,col 28)",
        "(line 1439,col 9)-(line 1449,col 9)",
        "(line 1450,col 9)-(line 1450,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.reverse()",
      "begin_line": 1459,
      "end_line": 1472,
      "comment": "\n     * Reverses the string builder placing each character in the opposite index.\n     * \n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1460,col 9)-(line 1462,col 9)",
        "(line 1464,col 9)-(line 1464,col 28)",
        "(line 1465,col 9)-(line 1465,col 28)",
        "(line 1466,col 9)-(line 1470,col 9)",
        "(line 1471,col 9)-(line 1471,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.trim()",
      "begin_line": 1481,
      "end_line": 1501,
      "comment": "\n     * Trims the builder by removing characters less than or equal to a space\n     * from the beginning and end.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1482,col 9)-(line 1484,col 9)",
        "(line 1485,col 9)-(line 1485,col 23)",
        "(line 1486,col 9)-(line 1486,col 28)",
        "(line 1487,col 9)-(line 1487,col 20)",
        "(line 1488,col 9)-(line 1490,col 9)",
        "(line 1491,col 9)-(line 1493,col 9)",
        "(line 1494,col 9)-(line 1496,col 9)",
        "(line 1497,col 9)-(line 1499,col 9)",
        "(line 1500,col 9)-(line 1500,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.startsWith(java.lang.String)",
      "begin_line": 1512,
      "end_line": 1529,
      "comment": "\n     * Checks whether this builder starts with the specified string.\n     * \u003cp\u003e\n     * Note that this method handles null input quietly, unlike String.\n     * \n     * @param str  the string to search for, null returns false\n     * @return true if the builder starts with the string\n     ",
      "child_ranges": [
        "(line 1513,col 9)-(line 1515,col 9)",
        "(line 1516,col 9)-(line 1516,col 31)",
        "(line 1517,col 9)-(line 1519,col 9)",
        "(line 1520,col 9)-(line 1522,col 9)",
        "(line 1523,col 9)-(line 1527,col 9)",
        "(line 1528,col 9)-(line 1528,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.endsWith(java.lang.String)",
      "begin_line": 1539,
      "end_line": 1557,
      "comment": "\n     * Checks whether this builder ends with the specified string.\n     * \u003cp\u003e\n     * Note that this method handles null input quietly, unlike String.\n     * \n     * @param str  the string to search for, null returns false\n     * @return true if the builder ends with the string\n     ",
      "child_ranges": [
        "(line 1540,col 9)-(line 1542,col 9)",
        "(line 1543,col 9)-(line 1543,col 31)",
        "(line 1544,col 9)-(line 1546,col 9)",
        "(line 1547,col 9)-(line 1549,col 9)",
        "(line 1550,col 9)-(line 1550,col 29)",
        "(line 1551,col 9)-(line 1555,col 9)",
        "(line 1556,col 9)-(line 1556,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.substring(int)",
      "begin_line": 1567,
      "end_line": 1569,
      "comment": "\n     * Extracts a portion of this string builder as a string.\n     * \n     * @param start  the start index, inclusive, must be valid\n     * @return the new string\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1568,col 9)-(line 1568,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.substring(int, int)",
      "begin_line": 1584,
      "end_line": 1587,
      "comment": "\n     * Extracts a portion of this string builder as a string.\n     * \u003cp\u003e\n     * Note: This method treats an endIndex greater than the length of the\n     * builder as equal to the length of the builder, and continues\n     * without error, unlike StringBuffer or String.\n     * \n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @return the new string\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1585,col 9)-(line 1585,col 55)",
        "(line 1586,col 9)-(line 1586,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.leftString(int)",
      "begin_line": 1601,
      "end_line": 1609,
      "comment": "\n     * Extracts the leftmost characters from the string builder without\n     * throwing an exception.\n     * \u003cp\u003e\n     * This method extracts the left \u003ccode\u003elength\u003c/code\u003e characters from\n     * the builder. If this many characters are not available, the whole\n     * builder is returned. Thus the returned string may be shorter than the\n     * length requested.\n     * \n     * @param length  the number of characters to extract, negative returns empty string\n     * @return the new string\n     ",
      "child_ranges": [
        "(line 1602,col 9)-(line 1608,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.rightString(int)",
      "begin_line": 1623,
      "end_line": 1631,
      "comment": "\n     * Extracts the rightmost characters from the string builder without\n     * throwing an exception.\n     * \u003cp\u003e\n     * This method extracts the right \u003ccode\u003elength\u003c/code\u003e characters from\n     * the builder. If this many characters are not available, the whole\n     * builder is returned. Thus the returned string may be shorter than the\n     * length requested.\n     * \n     * @param length  the number of characters to extract, negative returns empty string\n     * @return the new string\n     ",
      "child_ranges": [
        "(line 1624,col 9)-(line 1630,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.midString(int, int)",
      "begin_line": 1649,
      "end_line": 1661,
      "comment": "\n     * Extracts some characters from the middle of the string builder without\n     * throwing an exception.\n     * \u003cp\u003e\n     * This method extracts \u003ccode\u003elength\u003c/code\u003e characters from the builder\n     * at the specified index.\n     * If the index is negative it is treated as zero.\n     * If the index is greater than the builder size, it is treated as the builder size.\n     * If the length is negative, the empty string is returned.\n     * If insufficient characters are available in the builder, as much as possible is returned.\n     * Thus the returned string may be shorter than the length requested.\n     * \n     * @param index  the index to start at, negative means zero\n     * @param length  the number of characters to extract, negative returns empty string\n     * @return the new string\n     ",
      "child_ranges": [
        "(line 1650,col 9)-(line 1652,col 9)",
        "(line 1653,col 9)-(line 1655,col 9)",
        "(line 1656,col 9)-(line 1660,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.contains(char)",
      "begin_line": 1670,
      "end_line": 1678,
      "comment": "\n     * Checks if the string builder contains the specified char.\n     *\n     * @param ch  the character to find\n     * @return true if the builder contains the character\n     ",
      "child_ranges": [
        "(line 1671,col 9)-(line 1671,col 32)",
        "(line 1672,col 9)-(line 1676,col 9)",
        "(line 1677,col 9)-(line 1677,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.contains(java.lang.String)",
      "begin_line": 1686,
      "end_line": 1688,
      "comment": "\n     * Checks if the string builder contains the specified string.\n     *\n     * @param str  the string to find\n     * @return true if the builder contains the string\n     ",
      "child_ranges": [
        "(line 1687,col 9)-(line 1687,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.contains(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 1701,
      "end_line": 1703,
      "comment": "\n     * Checks if the string builder contains a string matched using the\n     * specified matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to search for the character\n     * \u0027a\u0027 followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @return true if the matcher finds a match in the builder\n     ",
      "child_ranges": [
        "(line 1702,col 9)-(line 1702,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.indexOf(char)",
      "begin_line": 1712,
      "end_line": 1714,
      "comment": "\n     * Searches the string builder to find the first reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @return the first index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1713,col 9)-(line 1713,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.indexOf(char, int)",
      "begin_line": 1723,
      "end_line": 1735,
      "comment": "\n     * Searches the string builder to find the first reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the first index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1724,col 9)-(line 1724,col 55)",
        "(line 1725,col 9)-(line 1727,col 9)",
        "(line 1728,col 9)-(line 1728,col 32)",
        "(line 1729,col 9)-(line 1733,col 9)",
        "(line 1734,col 9)-(line 1734,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.indexOf(java.lang.String)",
      "begin_line": 1745,
      "end_line": 1747,
      "comment": "\n     * Searches the string builder to find the first reference to the specified string.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @return the first index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1746,col 9)-(line 1746,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.indexOf(java.lang.String, int)",
      "begin_line": 1759,
      "end_line": 1785,
      "comment": "\n     * Searches the string builder to find the first reference to the specified\n     * string starting searching from the given index.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the first index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1760,col 9)-(line 1760,col 55)",
        "(line 1761,col 9)-(line 1763,col 9)",
        "(line 1764,col 9)-(line 1764,col 34)",
        "(line 1765,col 9)-(line 1767,col 9)",
        "(line 1768,col 9)-(line 1770,col 9)",
        "(line 1771,col 9)-(line 1773,col 9)",
        "(line 1774,col 9)-(line 1774,col 32)",
        "(line 1775,col 9)-(line 1783,col 9)",
        "(line 1784,col 9)-(line 1784,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.indexOf(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 1797,
      "end_line": 1799,
      "comment": "\n     * Searches the string builder using the matcher to find the first match.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @return the first index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1798,col 9)-(line 1798,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.indexOf(org.apache.commons.lang.text.StrMatcher, int)",
      "begin_line": 1813,
      "end_line": 1826,
      "comment": "\n     * Searches the string builder using the matcher to find the first\n     * match searching from the given index.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the first index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1814,col 9)-(line 1814,col 55)",
        "(line 1815,col 9)-(line 1817,col 9)",
        "(line 1818,col 9)-(line 1818,col 23)",
        "(line 1819,col 9)-(line 1819,col 28)",
        "(line 1820,col 9)-(line 1824,col 9)",
        "(line 1825,col 9)-(line 1825,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.lastIndexOf(char)",
      "begin_line": 1835,
      "end_line": 1837,
      "comment": "\n     * Searches the string builder to find the last reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @return the last index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1836,col 9)-(line 1836,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.lastIndexOf(char, int)",
      "begin_line": 1846,
      "end_line": 1857,
      "comment": "\n     * Searches the string builder to find the last reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the last index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1847,col 9)-(line 1847,col 66)",
        "(line 1848,col 9)-(line 1850,col 9)",
        "(line 1851,col 9)-(line 1855,col 9)",
        "(line 1856,col 9)-(line 1856,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.lastIndexOf(java.lang.String)",
      "begin_line": 1867,
      "end_line": 1869,
      "comment": "\n     * Searches the string builder to find the last reference to the specified string.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @return the last index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1868,col 9)-(line 1868,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.lastIndexOf(java.lang.String, int)",
      "begin_line": 1881,
      "end_line": 1906,
      "comment": "\n     * Searches the string builder to find the last reference to the specified\n     * string starting searching from the given index.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the last index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1882,col 9)-(line 1882,col 66)",
        "(line 1883,col 9)-(line 1885,col 9)",
        "(line 1886,col 9)-(line 1886,col 34)",
        "(line 1887,col 9)-(line 1904,col 9)",
        "(line 1905,col 9)-(line 1905,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.lastIndexOf(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 1918,
      "end_line": 1920,
      "comment": "\n     * Searches the string builder using the matcher to find the last match.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @return the last index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1919,col 9)-(line 1919,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.lastIndexOf(org.apache.commons.lang.text.StrMatcher, int)",
      "begin_line": 1934,
      "end_line": 1947,
      "comment": "\n     * Searches the string builder using the matcher to find the last\n     * match searching from the given index.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the last index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 1935,col 9)-(line 1935,col 66)",
        "(line 1936,col 9)-(line 1938,col 9)",
        "(line 1939,col 9)-(line 1939,col 28)",
        "(line 1940,col 9)-(line 1940,col 38)",
        "(line 1941,col 9)-(line 1945,col 9)",
        "(line 1946,col 9)-(line 1946,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.asTokenizer()",
      "begin_line": 1982,
      "end_line": 1984,
      "comment": "\n     * Creates a tokenizer that can tokenize the contents of this builder.\n     * \u003cp\u003e\n     * This method allows the contents of this builder to be tokenized.\n     * The tokenizer will be setup by default to tokenize on space, tab,\n     * newline and formfeed (as per StringTokenizer). These values can be\n     * changed on the tokenizer class, before retrieving the tokens.\n     * \u003cp\u003e\n     * The returned tokenizer is linked to this builder. You may intermix\n     * calls to the buider and tokenizer within certain limits, however\n     * there is no synchronization. Once the tokenizer has been used once,\n     * it must be {@link StrTokenizer#reset() reset} to pickup the latest\n     * changes in the builder. For example:\n     * \u003cpre\u003e\n     * StrBuilder b \u003d new StrBuilder();\n     * b.append(\"a b \");\n     * StrTokenizer t \u003d b.asTokenizer();\n     * String[] tokens1 \u003d t.getTokenArray();  // returns a,b\n     * b.append(\"c d \");\n     * String[] tokens2 \u003d t.getTokenArray();  // returns a,b (c and d ignored)\n     * t.reset();              // reset causes builder changes to be picked up\n     * String[] tokens3 \u003d t.getTokenArray();  // returns a,b,c,d\n     * \u003c/pre\u003e\n     * In addition to simply intermixing appends and tokenization, you can also\n     * call the set methods on the tokenizer to alter how it tokenizes. Just\n     * remember to call reset when you want to pickup builder changes.\n     * \u003cp\u003e\n     * Calling {@link StrTokenizer#reset(String)} or {@link StrTokenizer#reset(char[])}\n     * with a non-null value will break the link with the builder.\n     *\n     * @return a tokenizer that is linked to this builder\n     ",
      "child_ranges": [
        "(line 1983,col 9)-(line 1983,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.asReader()",
      "begin_line": 2006,
      "end_line": 2008,
      "comment": "\n     * Gets the contents of this builder as a Reader.\n     * \u003cp\u003e\n     * This method allows the contents of the builder to be read\n     * using any standard method that expects a Reader.\n     * \u003cp\u003e\n     * To use, simply create a \u003ccode\u003eStrBuilder\u003c/code\u003e, populate it with\n     * data, call \u003ccode\u003easReader\u003c/code\u003e, and then read away.\n     * \u003cp\u003e\n     * The internal character array is shared between the builder and the reader.\n     * This allows you to append to the builder after creating the reader,\n     * and the changes will be picked up.\n     * Note however, that no synchronization occurs, so you must perform\n     * all operations with the builder and the reader in one thread.\n     * \u003cp\u003e\n     * The returned reader supports marking, and ignores the flush method.\n     *\n     * @return a reader that reads from this builder\n     ",
      "child_ranges": [
        "(line 2007,col 9)-(line 2007,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.asWriter()",
      "begin_line": 2031,
      "end_line": 2033,
      "comment": "\n     * Gets this builder as a Writer that can be written to.\n     * \u003cp\u003e\n     * This method allows you to populate the contents of the builder\n     * using any standard method that takes a Writer.\n     * \u003cp\u003e\n     * To use, simply create a \u003ccode\u003eStrBuilder\u003c/code\u003e,\n     * call \u003ccode\u003easWriter\u003c/code\u003e, and populate away. The data is available\n     * at any time using the methods of the \u003ccode\u003eStrBuilder\u003c/code\u003e.\n     * \u003cp\u003e\n     * The internal character array is shared between the builder and the writer.\n     * This allows you to intermix calls that append to the builder and\n     * write using the writer and the changes will be occur correctly.\n     * Note however, that no synchronization occurs, so you must perform\n     * all operations with the builder and the writer in one thread.\n     * \u003cp\u003e\n     * The returned writer ignores the close and flush methods.\n     *\n     * @return a writer that populates this builder\n     ",
      "child_ranges": [
        "(line 2032,col 9)-(line 2032,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.equalsIgnoreCase(org.apache.commons.lang.text.StrBuilder)",
      "begin_line": 2073,
      "end_line": 2090,
      "comment": "\n     * Checks the contents of this builder against another to see if they\n     * contain the same character content ignoring case.\n     *\n     * @param other  the object to check, null returns false\n     * @return true if the builders contain the same characters in the same order\n     ",
      "child_ranges": [
        "(line 2074,col 9)-(line 2076,col 9)",
        "(line 2077,col 9)-(line 2079,col 9)",
        "(line 2080,col 9)-(line 2080,col 37)",
        "(line 2081,col 9)-(line 2081,col 39)",
        "(line 2082,col 9)-(line 2088,col 9)",
        "(line 2089,col 9)-(line 2089,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.equals(org.apache.commons.lang.text.StrBuilder)",
      "begin_line": 2099,
      "end_line": 2114,
      "comment": "\n     * Checks the contents of this builder against another to see if they\n     * contain the same character content.\n     *\n     * @param other  the object to check, null returns false\n     * @return true if the builders contain the same characters in the same order\n     ",
      "child_ranges": [
        "(line 2100,col 9)-(line 2102,col 9)",
        "(line 2103,col 9)-(line 2105,col 9)",
        "(line 2106,col 9)-(line 2106,col 37)",
        "(line 2107,col 9)-(line 2107,col 39)",
        "(line 2108,col 9)-(line 2112,col 9)",
        "(line 2113,col 9)-(line 2113,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.equals(java.lang.Object)",
      "begin_line": 2123,
      "end_line": 2128,
      "comment": "\n     * Checks the contents of this builder against another to see if they\n     * contain the same character content.\n     *\n     * @param obj  the object to check, null returns false\n     * @return true if the builders contain the same characters in the same order\n     ",
      "child_ranges": [
        "(line 2124,col 9)-(line 2126,col 9)",
        "(line 2127,col 9)-(line 2127,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.hashCode()",
      "begin_line": 2135,
      "end_line": 2142,
      "comment": "\n     * Gets a suitable hash code for this builder.\n     *\n     * @return a hash code\n     ",
      "child_ranges": [
        "(line 2136,col 9)-(line 2136,col 28)",
        "(line 2137,col 9)-(line 2137,col 21)",
        "(line 2138,col 9)-(line 2140,col 9)",
        "(line 2141,col 9)-(line 2141,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.toString()",
      "begin_line": 2154,
      "end_line": 2156,
      "comment": "\n     * Gets a String version of the string builder, creating a new instance\n     * each time the method is called.\n     * \u003cp\u003e\n     * Note that unlike StringBuffer, the string version returned is\n     * independent of the string builder.\n     *\n     * @return the builder as a String\n     ",
      "child_ranges": [
        "(line 2155,col 9)-(line 2155,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.toStringBuffer()",
      "begin_line": 2164,
      "end_line": 2166,
      "comment": "\n     * Gets a StringBuffer version of the string builder, creating a\n     * new instance each time the method is called.\n     *\n     * @return the builder as a StringBuffer\n     ",
      "child_ranges": [
        "(line 2165,col 9)-(line 2165,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.validateRange(int, int)",
      "begin_line": 2178,
      "end_line": 2189,
      "comment": "\n     * Validates parameters defining a range of the builder.\n     * \n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @return the new string\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 2179,col 9)-(line 2181,col 9)",
        "(line 2182,col 9)-(line 2184,col 9)",
        "(line 2185,col 9)-(line 2187,col 9)",
        "(line 2188,col 9)-(line 2188,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.validateIndex(int)",
      "begin_line": 2197,
      "end_line": 2201,
      "comment": "\n     * Validates parameters defining a single index in the builder.\n     * \n     * @param index  the index, must be valid\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 2198,col 9)-(line 2200,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StrBuilderTokenizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.text.StrTokenizer"
      ],
      "begin_line": 2207,
      "end_line": 2232,
      "comment": "\n     * Inner class to allow StrBuilder to operate as a tokenizer.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer.StrBuilderTokenizer()",
      "begin_line": 2210,
      "end_line": 2212,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2211,col 13)-(line 2211,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer.tokenize(char[], int, int)",
      "begin_line": 2215,
      "end_line": 2221,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2216,col 13)-(line 2220,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer.getContent()",
      "begin_line": 2224,
      "end_line": 2231,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2225,col 13)-(line 2225,col 44)",
        "(line 2226,col 13)-(line 2230,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StrBuilderReader",
      "is_interface": false,
      "parent_types": [
        "java.io.Reader"
      ],
      "begin_line": 2238,
      "end_line": 2313,
      "comment": "\n     * Inner class to allow StrBuilder to operate as a writer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 2240,
      "end_line": 2240,
      "comment": " The current stream position. "
    },
    {
      "type": "field",
      "varNames": [
        "mark"
      ],
      "begin_line": 2242,
      "end_line": 2242,
      "comment": " The last mark position. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.StrBuilderReader()",
      "begin_line": 2245,
      "end_line": 2247,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2246,col 13)-(line 2246,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.close()",
      "begin_line": 2250,
      "end_line": 2252,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.read()",
      "begin_line": 2255,
      "end_line": 2260,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2256,col 13)-(line 2258,col 13)",
        "(line 2259,col 13)-(line 2259,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.read(char[], int, int)",
      "begin_line": 2263,
      "end_line": 2280,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2264,col 13)-(line 2267,col 13)",
        "(line 2268,col 13)-(line 2270,col 13)",
        "(line 2271,col 13)-(line 2273,col 13)",
        "(line 2274,col 13)-(line 2276,col 13)",
        "(line 2277,col 13)-(line 2277,col 61)",
        "(line 2278,col 13)-(line 2278,col 23)",
        "(line 2279,col 13)-(line 2279,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.skip(long)",
      "begin_line": 2283,
      "end_line": 2292,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2284,col 13)-(line 2286,col 13)",
        "(line 2287,col 13)-(line 2289,col 13)",
        "(line 2290,col 13)-(line 2290,col 21)",
        "(line 2291,col 13)-(line 2291,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.ready()",
      "begin_line": 2295,
      "end_line": 2297,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2296,col 13)-(line 2296,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.markSupported()",
      "begin_line": 2300,
      "end_line": 2302,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2301,col 13)-(line 2301,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.mark(int)",
      "begin_line": 2305,
      "end_line": 2307,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2306,col 13)-(line 2306,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.reset()",
      "begin_line": 2310,
      "end_line": 2312,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2311,col 13)-(line 2311,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StrBuilderWriter",
      "is_interface": false,
      "parent_types": [
        "java.io.Writer"
      ],
      "begin_line": 2319,
      "end_line": 2360,
      "comment": "\n     * Inner class to allow StrBuilder to operate as a writer.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.StrBuilderWriter()",
      "begin_line": 2322,
      "end_line": 2324,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2323,col 13)-(line 2323,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.close()",
      "begin_line": 2327,
      "end_line": 2329,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.flush()",
      "begin_line": 2332,
      "end_line": 2334,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.write(int)",
      "begin_line": 2337,
      "end_line": 2339,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2338,col 13)-(line 2338,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.write(char[])",
      "begin_line": 2342,
      "end_line": 2344,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2343,col 13)-(line 2343,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.write(char[], int, int)",
      "begin_line": 2347,
      "end_line": 2349,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2348,col 13)-(line 2348,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.write(java.lang.String)",
      "begin_line": 2352,
      "end_line": 2354,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2353,col 13)-(line 2353,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.write(java.lang.String, int, int)",
      "begin_line": 2357,
      "end_line": 2359,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2358,col 13)-(line 2358,col 50)"
      ]
    }
  ]
}