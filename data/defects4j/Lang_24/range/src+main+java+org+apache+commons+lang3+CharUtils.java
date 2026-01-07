{
  "filepath": "/tmp/Lang-24b/src/main/java/org/apache/commons/lang3/CharUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 561,
      "comment": "\n * \u003cp\u003eOperations on char primitives and Character objects.\u003c/p\u003e\n *\n * \u003cp\u003eThis class tries to handle \u003ccode\u003enull\u003c/code\u003e input gracefully.\n * An exception will not be thrown for a \u003ccode\u003enull\u003c/code\u003e input.\n * Each method documents its behaviour in more detail.\u003c/p\u003e\n * \n * \u003cp\u003e#ThreadSafe#\u003c/p\u003e\n * @author Apache Software Foundation\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "CHAR_STRING"
      ],
      "begin_line": 33,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CHAR_STRING_ARRAY"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CHAR_ARRAY"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LF"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * \u003ccode\u003e\\u000a\u003c/code\u003e linefeed LF (\u0027\\n\u0027).\n     * \n     * @see \u003ca href\u003d\"http://java.sun.com/docs/books/jls/third_edition/html/lexical.html#101089\"\u003eJLF: Escape Sequences\n     *      for Character and String Literals\u003c/a\u003e\n     * @since 2.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CR"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * \u003ccode\u003e\\u000d\u003c/code\u003e carriage return CR (\u0027\\r\u0027).\n     * \n     * @see \u003ca href\u003d\"http://java.sun.com/docs/books/jls/third_edition/html/lexical.html#101089\"\u003eJLF: Escape Sequences\n     *      for Character and String Literals\u003c/a\u003e\n     * @since 2.2\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.CharUtils.CharUtils()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eCharUtils\u003c/code\u003e instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as \u003ccode\u003eCharUtils.toString(\u0027c\u0027);\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 88,col 7)-(line 88,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharUtils.toCharacterObject(char)",
      "begin_line": 106,
      "end_line": 111,
      "comment": "\n     * \u003cp\u003eConverts the character to a Character.\u003c/p\u003e\n     * \n     * \u003cp\u003eFor ASCII 7 bit characters, this uses a cache that will return the\n     * same Character object each time.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.toCharacterObject(\u0027 \u0027)  \u003d \u0027 \u0027\n     *   CharUtils.toCharacterObject(\u0027A\u0027)  \u003d \u0027A\u0027\n     * \u003c/pre\u003e\n     *\n     * @param ch  the character to convert\n     * @return a Character of the specified character\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharUtils.toCharacterObject(java.lang.String)",
      "begin_line": 130,
      "end_line": 135,
      "comment": "\n     * \u003cp\u003eConverts the String to a Character using the first character, returning\n     * null for empty Strings.\u003c/p\u003e\n     * \n     * \u003cp\u003eFor ASCII 7 bit characters, this uses a cache that will return the\n     * same Character object each time.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   CharUtils.toCharacterObject(null) \u003d null\n     *   CharUtils.toCharacterObject(\"\")   \u003d null\n     *   CharUtils.toCharacterObject(\"A\")  \u003d \u0027A\u0027\n     *   CharUtils.toCharacterObject(\"BA\") \u003d \u0027B\u0027\n     * \u003c/pre\u003e\n     *\n     * @param str  the character to convert\n     * @return the Character value of the first letter of the String\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharUtils.toChar(java.lang.Character)",
      "begin_line": 151,
      "end_line": 156,
      "comment": "\n     * \u003cp\u003eConverts the Character to a char throwing an exception for \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   CharUtils.toChar(null) \u003d IllegalArgumentException\n     *   CharUtils.toChar(\u0027 \u0027)  \u003d \u0027 \u0027\n     *   CharUtils.toChar(\u0027A\u0027)  \u003d \u0027A\u0027\n     * \u003c/pre\u003e\n     *\n     * @param ch  the character to convert\n     * @return the char value of the Character\n     * @throws IllegalArgumentException if the Character is null\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharUtils.toChar(java.lang.Character, char)",
      "begin_line": 171,
      "end_line": 176,
      "comment": "\n     * \u003cp\u003eConverts the Character to a char handling \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   CharUtils.toChar(null, \u0027X\u0027) \u003d \u0027X\u0027\n     *   CharUtils.toChar(\u0027 \u0027, \u0027X\u0027)  \u003d \u0027 \u0027\n     *   CharUtils.toChar(\u0027A\u0027, \u0027X\u0027)  \u003d \u0027A\u0027\n     * \u003c/pre\u003e\n     *\n     * @param ch  the character to convert\n     * @param defaultValue  the value to use if the  Character is null\n     * @return the char value of the Character or the default if null\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharUtils.toChar(java.lang.String)",
      "begin_line": 194,
      "end_line": 199,
      "comment": "\n     * \u003cp\u003eConverts the String to a char using the first character, throwing\n     * an exception on empty Strings.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   CharUtils.toChar(null) \u003d IllegalArgumentException\n     *   CharUtils.toChar(\"\")   \u003d IllegalArgumentException\n     *   CharUtils.toChar(\"A\")  \u003d \u0027A\u0027\n     *   CharUtils.toChar(\"BA\") \u003d \u0027B\u0027\n     * \u003c/pre\u003e\n     *\n     * @param str  the character to convert\n     * @return the char value of the first letter of the String\n     * @throws IllegalArgumentException if the String is empty\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharUtils.toChar(java.lang.String, char)",
      "begin_line": 216,
      "end_line": 221,
      "comment": "\n     * \u003cp\u003eConverts the String to a char using the first character, defaulting\n     * the value on empty Strings.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *   CharUtils.toChar(null, \u0027X\u0027) \u003d \u0027X\u0027\n     *   CharUtils.toChar(\"\", \u0027X\u0027)   \u003d \u0027X\u0027\n     *   CharUtils.toChar(\"A\", \u0027X\u0027)  \u003d \u0027A\u0027\n     *   CharUtils.toChar(\"BA\", \u0027X\u0027) \u003d \u0027B\u0027\n     * \u003c/pre\u003e\n     *\n     * @param str  the character to convert\n     * @param defaultValue  the value to use if the  Character is null\n     * @return the char value of the first letter of the String or the default if null\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharUtils.toIntValue(char)",
      "begin_line": 239,
      "end_line": 244,
      "comment": "\n     * \u003cp\u003eConverts the character to the Integer it represents, throwing an\n     * exception if the character is not numeric.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method coverts the char \u00271\u0027 to the int 1 and so on.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.toIntValue(\u00273\u0027)  \u003d 3\n     *   CharUtils.toIntValue(\u0027A\u0027)  \u003d IllegalArgumentException\n     * \u003c/pre\u003e\n     *\n     * @param ch  the character to convert\n     * @return the int value of the character\n     * @throws IllegalArgumentException if the character is not ASCII numeric\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 243,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharUtils.toIntValue(char, int)",
      "begin_line": 261,
      "end_line": 266,
      "comment": "\n     * \u003cp\u003eConverts the character to the Integer it represents, throwing an\n     * exception if the character is not numeric.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method coverts the char \u00271\u0027 to the int 1 and so on.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.toIntValue(\u00273\u0027, -1)  \u003d 3\n     *   CharUtils.toIntValue(\u0027A\u0027, -1)  \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param ch  the character to convert\n     * @param defaultValue  the default value to use if the character is not numeric\n     * @return the int value of the character\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 265,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharUtils.toIntValue(java.lang.Character)",
      "begin_line": 284,
      "end_line": 289,
      "comment": "\n     * \u003cp\u003eConverts the character to the Integer it represents, throwing an\n     * exception if the character is not numeric.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method coverts the char \u00271\u0027 to the int 1 and so on.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.toIntValue(null) \u003d IllegalArgumentException\n     *   CharUtils.toIntValue(\u00273\u0027)  \u003d 3\n     *   CharUtils.toIntValue(\u0027A\u0027)  \u003d IllegalArgumentException\n     * \u003c/pre\u003e\n     *\n     * @param ch  the character to convert, not null\n     * @return the int value of the character\n     * @throws IllegalArgumentException if the Character is not ASCII numeric or is null\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 288,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharUtils.toIntValue(java.lang.Character, int)",
      "begin_line": 307,
      "end_line": 312,
      "comment": "\n     * \u003cp\u003eConverts the character to the Integer it represents, throwing an\n     * exception if the character is not numeric.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis method coverts the char \u00271\u0027 to the int 1 and so on.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.toIntValue(null, -1) \u003d -1\n     *   CharUtils.toIntValue(\u00273\u0027, -1)  \u003d 3\n     *   CharUtils.toIntValue(\u0027A\u0027, -1)  \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param ch  the character to convert\n     * @param defaultValue  the default value to use if the character is not numeric\n     * @return the int value of the character\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 311,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharUtils.toString(char)",
      "begin_line": 329,
      "end_line": 334,
      "comment": "\n     * \u003cp\u003eConverts the character to a String that contains the one character.\u003c/p\u003e\n     * \n     * \u003cp\u003eFor ASCII 7 bit characters, this uses a cache that will return the\n     * same String object each time.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.toString(\u0027 \u0027)  \u003d \" \"\n     *   CharUtils.toString(\u0027A\u0027)  \u003d \"A\"\n     * \u003c/pre\u003e\n     *\n     * @param ch  the character to convert\n     * @return a String containing the one specified character\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 332,col 9)",
        "(line 333,col 9)-(line 333,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharUtils.toString(java.lang.Character)",
      "begin_line": 353,
      "end_line": 358,
      "comment": "\n     * \u003cp\u003eConverts the character to a String that contains the one character.\u003c/p\u003e\n     * \n     * \u003cp\u003eFor ASCII 7 bit characters, this uses a cache that will return the\n     * same String object each time.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf \u003ccode\u003enull\u003c/code\u003e is passed in, \u003ccode\u003enull\u003c/code\u003e will be returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.toString(null) \u003d null\n     *   CharUtils.toString(\u0027 \u0027)  \u003d \" \"\n     *   CharUtils.toString(\u0027A\u0027)  \u003d \"A\"\n     * \u003c/pre\u003e\n     *\n     * @param ch  the character to convert\n     * @return a String containing the one specified character\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 357,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharUtils.unicodeEscaped(char)",
      "begin_line": 374,
      "end_line": 383,
      "comment": "\n     * \u003cp\u003eConverts the string to the unicode format \u0027\\u0020\u0027.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis format is the Java source code format.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.unicodeEscaped(\u0027 \u0027) \u003d \"\\u0020\"\n     *   CharUtils.unicodeEscaped(\u0027A\u0027) \u003d \"\\u0041\"\n     * \u003c/pre\u003e\n     * \n     * @param ch  the character to convert\n     * @return the escaped unicode string\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 382,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharUtils.unicodeEscaped(java.lang.Character)",
      "begin_line": 401,
      "end_line": 406,
      "comment": "\n     * \u003cp\u003eConverts the string to the unicode format \u0027\\u0020\u0027.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis format is the Java source code format.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf \u003ccode\u003enull\u003c/code\u003e is passed in, \u003ccode\u003enull\u003c/code\u003e will be returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.unicodeEscaped(null) \u003d null\n     *   CharUtils.unicodeEscaped(\u0027 \u0027)  \u003d \"\\u0020\"\n     *   CharUtils.unicodeEscaped(\u0027A\u0027)  \u003d \"\\u0041\"\n     * \u003c/pre\u003e\n     * \n     * @param ch  the character to convert, may be null\n     * @return the escaped unicode string, null if null input\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 405,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharUtils.isAscii(char)",
      "begin_line": 424,
      "end_line": 426,
      "comment": "\n     * \u003cp\u003eChecks whether the character is ASCII 7 bit.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.isAscii(\u0027a\u0027)  \u003d true\n     *   CharUtils.isAscii(\u0027A\u0027)  \u003d true\n     *   CharUtils.isAscii(\u00273\u0027)  \u003d true\n     *   CharUtils.isAscii(\u0027-\u0027)  \u003d true\n     *   CharUtils.isAscii(\u0027\\n\u0027) \u003d true\n     *   CharUtils.isAscii(\u0027\u0026copy;\u0027) \u003d false\n     * \u003c/pre\u003e\n     * \n     * @param ch  the character to check\n     * @return true if less than 128\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharUtils.isAsciiPrintable(char)",
      "begin_line": 443,
      "end_line": 445,
      "comment": "\n     * \u003cp\u003eChecks whether the character is ASCII 7 bit printable.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.isAsciiPrintable(\u0027a\u0027)  \u003d true\n     *   CharUtils.isAsciiPrintable(\u0027A\u0027)  \u003d true\n     *   CharUtils.isAsciiPrintable(\u00273\u0027)  \u003d true\n     *   CharUtils.isAsciiPrintable(\u0027-\u0027)  \u003d true\n     *   CharUtils.isAsciiPrintable(\u0027\\n\u0027) \u003d false\n     *   CharUtils.isAsciiPrintable(\u0027\u0026copy;\u0027) \u003d false\n     * \u003c/pre\u003e\n     * \n     * @param ch  the character to check\n     * @return true if between 32 and 126 inclusive\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharUtils.isAsciiControl(char)",
      "begin_line": 462,
      "end_line": 464,
      "comment": "\n     * \u003cp\u003eChecks whether the character is ASCII 7 bit control.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.isAsciiControl(\u0027a\u0027)  \u003d false\n     *   CharUtils.isAsciiControl(\u0027A\u0027)  \u003d false\n     *   CharUtils.isAsciiControl(\u00273\u0027)  \u003d false\n     *   CharUtils.isAsciiControl(\u0027-\u0027)  \u003d false\n     *   CharUtils.isAsciiControl(\u0027\\n\u0027) \u003d true\n     *   CharUtils.isAsciiControl(\u0027\u0026copy;\u0027) \u003d false\n     * \u003c/pre\u003e\n     * \n     * @param ch  the character to check\n     * @return true if less than 32 or equals 127\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharUtils.isAsciiAlpha(char)",
      "begin_line": 481,
      "end_line": 483,
      "comment": "\n     * \u003cp\u003eChecks whether the character is ASCII 7 bit alphabetic.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.isAsciiAlpha(\u0027a\u0027)  \u003d true\n     *   CharUtils.isAsciiAlpha(\u0027A\u0027)  \u003d true\n     *   CharUtils.isAsciiAlpha(\u00273\u0027)  \u003d false\n     *   CharUtils.isAsciiAlpha(\u0027-\u0027)  \u003d false\n     *   CharUtils.isAsciiAlpha(\u0027\\n\u0027) \u003d false\n     *   CharUtils.isAsciiAlpha(\u0027\u0026copy;\u0027) \u003d false\n     * \u003c/pre\u003e\n     * \n     * @param ch  the character to check\n     * @return true if between 65 and 90 or 97 and 122 inclusive\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharUtils.isAsciiAlphaUpper(char)",
      "begin_line": 500,
      "end_line": 502,
      "comment": "\n     * \u003cp\u003eChecks whether the character is ASCII 7 bit alphabetic upper case.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.isAsciiAlphaUpper(\u0027a\u0027)  \u003d false\n     *   CharUtils.isAsciiAlphaUpper(\u0027A\u0027)  \u003d true\n     *   CharUtils.isAsciiAlphaUpper(\u00273\u0027)  \u003d false\n     *   CharUtils.isAsciiAlphaUpper(\u0027-\u0027)  \u003d false\n     *   CharUtils.isAsciiAlphaUpper(\u0027\\n\u0027) \u003d false\n     *   CharUtils.isAsciiAlphaUpper(\u0027\u0026copy;\u0027) \u003d false\n     * \u003c/pre\u003e\n     * \n     * @param ch  the character to check\n     * @return true if between 65 and 90 inclusive\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharUtils.isAsciiAlphaLower(char)",
      "begin_line": 519,
      "end_line": 521,
      "comment": "\n     * \u003cp\u003eChecks whether the character is ASCII 7 bit alphabetic lower case.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.isAsciiAlphaLower(\u0027a\u0027)  \u003d true\n     *   CharUtils.isAsciiAlphaLower(\u0027A\u0027)  \u003d false\n     *   CharUtils.isAsciiAlphaLower(\u00273\u0027)  \u003d false\n     *   CharUtils.isAsciiAlphaLower(\u0027-\u0027)  \u003d false\n     *   CharUtils.isAsciiAlphaLower(\u0027\\n\u0027) \u003d false\n     *   CharUtils.isAsciiAlphaLower(\u0027\u0026copy;\u0027) \u003d false\n     * \u003c/pre\u003e\n     * \n     * @param ch  the character to check\n     * @return true if between 97 and 122 inclusive\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharUtils.isAsciiNumeric(char)",
      "begin_line": 538,
      "end_line": 540,
      "comment": "\n     * \u003cp\u003eChecks whether the character is ASCII 7 bit numeric.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.isAsciiNumeric(\u0027a\u0027)  \u003d false\n     *   CharUtils.isAsciiNumeric(\u0027A\u0027)  \u003d false\n     *   CharUtils.isAsciiNumeric(\u00273\u0027)  \u003d true\n     *   CharUtils.isAsciiNumeric(\u0027-\u0027)  \u003d false\n     *   CharUtils.isAsciiNumeric(\u0027\\n\u0027) \u003d false\n     *   CharUtils.isAsciiNumeric(\u0027\u0026copy;\u0027) \u003d false\n     * \u003c/pre\u003e\n     * \n     * @param ch  the character to check\n     * @return true if between 48 and 57 inclusive\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharUtils.isAsciiAlphanumeric(char)",
      "begin_line": 557,
      "end_line": 559,
      "comment": "\n     * \u003cp\u003eChecks whether the character is ASCII 7 bit numeric.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   CharUtils.isAsciiAlphanumeric(\u0027a\u0027)  \u003d true\n     *   CharUtils.isAsciiAlphanumeric(\u0027A\u0027)  \u003d true\n     *   CharUtils.isAsciiAlphanumeric(\u00273\u0027)  \u003d true\n     *   CharUtils.isAsciiAlphanumeric(\u0027-\u0027)  \u003d false\n     *   CharUtils.isAsciiAlphanumeric(\u0027\\n\u0027) \u003d false\n     *   CharUtils.isAsciiAlphanumeric(\u0027\u0026copy;\u0027) \u003d false\n     * \u003c/pre\u003e\n     * \n     * @param ch  the character to check\n     * @return true if between 48 and 57 or 65 and 90 or 97 and 122 inclusive\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 96)"
      ]
    }
  ]
}