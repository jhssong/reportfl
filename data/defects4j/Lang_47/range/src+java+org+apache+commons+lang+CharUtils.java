{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/CharUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 560,
      "comment": "\n * \u003cp\u003eOperations on char primitives and Character objects.\u003c/p\u003e\n *\n * \u003cp\u003eThis class tries to handle \u003ccode\u003enull\u003c/code\u003e input gracefully.\n * An exception will not be thrown for a \u003ccode\u003enull\u003c/code\u003e input.\n * Each method documents its behaviour in more detail.\u003c/p\u003e\n * \n * @author Stephen Colebourne\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "CHAR_STRING"
      ],
      "begin_line": 32,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CHAR_STRING_ARRAY"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CHAR_ARRAY"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LF"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * \u003ccode\u003e\\u000a\u003c/code\u003e linefeed LF (\u0027\\n\u0027).\n     * \n     * @see \u003ca href\u003d\"http://java.sun.com/docs/books/jls/third_edition/html/lexical.html#101089\"\u003eJLF: Escape Sequences\n     *      for Character and String Literals\u003c/a\u003e\n     * @since 2.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CR"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * \u003ccode\u003e\\u000d\u003c/code\u003e carriage return CR (\u0027\\r\u0027).\n     * \n     * @see \u003ca href\u003d\"http://java.sun.com/docs/books/jls/third_edition/html/lexical.html#101089\"\u003eJLF: Escape Sequences\n     *      for Character and String Literals\u003c/a\u003e\n     * @since 2.2\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.CharUtils.CharUtils()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eCharUtils\u003c/code\u003e instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as \u003ccode\u003eCharUtils.toString(\u0027c\u0027);\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 87,col 7)-(line 87,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtils.toCharacterObject(char)",
      "begin_line": 105,
      "end_line": 110,
      "comment": "\n     * \u003cp\u003eConverts the character to a Character.\u003c/p\u003e\n     * \n     * \u003cp\u003eFor ASCII 7 bit characters, this uses a cache that will return the\n     * same Character object each time.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.toCharacterObject(\u0027 \u0027)  \u003d \u0027 \u0027\n     *   CharUtils.toCharacterObject(\u0027A\u0027)  \u003d \u0027A\u0027\n     * \u003c/pre\u003e\n     *\n     * @param ch  the character to convert\n     * @return a Character of the specified character\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtils.toCharacterObject(java.lang.String)",
      "begin_line": 129,
      "end_line": 134,
      "comment": "\n     * \u003cp\u003eConverts the String to a Character using the first character, returning\n     * null for empty Strings.\u003c/p\u003e\n     * \n     * \u003cp\u003eFor ASCII 7 bit characters, this uses a cache that will return the\n     * same Character object each time.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   CharUtils.toCharacterObject(null) \u003d null\n     *   CharUtils.toCharacterObject(\"\")   \u003d null\n     *   CharUtils.toCharacterObject(\"A\")  \u003d \u0027A\u0027\n     *   CharUtils.toCharacterObject(\"BA\") \u003d \u0027B\u0027\n     * \u003c/pre\u003e\n     *\n     * @param str  the character to convert\n     * @return the Character value of the first letter of the String\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtils.toChar(java.lang.Character)",
      "begin_line": 150,
      "end_line": 155,
      "comment": "\n     * \u003cp\u003eConverts the Character to a char throwing an exception for \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   CharUtils.toChar(null) \u003d IllegalArgumentException\n     *   CharUtils.toChar(\u0027 \u0027)  \u003d \u0027 \u0027\n     *   CharUtils.toChar(\u0027A\u0027)  \u003d \u0027A\u0027\n     * \u003c/pre\u003e\n     *\n     * @param ch  the character to convert\n     * @return the char value of the Character\n     * @throws IllegalArgumentException if the Character is null\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtils.toChar(java.lang.Character, char)",
      "begin_line": 170,
      "end_line": 175,
      "comment": "\n     * \u003cp\u003eConverts the Character to a char handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   CharUtils.toChar(null, \u0027X\u0027) \u003d \u0027X\u0027\n     *   CharUtils.toChar(\u0027 \u0027, \u0027X\u0027)  \u003d \u0027 \u0027\n     *   CharUtils.toChar(\u0027A\u0027, \u0027X\u0027)  \u003d \u0027A\u0027\n     * \u003c/pre\u003e\n     *\n     * @param ch  the character to convert\n     * @param defaultValue  the value to use if the  Character is null\n     * @return the char value of the Character or the default if null\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtils.toChar(java.lang.String)",
      "begin_line": 193,
      "end_line": 198,
      "comment": "\n     * \u003cp\u003eConverts the String to a char using the first character, throwing\n     * an exception on empty Strings.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   CharUtils.toChar(null) \u003d IllegalArgumentException\n     *   CharUtils.toChar(\"\")   \u003d IllegalArgumentException\n     *   CharUtils.toChar(\"A\")  \u003d \u0027A\u0027\n     *   CharUtils.toChar(\"BA\") \u003d \u0027B\u0027\n     * \u003c/pre\u003e\n     *\n     * @param str  the character to convert\n     * @return the char value of the first letter of the String\n     * @throws IllegalArgumentException if the String is empty\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtils.toChar(java.lang.String, char)",
      "begin_line": 215,
      "end_line": 220,
      "comment": "\n     * \u003cp\u003eConverts the String to a char using the first character, defaulting\n     * the value on empty Strings.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   CharUtils.toChar(null, \u0027X\u0027) \u003d \u0027X\u0027\n     *   CharUtils.toChar(\"\", \u0027X\u0027)   \u003d \u0027X\u0027\n     *   CharUtils.toChar(\"A\", \u0027X\u0027)  \u003d \u0027A\u0027\n     *   CharUtils.toChar(\"BA\", \u0027X\u0027) \u003d \u0027B\u0027\n     * \u003c/pre\u003e\n     *\n     * @param str  the character to convert\n     * @param defaultValue  the value to use if the  Character is null\n     * @return the char value of the first letter of the String or the default if null\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 219,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtils.toIntValue(char)",
      "begin_line": 238,
      "end_line": 243,
      "comment": "\n     * \u003cp\u003eConverts the character to the Integer it represents, throwing an\n     * exception if the character is not numeric.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method coverts the char \u00271\u0027 to the int 1 and so on.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.toIntValue(\u00273\u0027)  \u003d 3\n     *   CharUtils.toIntValue(\u0027A\u0027)  \u003d IllegalArgumentException\n     * \u003c/pre\u003e\n     *\n     * @param ch  the character to convert\n     * @return the int value of the character\n     * @throws IllegalArgumentException if the character is not ASCII numeric\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 242,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtils.toIntValue(char, int)",
      "begin_line": 260,
      "end_line": 265,
      "comment": "\n     * \u003cp\u003eConverts the character to the Integer it represents, throwing an\n     * exception if the character is not numeric.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method coverts the char \u00271\u0027 to the int 1 and so on.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.toIntValue(\u00273\u0027, -1)  \u003d 3\n     *   CharUtils.toIntValue(\u0027A\u0027, -1)  \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param ch  the character to convert\n     * @param defaultValue  the default value to use if the character is not numeric\n     * @return the int value of the character\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 264,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtils.toIntValue(java.lang.Character)",
      "begin_line": 283,
      "end_line": 288,
      "comment": "\n     * \u003cp\u003eConverts the character to the Integer it represents, throwing an\n     * exception if the character is not numeric.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method coverts the char \u00271\u0027 to the int 1 and so on.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.toIntValue(null) \u003d IllegalArgumentException\n     *   CharUtils.toIntValue(\u00273\u0027)  \u003d 3\n     *   CharUtils.toIntValue(\u0027A\u0027)  \u003d IllegalArgumentException\n     * \u003c/pre\u003e\n     *\n     * @param ch  the character to convert, not null\n     * @return the int value of the character\n     * @throws IllegalArgumentException if the Character is not ASCII numeric or is null\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 287,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtils.toIntValue(java.lang.Character, int)",
      "begin_line": 306,
      "end_line": 311,
      "comment": "\n     * \u003cp\u003eConverts the character to the Integer it represents, throwing an\n     * exception if the character is not numeric.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method coverts the char \u00271\u0027 to the int 1 and so on.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.toIntValue(null, -1) \u003d -1\n     *   CharUtils.toIntValue(\u00273\u0027, -1)  \u003d 3\n     *   CharUtils.toIntValue(\u0027A\u0027, -1)  \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param ch  the character to convert\n     * @param defaultValue  the default value to use if the character is not numeric\n     * @return the int value of the character\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 310,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtils.toString(char)",
      "begin_line": 328,
      "end_line": 333,
      "comment": "\n     * \u003cp\u003eConverts the character to a String that contains the one character.\u003c/p\u003e\n     * \n     * \u003cp\u003eFor ASCII 7 bit characters, this uses a cache that will return the\n     * same String object each time.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.toString(\u0027 \u0027)  \u003d \" \"\n     *   CharUtils.toString(\u0027A\u0027)  \u003d \"A\"\n     * \u003c/pre\u003e\n     *\n     * @param ch  the character to convert\n     * @return a String containing the one specified character\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 332,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtils.toString(java.lang.Character)",
      "begin_line": 352,
      "end_line": 357,
      "comment": "\n     * \u003cp\u003eConverts the character to a String that contains the one character.\u003c/p\u003e\n     * \n     * \u003cp\u003eFor ASCII 7 bit characters, this uses a cache that will return the\n     * same String object each time.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf \u003ccode\u003enull\u003c/code\u003e is passed in, \u003ccode\u003enull\u003c/code\u003e will be returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.toString(null) \u003d null\n     *   CharUtils.toString(\u0027 \u0027)  \u003d \" \"\n     *   CharUtils.toString(\u0027A\u0027)  \u003d \"A\"\n     * \u003c/pre\u003e\n     *\n     * @param ch  the character to convert\n     * @return a String containing the one specified character\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 356,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtils.unicodeEscaped(char)",
      "begin_line": 373,
      "end_line": 382,
      "comment": "\n     * \u003cp\u003eConverts the string to the unicode format \u0027\\u0020\u0027.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis format is the Java source code format.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.unicodeEscaped(\u0027 \u0027) \u003d \"\\u0020\"\n     *   CharUtils.unicodeEscaped(\u0027A\u0027) \u003d \"\\u0041\"\n     * \u003c/pre\u003e\n     * \n     * @param ch  the character to convert\n     * @return the escaped unicode string\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 380,col 9)",
        "(line 381,col 9)-(line 381,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtils.unicodeEscaped(java.lang.Character)",
      "begin_line": 400,
      "end_line": 405,
      "comment": "\n     * \u003cp\u003eConverts the string to the unicode format \u0027\\u0020\u0027.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis format is the Java source code format.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf \u003ccode\u003enull\u003c/code\u003e is passed in, \u003ccode\u003enull\u003c/code\u003e will be returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.unicodeEscaped(null) \u003d null\n     *   CharUtils.unicodeEscaped(\u0027 \u0027)  \u003d \"\\u0020\"\n     *   CharUtils.unicodeEscaped(\u0027A\u0027)  \u003d \"\\u0041\"\n     * \u003c/pre\u003e\n     * \n     * @param ch  the character to convert, may be null\n     * @return the escaped unicode string, null if null input\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 403,col 9)",
        "(line 404,col 9)-(line 404,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtils.isAscii(char)",
      "begin_line": 423,
      "end_line": 425,
      "comment": "\n     * \u003cp\u003eChecks whether the character is ASCII 7 bit.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.isAscii(\u0027a\u0027)  \u003d true\n     *   CharUtils.isAscii(\u0027A\u0027)  \u003d true\n     *   CharUtils.isAscii(\u00273\u0027)  \u003d true\n     *   CharUtils.isAscii(\u0027-\u0027)  \u003d true\n     *   CharUtils.isAscii(\u0027\\n\u0027) \u003d true\n     *   CharUtils.isAscii(\u0027\u0026copy;\u0027) \u003d false\n     * \u003c/pre\u003e\n     * \n     * @param ch  the character to check\n     * @return true if less than 128\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtils.isAsciiPrintable(char)",
      "begin_line": 442,
      "end_line": 444,
      "comment": "\n     * \u003cp\u003eChecks whether the character is ASCII 7 bit printable.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.isAsciiPrintable(\u0027a\u0027)  \u003d true\n     *   CharUtils.isAsciiPrintable(\u0027A\u0027)  \u003d true\n     *   CharUtils.isAsciiPrintable(\u00273\u0027)  \u003d true\n     *   CharUtils.isAsciiPrintable(\u0027-\u0027)  \u003d true\n     *   CharUtils.isAsciiPrintable(\u0027\\n\u0027) \u003d false\n     *   CharUtils.isAsciiPrintable(\u0027\u0026copy;\u0027) \u003d false\n     * \u003c/pre\u003e\n     * \n     * @param ch  the character to check\n     * @return true if between 32 and 126 inclusive\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtils.isAsciiControl(char)",
      "begin_line": 461,
      "end_line": 463,
      "comment": "\n     * \u003cp\u003eChecks whether the character is ASCII 7 bit control.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.isAsciiControl(\u0027a\u0027)  \u003d false\n     *   CharUtils.isAsciiControl(\u0027A\u0027)  \u003d false\n     *   CharUtils.isAsciiControl(\u00273\u0027)  \u003d false\n     *   CharUtils.isAsciiControl(\u0027-\u0027)  \u003d false\n     *   CharUtils.isAsciiControl(\u0027\\n\u0027) \u003d true\n     *   CharUtils.isAsciiControl(\u0027\u0026copy;\u0027) \u003d false\n     * \u003c/pre\u003e\n     * \n     * @param ch  the character to check\n     * @return true if less than 32 or equals 127\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtils.isAsciiAlpha(char)",
      "begin_line": 480,
      "end_line": 482,
      "comment": "\n     * \u003cp\u003eChecks whether the character is ASCII 7 bit alphabetic.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.isAsciiAlpha(\u0027a\u0027)  \u003d true\n     *   CharUtils.isAsciiAlpha(\u0027A\u0027)  \u003d true\n     *   CharUtils.isAsciiAlpha(\u00273\u0027)  \u003d false\n     *   CharUtils.isAsciiAlpha(\u0027-\u0027)  \u003d false\n     *   CharUtils.isAsciiAlpha(\u0027\\n\u0027) \u003d false\n     *   CharUtils.isAsciiAlpha(\u0027\u0026copy;\u0027) \u003d false\n     * \u003c/pre\u003e\n     * \n     * @param ch  the character to check\n     * @return true if between 65 and 90 or 97 and 122 inclusive\n     ",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtils.isAsciiAlphaUpper(char)",
      "begin_line": 499,
      "end_line": 501,
      "comment": "\n     * \u003cp\u003eChecks whether the character is ASCII 7 bit alphabetic upper case.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.isAsciiAlphaUpper(\u0027a\u0027)  \u003d false\n     *   CharUtils.isAsciiAlphaUpper(\u0027A\u0027)  \u003d true\n     *   CharUtils.isAsciiAlphaUpper(\u00273\u0027)  \u003d false\n     *   CharUtils.isAsciiAlphaUpper(\u0027-\u0027)  \u003d false\n     *   CharUtils.isAsciiAlphaUpper(\u0027\\n\u0027) \u003d false\n     *   CharUtils.isAsciiAlphaUpper(\u0027\u0026copy;\u0027) \u003d false\n     * \u003c/pre\u003e\n     * \n     * @param ch  the character to check\n     * @return true if between 65 and 90 inclusive\n     ",
      "child_ranges": [
        "(line 500,col 9)-(line 500,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtils.isAsciiAlphaLower(char)",
      "begin_line": 518,
      "end_line": 520,
      "comment": "\n     * \u003cp\u003eChecks whether the character is ASCII 7 bit alphabetic lower case.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.isAsciiAlphaLower(\u0027a\u0027)  \u003d true\n     *   CharUtils.isAsciiAlphaLower(\u0027A\u0027)  \u003d false\n     *   CharUtils.isAsciiAlphaLower(\u00273\u0027)  \u003d false\n     *   CharUtils.isAsciiAlphaLower(\u0027-\u0027)  \u003d false\n     *   CharUtils.isAsciiAlphaLower(\u0027\\n\u0027) \u003d false\n     *   CharUtils.isAsciiAlphaLower(\u0027\u0026copy;\u0027) \u003d false\n     * \u003c/pre\u003e\n     * \n     * @param ch  the character to check\n     * @return true if between 97 and 122 inclusive\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 519,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtils.isAsciiNumeric(char)",
      "begin_line": 537,
      "end_line": 539,
      "comment": "\n     * \u003cp\u003eChecks whether the character is ASCII 7 bit numeric.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.isAsciiNumeric(\u0027a\u0027)  \u003d false\n     *   CharUtils.isAsciiNumeric(\u0027A\u0027)  \u003d false\n     *   CharUtils.isAsciiNumeric(\u00273\u0027)  \u003d true\n     *   CharUtils.isAsciiNumeric(\u0027-\u0027)  \u003d false\n     *   CharUtils.isAsciiNumeric(\u0027\\n\u0027) \u003d false\n     *   CharUtils.isAsciiNumeric(\u0027\u0026copy;\u0027) \u003d false\n     * \u003c/pre\u003e\n     * \n     * @param ch  the character to check\n     * @return true if between 48 and 57 inclusive\n     ",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharUtils.isAsciiAlphanumeric(char)",
      "begin_line": 556,
      "end_line": 558,
      "comment": "\n     * \u003cp\u003eChecks whether the character is ASCII 7 bit numeric.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.isAsciiAlphanumeric(\u0027a\u0027)  \u003d true\n     *   CharUtils.isAsciiAlphanumeric(\u0027A\u0027)  \u003d true\n     *   CharUtils.isAsciiAlphanumeric(\u00273\u0027)  \u003d true\n     *   CharUtils.isAsciiAlphanumeric(\u0027-\u0027)  \u003d false\n     *   CharUtils.isAsciiAlphanumeric(\u0027\\n\u0027) \u003d false\n     *   CharUtils.isAsciiAlphanumeric(\u0027\u0026copy;\u0027) \u003d false\n     * \u003c/pre\u003e\n     * \n     * @param ch  the character to check\n     * @return true if between 48 and 57 or 65 and 90 or 97 and 122 inclusive\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 96)"
      ]
    }
  ]
}