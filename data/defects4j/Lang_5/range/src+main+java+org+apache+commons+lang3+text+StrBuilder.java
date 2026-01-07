{
  "filepath": "/tmp/Lang-5b/src/main/java/org/apache/commons/lang3/text/StrBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StrBuilder",
      "is_interface": false,
      "parent_types": [
        "java.lang.CharSequence",
        "java.lang.Appendable",
        "java.io.Serializable",
        "org.apache.commons.lang3.builder.Builder\u003cjava.lang.String\u003e"
      ],
      "begin_line": 75,
      "end_line": 2982,
      "comment": "\n * Builds a string from constituent parts providing a more flexible and powerful API\n * than StringBuffer.\n * \u003cp\u003e\n * The main differences from StringBuffer/StringBuilder are:\n * \u003cul\u003e\n * \u003cli\u003eNot synchronized\u003c/li\u003e\n * \u003cli\u003eNot final\u003c/li\u003e\n * \u003cli\u003eSubclasses have direct access to character array\u003c/li\u003e\n * \u003cli\u003eAdditional methods\n *  \u003cul\u003e\n *   \u003cli\u003eappendWithSeparators - adds an array of values, with a separator\u003c/li\u003e\n *   \u003cli\u003eappendPadding - adds a length padding characters\u003c/li\u003e\n *   \u003cli\u003eappendFixedLength - adds a fixed width field to the builder\u003c/li\u003e\n *   \u003cli\u003etoCharArray/getChars - simpler ways to get a range of the character array\u003c/li\u003e\n *   \u003cli\u003edelete - delete char or string\u003c/li\u003e\n *   \u003cli\u003ereplace - search and replace for a char or string\u003c/li\u003e\n *   \u003cli\u003eleftString/rightString/midString - substring without exceptions\u003c/li\u003e\n *   \u003cli\u003econtains - whether the builder contains a char or string\u003c/li\u003e\n *   \u003cli\u003esize/clear/isEmpty - collections style API methods\u003c/li\u003e\n *  \u003c/ul\u003e\n * \u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cli\u003eViews\n *  \u003cul\u003e\n *   \u003cli\u003easTokenizer - uses the internal buffer as the source of a StrTokenizer\u003c/li\u003e\n *   \u003cli\u003easReader - uses the internal buffer as the source of a Reader\u003c/li\u003e\n *   \u003cli\u003easWriter - allows a Writer to write directly to the internal buffer\u003c/li\u003e\n *  \u003c/ul\u003e\n * \u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * The aim has been to provide an API that mimics very closely what StringBuffer\n * provides, but with additional methods. It should be noted that some edge cases,\n * with invalid indices or null input, have been altered - see individual methods.\n * The biggest of these changes is that by default, null will not output the text\n * \u0027null\u0027. This can be controlled by a property, {@link #setNullText(String)}.\n * \u003cp\u003e\n * Prior to 3.0, this class implemented Cloneable but did not implement the \n * clone method so could not be used. From 3.0 onwards it no longer implements \n * the interface. \n *\n * @since 2.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "CAPACITY"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * The extra capacity for new builders.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "buffer"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " TODO make private?"
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " TODO make private?"
    },
    {
      "type": "field",
      "varNames": [
        "newLine"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " The new line. "
    },
    {
      "type": "field",
      "varNames": [
        "nullText"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " The null text. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilder()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Constructor that creates an empty builder initial capacity 32 characters.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilder(int)",
      "begin_line": 111,
      "end_line": 117,
      "comment": "\n     * Constructor that creates an empty builder the specified initial capacity.\n     *\n     * @param initialCapacity  the initial capacity, zero or less will be converted to 32\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 16)",
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilder(java.lang.String)",
      "begin_line": 125,
      "end_line": 133,
      "comment": "\n     * Constructor that creates a builder from the string, allocating\n     * 32 extra characters for growth.\n     *\n     * @param str  the string to copy, null treated as blank string\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 16)",
        "(line 127,col 9)-(line 132,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.getNewLineText()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * Gets the text to be appended when a new line is added.\n     *\n     * @return the new line text, null means use system default\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.setNewLineText(java.lang.String)",
      "begin_line": 151,
      "end_line": 154,
      "comment": "\n     * Sets the text to be appended when a new line is added.\n     *\n     * @param newLine  the new line text, null means use system default\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 31)",
        "(line 153,col 9)-(line 153,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.getNullText()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Gets the text to be appended when null is added.\n     *\n     * @return the null text, null means no append\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.setNullText(java.lang.String)",
      "begin_line": 172,
      "end_line": 178,
      "comment": "\n     * Sets the text to be appended when null is added.\n     *\n     * @param nullText  the null text, null means no append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 33)",
        "(line 177,col 9)-(line 177,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.length()",
      "begin_line": 186,
      "end_line": 189,
      "comment": "\n     * Gets the length of the string builder.\n     *\n     * @return the length\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.setLength(int)",
      "begin_line": 199,
      "end_line": 215,
      "comment": "\n     * Updates the length of the builder by either dropping the last characters\n     * or adding filler of Unicode zero.\n     *\n     * @param length  the length to set to, must be zero or positive\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the length is negative\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 214,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.capacity()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * Gets the current size of the internal character array buffer.\n     *\n     * @return the capacity\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.ensureCapacity(int)",
      "begin_line": 233,
      "end_line": 240,
      "comment": "\n     * Checks the capacity and ensures that it is at least the size specified.\n     *\n     * @param capacity  the capacity to ensure\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.minimizeCapacity()",
      "begin_line": 247,
      "end_line": 254,
      "comment": "\n     * Minimizes the capacity to the actual length of the string.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 253,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.size()",
      "begin_line": 265,
      "end_line": 267,
      "comment": "\n     * Gets the length of the string builder.\n     * \u003cp\u003e\n     * This method is the same as {@link #length()} and is provided to match the\n     * API of Collections.\n     *\n     * @return the length\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.isEmpty()",
      "begin_line": 277,
      "end_line": 279,
      "comment": "\n     * Checks is the string builder is empty (convenience Collections API style method).\n     * \u003cp\u003e\n     * This method is the same as checking {@link #length()} and is provided to match the\n     * API of Collections.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the size is \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.clear()",
      "begin_line": 292,
      "end_line": 295,
      "comment": "\n     * Clears the string builder (convenience Collections API style method).\n     * \u003cp\u003e\n     * This method does not reduce the size of the internal character buffer.\n     * To do that, call \u003ccode\u003eclear()\u003c/code\u003e followed by {@link #minimizeCapacity()}.\n     * \u003cp\u003e\n     * This method is the same as {@link #setLength(int)} called with zero\n     * and is provided to match the API of Collections.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 17)",
        "(line 294,col 9)-(line 294,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.charAt(int)",
      "begin_line": 307,
      "end_line": 313,
      "comment": "\n     * Gets the character at the specified index.\n     *\n     * @see #setCharAt(int, char)\n     * @see #deleteCharAt(int)\n     * @param index  the index to retrieve, must be valid\n     * @return the character at the index\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.setCharAt(int, char)",
      "begin_line": 325,
      "end_line": 331,
      "comment": "\n     * Sets the character at the specified index.\n     *\n     * @see #charAt(int)\n     * @see #deleteCharAt(int)\n     * @param index  the index to set\n     * @param ch  the new character\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 329,col 27)",
        "(line 330,col 9)-(line 330,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.deleteCharAt(int)",
      "begin_line": 342,
      "end_line": 348,
      "comment": "\n     * Deletes the character at the specified index.\n     *\n     * @see #charAt(int)\n     * @see #setCharAt(int, char)\n     * @param index  the index to delete\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 346,col 40)",
        "(line 347,col 9)-(line 347,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.toCharArray()",
      "begin_line": 356,
      "end_line": 363,
      "comment": "\n     * Copies the builder\u0027s character array into a new character array.\n     * \n     * @return a new array that represents the contents of the builder\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 360,col 38)",
        "(line 361,col 9)-(line 361,col 52)",
        "(line 362,col 9)-(line 362,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.toCharArray(int, int)",
      "begin_line": 375,
      "end_line": 384,
      "comment": "\n     * Copies part of the builder\u0027s character array into a new character array.\n     * \n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except that\n     *  if too large it is treated as end of string\n     * @return a new array that holds part of the contents of the builder\n     * @throws IndexOutOfBoundsException if startIndex is invalid,\n     *  or if endIndex is invalid (but endIndex greater than size is valid)\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 55)",
        "(line 377,col 9)-(line 377,col 40)",
        "(line 378,col 9)-(line 380,col 9)",
        "(line 381,col 9)-(line 381,col 37)",
        "(line 382,col 9)-(line 382,col 60)",
        "(line 383,col 9)-(line 383,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.getChars(char[])",
      "begin_line": 392,
      "end_line": 399,
      "comment": "\n     * Copies the character array into the specified array.\n     * \n     * @param destination  the destination array, null will cause an array to be created\n     * @return the input array, unless that was null or too small\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 27)",
        "(line 394,col 9)-(line 396,col 9)",
        "(line 397,col 9)-(line 397,col 57)",
        "(line 398,col 9)-(line 398,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.getChars(int, int, char[], int)",
      "begin_line": 411,
      "end_line": 422,
      "comment": "\n     * Copies the character array into the specified array.\n     *\n     * @param startIndex  first index to copy, inclusive, must be valid\n     * @param endIndex  last index, exclusive, must be valid\n     * @param destination  the destination array, must not be null or too small\n     * @param destinationIndex  the index to start copying in destination\n     * @throws NullPointerException if the array is null\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 414,col 9)",
        "(line 415,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 421,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendNewLine()",
      "begin_line": 434,
      "end_line": 440,
      "comment": "\n     * Appends the new line string to this string builder.\n     * \u003cp\u003e\n     * The new line string can be altered using {@link #setNewLineText(String)}.\n     * This might be used to force the output to always use Unix line endings\n     * even when on Windows.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 439,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendNull()",
      "begin_line": 447,
      "end_line": 452,
      "comment": "\n     * Appends the text representing \u003ccode\u003enull\u003c/code\u003e to this string builder.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 450,col 9)",
        "(line 451,col 9)-(line 451,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(java.lang.Object)",
      "begin_line": 461,
      "end_line": 466,
      "comment": "\n     * Appends an object to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param obj  the object to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 464,col 9)",
        "(line 465,col 9)-(line 465,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(java.lang.CharSequence)",
      "begin_line": 476,
      "end_line": 482,
      "comment": "\n     * Appends a CharSequence to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param seq  the CharSequence to append\n     * @return this, to enable chaining\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 480,col 9)",
        "(line 481,col 9)-(line 481,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(java.lang.CharSequence, int, int)",
      "begin_line": 494,
      "end_line": 500,
      "comment": "\n     * Appends part of a CharSequence to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param seq  the CharSequence to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 498,col 9)",
        "(line 499,col 9)-(line 499,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(java.lang.String)",
      "begin_line": 509,
      "end_line": 521,
      "comment": "\n     * Appends a string to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 510,col 9)-(line 512,col 9)",
        "(line 513,col 9)-(line 513,col 34)",
        "(line 514,col 9)-(line 519,col 9)",
        "(line 520,col 9)-(line 520,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(java.lang.String, int, int)",
      "begin_line": 533,
      "end_line": 550,
      "comment": "\n     * Appends part of a string to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 536,col 9)",
        "(line 537,col 9)-(line 539,col 9)",
        "(line 540,col 9)-(line 542,col 9)",
        "(line 543,col 9)-(line 548,col 9)",
        "(line 549,col 9)-(line 549,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(java.lang.String, java.lang.Object...)",
      "begin_line": 561,
      "end_line": 563,
      "comment": "\n     * Calls {@link String#format(String, Object...)} and appends the result.\n     *\n     * @param format the format string\n     * @param objs the objects to use in the format string\n     * @return {@code this} to enable chaining\n     * @see String#format(String, Object...)\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(java.lang.StringBuffer)",
      "begin_line": 572,
      "end_line": 584,
      "comment": "\n     * Appends a string buffer to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string buffer to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 573,col 9)-(line 575,col 9)",
        "(line 576,col 9)-(line 576,col 34)",
        "(line 577,col 9)-(line 582,col 9)",
        "(line 583,col 9)-(line 583,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(java.lang.StringBuffer, int, int)",
      "begin_line": 595,
      "end_line": 612,
      "comment": "\n     * Appends part of a string buffer to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 596,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 601,col 9)",
        "(line 602,col 9)-(line 604,col 9)",
        "(line 605,col 9)-(line 610,col 9)",
        "(line 611,col 9)-(line 611,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(java.lang.StringBuilder)",
      "begin_line": 622,
      "end_line": 634,
      "comment": "\n     * Appends a StringBuilder to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str the StringBuilder to append\n     * @return this, to enable chaining\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 623,col 9)-(line 625,col 9)",
        "(line 626,col 9)-(line 626,col 34)",
        "(line 627,col 9)-(line 632,col 9)",
        "(line 633,col 9)-(line 633,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(java.lang.StringBuilder, int, int)",
      "begin_line": 646,
      "end_line": 663,
      "comment": "\n     * Appends part of a StringBuilder to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str the StringBuilder to append\n     * @param startIndex the start index, inclusive, must be valid\n     * @param length the length to append, must be valid\n     * @return this, to enable chaining\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 647,col 9)-(line 649,col 9)",
        "(line 650,col 9)-(line 652,col 9)",
        "(line 653,col 9)-(line 655,col 9)",
        "(line 656,col 9)-(line 661,col 9)",
        "(line 662,col 9)-(line 662,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(org.apache.commons.lang3.text.StrBuilder)",
      "begin_line": 672,
      "end_line": 684,
      "comment": "\n     * Appends another string builder to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string builder to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 673,col 9)-(line 675,col 9)",
        "(line 676,col 9)-(line 676,col 34)",
        "(line 677,col 9)-(line 682,col 9)",
        "(line 683,col 9)-(line 683,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(org.apache.commons.lang3.text.StrBuilder, int, int)",
      "begin_line": 695,
      "end_line": 712,
      "comment": "\n     * Appends part of a string builder to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 696,col 9)-(line 698,col 9)",
        "(line 699,col 9)-(line 701,col 9)",
        "(line 702,col 9)-(line 704,col 9)",
        "(line 705,col 9)-(line 710,col 9)",
        "(line 711,col 9)-(line 711,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(char[])",
      "begin_line": 721,
      "end_line": 733,
      "comment": "\n     * Appends a char array to the string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param chars  the char array to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 722,col 9)-(line 724,col 9)",
        "(line 725,col 9)-(line 725,col 34)",
        "(line 726,col 9)-(line 731,col 9)",
        "(line 732,col 9)-(line 732,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(char[], int, int)",
      "begin_line": 744,
      "end_line": 761,
      "comment": "\n     * Appends a char array to the string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param chars  the char array to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 745,col 9)-(line 747,col 9)",
        "(line 748,col 9)-(line 750,col 9)",
        "(line 751,col 9)-(line 753,col 9)",
        "(line 754,col 9)-(line 759,col 9)",
        "(line 760,col 9)-(line 760,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(boolean)",
      "begin_line": 769,
      "end_line": 785,
      "comment": "\n     * Appends a boolean value to the string builder.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 770,col 9)-(line 783,col 9)",
        "(line 784,col 9)-(line 784,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(char)",
      "begin_line": 794,
      "end_line": 800,
      "comment": "\n     * Appends a char value to the string builder.\n     *\n     * @param ch  the value to append\n     * @return this, to enable chaining\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 796,col 9)-(line 796,col 27)",
        "(line 797,col 9)-(line 797,col 32)",
        "(line 798,col 9)-(line 798,col 28)",
        "(line 799,col 9)-(line 799,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(int)",
      "begin_line": 808,
      "end_line": 810,
      "comment": "\n     * Appends an int value to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 809,col 9)-(line 809,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(long)",
      "begin_line": 818,
      "end_line": 820,
      "comment": "\n     * Appends a long value to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 819,col 9)-(line 819,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(float)",
      "begin_line": 828,
      "end_line": 830,
      "comment": "\n     * Appends a float value to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 829,col 9)-(line 829,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(double)",
      "begin_line": 838,
      "end_line": 840,
      "comment": "\n     * Appends a double value to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 839,col 9)-(line 839,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(java.lang.Object)",
      "begin_line": 851,
      "end_line": 853,
      "comment": "\n     * Appends an object followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param obj  the object to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 852,col 9)-(line 852,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(java.lang.String)",
      "begin_line": 863,
      "end_line": 865,
      "comment": "\n     * Appends a string followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 864,col 9)-(line 864,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(java.lang.String, int, int)",
      "begin_line": 877,
      "end_line": 879,
      "comment": "\n     * Appends part of a string followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 878,col 9)-(line 878,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(java.lang.String, java.lang.Object...)",
      "begin_line": 890,
      "end_line": 892,
      "comment": "\n     * Calls {@link String#format(String, Object...)} and appends the result.\n     *\n     * @param format the format string\n     * @param objs the objects to use in the format string\n     * @return {@code this} to enable chaining\n     * @see String#format(String, Object...)\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 891,col 9)-(line 891,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(java.lang.StringBuffer)",
      "begin_line": 902,
      "end_line": 904,
      "comment": "\n     * Appends a string buffer followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string buffer to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 903,col 9)-(line 903,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(java.lang.StringBuilder)",
      "begin_line": 914,
      "end_line": 916,
      "comment": "\n     * Appends a string builder followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string builder to append\n     * @return this, to enable chaining\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 915,col 9)-(line 915,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(java.lang.StringBuilder, int, int)",
      "begin_line": 928,
      "end_line": 930,
      "comment": "\n     * Appends part of a string builder followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string builder to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 929,col 9)-(line 929,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(java.lang.StringBuffer, int, int)",
      "begin_line": 942,
      "end_line": 944,
      "comment": "\n     * Appends part of a string buffer followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 943,col 9)-(line 943,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(org.apache.commons.lang3.text.StrBuilder)",
      "begin_line": 954,
      "end_line": 956,
      "comment": "\n     * Appends another string builder followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string builder to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 955,col 9)-(line 955,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(org.apache.commons.lang3.text.StrBuilder, int, int)",
      "begin_line": 968,
      "end_line": 970,
      "comment": "\n     * Appends part of a string builder followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 969,col 9)-(line 969,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(char[])",
      "begin_line": 980,
      "end_line": 982,
      "comment": "\n     * Appends a char array followed by a new line to the string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param chars  the char array to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 981,col 9)-(line 981,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(char[], int, int)",
      "begin_line": 994,
      "end_line": 996,
      "comment": "\n     * Appends a char array followed by a new line to the string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param chars  the char array to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 995,col 9)-(line 995,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(boolean)",
      "begin_line": 1005,
      "end_line": 1007,
      "comment": "\n     * Appends a boolean value followed by a new line to the string builder.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1006,col 9)-(line 1006,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(char)",
      "begin_line": 1016,
      "end_line": 1018,
      "comment": "\n     * Appends a char value followed by a new line to the string builder.\n     *\n     * @param ch  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1017,col 9)-(line 1017,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(int)",
      "begin_line": 1027,
      "end_line": 1029,
      "comment": "\n     * Appends an int value followed by a new line to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1028,col 9)-(line 1028,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(long)",
      "begin_line": 1038,
      "end_line": 1040,
      "comment": "\n     * Appends a long value followed by a new line to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1039,col 9)-(line 1039,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(float)",
      "begin_line": 1049,
      "end_line": 1051,
      "comment": "\n     * Appends a float value followed by a new line to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1050,col 9)-(line 1050,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(double)",
      "begin_line": 1060,
      "end_line": 1062,
      "comment": "\n     * Appends a double value followed by a new line to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1061,col 9)-(line 1061,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendAll(T...)",
      "begin_line": 1074,
      "end_line": 1081,
      "comment": "\n     * Appends each item in an array to the builder without any separators.\n     * Appending a null array will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param array  the array to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1075,col 9)-(line 1079,col 9)",
        "(line 1080,col 9)-(line 1080,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendAll(java.lang.Iterable\u003c?\u003e)",
      "begin_line": 1092,
      "end_line": 1099,
      "comment": "\n     * Appends each item in a iterable to the builder without any separators.\n     * Appending a null iterable will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param iterable  the iterable to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1093,col 9)-(line 1097,col 9)",
        "(line 1098,col 9)-(line 1098,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendAll(java.util.Iterator\u003c?\u003e)",
      "begin_line": 1110,
      "end_line": 1117,
      "comment": "\n     * Appends each item in an iterator to the builder without any separators.\n     * Appending a null iterator will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param it  the iterator to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1111,col 9)-(line 1115,col 9)",
        "(line 1116,col 9)-(line 1116,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendWithSeparators(java.lang.Object[], java.lang.String)",
      "begin_line": 1130,
      "end_line": 1140,
      "comment": "\n     * Appends an array placing separators between each value, but\n     * not before the first or after the last.\n     * Appending a null array will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param array  the array to append\n     * @param separator  the separator to use, null means no separator\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1131,col 9)-(line 1138,col 9)",
        "(line 1139,col 9)-(line 1139,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendWithSeparators(java.lang.Iterable\u003c?\u003e, java.lang.String)",
      "begin_line": 1152,
      "end_line": 1164,
      "comment": "\n     * Appends a iterable placing separators between each value, but\n     * not before the first or after the last.\n     * Appending a null iterable will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param iterable  the iterable to append\n     * @param separator  the separator to use, null means no separator\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1153,col 9)-(line 1162,col 9)",
        "(line 1163,col 9)-(line 1163,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendWithSeparators(java.util.Iterator\u003c?\u003e, java.lang.String)",
      "begin_line": 1176,
      "end_line": 1187,
      "comment": "\n     * Appends an iterator placing separators between each value, but\n     * not before the first or after the last.\n     * Appending a null iterator will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param it  the iterator to append\n     * @param separator  the separator to use, null means no separator\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1177,col 9)-(line 1185,col 9)",
        "(line 1186,col 9)-(line 1186,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendSeparator(java.lang.String)",
      "begin_line": 1210,
      "end_line": 1212,
      "comment": "\n     * Appends a separator if the builder is currently non-empty.\n     * Appending a null separator will have no effect.\n     * The separator is appended using {@link #append(String)}.\n     * \u003cp\u003e\n     * This method is useful for adding a separator each time around the\n     * loop except the first.\n     * \u003cpre\u003e\n     * for (Iterator it \u003d list.iterator(); it.hasNext(); ) {\n     *   appendSeparator(\",\");\n     *   append(it.next());\n     * }\n     * \u003c/pre\u003e\n     * Note that for this simple example, you should use\n     * {@link #appendWithSeparators(Iterable, String)}.\n     * \n     * @param separator  the separator to use, null means no separator\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1211,col 9)-(line 1211,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendSeparator(java.lang.String, java.lang.String)",
      "begin_line": 1241,
      "end_line": 1247,
      "comment": "\n     * Appends one of both separators to the StrBuilder.\n     * If the builder is currently empty it will append the defaultIfEmpty-separator\n     * Otherwise it will append the standard-separator\n     * \n     * Appending a null separator will have no effect.\n     * The separator is appended using {@link #append(String)}.\n     * \u003cp\u003e\n     * This method is for example useful for constructing queries\n     * \u003cpre\u003e\n     * StrBuilder whereClause \u003d new StrBuilder();\n     * if(searchCommand.getPriority() !\u003d null) {\n     *  whereClause.appendSeparator(\" and\", \" where\");\n     *  whereClause.append(\" priority \u003d ?\")\n     * }\n     * if(searchCommand.getComponent() !\u003d null) {\n     *  whereClause.appendSeparator(\" and\", \" where\");\n     *  whereClause.append(\" component \u003d ?\")\n     * }\n     * selectClause.append(whereClause)\n     * \u003c/pre\u003e\n     * \n     * @param standard the separator if builder is not empty, null means no separator\n     * @param defaultIfEmpty the separator if builder is empty, null means no separator\n     * @return this, to enable chaining\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 1242,col 9)-(line 1242,col 59)",
        "(line 1243,col 9)-(line 1245,col 9)",
        "(line 1246,col 9)-(line 1246,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendSeparator(char)",
      "begin_line": 1268,
      "end_line": 1273,
      "comment": "\n     * Appends a separator if the builder is currently non-empty.\n     * The separator is appended using {@link #append(char)}.\n     * \u003cp\u003e\n     * This method is useful for adding a separator each time around the\n     * loop except the first.\n     * \u003cpre\u003e\n     * for (Iterator it \u003d list.iterator(); it.hasNext(); ) {\n     *   appendSeparator(\u0027,\u0027);\n     *   append(it.next());\n     * }\n     * \u003c/pre\u003e\n     * Note that for this simple example, you should use\n     * {@link #appendWithSeparators(Iterable, String)}.\n     * \n     * @param separator  the separator to use\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1269,col 9)-(line 1271,col 9)",
        "(line 1272,col 9)-(line 1272,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendSeparator(char, char)",
      "begin_line": 1286,
      "end_line": 1293,
      "comment": "\n     * Append one of both separators to the builder\n     * If the builder is currently empty it will append the defaultIfEmpty-separator\n     * Otherwise it will append the standard-separator\n     *\n     * The separator is appended using {@link #append(char)}.\n     * @param standard the separator if builder is not empty\n     * @param defaultIfEmpty the separator if builder is empty\n     * @return this, to enable chaining\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 1287,col 9)-(line 1291,col 9)",
        "(line 1292,col 9)-(line 1292,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendSeparator(java.lang.String, int)",
      "begin_line": 1315,
      "end_line": 1320,
      "comment": "\n     * Appends a separator to the builder if the loop index is greater than zero.\n     * Appending a null separator will have no effect.\n     * The separator is appended using {@link #append(String)}.\n     * \u003cp\u003e\n     * This method is useful for adding a separator each time around the\n     * loop except the first.\n     * \u003cpre\u003e\n     * for (int i \u003d 0; i \u003c list.size(); i++) {\n     *   appendSeparator(\",\", i);\n     *   append(list.get(i));\n     * }\n     * \u003c/pre\u003e\n     * Note that for this simple example, you should use\n     * {@link #appendWithSeparators(Iterable, String)}.\n     * \n     * @param separator  the separator to use, null means no separator\n     * @param loopIndex  the loop index\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1316,col 9)-(line 1318,col 9)",
        "(line 1319,col 9)-(line 1319,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendSeparator(char, int)",
      "begin_line": 1342,
      "end_line": 1347,
      "comment": "\n     * Appends a separator to the builder if the loop index is greater than zero.\n     * The separator is appended using {@link #append(char)}.\n     * \u003cp\u003e\n     * This method is useful for adding a separator each time around the\n     * loop except the first.\n     * \u003cpre\u003e\n     * for (int i \u003d 0; i \u003c list.size(); i++) {\n     *   appendSeparator(\",\", i);\n     *   append(list.get(i));\n     * }\n     * \u003c/pre\u003e\n     * Note that for this simple example, you should use\n     * {@link #appendWithSeparators(Iterable, String)}.\n     * \n     * @param separator  the separator to use\n     * @param loopIndex  the loop index\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1343,col 9)-(line 1345,col 9)",
        "(line 1346,col 9)-(line 1346,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendPadding(int, char)",
      "begin_line": 1357,
      "end_line": 1365,
      "comment": "\n     * Appends the pad character to the builder the specified number of times.\n     * \n     * @param length  the length to append, negative means no append\n     * @param padChar  the character to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1358,col 9)-(line 1363,col 9)",
        "(line 1364,col 9)-(line 1364,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendFixedWidthPadLeft(java.lang.Object, int, char)",
      "begin_line": 1379,
      "end_line": 1399,
      "comment": "\n     * Appends an object to the builder padding on the left to a fixed width.\n     * The \u003ccode\u003etoString\u003c/code\u003e of the object is used.\n     * If the object is larger than the length, the left hand side is lost.\n     * If the object is null, the null text value is used.\n     * \n     * @param obj  the object to append, null uses null text\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1380,col 9)-(line 1397,col 9)",
        "(line 1398,col 9)-(line 1398,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendFixedWidthPadLeft(int, int, char)",
      "begin_line": 1411,
      "end_line": 1413,
      "comment": "\n     * Appends an object to the builder padding on the left to a fixed width.\n     * The \u003ccode\u003eString.valueOf\u003c/code\u003e of the \u003ccode\u003eint\u003c/code\u003e value is used.\n     * If the formatted value is larger than the length, the left hand side is lost.\n     * \n     * @param value  the value to append\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1412,col 9)-(line 1412,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendFixedWidthPadRight(java.lang.Object, int, char)",
      "begin_line": 1426,
      "end_line": 1446,
      "comment": "\n     * Appends an object to the builder padding on the right to a fixed length.\n     * The \u003ccode\u003etoString\u003c/code\u003e of the object is used.\n     * If the object is larger than the length, the right hand side is lost.\n     * If the object is null, null text value is used.\n     * \n     * @param obj  the object to append, null uses null text\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1427,col 9)-(line 1444,col 9)",
        "(line 1445,col 9)-(line 1445,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendFixedWidthPadRight(int, int, char)",
      "begin_line": 1458,
      "end_line": 1460,
      "comment": "\n     * Appends an object to the builder padding on the right to a fixed length.\n     * The \u003ccode\u003eString.valueOf\u003c/code\u003e of the \u003ccode\u003eint\u003c/code\u003e value is used.\n     * If the object is larger than the length, the right hand side is lost.\n     * \n     * @param value  the value to append\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1459,col 9)-(line 1459,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, java.lang.Object)",
      "begin_line": 1472,
      "end_line": 1477,
      "comment": "\n     * Inserts the string representation of an object into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param obj  the object to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1473,col 9)-(line 1475,col 9)",
        "(line 1476,col 9)-(line 1476,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, java.lang.String)",
      "begin_line": 1488,
      "end_line": 1503,
      "comment": "\n     * Inserts the string into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param str  the string to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1490,col 9)-(line 1490,col 29)",
        "(line 1491,col 9)-(line 1493,col 9)",
        "(line 1494,col 9)-(line 1494,col 54)",
        "(line 1495,col 9)-(line 1501,col 9)",
        "(line 1502,col 9)-(line 1502,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, char[])",
      "begin_line": 1514,
      "end_line": 1527,
      "comment": "\n     * Inserts the character array into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param chars  the char array to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1515,col 9)-(line 1515,col 29)",
        "(line 1516,col 9)-(line 1518,col 9)",
        "(line 1519,col 9)-(line 1519,col 31)",
        "(line 1520,col 9)-(line 1525,col 9)",
        "(line 1526,col 9)-(line 1526,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, char[], int, int)",
      "begin_line": 1540,
      "end_line": 1558,
      "comment": "\n     * Inserts part of the character array into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param chars  the char array to insert\n     * @param offset  the offset into the character array to start at, must be valid\n     * @param length  the length of the character array part to copy, must be positive\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 1541,col 9)-(line 1541,col 29)",
        "(line 1542,col 9)-(line 1544,col 9)",
        "(line 1545,col 9)-(line 1547,col 9)",
        "(line 1548,col 9)-(line 1550,col 9)",
        "(line 1551,col 9)-(line 1556,col 9)",
        "(line 1557,col 9)-(line 1557,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, boolean)",
      "begin_line": 1568,
      "end_line": 1589,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1569,col 9)-(line 1569,col 29)",
        "(line 1570,col 9)-(line 1587,col 9)",
        "(line 1588,col 9)-(line 1588,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, char)",
      "begin_line": 1599,
      "end_line": 1606,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1600,col 9)-(line 1600,col 29)",
        "(line 1601,col 9)-(line 1601,col 33)",
        "(line 1602,col 9)-(line 1602,col 73)",
        "(line 1603,col 9)-(line 1603,col 30)",
        "(line 1604,col 9)-(line 1604,col 15)",
        "(line 1605,col 9)-(line 1605,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, int)",
      "begin_line": 1616,
      "end_line": 1618,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1617,col 9)-(line 1617,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, long)",
      "begin_line": 1628,
      "end_line": 1630,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1629,col 9)-(line 1629,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, float)",
      "begin_line": 1640,
      "end_line": 1642,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1641,col 9)-(line 1641,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, double)",
      "begin_line": 1652,
      "end_line": 1654,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1653,col 9)-(line 1653,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.deleteImpl(int, int, int)",
      "begin_line": 1665,
      "end_line": 1668,
      "comment": "\n     * Internal method to delete a range without validation.\n     *\n     * @param startIndex  the start index, must be valid\n     * @param endIndex  the end index (exclusive), must be valid\n     * @param len  the length, must be valid\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 1666,col 9)-(line 1666,col 80)",
        "(line 1667,col 9)-(line 1667,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.delete(int, int)",
      "begin_line": 1679,
      "end_line": 1686,
      "comment": "\n     * Deletes the characters between the two specified indices.\n     *\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1680,col 9)-(line 1680,col 55)",
        "(line 1681,col 9)-(line 1681,col 40)",
        "(line 1682,col 9)-(line 1684,col 9)",
        "(line 1685,col 9)-(line 1685,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.deleteAll(char)",
      "begin_line": 1695,
      "end_line": 1710,
      "comment": "\n     * Deletes the character wherever it occurs in the builder.\n     *\n     * @param ch  the character to delete\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1696,col 9)-(line 1708,col 9)",
        "(line 1709,col 9)-(line 1709,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.deleteFirst(char)",
      "begin_line": 1718,
      "end_line": 1726,
      "comment": "\n     * Deletes the character wherever it occurs in the builder.\n     *\n     * @param ch  the character to delete\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1719,col 9)-(line 1724,col 9)",
        "(line 1725,col 9)-(line 1725,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.deleteAll(java.lang.String)",
      "begin_line": 1735,
      "end_line": 1745,
      "comment": "\n     * Deletes the string wherever it occurs in the builder.\n     *\n     * @param str  the string to delete, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1736,col 9)-(line 1736,col 51)",
        "(line 1737,col 9)-(line 1743,col 9)",
        "(line 1744,col 9)-(line 1744,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.deleteFirst(java.lang.String)",
      "begin_line": 1753,
      "end_line": 1762,
      "comment": "\n     * Deletes the string wherever it occurs in the builder.\n     *\n     * @param str  the string to delete, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1754,col 9)-(line 1754,col 51)",
        "(line 1755,col 9)-(line 1760,col 9)",
        "(line 1761,col 9)-(line 1761,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.deleteAll(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 1775,
      "end_line": 1777,
      "comment": "\n     * Deletes all parts of the builder that the matcher matches.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced deletion behaviour.\n     * For example you could write a matcher to delete all occurrences\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1776,col 9)-(line 1776,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.deleteFirst(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 1789,
      "end_line": 1791,
      "comment": "\n     * Deletes the first match within the builder using the specified matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced deletion behaviour.\n     * For example you could write a matcher to delete\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1790,col 9)-(line 1790,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replaceImpl(int, int, int, java.lang.String, int)",
      "begin_line": 1804,
      "end_line": 1814,
      "comment": "\n     * Internal method to delete a range without validation.\n     *\n     * @param startIndex  the start index, must be valid\n     * @param endIndex  the end index (exclusive), must be valid\n     * @param removeLen  the length to remove (endIndex - startIndex), must be valid\n     * @param insertStr  the string to replace with, null means delete range\n     * @param insertLen  the length of the insert string, must be valid\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 1805,col 9)-(line 1805,col 51)",
        "(line 1806,col 9)-(line 1810,col 9)",
        "(line 1811,col 9)-(line 1813,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replace(int, int, java.lang.String)",
      "begin_line": 1827,
      "end_line": 1832,
      "comment": "\n     * Replaces a portion of the string builder with another string.\n     * The length of the inserted string does not have to match the removed length.\n     *\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @param replaceStr  the string to replace with, null means delete range\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1828,col 9)-(line 1828,col 55)",
        "(line 1829,col 9)-(line 1829,col 71)",
        "(line 1830,col 9)-(line 1830,col 88)",
        "(line 1831,col 9)-(line 1831,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replaceAll(char, char)",
      "begin_line": 1843,
      "end_line": 1852,
      "comment": "\n     * Replaces the search character with the replace character\n     * throughout the builder.\n     *\n     * @param search  the search character\n     * @param replace  the replace character\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1844,col 9)-(line 1850,col 9)",
        "(line 1851,col 9)-(line 1851,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replaceFirst(char, char)",
      "begin_line": 1862,
      "end_line": 1872,
      "comment": "\n     * Replaces the first instance of the search character with the\n     * replace character in the builder.\n     *\n     * @param search  the search character\n     * @param replace  the replace character\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1863,col 9)-(line 1870,col 9)",
        "(line 1871,col 9)-(line 1871,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replaceAll(java.lang.String, java.lang.String)",
      "begin_line": 1882,
      "end_line": 1893,
      "comment": "\n     * Replaces the search string with the replace string throughout the builder.\n     *\n     * @param searchStr  the search string, null causes no action to occur\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1883,col 9)-(line 1883,col 69)",
        "(line 1884,col 9)-(line 1891,col 9)",
        "(line 1892,col 9)-(line 1892,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replaceFirst(java.lang.String, java.lang.String)",
      "begin_line": 1902,
      "end_line": 1912,
      "comment": "\n     * Replaces the first instance of the search string with the replace string.\n     *\n     * @param searchStr  the search string, null causes no action to occur\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1903,col 9)-(line 1903,col 69)",
        "(line 1904,col 9)-(line 1910,col 9)",
        "(line 1911,col 9)-(line 1911,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replaceAll(org.apache.commons.lang3.text.StrMatcher, java.lang.String)",
      "begin_line": 1926,
      "end_line": 1928,
      "comment": "\n     * Replaces all matches within the builder with the replace string.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced replace behaviour.\n     * For example you could write a matcher to replace all occurrences\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1927,col 9)-(line 1927,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replaceFirst(org.apache.commons.lang3.text.StrMatcher, java.lang.String)",
      "begin_line": 1941,
      "end_line": 1943,
      "comment": "\n     * Replaces the first match within the builder with the replace string.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced replace behaviour.\n     * For example you could write a matcher to replace\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1942,col 9)-(line 1942,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replace(org.apache.commons.lang3.text.StrMatcher, java.lang.String, int, int, int)",
      "begin_line": 1962,
      "end_line": 1967,
      "comment": "\n     * Advanced search and replaces within the builder using a matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced behaviour.\n     * For example you could write a matcher to delete all occurrences\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the string to replace the match with, null is a delete\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @param replaceCount  the number of times to replace, -1 for replace all\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if start index is invalid\n     ",
      "child_ranges": [
        "(line 1965,col 9)-(line 1965,col 55)",
        "(line 1966,col 9)-(line 1966,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replaceImpl(org.apache.commons.lang3.text.StrMatcher, java.lang.String, int, int, int)",
      "begin_line": 1984,
      "end_line": 2004,
      "comment": "\n     * Replaces within the builder using a matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced behaviour.\n     * For example you could write a matcher to delete all occurrences\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the string to replace the match with, null is a delete\n     * @param from  the start index, must be valid\n     * @param to  the end index (exclusive), must be valid\n     * @param replaceCount  the number of times to replace, -1 for replace all\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 1987,col 9)-(line 1989,col 9)",
        "(line 1990,col 9)-(line 1990,col 72)",
        "(line 1991,col 9)-(line 1991,col 28)",
        "(line 1992,col 9)-(line 2002,col 9)",
        "(line 2003,col 9)-(line 2003,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.reverse()",
      "begin_line": 2012,
      "end_line": 2025,
      "comment": "\n     * Reverses the string builder placing each character in the opposite index.\n     * \n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 2013,col 9)-(line 2015,col 9)",
        "(line 2017,col 9)-(line 2017,col 28)",
        "(line 2018,col 9)-(line 2018,col 28)",
        "(line 2019,col 9)-(line 2023,col 9)",
        "(line 2024,col 9)-(line 2024,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.trim()",
      "begin_line": 2034,
      "end_line": 2054,
      "comment": "\n     * Trims the builder by removing characters less than or equal to a space\n     * from the beginning and end.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 2035,col 9)-(line 2037,col 9)",
        "(line 2038,col 9)-(line 2038,col 23)",
        "(line 2039,col 9)-(line 2039,col 28)",
        "(line 2040,col 9)-(line 2040,col 20)",
        "(line 2041,col 9)-(line 2043,col 9)",
        "(line 2044,col 9)-(line 2046,col 9)",
        "(line 2047,col 9)-(line 2049,col 9)",
        "(line 2050,col 9)-(line 2052,col 9)",
        "(line 2053,col 9)-(line 2053,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.startsWith(java.lang.String)",
      "begin_line": 2065,
      "end_line": 2082,
      "comment": "\n     * Checks whether this builder starts with the specified string.\n     * \u003cp\u003e\n     * Note that this method handles null input quietly, unlike String.\n     * \n     * @param str  the string to search for, null returns false\n     * @return true if the builder starts with the string\n     ",
      "child_ranges": [
        "(line 2066,col 9)-(line 2068,col 9)",
        "(line 2069,col 9)-(line 2069,col 31)",
        "(line 2070,col 9)-(line 2072,col 9)",
        "(line 2073,col 9)-(line 2075,col 9)",
        "(line 2076,col 9)-(line 2080,col 9)",
        "(line 2081,col 9)-(line 2081,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.endsWith(java.lang.String)",
      "begin_line": 2092,
      "end_line": 2110,
      "comment": "\n     * Checks whether this builder ends with the specified string.\n     * \u003cp\u003e\n     * Note that this method handles null input quietly, unlike String.\n     * \n     * @param str  the string to search for, null returns false\n     * @return true if the builder ends with the string\n     ",
      "child_ranges": [
        "(line 2093,col 9)-(line 2095,col 9)",
        "(line 2096,col 9)-(line 2096,col 31)",
        "(line 2097,col 9)-(line 2099,col 9)",
        "(line 2100,col 9)-(line 2102,col 9)",
        "(line 2103,col 9)-(line 2103,col 29)",
        "(line 2104,col 9)-(line 2108,col 9)",
        "(line 2109,col 9)-(line 2109,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.subSequence(int, int)",
      "begin_line": 2117,
      "end_line": 2129,
      "comment": "\n     * {@inheritDoc}\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 2119,col 7)-(line 2121,col 7)",
        "(line 2122,col 7)-(line 2124,col 7)",
        "(line 2125,col 7)-(line 2127,col 7)",
        "(line 2128,col 7)-(line 2128,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.substring(int)",
      "begin_line": 2138,
      "end_line": 2140,
      "comment": "\n     * Extracts a portion of this string builder as a string.\n     * \n     * @param start  the start index, inclusive, must be valid\n     * @return the new string\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 2139,col 9)-(line 2139,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.substring(int, int)",
      "begin_line": 2155,
      "end_line": 2158,
      "comment": "\n     * Extracts a portion of this string builder as a string.\n     * \u003cp\u003e\n     * Note: This method treats an endIndex greater than the length of the\n     * builder as equal to the length of the builder, and continues\n     * without error, unlike StringBuffer or String.\n     * \n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @return the new string\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 2156,col 9)-(line 2156,col 55)",
        "(line 2157,col 9)-(line 2157,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.leftString(int)",
      "begin_line": 2172,
      "end_line": 2180,
      "comment": "\n     * Extracts the leftmost characters from the string builder without\n     * throwing an exception.\n     * \u003cp\u003e\n     * This method extracts the left \u003ccode\u003elength\u003c/code\u003e characters from\n     * the builder. If this many characters are not available, the whole\n     * builder is returned. Thus the returned string may be shorter than the\n     * length requested.\n     * \n     * @param length  the number of characters to extract, negative returns empty string\n     * @return the new string\n     ",
      "child_ranges": [
        "(line 2173,col 9)-(line 2179,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.rightString(int)",
      "begin_line": 2194,
      "end_line": 2202,
      "comment": "\n     * Extracts the rightmost characters from the string builder without\n     * throwing an exception.\n     * \u003cp\u003e\n     * This method extracts the right \u003ccode\u003elength\u003c/code\u003e characters from\n     * the builder. If this many characters are not available, the whole\n     * builder is returned. Thus the returned string may be shorter than the\n     * length requested.\n     * \n     * @param length  the number of characters to extract, negative returns empty string\n     * @return the new string\n     ",
      "child_ranges": [
        "(line 2195,col 9)-(line 2201,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.midString(int, int)",
      "begin_line": 2220,
      "end_line": 2232,
      "comment": "\n     * Extracts some characters from the middle of the string builder without\n     * throwing an exception.\n     * \u003cp\u003e\n     * This method extracts \u003ccode\u003elength\u003c/code\u003e characters from the builder\n     * at the specified index.\n     * If the index is negative it is treated as zero.\n     * If the index is greater than the builder size, it is treated as the builder size.\n     * If the length is negative, the empty string is returned.\n     * If insufficient characters are available in the builder, as much as possible is returned.\n     * Thus the returned string may be shorter than the length requested.\n     * \n     * @param index  the index to start at, negative means zero\n     * @param length  the number of characters to extract, negative returns empty string\n     * @return the new string\n     ",
      "child_ranges": [
        "(line 2221,col 9)-(line 2223,col 9)",
        "(line 2224,col 9)-(line 2226,col 9)",
        "(line 2227,col 9)-(line 2231,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.contains(char)",
      "begin_line": 2241,
      "end_line": 2249,
      "comment": "\n     * Checks if the string builder contains the specified char.\n     *\n     * @param ch  the character to find\n     * @return true if the builder contains the character\n     ",
      "child_ranges": [
        "(line 2242,col 9)-(line 2242,col 32)",
        "(line 2243,col 9)-(line 2247,col 9)",
        "(line 2248,col 9)-(line 2248,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.contains(java.lang.String)",
      "begin_line": 2257,
      "end_line": 2259,
      "comment": "\n     * Checks if the string builder contains the specified string.\n     *\n     * @param str  the string to find\n     * @return true if the builder contains the string\n     ",
      "child_ranges": [
        "(line 2258,col 9)-(line 2258,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.contains(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 2272,
      "end_line": 2274,
      "comment": "\n     * Checks if the string builder contains a string matched using the\n     * specified matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to search for the character\n     * \u0027a\u0027 followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @return true if the matcher finds a match in the builder\n     ",
      "child_ranges": [
        "(line 2273,col 9)-(line 2273,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.indexOf(char)",
      "begin_line": 2283,
      "end_line": 2285,
      "comment": "\n     * Searches the string builder to find the first reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @return the first index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2284,col 9)-(line 2284,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.indexOf(char, int)",
      "begin_line": 2294,
      "end_line": 2306,
      "comment": "\n     * Searches the string builder to find the first reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the first index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2295,col 9)-(line 2295,col 55)",
        "(line 2296,col 9)-(line 2298,col 9)",
        "(line 2299,col 9)-(line 2299,col 32)",
        "(line 2300,col 9)-(line 2304,col 9)",
        "(line 2305,col 9)-(line 2305,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.indexOf(java.lang.String)",
      "begin_line": 2316,
      "end_line": 2318,
      "comment": "\n     * Searches the string builder to find the first reference to the specified string.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @return the first index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2317,col 9)-(line 2317,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.indexOf(java.lang.String, int)",
      "begin_line": 2330,
      "end_line": 2357,
      "comment": "\n     * Searches the string builder to find the first reference to the specified\n     * string starting searching from the given index.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the first index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2331,col 9)-(line 2331,col 55)",
        "(line 2332,col 9)-(line 2334,col 9)",
        "(line 2335,col 9)-(line 2335,col 34)",
        "(line 2336,col 9)-(line 2338,col 9)",
        "(line 2339,col 9)-(line 2341,col 9)",
        "(line 2342,col 9)-(line 2344,col 9)",
        "(line 2345,col 9)-(line 2345,col 32)",
        "(line 2346,col 9)-(line 2346,col 36)",
        "(line 2347,col 9)-(line 2355,col 9)",
        "(line 2356,col 9)-(line 2356,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.indexOf(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 2369,
      "end_line": 2371,
      "comment": "\n     * Searches the string builder using the matcher to find the first match.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @return the first index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2370,col 9)-(line 2370,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.indexOf(org.apache.commons.lang3.text.StrMatcher, int)",
      "begin_line": 2385,
      "end_line": 2398,
      "comment": "\n     * Searches the string builder using the matcher to find the first\n     * match searching from the given index.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the first index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2386,col 9)-(line 2386,col 55)",
        "(line 2387,col 9)-(line 2389,col 9)",
        "(line 2390,col 9)-(line 2390,col 23)",
        "(line 2391,col 9)-(line 2391,col 28)",
        "(line 2392,col 9)-(line 2396,col 9)",
        "(line 2397,col 9)-(line 2397,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.lastIndexOf(char)",
      "begin_line": 2407,
      "end_line": 2409,
      "comment": "\n     * Searches the string builder to find the last reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @return the last index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2408,col 9)-(line 2408,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.lastIndexOf(char, int)",
      "begin_line": 2418,
      "end_line": 2429,
      "comment": "\n     * Searches the string builder to find the last reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the last index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2419,col 9)-(line 2419,col 66)",
        "(line 2420,col 9)-(line 2422,col 9)",
        "(line 2423,col 9)-(line 2427,col 9)",
        "(line 2428,col 9)-(line 2428,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.lastIndexOf(java.lang.String)",
      "begin_line": 2439,
      "end_line": 2441,
      "comment": "\n     * Searches the string builder to find the last reference to the specified string.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @return the last index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2440,col 9)-(line 2440,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.lastIndexOf(java.lang.String, int)",
      "begin_line": 2453,
      "end_line": 2478,
      "comment": "\n     * Searches the string builder to find the last reference to the specified\n     * string starting searching from the given index.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the last index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2454,col 9)-(line 2454,col 66)",
        "(line 2455,col 9)-(line 2457,col 9)",
        "(line 2458,col 9)-(line 2458,col 34)",
        "(line 2459,col 9)-(line 2476,col 9)",
        "(line 2477,col 9)-(line 2477,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.lastIndexOf(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 2490,
      "end_line": 2492,
      "comment": "\n     * Searches the string builder using the matcher to find the last match.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @return the last index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2491,col 9)-(line 2491,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.lastIndexOf(org.apache.commons.lang3.text.StrMatcher, int)",
      "begin_line": 2506,
      "end_line": 2519,
      "comment": "\n     * Searches the string builder using the matcher to find the last\n     * match searching from the given index.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the last index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2507,col 9)-(line 2507,col 66)",
        "(line 2508,col 9)-(line 2510,col 9)",
        "(line 2511,col 9)-(line 2511,col 28)",
        "(line 2512,col 9)-(line 2512,col 38)",
        "(line 2513,col 9)-(line 2517,col 9)",
        "(line 2518,col 9)-(line 2518,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.asTokenizer()",
      "begin_line": 2554,
      "end_line": 2556,
      "comment": "\n     * Creates a tokenizer that can tokenize the contents of this builder.\n     * \u003cp\u003e\n     * This method allows the contents of this builder to be tokenized.\n     * The tokenizer will be setup by default to tokenize on space, tab,\n     * newline and formfeed (as per StringTokenizer). These values can be\n     * changed on the tokenizer class, before retrieving the tokens.\n     * \u003cp\u003e\n     * The returned tokenizer is linked to this builder. You may intermix\n     * calls to the buider and tokenizer within certain limits, however\n     * there is no synchronization. Once the tokenizer has been used once,\n     * it must be {@link StrTokenizer#reset() reset} to pickup the latest\n     * changes in the builder. For example:\n     * \u003cpre\u003e\n     * StrBuilder b \u003d new StrBuilder();\n     * b.append(\"a b \");\n     * StrTokenizer t \u003d b.asTokenizer();\n     * String[] tokens1 \u003d t.getTokenArray();  // returns a,b\n     * b.append(\"c d \");\n     * String[] tokens2 \u003d t.getTokenArray();  // returns a,b (c and d ignored)\n     * t.reset();              // reset causes builder changes to be picked up\n     * String[] tokens3 \u003d t.getTokenArray();  // returns a,b,c,d\n     * \u003c/pre\u003e\n     * In addition to simply intermixing appends and tokenization, you can also\n     * call the set methods on the tokenizer to alter how it tokenizes. Just\n     * remember to call reset when you want to pickup builder changes.\n     * \u003cp\u003e\n     * Calling {@link StrTokenizer#reset(String)} or {@link StrTokenizer#reset(char[])}\n     * with a non-null value will break the link with the builder.\n     *\n     * @return a tokenizer that is linked to this builder\n     ",
      "child_ranges": [
        "(line 2555,col 9)-(line 2555,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.asReader()",
      "begin_line": 2578,
      "end_line": 2580,
      "comment": "\n     * Gets the contents of this builder as a Reader.\n     * \u003cp\u003e\n     * This method allows the contents of the builder to be read\n     * using any standard method that expects a Reader.\n     * \u003cp\u003e\n     * To use, simply create a \u003ccode\u003eStrBuilder\u003c/code\u003e, populate it with\n     * data, call \u003ccode\u003easReader\u003c/code\u003e, and then read away.\n     * \u003cp\u003e\n     * The internal character array is shared between the builder and the reader.\n     * This allows you to append to the builder after creating the reader,\n     * and the changes will be picked up.\n     * Note however, that no synchronization occurs, so you must perform\n     * all operations with the builder and the reader in one thread.\n     * \u003cp\u003e\n     * The returned reader supports marking, and ignores the flush method.\n     *\n     * @return a reader that reads from this builder\n     ",
      "child_ranges": [
        "(line 2579,col 9)-(line 2579,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.asWriter()",
      "begin_line": 2603,
      "end_line": 2605,
      "comment": "\n     * Gets this builder as a Writer that can be written to.\n     * \u003cp\u003e\n     * This method allows you to populate the contents of the builder\n     * using any standard method that takes a Writer.\n     * \u003cp\u003e\n     * To use, simply create a \u003ccode\u003eStrBuilder\u003c/code\u003e,\n     * call \u003ccode\u003easWriter\u003c/code\u003e, and populate away. The data is available\n     * at any time using the methods of the \u003ccode\u003eStrBuilder\u003c/code\u003e.\n     * \u003cp\u003e\n     * The internal character array is shared between the builder and the writer.\n     * This allows you to intermix calls that append to the builder and\n     * write using the writer and the changes will be occur correctly.\n     * Note however, that no synchronization occurs, so you must perform\n     * all operations with the builder and the writer in one thread.\n     * \u003cp\u003e\n     * The returned writer ignores the close and flush methods.\n     *\n     * @return a writer that populates this builder\n     ",
      "child_ranges": [
        "(line 2604,col 9)-(line 2604,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.equalsIgnoreCase(org.apache.commons.lang3.text.StrBuilder)",
      "begin_line": 2645,
      "end_line": 2662,
      "comment": "\n     * Checks the contents of this builder against another to see if they\n     * contain the same character content ignoring case.\n     *\n     * @param other  the object to check, null returns false\n     * @return true if the builders contain the same characters in the same order\n     ",
      "child_ranges": [
        "(line 2646,col 9)-(line 2648,col 9)",
        "(line 2649,col 9)-(line 2651,col 9)",
        "(line 2652,col 9)-(line 2652,col 37)",
        "(line 2653,col 9)-(line 2653,col 39)",
        "(line 2654,col 9)-(line 2660,col 9)",
        "(line 2661,col 9)-(line 2661,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.equals(org.apache.commons.lang3.text.StrBuilder)",
      "begin_line": 2671,
      "end_line": 2686,
      "comment": "\n     * Checks the contents of this builder against another to see if they\n     * contain the same character content.\n     *\n     * @param other  the object to check, null returns false\n     * @return true if the builders contain the same characters in the same order\n     ",
      "child_ranges": [
        "(line 2672,col 9)-(line 2674,col 9)",
        "(line 2675,col 9)-(line 2677,col 9)",
        "(line 2678,col 9)-(line 2678,col 37)",
        "(line 2679,col 9)-(line 2679,col 39)",
        "(line 2680,col 9)-(line 2684,col 9)",
        "(line 2685,col 9)-(line 2685,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.equals(java.lang.Object)",
      "begin_line": 2695,
      "end_line": 2701,
      "comment": "\n     * Checks the contents of this builder against another to see if they\n     * contain the same character content.\n     *\n     * @param obj  the object to check, null returns false\n     * @return true if the builders contain the same characters in the same order\n     ",
      "child_ranges": [
        "(line 2697,col 9)-(line 2699,col 9)",
        "(line 2700,col 9)-(line 2700,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.hashCode()",
      "begin_line": 2708,
      "end_line": 2716,
      "comment": "\n     * Gets a suitable hash code for this builder.\n     *\n     * @return a hash code\n     ",
      "child_ranges": [
        "(line 2710,col 9)-(line 2710,col 28)",
        "(line 2711,col 9)-(line 2711,col 21)",
        "(line 2712,col 9)-(line 2714,col 9)",
        "(line 2715,col 9)-(line 2715,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.toString()",
      "begin_line": 2728,
      "end_line": 2731,
      "comment": "\n     * Gets a String version of the string builder, creating a new instance\n     * each time the method is called.\n     * \u003cp\u003e\n     * Note that unlike StringBuffer, the string version returned is\n     * independent of the string builder.\n     *\n     * @return the builder as a String\n     ",
      "child_ranges": [
        "(line 2730,col 9)-(line 2730,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.toStringBuffer()",
      "begin_line": 2739,
      "end_line": 2741,
      "comment": "\n     * Gets a StringBuffer version of the string builder, creating a\n     * new instance each time the method is called.\n     *\n     * @return the builder as a StringBuffer\n     ",
      "child_ranges": [
        "(line 2740,col 9)-(line 2740,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.toStringBuilder()",
      "begin_line": 2750,
      "end_line": 2752,
      "comment": "\n     * Gets a StringBuilder version of the string builder, creating a\n     * new instance each time the method is called.\n     *\n     * @return the builder as a StringBuilder\n     * @since Apache Commons Lang 3.2\n     ",
      "child_ranges": [
        "(line 2751,col 9)-(line 2751,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.build()",
      "begin_line": 2760,
      "end_line": 2763,
      "comment": "\n     * Implement the {@link Builder} interface.\n     * @return the builder as a String\n     * @since Apache Commons Lang 3.2\n     * @see #toString()\n     ",
      "child_ranges": [
        "(line 2762,col 9)-(line 2762,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.validateRange(int, int)",
      "begin_line": 2775,
      "end_line": 2786,
      "comment": "\n     * Validates parameters defining a range of the builder.\n     * \n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @return the new string\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 2776,col 9)-(line 2778,col 9)",
        "(line 2779,col 9)-(line 2781,col 9)",
        "(line 2782,col 9)-(line 2784,col 9)",
        "(line 2785,col 9)-(line 2785,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.validateIndex(int)",
      "begin_line": 2794,
      "end_line": 2798,
      "comment": "\n     * Validates parameters defining a single index in the builder.\n     * \n     * @param index  the index, must be valid\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 2795,col 9)-(line 2797,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StrBuilderTokenizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.StrTokenizer"
      ],
      "begin_line": 2804,
      "end_line": 2833,
      "comment": "\n     * Inner class to allow StrBuilder to operate as a tokenizer.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderTokenizer.StrBuilderTokenizer()",
      "begin_line": 2809,
      "end_line": 2811,
      "comment": "\n         * Default constructor.\n         ",
      "child_ranges": [
        "(line 2810,col 13)-(line 2810,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderTokenizer.tokenize(char[], int, int)",
      "begin_line": 2814,
      "end_line": 2821,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2816,col 13)-(line 2820,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderTokenizer.getContent()",
      "begin_line": 2824,
      "end_line": 2832,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2826,col 13)-(line 2826,col 44)",
        "(line 2827,col 13)-(line 2831,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StrBuilderReader",
      "is_interface": false,
      "parent_types": [
        "java.io.Reader"
      ],
      "begin_line": 2839,
      "end_line": 2924,
      "comment": "\n     * Inner class to allow StrBuilder to operate as a writer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 2841,
      "end_line": 2841,
      "comment": " The current stream position. "
    },
    {
      "type": "field",
      "varNames": [
        "mark"
      ],
      "begin_line": 2843,
      "end_line": 2843,
      "comment": " The last mark position. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.StrBuilderReader()",
      "begin_line": 2848,
      "end_line": 2850,
      "comment": "\n         * Default constructor.\n         ",
      "child_ranges": [
        "(line 2849,col 13)-(line 2849,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.close()",
      "begin_line": 2853,
      "end_line": 2856,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.read()",
      "begin_line": 2859,
      "end_line": 2865,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2861,col 13)-(line 2863,col 13)",
        "(line 2864,col 13)-(line 2864,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.read(char[], int, int)",
      "begin_line": 2868,
      "end_line": 2886,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2870,col 13)-(line 2873,col 13)",
        "(line 2874,col 13)-(line 2876,col 13)",
        "(line 2877,col 13)-(line 2879,col 13)",
        "(line 2880,col 13)-(line 2882,col 13)",
        "(line 2883,col 13)-(line 2883,col 61)",
        "(line 2884,col 13)-(line 2884,col 23)",
        "(line 2885,col 13)-(line 2885,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.skip(long)",
      "begin_line": 2889,
      "end_line": 2899,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2891,col 13)-(line 2893,col 13)",
        "(line 2894,col 13)-(line 2896,col 13)",
        "(line 2897,col 13)-(line 2897,col 21)",
        "(line 2898,col 13)-(line 2898,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.ready()",
      "begin_line": 2902,
      "end_line": 2905,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2904,col 13)-(line 2904,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.markSupported()",
      "begin_line": 2908,
      "end_line": 2911,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2910,col 13)-(line 2910,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.mark(int)",
      "begin_line": 2914,
      "end_line": 2917,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2916,col 13)-(line 2916,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.reset()",
      "begin_line": 2920,
      "end_line": 2923,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2922,col 13)-(line 2922,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StrBuilderWriter",
      "is_interface": false,
      "parent_types": [
        "java.io.Writer"
      ],
      "begin_line": 2930,
      "end_line": 2980,
      "comment": "\n     * Inner class to allow StrBuilder to operate as a writer.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter.StrBuilderWriter()",
      "begin_line": 2935,
      "end_line": 2937,
      "comment": "\n         * Default constructor.\n         ",
      "child_ranges": [
        "(line 2936,col 13)-(line 2936,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter.close()",
      "begin_line": 2940,
      "end_line": 2943,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter.flush()",
      "begin_line": 2946,
      "end_line": 2949,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter.write(int)",
      "begin_line": 2952,
      "end_line": 2955,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2954,col 13)-(line 2954,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter.write(char[])",
      "begin_line": 2958,
      "end_line": 2961,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2960,col 13)-(line 2960,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter.write(char[], int, int)",
      "begin_line": 2964,
      "end_line": 2967,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2966,col 13)-(line 2966,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter.write(java.lang.String)",
      "begin_line": 2970,
      "end_line": 2973,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2972,col 13)-(line 2972,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter.write(java.lang.String, int, int)",
      "begin_line": 2976,
      "end_line": 2979,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2978,col 13)-(line 2978,col 50)"
      ]
    }
  ]
}