{
  "filepath": "/tmp/Lang-6b/src/main/java/org/apache/commons/lang3/text/StrBuilder.java",
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
      "end_line": 2903,
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
      "begin_line": 532,
      "end_line": 549,
      "comment": "\n     * Appends part of a string to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 533,col 9)-(line 535,col 9)",
        "(line 536,col 9)-(line 538,col 9)",
        "(line 539,col 9)-(line 541,col 9)",
        "(line 542,col 9)-(line 547,col 9)",
        "(line 548,col 9)-(line 548,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(java.lang.String, java.lang.Object...)",
      "begin_line": 560,
      "end_line": 562,
      "comment": "\n     * Calls {@link String#format(String, Object...)} and appends the result.\n     *\n     * @param format the format string\n     * @param objs the objects to use in the format string\n     * @return {@code this} to enable chaining\n     * @see String#format(String, Object...)\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(java.lang.StringBuffer)",
      "begin_line": 571,
      "end_line": 583,
      "comment": "\n     * Appends a string buffer to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string buffer to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 572,col 9)-(line 574,col 9)",
        "(line 575,col 9)-(line 575,col 34)",
        "(line 576,col 9)-(line 581,col 9)",
        "(line 582,col 9)-(line 582,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(java.lang.StringBuffer, int, int)",
      "begin_line": 594,
      "end_line": 611,
      "comment": "\n     * Appends part of a string buffer to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 595,col 9)-(line 597,col 9)",
        "(line 598,col 9)-(line 600,col 9)",
        "(line 601,col 9)-(line 603,col 9)",
        "(line 604,col 9)-(line 609,col 9)",
        "(line 610,col 9)-(line 610,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(org.apache.commons.lang3.text.StrBuilder)",
      "begin_line": 620,
      "end_line": 632,
      "comment": "\n     * Appends another string builder to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string builder to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 621,col 9)-(line 623,col 9)",
        "(line 624,col 9)-(line 624,col 34)",
        "(line 625,col 9)-(line 630,col 9)",
        "(line 631,col 9)-(line 631,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(org.apache.commons.lang3.text.StrBuilder, int, int)",
      "begin_line": 643,
      "end_line": 660,
      "comment": "\n     * Appends part of a string builder to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 644,col 9)-(line 646,col 9)",
        "(line 647,col 9)-(line 649,col 9)",
        "(line 650,col 9)-(line 652,col 9)",
        "(line 653,col 9)-(line 658,col 9)",
        "(line 659,col 9)-(line 659,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(char[])",
      "begin_line": 669,
      "end_line": 681,
      "comment": "\n     * Appends a char array to the string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param chars  the char array to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 670,col 9)-(line 672,col 9)",
        "(line 673,col 9)-(line 673,col 34)",
        "(line 674,col 9)-(line 679,col 9)",
        "(line 680,col 9)-(line 680,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(char[], int, int)",
      "begin_line": 692,
      "end_line": 709,
      "comment": "\n     * Appends a char array to the string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param chars  the char array to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 693,col 9)-(line 695,col 9)",
        "(line 696,col 9)-(line 698,col 9)",
        "(line 699,col 9)-(line 701,col 9)",
        "(line 702,col 9)-(line 707,col 9)",
        "(line 708,col 9)-(line 708,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(boolean)",
      "begin_line": 717,
      "end_line": 733,
      "comment": "\n     * Appends a boolean value to the string builder.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 718,col 9)-(line 731,col 9)",
        "(line 732,col 9)-(line 732,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(char)",
      "begin_line": 742,
      "end_line": 748,
      "comment": "\n     * Appends a char value to the string builder.\n     *\n     * @param ch  the value to append\n     * @return this, to enable chaining\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 744,col 9)-(line 744,col 27)",
        "(line 745,col 9)-(line 745,col 32)",
        "(line 746,col 9)-(line 746,col 28)",
        "(line 747,col 9)-(line 747,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(int)",
      "begin_line": 756,
      "end_line": 758,
      "comment": "\n     * Appends an int value to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 757,col 9)-(line 757,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(long)",
      "begin_line": 766,
      "end_line": 768,
      "comment": "\n     * Appends a long value to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 767,col 9)-(line 767,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(float)",
      "begin_line": 776,
      "end_line": 778,
      "comment": "\n     * Appends a float value to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 777,col 9)-(line 777,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(double)",
      "begin_line": 786,
      "end_line": 788,
      "comment": "\n     * Appends a double value to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 787,col 9)-(line 787,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(java.lang.Object)",
      "begin_line": 799,
      "end_line": 801,
      "comment": "\n     * Appends an object followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param obj  the object to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 800,col 9)-(line 800,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(java.lang.String)",
      "begin_line": 811,
      "end_line": 813,
      "comment": "\n     * Appends a string followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 812,col 9)-(line 812,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(java.lang.String, int, int)",
      "begin_line": 825,
      "end_line": 827,
      "comment": "\n     * Appends part of a string followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 826,col 9)-(line 826,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(java.lang.String, java.lang.Object...)",
      "begin_line": 838,
      "end_line": 840,
      "comment": "\n     * Calls {@link String#format(String, Object...)} and appends the result.\n     *\n     * @param format the format string\n     * @param objs the objects to use in the format string\n     * @return {@code this} to enable chaining\n     * @see String#format(String, Object...)\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 839,col 9)-(line 839,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(java.lang.StringBuffer)",
      "begin_line": 850,
      "end_line": 852,
      "comment": "\n     * Appends a string buffer followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string buffer to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 851,col 9)-(line 851,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(java.lang.StringBuffer, int, int)",
      "begin_line": 864,
      "end_line": 866,
      "comment": "\n     * Appends part of a string buffer followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 865,col 9)-(line 865,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(org.apache.commons.lang3.text.StrBuilder)",
      "begin_line": 876,
      "end_line": 878,
      "comment": "\n     * Appends another string builder followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string builder to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 877,col 9)-(line 877,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(org.apache.commons.lang3.text.StrBuilder, int, int)",
      "begin_line": 890,
      "end_line": 892,
      "comment": "\n     * Appends part of a string builder followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 891,col 9)-(line 891,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(char[])",
      "begin_line": 902,
      "end_line": 904,
      "comment": "\n     * Appends a char array followed by a new line to the string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param chars  the char array to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 903,col 9)-(line 903,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(char[], int, int)",
      "begin_line": 916,
      "end_line": 918,
      "comment": "\n     * Appends a char array followed by a new line to the string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param chars  the char array to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 917,col 9)-(line 917,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(boolean)",
      "begin_line": 927,
      "end_line": 929,
      "comment": "\n     * Appends a boolean value followed by a new line to the string builder.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 928,col 9)-(line 928,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(char)",
      "begin_line": 938,
      "end_line": 940,
      "comment": "\n     * Appends a char value followed by a new line to the string builder.\n     *\n     * @param ch  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 939,col 9)-(line 939,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(int)",
      "begin_line": 949,
      "end_line": 951,
      "comment": "\n     * Appends an int value followed by a new line to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 950,col 9)-(line 950,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(long)",
      "begin_line": 960,
      "end_line": 962,
      "comment": "\n     * Appends a long value followed by a new line to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 961,col 9)-(line 961,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(float)",
      "begin_line": 971,
      "end_line": 973,
      "comment": "\n     * Appends a float value followed by a new line to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 972,col 9)-(line 972,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(double)",
      "begin_line": 982,
      "end_line": 984,
      "comment": "\n     * Appends a double value followed by a new line to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 983,col 9)-(line 983,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendAll(T...)",
      "begin_line": 996,
      "end_line": 1003,
      "comment": "\n     * Appends each item in an array to the builder without any separators.\n     * Appending a null array will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param array  the array to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 997,col 9)-(line 1001,col 9)",
        "(line 1002,col 9)-(line 1002,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendAll(java.lang.Iterable\u003c?\u003e)",
      "begin_line": 1014,
      "end_line": 1021,
      "comment": "\n     * Appends each item in a iterable to the builder without any separators.\n     * Appending a null iterable will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param iterable  the iterable to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1015,col 9)-(line 1019,col 9)",
        "(line 1020,col 9)-(line 1020,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendAll(java.util.Iterator\u003c?\u003e)",
      "begin_line": 1032,
      "end_line": 1039,
      "comment": "\n     * Appends each item in an iterator to the builder without any separators.\n     * Appending a null iterator will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param it  the iterator to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1033,col 9)-(line 1037,col 9)",
        "(line 1038,col 9)-(line 1038,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendWithSeparators(java.lang.Object[], java.lang.String)",
      "begin_line": 1052,
      "end_line": 1062,
      "comment": "\n     * Appends an array placing separators between each value, but\n     * not before the first or after the last.\n     * Appending a null array will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param array  the array to append\n     * @param separator  the separator to use, null means no separator\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1053,col 9)-(line 1060,col 9)",
        "(line 1061,col 9)-(line 1061,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendWithSeparators(java.lang.Iterable\u003c?\u003e, java.lang.String)",
      "begin_line": 1074,
      "end_line": 1086,
      "comment": "\n     * Appends a iterable placing separators between each value, but\n     * not before the first or after the last.\n     * Appending a null iterable will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param iterable  the iterable to append\n     * @param separator  the separator to use, null means no separator\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1075,col 9)-(line 1084,col 9)",
        "(line 1085,col 9)-(line 1085,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendWithSeparators(java.util.Iterator\u003c?\u003e, java.lang.String)",
      "begin_line": 1098,
      "end_line": 1109,
      "comment": "\n     * Appends an iterator placing separators between each value, but\n     * not before the first or after the last.\n     * Appending a null iterator will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param it  the iterator to append\n     * @param separator  the separator to use, null means no separator\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1099,col 9)-(line 1107,col 9)",
        "(line 1108,col 9)-(line 1108,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendSeparator(java.lang.String)",
      "begin_line": 1132,
      "end_line": 1134,
      "comment": "\n     * Appends a separator if the builder is currently non-empty.\n     * Appending a null separator will have no effect.\n     * The separator is appended using {@link #append(String)}.\n     * \u003cp\u003e\n     * This method is useful for adding a separator each time around the\n     * loop except the first.\n     * \u003cpre\u003e\n     * for (Iterator it \u003d list.iterator(); it.hasNext(); ) {\n     *   appendSeparator(\",\");\n     *   append(it.next());\n     * }\n     * \u003c/pre\u003e\n     * Note that for this simple example, you should use\n     * {@link #appendWithSeparators(Iterable, String)}.\n     * \n     * @param separator  the separator to use, null means no separator\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1133,col 9)-(line 1133,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendSeparator(java.lang.String, java.lang.String)",
      "begin_line": 1163,
      "end_line": 1169,
      "comment": "\n     * Appends one of both separators to the StrBuilder.\n     * If the builder is currently empty it will append the defaultIfEmpty-separator\n     * Otherwise it will append the standard-separator\n     * \n     * Appending a null separator will have no effect.\n     * The separator is appended using {@link #append(String)}.\n     * \u003cp\u003e\n     * This method is for example useful for constructing queries\n     * \u003cpre\u003e\n     * StrBuilder whereClause \u003d new StrBuilder();\n     * if(searchCommand.getPriority() !\u003d null) {\n     *  whereClause.appendSeparator(\" and\", \" where\");\n     *  whereClause.append(\" priority \u003d ?\")\n     * }\n     * if(searchCommand.getComponent() !\u003d null) {\n     *  whereClause.appendSeparator(\" and\", \" where\");\n     *  whereClause.append(\" component \u003d ?\")\n     * }\n     * selectClause.append(whereClause)\n     * \u003c/pre\u003e\n     * \n     * @param standard the separator if builder is not empty, null means no separator\n     * @param defaultIfEmpty the separator if builder is empty, null means no separator\n     * @return this, to enable chaining\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 1164,col 9)-(line 1164,col 59)",
        "(line 1165,col 9)-(line 1167,col 9)",
        "(line 1168,col 9)-(line 1168,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendSeparator(char)",
      "begin_line": 1190,
      "end_line": 1195,
      "comment": "\n     * Appends a separator if the builder is currently non-empty.\n     * The separator is appended using {@link #append(char)}.\n     * \u003cp\u003e\n     * This method is useful for adding a separator each time around the\n     * loop except the first.\n     * \u003cpre\u003e\n     * for (Iterator it \u003d list.iterator(); it.hasNext(); ) {\n     *   appendSeparator(\u0027,\u0027);\n     *   append(it.next());\n     * }\n     * \u003c/pre\u003e\n     * Note that for this simple example, you should use\n     * {@link #appendWithSeparators(Iterable, String)}.\n     * \n     * @param separator  the separator to use\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1191,col 9)-(line 1193,col 9)",
        "(line 1194,col 9)-(line 1194,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendSeparator(char, char)",
      "begin_line": 1208,
      "end_line": 1215,
      "comment": "\n     * Append one of both separators to the builder\n     * If the builder is currently empty it will append the defaultIfEmpty-separator\n     * Otherwise it will append the standard-separator\n     *\n     * The separator is appended using {@link #append(char)}.\n     * @param standard the separator if builder is not empty\n     * @param defaultIfEmpty the separator if builder is empty\n     * @return this, to enable chaining\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 1209,col 9)-(line 1213,col 9)",
        "(line 1214,col 9)-(line 1214,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendSeparator(java.lang.String, int)",
      "begin_line": 1237,
      "end_line": 1242,
      "comment": "\n     * Appends a separator to the builder if the loop index is greater than zero.\n     * Appending a null separator will have no effect.\n     * The separator is appended using {@link #append(String)}.\n     * \u003cp\u003e\n     * This method is useful for adding a separator each time around the\n     * loop except the first.\n     * \u003cpre\u003e\n     * for (int i \u003d 0; i \u003c list.size(); i++) {\n     *   appendSeparator(\",\", i);\n     *   append(list.get(i));\n     * }\n     * \u003c/pre\u003e\n     * Note that for this simple example, you should use\n     * {@link #appendWithSeparators(Iterable, String)}.\n     * \n     * @param separator  the separator to use, null means no separator\n     * @param loopIndex  the loop index\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1238,col 9)-(line 1240,col 9)",
        "(line 1241,col 9)-(line 1241,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendSeparator(char, int)",
      "begin_line": 1264,
      "end_line": 1269,
      "comment": "\n     * Appends a separator to the builder if the loop index is greater than zero.\n     * The separator is appended using {@link #append(char)}.\n     * \u003cp\u003e\n     * This method is useful for adding a separator each time around the\n     * loop except the first.\n     * \u003cpre\u003e\n     * for (int i \u003d 0; i \u003c list.size(); i++) {\n     *   appendSeparator(\",\", i);\n     *   append(list.get(i));\n     * }\n     * \u003c/pre\u003e\n     * Note that for this simple example, you should use\n     * {@link #appendWithSeparators(Iterable, String)}.\n     * \n     * @param separator  the separator to use\n     * @param loopIndex  the loop index\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1265,col 9)-(line 1267,col 9)",
        "(line 1268,col 9)-(line 1268,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendPadding(int, char)",
      "begin_line": 1279,
      "end_line": 1287,
      "comment": "\n     * Appends the pad character to the builder the specified number of times.\n     * \n     * @param length  the length to append, negative means no append\n     * @param padChar  the character to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1280,col 9)-(line 1285,col 9)",
        "(line 1286,col 9)-(line 1286,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendFixedWidthPadLeft(java.lang.Object, int, char)",
      "begin_line": 1301,
      "end_line": 1321,
      "comment": "\n     * Appends an object to the builder padding on the left to a fixed width.\n     * The \u003ccode\u003etoString\u003c/code\u003e of the object is used.\n     * If the object is larger than the length, the left hand side is lost.\n     * If the object is null, the null text value is used.\n     * \n     * @param obj  the object to append, null uses null text\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1302,col 9)-(line 1319,col 9)",
        "(line 1320,col 9)-(line 1320,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendFixedWidthPadLeft(int, int, char)",
      "begin_line": 1333,
      "end_line": 1335,
      "comment": "\n     * Appends an object to the builder padding on the left to a fixed width.\n     * The \u003ccode\u003eString.valueOf\u003c/code\u003e of the \u003ccode\u003eint\u003c/code\u003e value is used.\n     * If the formatted value is larger than the length, the left hand side is lost.\n     * \n     * @param value  the value to append\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1334,col 9)-(line 1334,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendFixedWidthPadRight(java.lang.Object, int, char)",
      "begin_line": 1348,
      "end_line": 1368,
      "comment": "\n     * Appends an object to the builder padding on the right to a fixed length.\n     * The \u003ccode\u003etoString\u003c/code\u003e of the object is used.\n     * If the object is larger than the length, the right hand side is lost.\n     * If the object is null, null text value is used.\n     * \n     * @param obj  the object to append, null uses null text\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1349,col 9)-(line 1366,col 9)",
        "(line 1367,col 9)-(line 1367,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendFixedWidthPadRight(int, int, char)",
      "begin_line": 1380,
      "end_line": 1382,
      "comment": "\n     * Appends an object to the builder padding on the right to a fixed length.\n     * The \u003ccode\u003eString.valueOf\u003c/code\u003e of the \u003ccode\u003eint\u003c/code\u003e value is used.\n     * If the object is larger than the length, the right hand side is lost.\n     * \n     * @param value  the value to append\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1381,col 9)-(line 1381,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, java.lang.Object)",
      "begin_line": 1394,
      "end_line": 1399,
      "comment": "\n     * Inserts the string representation of an object into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param obj  the object to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1395,col 9)-(line 1397,col 9)",
        "(line 1398,col 9)-(line 1398,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, java.lang.String)",
      "begin_line": 1410,
      "end_line": 1425,
      "comment": "\n     * Inserts the string into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param str  the string to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1412,col 9)-(line 1412,col 29)",
        "(line 1413,col 9)-(line 1415,col 9)",
        "(line 1416,col 9)-(line 1416,col 54)",
        "(line 1417,col 9)-(line 1423,col 9)",
        "(line 1424,col 9)-(line 1424,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, char[])",
      "begin_line": 1436,
      "end_line": 1449,
      "comment": "\n     * Inserts the character array into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param chars  the char array to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1437,col 9)-(line 1437,col 29)",
        "(line 1438,col 9)-(line 1440,col 9)",
        "(line 1441,col 9)-(line 1441,col 31)",
        "(line 1442,col 9)-(line 1447,col 9)",
        "(line 1448,col 9)-(line 1448,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, char[], int, int)",
      "begin_line": 1462,
      "end_line": 1480,
      "comment": "\n     * Inserts part of the character array into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param chars  the char array to insert\n     * @param offset  the offset into the character array to start at, must be valid\n     * @param length  the length of the character array part to copy, must be positive\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 1463,col 9)-(line 1463,col 29)",
        "(line 1464,col 9)-(line 1466,col 9)",
        "(line 1467,col 9)-(line 1469,col 9)",
        "(line 1470,col 9)-(line 1472,col 9)",
        "(line 1473,col 9)-(line 1478,col 9)",
        "(line 1479,col 9)-(line 1479,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, boolean)",
      "begin_line": 1490,
      "end_line": 1511,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1491,col 9)-(line 1491,col 29)",
        "(line 1492,col 9)-(line 1509,col 9)",
        "(line 1510,col 9)-(line 1510,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, char)",
      "begin_line": 1521,
      "end_line": 1528,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1522,col 9)-(line 1522,col 29)",
        "(line 1523,col 9)-(line 1523,col 33)",
        "(line 1524,col 9)-(line 1524,col 73)",
        "(line 1525,col 9)-(line 1525,col 30)",
        "(line 1526,col 9)-(line 1526,col 15)",
        "(line 1527,col 9)-(line 1527,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, int)",
      "begin_line": 1538,
      "end_line": 1540,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1539,col 9)-(line 1539,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, long)",
      "begin_line": 1550,
      "end_line": 1552,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1551,col 9)-(line 1551,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, float)",
      "begin_line": 1562,
      "end_line": 1564,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1563,col 9)-(line 1563,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, double)",
      "begin_line": 1574,
      "end_line": 1576,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1575,col 9)-(line 1575,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.deleteImpl(int, int, int)",
      "begin_line": 1587,
      "end_line": 1590,
      "comment": "\n     * Internal method to delete a range without validation.\n     *\n     * @param startIndex  the start index, must be valid\n     * @param endIndex  the end index (exclusive), must be valid\n     * @param len  the length, must be valid\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 1588,col 9)-(line 1588,col 80)",
        "(line 1589,col 9)-(line 1589,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.delete(int, int)",
      "begin_line": 1601,
      "end_line": 1608,
      "comment": "\n     * Deletes the characters between the two specified indices.\n     *\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1602,col 9)-(line 1602,col 55)",
        "(line 1603,col 9)-(line 1603,col 40)",
        "(line 1604,col 9)-(line 1606,col 9)",
        "(line 1607,col 9)-(line 1607,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.deleteAll(char)",
      "begin_line": 1617,
      "end_line": 1632,
      "comment": "\n     * Deletes the character wherever it occurs in the builder.\n     *\n     * @param ch  the character to delete\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1618,col 9)-(line 1630,col 9)",
        "(line 1631,col 9)-(line 1631,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.deleteFirst(char)",
      "begin_line": 1640,
      "end_line": 1648,
      "comment": "\n     * Deletes the character wherever it occurs in the builder.\n     *\n     * @param ch  the character to delete\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1641,col 9)-(line 1646,col 9)",
        "(line 1647,col 9)-(line 1647,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.deleteAll(java.lang.String)",
      "begin_line": 1657,
      "end_line": 1667,
      "comment": "\n     * Deletes the string wherever it occurs in the builder.\n     *\n     * @param str  the string to delete, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1658,col 9)-(line 1658,col 51)",
        "(line 1659,col 9)-(line 1665,col 9)",
        "(line 1666,col 9)-(line 1666,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.deleteFirst(java.lang.String)",
      "begin_line": 1675,
      "end_line": 1684,
      "comment": "\n     * Deletes the string wherever it occurs in the builder.\n     *\n     * @param str  the string to delete, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1676,col 9)-(line 1676,col 51)",
        "(line 1677,col 9)-(line 1682,col 9)",
        "(line 1683,col 9)-(line 1683,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.deleteAll(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 1697,
      "end_line": 1699,
      "comment": "\n     * Deletes all parts of the builder that the matcher matches.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced deletion behaviour.\n     * For example you could write a matcher to delete all occurrences\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1698,col 9)-(line 1698,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.deleteFirst(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 1711,
      "end_line": 1713,
      "comment": "\n     * Deletes the first match within the builder using the specified matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced deletion behaviour.\n     * For example you could write a matcher to delete\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1712,col 9)-(line 1712,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replaceImpl(int, int, int, java.lang.String, int)",
      "begin_line": 1726,
      "end_line": 1736,
      "comment": "\n     * Internal method to delete a range without validation.\n     *\n     * @param startIndex  the start index, must be valid\n     * @param endIndex  the end index (exclusive), must be valid\n     * @param removeLen  the length to remove (endIndex - startIndex), must be valid\n     * @param insertStr  the string to replace with, null means delete range\n     * @param insertLen  the length of the insert string, must be valid\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 1727,col 9)-(line 1727,col 51)",
        "(line 1728,col 9)-(line 1732,col 9)",
        "(line 1733,col 9)-(line 1735,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replace(int, int, java.lang.String)",
      "begin_line": 1749,
      "end_line": 1754,
      "comment": "\n     * Replaces a portion of the string builder with another string.\n     * The length of the inserted string does not have to match the removed length.\n     *\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @param replaceStr  the string to replace with, null means delete range\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1750,col 9)-(line 1750,col 55)",
        "(line 1751,col 9)-(line 1751,col 71)",
        "(line 1752,col 9)-(line 1752,col 88)",
        "(line 1753,col 9)-(line 1753,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replaceAll(char, char)",
      "begin_line": 1765,
      "end_line": 1774,
      "comment": "\n     * Replaces the search character with the replace character\n     * throughout the builder.\n     *\n     * @param search  the search character\n     * @param replace  the replace character\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1766,col 9)-(line 1772,col 9)",
        "(line 1773,col 9)-(line 1773,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replaceFirst(char, char)",
      "begin_line": 1784,
      "end_line": 1794,
      "comment": "\n     * Replaces the first instance of the search character with the\n     * replace character in the builder.\n     *\n     * @param search  the search character\n     * @param replace  the replace character\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1785,col 9)-(line 1792,col 9)",
        "(line 1793,col 9)-(line 1793,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replaceAll(java.lang.String, java.lang.String)",
      "begin_line": 1804,
      "end_line": 1815,
      "comment": "\n     * Replaces the search string with the replace string throughout the builder.\n     *\n     * @param searchStr  the search string, null causes no action to occur\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1805,col 9)-(line 1805,col 69)",
        "(line 1806,col 9)-(line 1813,col 9)",
        "(line 1814,col 9)-(line 1814,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replaceFirst(java.lang.String, java.lang.String)",
      "begin_line": 1824,
      "end_line": 1834,
      "comment": "\n     * Replaces the first instance of the search string with the replace string.\n     *\n     * @param searchStr  the search string, null causes no action to occur\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1825,col 9)-(line 1825,col 69)",
        "(line 1826,col 9)-(line 1832,col 9)",
        "(line 1833,col 9)-(line 1833,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replaceAll(org.apache.commons.lang3.text.StrMatcher, java.lang.String)",
      "begin_line": 1848,
      "end_line": 1850,
      "comment": "\n     * Replaces all matches within the builder with the replace string.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced replace behaviour.\n     * For example you could write a matcher to replace all occurrences\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1849,col 9)-(line 1849,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replaceFirst(org.apache.commons.lang3.text.StrMatcher, java.lang.String)",
      "begin_line": 1863,
      "end_line": 1865,
      "comment": "\n     * Replaces the first match within the builder with the replace string.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced replace behaviour.\n     * For example you could write a matcher to replace\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1864,col 9)-(line 1864,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replace(org.apache.commons.lang3.text.StrMatcher, java.lang.String, int, int, int)",
      "begin_line": 1884,
      "end_line": 1889,
      "comment": "\n     * Advanced search and replaces within the builder using a matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced behaviour.\n     * For example you could write a matcher to delete all occurrences\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the string to replace the match with, null is a delete\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @param replaceCount  the number of times to replace, -1 for replace all\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if start index is invalid\n     ",
      "child_ranges": [
        "(line 1887,col 9)-(line 1887,col 55)",
        "(line 1888,col 9)-(line 1888,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replaceImpl(org.apache.commons.lang3.text.StrMatcher, java.lang.String, int, int, int)",
      "begin_line": 1906,
      "end_line": 1926,
      "comment": "\n     * Replaces within the builder using a matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced behaviour.\n     * For example you could write a matcher to delete all occurrences\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the string to replace the match with, null is a delete\n     * @param from  the start index, must be valid\n     * @param to  the end index (exclusive), must be valid\n     * @param replaceCount  the number of times to replace, -1 for replace all\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 1909,col 9)-(line 1911,col 9)",
        "(line 1912,col 9)-(line 1912,col 72)",
        "(line 1913,col 9)-(line 1913,col 28)",
        "(line 1914,col 9)-(line 1924,col 9)",
        "(line 1925,col 9)-(line 1925,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.reverse()",
      "begin_line": 1934,
      "end_line": 1947,
      "comment": "\n     * Reverses the string builder placing each character in the opposite index.\n     * \n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1935,col 9)-(line 1937,col 9)",
        "(line 1939,col 9)-(line 1939,col 28)",
        "(line 1940,col 9)-(line 1940,col 28)",
        "(line 1941,col 9)-(line 1945,col 9)",
        "(line 1946,col 9)-(line 1946,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.trim()",
      "begin_line": 1956,
      "end_line": 1976,
      "comment": "\n     * Trims the builder by removing characters less than or equal to a space\n     * from the beginning and end.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1957,col 9)-(line 1959,col 9)",
        "(line 1960,col 9)-(line 1960,col 23)",
        "(line 1961,col 9)-(line 1961,col 28)",
        "(line 1962,col 9)-(line 1962,col 20)",
        "(line 1963,col 9)-(line 1965,col 9)",
        "(line 1966,col 9)-(line 1968,col 9)",
        "(line 1969,col 9)-(line 1971,col 9)",
        "(line 1972,col 9)-(line 1974,col 9)",
        "(line 1975,col 9)-(line 1975,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.startsWith(java.lang.String)",
      "begin_line": 1987,
      "end_line": 2004,
      "comment": "\n     * Checks whether this builder starts with the specified string.\n     * \u003cp\u003e\n     * Note that this method handles null input quietly, unlike String.\n     * \n     * @param str  the string to search for, null returns false\n     * @return true if the builder starts with the string\n     ",
      "child_ranges": [
        "(line 1988,col 9)-(line 1990,col 9)",
        "(line 1991,col 9)-(line 1991,col 31)",
        "(line 1992,col 9)-(line 1994,col 9)",
        "(line 1995,col 9)-(line 1997,col 9)",
        "(line 1998,col 9)-(line 2002,col 9)",
        "(line 2003,col 9)-(line 2003,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.endsWith(java.lang.String)",
      "begin_line": 2014,
      "end_line": 2032,
      "comment": "\n     * Checks whether this builder ends with the specified string.\n     * \u003cp\u003e\n     * Note that this method handles null input quietly, unlike String.\n     * \n     * @param str  the string to search for, null returns false\n     * @return true if the builder ends with the string\n     ",
      "child_ranges": [
        "(line 2015,col 9)-(line 2017,col 9)",
        "(line 2018,col 9)-(line 2018,col 31)",
        "(line 2019,col 9)-(line 2021,col 9)",
        "(line 2022,col 9)-(line 2024,col 9)",
        "(line 2025,col 9)-(line 2025,col 29)",
        "(line 2026,col 9)-(line 2030,col 9)",
        "(line 2031,col 9)-(line 2031,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.subSequence(int, int)",
      "begin_line": 2039,
      "end_line": 2051,
      "comment": "\n     * {@inheritDoc}\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 2041,col 7)-(line 2043,col 7)",
        "(line 2044,col 7)-(line 2046,col 7)",
        "(line 2047,col 7)-(line 2049,col 7)",
        "(line 2050,col 7)-(line 2050,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.substring(int)",
      "begin_line": 2060,
      "end_line": 2062,
      "comment": "\n     * Extracts a portion of this string builder as a string.\n     * \n     * @param start  the start index, inclusive, must be valid\n     * @return the new string\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 2061,col 9)-(line 2061,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.substring(int, int)",
      "begin_line": 2077,
      "end_line": 2080,
      "comment": "\n     * Extracts a portion of this string builder as a string.\n     * \u003cp\u003e\n     * Note: This method treats an endIndex greater than the length of the\n     * builder as equal to the length of the builder, and continues\n     * without error, unlike StringBuffer or String.\n     * \n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @return the new string\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 2078,col 9)-(line 2078,col 55)",
        "(line 2079,col 9)-(line 2079,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.leftString(int)",
      "begin_line": 2094,
      "end_line": 2102,
      "comment": "\n     * Extracts the leftmost characters from the string builder without\n     * throwing an exception.\n     * \u003cp\u003e\n     * This method extracts the left \u003ccode\u003elength\u003c/code\u003e characters from\n     * the builder. If this many characters are not available, the whole\n     * builder is returned. Thus the returned string may be shorter than the\n     * length requested.\n     * \n     * @param length  the number of characters to extract, negative returns empty string\n     * @return the new string\n     ",
      "child_ranges": [
        "(line 2095,col 9)-(line 2101,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.rightString(int)",
      "begin_line": 2116,
      "end_line": 2124,
      "comment": "\n     * Extracts the rightmost characters from the string builder without\n     * throwing an exception.\n     * \u003cp\u003e\n     * This method extracts the right \u003ccode\u003elength\u003c/code\u003e characters from\n     * the builder. If this many characters are not available, the whole\n     * builder is returned. Thus the returned string may be shorter than the\n     * length requested.\n     * \n     * @param length  the number of characters to extract, negative returns empty string\n     * @return the new string\n     ",
      "child_ranges": [
        "(line 2117,col 9)-(line 2123,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.midString(int, int)",
      "begin_line": 2142,
      "end_line": 2154,
      "comment": "\n     * Extracts some characters from the middle of the string builder without\n     * throwing an exception.\n     * \u003cp\u003e\n     * This method extracts \u003ccode\u003elength\u003c/code\u003e characters from the builder\n     * at the specified index.\n     * If the index is negative it is treated as zero.\n     * If the index is greater than the builder size, it is treated as the builder size.\n     * If the length is negative, the empty string is returned.\n     * If insufficient characters are available in the builder, as much as possible is returned.\n     * Thus the returned string may be shorter than the length requested.\n     * \n     * @param index  the index to start at, negative means zero\n     * @param length  the number of characters to extract, negative returns empty string\n     * @return the new string\n     ",
      "child_ranges": [
        "(line 2143,col 9)-(line 2145,col 9)",
        "(line 2146,col 9)-(line 2148,col 9)",
        "(line 2149,col 9)-(line 2153,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.contains(char)",
      "begin_line": 2163,
      "end_line": 2171,
      "comment": "\n     * Checks if the string builder contains the specified char.\n     *\n     * @param ch  the character to find\n     * @return true if the builder contains the character\n     ",
      "child_ranges": [
        "(line 2164,col 9)-(line 2164,col 32)",
        "(line 2165,col 9)-(line 2169,col 9)",
        "(line 2170,col 9)-(line 2170,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.contains(java.lang.String)",
      "begin_line": 2179,
      "end_line": 2181,
      "comment": "\n     * Checks if the string builder contains the specified string.\n     *\n     * @param str  the string to find\n     * @return true if the builder contains the string\n     ",
      "child_ranges": [
        "(line 2180,col 9)-(line 2180,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.contains(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 2194,
      "end_line": 2196,
      "comment": "\n     * Checks if the string builder contains a string matched using the\n     * specified matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to search for the character\n     * \u0027a\u0027 followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @return true if the matcher finds a match in the builder\n     ",
      "child_ranges": [
        "(line 2195,col 9)-(line 2195,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.indexOf(char)",
      "begin_line": 2205,
      "end_line": 2207,
      "comment": "\n     * Searches the string builder to find the first reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @return the first index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2206,col 9)-(line 2206,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.indexOf(char, int)",
      "begin_line": 2216,
      "end_line": 2228,
      "comment": "\n     * Searches the string builder to find the first reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the first index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2217,col 9)-(line 2217,col 55)",
        "(line 2218,col 9)-(line 2220,col 9)",
        "(line 2221,col 9)-(line 2221,col 32)",
        "(line 2222,col 9)-(line 2226,col 9)",
        "(line 2227,col 9)-(line 2227,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.indexOf(java.lang.String)",
      "begin_line": 2238,
      "end_line": 2240,
      "comment": "\n     * Searches the string builder to find the first reference to the specified string.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @return the first index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2239,col 9)-(line 2239,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.indexOf(java.lang.String, int)",
      "begin_line": 2252,
      "end_line": 2279,
      "comment": "\n     * Searches the string builder to find the first reference to the specified\n     * string starting searching from the given index.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the first index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2253,col 9)-(line 2253,col 55)",
        "(line 2254,col 9)-(line 2256,col 9)",
        "(line 2257,col 9)-(line 2257,col 34)",
        "(line 2258,col 9)-(line 2260,col 9)",
        "(line 2261,col 9)-(line 2263,col 9)",
        "(line 2264,col 9)-(line 2266,col 9)",
        "(line 2267,col 9)-(line 2267,col 32)",
        "(line 2268,col 9)-(line 2268,col 36)",
        "(line 2269,col 9)-(line 2277,col 9)",
        "(line 2278,col 9)-(line 2278,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.indexOf(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 2291,
      "end_line": 2293,
      "comment": "\n     * Searches the string builder using the matcher to find the first match.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @return the first index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2292,col 9)-(line 2292,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.indexOf(org.apache.commons.lang3.text.StrMatcher, int)",
      "begin_line": 2307,
      "end_line": 2320,
      "comment": "\n     * Searches the string builder using the matcher to find the first\n     * match searching from the given index.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the first index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2308,col 9)-(line 2308,col 55)",
        "(line 2309,col 9)-(line 2311,col 9)",
        "(line 2312,col 9)-(line 2312,col 23)",
        "(line 2313,col 9)-(line 2313,col 28)",
        "(line 2314,col 9)-(line 2318,col 9)",
        "(line 2319,col 9)-(line 2319,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.lastIndexOf(char)",
      "begin_line": 2329,
      "end_line": 2331,
      "comment": "\n     * Searches the string builder to find the last reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @return the last index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2330,col 9)-(line 2330,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.lastIndexOf(char, int)",
      "begin_line": 2340,
      "end_line": 2351,
      "comment": "\n     * Searches the string builder to find the last reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the last index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2341,col 9)-(line 2341,col 66)",
        "(line 2342,col 9)-(line 2344,col 9)",
        "(line 2345,col 9)-(line 2349,col 9)",
        "(line 2350,col 9)-(line 2350,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.lastIndexOf(java.lang.String)",
      "begin_line": 2361,
      "end_line": 2363,
      "comment": "\n     * Searches the string builder to find the last reference to the specified string.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @return the last index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2362,col 9)-(line 2362,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.lastIndexOf(java.lang.String, int)",
      "begin_line": 2375,
      "end_line": 2400,
      "comment": "\n     * Searches the string builder to find the last reference to the specified\n     * string starting searching from the given index.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the last index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2376,col 9)-(line 2376,col 66)",
        "(line 2377,col 9)-(line 2379,col 9)",
        "(line 2380,col 9)-(line 2380,col 34)",
        "(line 2381,col 9)-(line 2398,col 9)",
        "(line 2399,col 9)-(line 2399,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.lastIndexOf(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 2412,
      "end_line": 2414,
      "comment": "\n     * Searches the string builder using the matcher to find the last match.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @return the last index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2413,col 9)-(line 2413,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.lastIndexOf(org.apache.commons.lang3.text.StrMatcher, int)",
      "begin_line": 2428,
      "end_line": 2441,
      "comment": "\n     * Searches the string builder using the matcher to find the last\n     * match searching from the given index.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the last index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2429,col 9)-(line 2429,col 66)",
        "(line 2430,col 9)-(line 2432,col 9)",
        "(line 2433,col 9)-(line 2433,col 28)",
        "(line 2434,col 9)-(line 2434,col 38)",
        "(line 2435,col 9)-(line 2439,col 9)",
        "(line 2440,col 9)-(line 2440,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.asTokenizer()",
      "begin_line": 2476,
      "end_line": 2478,
      "comment": "\n     * Creates a tokenizer that can tokenize the contents of this builder.\n     * \u003cp\u003e\n     * This method allows the contents of this builder to be tokenized.\n     * The tokenizer will be setup by default to tokenize on space, tab,\n     * newline and formfeed (as per StringTokenizer). These values can be\n     * changed on the tokenizer class, before retrieving the tokens.\n     * \u003cp\u003e\n     * The returned tokenizer is linked to this builder. You may intermix\n     * calls to the buider and tokenizer within certain limits, however\n     * there is no synchronization. Once the tokenizer has been used once,\n     * it must be {@link StrTokenizer#reset() reset} to pickup the latest\n     * changes in the builder. For example:\n     * \u003cpre\u003e\n     * StrBuilder b \u003d new StrBuilder();\n     * b.append(\"a b \");\n     * StrTokenizer t \u003d b.asTokenizer();\n     * String[] tokens1 \u003d t.getTokenArray();  // returns a,b\n     * b.append(\"c d \");\n     * String[] tokens2 \u003d t.getTokenArray();  // returns a,b (c and d ignored)\n     * t.reset();              // reset causes builder changes to be picked up\n     * String[] tokens3 \u003d t.getTokenArray();  // returns a,b,c,d\n     * \u003c/pre\u003e\n     * In addition to simply intermixing appends and tokenization, you can also\n     * call the set methods on the tokenizer to alter how it tokenizes. Just\n     * remember to call reset when you want to pickup builder changes.\n     * \u003cp\u003e\n     * Calling {@link StrTokenizer#reset(String)} or {@link StrTokenizer#reset(char[])}\n     * with a non-null value will break the link with the builder.\n     *\n     * @return a tokenizer that is linked to this builder\n     ",
      "child_ranges": [
        "(line 2477,col 9)-(line 2477,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.asReader()",
      "begin_line": 2500,
      "end_line": 2502,
      "comment": "\n     * Gets the contents of this builder as a Reader.\n     * \u003cp\u003e\n     * This method allows the contents of the builder to be read\n     * using any standard method that expects a Reader.\n     * \u003cp\u003e\n     * To use, simply create a \u003ccode\u003eStrBuilder\u003c/code\u003e, populate it with\n     * data, call \u003ccode\u003easReader\u003c/code\u003e, and then read away.\n     * \u003cp\u003e\n     * The internal character array is shared between the builder and the reader.\n     * This allows you to append to the builder after creating the reader,\n     * and the changes will be picked up.\n     * Note however, that no synchronization occurs, so you must perform\n     * all operations with the builder and the reader in one thread.\n     * \u003cp\u003e\n     * The returned reader supports marking, and ignores the flush method.\n     *\n     * @return a reader that reads from this builder\n     ",
      "child_ranges": [
        "(line 2501,col 9)-(line 2501,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.asWriter()",
      "begin_line": 2525,
      "end_line": 2527,
      "comment": "\n     * Gets this builder as a Writer that can be written to.\n     * \u003cp\u003e\n     * This method allows you to populate the contents of the builder\n     * using any standard method that takes a Writer.\n     * \u003cp\u003e\n     * To use, simply create a \u003ccode\u003eStrBuilder\u003c/code\u003e,\n     * call \u003ccode\u003easWriter\u003c/code\u003e, and populate away. The data is available\n     * at any time using the methods of the \u003ccode\u003eStrBuilder\u003c/code\u003e.\n     * \u003cp\u003e\n     * The internal character array is shared between the builder and the writer.\n     * This allows you to intermix calls that append to the builder and\n     * write using the writer and the changes will be occur correctly.\n     * Note however, that no synchronization occurs, so you must perform\n     * all operations with the builder and the writer in one thread.\n     * \u003cp\u003e\n     * The returned writer ignores the close and flush methods.\n     *\n     * @return a writer that populates this builder\n     ",
      "child_ranges": [
        "(line 2526,col 9)-(line 2526,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.equalsIgnoreCase(org.apache.commons.lang3.text.StrBuilder)",
      "begin_line": 2567,
      "end_line": 2584,
      "comment": "\n     * Checks the contents of this builder against another to see if they\n     * contain the same character content ignoring case.\n     *\n     * @param other  the object to check, null returns false\n     * @return true if the builders contain the same characters in the same order\n     ",
      "child_ranges": [
        "(line 2568,col 9)-(line 2570,col 9)",
        "(line 2571,col 9)-(line 2573,col 9)",
        "(line 2574,col 9)-(line 2574,col 37)",
        "(line 2575,col 9)-(line 2575,col 39)",
        "(line 2576,col 9)-(line 2582,col 9)",
        "(line 2583,col 9)-(line 2583,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.equals(org.apache.commons.lang3.text.StrBuilder)",
      "begin_line": 2593,
      "end_line": 2608,
      "comment": "\n     * Checks the contents of this builder against another to see if they\n     * contain the same character content.\n     *\n     * @param other  the object to check, null returns false\n     * @return true if the builders contain the same characters in the same order\n     ",
      "child_ranges": [
        "(line 2594,col 9)-(line 2596,col 9)",
        "(line 2597,col 9)-(line 2599,col 9)",
        "(line 2600,col 9)-(line 2600,col 37)",
        "(line 2601,col 9)-(line 2601,col 39)",
        "(line 2602,col 9)-(line 2606,col 9)",
        "(line 2607,col 9)-(line 2607,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.equals(java.lang.Object)",
      "begin_line": 2617,
      "end_line": 2623,
      "comment": "\n     * Checks the contents of this builder against another to see if they\n     * contain the same character content.\n     *\n     * @param obj  the object to check, null returns false\n     * @return true if the builders contain the same characters in the same order\n     ",
      "child_ranges": [
        "(line 2619,col 9)-(line 2621,col 9)",
        "(line 2622,col 9)-(line 2622,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.hashCode()",
      "begin_line": 2630,
      "end_line": 2638,
      "comment": "\n     * Gets a suitable hash code for this builder.\n     *\n     * @return a hash code\n     ",
      "child_ranges": [
        "(line 2632,col 9)-(line 2632,col 28)",
        "(line 2633,col 9)-(line 2633,col 21)",
        "(line 2634,col 9)-(line 2636,col 9)",
        "(line 2637,col 9)-(line 2637,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.toString()",
      "begin_line": 2650,
      "end_line": 2653,
      "comment": "\n     * Gets a String version of the string builder, creating a new instance\n     * each time the method is called.\n     * \u003cp\u003e\n     * Note that unlike StringBuffer, the string version returned is\n     * independent of the string builder.\n     *\n     * @return the builder as a String\n     ",
      "child_ranges": [
        "(line 2652,col 9)-(line 2652,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.toStringBuffer()",
      "begin_line": 2661,
      "end_line": 2663,
      "comment": "\n     * Gets a StringBuffer version of the string builder, creating a\n     * new instance each time the method is called.\n     *\n     * @return the builder as a StringBuffer\n     ",
      "child_ranges": [
        "(line 2662,col 9)-(line 2662,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.toStringBuilder()",
      "begin_line": 2672,
      "end_line": 2674,
      "comment": "\n     * Gets a StringBuilder version of the string builder, creating a\n     * new instance each time the method is called.\n     *\n     * @return the builder as a StringBuilder\n     * @since Apache Commons Lang 3.2\n     ",
      "child_ranges": [
        "(line 2673,col 9)-(line 2673,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.build()",
      "begin_line": 2682,
      "end_line": 2684,
      "comment": "\n     * Implement the {@link Builder} interface.\n     * @return the builder as a String\n     * @since Apache Commons Lang 3.2\n     * @see #toString()\n     ",
      "child_ranges": [
        "(line 2683,col 9)-(line 2683,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.validateRange(int, int)",
      "begin_line": 2696,
      "end_line": 2707,
      "comment": "\n     * Validates parameters defining a range of the builder.\n     * \n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @return the new string\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 2697,col 9)-(line 2699,col 9)",
        "(line 2700,col 9)-(line 2702,col 9)",
        "(line 2703,col 9)-(line 2705,col 9)",
        "(line 2706,col 9)-(line 2706,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.validateIndex(int)",
      "begin_line": 2715,
      "end_line": 2719,
      "comment": "\n     * Validates parameters defining a single index in the builder.\n     * \n     * @param index  the index, must be valid\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 2716,col 9)-(line 2718,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StrBuilderTokenizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.StrTokenizer"
      ],
      "begin_line": 2725,
      "end_line": 2754,
      "comment": "\n     * Inner class to allow StrBuilder to operate as a tokenizer.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderTokenizer.StrBuilderTokenizer()",
      "begin_line": 2730,
      "end_line": 2732,
      "comment": "\n         * Default constructor.\n         ",
      "child_ranges": [
        "(line 2731,col 13)-(line 2731,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderTokenizer.tokenize(char[], int, int)",
      "begin_line": 2735,
      "end_line": 2742,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2737,col 13)-(line 2741,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderTokenizer.getContent()",
      "begin_line": 2745,
      "end_line": 2753,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2747,col 13)-(line 2747,col 44)",
        "(line 2748,col 13)-(line 2752,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StrBuilderReader",
      "is_interface": false,
      "parent_types": [
        "java.io.Reader"
      ],
      "begin_line": 2760,
      "end_line": 2845,
      "comment": "\n     * Inner class to allow StrBuilder to operate as a writer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 2762,
      "end_line": 2762,
      "comment": " The current stream position. "
    },
    {
      "type": "field",
      "varNames": [
        "mark"
      ],
      "begin_line": 2764,
      "end_line": 2764,
      "comment": " The last mark position. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.StrBuilderReader()",
      "begin_line": 2769,
      "end_line": 2771,
      "comment": "\n         * Default constructor.\n         ",
      "child_ranges": [
        "(line 2770,col 13)-(line 2770,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.close()",
      "begin_line": 2774,
      "end_line": 2777,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.read()",
      "begin_line": 2780,
      "end_line": 2786,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2782,col 13)-(line 2784,col 13)",
        "(line 2785,col 13)-(line 2785,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.read(char[], int, int)",
      "begin_line": 2789,
      "end_line": 2807,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2791,col 13)-(line 2794,col 13)",
        "(line 2795,col 13)-(line 2797,col 13)",
        "(line 2798,col 13)-(line 2800,col 13)",
        "(line 2801,col 13)-(line 2803,col 13)",
        "(line 2804,col 13)-(line 2804,col 61)",
        "(line 2805,col 13)-(line 2805,col 23)",
        "(line 2806,col 13)-(line 2806,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.skip(long)",
      "begin_line": 2810,
      "end_line": 2820,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2812,col 13)-(line 2814,col 13)",
        "(line 2815,col 13)-(line 2817,col 13)",
        "(line 2818,col 13)-(line 2818,col 21)",
        "(line 2819,col 13)-(line 2819,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.ready()",
      "begin_line": 2823,
      "end_line": 2826,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2825,col 13)-(line 2825,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.markSupported()",
      "begin_line": 2829,
      "end_line": 2832,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2831,col 13)-(line 2831,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.mark(int)",
      "begin_line": 2835,
      "end_line": 2838,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2837,col 13)-(line 2837,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.reset()",
      "begin_line": 2841,
      "end_line": 2844,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2843,col 13)-(line 2843,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StrBuilderWriter",
      "is_interface": false,
      "parent_types": [
        "java.io.Writer"
      ],
      "begin_line": 2851,
      "end_line": 2901,
      "comment": "\n     * Inner class to allow StrBuilder to operate as a writer.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter.StrBuilderWriter()",
      "begin_line": 2856,
      "end_line": 2858,
      "comment": "\n         * Default constructor.\n         ",
      "child_ranges": [
        "(line 2857,col 13)-(line 2857,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter.close()",
      "begin_line": 2861,
      "end_line": 2864,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter.flush()",
      "begin_line": 2867,
      "end_line": 2870,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter.write(int)",
      "begin_line": 2873,
      "end_line": 2876,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2875,col 13)-(line 2875,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter.write(char[])",
      "begin_line": 2879,
      "end_line": 2882,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2881,col 13)-(line 2881,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter.write(char[], int, int)",
      "begin_line": 2885,
      "end_line": 2888,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2887,col 13)-(line 2887,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter.write(java.lang.String)",
      "begin_line": 2891,
      "end_line": 2894,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2893,col 13)-(line 2893,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter.write(java.lang.String, int, int)",
      "begin_line": 2897,
      "end_line": 2900,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2899,col 13)-(line 2899,col 50)"
      ]
    }
  ]
}