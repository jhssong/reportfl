{
  "filepath": "/tmp/Lang-33b/src/main/java/org/apache/commons/lang3/text/StrBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StrBuilder",
      "is_interface": false,
      "parent_types": [
        "java.lang.CharSequence",
        "java.lang.Appendable"
      ],
      "begin_line": 74,
      "end_line": 2838,
      "comment": "\n * Builds a string from constituent parts providing a more flexible and powerful API\n * than StringBuffer.\n * \u003cp\u003e\n * The main differences from StringBuffer/StringBuilder are:\n * \u003cul\u003e\n * \u003cli\u003eNot synchronized\u003c/li\u003e\n * \u003cli\u003eNot final\u003c/li\u003e\n * \u003cli\u003eSubclasses have direct access to character array\u003c/li\u003e\n * \u003cli\u003eAdditional methods\n *  \u003cul\u003e\n *   \u003cli\u003eappendWithSeparators - adds an array of values, with a separator\u003c/li\u003e\n *   \u003cli\u003eappendPadding - adds a length padding characters\u003c/li\u003e\n *   \u003cli\u003eappendFixedLength - adds a fixed width field to the builder\u003c/li\u003e\n *   \u003cli\u003etoCharArray/getChars - simpler ways to get a range of the character array\u003c/li\u003e\n *   \u003cli\u003edelete - delete char or string\u003c/li\u003e\n *   \u003cli\u003ereplace - search and replace for a char or string\u003c/li\u003e\n *   \u003cli\u003eleftString/rightString/midString - substring without exceptions\u003c/li\u003e\n *   \u003cli\u003econtains - whether the builder contains a char or string\u003c/li\u003e\n *   \u003cli\u003esize/clear/isEmpty - collections style API methods\u003c/li\u003e\n *  \u003c/ul\u003e\n * \u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cli\u003eViews\n *  \u003cul\u003e\n *   \u003cli\u003easTokenizer - uses the internal buffer as the source of a StrTokenizer\u003c/li\u003e\n *   \u003cli\u003easReader - uses the internal buffer as the source of a Reader\u003c/li\u003e\n *   \u003cli\u003easWriter - allows a Writer to write directly to the internal buffer\u003c/li\u003e\n *  \u003c/ul\u003e\n * \u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * The aim has been to provide an API that mimics very closely what StringBuffer\n * provides, but with additional methods. It should be noted that some edge cases,\n * with invalid indices or null input, have been altered - see individual methods.\n * The biggest of these changes is that by default, null will not output the text\n * \u0027null\u0027. This can be controlled by a property, {@link #setNullText(String)}.\n * \u003cp\u003e\n * Prior to 3.0, this class implemented Cloneable but did not implement the \n * clone method so could not be used. From 3.0 onwards it no longer implements \n * the interface. \n *\n * @author Apache Software Foundation\n * @author Robert Scholte\n * @since 2.2\n * @version $Id$\n "
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
      "end_line": 187,
      "comment": "\n     * Gets the length of the string builder.\n     *\n     * @return the length\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.setLength(int)",
      "begin_line": 197,
      "end_line": 213,
      "comment": "\n     * Updates the length of the builder by either dropping the last characters\n     * or adding filler of unicode zero.\n     *\n     * @param length  the length to set to, must be zero or positive\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the length is negative\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 212,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.capacity()",
      "begin_line": 221,
      "end_line": 223,
      "comment": "\n     * Gets the current size of the internal character array buffer.\n     *\n     * @return the capacity\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.ensureCapacity(int)",
      "begin_line": 231,
      "end_line": 238,
      "comment": "\n     * Checks the capacity and ensures that it is at least the size specified.\n     *\n     * @param capacity  the capacity to ensure\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 237,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.minimizeCapacity()",
      "begin_line": 245,
      "end_line": 252,
      "comment": "\n     * Minimizes the capacity to the actual length of the string.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 251,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.size()",
      "begin_line": 263,
      "end_line": 265,
      "comment": "\n     * Gets the length of the string builder.\n     * \u003cp\u003e\n     * This method is the same as {@link #length()} and is provided to match the\n     * API of Collections.\n     *\n     * @return the length\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.isEmpty()",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\n     * Checks is the string builder is empty (convenience Collections API style method).\n     * \u003cp\u003e\n     * This method is the same as checking {@link #length()} and is provided to match the\n     * API of Collections.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the size is \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.clear()",
      "begin_line": 290,
      "end_line": 293,
      "comment": "\n     * Clears the string builder (convenience Collections API style method).\n     * \u003cp\u003e\n     * This method does not reduce the size of the internal character buffer.\n     * To do that, call \u003ccode\u003eclear()\u003c/code\u003e followed by {@link #minimizeCapacity()}.\n     * \u003cp\u003e\n     * This method is the same as {@link #setLength(int)} called with zero\n     * and is provided to match the API of Collections.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 17)",
        "(line 292,col 9)-(line 292,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.charAt(int)",
      "begin_line": 305,
      "end_line": 310,
      "comment": "\n     * Gets the character at the specified index.\n     *\n     * @see #setCharAt(int, char)\n     * @see #deleteCharAt(int)\n     * @param index  the index to retrieve, must be valid\n     * @return the character at the index\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 309,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.setCharAt(int, char)",
      "begin_line": 322,
      "end_line": 328,
      "comment": "\n     * Sets the character at the specified index.\n     *\n     * @see #charAt(int)\n     * @see #deleteCharAt(int)\n     * @param index  the index to set\n     * @param ch  the new character\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 326,col 27)",
        "(line 327,col 9)-(line 327,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.deleteCharAt(int)",
      "begin_line": 339,
      "end_line": 345,
      "comment": "\n     * Deletes the character at the specified index.\n     *\n     * @see #charAt(int)\n     * @see #setCharAt(int, char)\n     * @param index  the index to delete\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 343,col 40)",
        "(line 344,col 9)-(line 344,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.toCharArray()",
      "begin_line": 353,
      "end_line": 360,
      "comment": "\n     * Copies the builder\u0027s character array into a new character array.\n     * \n     * @return a new array that represents the contents of the builder\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 357,col 38)",
        "(line 358,col 9)-(line 358,col 52)",
        "(line 359,col 9)-(line 359,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.toCharArray(int, int)",
      "begin_line": 372,
      "end_line": 381,
      "comment": "\n     * Copies part of the builder\u0027s character array into a new character array.\n     * \n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except that\n     *  if too large it is treated as end of string\n     * @return a new array that holds part of the contents of the builder\n     * @throws IndexOutOfBoundsException if startIndex is invalid,\n     *  or if endIndex is invalid (but endIndex greater than size is valid)\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 55)",
        "(line 374,col 9)-(line 374,col 40)",
        "(line 375,col 9)-(line 377,col 9)",
        "(line 378,col 9)-(line 378,col 37)",
        "(line 379,col 9)-(line 379,col 60)",
        "(line 380,col 9)-(line 380,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.getChars(char[])",
      "begin_line": 389,
      "end_line": 396,
      "comment": "\n     * Copies the character array into the specified array.\n     * \n     * @param destination  the destination array, null will cause an array to be created\n     * @return the input array, unless that was null or too small\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 27)",
        "(line 391,col 9)-(line 393,col 9)",
        "(line 394,col 9)-(line 394,col 57)",
        "(line 395,col 9)-(line 395,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.getChars(int, int, char[], int)",
      "begin_line": 408,
      "end_line": 419,
      "comment": "\n     * Copies the character array into the specified array.\n     *\n     * @param startIndex  first index to copy, inclusive, must be valid\n     * @param endIndex  last index, exclusive, must be valid\n     * @param destination  the destination array, must not be null or too small\n     * @param destinationIndex  the index to start copying in destination\n     * @throws NullPointerException if the array is null\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 414,col 9)",
        "(line 415,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 418,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendNewLine()",
      "begin_line": 431,
      "end_line": 437,
      "comment": "\n     * Appends the new line string to this string builder.\n     * \u003cp\u003e\n     * The new line string can be altered using {@link #setNewLineText(String)}.\n     * This might be used to force the output to always use Unix line endings\n     * even when on Windows.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 435,col 9)",
        "(line 436,col 9)-(line 436,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendNull()",
      "begin_line": 444,
      "end_line": 449,
      "comment": "\n     * Appends the text representing \u003ccode\u003enull\u003c/code\u003e to this string builder.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 448,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(java.lang.Object)",
      "begin_line": 458,
      "end_line": 463,
      "comment": "\n     * Appends an object to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param obj  the object to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 461,col 9)",
        "(line 462,col 9)-(line 462,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(java.lang.CharSequence)",
      "begin_line": 472,
      "end_line": 477,
      "comment": "\n     * Appends a CharSequence to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param seq  the CharSequence to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 475,col 9)",
        "(line 476,col 9)-(line 476,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(java.lang.CharSequence, int, int)",
      "begin_line": 488,
      "end_line": 493,
      "comment": "\n     * Appends part of a CharSequence to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param seq  the CharSequence to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 491,col 9)",
        "(line 492,col 9)-(line 492,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(java.lang.String)",
      "begin_line": 502,
      "end_line": 514,
      "comment": "\n     * Appends a string to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 503,col 9)-(line 505,col 9)",
        "(line 506,col 9)-(line 506,col 34)",
        "(line 507,col 9)-(line 512,col 9)",
        "(line 513,col 9)-(line 513,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(java.lang.String, int, int)",
      "begin_line": 525,
      "end_line": 542,
      "comment": "\n     * Appends part of a string to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 531,col 9)",
        "(line 532,col 9)-(line 534,col 9)",
        "(line 535,col 9)-(line 540,col 9)",
        "(line 541,col 9)-(line 541,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(java.lang.StringBuffer)",
      "begin_line": 551,
      "end_line": 563,
      "comment": "\n     * Appends a string buffer to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string buffer to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 552,col 9)-(line 554,col 9)",
        "(line 555,col 9)-(line 555,col 34)",
        "(line 556,col 9)-(line 561,col 9)",
        "(line 562,col 9)-(line 562,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(java.lang.StringBuffer, int, int)",
      "begin_line": 574,
      "end_line": 591,
      "comment": "\n     * Appends part of a string buffer to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 577,col 9)",
        "(line 578,col 9)-(line 580,col 9)",
        "(line 581,col 9)-(line 583,col 9)",
        "(line 584,col 9)-(line 589,col 9)",
        "(line 590,col 9)-(line 590,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(org.apache.commons.lang3.text.StrBuilder)",
      "begin_line": 600,
      "end_line": 612,
      "comment": "\n     * Appends another string builder to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string builder to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 601,col 9)-(line 603,col 9)",
        "(line 604,col 9)-(line 604,col 34)",
        "(line 605,col 9)-(line 610,col 9)",
        "(line 611,col 9)-(line 611,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(org.apache.commons.lang3.text.StrBuilder, int, int)",
      "begin_line": 623,
      "end_line": 640,
      "comment": "\n     * Appends part of a string builder to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 624,col 9)-(line 626,col 9)",
        "(line 627,col 9)-(line 629,col 9)",
        "(line 630,col 9)-(line 632,col 9)",
        "(line 633,col 9)-(line 638,col 9)",
        "(line 639,col 9)-(line 639,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(char[])",
      "begin_line": 649,
      "end_line": 661,
      "comment": "\n     * Appends a char array to the string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param chars  the char array to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 650,col 9)-(line 652,col 9)",
        "(line 653,col 9)-(line 653,col 34)",
        "(line 654,col 9)-(line 659,col 9)",
        "(line 660,col 9)-(line 660,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(char[], int, int)",
      "begin_line": 672,
      "end_line": 689,
      "comment": "\n     * Appends a char array to the string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param chars  the char array to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 673,col 9)-(line 675,col 9)",
        "(line 676,col 9)-(line 678,col 9)",
        "(line 679,col 9)-(line 681,col 9)",
        "(line 682,col 9)-(line 687,col 9)",
        "(line 688,col 9)-(line 688,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(boolean)",
      "begin_line": 697,
      "end_line": 713,
      "comment": "\n     * Appends a boolean value to the string builder.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 698,col 9)-(line 711,col 9)",
        "(line 712,col 9)-(line 712,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(char)",
      "begin_line": 721,
      "end_line": 726,
      "comment": "\n     * Appends a char value to the string builder.\n     *\n     * @param ch  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 722,col 9)-(line 722,col 27)",
        "(line 723,col 9)-(line 723,col 32)",
        "(line 724,col 9)-(line 724,col 28)",
        "(line 725,col 9)-(line 725,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(int)",
      "begin_line": 734,
      "end_line": 736,
      "comment": "\n     * Appends an int value to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 735,col 9)-(line 735,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(long)",
      "begin_line": 744,
      "end_line": 746,
      "comment": "\n     * Appends a long value to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 745,col 9)-(line 745,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(float)",
      "begin_line": 754,
      "end_line": 756,
      "comment": "\n     * Appends a float value to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 755,col 9)-(line 755,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.append(double)",
      "begin_line": 764,
      "end_line": 766,
      "comment": "\n     * Appends a double value to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 765,col 9)-(line 765,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(java.lang.Object)",
      "begin_line": 777,
      "end_line": 779,
      "comment": "\n     * Appends an object followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param obj  the object to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 778,col 9)-(line 778,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(java.lang.String)",
      "begin_line": 789,
      "end_line": 791,
      "comment": "\n     * Appends a string followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 790,col 9)-(line 790,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(java.lang.String, int, int)",
      "begin_line": 803,
      "end_line": 805,
      "comment": "\n     * Appends part of a string followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 804,col 9)-(line 804,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(java.lang.StringBuffer)",
      "begin_line": 815,
      "end_line": 817,
      "comment": "\n     * Appends a string buffer followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string buffer to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 816,col 9)-(line 816,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(java.lang.StringBuffer, int, int)",
      "begin_line": 829,
      "end_line": 831,
      "comment": "\n     * Appends part of a string buffer followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 830,col 9)-(line 830,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(org.apache.commons.lang3.text.StrBuilder)",
      "begin_line": 841,
      "end_line": 843,
      "comment": "\n     * Appends another string builder followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string builder to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 842,col 9)-(line 842,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(org.apache.commons.lang3.text.StrBuilder, int, int)",
      "begin_line": 855,
      "end_line": 857,
      "comment": "\n     * Appends part of a string builder followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 856,col 9)-(line 856,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(char[])",
      "begin_line": 867,
      "end_line": 869,
      "comment": "\n     * Appends a char array followed by a new line to the string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param chars  the char array to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 868,col 9)-(line 868,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(char[], int, int)",
      "begin_line": 881,
      "end_line": 883,
      "comment": "\n     * Appends a char array followed by a new line to the string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param chars  the char array to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 882,col 9)-(line 882,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(boolean)",
      "begin_line": 892,
      "end_line": 894,
      "comment": "\n     * Appends a boolean value followed by a new line to the string builder.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 893,col 9)-(line 893,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(char)",
      "begin_line": 903,
      "end_line": 905,
      "comment": "\n     * Appends a char value followed by a new line to the string builder.\n     *\n     * @param ch  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 904,col 9)-(line 904,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(int)",
      "begin_line": 914,
      "end_line": 916,
      "comment": "\n     * Appends an int value followed by a new line to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 915,col 9)-(line 915,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(long)",
      "begin_line": 925,
      "end_line": 927,
      "comment": "\n     * Appends a long value followed by a new line to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 926,col 9)-(line 926,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(float)",
      "begin_line": 936,
      "end_line": 938,
      "comment": "\n     * Appends a float value followed by a new line to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 937,col 9)-(line 937,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendln(double)",
      "begin_line": 947,
      "end_line": 949,
      "comment": "\n     * Appends a double value followed by a new line to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 948,col 9)-(line 948,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendAll(java.lang.Object[])",
      "begin_line": 961,
      "end_line": 968,
      "comment": "\n     * Appends each item in an array to the builder without any separators.\n     * Appending a null array will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param array  the array to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 962,col 9)-(line 966,col 9)",
        "(line 967,col 9)-(line 967,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendAll(java.lang.Iterable\u003c?\u003e)",
      "begin_line": 979,
      "end_line": 987,
      "comment": "\n     * Appends each item in a iterable to the builder without any separators.\n     * Appending a null iterable will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param iterable  the iterable to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 980,col 9)-(line 985,col 9)",
        "(line 986,col 9)-(line 986,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendAll(java.util.Iterator\u003c?\u003e)",
      "begin_line": 998,
      "end_line": 1005,
      "comment": "\n     * Appends each item in an iterator to the builder without any separators.\n     * Appending a null iterator will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param it  the iterator to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 999,col 9)-(line 1003,col 9)",
        "(line 1004,col 9)-(line 1004,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendWithSeparators(java.lang.Object[], java.lang.String)",
      "begin_line": 1018,
      "end_line": 1028,
      "comment": "\n     * Appends an array placing separators between each value, but\n     * not before the first or after the last.\n     * Appending a null array will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param array  the array to append\n     * @param separator  the separator to use, null means no separator\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1019,col 9)-(line 1026,col 9)",
        "(line 1027,col 9)-(line 1027,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendWithSeparators(java.lang.Iterable\u003c?\u003e, java.lang.String)",
      "begin_line": 1040,
      "end_line": 1052,
      "comment": "\n     * Appends a iterable placing separators between each value, but\n     * not before the first or after the last.\n     * Appending a null iterable will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param iterable  the iterable to append\n     * @param separator  the separator to use, null means no separator\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1041,col 9)-(line 1050,col 9)",
        "(line 1051,col 9)-(line 1051,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendWithSeparators(java.util.Iterator\u003c?\u003e, java.lang.String)",
      "begin_line": 1064,
      "end_line": 1075,
      "comment": "\n     * Appends an iterator placing separators between each value, but\n     * not before the first or after the last.\n     * Appending a null iterator will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param it  the iterator to append\n     * @param separator  the separator to use, null means no separator\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1065,col 9)-(line 1073,col 9)",
        "(line 1074,col 9)-(line 1074,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendSeparator(java.lang.String)",
      "begin_line": 1098,
      "end_line": 1100,
      "comment": "\n     * Appends a separator if the builder is currently non-empty.\n     * Appending a null separator will have no effect.\n     * The separator is appended using {@link #append(String)}.\n     * \u003cp\u003e\n     * This method is useful for adding a separator each time around the\n     * loop except the first.\n     * \u003cpre\u003e\n     * for (Iterator it \u003d list.iterator(); it.hasNext(); ) {\n     *   appendSeparator(\",\");\n     *   append(it.next());\n     * }\n     * \u003c/pre\u003e\n     * Note that for this simple example, you should use\n     * {@link #appendWithSeparators(Iterable, String)}.\n     * \n     * @param separator  the separator to use, null means no separator\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1099,col 9)-(line 1099,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendSeparator(java.lang.String, java.lang.String)",
      "begin_line": 1129,
      "end_line": 1135,
      "comment": "\n     * Appends one of both separators to the StrBuilder.\n     * If the builder is currently empty it will append the defaultIfEmpty-separator\n     * Otherwise it will append the standard-separator\n     * \n     * Appending a null separator will have no effect.\n     * The separator is appended using {@link #append(String)}.\n     * \u003cp\u003e\n     * This method is for example useful for constructing queries\n     * \u003cpre\u003e\n     * StrBuilder whereClause \u003d new StrBuilder();\n     * if(searchCommand.getPriority() !\u003d null) {\n     *  whereClause.appendSeparator(\" and\", \" where\");\n     *  whereClause.append(\" priority \u003d ?\")\n     * }\n     * if(searchCommand.getComponent() !\u003d null) {\n     *  whereClause.appendSeparator(\" and\", \" where\");\n     *  whereClause.append(\" component \u003d ?\")\n     * }\n     * selectClause.append(whereClause)\n     * \u003c/pre\u003e\n     * \n     * @param standard the separator if builder is not empty, null means no separator\n     * @param defaultIfEmpty the separator if builder is empty, null means no separator\n     * @return this, to enable chaining\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 1130,col 9)-(line 1130,col 59)",
        "(line 1131,col 9)-(line 1133,col 9)",
        "(line 1134,col 9)-(line 1134,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendSeparator(char)",
      "begin_line": 1156,
      "end_line": 1161,
      "comment": "\n     * Appends a separator if the builder is currently non-empty.\n     * The separator is appended using {@link #append(char)}.\n     * \u003cp\u003e\n     * This method is useful for adding a separator each time around the\n     * loop except the first.\n     * \u003cpre\u003e\n     * for (Iterator it \u003d list.iterator(); it.hasNext(); ) {\n     *   appendSeparator(\u0027,\u0027);\n     *   append(it.next());\n     * }\n     * \u003c/pre\u003e\n     * Note that for this simple example, you should use\n     * {@link #appendWithSeparators(Iterable, String)}.\n     * \n     * @param separator  the separator to use\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1157,col 9)-(line 1159,col 9)",
        "(line 1160,col 9)-(line 1160,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendSeparator(char, char)",
      "begin_line": 1174,
      "end_line": 1182,
      "comment": "\n     * Append one of both separators to the builder\n     * If the builder is currently empty it will append the defaultIfEmpty-separator\n     * Otherwise it will append the standard-separator\n     *\n     * The separator is appended using {@link #append(char)}.\n     * @param standard the separator if builder is not empty\n     * @param defaultIfEmpty the separator if builder is empty\n     * @return this, to enable chaining\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 1175,col 9)-(line 1180,col 9)",
        "(line 1181,col 9)-(line 1181,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendSeparator(java.lang.String, int)",
      "begin_line": 1204,
      "end_line": 1209,
      "comment": "\n     * Appends a separator to the builder if the loop index is greater than zero.\n     * Appending a null separator will have no effect.\n     * The separator is appended using {@link #append(String)}.\n     * \u003cp\u003e\n     * This method is useful for adding a separator each time around the\n     * loop except the first.\n     * \u003cpre\u003e\n     * for (int i \u003d 0; i \u003c list.size(); i++) {\n     *   appendSeparator(\",\", i);\n     *   append(list.get(i));\n     * }\n     * \u003c/pre\u003e\n     * Note that for this simple example, you should use\n     * {@link #appendWithSeparators(Iterable, String)}.\n     * \n     * @param separator  the separator to use, null means no separator\n     * @param loopIndex  the loop index\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1205,col 9)-(line 1207,col 9)",
        "(line 1208,col 9)-(line 1208,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendSeparator(char, int)",
      "begin_line": 1231,
      "end_line": 1236,
      "comment": "\n     * Appends a separator to the builder if the loop index is greater than zero.\n     * The separator is appended using {@link #append(char)}.\n     * \u003cp\u003e\n     * This method is useful for adding a separator each time around the\n     * loop except the first.\n     * \u003cpre\u003e\n     * for (int i \u003d 0; i \u003c list.size(); i++) {\n     *   appendSeparator(\",\", i);\n     *   append(list.get(i));\n     * }\n     * \u003c/pre\u003e\n     * Note that for this simple example, you should use\n     * {@link #appendWithSeparators(Iterable, String)}.\n     * \n     * @param separator  the separator to use\n     * @param loopIndex  the loop index\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1232,col 9)-(line 1234,col 9)",
        "(line 1235,col 9)-(line 1235,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendPadding(int, char)",
      "begin_line": 1246,
      "end_line": 1254,
      "comment": "\n     * Appends the pad character to the builder the specified number of times.\n     * \n     * @param length  the length to append, negative means no append\n     * @param padChar  the character to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1247,col 9)-(line 1252,col 9)",
        "(line 1253,col 9)-(line 1253,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendFixedWidthPadLeft(java.lang.Object, int, char)",
      "begin_line": 1268,
      "end_line": 1288,
      "comment": "\n     * Appends an object to the builder padding on the left to a fixed width.\n     * The \u003ccode\u003etoString\u003c/code\u003e of the object is used.\n     * If the object is larger than the length, the left hand side is lost.\n     * If the object is null, the null text value is used.\n     * \n     * @param obj  the object to append, null uses null text\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1269,col 9)-(line 1286,col 9)",
        "(line 1287,col 9)-(line 1287,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendFixedWidthPadLeft(int, int, char)",
      "begin_line": 1300,
      "end_line": 1302,
      "comment": "\n     * Appends an object to the builder padding on the left to a fixed width.\n     * The \u003ccode\u003eString.valueOf\u003c/code\u003e of the \u003ccode\u003eint\u003c/code\u003e value is used.\n     * If the formatted value is larger than the length, the left hand side is lost.\n     * \n     * @param value  the value to append\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1301,col 9)-(line 1301,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendFixedWidthPadRight(java.lang.Object, int, char)",
      "begin_line": 1315,
      "end_line": 1335,
      "comment": "\n     * Appends an object to the builder padding on the right to a fixed length.\n     * The \u003ccode\u003etoString\u003c/code\u003e of the object is used.\n     * If the object is larger than the length, the right hand side is lost.\n     * If the object is null, null text value is used.\n     * \n     * @param obj  the object to append, null uses null text\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1316,col 9)-(line 1333,col 9)",
        "(line 1334,col 9)-(line 1334,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.appendFixedWidthPadRight(int, int, char)",
      "begin_line": 1347,
      "end_line": 1349,
      "comment": "\n     * Appends an object to the builder padding on the right to a fixed length.\n     * The \u003ccode\u003eString.valueOf\u003c/code\u003e of the \u003ccode\u003eint\u003c/code\u003e value is used.\n     * If the object is larger than the length, the right hand side is lost.\n     * \n     * @param value  the value to append\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1348,col 9)-(line 1348,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, java.lang.Object)",
      "begin_line": 1361,
      "end_line": 1366,
      "comment": "\n     * Inserts the string representation of an object into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param obj  the object to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1362,col 9)-(line 1364,col 9)",
        "(line 1365,col 9)-(line 1365,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, java.lang.String)",
      "begin_line": 1377,
      "end_line": 1392,
      "comment": "\n     * Inserts the string into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param str  the string to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1379,col 9)-(line 1379,col 29)",
        "(line 1380,col 9)-(line 1382,col 9)",
        "(line 1383,col 9)-(line 1383,col 54)",
        "(line 1384,col 9)-(line 1390,col 9)",
        "(line 1391,col 9)-(line 1391,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, char[])",
      "begin_line": 1403,
      "end_line": 1416,
      "comment": "\n     * Inserts the character array into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param chars  the char array to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1404,col 9)-(line 1404,col 29)",
        "(line 1405,col 9)-(line 1407,col 9)",
        "(line 1408,col 9)-(line 1408,col 31)",
        "(line 1409,col 9)-(line 1414,col 9)",
        "(line 1415,col 9)-(line 1415,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, char[], int, int)",
      "begin_line": 1429,
      "end_line": 1447,
      "comment": "\n     * Inserts part of the character array into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param chars  the char array to insert\n     * @param offset  the offset into the character array to start at, must be valid\n     * @param length  the length of the character array part to copy, must be positive\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 1430,col 9)-(line 1430,col 29)",
        "(line 1431,col 9)-(line 1433,col 9)",
        "(line 1434,col 9)-(line 1436,col 9)",
        "(line 1437,col 9)-(line 1439,col 9)",
        "(line 1440,col 9)-(line 1445,col 9)",
        "(line 1446,col 9)-(line 1446,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, boolean)",
      "begin_line": 1457,
      "end_line": 1478,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1458,col 9)-(line 1458,col 29)",
        "(line 1459,col 9)-(line 1476,col 9)",
        "(line 1477,col 9)-(line 1477,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, char)",
      "begin_line": 1488,
      "end_line": 1495,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1489,col 9)-(line 1489,col 29)",
        "(line 1490,col 9)-(line 1490,col 33)",
        "(line 1491,col 9)-(line 1491,col 73)",
        "(line 1492,col 9)-(line 1492,col 30)",
        "(line 1493,col 9)-(line 1493,col 15)",
        "(line 1494,col 9)-(line 1494,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, int)",
      "begin_line": 1505,
      "end_line": 1507,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1506,col 9)-(line 1506,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, long)",
      "begin_line": 1517,
      "end_line": 1519,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1518,col 9)-(line 1518,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, float)",
      "begin_line": 1529,
      "end_line": 1531,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1530,col 9)-(line 1530,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.insert(int, double)",
      "begin_line": 1541,
      "end_line": 1543,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1542,col 9)-(line 1542,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.deleteImpl(int, int, int)",
      "begin_line": 1554,
      "end_line": 1557,
      "comment": "\n     * Internal method to delete a range without validation.\n     *\n     * @param startIndex  the start index, must be valid\n     * @param endIndex  the end index (exclusive), must be valid\n     * @param len  the length, must be valid\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 1555,col 9)-(line 1555,col 80)",
        "(line 1556,col 9)-(line 1556,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.delete(int, int)",
      "begin_line": 1568,
      "end_line": 1575,
      "comment": "\n     * Deletes the characters between the two specified indices.\n     *\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1569,col 9)-(line 1569,col 55)",
        "(line 1570,col 9)-(line 1570,col 40)",
        "(line 1571,col 9)-(line 1573,col 9)",
        "(line 1574,col 9)-(line 1574,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.deleteAll(char)",
      "begin_line": 1584,
      "end_line": 1599,
      "comment": "\n     * Deletes the character wherever it occurs in the builder.\n     *\n     * @param ch  the character to delete\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1585,col 9)-(line 1597,col 9)",
        "(line 1598,col 9)-(line 1598,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.deleteFirst(char)",
      "begin_line": 1607,
      "end_line": 1615,
      "comment": "\n     * Deletes the character wherever it occurs in the builder.\n     *\n     * @param ch  the character to delete\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1608,col 9)-(line 1613,col 9)",
        "(line 1614,col 9)-(line 1614,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.deleteAll(java.lang.String)",
      "begin_line": 1624,
      "end_line": 1634,
      "comment": "\n     * Deletes the string wherever it occurs in the builder.\n     *\n     * @param str  the string to delete, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1625,col 9)-(line 1625,col 51)",
        "(line 1626,col 9)-(line 1632,col 9)",
        "(line 1633,col 9)-(line 1633,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.deleteFirst(java.lang.String)",
      "begin_line": 1642,
      "end_line": 1651,
      "comment": "\n     * Deletes the string wherever it occurs in the builder.\n     *\n     * @param str  the string to delete, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1643,col 9)-(line 1643,col 51)",
        "(line 1644,col 9)-(line 1649,col 9)",
        "(line 1650,col 9)-(line 1650,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.deleteAll(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 1664,
      "end_line": 1666,
      "comment": "\n     * Deletes all parts of the builder that the matcher matches.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced deletion behaviour.\n     * For example you could write a matcher to delete all occurances\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1665,col 9)-(line 1665,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.deleteFirst(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 1678,
      "end_line": 1680,
      "comment": "\n     * Deletes the first match within the builder using the specified matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced deletion behaviour.\n     * For example you could write a matcher to delete\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1679,col 9)-(line 1679,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replaceImpl(int, int, int, java.lang.String, int)",
      "begin_line": 1693,
      "end_line": 1703,
      "comment": "\n     * Internal method to delete a range without validation.\n     *\n     * @param startIndex  the start index, must be valid\n     * @param endIndex  the end index (exclusive), must be valid\n     * @param removeLen  the length to remove (endIndex - startIndex), must be valid\n     * @param insertStr  the string to replace with, null means delete range\n     * @param insertLen  the length of the insert string, must be valid\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 1694,col 9)-(line 1694,col 51)",
        "(line 1695,col 9)-(line 1699,col 9)",
        "(line 1700,col 9)-(line 1702,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replace(int, int, java.lang.String)",
      "begin_line": 1716,
      "end_line": 1721,
      "comment": "\n     * Replaces a portion of the string builder with another string.\n     * The length of the inserted string does not have to match the removed length.\n     *\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @param replaceStr  the string to replace with, null means delete range\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1717,col 9)-(line 1717,col 55)",
        "(line 1718,col 9)-(line 1718,col 71)",
        "(line 1719,col 9)-(line 1719,col 88)",
        "(line 1720,col 9)-(line 1720,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replaceAll(char, char)",
      "begin_line": 1732,
      "end_line": 1741,
      "comment": "\n     * Replaces the search character with the replace character\n     * throughout the builder.\n     *\n     * @param search  the search character\n     * @param replace  the replace character\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1733,col 9)-(line 1739,col 9)",
        "(line 1740,col 9)-(line 1740,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replaceFirst(char, char)",
      "begin_line": 1751,
      "end_line": 1761,
      "comment": "\n     * Replaces the first instance of the search character with the\n     * replace character in the builder.\n     *\n     * @param search  the search character\n     * @param replace  the replace character\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1752,col 9)-(line 1759,col 9)",
        "(line 1760,col 9)-(line 1760,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replaceAll(java.lang.String, java.lang.String)",
      "begin_line": 1771,
      "end_line": 1782,
      "comment": "\n     * Replaces the search string with the replace string throughout the builder.\n     *\n     * @param searchStr  the search string, null causes no action to occur\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1772,col 9)-(line 1772,col 69)",
        "(line 1773,col 9)-(line 1780,col 9)",
        "(line 1781,col 9)-(line 1781,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replaceFirst(java.lang.String, java.lang.String)",
      "begin_line": 1791,
      "end_line": 1801,
      "comment": "\n     * Replaces the first instance of the search string with the replace string.\n     *\n     * @param searchStr  the search string, null causes no action to occur\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1792,col 9)-(line 1792,col 69)",
        "(line 1793,col 9)-(line 1799,col 9)",
        "(line 1800,col 9)-(line 1800,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replaceAll(org.apache.commons.lang3.text.StrMatcher, java.lang.String)",
      "begin_line": 1815,
      "end_line": 1817,
      "comment": "\n     * Replaces all matches within the builder with the replace string.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced replace behaviour.\n     * For example you could write a matcher to replace all occurances\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1816,col 9)-(line 1816,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replaceFirst(org.apache.commons.lang3.text.StrMatcher, java.lang.String)",
      "begin_line": 1830,
      "end_line": 1832,
      "comment": "\n     * Replaces the first match within the builder with the replace string.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced replace behaviour.\n     * For example you could write a matcher to replace\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1831,col 9)-(line 1831,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replace(org.apache.commons.lang3.text.StrMatcher, java.lang.String, int, int, int)",
      "begin_line": 1851,
      "end_line": 1856,
      "comment": "\n     * Advanced search and replaces within the builder using a matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced behaviour.\n     * For example you could write a matcher to delete all occurances\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the string to replace the match with, null is a delete\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @param replaceCount  the number of times to replace, -1 for replace all\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if start index is invalid\n     ",
      "child_ranges": [
        "(line 1854,col 9)-(line 1854,col 55)",
        "(line 1855,col 9)-(line 1855,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.replaceImpl(org.apache.commons.lang3.text.StrMatcher, java.lang.String, int, int, int)",
      "begin_line": 1873,
      "end_line": 1893,
      "comment": "\n     * Replaces within the builder using a matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced behaviour.\n     * For example you could write a matcher to delete all occurances\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the string to replace the match with, null is a delete\n     * @param from  the start index, must be valid\n     * @param to  the end index (exclusive), must be valid\n     * @param replaceCount  the number of times to replace, -1 for replace all\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 1876,col 9)-(line 1878,col 9)",
        "(line 1879,col 9)-(line 1879,col 72)",
        "(line 1880,col 9)-(line 1880,col 28)",
        "(line 1881,col 9)-(line 1891,col 9)",
        "(line 1892,col 9)-(line 1892,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.reverse()",
      "begin_line": 1901,
      "end_line": 1914,
      "comment": "\n     * Reverses the string builder placing each character in the opposite index.\n     * \n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1902,col 9)-(line 1904,col 9)",
        "(line 1906,col 9)-(line 1906,col 28)",
        "(line 1907,col 9)-(line 1907,col 28)",
        "(line 1908,col 9)-(line 1912,col 9)",
        "(line 1913,col 9)-(line 1913,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.trim()",
      "begin_line": 1923,
      "end_line": 1943,
      "comment": "\n     * Trims the builder by removing characters less than or equal to a space\n     * from the beginning and end.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1924,col 9)-(line 1926,col 9)",
        "(line 1927,col 9)-(line 1927,col 23)",
        "(line 1928,col 9)-(line 1928,col 28)",
        "(line 1929,col 9)-(line 1929,col 20)",
        "(line 1930,col 9)-(line 1932,col 9)",
        "(line 1933,col 9)-(line 1935,col 9)",
        "(line 1936,col 9)-(line 1938,col 9)",
        "(line 1939,col 9)-(line 1941,col 9)",
        "(line 1942,col 9)-(line 1942,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.startsWith(java.lang.String)",
      "begin_line": 1954,
      "end_line": 1971,
      "comment": "\n     * Checks whether this builder starts with the specified string.\n     * \u003cp\u003e\n     * Note that this method handles null input quietly, unlike String.\n     * \n     * @param str  the string to search for, null returns false\n     * @return true if the builder starts with the string\n     ",
      "child_ranges": [
        "(line 1955,col 9)-(line 1957,col 9)",
        "(line 1958,col 9)-(line 1958,col 31)",
        "(line 1959,col 9)-(line 1961,col 9)",
        "(line 1962,col 9)-(line 1964,col 9)",
        "(line 1965,col 9)-(line 1969,col 9)",
        "(line 1970,col 9)-(line 1970,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.endsWith(java.lang.String)",
      "begin_line": 1981,
      "end_line": 1999,
      "comment": "\n     * Checks whether this builder ends with the specified string.\n     * \u003cp\u003e\n     * Note that this method handles null input quietly, unlike String.\n     * \n     * @param str  the string to search for, null returns false\n     * @return true if the builder ends with the string\n     ",
      "child_ranges": [
        "(line 1982,col 9)-(line 1984,col 9)",
        "(line 1985,col 9)-(line 1985,col 31)",
        "(line 1986,col 9)-(line 1988,col 9)",
        "(line 1989,col 9)-(line 1991,col 9)",
        "(line 1992,col 9)-(line 1992,col 29)",
        "(line 1993,col 9)-(line 1997,col 9)",
        "(line 1998,col 9)-(line 1998,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.subSequence(int, int)",
      "begin_line": 2005,
      "end_line": 2016,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 2006,col 7)-(line 2008,col 7)",
        "(line 2009,col 7)-(line 2011,col 7)",
        "(line 2012,col 7)-(line 2014,col 7)",
        "(line 2015,col 7)-(line 2015,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.substring(int)",
      "begin_line": 2025,
      "end_line": 2027,
      "comment": "\n     * Extracts a portion of this string builder as a string.\n     * \n     * @param start  the start index, inclusive, must be valid\n     * @return the new string\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 2026,col 9)-(line 2026,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.substring(int, int)",
      "begin_line": 2042,
      "end_line": 2045,
      "comment": "\n     * Extracts a portion of this string builder as a string.\n     * \u003cp\u003e\n     * Note: This method treats an endIndex greater than the length of the\n     * builder as equal to the length of the builder, and continues\n     * without error, unlike StringBuffer or String.\n     * \n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @return the new string\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 2043,col 9)-(line 2043,col 55)",
        "(line 2044,col 9)-(line 2044,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.leftString(int)",
      "begin_line": 2059,
      "end_line": 2067,
      "comment": "\n     * Extracts the leftmost characters from the string builder without\n     * throwing an exception.\n     * \u003cp\u003e\n     * This method extracts the left \u003ccode\u003elength\u003c/code\u003e characters from\n     * the builder. If this many characters are not available, the whole\n     * builder is returned. Thus the returned string may be shorter than the\n     * length requested.\n     * \n     * @param length  the number of characters to extract, negative returns empty string\n     * @return the new string\n     ",
      "child_ranges": [
        "(line 2060,col 9)-(line 2066,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.rightString(int)",
      "begin_line": 2081,
      "end_line": 2089,
      "comment": "\n     * Extracts the rightmost characters from the string builder without\n     * throwing an exception.\n     * \u003cp\u003e\n     * This method extracts the right \u003ccode\u003elength\u003c/code\u003e characters from\n     * the builder. If this many characters are not available, the whole\n     * builder is returned. Thus the returned string may be shorter than the\n     * length requested.\n     * \n     * @param length  the number of characters to extract, negative returns empty string\n     * @return the new string\n     ",
      "child_ranges": [
        "(line 2082,col 9)-(line 2088,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.midString(int, int)",
      "begin_line": 2107,
      "end_line": 2119,
      "comment": "\n     * Extracts some characters from the middle of the string builder without\n     * throwing an exception.\n     * \u003cp\u003e\n     * This method extracts \u003ccode\u003elength\u003c/code\u003e characters from the builder\n     * at the specified index.\n     * If the index is negative it is treated as zero.\n     * If the index is greater than the builder size, it is treated as the builder size.\n     * If the length is negative, the empty string is returned.\n     * If insufficient characters are available in the builder, as much as possible is returned.\n     * Thus the returned string may be shorter than the length requested.\n     * \n     * @param index  the index to start at, negative means zero\n     * @param length  the number of characters to extract, negative returns empty string\n     * @return the new string\n     ",
      "child_ranges": [
        "(line 2108,col 9)-(line 2110,col 9)",
        "(line 2111,col 9)-(line 2113,col 9)",
        "(line 2114,col 9)-(line 2118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.contains(char)",
      "begin_line": 2128,
      "end_line": 2136,
      "comment": "\n     * Checks if the string builder contains the specified char.\n     *\n     * @param ch  the character to find\n     * @return true if the builder contains the character\n     ",
      "child_ranges": [
        "(line 2129,col 9)-(line 2129,col 32)",
        "(line 2130,col 9)-(line 2134,col 9)",
        "(line 2135,col 9)-(line 2135,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.contains(java.lang.String)",
      "begin_line": 2144,
      "end_line": 2146,
      "comment": "\n     * Checks if the string builder contains the specified string.\n     *\n     * @param str  the string to find\n     * @return true if the builder contains the string\n     ",
      "child_ranges": [
        "(line 2145,col 9)-(line 2145,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.contains(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 2159,
      "end_line": 2161,
      "comment": "\n     * Checks if the string builder contains a string matched using the\n     * specified matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to search for the character\n     * \u0027a\u0027 followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @return true if the matcher finds a match in the builder\n     ",
      "child_ranges": [
        "(line 2160,col 9)-(line 2160,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.indexOf(char)",
      "begin_line": 2170,
      "end_line": 2172,
      "comment": "\n     * Searches the string builder to find the first reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @return the first index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2171,col 9)-(line 2171,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.indexOf(char, int)",
      "begin_line": 2181,
      "end_line": 2193,
      "comment": "\n     * Searches the string builder to find the first reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the first index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2182,col 9)-(line 2182,col 55)",
        "(line 2183,col 9)-(line 2185,col 9)",
        "(line 2186,col 9)-(line 2186,col 32)",
        "(line 2187,col 9)-(line 2191,col 9)",
        "(line 2192,col 9)-(line 2192,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.indexOf(java.lang.String)",
      "begin_line": 2203,
      "end_line": 2205,
      "comment": "\n     * Searches the string builder to find the first reference to the specified string.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @return the first index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2204,col 9)-(line 2204,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.indexOf(java.lang.String, int)",
      "begin_line": 2217,
      "end_line": 2244,
      "comment": "\n     * Searches the string builder to find the first reference to the specified\n     * string starting searching from the given index.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the first index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2218,col 9)-(line 2218,col 55)",
        "(line 2219,col 9)-(line 2221,col 9)",
        "(line 2222,col 9)-(line 2222,col 34)",
        "(line 2223,col 9)-(line 2225,col 9)",
        "(line 2226,col 9)-(line 2228,col 9)",
        "(line 2229,col 9)-(line 2231,col 9)",
        "(line 2232,col 9)-(line 2232,col 32)",
        "(line 2233,col 9)-(line 2233,col 36)",
        "(line 2234,col 9)-(line 2242,col 9)",
        "(line 2243,col 9)-(line 2243,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.indexOf(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 2256,
      "end_line": 2258,
      "comment": "\n     * Searches the string builder using the matcher to find the first match.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @return the first index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2257,col 9)-(line 2257,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.indexOf(org.apache.commons.lang3.text.StrMatcher, int)",
      "begin_line": 2272,
      "end_line": 2285,
      "comment": "\n     * Searches the string builder using the matcher to find the first\n     * match searching from the given index.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the first index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2273,col 9)-(line 2273,col 55)",
        "(line 2274,col 9)-(line 2276,col 9)",
        "(line 2277,col 9)-(line 2277,col 23)",
        "(line 2278,col 9)-(line 2278,col 28)",
        "(line 2279,col 9)-(line 2283,col 9)",
        "(line 2284,col 9)-(line 2284,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.lastIndexOf(char)",
      "begin_line": 2294,
      "end_line": 2296,
      "comment": "\n     * Searches the string builder to find the last reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @return the last index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2295,col 9)-(line 2295,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.lastIndexOf(char, int)",
      "begin_line": 2305,
      "end_line": 2316,
      "comment": "\n     * Searches the string builder to find the last reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the last index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2306,col 9)-(line 2306,col 66)",
        "(line 2307,col 9)-(line 2309,col 9)",
        "(line 2310,col 9)-(line 2314,col 9)",
        "(line 2315,col 9)-(line 2315,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.lastIndexOf(java.lang.String)",
      "begin_line": 2326,
      "end_line": 2328,
      "comment": "\n     * Searches the string builder to find the last reference to the specified string.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @return the last index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2327,col 9)-(line 2327,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.lastIndexOf(java.lang.String, int)",
      "begin_line": 2340,
      "end_line": 2365,
      "comment": "\n     * Searches the string builder to find the last reference to the specified\n     * string starting searching from the given index.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the last index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2341,col 9)-(line 2341,col 66)",
        "(line 2342,col 9)-(line 2344,col 9)",
        "(line 2345,col 9)-(line 2345,col 34)",
        "(line 2346,col 9)-(line 2363,col 9)",
        "(line 2364,col 9)-(line 2364,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.lastIndexOf(org.apache.commons.lang3.text.StrMatcher)",
      "begin_line": 2377,
      "end_line": 2379,
      "comment": "\n     * Searches the string builder using the matcher to find the last match.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @return the last index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2378,col 9)-(line 2378,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.lastIndexOf(org.apache.commons.lang3.text.StrMatcher, int)",
      "begin_line": 2393,
      "end_line": 2406,
      "comment": "\n     * Searches the string builder using the matcher to find the last\n     * match searching from the given index.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the last index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2394,col 9)-(line 2394,col 66)",
        "(line 2395,col 9)-(line 2397,col 9)",
        "(line 2398,col 9)-(line 2398,col 28)",
        "(line 2399,col 9)-(line 2399,col 38)",
        "(line 2400,col 9)-(line 2404,col 9)",
        "(line 2405,col 9)-(line 2405,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.asTokenizer()",
      "begin_line": 2441,
      "end_line": 2443,
      "comment": "\n     * Creates a tokenizer that can tokenize the contents of this builder.\n     * \u003cp\u003e\n     * This method allows the contents of this builder to be tokenized.\n     * The tokenizer will be setup by default to tokenize on space, tab,\n     * newline and formfeed (as per StringTokenizer). These values can be\n     * changed on the tokenizer class, before retrieving the tokens.\n     * \u003cp\u003e\n     * The returned tokenizer is linked to this builder. You may intermix\n     * calls to the buider and tokenizer within certain limits, however\n     * there is no synchronization. Once the tokenizer has been used once,\n     * it must be {@link StrTokenizer#reset() reset} to pickup the latest\n     * changes in the builder. For example:\n     * \u003cpre\u003e\n     * StrBuilder b \u003d new StrBuilder();\n     * b.append(\"a b \");\n     * StrTokenizer t \u003d b.asTokenizer();\n     * String[] tokens1 \u003d t.getTokenArray();  // returns a,b\n     * b.append(\"c d \");\n     * String[] tokens2 \u003d t.getTokenArray();  // returns a,b (c and d ignored)\n     * t.reset();              // reset causes builder changes to be picked up\n     * String[] tokens3 \u003d t.getTokenArray();  // returns a,b,c,d\n     * \u003c/pre\u003e\n     * In addition to simply intermixing appends and tokenization, you can also\n     * call the set methods on the tokenizer to alter how it tokenizes. Just\n     * remember to call reset when you want to pickup builder changes.\n     * \u003cp\u003e\n     * Calling {@link StrTokenizer#reset(String)} or {@link StrTokenizer#reset(char[])}\n     * with a non-null value will break the link with the builder.\n     *\n     * @return a tokenizer that is linked to this builder\n     ",
      "child_ranges": [
        "(line 2442,col 9)-(line 2442,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.asReader()",
      "begin_line": 2465,
      "end_line": 2467,
      "comment": "\n     * Gets the contents of this builder as a Reader.\n     * \u003cp\u003e\n     * This method allows the contents of the builder to be read\n     * using any standard method that expects a Reader.\n     * \u003cp\u003e\n     * To use, simply create a \u003ccode\u003eStrBuilder\u003c/code\u003e, populate it with\n     * data, call \u003ccode\u003easReader\u003c/code\u003e, and then read away.\n     * \u003cp\u003e\n     * The internal character array is shared between the builder and the reader.\n     * This allows you to append to the builder after creating the reader,\n     * and the changes will be picked up.\n     * Note however, that no synchronization occurs, so you must perform\n     * all operations with the builder and the reader in one thread.\n     * \u003cp\u003e\n     * The returned reader supports marking, and ignores the flush method.\n     *\n     * @return a reader that reads from this builder\n     ",
      "child_ranges": [
        "(line 2466,col 9)-(line 2466,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.asWriter()",
      "begin_line": 2490,
      "end_line": 2492,
      "comment": "\n     * Gets this builder as a Writer that can be written to.\n     * \u003cp\u003e\n     * This method allows you to populate the contents of the builder\n     * using any standard method that takes a Writer.\n     * \u003cp\u003e\n     * To use, simply create a \u003ccode\u003eStrBuilder\u003c/code\u003e,\n     * call \u003ccode\u003easWriter\u003c/code\u003e, and populate away. The data is available\n     * at any time using the methods of the \u003ccode\u003eStrBuilder\u003c/code\u003e.\n     * \u003cp\u003e\n     * The internal character array is shared between the builder and the writer.\n     * This allows you to intermix calls that append to the builder and\n     * write using the writer and the changes will be occur correctly.\n     * Note however, that no synchronization occurs, so you must perform\n     * all operations with the builder and the writer in one thread.\n     * \u003cp\u003e\n     * The returned writer ignores the close and flush methods.\n     *\n     * @return a writer that populates this builder\n     ",
      "child_ranges": [
        "(line 2491,col 9)-(line 2491,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.equalsIgnoreCase(org.apache.commons.lang3.text.StrBuilder)",
      "begin_line": 2532,
      "end_line": 2549,
      "comment": "\n     * Checks the contents of this builder against another to see if they\n     * contain the same character content ignoring case.\n     *\n     * @param other  the object to check, null returns false\n     * @return true if the builders contain the same characters in the same order\n     ",
      "child_ranges": [
        "(line 2533,col 9)-(line 2535,col 9)",
        "(line 2536,col 9)-(line 2538,col 9)",
        "(line 2539,col 9)-(line 2539,col 37)",
        "(line 2540,col 9)-(line 2540,col 39)",
        "(line 2541,col 9)-(line 2547,col 9)",
        "(line 2548,col 9)-(line 2548,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.equals(org.apache.commons.lang3.text.StrBuilder)",
      "begin_line": 2558,
      "end_line": 2573,
      "comment": "\n     * Checks the contents of this builder against another to see if they\n     * contain the same character content.\n     *\n     * @param other  the object to check, null returns false\n     * @return true if the builders contain the same characters in the same order\n     ",
      "child_ranges": [
        "(line 2559,col 9)-(line 2561,col 9)",
        "(line 2562,col 9)-(line 2564,col 9)",
        "(line 2565,col 9)-(line 2565,col 37)",
        "(line 2566,col 9)-(line 2566,col 39)",
        "(line 2567,col 9)-(line 2571,col 9)",
        "(line 2572,col 9)-(line 2572,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.equals(java.lang.Object)",
      "begin_line": 2582,
      "end_line": 2588,
      "comment": "\n     * Checks the contents of this builder against another to see if they\n     * contain the same character content.\n     *\n     * @param obj  the object to check, null returns false\n     * @return true if the builders contain the same characters in the same order\n     ",
      "child_ranges": [
        "(line 2584,col 9)-(line 2586,col 9)",
        "(line 2587,col 9)-(line 2587,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.hashCode()",
      "begin_line": 2595,
      "end_line": 2603,
      "comment": "\n     * Gets a suitable hash code for this builder.\n     *\n     * @return a hash code\n     ",
      "child_ranges": [
        "(line 2597,col 9)-(line 2597,col 28)",
        "(line 2598,col 9)-(line 2598,col 21)",
        "(line 2599,col 9)-(line 2601,col 9)",
        "(line 2602,col 9)-(line 2602,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.toString()",
      "begin_line": 2615,
      "end_line": 2618,
      "comment": "\n     * Gets a String version of the string builder, creating a new instance\n     * each time the method is called.\n     * \u003cp\u003e\n     * Note that unlike StringBuffer, the string version returned is\n     * independent of the string builder.\n     *\n     * @return the builder as a String\n     ",
      "child_ranges": [
        "(line 2617,col 9)-(line 2617,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.toStringBuffer()",
      "begin_line": 2626,
      "end_line": 2628,
      "comment": "\n     * Gets a StringBuffer version of the string builder, creating a\n     * new instance each time the method is called.\n     *\n     * @return the builder as a StringBuffer\n     ",
      "child_ranges": [
        "(line 2627,col 9)-(line 2627,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.validateRange(int, int)",
      "begin_line": 2640,
      "end_line": 2651,
      "comment": "\n     * Validates parameters defining a range of the builder.\n     * \n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @return the new string\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 2641,col 9)-(line 2643,col 9)",
        "(line 2644,col 9)-(line 2646,col 9)",
        "(line 2647,col 9)-(line 2649,col 9)",
        "(line 2650,col 9)-(line 2650,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.validateIndex(int)",
      "begin_line": 2659,
      "end_line": 2663,
      "comment": "\n     * Validates parameters defining a single index in the builder.\n     * \n     * @param index  the index, must be valid\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 2660,col 9)-(line 2662,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StrBuilderTokenizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.text.StrTokenizer"
      ],
      "begin_line": 2669,
      "end_line": 2695,
      "comment": "\n     * Inner class to allow StrBuilder to operate as a tokenizer.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderTokenizer.StrBuilderTokenizer()",
      "begin_line": 2671,
      "end_line": 2673,
      "comment": "",
      "child_ranges": [
        "(line 2672,col 13)-(line 2672,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderTokenizer.tokenize(char[], int, int)",
      "begin_line": 2676,
      "end_line": 2683,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2678,col 13)-(line 2682,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderTokenizer.getContent()",
      "begin_line": 2686,
      "end_line": 2694,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2688,col 13)-(line 2688,col 44)",
        "(line 2689,col 13)-(line 2693,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StrBuilderReader",
      "is_interface": false,
      "parent_types": [
        "java.io.Reader"
      ],
      "begin_line": 2701,
      "end_line": 2783,
      "comment": "\n     * Inner class to allow StrBuilder to operate as a writer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 2703,
      "end_line": 2703,
      "comment": " The current stream position. "
    },
    {
      "type": "field",
      "varNames": [
        "mark"
      ],
      "begin_line": 2705,
      "end_line": 2705,
      "comment": " The last mark position. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.StrBuilderReader()",
      "begin_line": 2707,
      "end_line": 2709,
      "comment": "",
      "child_ranges": [
        "(line 2708,col 13)-(line 2708,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.close()",
      "begin_line": 2712,
      "end_line": 2715,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.read()",
      "begin_line": 2718,
      "end_line": 2724,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2720,col 13)-(line 2722,col 13)",
        "(line 2723,col 13)-(line 2723,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.read(char[], int, int)",
      "begin_line": 2727,
      "end_line": 2745,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2729,col 13)-(line 2732,col 13)",
        "(line 2733,col 13)-(line 2735,col 13)",
        "(line 2736,col 13)-(line 2738,col 13)",
        "(line 2739,col 13)-(line 2741,col 13)",
        "(line 2742,col 13)-(line 2742,col 61)",
        "(line 2743,col 13)-(line 2743,col 23)",
        "(line 2744,col 13)-(line 2744,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.skip(long)",
      "begin_line": 2748,
      "end_line": 2758,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2750,col 13)-(line 2752,col 13)",
        "(line 2753,col 13)-(line 2755,col 13)",
        "(line 2756,col 13)-(line 2756,col 21)",
        "(line 2757,col 13)-(line 2757,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.ready()",
      "begin_line": 2761,
      "end_line": 2764,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2763,col 13)-(line 2763,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.markSupported()",
      "begin_line": 2767,
      "end_line": 2770,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2769,col 13)-(line 2769,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.mark(int)",
      "begin_line": 2773,
      "end_line": 2776,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2775,col 13)-(line 2775,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderReader.reset()",
      "begin_line": 2779,
      "end_line": 2782,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2781,col 13)-(line 2781,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StrBuilderWriter",
      "is_interface": false,
      "parent_types": [
        "java.io.Writer"
      ],
      "begin_line": 2789,
      "end_line": 2836,
      "comment": "\n     * Inner class to allow StrBuilder to operate as a writer.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter.StrBuilderWriter()",
      "begin_line": 2791,
      "end_line": 2793,
      "comment": "",
      "child_ranges": [
        "(line 2792,col 13)-(line 2792,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter.close()",
      "begin_line": 2796,
      "end_line": 2799,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter.flush()",
      "begin_line": 2802,
      "end_line": 2805,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter.write(int)",
      "begin_line": 2808,
      "end_line": 2811,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2810,col 13)-(line 2810,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter.write(char[])",
      "begin_line": 2814,
      "end_line": 2817,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2816,col 13)-(line 2816,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter.write(char[], int, int)",
      "begin_line": 2820,
      "end_line": 2823,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2822,col 13)-(line 2822,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter.write(java.lang.String)",
      "begin_line": 2826,
      "end_line": 2829,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2828,col 13)-(line 2828,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.text.StrBuilder.StrBuilderWriter.write(java.lang.String, int, int)",
      "begin_line": 2832,
      "end_line": 2835,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2834,col 13)-(line 2834,col 50)"
      ]
    }
  ]
}