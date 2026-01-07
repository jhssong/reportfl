{
  "filepath": "/tmp/Lang-41b/src/java/org/apache/commons/lang/text/StrBuilder.java",
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
      "end_line": 2789,
      "comment": "\n * Builds a string from constituent parts providing a more flexible and powerful API\n * than StringBuffer.\n * \u003cp\u003e\n * The main differences from StringBuffer/StringBuilder are:\n * \u003cul\u003e\n * \u003cli\u003eNot synchronized\u003c/li\u003e\n * \u003cli\u003eNot final\u003c/li\u003e\n * \u003cli\u003eSubclasses have direct access to character array\u003c/li\u003e\n * \u003cli\u003eAdditional methods\n *  \u003cul\u003e\n *   \u003cli\u003eappendWithSeparators - adds an array of values, with a separator\u003c/li\u003e\n *   \u003cli\u003eappendPadding - adds a length padding characters\u003c/li\u003e\n *   \u003cli\u003eappendFixedLength - adds a fixed width field to the builder\u003c/li\u003e\n *   \u003cli\u003etoCharArray/getChars - simpler ways to get a range of the character array\u003c/li\u003e\n *   \u003cli\u003edelete - delete char or string\u003c/li\u003e\n *   \u003cli\u003ereplace - search and replace for a char or string\u003c/li\u003e\n *   \u003cli\u003eleftString/rightString/midString - substring without exceptions\u003c/li\u003e\n *   \u003cli\u003econtains - whether the builder contains a char or string\u003c/li\u003e\n *   \u003cli\u003esize/clear/isEmpty - collections style API methods\u003c/li\u003e\n *  \u003c/ul\u003e\n * \u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cli\u003eViews\n *  \u003cul\u003e\n *   \u003cli\u003easTokenizer - uses the internal buffer as the source of a StrTokenizer\u003c/li\u003e\n *   \u003cli\u003easReader - uses the internal buffer as the source of a Reader\u003c/li\u003e\n *   \u003cli\u003easWriter - allows a Writer to write directly to the internal buffer\u003c/li\u003e\n *  \u003c/ul\u003e\n * \u003c/li\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * The aim has been to provide an API that mimics very closely what StringBuffer\n * provides, but with additional methods. It should be noted that some edge cases,\n * with invalid indices or null input, have been altered - see individual methods.\n * The biggest of these changes is that by default, null will not output the text\n * \u0027null\u0027. This can be controlled by a property, {@link #setNullText(String)}.\n * \u003cp\u003e\n * Prior to 3.0, this class implemented Cloneable but did not implement the \n * clone method so could not be used. From 3.0 onwards it no longer implements \n * the interface. \n *\n * @author Stephen Colebourne\n * @since 2.2\n * @version $Id$\n "
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
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilder()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Constructor that creates an empty builder initial capacity 32 characters.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilder(int)",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilder(java.lang.String)",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.getNewLineText()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * Gets the text to be appended when a new line is added.\n     *\n     * @return the new line text, null means use system default\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.setNewLineText(java.lang.String)",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.getNullText()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * Gets the text to be appended when null is added.\n     *\n     * @return the null text, null means no append\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.setNullText(java.lang.String)",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.length()",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n     * Gets the length of the string builder.\n     *\n     * @return the length\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.setLength(int)",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.capacity()",
      "begin_line": 221,
      "end_line": 223,
      "comment": "\n     * Gets the current size of the internal character array buffer.\n     *\n     * @return the capacity\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.ensureCapacity(int)",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.minimizeCapacity()",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.size()",
      "begin_line": 263,
      "end_line": 265,
      "comment": "\n     * Gets the length of the string builder.\n     * \u003cp\u003e\n     * This method is the same as {@link #length()} and is provided to match the\n     * API of Collections.\n     *\n     * @return the length\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.isEmpty()",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\n     * Checks is the string builder is empty (convenience Collections API style method).\n     * \u003cp\u003e\n     * This method is the same as checking {@link #length()} and is provided to match the\n     * API of Collections.\n     *\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the size is \u003ccode\u003e0\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.clear()",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.charAt(int)",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.setCharAt(int, char)",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteCharAt(int)",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.toCharArray()",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.toCharArray(int, int)",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.getChars(char[])",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.getChars(int, int, char[], int)",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.appendNewLine()",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.appendNull()",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.append(java.lang.Object)",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.append(java.lang.CharSequence)",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.append(java.lang.CharSequence, int, int)",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.append(java.lang.String)",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.append(java.lang.String, int, int)",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.append(java.lang.StringBuffer)",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.append(java.lang.StringBuffer, int, int)",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.append(org.apache.commons.lang.text.StrBuilder)",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.append(org.apache.commons.lang.text.StrBuilder, int, int)",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.append(char[])",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.append(char[], int, int)",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.append(boolean)",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.append(char)",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.append(int)",
      "begin_line": 734,
      "end_line": 736,
      "comment": "\n     * Appends an int value to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 735,col 9)-(line 735,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(long)",
      "begin_line": 744,
      "end_line": 746,
      "comment": "\n     * Appends a long value to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 745,col 9)-(line 745,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(float)",
      "begin_line": 754,
      "end_line": 756,
      "comment": "\n     * Appends a float value to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 755,col 9)-(line 755,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.append(double)",
      "begin_line": 764,
      "end_line": 766,
      "comment": "\n     * Appends a double value to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 765,col 9)-(line 765,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendln(java.lang.Object)",
      "begin_line": 777,
      "end_line": 779,
      "comment": "\n     * Appends an object followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param obj  the object to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 778,col 9)-(line 778,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendln(java.lang.String)",
      "begin_line": 789,
      "end_line": 791,
      "comment": "\n     * Appends a string followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 790,col 9)-(line 790,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendln(java.lang.String, int, int)",
      "begin_line": 803,
      "end_line": 805,
      "comment": "\n     * Appends part of a string followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 804,col 9)-(line 804,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendln(java.lang.StringBuffer)",
      "begin_line": 815,
      "end_line": 817,
      "comment": "\n     * Appends a string buffer followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string buffer to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 816,col 9)-(line 816,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendln(java.lang.StringBuffer, int, int)",
      "begin_line": 829,
      "end_line": 831,
      "comment": "\n     * Appends part of a string buffer followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 830,col 9)-(line 830,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendln(org.apache.commons.lang.text.StrBuilder)",
      "begin_line": 841,
      "end_line": 843,
      "comment": "\n     * Appends another string builder followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string builder to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 842,col 9)-(line 842,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendln(org.apache.commons.lang.text.StrBuilder, int, int)",
      "begin_line": 855,
      "end_line": 857,
      "comment": "\n     * Appends part of a string builder followed by a new line to this string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param str  the string to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 856,col 9)-(line 856,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendln(char[])",
      "begin_line": 867,
      "end_line": 869,
      "comment": "\n     * Appends a char array followed by a new line to the string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param chars  the char array to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 868,col 9)-(line 868,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendln(char[], int, int)",
      "begin_line": 881,
      "end_line": 883,
      "comment": "\n     * Appends a char array followed by a new line to the string builder.\n     * Appending null will call {@link #appendNull()}.\n     *\n     * @param chars  the char array to append\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param length  the length to append, must be valid\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 882,col 9)-(line 882,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendln(boolean)",
      "begin_line": 892,
      "end_line": 894,
      "comment": "\n     * Appends a boolean value followed by a new line to the string builder.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 893,col 9)-(line 893,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendln(char)",
      "begin_line": 903,
      "end_line": 905,
      "comment": "\n     * Appends a char value followed by a new line to the string builder.\n     *\n     * @param ch  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 904,col 9)-(line 904,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendln(int)",
      "begin_line": 914,
      "end_line": 916,
      "comment": "\n     * Appends an int value followed by a new line to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 915,col 9)-(line 915,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendln(long)",
      "begin_line": 925,
      "end_line": 927,
      "comment": "\n     * Appends a long value followed by a new line to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 926,col 9)-(line 926,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendln(float)",
      "begin_line": 936,
      "end_line": 938,
      "comment": "\n     * Appends a float value followed by a new line to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 937,col 9)-(line 937,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendln(double)",
      "begin_line": 947,
      "end_line": 949,
      "comment": "\n     * Appends a double value followed by a new line to the string builder using \u003ccode\u003eString.valueOf\u003c/code\u003e.\n     *\n     * @param value  the value to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 948,col 9)-(line 948,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendAll(java.lang.Object[])",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.appendAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 979,
      "end_line": 987,
      "comment": "\n     * Appends each item in a collection to the builder without any separators.\n     * Appending a null collection will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param coll  the collection to append\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 980,col 9)-(line 985,col 9)",
        "(line 986,col 9)-(line 986,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendAll(java.util.Iterator\u003c?\u003e)",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.appendWithSeparators(java.lang.Object[], java.lang.String)",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.appendWithSeparators(java.util.Collection\u003c?\u003e, java.lang.String)",
      "begin_line": 1040,
      "end_line": 1052,
      "comment": "\n     * Appends a collection placing separators between each value, but\n     * not before the first or after the last.\n     * Appending a null collection will have no effect.\n     * Each object is appended using {@link #append(Object)}.\n     *\n     * @param coll  the collection to append\n     * @param separator  the separator to use, null means no separator\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1041,col 9)-(line 1050,col 9)",
        "(line 1051,col 9)-(line 1051,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendWithSeparators(java.util.Iterator\u003c?\u003e, java.lang.String)",
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
      "signature": "org.apache.commons.lang.text.StrBuilder.appendSeparator(java.lang.String)",
      "begin_line": 1098,
      "end_line": 1103,
      "comment": "\n     * Appends a separator if the builder is currently non-empty.\n     * Appending a null separator will have no effect.\n     * The separator is appended using {@link #append(String)}.\n     * \u003cp\u003e\n     * This method is useful for adding a separator each time around the\n     * loop except the first.\n     * \u003cpre\u003e\n     * for (Iterator it \u003d list.iterator(); it.hasNext(); ) {\n     *   appendSeparator(\",\");\n     *   append(it.next());\n     * }\n     * \u003c/pre\u003e\n     * Note that for this simple example, you should use\n     * {@link #appendWithSeparators(Collection, String)}.\n     * \n     * @param separator  the separator to use, null means no separator\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1099,col 9)-(line 1101,col 9)",
        "(line 1102,col 9)-(line 1102,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendSeparator(char)",
      "begin_line": 1124,
      "end_line": 1129,
      "comment": "\n     * Appends a separator if the builder is currently non-empty.\n     * The separator is appended using {@link #append(char)}.\n     * \u003cp\u003e\n     * This method is useful for adding a separator each time around the\n     * loop except the first.\n     * \u003cpre\u003e\n     * for (Iterator it \u003d list.iterator(); it.hasNext(); ) {\n     *   appendSeparator(\u0027,\u0027);\n     *   append(it.next());\n     * }\n     * \u003c/pre\u003e\n     * Note that for this simple example, you should use\n     * {@link #appendWithSeparators(Collection, String)}.\n     * \n     * @param separator  the separator to use\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1125,col 9)-(line 1127,col 9)",
        "(line 1128,col 9)-(line 1128,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendSeparator(java.lang.String, int)",
      "begin_line": 1152,
      "end_line": 1157,
      "comment": "\n     * Appends a separator to the builder if the loop index is greater than zero.\n     * Appending a null separator will have no effect.\n     * The separator is appended using {@link #append(String)}.\n     * \u003cp\u003e\n     * This method is useful for adding a separator each time around the\n     * loop except the first.\n     * \u003cpre\u003e\n     * for (int i \u003d 0; i \u003c list.size(); i++) {\n     *   appendSeparator(\",\", i);\n     *   append(list.get(i));\n     * }\n     * \u003c/pre\u003e\n     * Note that for this simple example, you should use\n     * {@link #appendWithSeparators(Collection, String)}.\n     * \n     * @param separator  the separator to use, null means no separator\n     * @param loopIndex  the loop index\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1153,col 9)-(line 1155,col 9)",
        "(line 1156,col 9)-(line 1156,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendSeparator(char, int)",
      "begin_line": 1179,
      "end_line": 1184,
      "comment": "\n     * Appends a separator to the builder if the loop index is greater than zero.\n     * The separator is appended using {@link #append(char)}.\n     * \u003cp\u003e\n     * This method is useful for adding a separator each time around the\n     * loop except the first.\n     * \u003cpre\u003e\n     * for (int i \u003d 0; i \u003c list.size(); i++) {\n     *   appendSeparator(\",\", i);\n     *   append(list.get(i));\n     * }\n     * \u003c/pre\u003e\n     * Note that for this simple example, you should use\n     * {@link #appendWithSeparators(Collection, String)}.\n     * \n     * @param separator  the separator to use\n     * @param loopIndex  the loop index\n     * @return this, to enable chaining\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1180,col 9)-(line 1182,col 9)",
        "(line 1183,col 9)-(line 1183,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendPadding(int, char)",
      "begin_line": 1194,
      "end_line": 1202,
      "comment": "\n     * Appends the pad character to the builder the specified number of times.\n     * \n     * @param length  the length to append, negative means no append\n     * @param padChar  the character to append\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1195,col 9)-(line 1200,col 9)",
        "(line 1201,col 9)-(line 1201,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadLeft(java.lang.Object, int, char)",
      "begin_line": 1216,
      "end_line": 1236,
      "comment": "\n     * Appends an object to the builder padding on the left to a fixed width.\n     * The \u003ccode\u003etoString\u003c/code\u003e of the object is used.\n     * If the object is larger than the length, the left hand side is lost.\n     * If the object is null, the null text value is used.\n     * \n     * @param obj  the object to append, null uses null text\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1217,col 9)-(line 1234,col 9)",
        "(line 1235,col 9)-(line 1235,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadLeft(int, int, char)",
      "begin_line": 1248,
      "end_line": 1250,
      "comment": "\n     * Appends an object to the builder padding on the left to a fixed width.\n     * The \u003ccode\u003eString.valueOf\u003c/code\u003e of the \u003ccode\u003eint\u003c/code\u003e value is used.\n     * If the formatted value is larger than the length, the left hand side is lost.\n     * \n     * @param value  the value to append\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1249,col 9)-(line 1249,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadRight(java.lang.Object, int, char)",
      "begin_line": 1263,
      "end_line": 1283,
      "comment": "\n     * Appends an object to the builder padding on the right to a fixed length.\n     * The \u003ccode\u003etoString\u003c/code\u003e of the object is used.\n     * If the object is larger than the length, the right hand side is lost.\n     * If the object is null, null text value is used.\n     * \n     * @param obj  the object to append, null uses null text\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1264,col 9)-(line 1281,col 9)",
        "(line 1282,col 9)-(line 1282,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.appendFixedWidthPadRight(int, int, char)",
      "begin_line": 1295,
      "end_line": 1297,
      "comment": "\n     * Appends an object to the builder padding on the right to a fixed length.\n     * The \u003ccode\u003eString.valueOf\u003c/code\u003e of the \u003ccode\u003eint\u003c/code\u003e value is used.\n     * If the object is larger than the length, the right hand side is lost.\n     * \n     * @param value  the value to append\n     * @param width  the fixed field width, zero or negative has no effect\n     * @param padChar  the pad character to use\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1296,col 9)-(line 1296,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, java.lang.Object)",
      "begin_line": 1309,
      "end_line": 1314,
      "comment": "\n     * Inserts the string representation of an object into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param obj  the object to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1310,col 9)-(line 1312,col 9)",
        "(line 1313,col 9)-(line 1313,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, java.lang.String)",
      "begin_line": 1325,
      "end_line": 1340,
      "comment": "\n     * Inserts the string into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param str  the string to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1327,col 9)-(line 1327,col 29)",
        "(line 1328,col 9)-(line 1330,col 9)",
        "(line 1331,col 9)-(line 1331,col 54)",
        "(line 1332,col 9)-(line 1338,col 9)",
        "(line 1339,col 9)-(line 1339,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, char[])",
      "begin_line": 1351,
      "end_line": 1364,
      "comment": "\n     * Inserts the character array into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param chars  the char array to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1352,col 9)-(line 1352,col 29)",
        "(line 1353,col 9)-(line 1355,col 9)",
        "(line 1356,col 9)-(line 1356,col 31)",
        "(line 1357,col 9)-(line 1362,col 9)",
        "(line 1363,col 9)-(line 1363,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, char[], int, int)",
      "begin_line": 1377,
      "end_line": 1395,
      "comment": "\n     * Inserts part of the character array into this builder.\n     * Inserting null will use the stored null text value.\n     *\n     * @param index  the index to add at, must be valid\n     * @param chars  the char array to insert\n     * @param offset  the offset into the character array to start at, must be valid\n     * @param length  the length of the character array part to copy, must be positive\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 1378,col 9)-(line 1378,col 29)",
        "(line 1379,col 9)-(line 1381,col 9)",
        "(line 1382,col 9)-(line 1384,col 9)",
        "(line 1385,col 9)-(line 1387,col 9)",
        "(line 1388,col 9)-(line 1393,col 9)",
        "(line 1394,col 9)-(line 1394,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, boolean)",
      "begin_line": 1405,
      "end_line": 1426,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1406,col 9)-(line 1406,col 29)",
        "(line 1407,col 9)-(line 1424,col 9)",
        "(line 1425,col 9)-(line 1425,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, char)",
      "begin_line": 1436,
      "end_line": 1443,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1437,col 9)-(line 1437,col 29)",
        "(line 1438,col 9)-(line 1438,col 33)",
        "(line 1439,col 9)-(line 1439,col 73)",
        "(line 1440,col 9)-(line 1440,col 30)",
        "(line 1441,col 9)-(line 1441,col 15)",
        "(line 1442,col 9)-(line 1442,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, int)",
      "begin_line": 1453,
      "end_line": 1455,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1454,col 9)-(line 1454,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, long)",
      "begin_line": 1465,
      "end_line": 1467,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1466,col 9)-(line 1466,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, float)",
      "begin_line": 1477,
      "end_line": 1479,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1478,col 9)-(line 1478,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.insert(int, double)",
      "begin_line": 1489,
      "end_line": 1491,
      "comment": "\n     * Inserts the value into this builder.\n     *\n     * @param index  the index to add at, must be valid\n     * @param value  the value to insert\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1490,col 9)-(line 1490,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteImpl(int, int, int)",
      "begin_line": 1502,
      "end_line": 1505,
      "comment": "\n     * Internal method to delete a range without validation.\n     *\n     * @param startIndex  the start index, must be valid\n     * @param endIndex  the end index (exclusive), must be valid\n     * @param len  the length, must be valid\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 1503,col 9)-(line 1503,col 80)",
        "(line 1504,col 9)-(line 1504,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.delete(int, int)",
      "begin_line": 1516,
      "end_line": 1523,
      "comment": "\n     * Deletes the characters between the two specified indices.\n     *\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1517,col 9)-(line 1517,col 55)",
        "(line 1518,col 9)-(line 1518,col 40)",
        "(line 1519,col 9)-(line 1521,col 9)",
        "(line 1522,col 9)-(line 1522,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteAll(char)",
      "begin_line": 1532,
      "end_line": 1547,
      "comment": "\n     * Deletes the character wherever it occurs in the builder.\n     *\n     * @param ch  the character to delete\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1533,col 9)-(line 1545,col 9)",
        "(line 1546,col 9)-(line 1546,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteFirst(char)",
      "begin_line": 1555,
      "end_line": 1563,
      "comment": "\n     * Deletes the character wherever it occurs in the builder.\n     *\n     * @param ch  the character to delete\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1556,col 9)-(line 1561,col 9)",
        "(line 1562,col 9)-(line 1562,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteAll(java.lang.String)",
      "begin_line": 1572,
      "end_line": 1582,
      "comment": "\n     * Deletes the string wherever it occurs in the builder.\n     *\n     * @param str  the string to delete, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1573,col 9)-(line 1573,col 51)",
        "(line 1574,col 9)-(line 1580,col 9)",
        "(line 1581,col 9)-(line 1581,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteFirst(java.lang.String)",
      "begin_line": 1590,
      "end_line": 1599,
      "comment": "\n     * Deletes the string wherever it occurs in the builder.\n     *\n     * @param str  the string to delete, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1591,col 9)-(line 1591,col 51)",
        "(line 1592,col 9)-(line 1597,col 9)",
        "(line 1598,col 9)-(line 1598,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteAll(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 1612,
      "end_line": 1614,
      "comment": "\n     * Deletes all parts of the builder that the matcher matches.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced deletion behaviour.\n     * For example you could write a matcher to delete all occurances\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1613,col 9)-(line 1613,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.deleteFirst(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 1626,
      "end_line": 1628,
      "comment": "\n     * Deletes the first match within the builder using the specified matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced deletion behaviour.\n     * For example you could write a matcher to delete\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1627,col 9)-(line 1627,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceImpl(int, int, int, java.lang.String, int)",
      "begin_line": 1641,
      "end_line": 1651,
      "comment": "\n     * Internal method to delete a range without validation.\n     *\n     * @param startIndex  the start index, must be valid\n     * @param endIndex  the end index (exclusive), must be valid\n     * @param removeLen  the length to remove (endIndex - startIndex), must be valid\n     * @param insertStr  the string to replace with, null means delete range\n     * @param insertLen  the length of the insert string, must be valid\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 1642,col 9)-(line 1642,col 51)",
        "(line 1643,col 9)-(line 1647,col 9)",
        "(line 1648,col 9)-(line 1650,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replace(int, int, java.lang.String)",
      "begin_line": 1664,
      "end_line": 1669,
      "comment": "\n     * Replaces a portion of the string builder with another string.\n     * The length of the inserted string does not have to match the removed length.\n     *\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @param replaceStr  the string to replace with, null means delete range\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1665,col 9)-(line 1665,col 55)",
        "(line 1666,col 9)-(line 1666,col 71)",
        "(line 1667,col 9)-(line 1667,col 88)",
        "(line 1668,col 9)-(line 1668,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceAll(char, char)",
      "begin_line": 1680,
      "end_line": 1689,
      "comment": "\n     * Replaces the search character with the replace character\n     * throughout the builder.\n     *\n     * @param search  the search character\n     * @param replace  the replace character\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1681,col 9)-(line 1687,col 9)",
        "(line 1688,col 9)-(line 1688,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceFirst(char, char)",
      "begin_line": 1699,
      "end_line": 1709,
      "comment": "\n     * Replaces the first instance of the search character with the\n     * replace character in the builder.\n     *\n     * @param search  the search character\n     * @param replace  the replace character\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1700,col 9)-(line 1707,col 9)",
        "(line 1708,col 9)-(line 1708,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceAll(java.lang.String, java.lang.String)",
      "begin_line": 1719,
      "end_line": 1730,
      "comment": "\n     * Replaces the search string with the replace string throughout the builder.\n     *\n     * @param searchStr  the search string, null causes no action to occur\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1720,col 9)-(line 1720,col 69)",
        "(line 1721,col 9)-(line 1728,col 9)",
        "(line 1729,col 9)-(line 1729,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceFirst(java.lang.String, java.lang.String)",
      "begin_line": 1739,
      "end_line": 1749,
      "comment": "\n     * Replaces the first instance of the search string with the replace string.\n     *\n     * @param searchStr  the search string, null causes no action to occur\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1740,col 9)-(line 1740,col 69)",
        "(line 1741,col 9)-(line 1747,col 9)",
        "(line 1748,col 9)-(line 1748,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceAll(org.apache.commons.lang.text.StrMatcher, java.lang.String)",
      "begin_line": 1763,
      "end_line": 1765,
      "comment": "\n     * Replaces all matches within the builder with the replace string.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced replace behaviour.\n     * For example you could write a matcher to replace all occurances\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1764,col 9)-(line 1764,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceFirst(org.apache.commons.lang.text.StrMatcher, java.lang.String)",
      "begin_line": 1778,
      "end_line": 1780,
      "comment": "\n     * Replaces the first match within the builder with the replace string.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced replace behaviour.\n     * For example you could write a matcher to replace\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the replace string, null is equivalent to an empty string\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1779,col 9)-(line 1779,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replace(org.apache.commons.lang.text.StrMatcher, java.lang.String, int, int, int)",
      "begin_line": 1799,
      "end_line": 1804,
      "comment": "\n     * Advanced search and replaces within the builder using a matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced behaviour.\n     * For example you could write a matcher to delete all occurances\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the string to replace the match with, null is a delete\n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @param replaceCount  the number of times to replace, -1 for replace all\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if start index is invalid\n     ",
      "child_ranges": [
        "(line 1802,col 9)-(line 1802,col 55)",
        "(line 1803,col 9)-(line 1803,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.replaceImpl(org.apache.commons.lang.text.StrMatcher, java.lang.String, int, int, int)",
      "begin_line": 1821,
      "end_line": 1841,
      "comment": "\n     * Replaces within the builder using a matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced behaviour.\n     * For example you could write a matcher to delete all occurances\n     * where the character \u0027a\u0027 is followed by a number.\n     *\n     * @param matcher  the matcher to use to find the deletion, null causes no action\n     * @param replaceStr  the string to replace the match with, null is a delete\n     * @param from  the start index, must be valid\n     * @param to  the end index (exclusive), must be valid\n     * @param replaceCount  the number of times to replace, -1 for replace all\n     * @return this, to enable chaining\n     * @throws IndexOutOfBoundsException if any index is invalid\n     ",
      "child_ranges": [
        "(line 1824,col 9)-(line 1826,col 9)",
        "(line 1827,col 9)-(line 1827,col 72)",
        "(line 1828,col 9)-(line 1828,col 28)",
        "(line 1829,col 9)-(line 1839,col 9)",
        "(line 1840,col 9)-(line 1840,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.reverse()",
      "begin_line": 1849,
      "end_line": 1862,
      "comment": "\n     * Reverses the string builder placing each character in the opposite index.\n     * \n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1850,col 9)-(line 1852,col 9)",
        "(line 1854,col 9)-(line 1854,col 28)",
        "(line 1855,col 9)-(line 1855,col 28)",
        "(line 1856,col 9)-(line 1860,col 9)",
        "(line 1861,col 9)-(line 1861,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.trim()",
      "begin_line": 1871,
      "end_line": 1891,
      "comment": "\n     * Trims the builder by removing characters less than or equal to a space\n     * from the beginning and end.\n     *\n     * @return this, to enable chaining\n     ",
      "child_ranges": [
        "(line 1872,col 9)-(line 1874,col 9)",
        "(line 1875,col 9)-(line 1875,col 23)",
        "(line 1876,col 9)-(line 1876,col 28)",
        "(line 1877,col 9)-(line 1877,col 20)",
        "(line 1878,col 9)-(line 1880,col 9)",
        "(line 1881,col 9)-(line 1883,col 9)",
        "(line 1884,col 9)-(line 1886,col 9)",
        "(line 1887,col 9)-(line 1889,col 9)",
        "(line 1890,col 9)-(line 1890,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.startsWith(java.lang.String)",
      "begin_line": 1902,
      "end_line": 1919,
      "comment": "\n     * Checks whether this builder starts with the specified string.\n     * \u003cp\u003e\n     * Note that this method handles null input quietly, unlike String.\n     * \n     * @param str  the string to search for, null returns false\n     * @return true if the builder starts with the string\n     ",
      "child_ranges": [
        "(line 1903,col 9)-(line 1905,col 9)",
        "(line 1906,col 9)-(line 1906,col 31)",
        "(line 1907,col 9)-(line 1909,col 9)",
        "(line 1910,col 9)-(line 1912,col 9)",
        "(line 1913,col 9)-(line 1917,col 9)",
        "(line 1918,col 9)-(line 1918,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.endsWith(java.lang.String)",
      "begin_line": 1929,
      "end_line": 1947,
      "comment": "\n     * Checks whether this builder ends with the specified string.\n     * \u003cp\u003e\n     * Note that this method handles null input quietly, unlike String.\n     * \n     * @param str  the string to search for, null returns false\n     * @return true if the builder ends with the string\n     ",
      "child_ranges": [
        "(line 1930,col 9)-(line 1932,col 9)",
        "(line 1933,col 9)-(line 1933,col 31)",
        "(line 1934,col 9)-(line 1936,col 9)",
        "(line 1937,col 9)-(line 1939,col 9)",
        "(line 1940,col 9)-(line 1940,col 29)",
        "(line 1941,col 9)-(line 1945,col 9)",
        "(line 1946,col 9)-(line 1946,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.subSequence(int, int)",
      "begin_line": 1953,
      "end_line": 1964,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 1954,col 7)-(line 1956,col 7)",
        "(line 1957,col 7)-(line 1959,col 7)",
        "(line 1960,col 7)-(line 1962,col 7)",
        "(line 1963,col 7)-(line 1963,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.substring(int)",
      "begin_line": 1973,
      "end_line": 1975,
      "comment": "\n     * Extracts a portion of this string builder as a string.\n     * \n     * @param start  the start index, inclusive, must be valid\n     * @return the new string\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1974,col 9)-(line 1974,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.substring(int, int)",
      "begin_line": 1990,
      "end_line": 1993,
      "comment": "\n     * Extracts a portion of this string builder as a string.\n     * \u003cp\u003e\n     * Note: This method treats an endIndex greater than the length of the\n     * builder as equal to the length of the builder, and continues\n     * without error, unlike StringBuffer or String.\n     * \n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @return the new string\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1991,col 9)-(line 1991,col 55)",
        "(line 1992,col 9)-(line 1992,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.leftString(int)",
      "begin_line": 2007,
      "end_line": 2015,
      "comment": "\n     * Extracts the leftmost characters from the string builder without\n     * throwing an exception.\n     * \u003cp\u003e\n     * This method extracts the left \u003ccode\u003elength\u003c/code\u003e characters from\n     * the builder. If this many characters are not available, the whole\n     * builder is returned. Thus the returned string may be shorter than the\n     * length requested.\n     * \n     * @param length  the number of characters to extract, negative returns empty string\n     * @return the new string\n     ",
      "child_ranges": [
        "(line 2008,col 9)-(line 2014,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.rightString(int)",
      "begin_line": 2029,
      "end_line": 2037,
      "comment": "\n     * Extracts the rightmost characters from the string builder without\n     * throwing an exception.\n     * \u003cp\u003e\n     * This method extracts the right \u003ccode\u003elength\u003c/code\u003e characters from\n     * the builder. If this many characters are not available, the whole\n     * builder is returned. Thus the returned string may be shorter than the\n     * length requested.\n     * \n     * @param length  the number of characters to extract, negative returns empty string\n     * @return the new string\n     ",
      "child_ranges": [
        "(line 2030,col 9)-(line 2036,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.midString(int, int)",
      "begin_line": 2055,
      "end_line": 2067,
      "comment": "\n     * Extracts some characters from the middle of the string builder without\n     * throwing an exception.\n     * \u003cp\u003e\n     * This method extracts \u003ccode\u003elength\u003c/code\u003e characters from the builder\n     * at the specified index.\n     * If the index is negative it is treated as zero.\n     * If the index is greater than the builder size, it is treated as the builder size.\n     * If the length is negative, the empty string is returned.\n     * If insufficient characters are available in the builder, as much as possible is returned.\n     * Thus the returned string may be shorter than the length requested.\n     * \n     * @param index  the index to start at, negative means zero\n     * @param length  the number of characters to extract, negative returns empty string\n     * @return the new string\n     ",
      "child_ranges": [
        "(line 2056,col 9)-(line 2058,col 9)",
        "(line 2059,col 9)-(line 2061,col 9)",
        "(line 2062,col 9)-(line 2066,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.contains(char)",
      "begin_line": 2076,
      "end_line": 2084,
      "comment": "\n     * Checks if the string builder contains the specified char.\n     *\n     * @param ch  the character to find\n     * @return true if the builder contains the character\n     ",
      "child_ranges": [
        "(line 2077,col 9)-(line 2077,col 32)",
        "(line 2078,col 9)-(line 2082,col 9)",
        "(line 2083,col 9)-(line 2083,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.contains(java.lang.String)",
      "begin_line": 2092,
      "end_line": 2094,
      "comment": "\n     * Checks if the string builder contains the specified string.\n     *\n     * @param str  the string to find\n     * @return true if the builder contains the string\n     ",
      "child_ranges": [
        "(line 2093,col 9)-(line 2093,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.contains(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 2107,
      "end_line": 2109,
      "comment": "\n     * Checks if the string builder contains a string matched using the\n     * specified matcher.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to search for the character\n     * \u0027a\u0027 followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @return true if the matcher finds a match in the builder\n     ",
      "child_ranges": [
        "(line 2108,col 9)-(line 2108,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.indexOf(char)",
      "begin_line": 2118,
      "end_line": 2120,
      "comment": "\n     * Searches the string builder to find the first reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @return the first index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2119,col 9)-(line 2119,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.indexOf(char, int)",
      "begin_line": 2129,
      "end_line": 2141,
      "comment": "\n     * Searches the string builder to find the first reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the first index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2130,col 9)-(line 2130,col 55)",
        "(line 2131,col 9)-(line 2133,col 9)",
        "(line 2134,col 9)-(line 2134,col 32)",
        "(line 2135,col 9)-(line 2139,col 9)",
        "(line 2140,col 9)-(line 2140,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.indexOf(java.lang.String)",
      "begin_line": 2151,
      "end_line": 2153,
      "comment": "\n     * Searches the string builder to find the first reference to the specified string.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @return the first index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2152,col 9)-(line 2152,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.indexOf(java.lang.String, int)",
      "begin_line": 2165,
      "end_line": 2192,
      "comment": "\n     * Searches the string builder to find the first reference to the specified\n     * string starting searching from the given index.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the first index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2166,col 9)-(line 2166,col 55)",
        "(line 2167,col 9)-(line 2169,col 9)",
        "(line 2170,col 9)-(line 2170,col 34)",
        "(line 2171,col 9)-(line 2173,col 9)",
        "(line 2174,col 9)-(line 2176,col 9)",
        "(line 2177,col 9)-(line 2179,col 9)",
        "(line 2180,col 9)-(line 2180,col 32)",
        "(line 2181,col 9)-(line 2181,col 36)",
        "(line 2182,col 9)-(line 2190,col 9)",
        "(line 2191,col 9)-(line 2191,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.indexOf(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 2204,
      "end_line": 2206,
      "comment": "\n     * Searches the string builder using the matcher to find the first match.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @return the first index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2205,col 9)-(line 2205,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.indexOf(org.apache.commons.lang.text.StrMatcher, int)",
      "begin_line": 2220,
      "end_line": 2233,
      "comment": "\n     * Searches the string builder using the matcher to find the first\n     * match searching from the given index.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the first index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2221,col 9)-(line 2221,col 55)",
        "(line 2222,col 9)-(line 2224,col 9)",
        "(line 2225,col 9)-(line 2225,col 23)",
        "(line 2226,col 9)-(line 2226,col 28)",
        "(line 2227,col 9)-(line 2231,col 9)",
        "(line 2232,col 9)-(line 2232,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.lastIndexOf(char)",
      "begin_line": 2242,
      "end_line": 2244,
      "comment": "\n     * Searches the string builder to find the last reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @return the last index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2243,col 9)-(line 2243,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.lastIndexOf(char, int)",
      "begin_line": 2253,
      "end_line": 2264,
      "comment": "\n     * Searches the string builder to find the last reference to the specified char.\n     * \n     * @param ch  the character to find\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the last index of the character, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2254,col 9)-(line 2254,col 66)",
        "(line 2255,col 9)-(line 2257,col 9)",
        "(line 2258,col 9)-(line 2262,col 9)",
        "(line 2263,col 9)-(line 2263,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.lastIndexOf(java.lang.String)",
      "begin_line": 2274,
      "end_line": 2276,
      "comment": "\n     * Searches the string builder to find the last reference to the specified string.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @return the last index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2275,col 9)-(line 2275,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.lastIndexOf(java.lang.String, int)",
      "begin_line": 2288,
      "end_line": 2313,
      "comment": "\n     * Searches the string builder to find the last reference to the specified\n     * string starting searching from the given index.\n     * \u003cp\u003e\n     * Note that a null input string will return -1, whereas the JDK throws an exception.\n     * \n     * @param str  the string to find, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the last index of the string, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2289,col 9)-(line 2289,col 66)",
        "(line 2290,col 9)-(line 2292,col 9)",
        "(line 2293,col 9)-(line 2293,col 34)",
        "(line 2294,col 9)-(line 2311,col 9)",
        "(line 2312,col 9)-(line 2312,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.lastIndexOf(org.apache.commons.lang.text.StrMatcher)",
      "begin_line": 2325,
      "end_line": 2327,
      "comment": "\n     * Searches the string builder using the matcher to find the last match.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @return the last index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2326,col 9)-(line 2326,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.lastIndexOf(org.apache.commons.lang.text.StrMatcher, int)",
      "begin_line": 2341,
      "end_line": 2354,
      "comment": "\n     * Searches the string builder using the matcher to find the last\n     * match searching from the given index.\n     * \u003cp\u003e\n     * Matchers can be used to perform advanced searching behaviour.\n     * For example you could write a matcher to find the character \u0027a\u0027\n     * followed by a number.\n     *\n     * @param matcher  the matcher to use, null returns -1\n     * @param startIndex  the index to start at, invalid index rounded to edge\n     * @return the last index matched, or -1 if not found\n     ",
      "child_ranges": [
        "(line 2342,col 9)-(line 2342,col 66)",
        "(line 2343,col 9)-(line 2345,col 9)",
        "(line 2346,col 9)-(line 2346,col 28)",
        "(line 2347,col 9)-(line 2347,col 38)",
        "(line 2348,col 9)-(line 2352,col 9)",
        "(line 2353,col 9)-(line 2353,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.asTokenizer()",
      "begin_line": 2389,
      "end_line": 2391,
      "comment": "\n     * Creates a tokenizer that can tokenize the contents of this builder.\n     * \u003cp\u003e\n     * This method allows the contents of this builder to be tokenized.\n     * The tokenizer will be setup by default to tokenize on space, tab,\n     * newline and formfeed (as per StringTokenizer). These values can be\n     * changed on the tokenizer class, before retrieving the tokens.\n     * \u003cp\u003e\n     * The returned tokenizer is linked to this builder. You may intermix\n     * calls to the buider and tokenizer within certain limits, however\n     * there is no synchronization. Once the tokenizer has been used once,\n     * it must be {@link StrTokenizer#reset() reset} to pickup the latest\n     * changes in the builder. For example:\n     * \u003cpre\u003e\n     * StrBuilder b \u003d new StrBuilder();\n     * b.append(\"a b \");\n     * StrTokenizer t \u003d b.asTokenizer();\n     * String[] tokens1 \u003d t.getTokenArray();  // returns a,b\n     * b.append(\"c d \");\n     * String[] tokens2 \u003d t.getTokenArray();  // returns a,b (c and d ignored)\n     * t.reset();              // reset causes builder changes to be picked up\n     * String[] tokens3 \u003d t.getTokenArray();  // returns a,b,c,d\n     * \u003c/pre\u003e\n     * In addition to simply intermixing appends and tokenization, you can also\n     * call the set methods on the tokenizer to alter how it tokenizes. Just\n     * remember to call reset when you want to pickup builder changes.\n     * \u003cp\u003e\n     * Calling {@link StrTokenizer#reset(String)} or {@link StrTokenizer#reset(char[])}\n     * with a non-null value will break the link with the builder.\n     *\n     * @return a tokenizer that is linked to this builder\n     ",
      "child_ranges": [
        "(line 2390,col 9)-(line 2390,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.asReader()",
      "begin_line": 2413,
      "end_line": 2415,
      "comment": "\n     * Gets the contents of this builder as a Reader.\n     * \u003cp\u003e\n     * This method allows the contents of the builder to be read\n     * using any standard method that expects a Reader.\n     * \u003cp\u003e\n     * To use, simply create a \u003ccode\u003eStrBuilder\u003c/code\u003e, populate it with\n     * data, call \u003ccode\u003easReader\u003c/code\u003e, and then read away.\n     * \u003cp\u003e\n     * The internal character array is shared between the builder and the reader.\n     * This allows you to append to the builder after creating the reader,\n     * and the changes will be picked up.\n     * Note however, that no synchronization occurs, so you must perform\n     * all operations with the builder and the reader in one thread.\n     * \u003cp\u003e\n     * The returned reader supports marking, and ignores the flush method.\n     *\n     * @return a reader that reads from this builder\n     ",
      "child_ranges": [
        "(line 2414,col 9)-(line 2414,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.asWriter()",
      "begin_line": 2438,
      "end_line": 2440,
      "comment": "\n     * Gets this builder as a Writer that can be written to.\n     * \u003cp\u003e\n     * This method allows you to populate the contents of the builder\n     * using any standard method that takes a Writer.\n     * \u003cp\u003e\n     * To use, simply create a \u003ccode\u003eStrBuilder\u003c/code\u003e,\n     * call \u003ccode\u003easWriter\u003c/code\u003e, and populate away. The data is available\n     * at any time using the methods of the \u003ccode\u003eStrBuilder\u003c/code\u003e.\n     * \u003cp\u003e\n     * The internal character array is shared between the builder and the writer.\n     * This allows you to intermix calls that append to the builder and\n     * write using the writer and the changes will be occur correctly.\n     * Note however, that no synchronization occurs, so you must perform\n     * all operations with the builder and the writer in one thread.\n     * \u003cp\u003e\n     * The returned writer ignores the close and flush methods.\n     *\n     * @return a writer that populates this builder\n     ",
      "child_ranges": [
        "(line 2439,col 9)-(line 2439,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.equalsIgnoreCase(org.apache.commons.lang.text.StrBuilder)",
      "begin_line": 2480,
      "end_line": 2497,
      "comment": "\n     * Checks the contents of this builder against another to see if they\n     * contain the same character content ignoring case.\n     *\n     * @param other  the object to check, null returns false\n     * @return true if the builders contain the same characters in the same order\n     ",
      "child_ranges": [
        "(line 2481,col 9)-(line 2483,col 9)",
        "(line 2484,col 9)-(line 2486,col 9)",
        "(line 2487,col 9)-(line 2487,col 37)",
        "(line 2488,col 9)-(line 2488,col 39)",
        "(line 2489,col 9)-(line 2495,col 9)",
        "(line 2496,col 9)-(line 2496,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.equals(org.apache.commons.lang.text.StrBuilder)",
      "begin_line": 2506,
      "end_line": 2521,
      "comment": "\n     * Checks the contents of this builder against another to see if they\n     * contain the same character content.\n     *\n     * @param other  the object to check, null returns false\n     * @return true if the builders contain the same characters in the same order\n     ",
      "child_ranges": [
        "(line 2507,col 9)-(line 2509,col 9)",
        "(line 2510,col 9)-(line 2512,col 9)",
        "(line 2513,col 9)-(line 2513,col 37)",
        "(line 2514,col 9)-(line 2514,col 39)",
        "(line 2515,col 9)-(line 2519,col 9)",
        "(line 2520,col 9)-(line 2520,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.equals(java.lang.Object)",
      "begin_line": 2530,
      "end_line": 2536,
      "comment": "\n     * Checks the contents of this builder against another to see if they\n     * contain the same character content.\n     *\n     * @param obj  the object to check, null returns false\n     * @return true if the builders contain the same characters in the same order\n     ",
      "child_ranges": [
        "(line 2532,col 9)-(line 2534,col 9)",
        "(line 2535,col 9)-(line 2535,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.hashCode()",
      "begin_line": 2543,
      "end_line": 2551,
      "comment": "\n     * Gets a suitable hash code for this builder.\n     *\n     * @return a hash code\n     ",
      "child_ranges": [
        "(line 2545,col 9)-(line 2545,col 28)",
        "(line 2546,col 9)-(line 2546,col 21)",
        "(line 2547,col 9)-(line 2549,col 9)",
        "(line 2550,col 9)-(line 2550,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.toString()",
      "begin_line": 2563,
      "end_line": 2566,
      "comment": "\n     * Gets a String version of the string builder, creating a new instance\n     * each time the method is called.\n     * \u003cp\u003e\n     * Note that unlike StringBuffer, the string version returned is\n     * independent of the string builder.\n     *\n     * @return the builder as a String\n     ",
      "child_ranges": [
        "(line 2565,col 9)-(line 2565,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.toStringBuffer()",
      "begin_line": 2574,
      "end_line": 2576,
      "comment": "\n     * Gets a StringBuffer version of the string builder, creating a\n     * new instance each time the method is called.\n     *\n     * @return the builder as a StringBuffer\n     ",
      "child_ranges": [
        "(line 2575,col 9)-(line 2575,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.validateRange(int, int)",
      "begin_line": 2588,
      "end_line": 2599,
      "comment": "\n     * Validates parameters defining a range of the builder.\n     * \n     * @param startIndex  the start index, inclusive, must be valid\n     * @param endIndex  the end index, exclusive, must be valid except\n     *  that if too large it is treated as end of string\n     * @return the new string\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 2589,col 9)-(line 2591,col 9)",
        "(line 2592,col 9)-(line 2594,col 9)",
        "(line 2595,col 9)-(line 2597,col 9)",
        "(line 2598,col 9)-(line 2598,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.validateIndex(int)",
      "begin_line": 2607,
      "end_line": 2611,
      "comment": "\n     * Validates parameters defining a single index in the builder.\n     * \n     * @param index  the index, must be valid\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 2608,col 9)-(line 2610,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StrBuilderTokenizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.text.StrTokenizer"
      ],
      "begin_line": 2617,
      "end_line": 2644,
      "comment": "\n     * Inner class to allow StrBuilder to operate as a tokenizer.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer.StrBuilderTokenizer()",
      "begin_line": 2620,
      "end_line": 2622,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2621,col 13)-(line 2621,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer.tokenize(char[], int, int)",
      "begin_line": 2625,
      "end_line": 2632,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2627,col 13)-(line 2631,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderTokenizer.getContent()",
      "begin_line": 2635,
      "end_line": 2643,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2637,col 13)-(line 2637,col 44)",
        "(line 2638,col 13)-(line 2642,col 13)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StrBuilderReader",
      "is_interface": false,
      "parent_types": [
        "java.io.Reader"
      ],
      "begin_line": 2650,
      "end_line": 2733,
      "comment": "\n     * Inner class to allow StrBuilder to operate as a writer.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 2652,
      "end_line": 2652,
      "comment": " The current stream position. "
    },
    {
      "type": "field",
      "varNames": [
        "mark"
      ],
      "begin_line": 2654,
      "end_line": 2654,
      "comment": " The last mark position. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.StrBuilderReader()",
      "begin_line": 2657,
      "end_line": 2659,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2658,col 13)-(line 2658,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.close()",
      "begin_line": 2662,
      "end_line": 2665,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.read()",
      "begin_line": 2668,
      "end_line": 2674,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2670,col 13)-(line 2672,col 13)",
        "(line 2673,col 13)-(line 2673,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.read(char[], int, int)",
      "begin_line": 2677,
      "end_line": 2695,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2679,col 13)-(line 2682,col 13)",
        "(line 2683,col 13)-(line 2685,col 13)",
        "(line 2686,col 13)-(line 2688,col 13)",
        "(line 2689,col 13)-(line 2691,col 13)",
        "(line 2692,col 13)-(line 2692,col 61)",
        "(line 2693,col 13)-(line 2693,col 23)",
        "(line 2694,col 13)-(line 2694,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.skip(long)",
      "begin_line": 2698,
      "end_line": 2708,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2700,col 13)-(line 2702,col 13)",
        "(line 2703,col 13)-(line 2705,col 13)",
        "(line 2706,col 13)-(line 2706,col 21)",
        "(line 2707,col 13)-(line 2707,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.ready()",
      "begin_line": 2711,
      "end_line": 2714,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2713,col 13)-(line 2713,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.markSupported()",
      "begin_line": 2717,
      "end_line": 2720,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2719,col 13)-(line 2719,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.mark(int)",
      "begin_line": 2723,
      "end_line": 2726,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2725,col 13)-(line 2725,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderReader.reset()",
      "begin_line": 2729,
      "end_line": 2732,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2731,col 13)-(line 2731,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StrBuilderWriter",
      "is_interface": false,
      "parent_types": [
        "java.io.Writer"
      ],
      "begin_line": 2739,
      "end_line": 2787,
      "comment": "\n     * Inner class to allow StrBuilder to operate as a writer.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.StrBuilderWriter()",
      "begin_line": 2742,
      "end_line": 2744,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2743,col 13)-(line 2743,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.close()",
      "begin_line": 2747,
      "end_line": 2750,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.flush()",
      "begin_line": 2753,
      "end_line": 2756,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.write(int)",
      "begin_line": 2759,
      "end_line": 2762,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2761,col 13)-(line 2761,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.write(char[])",
      "begin_line": 2765,
      "end_line": 2768,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2767,col 13)-(line 2767,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.write(char[], int, int)",
      "begin_line": 2771,
      "end_line": 2774,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2773,col 13)-(line 2773,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.write(java.lang.String)",
      "begin_line": 2777,
      "end_line": 2780,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2779,col 13)-(line 2779,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.text.StrBuilder.StrBuilderWriter.write(java.lang.String, int, int)",
      "begin_line": 2783,
      "end_line": 2786,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 2785,col 13)-(line 2785,col 50)"
      ]
    }
  ]
}