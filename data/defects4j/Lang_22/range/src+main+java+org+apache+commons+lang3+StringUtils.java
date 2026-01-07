{
  "filepath": "/tmp/Lang-22b/src/main/java/org/apache/commons/lang3/StringUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StringUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 128,
      "end_line": 6422,
      "comment": "@Immutable"
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": "\n     * The empty String \u003ccode\u003e\"\"\u003c/code\u003e.\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INDEX_NOT_FOUND"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": "\n     * Represents a failed index search.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PAD_LIMIT"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": "\n     * \u003cp\u003eThe maximum size to which the padding constant(s) can expand.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "WHITESPACE_BLOCK"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": "\n     * A regex pattern for recognizing blocks of whitespace characters.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.StringUtils.StringUtils()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eStringUtils\u003c/code\u003e instances should NOT be constructed in\n     * standard programming. Instead, the class should be used as\n     * \u003ccode\u003eStringUtils.trim(\" foo \");\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isEmpty(java.lang.CharSequence)",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\n     * \u003cp\u003eChecks if a CharSequence is empty (\"\") or null.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isEmpty(null)      \u003d true\n     * StringUtils.isEmpty(\"\")        \u003d true\n     * StringUtils.isEmpty(\" \")       \u003d false\n     * StringUtils.isEmpty(\"bob\")     \u003d false\n     * StringUtils.isEmpty(\"  bob  \") \u003d false\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eNOTE: This method changed in Lang version 2.0.\n     * It no longer trims the CharSequence.\n     * That functionality is available in isBlank().\u003c/p\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the CharSequence is empty or null\n     * @since 3.0 Changed signature from isEmpty(String) to isEmpty(CharSequence)\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isNotEmpty(java.lang.CharSequence)",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\n     * \u003cp\u003eChecks if a CharSequence is not empty (\"\") and not null.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isNotEmpty(null)      \u003d false\n     * StringUtils.isNotEmpty(\"\")        \u003d false\n     * StringUtils.isNotEmpty(\" \")       \u003d true\n     * StringUtils.isNotEmpty(\"bob\")     \u003d true\n     * StringUtils.isNotEmpty(\"  bob  \") \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the CharSequence is not empty and not null\n     * @since 3.0 Changed signature from isNotEmpty(String) to isNotEmpty(CharSequence)\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isBlank(java.lang.CharSequence)",
      "begin_line": 239,
      "end_line": 250,
      "comment": "\n     * \u003cp\u003eChecks if a CharSequence is whitespace, empty (\"\") or null.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isBlank(null)      \u003d true\n     * StringUtils.isBlank(\"\")        \u003d true\n     * StringUtils.isBlank(\" \")       \u003d true\n     * StringUtils.isBlank(\"bob\")     \u003d false\n     * StringUtils.isBlank(\"  bob  \") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the CharSequence is null, empty or whitespace\n     * @since 2.0\n     * @since 3.0 Changed signature from isBlank(String) to isBlank(CharSequence)\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 19)",
        "(line 241,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isNotBlank(java.lang.CharSequence)",
      "begin_line": 269,
      "end_line": 271,
      "comment": "\n     * \u003cp\u003eChecks if a CharSequence is not empty (\"\"), not null and not whitespace only.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isNotBlank(null)      \u003d false\n     * StringUtils.isNotBlank(\"\")        \u003d false\n     * StringUtils.isNotBlank(\" \")       \u003d false\n     * StringUtils.isNotBlank(\"bob\")     \u003d true\n     * StringUtils.isNotBlank(\"  bob  \") \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the CharSequence is\n     *  not empty and not null and not whitespace\n     * @since 2.0\n     * @since 3.0 Changed signature from isNotBlank(String) to isNotBlank(CharSequence)\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.trim(java.lang.String)",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\n     * \u003cp\u003eRemoves control characters (char \u0026lt;\u003d 32) from both\n     * ends of this String, handling \u003ccode\u003enull\u003c/code\u003e by returning\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is trimmed using {@link String#trim()}.\n     * Trim removes start and end characters \u0026lt;\u003d 32.\n     * To strip whitespace use {@link #strip(String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eTo trim your choice of characters, use the\n     * {@link #strip(String, String)} methods.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.trim(null)          \u003d null\n     * StringUtils.trim(\"\")            \u003d \"\"\n     * StringUtils.trim(\"     \")       \u003d \"\"\n     * StringUtils.trim(\"abc\")         \u003d \"abc\"\n     * StringUtils.trim(\"    abc    \") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be trimmed, may be null\n     * @return the trimmed string, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.trimToNull(java.lang.String)",
      "begin_line": 324,
      "end_line": 327,
      "comment": "\n     * \u003cp\u003eRemoves control characters (char \u0026lt;\u003d 32) from both\n     * ends of this String returning \u003ccode\u003enull\u003c/code\u003e if the String is\n     * empty (\"\") after the trim or if it is \u003ccode\u003enull\u003c/code\u003e.\n     *\n     * \u003cp\u003eThe String is trimmed using {@link String#trim()}.\n     * Trim removes start and end characters \u0026lt;\u003d 32.\n     * To strip whitespace use {@link #stripToNull(String)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.trimToNull(null)          \u003d null\n     * StringUtils.trimToNull(\"\")            \u003d null\n     * StringUtils.trimToNull(\"     \")       \u003d null\n     * StringUtils.trimToNull(\"abc\")         \u003d \"abc\"\n     * StringUtils.trimToNull(\"    abc    \") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be trimmed, may be null\n     * @return the trimmed String,\n     *  \u003ccode\u003enull\u003c/code\u003e if only chars \u0026lt;\u003d 32, empty or null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 30)",
        "(line 326,col 9)-(line 326,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.trimToEmpty(java.lang.String)",
      "begin_line": 350,
      "end_line": 352,
      "comment": "\n     * \u003cp\u003eRemoves control characters (char \u0026lt;\u003d 32) from both\n     * ends of this String returning an empty String (\"\") if the String\n     * is empty (\"\") after the trim or if it is \u003ccode\u003enull\u003c/code\u003e.\n     *\n     * \u003cp\u003eThe String is trimmed using {@link String#trim()}.\n     * Trim removes start and end characters \u0026lt;\u003d 32.\n     * To strip whitespace use {@link #stripToEmpty(String)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.trimToEmpty(null)          \u003d \"\"\n     * StringUtils.trimToEmpty(\"\")            \u003d \"\"\n     * StringUtils.trimToEmpty(\"     \")       \u003d \"\"\n     * StringUtils.trimToEmpty(\"abc\")         \u003d \"abc\"\n     * StringUtils.trimToEmpty(\"    abc    \") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be trimmed, may be null\n     * @return the trimmed String, or an empty String if \u003ccode\u003enull\u003c/code\u003e input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.strip(java.lang.String)",
      "begin_line": 378,
      "end_line": 380,
      "comment": "\n     * \u003cp\u003eStrips whitespace from the start and end of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is similar to {@link #trim(String)} but removes whitespace.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.strip(null)     \u003d null\n     * StringUtils.strip(\"\")       \u003d \"\"\n     * StringUtils.strip(\"   \")    \u003d \"\"\n     * StringUtils.strip(\"abc\")    \u003d \"abc\"\n     * StringUtils.strip(\"  abc\")  \u003d \"abc\"\n     * StringUtils.strip(\"abc  \")  \u003d \"abc\"\n     * StringUtils.strip(\" abc \")  \u003d \"abc\"\n     * StringUtils.strip(\" ab c \") \u003d \"ab c\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to remove whitespace from, may be null\n     * @return the stripped String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.stripToNull(java.lang.String)",
      "begin_line": 405,
      "end_line": 411,
      "comment": "\n     * \u003cp\u003eStrips whitespace from the start and end of a String  returning\n     * \u003ccode\u003enull\u003c/code\u003e if the String is empty (\"\") after the strip.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is similar to {@link #trimToNull(String)} but removes whitespace.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripToNull(null)     \u003d null\n     * StringUtils.stripToNull(\"\")       \u003d null\n     * StringUtils.stripToNull(\"   \")    \u003d null\n     * StringUtils.stripToNull(\"abc\")    \u003d \"abc\"\n     * StringUtils.stripToNull(\"  abc\")  \u003d \"abc\"\n     * StringUtils.stripToNull(\"abc  \")  \u003d \"abc\"\n     * StringUtils.stripToNull(\" abc \")  \u003d \"abc\"\n     * StringUtils.stripToNull(\" ab c \") \u003d \"ab c\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be stripped, may be null\n     * @return the stripped String,\n     *  \u003ccode\u003enull\u003c/code\u003e if whitespace, empty or null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 409,col 31)",
        "(line 410,col 9)-(line 410,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.stripToEmpty(java.lang.String)",
      "begin_line": 435,
      "end_line": 437,
      "comment": "\n     * \u003cp\u003eStrips whitespace from the start and end of a String  returning\n     * an empty String if \u003ccode\u003enull\u003c/code\u003e input.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is similar to {@link #trimToEmpty(String)} but removes whitespace.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripToEmpty(null)     \u003d \"\"\n     * StringUtils.stripToEmpty(\"\")       \u003d \"\"\n     * StringUtils.stripToEmpty(\"   \")    \u003d \"\"\n     * StringUtils.stripToEmpty(\"abc\")    \u003d \"abc\"\n     * StringUtils.stripToEmpty(\"  abc\")  \u003d \"abc\"\n     * StringUtils.stripToEmpty(\"abc  \")  \u003d \"abc\"\n     * StringUtils.stripToEmpty(\" abc \")  \u003d \"abc\"\n     * StringUtils.stripToEmpty(\" ab c \") \u003d \"ab c\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be stripped, may be null\n     * @return the trimmed String, or an empty String if \u003ccode\u003enull\u003c/code\u003e input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.strip(java.lang.String, java.lang.String)",
      "begin_line": 465,
      "end_line": 471,
      "comment": "\n     * \u003cp\u003eStrips any of a set of characters from the start and end of a String.\n     * This is similar to {@link String#trim()} but allows the characters\n     * to be stripped to be controlled.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * An empty string (\"\") input returns the empty string.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the stripChars String is \u003ccode\u003enull\u003c/code\u003e, whitespace is\n     * stripped as defined by {@link Character#isWhitespace(char)}.\n     * Alternatively use {@link #strip(String)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.strip(null, *)          \u003d null\n     * StringUtils.strip(\"\", *)            \u003d \"\"\n     * StringUtils.strip(\"abc\", null)      \u003d \"abc\"\n     * StringUtils.strip(\"  abc\", null)    \u003d \"abc\"\n     * StringUtils.strip(\"abc  \", null)    \u003d \"abc\"\n     * StringUtils.strip(\" abc \", null)    \u003d \"abc\"\n     * StringUtils.strip(\"  abcyx\", \"xyz\") \u003d \"  abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to remove characters from, may be null\n     * @param stripChars  the characters to remove, null treated as whitespace\n     * @return the stripped String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 468,col 9)",
        "(line 469,col 9)-(line 469,col 42)",
        "(line 470,col 9)-(line 470,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.stripStart(java.lang.String, java.lang.String)",
      "begin_line": 497,
      "end_line": 515,
      "comment": "\n     * \u003cp\u003eStrips any of a set of characters from the start of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * An empty string (\"\") input returns the empty string.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the stripChars String is \u003ccode\u003enull\u003c/code\u003e, whitespace is\n     * stripped as defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripStart(null, *)          \u003d null\n     * StringUtils.stripStart(\"\", *)            \u003d \"\"\n     * StringUtils.stripStart(\"abc\", \"\")        \u003d \"abc\"\n     * StringUtils.stripStart(\"abc\", null)      \u003d \"abc\"\n     * StringUtils.stripStart(\"  abc\", null)    \u003d \"abc\"\n     * StringUtils.stripStart(\"abc  \", null)    \u003d \"abc  \"\n     * StringUtils.stripStart(\" abc \", null)    \u003d \"abc \"\n     * StringUtils.stripStart(\"yxabc  \", \"xyz\") \u003d \"abc  \"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to remove characters from, may be null\n     * @param stripChars  the characters to remove, null treated as whitespace\n     * @return the stripped String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 19)",
        "(line 499,col 9)-(line 501,col 9)",
        "(line 502,col 9)-(line 502,col 22)",
        "(line 503,col 9)-(line 513,col 9)",
        "(line 514,col 9)-(line 514,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.stripEnd(java.lang.String, java.lang.String)",
      "begin_line": 542,
      "end_line": 560,
      "comment": "\n     * \u003cp\u003eStrips any of a set of characters from the end of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * An empty string (\"\") input returns the empty string.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the stripChars String is \u003ccode\u003enull\u003c/code\u003e, whitespace is\n     * stripped as defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripEnd(null, *)          \u003d null\n     * StringUtils.stripEnd(\"\", *)            \u003d \"\"\n     * StringUtils.stripEnd(\"abc\", \"\")        \u003d \"abc\"\n     * StringUtils.stripEnd(\"abc\", null)      \u003d \"abc\"\n     * StringUtils.stripEnd(\"  abc\", null)    \u003d \"  abc\"\n     * StringUtils.stripEnd(\"abc  \", null)    \u003d \"abc\"\n     * StringUtils.stripEnd(\" abc \", null)    \u003d \" abc\"\n     * StringUtils.stripEnd(\"  abcyx\", \"xyz\") \u003d \"  abc\"\n     * StringUtils.stripEnd(\"120.00\", \".0\")   \u003d \"12\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to remove characters from, may be null\n     * @param stripChars  the set of characters to remove, null treated as whitespace\n     * @return the stripped String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 16)",
        "(line 544,col 9)-(line 546,col 9)",
        "(line 548,col 9)-(line 558,col 9)",
        "(line 559,col 9)-(line 559,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.stripAll(java.lang.String[])",
      "begin_line": 583,
      "end_line": 585,
      "comment": "\n     * \u003cp\u003eStrips whitespace from the start and end of every String in an array.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA new array is returned each time, except for length zero.\n     * A \u003ccode\u003enull\u003c/code\u003e array will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty array will return itself.\n     * A \u003ccode\u003enull\u003c/code\u003e array entry will be ignored.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripAll(null)             \u003d null\n     * StringUtils.stripAll([])               \u003d []\n     * StringUtils.stripAll([\"abc\", \"  abc\"]) \u003d [\"abc\", \"abc\"]\n     * StringUtils.stripAll([\"abc  \", null])  \u003d [\"abc\", null]\n     * \u003c/pre\u003e\n     *\n     * @param strs  the array to remove whitespace from, may be null\n     * @return the stripped Strings, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 584,col 9)-(line 584,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.stripAll(java.lang.String[], java.lang.String)",
      "begin_line": 612,
      "end_line": 622,
      "comment": "\n     * \u003cp\u003eStrips any of a set of characters from the start and end of every\n     * String in an array.\u003c/p\u003e\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA new array is returned each time, except for length zero.\n     * A \u003ccode\u003enull\u003c/code\u003e array will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty array will return itself.\n     * A \u003ccode\u003enull\u003c/code\u003e array entry will be ignored.\n     * A \u003ccode\u003enull\u003c/code\u003e stripChars will strip whitespace as defined by\n     * {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripAll(null, *)                \u003d null\n     * StringUtils.stripAll([], *)                  \u003d []\n     * StringUtils.stripAll([\"abc\", \"  abc\"], null) \u003d [\"abc\", \"abc\"]\n     * StringUtils.stripAll([\"abc  \", null], null)  \u003d [\"abc\", null]\n     * StringUtils.stripAll([\"abc  \", null], \"yz\")  \u003d [\"abc  \", null]\n     * StringUtils.stripAll([\"yabcz\", null], \"yz\")  \u003d [\"abc\", null]\n     * \u003c/pre\u003e\n     *\n     * @param strs  the array to remove characters from, may be null\n     * @param stripChars  the characters to remove, null treated as whitespace\n     * @return the stripped Strings, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 613,col 9)-(line 613,col 20)",
        "(line 614,col 9)-(line 616,col 9)",
        "(line 617,col 9)-(line 617,col 46)",
        "(line 618,col 9)-(line 620,col 9)",
        "(line 621,col 9)-(line 621,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.stripAccents(java.lang.CharSequence)",
      "begin_line": 645,
      "end_line": 669,
      "comment": " See also Lucene\u0027s ASCIIFoldingFilter (Lucene 2.9) that replaces accented characters by their unaccented equivalent (and uncommited bug fix: https://issues.apache.org/jira/browse/LUCENE-1343?focusedCommentId\u003d12858907\u0026page\u003dcom.atlassian.jira.plugin.system.issuetabpanels%3Acomment-tabpanel#action_12858907).",
      "child_ranges": [
        "(line 646,col 9)-(line 648,col 9)",
        "(line 649,col 9)-(line 668,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.removeAccentsJava6(java.lang.CharSequence)",
      "begin_line": 676,
      "end_line": 688,
      "comment": "\n     * Use {@code java.text.Normalizer#normalize(CharSequence, Normalizer.Form)}\n     * (but be careful, this classe exists in Java 1.3, with an entirely different meaning!)\n     * @param text\n     ",
      "child_ranges": [
        "(line 681,col 9)-(line 683,col 9)",
        "(line 684,col 9)-(line 684,col 22)",
        "(line 685,col 9)-(line 685,col 105)",
        "(line 686,col 9)-(line 686,col 61)",
        "(line 687,col 9)-(line 687,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.removeAccentsSUN(java.lang.CharSequence)",
      "begin_line": 693,
      "end_line": 705,
      "comment": "\n     * Use {@code sun.text.Normalizer#decompose(String, boolean, int)}\n     ",
      "child_ranges": [
        "(line 698,col 9)-(line 700,col 9)",
        "(line 701,col 9)-(line 701,col 22)",
        "(line 702,col 9)-(line 702,col 114)",
        "(line 703,col 9)-(line 703,col 59)",
        "(line 704,col 9)-(line 704,col 22)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sunAvailable"
      ],
      "begin_line": 708,
      "end_line": 708,
      "comment": " SUN internal, Java 1.3 -\u003e Java 5"
    },
    {
      "type": "field",
      "varNames": [
        "sunDecomposeMethod"
      ],
      "begin_line": 709,
      "end_line": 709,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sunPattern"
      ],
      "begin_line": 710,
      "end_line": 710,
      "comment": "$NON-NLS-1$"
    },
    {
      "type": "field",
      "varNames": [
        "java6Available"
      ],
      "begin_line": 712,
      "end_line": 712,
      "comment": " Java 6+"
    },
    {
      "type": "field",
      "varNames": [
        "java6NormalizeMethod"
      ],
      "begin_line": 713,
      "end_line": 713,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "java6NormalizerFormNFD"
      ],
      "begin_line": 714,
      "end_line": 714,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "java6Pattern"
      ],
      "begin_line": 715,
      "end_line": 715,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.equals(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 763,
      "end_line": 765,
      "comment": "\n     * \u003cp\u003eCompares two CharSequences, returning \u003ccode\u003etrue\u003c/code\u003e if they are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003es are handled without exceptions. Two \u003ccode\u003enull\u003c/code\u003e\n     * references are considered to be equal. The comparison is case sensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.equals(null, null)   \u003d true\n     * StringUtils.equals(null, \"abc\")  \u003d false\n     * StringUtils.equals(\"abc\", null)  \u003d false\n     * StringUtils.equals(\"abc\", \"abc\") \u003d true\n     * StringUtils.equals(\"abc\", \"ABC\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#equals(Object)\n     * @param cs1  the first CharSequence, may be null\n     * @param cs2  the second CharSequence, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the CharSequences are equal, case sensitive, or\n     *  both \u003ccode\u003enull\u003c/code\u003e\n     * @since 3.0 Changed signature from equals(String, String) to equals(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 764,col 9)-(line 764,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.equalsIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 788,
      "end_line": 790,
      "comment": "\n     * \u003cp\u003eCompares two Strings, returning \u003ccode\u003etrue\u003c/code\u003e if they are equal ignoring\n     * the case.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003es are handled without exceptions. Two \u003ccode\u003enull\u003c/code\u003e\n     * references are considered equal. Comparison is case insensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.equalsIgnoreCase(null, null)   \u003d true\n     * StringUtils.equalsIgnoreCase(null, \"abc\")  \u003d false\n     * StringUtils.equalsIgnoreCase(\"abc\", null)  \u003d false\n     * StringUtils.equalsIgnoreCase(\"abc\", \"abc\") \u003d true\n     * StringUtils.equalsIgnoreCase(\"abc\", \"ABC\") \u003d true\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#equalsIgnoreCase(String)\n     * @param str1  the first String, may be null\n     * @param str2  the second String, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the Strings are equal, case insensitive, or\n     *  both \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 789,col 9)-(line 789,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOf(java.lang.String, int)",
      "begin_line": 813,
      "end_line": 818,
      "comment": "\n     * \u003cp\u003eFinds the first index within a String, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#indexOf(int)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e or empty (\"\") String will return \u003ccode\u003eINDEX_NOT_FOUND (-1)\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOf(null, *)         \u003d -1\n     * StringUtils.indexOf(\"\", *)           \u003d -1\n     * StringUtils.indexOf(\"aabaabaa\", \u0027a\u0027) \u003d 0\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027) \u003d 2\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChar  the character to find\n     * @return the first index of the search character,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 814,col 9)-(line 816,col 9)",
        "(line 817,col 9)-(line 817,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOf(java.lang.String, int, int)",
      "begin_line": 845,
      "end_line": 850,
      "comment": "\n     * \u003cp\u003eFinds the first index within a String from a start position,\n     * handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#indexOf(int, int)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e or empty (\"\") String will return \u003ccode\u003e(INDEX_NOT_FOUND) -1\u003c/code\u003e.\n     * A negative start position is treated as zero.\n     * A start position greater than the string length returns \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOf(null, *, *)          \u003d -1\n     * StringUtils.indexOf(\"\", *, *)            \u003d -1\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027, 0)  \u003d 2\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027, 3)  \u003d 5\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027, 9)  \u003d -1\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027, -1) \u003d 2\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChar  the character to find\n     * @param startPos  the start position, negative treated as zero\n     * @return the first index of the search character,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 846,col 9)-(line 848,col 9)",
        "(line 849,col 9)-(line 849,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOf(java.lang.String, java.lang.String)",
      "begin_line": 875,
      "end_line": 880,
      "comment": "\n     * \u003cp\u003eFinds the first index within a String, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#indexOf(String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOf(null, *)          \u003d -1\n     * StringUtils.indexOf(*, null)          \u003d -1\n     * StringUtils.indexOf(\"\", \"\")           \u003d 0\n     * StringUtils.indexOf(\"\", *)            \u003d -1 (except when * \u003d \"\")\n     * StringUtils.indexOf(\"aabaabaa\", \"a\")  \u003d 0\n     * StringUtils.indexOf(\"aabaabaa\", \"b\")  \u003d 2\n     * StringUtils.indexOf(\"aabaabaa\", \"ab\") \u003d 1\n     * StringUtils.indexOf(\"aabaabaa\", \"\")   \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStr  the String to find, may be null\n     * @return the first index of the search String,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 876,col 9)-(line 878,col 9)",
        "(line 879,col 9)-(line 879,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOf(java.lang.String, java.lang.String, int)",
      "begin_line": 914,
      "end_line": 919,
      "comment": "\n     * \u003cp\u003eFinds the first index within a String, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#indexOf(String, int)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A negative start position is treated as zero.\n     * An empty (\"\") search String always matches.\n     * A start position greater than the string length only matches\n     * an empty search String.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOf(null, *, *)          \u003d -1\n     * StringUtils.indexOf(*, null, *)          \u003d -1\n     * StringUtils.indexOf(\"\", \"\", 0)           \u003d 0\n     * StringUtils.indexOf(\"\", *, 0)            \u003d -1 (except when * \u003d \"\")\n     * StringUtils.indexOf(\"aabaabaa\", \"a\", 0)  \u003d 0\n     * StringUtils.indexOf(\"aabaabaa\", \"b\", 0)  \u003d 2\n     * StringUtils.indexOf(\"aabaabaa\", \"ab\", 0) \u003d 1\n     * StringUtils.indexOf(\"aabaabaa\", \"b\", 3)  \u003d 5\n     * StringUtils.indexOf(\"aabaabaa\", \"b\", 9)  \u003d -1\n     * StringUtils.indexOf(\"aabaabaa\", \"b\", -1) \u003d 2\n     * StringUtils.indexOf(\"aabaabaa\", \"\", 2)   \u003d 2\n     * StringUtils.indexOf(\"abc\", \"\", 9)        \u003d 3\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStr  the String to find, may be null\n     * @param startPos  the start position, negative treated as zero\n     * @return the first index of the search String,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 915,col 9)-(line 917,col 9)",
        "(line 918,col 9)-(line 918,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.ordinalIndexOf(java.lang.String, java.lang.String, int)",
      "begin_line": 954,
      "end_line": 956,
      "comment": "\n     * \u003cp\u003eFinds the n-th index within a String, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#indexOf(String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.ordinalIndexOf(null, *, *)          \u003d -1\n     * StringUtils.ordinalIndexOf(*, null, *)          \u003d -1\n     * StringUtils.ordinalIndexOf(\"\", \"\", *)           \u003d 0\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"a\", 1)  \u003d 0\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"a\", 2)  \u003d 1\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"b\", 1)  \u003d 2\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"b\", 2)  \u003d 5\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"ab\", 1) \u003d 1\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"ab\", 2) \u003d 4\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"\", 1)   \u003d 0\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"\", 2)   \u003d 0\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eNote that \u0027head(String str, int n)\u0027 may be implemented as: \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   str.substring(0, lastOrdinalIndexOf(str, \"\\n\", n))\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStr  the String to find, may be null\n     * @param ordinal  the n-th \u003ccode\u003esearchStr\u003c/code\u003e to find\n     * @return the n-th index of the search String,\n     *  \u003ccode\u003e-1\u003c/code\u003e (\u003ccode\u003eINDEX_NOT_FOUND\u003c/code\u003e) if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 955,col 9)-(line 955,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.ordinalIndexOf(java.lang.String, java.lang.String, int, boolean)",
      "begin_line": 972,
      "end_line": 993,
      "comment": " Shared code between ordinalIndexOf(String,String,int) and lastOrdinalIndexOf(String,String,int)",
      "child_ranges": [
        "(line 973,col 9)-(line 975,col 9)",
        "(line 976,col 9)-(line 978,col 9)",
        "(line 979,col 9)-(line 979,col 22)",
        "(line 980,col 9)-(line 980,col 63)",
        "(line 981,col 9)-(line 991,col 34)",
        "(line 992,col 9)-(line 992,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 1019,
      "end_line": 1021,
      "comment": "\n     * \u003cp\u003eCase in-sensitive find of the first index within a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A negative start position is treated as zero.\n     * An empty (\"\") search String always matches.\n     * A start position greater than the string length only matches\n     * an empty search String.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfIgnoreCase(null, *)          \u003d -1\n     * StringUtils.indexOfIgnoreCase(*, null)          \u003d -1\n     * StringUtils.indexOfIgnoreCase(\"\", \"\")           \u003d 0\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"a\")  \u003d 0\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"b\")  \u003d 2\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"ab\") \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStr  the String to find, may be null\n     * @return the first index of the search String,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 1020,col 9)-(line 1020,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(java.lang.String, java.lang.String, int)",
      "begin_line": 1054,
      "end_line": 1074,
      "comment": "\n     * \u003cp\u003eCase in-sensitive find of the first index within a String\n     * from the specified position.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A negative start position is treated as zero.\n     * An empty (\"\") search String always matches.\n     * A start position greater than the string length only matches\n     * an empty search String.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfIgnoreCase(null, *, *)          \u003d -1\n     * StringUtils.indexOfIgnoreCase(*, null, *)          \u003d -1\n     * StringUtils.indexOfIgnoreCase(\"\", \"\", 0)           \u003d 0\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"A\", 0)  \u003d 0\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"B\", 0)  \u003d 2\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"AB\", 0) \u003d 1\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"B\", 3)  \u003d 5\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"B\", 9)  \u003d -1\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"B\", -1) \u003d 2\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"\", 2)   \u003d 2\n     * StringUtils.indexOfIgnoreCase(\"abc\", \"\", 9)        \u003d 3\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStr  the String to find, may be null\n     * @param startPos  the start position, negative treated as zero\n     * @return the first index of the search String,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 1055,col 9)-(line 1057,col 9)",
        "(line 1058,col 9)-(line 1060,col 9)",
        "(line 1061,col 9)-(line 1061,col 63)",
        "(line 1062,col 9)-(line 1064,col 9)",
        "(line 1065,col 9)-(line 1067,col 9)",
        "(line 1068,col 9)-(line 1072,col 9)",
        "(line 1073,col 9)-(line 1073,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastIndexOf(java.lang.String, int)",
      "begin_line": 1097,
      "end_line": 1102,
      "comment": "\n     * \u003cp\u003eFinds the last index within a String, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#lastIndexOf(int)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e or empty (\"\") String will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOf(null, *)         \u003d -1\n     * StringUtils.lastIndexOf(\"\", *)           \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027a\u0027) \u003d 7\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027) \u003d 5\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChar  the character to find\n     * @return the last index of the search character,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1098,col 9)-(line 1100,col 9)",
        "(line 1101,col 9)-(line 1101,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastIndexOf(java.lang.String, int, int)",
      "begin_line": 1131,
      "end_line": 1136,
      "comment": "\n     * \u003cp\u003eFinds the last index within a String from a start position,\n     * handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#lastIndexOf(int, int)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e or empty (\"\") String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A negative start position returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A start position greater than the string length searches the whole string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOf(null, *, *)          \u003d -1\n     * StringUtils.lastIndexOf(\"\", *,  *)           \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, 8)  \u003d 5\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, 4)  \u003d 2\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, 0)  \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, 9)  \u003d 5\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, -1) \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027a\u0027, 0)  \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChar  the character to find\n     * @param startPos  the start position\n     * @return the last index of the search character,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1132,col 9)-(line 1134,col 9)",
        "(line 1135,col 9)-(line 1135,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastIndexOf(java.lang.String, java.lang.String)",
      "begin_line": 1160,
      "end_line": 1165,
      "comment": "\n     * \u003cp\u003eFinds the last index within a String, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#lastIndexOf(String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOf(null, *)          \u003d -1\n     * StringUtils.lastIndexOf(*, null)          \u003d -1\n     * StringUtils.lastIndexOf(\"\", \"\")           \u003d 0\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"a\")  \u003d 7\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\")  \u003d 5\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"ab\") \u003d 4\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"\")   \u003d 8\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStr  the String to find, may be null\n     * @return the last index of the search String,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1161,col 9)-(line 1163,col 9)",
        "(line 1164,col 9)-(line 1164,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf(java.lang.String, java.lang.String, int)",
      "begin_line": 1200,
      "end_line": 1202,
      "comment": "\n     * \u003cp\u003eFinds the n-th last index within a String, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#lastIndexOf(String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastOrdinalIndexOf(null, *, *)          \u003d -1\n     * StringUtils.lastOrdinalIndexOf(*, null, *)          \u003d -1\n     * StringUtils.lastOrdinalIndexOf(\"\", \"\", *)           \u003d 0\n     * StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"a\", 1)  \u003d 7\n     * StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"a\", 2)  \u003d 6\n     * StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"b\", 1)  \u003d 5\n     * StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"b\", 2)  \u003d 2\n     * StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"ab\", 1) \u003d 4\n     * StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"ab\", 2) \u003d 1\n     * StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"\", 1)   \u003d 8\n     * StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"\", 2)   \u003d 8\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eNote that \u0027tail(String str, int n)\u0027 may be implemented as: \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   str.substring(lastOrdinalIndexOf(str, \"\\n\", n) + 1)\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStr  the String to find, may be null\n     * @param ordinal  the n-th last \u003ccode\u003esearchStr\u003c/code\u003e to find\n     * @return the n-th last index of the search String,\n     *  \u003ccode\u003e-1\u003c/code\u003e (\u003ccode\u003eINDEX_NOT_FOUND\u003c/code\u003e) if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 1201,col 9)-(line 1201,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastIndexOf(java.lang.String, java.lang.String, int)",
      "begin_line": 1232,
      "end_line": 1237,
      "comment": "\n     * \u003cp\u003eFinds the first index within a String, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#lastIndexOf(String, int)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A negative start position returns \u003ccode\u003e-1\u003c/code\u003e.\n     * An empty (\"\") search String always matches unless the start position is negative.\n     * A start position greater than the string length searches the whole string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOf(null, *, *)          \u003d -1\n     * StringUtils.lastIndexOf(*, null, *)          \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"a\", 8)  \u003d 7\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\", 8)  \u003d 5\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"ab\", 8) \u003d 4\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\", 9)  \u003d 5\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\", -1) \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"a\", 0)  \u003d 0\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\", 0)  \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStr  the String to find, may be null\n     * @param startPos  the start position, negative treated as zero\n     * @return the first index of the search String,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1233,col 9)-(line 1235,col 9)",
        "(line 1236,col 9)-(line 1236,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 1261,
      "end_line": 1266,
      "comment": "\n     * \u003cp\u003eCase in-sensitive find of the last index within a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A negative start position returns \u003ccode\u003e-1\u003c/code\u003e.\n     * An empty (\"\") search String always matches unless the start position is negative.\n     * A start position greater than the string length searches the whole string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOfIgnoreCase(null, *)          \u003d -1\n     * StringUtils.lastIndexOfIgnoreCase(*, null)          \u003d -1\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"A\")  \u003d 7\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"B\")  \u003d 5\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"AB\") \u003d 4\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStr  the String to find, may be null\n     * @return the first index of the search String,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 1262,col 9)-(line 1264,col 9)",
        "(line 1265,col 9)-(line 1265,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(java.lang.String, java.lang.String, int)",
      "begin_line": 1296,
      "end_line": 1316,
      "comment": "\n     * \u003cp\u003eCase in-sensitive find of the last index within a String\n     * from the specified position.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A negative start position returns \u003ccode\u003e-1\u003c/code\u003e.\n     * An empty (\"\") search String always matches unless the start position is negative.\n     * A start position greater than the string length searches the whole string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOfIgnoreCase(null, *, *)          \u003d -1\n     * StringUtils.lastIndexOfIgnoreCase(*, null, *)          \u003d -1\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"A\", 8)  \u003d 7\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"B\", 8)  \u003d 5\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"AB\", 8) \u003d 4\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"B\", 9)  \u003d 5\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"B\", -1) \u003d -1\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"A\", 0)  \u003d 0\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"B\", 0)  \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStr  the String to find, may be null\n     * @param startPos  the start position\n     * @return the first index of the search String,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 1297,col 9)-(line 1299,col 9)",
        "(line 1300,col 9)-(line 1302,col 9)",
        "(line 1303,col 9)-(line 1305,col 9)",
        "(line 1306,col 9)-(line 1308,col 9)",
        "(line 1310,col 9)-(line 1314,col 9)",
        "(line 1315,col 9)-(line 1315,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.contains(java.lang.String, int)",
      "begin_line": 1339,
      "end_line": 1344,
      "comment": "\n     * \u003cp\u003eChecks if String contains a search character, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#indexOf(int)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e or empty (\"\") String will return \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.contains(null, *)    \u003d false\n     * StringUtils.contains(\"\", *)      \u003d false\n     * StringUtils.contains(\"abc\", \u0027a\u0027) \u003d true\n     * StringUtils.contains(\"abc\", \u0027z\u0027) \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChar  the character to find\n     * @return true if the String contains the search character,\n     *  false if not or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1340,col 9)-(line 1342,col 9)",
        "(line 1343,col 9)-(line 1343,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.contains(java.lang.String, java.lang.String)",
      "begin_line": 1367,
      "end_line": 1372,
      "comment": "\n     * \u003cp\u003eChecks if String contains a search String, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#indexOf(String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.contains(null, *)     \u003d false\n     * StringUtils.contains(*, null)     \u003d false\n     * StringUtils.contains(\"\", \"\")      \u003d true\n     * StringUtils.contains(\"abc\", \"\")   \u003d true\n     * StringUtils.contains(\"abc\", \"a\")  \u003d true\n     * StringUtils.contains(\"abc\", \"z\")  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStr  the String to find, may be null\n     * @return true if the String contains the search String,\n     *  false if not or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1368,col 9)-(line 1370,col 9)",
        "(line 1371,col 9)-(line 1371,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 1397,
      "end_line": 1409,
      "comment": "\n     * \u003cp\u003eChecks if String contains a search String irrespective of case,\n     * handling \u003ccode\u003enull\u003c/code\u003e. Case-insensitivity is defined as by\n     * {@link String#equalsIgnoreCase(String)}.\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.contains(null, *) \u003d false\n     * StringUtils.contains(*, null) \u003d false\n     * StringUtils.contains(\"\", \"\") \u003d true\n     * StringUtils.contains(\"abc\", \"\") \u003d true\n     * StringUtils.contains(\"abc\", \"a\") \u003d true\n     * StringUtils.contains(\"abc\", \"z\") \u003d false\n     * StringUtils.contains(\"abc\", \"A\") \u003d true\n     * StringUtils.contains(\"abc\", \"Z\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStr  the String to find, may be null\n     * @return true if the String contains the search String irrespective of\n     * case or false if not or \u003ccode\u003enull\u003c/code\u003e string input\n     ",
      "child_ranges": [
        "(line 1398,col 9)-(line 1400,col 9)",
        "(line 1401,col 9)-(line 1401,col 37)",
        "(line 1402,col 9)-(line 1402,col 37)",
        "(line 1403,col 9)-(line 1407,col 9)",
        "(line 1408,col 9)-(line 1408,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsWhitespace(java.lang.String)",
      "begin_line": 1420,
      "end_line": 1431,
      "comment": " From org.springframework.util.StringUtils, under Apache License 2.0",
      "child_ranges": [
        "(line 1421,col 9)-(line 1423,col 9)",
        "(line 1424,col 9)-(line 1424,col 34)",
        "(line 1425,col 9)-(line 1429,col 9)",
        "(line 1430,col 9)-(line 1430,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfAny(java.lang.CharSequence, char[])",
      "begin_line": 1458,
      "end_line": 1482,
      "comment": "\n     * \u003cp\u003eSearch a CharSequence to find the first index of any\n     * character in the given set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e or zero length search array will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAny(null, *)                \u003d -1\n     * StringUtils.indexOfAny(\"\", *)                  \u003d -1\n     * StringUtils.indexOfAny(*, null)                \u003d -1\n     * StringUtils.indexOfAny(*, [])                  \u003d -1\n     * StringUtils.indexOfAny(\"zzabyycdxx\",[\u0027z\u0027,\u0027a\u0027]) \u003d 0\n     * StringUtils.indexOfAny(\"zzabyycdxx\",[\u0027b\u0027,\u0027y\u0027]) \u003d 3\n     * StringUtils.indexOfAny(\"aba\", [\u0027z\u0027])           \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the index of any of the chars, -1 if no match or null input\n     * @since 2.0\n     * @since 3.0 Changed signature from indexOfAny(String, char[]) to indexOfAny(CharSequence, char[])\n     ",
      "child_ranges": [
        "(line 1459,col 9)-(line 1461,col 9)",
        "(line 1462,col 9)-(line 1462,col 32)",
        "(line 1463,col 9)-(line 1463,col 31)",
        "(line 1464,col 9)-(line 1464,col 43)",
        "(line 1465,col 9)-(line 1465,col 39)",
        "(line 1466,col 9)-(line 1480,col 9)",
        "(line 1481,col 9)-(line 1481,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfAny(java.lang.CharSequence, java.lang.String)",
      "begin_line": 1507,
      "end_line": 1512,
      "comment": "\n     * \u003cp\u003eSearch a CharSequence to find the first index of any\n     * character in the given set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e search string will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAny(null, *)            \u003d -1\n     * StringUtils.indexOfAny(\"\", *)              \u003d -1\n     * StringUtils.indexOfAny(*, null)            \u003d -1\n     * StringUtils.indexOfAny(*, \"\")              \u003d -1\n     * StringUtils.indexOfAny(\"zzabyycdxx\", \"za\") \u003d 0\n     * StringUtils.indexOfAny(\"zzabyycdxx\", \"by\") \u003d 3\n     * StringUtils.indexOfAny(\"aba\",\"z\")          \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the index of any of the chars, -1 if no match or null input\n     * @since 2.0\n     * @since 3.0 Changed signature from indexOfAny(String, String) to indexOfAny(CharSequence, String)\n     ",
      "child_ranges": [
        "(line 1508,col 9)-(line 1510,col 9)",
        "(line 1511,col 9)-(line 1511,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsAny(java.lang.String, char[])",
      "begin_line": 1539,
      "end_line": 1567,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains any character in the given\n     * set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e CharSequence will return \u003ccode\u003efalse\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e or zero length search array will return \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsAny(null, *)                \u003d false\n     * StringUtils.containsAny(\"\", *)                  \u003d false\n     * StringUtils.containsAny(*, null)                \u003d false\n     * StringUtils.containsAny(*, [])                  \u003d false\n     * StringUtils.containsAny(\"zzabyycdxx\",[\u0027z\u0027,\u0027a\u0027]) \u003d true\n     * StringUtils.containsAny(\"zzabyycdxx\",[\u0027b\u0027,\u0027y\u0027]) \u003d true\n     * StringUtils.containsAny(\"aba\", [\u0027z\u0027])           \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the \u003ccode\u003etrue\u003c/code\u003e if any of the chars are found,\n     * \u003ccode\u003efalse\u003c/code\u003e if no match or null input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1540,col 9)-(line 1542,col 9)",
        "(line 1543,col 9)-(line 1543,col 35)",
        "(line 1544,col 9)-(line 1544,col 46)",
        "(line 1545,col 9)-(line 1545,col 34)",
        "(line 1546,col 9)-(line 1546,col 42)",
        "(line 1547,col 9)-(line 1565,col 9)",
        "(line 1566,col 9)-(line 1566,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsAny(java.lang.String, java.lang.String)",
      "begin_line": 1596,
      "end_line": 1601,
      "comment": "\n     * \u003cp\u003e\n     * Checks if the CharSequence contains any character in the given set of characters.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e CharSequence will return \u003ccode\u003efalse\u003c/code\u003e. A \u003ccode\u003enull\u003c/code\u003e search CharSequence will return\n     * \u003ccode\u003efalse\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsAny(null, *)            \u003d false\n     * StringUtils.containsAny(\"\", *)              \u003d false\n     * StringUtils.containsAny(*, null)            \u003d false\n     * StringUtils.containsAny(*, \"\")              \u003d false\n     * StringUtils.containsAny(\"zzabyycdxx\", \"za\") \u003d true\n     * StringUtils.containsAny(\"zzabyycdxx\", \"by\") \u003d true\n     * StringUtils.containsAny(\"aba\",\"z\")          \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs\n     *            the CharSequence to check, may be null\n     * @param searchChars\n     *            the chars to search for, may be null\n     * @return the \u003ccode\u003etrue\u003c/code\u003e if any of the chars are found, \u003ccode\u003efalse\u003c/code\u003e if no match or null input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1597,col 9)-(line 1599,col 9)",
        "(line 1600,col 9)-(line 1600,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfAnyBut(java.lang.CharSequence, char[])",
      "begin_line": 1629,
      "end_line": 1654,
      "comment": "\n     * \u003cp\u003eSearches a CharSequence to find the first index of any\n     * character not in the given set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e CharSequence will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e or zero length search array will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAnyBut(null, *)                              \u003d -1\n     * StringUtils.indexOfAnyBut(\"\", *)                                \u003d -1\n     * StringUtils.indexOfAnyBut(*, null)                              \u003d -1\n     * StringUtils.indexOfAnyBut(*, [])                                \u003d -1\n     * StringUtils.indexOfAnyBut(\"zzabyycdxx\", new char[] {\u0027z\u0027, \u0027a\u0027} ) \u003d 3\n     * StringUtils.indexOfAnyBut(\"aba\", new char[] {\u0027z\u0027} )             \u003d 0\n     * StringUtils.indexOfAnyBut(\"aba\", new char[] {\u0027a\u0027, \u0027b\u0027} )        \u003d -1\n\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the index of any of the chars, -1 if no match or null input\n     * @since 2.0\n     * @since 3.0 Changed signature from indexOfAnyBut(String, char[]) to indexOfAnyBut(CharSequence, char[])\n     ",
      "child_ranges": [
        "(line 1630,col 9)-(line 1632,col 9)",
        "(line 1633,col 9)-(line 1633,col 32)",
        "(line 1634,col 9)-(line 1634,col 31)",
        "(line 1635,col 9)-(line 1635,col 43)",
        "(line 1636,col 9)-(line 1636,col 39)",
        "(line 1637,col 9)-(line 1652,col 9)",
        "(line 1653,col 9)-(line 1653,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfAnyBut(java.lang.String, java.lang.String)",
      "begin_line": 1678,
      "end_line": 1698,
      "comment": "\n     * \u003cp\u003eSearch a String to find the first index of any\n     * character not in the given set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e or empty search string will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAnyBut(null, *)            \u003d -1\n     * StringUtils.indexOfAnyBut(\"\", *)              \u003d -1\n     * StringUtils.indexOfAnyBut(*, null)            \u003d -1\n     * StringUtils.indexOfAnyBut(*, \"\")              \u003d -1\n     * StringUtils.indexOfAnyBut(\"zzabyycdxx\", \"za\") \u003d 3\n     * StringUtils.indexOfAnyBut(\"zzabyycdxx\", \"\")   \u003d -1\n     * StringUtils.indexOfAnyBut(\"aba\",\"ab\")         \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the index of any of the chars, -1 if no match or null input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1679,col 9)-(line 1681,col 9)",
        "(line 1682,col 9)-(line 1682,col 34)",
        "(line 1683,col 9)-(line 1696,col 9)",
        "(line 1697,col 9)-(line 1697,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsOnly(java.lang.CharSequence, char[])",
      "begin_line": 1724,
      "end_line": 1736,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only certain characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e CharSequence will return \u003ccode\u003efalse\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e valid character array will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty CharSequence (length()\u003d0) always returns \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsOnly(null, *)       \u003d false\n     * StringUtils.containsOnly(*, null)       \u003d false\n     * StringUtils.containsOnly(\"\", *)         \u003d true\n     * StringUtils.containsOnly(\"ab\", \u0027\u0027)      \u003d false\n     * StringUtils.containsOnly(\"abab\", \u0027abc\u0027) \u003d true\n     * StringUtils.containsOnly(\"ab1\", \u0027abc\u0027)  \u003d false\n     * StringUtils.containsOnly(\"abz\", \u0027abc\u0027)  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the String to check, may be null\n     * @param valid  an array of valid chars, may be null\n     * @return true if it only contains valid chars and is non-null\n     * @since 3.0 Changed signature from containsOnly(String, char[]) to containsOnly(CharSequence, char[])\n     ",
      "child_ranges": [
        "(line 1726,col 9)-(line 1728,col 9)",
        "(line 1729,col 9)-(line 1731,col 9)",
        "(line 1732,col 9)-(line 1734,col 9)",
        "(line 1735,col 9)-(line 1735,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsOnly(java.lang.CharSequence, java.lang.String)",
      "begin_line": 1761,
      "end_line": 1766,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only certain characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e CharSequence will return \u003ccode\u003efalse\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e valid character String will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty String (length()\u003d0) always returns \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsOnly(null, *)       \u003d false\n     * StringUtils.containsOnly(*, null)       \u003d false\n     * StringUtils.containsOnly(\"\", *)         \u003d true\n     * StringUtils.containsOnly(\"ab\", \"\")      \u003d false\n     * StringUtils.containsOnly(\"abab\", \"abc\") \u003d true\n     * StringUtils.containsOnly(\"ab1\", \"abc\")  \u003d false\n     * StringUtils.containsOnly(\"abz\", \"abc\")  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @param validChars  a String of valid chars, may be null\n     * @return true if it only contains valid chars and is non-null\n     * @since 2.0\n     * @since 3.0 Changed signature from containsOnly(String, String) to containsOnly(CharSequence, String)\n     ",
      "child_ranges": [
        "(line 1762,col 9)-(line 1764,col 9)",
        "(line 1765,col 9)-(line 1765,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsNone(java.lang.CharSequence, char[])",
      "begin_line": 1793,
      "end_line": 1821,
      "comment": "\n     * \u003cp\u003eChecks that the CharSequence does not contain certain characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e CharSequence will return \u003ccode\u003etrue\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e invalid character array will return \u003ccode\u003etrue\u003c/code\u003e.\n     * An empty CharSequence (length()\u003d0) always returns true.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsNone(null, *)       \u003d true\n     * StringUtils.containsNone(*, null)       \u003d true\n     * StringUtils.containsNone(\"\", *)         \u003d true\n     * StringUtils.containsNone(\"ab\", \u0027\u0027)      \u003d true\n     * StringUtils.containsNone(\"abab\", \u0027xyz\u0027) \u003d true\n     * StringUtils.containsNone(\"ab1\", \u0027xyz\u0027)  \u003d true\n     * StringUtils.containsNone(\"abz\", \u0027xyz\u0027)  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @param searchChars  an array of invalid chars, may be null\n     * @return true if it contains none of the invalid chars, or is null\n     * @since 2.0\n     * @since 3.0 Changed signature from containsNone(String, char[]) to containsNone(CharSequence, char[])\n     ",
      "child_ranges": [
        "(line 1794,col 9)-(line 1796,col 9)",
        "(line 1797,col 9)-(line 1797,col 32)",
        "(line 1798,col 9)-(line 1798,col 31)",
        "(line 1799,col 9)-(line 1799,col 43)",
        "(line 1800,col 9)-(line 1800,col 39)",
        "(line 1801,col 9)-(line 1819,col 9)",
        "(line 1820,col 9)-(line 1820,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsNone(java.lang.CharSequence, java.lang.String)",
      "begin_line": 1846,
      "end_line": 1851,
      "comment": "\n     * \u003cp\u003eChecks that the CharSequence does not contain certain characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e CharSequence will return \u003ccode\u003etrue\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e invalid character array will return \u003ccode\u003etrue\u003c/code\u003e.\n     * An empty String (\"\") always returns true.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsNone(null, *)       \u003d true\n     * StringUtils.containsNone(*, null)       \u003d true\n     * StringUtils.containsNone(\"\", *)         \u003d true\n     * StringUtils.containsNone(\"ab\", \"\")      \u003d true\n     * StringUtils.containsNone(\"abab\", \"xyz\") \u003d true\n     * StringUtils.containsNone(\"ab1\", \"xyz\")  \u003d true\n     * StringUtils.containsNone(\"abz\", \"xyz\")  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @param invalidChars  a String of invalid chars, may be null\n     * @return true if it contains none of the invalid chars, or is null\n     * @since 2.0\n     * @since 3.0 Changed signature from containsNone(String, String) to containsNone(CharSequence, String)\n     ",
      "child_ranges": [
        "(line 1847,col 9)-(line 1849,col 9)",
        "(line 1850,col 9)-(line 1850,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfAny(java.lang.String, java.lang.String[])",
      "begin_line": 1881,
      "end_line": 1907,
      "comment": "\n     * \u003cp\u003eFind the first index of any of a set of potential substrings.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e or zero length search array will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e search array entry will be ignored, but a search\n     * array containing \"\" will return \u003ccode\u003e0\u003c/code\u003e if \u003ccode\u003estr\u003c/code\u003e is not\n     * null. This method uses {@link String#indexOf(String)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAny(null, *)                     \u003d -1\n     * StringUtils.indexOfAny(*, null)                     \u003d -1\n     * StringUtils.indexOfAny(*, [])                       \u003d -1\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"ab\",\"cd\"])   \u003d 2\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"cd\",\"ab\"])   \u003d 2\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"mn\",\"op\"])   \u003d -1\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"zab\",\"aby\"]) \u003d 1\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"\"])          \u003d 0\n     * StringUtils.indexOfAny(\"\", [\"\"])                    \u003d 0\n     * StringUtils.indexOfAny(\"\", [\"a\"])                   \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStrs  the Strings to search for, may be null\n     * @return the first index of any of the searchStrs in str, -1 if no match\n     ",
      "child_ranges": [
        "(line 1882,col 9)-(line 1884,col 9)",
        "(line 1885,col 9)-(line 1885,col 35)",
        "(line 1888,col 9)-(line 1888,col 36)",
        "(line 1890,col 9)-(line 1890,col 20)",
        "(line 1891,col 9)-(line 1904,col 9)",
        "(line 1906,col 9)-(line 1906,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastIndexOfAny(java.lang.String, java.lang.String[])",
      "begin_line": 1934,
      "end_line": 1952,
      "comment": "\n     * \u003cp\u003eFind the latest index of any of a set of potential substrings.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e search array will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e or zero length search array entry will be ignored,\n     * but a search array containing \"\" will return the length of \u003ccode\u003estr\u003c/code\u003e\n     * if \u003ccode\u003estr\u003c/code\u003e is not null. This method uses {@link String#indexOf(String)}\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOfAny(null, *)                   \u003d -1\n     * StringUtils.lastIndexOfAny(*, null)                   \u003d -1\n     * StringUtils.lastIndexOfAny(*, [])                     \u003d -1\n     * StringUtils.lastIndexOfAny(*, [null])                 \u003d -1\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"ab\",\"cd\"]) \u003d 6\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"cd\",\"ab\"]) \u003d 6\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"mn\",\"op\"]) \u003d -1\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"mn\",\"op\"]) \u003d -1\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"mn\",\"\"])   \u003d 10\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStrs  the Strings to search for, may be null\n     * @return the last index of any of the Strings, -1 if no match\n     ",
      "child_ranges": [
        "(line 1935,col 9)-(line 1937,col 9)",
        "(line 1938,col 9)-(line 1938,col 35)",
        "(line 1939,col 9)-(line 1939,col 34)",
        "(line 1940,col 9)-(line 1940,col 20)",
        "(line 1941,col 9)-(line 1950,col 9)",
        "(line 1951,col 9)-(line 1951,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substring(java.lang.String, int)",
      "begin_line": 1980,
      "end_line": 1998,
      "comment": "\n     * \u003cp\u003eGets a substring from the specified String avoiding exceptions.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative start position can be used to start \u003ccode\u003en\u003c/code\u003e\n     * characters from the end of the String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") String will return \"\".\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substring(null, *)   \u003d null\n     * StringUtils.substring(\"\", *)     \u003d \"\"\n     * StringUtils.substring(\"abc\", 0)  \u003d \"abc\"\n     * StringUtils.substring(\"abc\", 2)  \u003d \"c\"\n     * StringUtils.substring(\"abc\", 4)  \u003d \"\"\n     * StringUtils.substring(\"abc\", -2) \u003d \"bc\"\n     * StringUtils.substring(\"abc\", -4) \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the substring from, may be null\n     * @param start  the position to start from, negative means\n     *  count back from the end of the String by this many characters\n     * @return substring from start position, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 1981,col 9)-(line 1983,col 9)",
        "(line 1986,col 9)-(line 1988,col 9)",
        "(line 1990,col 9)-(line 1992,col 9)",
        "(line 1993,col 9)-(line 1995,col 9)",
        "(line 1997,col 9)-(line 1997,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substring(java.lang.String, int, int)",
      "begin_line": 2035,
      "end_line": 2066,
      "comment": "\n     * \u003cp\u003eGets a substring from the specified String avoiding exceptions.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative start position can be used to start/end \u003ccode\u003en\u003c/code\u003e\n     * characters from the end of the String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe returned substring starts with the character in the \u003ccode\u003estart\u003c/code\u003e\n     * position and ends before the \u003ccode\u003eend\u003c/code\u003e position. All position counting is\n     * zero-based -- i.e., to start at the beginning of the string use\n     * \u003ccode\u003estart \u003d 0\u003c/code\u003e. Negative start and end positions can be used to\n     * specify offsets relative to the end of the String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf \u003ccode\u003estart\u003c/code\u003e is not strictly to the left of \u003ccode\u003eend\u003c/code\u003e, \"\"\n     * is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substring(null, *, *)    \u003d null\n     * StringUtils.substring(\"\", * ,  *)    \u003d \"\";\n     * StringUtils.substring(\"abc\", 0, 2)   \u003d \"ab\"\n     * StringUtils.substring(\"abc\", 2, 0)   \u003d \"\"\n     * StringUtils.substring(\"abc\", 2, 4)   \u003d \"c\"\n     * StringUtils.substring(\"abc\", 4, 6)   \u003d \"\"\n     * StringUtils.substring(\"abc\", 2, 2)   \u003d \"\"\n     * StringUtils.substring(\"abc\", -2, -1) \u003d \"b\"\n     * StringUtils.substring(\"abc\", -4, 2)  \u003d \"ab\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the substring from, may be null\n     * @param start  the position to start from, negative means\n     *  count back from the end of the String by this many characters\n     * @param end  the position to end at (exclusive), negative means\n     *  count back from the end of the String by this many characters\n     * @return substring from start position to end positon,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 2036,col 9)-(line 2038,col 9)",
        "(line 2041,col 9)-(line 2043,col 9)",
        "(line 2044,col 9)-(line 2046,col 9)",
        "(line 2049,col 9)-(line 2051,col 9)",
        "(line 2054,col 9)-(line 2056,col 9)",
        "(line 2058,col 9)-(line 2060,col 9)",
        "(line 2061,col 9)-(line 2063,col 9)",
        "(line 2065,col 9)-(line 2065,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.left(java.lang.String, int)",
      "begin_line": 2090,
      "end_line": 2101,
      "comment": "\n     * \u003cp\u003eGets the leftmost \u003ccode\u003elen\u003c/code\u003e characters of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf \u003ccode\u003elen\u003c/code\u003e characters are not available, or the\n     * String is \u003ccode\u003enull\u003c/code\u003e, the String will be returned without\n     * an exception. An empty String is returned if len is negative.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.left(null, *)    \u003d null\n     * StringUtils.left(*, -ve)     \u003d \"\"\n     * StringUtils.left(\"\", *)      \u003d \"\"\n     * StringUtils.left(\"abc\", 0)   \u003d \"\"\n     * StringUtils.left(\"abc\", 2)   \u003d \"ab\"\n     * StringUtils.left(\"abc\", 4)   \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the leftmost characters from, may be null\n     * @param len  the length of the required String\n     * @return the leftmost characters, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 2091,col 9)-(line 2093,col 9)",
        "(line 2094,col 9)-(line 2096,col 9)",
        "(line 2097,col 9)-(line 2099,col 9)",
        "(line 2100,col 9)-(line 2100,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.right(java.lang.String, int)",
      "begin_line": 2123,
      "end_line": 2134,
      "comment": "\n     * \u003cp\u003eGets the rightmost \u003ccode\u003elen\u003c/code\u003e characters of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf \u003ccode\u003elen\u003c/code\u003e characters are not available, or the String\n     * is \u003ccode\u003enull\u003c/code\u003e, the String will be returned without an\n     * an exception. An empty String is returned if len is negative.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.right(null, *)    \u003d null\n     * StringUtils.right(*, -ve)     \u003d \"\"\n     * StringUtils.right(\"\", *)      \u003d \"\"\n     * StringUtils.right(\"abc\", 0)   \u003d \"\"\n     * StringUtils.right(\"abc\", 2)   \u003d \"bc\"\n     * StringUtils.right(\"abc\", 4)   \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the rightmost characters from, may be null\n     * @param len  the length of the required String\n     * @return the rightmost characters, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 2124,col 9)-(line 2126,col 9)",
        "(line 2127,col 9)-(line 2129,col 9)",
        "(line 2130,col 9)-(line 2132,col 9)",
        "(line 2133,col 9)-(line 2133,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.mid(java.lang.String, int, int)",
      "begin_line": 2161,
      "end_line": 2175,
      "comment": "\n     * \u003cp\u003eGets \u003ccode\u003elen\u003c/code\u003e characters from the middle of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf \u003ccode\u003elen\u003c/code\u003e characters are not available, the remainder\n     * of the String will be returned without an exception. If the\n     * String is \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e will be returned.\n     * An empty String is returned if len is negative or exceeds the\n     * length of \u003ccode\u003estr\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.mid(null, *, *)    \u003d null\n     * StringUtils.mid(*, *, -ve)     \u003d \"\"\n     * StringUtils.mid(\"\", 0, *)      \u003d \"\"\n     * StringUtils.mid(\"abc\", 0, 2)   \u003d \"ab\"\n     * StringUtils.mid(\"abc\", 0, 4)   \u003d \"abc\"\n     * StringUtils.mid(\"abc\", 2, 4)   \u003d \"c\"\n     * StringUtils.mid(\"abc\", 4, 2)   \u003d \"\"\n     * StringUtils.mid(\"abc\", -2, 2)  \u003d \"ab\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the characters from, may be null\n     * @param pos  the position to start from, negative treated as zero\n     * @param len  the length of the required String\n     * @return the middle characters, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 2162,col 9)-(line 2164,col 9)",
        "(line 2165,col 9)-(line 2167,col 9)",
        "(line 2168,col 9)-(line 2170,col 9)",
        "(line 2171,col 9)-(line 2173,col 9)",
        "(line 2174,col 9)-(line 2174,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringBefore(java.lang.String, java.lang.String)",
      "begin_line": 2206,
      "end_line": 2218,
      "comment": "\n     * \u003cp\u003eGets the substring before the first occurrence of a separator.\n     * The separator is not returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") string input will return the empty string.\n     * A \u003ccode\u003enull\u003c/code\u003e separator will return the input string.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf nothing is found, the string input is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringBefore(null, *)      \u003d null\n     * StringUtils.substringBefore(\"\", *)        \u003d \"\"\n     * StringUtils.substringBefore(\"abc\", \"a\")   \u003d \"\"\n     * StringUtils.substringBefore(\"abcba\", \"b\") \u003d \"a\"\n     * StringUtils.substringBefore(\"abc\", \"c\")   \u003d \"ab\"\n     * StringUtils.substringBefore(\"abc\", \"d\")   \u003d \"abc\"\n     * StringUtils.substringBefore(\"abc\", \"\")    \u003d \"\"\n     * StringUtils.substringBefore(\"abc\", null)  \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get a substring from, may be null\n     * @param separator  the String to search for, may be null\n     * @return the substring before the first occurrence of the separator,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2207,col 9)-(line 2209,col 9)",
        "(line 2210,col 9)-(line 2212,col 9)",
        "(line 2213,col 9)-(line 2213,col 41)",
        "(line 2214,col 9)-(line 2216,col 9)",
        "(line 2217,col 9)-(line 2217,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringAfter(java.lang.String, java.lang.String)",
      "begin_line": 2248,
      "end_line": 2260,
      "comment": "\n     * \u003cp\u003eGets the substring after the first occurrence of a separator.\n     * The separator is not returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") string input will return the empty string.\n     * A \u003ccode\u003enull\u003c/code\u003e separator will return the empty string if the\n     * input string is not \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf nothing is found, the empty string is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringAfter(null, *)      \u003d null\n     * StringUtils.substringAfter(\"\", *)        \u003d \"\"\n     * StringUtils.substringAfter(*, null)      \u003d \"\"\n     * StringUtils.substringAfter(\"abc\", \"a\")   \u003d \"bc\"\n     * StringUtils.substringAfter(\"abcba\", \"b\") \u003d \"cba\"\n     * StringUtils.substringAfter(\"abc\", \"c\")   \u003d \"\"\n     * StringUtils.substringAfter(\"abc\", \"d\")   \u003d \"\"\n     * StringUtils.substringAfter(\"abc\", \"\")    \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get a substring from, may be null\n     * @param separator  the String to search for, may be null\n     * @return the substring after the first occurrence of the separator,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2249,col 9)-(line 2251,col 9)",
        "(line 2252,col 9)-(line 2254,col 9)",
        "(line 2255,col 9)-(line 2255,col 41)",
        "(line 2256,col 9)-(line 2258,col 9)",
        "(line 2259,col 9)-(line 2259,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringBeforeLast(java.lang.String, java.lang.String)",
      "begin_line": 2289,
      "end_line": 2298,
      "comment": "\n     * \u003cp\u003eGets the substring before the last occurrence of a separator.\n     * The separator is not returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") string input will return the empty string.\n     * An empty or \u003ccode\u003enull\u003c/code\u003e separator will return the input string.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf nothing is found, the string input is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringBeforeLast(null, *)      \u003d null\n     * StringUtils.substringBeforeLast(\"\", *)        \u003d \"\"\n     * StringUtils.substringBeforeLast(\"abcba\", \"b\") \u003d \"abc\"\n     * StringUtils.substringBeforeLast(\"abc\", \"c\")   \u003d \"ab\"\n     * StringUtils.substringBeforeLast(\"a\", \"a\")     \u003d \"\"\n     * StringUtils.substringBeforeLast(\"a\", \"z\")     \u003d \"a\"\n     * StringUtils.substringBeforeLast(\"a\", null)    \u003d \"a\"\n     * StringUtils.substringBeforeLast(\"a\", \"\")      \u003d \"a\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get a substring from, may be null\n     * @param separator  the String to search for, may be null\n     * @return the substring before the last occurrence of the separator,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2290,col 9)-(line 2292,col 9)",
        "(line 2293,col 9)-(line 2293,col 45)",
        "(line 2294,col 9)-(line 2296,col 9)",
        "(line 2297,col 9)-(line 2297,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringAfterLast(java.lang.String, java.lang.String)",
      "begin_line": 2329,
      "end_line": 2341,
      "comment": "\n     * \u003cp\u003eGets the substring after the last occurrence of a separator.\n     * The separator is not returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") string input will return the empty string.\n     * An empty or \u003ccode\u003enull\u003c/code\u003e separator will return the empty string if\n     * the input string is not \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf nothing is found, the empty string is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringAfterLast(null, *)      \u003d null\n     * StringUtils.substringAfterLast(\"\", *)        \u003d \"\"\n     * StringUtils.substringAfterLast(*, \"\")        \u003d \"\"\n     * StringUtils.substringAfterLast(*, null)      \u003d \"\"\n     * StringUtils.substringAfterLast(\"abc\", \"a\")   \u003d \"bc\"\n     * StringUtils.substringAfterLast(\"abcba\", \"b\") \u003d \"a\"\n     * StringUtils.substringAfterLast(\"abc\", \"c\")   \u003d \"\"\n     * StringUtils.substringAfterLast(\"a\", \"a\")     \u003d \"\"\n     * StringUtils.substringAfterLast(\"a\", \"z\")     \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get a substring from, may be null\n     * @param separator  the String to search for, may be null\n     * @return the substring after the last occurrence of the separator,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2330,col 9)-(line 2332,col 9)",
        "(line 2333,col 9)-(line 2335,col 9)",
        "(line 2336,col 9)-(line 2336,col 45)",
        "(line 2337,col 9)-(line 2339,col 9)",
        "(line 2340,col 9)-(line 2340,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringBetween(java.lang.String, java.lang.String)",
      "begin_line": 2366,
      "end_line": 2368,
      "comment": "\n     * \u003cp\u003eGets the String that is nested in between two instances of the\n     * same String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e tag returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringBetween(null, *)            \u003d null\n     * StringUtils.substringBetween(\"\", \"\")             \u003d \"\"\n     * StringUtils.substringBetween(\"\", \"tag\")          \u003d null\n     * StringUtils.substringBetween(\"tagabctag\", null)  \u003d null\n     * StringUtils.substringBetween(\"tagabctag\", \"\")    \u003d \"\"\n     * StringUtils.substringBetween(\"tagabctag\", \"tag\") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String containing the substring, may be null\n     * @param tag  the String before and after the substring, may be null\n     * @return the substring, \u003ccode\u003enull\u003c/code\u003e if no match\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2367,col 9)-(line 2367,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringBetween(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 2397,
      "end_line": 2409,
      "comment": "\n     * \u003cp\u003eGets the String that is nested in between two Strings.\n     * Only the first match is returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e open/close returns \u003ccode\u003enull\u003c/code\u003e (no match).\n     * An empty (\"\") open and close returns an empty string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringBetween(\"wx[b]yz\", \"[\", \"]\") \u003d \"b\"\n     * StringUtils.substringBetween(null, *, *)          \u003d null\n     * StringUtils.substringBetween(*, null, *)          \u003d null\n     * StringUtils.substringBetween(*, *, null)          \u003d null\n     * StringUtils.substringBetween(\"\", \"\", \"\")          \u003d \"\"\n     * StringUtils.substringBetween(\"\", \"\", \"]\")         \u003d null\n     * StringUtils.substringBetween(\"\", \"[\", \"]\")        \u003d null\n     * StringUtils.substringBetween(\"yabcz\", \"\", \"\")     \u003d \"\"\n     * StringUtils.substringBetween(\"yabcz\", \"y\", \"z\")   \u003d \"abc\"\n     * StringUtils.substringBetween(\"yabczyabcz\", \"y\", \"z\")   \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String containing the substring, may be null\n     * @param open  the String before the substring, may be null\n     * @param close  the String after the substring, may be null\n     * @return the substring, \u003ccode\u003enull\u003c/code\u003e if no match\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2398,col 9)-(line 2400,col 9)",
        "(line 2401,col 9)-(line 2401,col 38)",
        "(line 2402,col 9)-(line 2407,col 9)",
        "(line 2408,col 9)-(line 2408,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringsBetween(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 2433,
      "end_line": 2462,
      "comment": "\n     * \u003cp\u003eSearches a String for substrings delimited by a start and end tag,\n     * returning all matching substrings in an array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e open/close returns \u003ccode\u003enull\u003c/code\u003e (no match).\n     * An empty (\"\") open/close returns \u003ccode\u003enull\u003c/code\u003e (no match).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringsBetween(\"[a][b][c]\", \"[\", \"]\") \u003d [\"a\",\"b\",\"c\"]\n     * StringUtils.substringsBetween(null, *, *)            \u003d null\n     * StringUtils.substringsBetween(*, null, *)            \u003d null\n     * StringUtils.substringsBetween(*, *, null)            \u003d null\n     * StringUtils.substringsBetween(\"\", \"[\", \"]\")          \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param str  the String containing the substrings, null returns null, empty returns empty\n     * @param open  the String identifying the start of the substring, empty returns null\n     * @param close  the String identifying the end of the substring, empty returns null\n     * @return a String Array of substrings, or \u003ccode\u003enull\u003c/code\u003e if no match\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 2434,col 9)-(line 2436,col 9)",
        "(line 2437,col 9)-(line 2437,col 34)",
        "(line 2438,col 9)-(line 2440,col 9)",
        "(line 2441,col 9)-(line 2441,col 38)",
        "(line 2442,col 9)-(line 2442,col 36)",
        "(line 2443,col 9)-(line 2443,col 52)",
        "(line 2444,col 9)-(line 2444,col 20)",
        "(line 2445,col 9)-(line 2457,col 9)",
        "(line 2458,col 9)-(line 2460,col 9)",
        "(line 2461,col 9)-(line 2461,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.split(java.lang.String)",
      "begin_line": 2491,
      "end_line": 2493,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, using whitespace as the\n     * separator.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as one separator.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.split(null)       \u003d null\n     * StringUtils.split(\"\")         \u003d []\n     * StringUtils.split(\"abc def\")  \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\"abc  def\") \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\" abc \")    \u003d [\"abc\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 2492,col 9)-(line 2492,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.split(java.lang.String, char)",
      "begin_line": 2519,
      "end_line": 2521,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator specified.\n     * This is an alternative to using StringTokenizer.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as one separator.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.split(null, *)         \u003d null\n     * StringUtils.split(\"\", *)           \u003d []\n     * StringUtils.split(\"a.b.c\", \u0027.\u0027)    \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.split(\"a..b.c\", \u0027.\u0027)   \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.split(\"a:b:c\", \u0027.\u0027)    \u003d [\"a:b:c\"]\n     * StringUtils.split(\"a b c\", \u0027 \u0027)    \u003d [\"a\", \"b\", \"c\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separatorChar  the character used as the delimiter\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2520,col 9)-(line 2520,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.split(java.lang.String, java.lang.String)",
      "begin_line": 2548,
      "end_line": 2550,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separators specified.\n     * This is an alternative to using StringTokenizer.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as one separator.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e separatorChars splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.split(null, *)         \u003d null\n     * StringUtils.split(\"\", *)           \u003d []\n     * StringUtils.split(\"abc def\", null) \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\"abc def\", \" \")  \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\"abc  def\", \" \") \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\"ab:cd:ef\", \":\") \u003d [\"ab\", \"cd\", \"ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separatorChars  the characters used as the delimiters,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 2549,col 9)-(line 2549,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.split(java.lang.String, java.lang.String, int)",
      "begin_line": 2582,
      "end_line": 2584,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array with a maximum length,\n     * separators specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as one separator.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e separatorChars splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf more than \u003ccode\u003emax\u003c/code\u003e delimited substrings are found, the last\n     * returned string includes all characters after the first \u003ccode\u003emax - 1\u003c/code\u003e\n     * returned strings (including separator characters).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.split(null, *, *)            \u003d null\n     * StringUtils.split(\"\", *, *)              \u003d []\n     * StringUtils.split(\"ab de fg\", null, 0)   \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.split(\"ab   de fg\", null, 0) \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.split(\"ab:cd:ef\", \":\", 0)    \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.split(\"ab:cd:ef\", \":\", 2)    \u003d [\"ab\", \"cd:ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separatorChars  the characters used as the delimiters,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @param max  the maximum number of elements to include in the\n     *  array. A zero or negative value implies no limit\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 2583,col 9)-(line 2583,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByWholeSeparator(java.lang.String, java.lang.String)",
      "begin_line": 2609,
      "end_line": 2611,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator string specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator(s) will not be included in the returned String array.\n     * Adjacent separators are treated as one separator.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e separator splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitByWholeSeparator(null, *)               \u003d null\n     * StringUtils.splitByWholeSeparator(\"\", *)                 \u003d []\n     * StringUtils.splitByWholeSeparator(\"ab de fg\", null)      \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparator(\"ab   de fg\", null)    \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparator(\"ab:cd:ef\", \":\")       \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitByWholeSeparator(\"ab-!-cd-!-ef\", \"-!-\") \u003d [\"ab\", \"cd\", \"ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separator  String containing the String to be used as a delimiter,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String was input\n     ",
      "child_ranges": [
        "(line 2610,col 9)-(line 2610,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByWholeSeparator(java.lang.String, java.lang.String, int)",
      "begin_line": 2640,
      "end_line": 2642,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator string specified.\n     * Returns a maximum of \u003ccode\u003emax\u003c/code\u003e substrings.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator(s) will not be included in the returned String array.\n     * Adjacent separators are treated as one separator.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e separator splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitByWholeSeparator(null, *, *)               \u003d null\n     * StringUtils.splitByWholeSeparator(\"\", *, *)                 \u003d []\n     * StringUtils.splitByWholeSeparator(\"ab de fg\", null, 0)      \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparator(\"ab   de fg\", null, 0)    \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparator(\"ab:cd:ef\", \":\", 2)       \u003d [\"ab\", \"cd:ef\"]\n     * StringUtils.splitByWholeSeparator(\"ab-!-cd-!-ef\", \"-!-\", 5) \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitByWholeSeparator(\"ab-!-cd-!-ef\", \"-!-\", 2) \u003d [\"ab\", \"cd-!-ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separator  String containing the String to be used as a delimiter,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @param max  the maximum number of elements to include in the returned\n     *  array. A zero or negative value implies no limit.\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String was input\n     ",
      "child_ranges": [
        "(line 2641,col 9)-(line 2641,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(java.lang.String, java.lang.String)",
      "begin_line": 2669,
      "end_line": 2671,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator string specified. \u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e separator splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(null, *)               \u003d null\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"\", *)                 \u003d []\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab de fg\", null)      \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab   de fg\", null)    \u003d [\"ab\", \"\", \"\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab:cd:ef\", \":\")       \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab-!-cd-!-ef\", \"-!-\") \u003d [\"ab\", \"cd\", \"ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separator  String containing the String to be used as a delimiter,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String was input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 2670,col 9)-(line 2670,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(java.lang.String, java.lang.String, int)",
      "begin_line": 2702,
      "end_line": 2704,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator string specified.\n     * Returns a maximum of \u003ccode\u003emax\u003c/code\u003e substrings.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e separator splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(null, *, *)               \u003d null\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"\", *, *)                 \u003d []\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab de fg\", null, 0)      \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab   de fg\", null, 0)    \u003d [\"ab\", \"\", \"\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab:cd:ef\", \":\", 2)       \u003d [\"ab\", \"cd:ef\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab-!-cd-!-ef\", \"-!-\", 5) \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab-!-cd-!-ef\", \"-!-\", 2) \u003d [\"ab\", \"cd-!-ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separator  String containing the String to be used as a delimiter,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @param max  the maximum number of elements to include in the returned\n     *  array. A zero or negative value implies no limit.\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String was input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 2703,col 9)-(line 2703,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByWholeSeparatorWorker(java.lang.String, java.lang.String, int, boolean)",
      "begin_line": 2720,
      "end_line": 2785,
      "comment": "\n     * Performs the logic for the \u003ccode\u003esplitByWholeSeparatorPreserveAllTokens\u003c/code\u003e methods.\n     *\n     * @param str  the String to parse, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param separator  String containing the String to be used as a delimiter,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @param max  the maximum number of elements to include in the returned\n     *  array. A zero or negative value implies no limit.\n     * @param preserveAllTokens if \u003ccode\u003etrue\u003c/code\u003e, adjacent separators are\n     * treated as empty token separators; if \u003ccode\u003efalse\u003c/code\u003e, adjacent\n     * separators are treated as one separator.\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 2723,col 9)-(line 2725,col 9)",
        "(line 2727,col 9)-(line 2727,col 31)",
        "(line 2729,col 9)-(line 2731,col 9)",
        "(line 2733,col 9)-(line 2736,col 9)",
        "(line 2738,col 9)-(line 2738,col 49)",
        "(line 2740,col 9)-(line 2740,col 63)",
        "(line 2741,col 9)-(line 2741,col 35)",
        "(line 2742,col 9)-(line 2742,col 20)",
        "(line 2743,col 9)-(line 2743,col 20)",
        "(line 2744,col 9)-(line 2782,col 9)",
        "(line 2784,col 9)-(line 2784,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(java.lang.String)",
      "begin_line": 2812,
      "end_line": 2814,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, using whitespace as the\n     * separator, preserving all tokens, including empty tokens created by\n     * adjacent separators. This is an alternative to using StringTokenizer.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitPreserveAllTokens(null)       \u003d null\n     * StringUtils.splitPreserveAllTokens(\"\")         \u003d []\n     * StringUtils.splitPreserveAllTokens(\"abc def\")  \u003d [\"abc\", \"def\"]\n     * StringUtils.splitPreserveAllTokens(\"abc  def\") \u003d [\"abc\", \"\", \"def\"]\n     * StringUtils.splitPreserveAllTokens(\" abc \")    \u003d [\"\", \"abc\", \"\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2813,col 9)-(line 2813,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(java.lang.String, char)",
      "begin_line": 2848,
      "end_line": 2850,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator specified,\n     * preserving all tokens, including empty tokens created by adjacent\n     * separators. This is an alternative to using StringTokenizer.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitPreserveAllTokens(null, *)         \u003d null\n     * StringUtils.splitPreserveAllTokens(\"\", *)           \u003d []\n     * StringUtils.splitPreserveAllTokens(\"a.b.c\", \u0027.\u0027)    \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"a..b.c\", \u0027.\u0027)   \u003d [\"a\", \"\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"a:b:c\", \u0027.\u0027)    \u003d [\"a:b:c\"]\n     * StringUtils.splitPreserveAllTokens(\"a\\tb\\nc\", null) \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"a b c\", \u0027 \u0027)    \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"a b c \", \u0027 \u0027)   \u003d [\"a\", \"b\", \"c\", \"\"]\n     * StringUtils.splitPreserveAllTokens(\"a b c  \", \u0027 \u0027)   \u003d [\"a\", \"b\", \"c\", \"\", \"\"]\n     * StringUtils.splitPreserveAllTokens(\" a b c\", \u0027 \u0027)   \u003d [\"\", a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"  a b c\", \u0027 \u0027)  \u003d [\"\", \"\", a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\" a b c \", \u0027 \u0027)  \u003d [\"\", a\", \"b\", \"c\", \"\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param separatorChar  the character used as the delimiter,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2849,col 9)-(line 2849,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitWorker(java.lang.String, char, boolean)",
      "begin_line": 2864,
      "end_line": 2896,
      "comment": "\n     * Performs the logic for the \u003ccode\u003esplit\u003c/code\u003e and\n     * \u003ccode\u003esplitPreserveAllTokens\u003c/code\u003e methods that do not return a\n     * maximum array length.\n     *\n     * @param str  the String to parse, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param separatorChar the separate character\n     * @param preserveAllTokens if \u003ccode\u003etrue\u003c/code\u003e, adjacent separators are\n     * treated as empty token separators; if \u003ccode\u003efalse\u003c/code\u003e, adjacent\n     * separators are treated as one separator.\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 2867,col 9)-(line 2869,col 9)",
        "(line 2870,col 9)-(line 2870,col 31)",
        "(line 2871,col 9)-(line 2873,col 9)",
        "(line 2874,col 9)-(line 2874,col 52)",
        "(line 2875,col 9)-(line 2875,col 29)",
        "(line 2876,col 9)-(line 2876,col 30)",
        "(line 2877,col 9)-(line 2877,col 34)",
        "(line 2878,col 9)-(line 2891,col 9)",
        "(line 2892,col 9)-(line 2894,col 9)",
        "(line 2895,col 9)-(line 2895,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(java.lang.String, java.lang.String)",
      "begin_line": 2931,
      "end_line": 2933,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separators specified,\n     * preserving all tokens, including empty tokens created by adjacent\n     * separators. This is an alternative to using StringTokenizer.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e separatorChars splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitPreserveAllTokens(null, *)           \u003d null\n     * StringUtils.splitPreserveAllTokens(\"\", *)             \u003d []\n     * StringUtils.splitPreserveAllTokens(\"abc def\", null)   \u003d [\"abc\", \"def\"]\n     * StringUtils.splitPreserveAllTokens(\"abc def\", \" \")    \u003d [\"abc\", \"def\"]\n     * StringUtils.splitPreserveAllTokens(\"abc  def\", \" \")   \u003d [\"abc\", \"\", def\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef\", \":\")   \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef:\", \":\")  \u003d [\"ab\", \"cd\", \"ef\", \"\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef::\", \":\") \u003d [\"ab\", \"cd\", \"ef\", \"\", \"\"]\n     * StringUtils.splitPreserveAllTokens(\"ab::cd:ef\", \":\")  \u003d [\"ab\", \"\", cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\":cd:ef\", \":\")     \u003d [\"\", cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"::cd:ef\", \":\")    \u003d [\"\", \"\", cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\":cd:ef:\", \":\")    \u003d [\"\", cd\", \"ef\", \"\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param separatorChars  the characters used as the delimiters,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2932,col 9)-(line 2932,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(java.lang.String, java.lang.String, int)",
      "begin_line": 2971,
      "end_line": 2973,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array with a maximum length,\n     * separators specified, preserving all tokens, including empty tokens\n     * created by adjacent separators.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * Adjacent separators are treated as one separator.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e separatorChars splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf more than \u003ccode\u003emax\u003c/code\u003e delimited substrings are found, the last\n     * returned string includes all characters after the first \u003ccode\u003emax - 1\u003c/code\u003e\n     * returned strings (including separator characters).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitPreserveAllTokens(null, *, *)            \u003d null\n     * StringUtils.splitPreserveAllTokens(\"\", *, *)              \u003d []\n     * StringUtils.splitPreserveAllTokens(\"ab de fg\", null, 0)   \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab   de fg\", null, 0) \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef\", \":\", 0)    \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef\", \":\", 2)    \u003d [\"ab\", \"cd:ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab   de fg\", null, 2) \u003d [\"ab\", \"  de fg\"]\n     * StringUtils.splitPreserveAllTokens(\"ab   de fg\", null, 3) \u003d [\"ab\", \"\", \" de fg\"]\n     * StringUtils.splitPreserveAllTokens(\"ab   de fg\", null, 4) \u003d [\"ab\", \"\", \"\", \"de fg\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param separatorChars  the characters used as the delimiters,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @param max  the maximum number of elements to include in the\n     *  array. A zero or negative value implies no limit\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2972,col 9)-(line 2972,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitWorker(java.lang.String, java.lang.String, int, boolean)",
      "begin_line": 2989,
      "end_line": 3072,
      "comment": "\n     * Performs the logic for the \u003ccode\u003esplit\u003c/code\u003e and\n     * \u003ccode\u003esplitPreserveAllTokens\u003c/code\u003e methods that return a maximum array\n     * length.\n     *\n     * @param str  the String to parse, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param separatorChars the separate character\n     * @param max  the maximum number of elements to include in the\n     *  array. A zero or negative value implies no limit.\n     * @param preserveAllTokens if \u003ccode\u003etrue\u003c/code\u003e, adjacent separators are\n     * treated as empty token separators; if \u003ccode\u003efalse\u003c/code\u003e, adjacent\n     * separators are treated as one separator.\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 2994,col 9)-(line 2996,col 9)",
        "(line 2997,col 9)-(line 2997,col 31)",
        "(line 2998,col 9)-(line 3000,col 9)",
        "(line 3001,col 9)-(line 3001,col 52)",
        "(line 3002,col 9)-(line 3002,col 26)",
        "(line 3003,col 9)-(line 3003,col 29)",
        "(line 3004,col 9)-(line 3004,col 30)",
        "(line 3005,col 9)-(line 3005,col 34)",
        "(line 3006,col 9)-(line 3067,col 9)",
        "(line 3068,col 9)-(line 3070,col 9)",
        "(line 3071,col 9)-(line 3071,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByCharacterType(java.lang.String)",
      "begin_line": 3093,
      "end_line": 3095,
      "comment": "\n     * \u003cp\u003eSplits a String by Character type as returned by\n     * \u003ccode\u003ejava.lang.Character.getType(char)\u003c/code\u003e. Groups of contiguous\n     * characters of the same type are returned as complete tokens.\n     * \u003cpre\u003e\n     * StringUtils.splitByCharacterType(null)         \u003d null\n     * StringUtils.splitByCharacterType(\"\")           \u003d []\n     * StringUtils.splitByCharacterType(\"ab de fg\")   \u003d [\"ab\", \" \", \"de\", \" \", \"fg\"]\n     * StringUtils.splitByCharacterType(\"ab   de fg\") \u003d [\"ab\", \"   \", \"de\", \" \", \"fg\"]\n     * StringUtils.splitByCharacterType(\"ab:cd:ef\")   \u003d [\"ab\", \":\", \"cd\", \":\", \"ef\"]\n     * StringUtils.splitByCharacterType(\"number5\")    \u003d [\"number\", \"5\"]\n     * StringUtils.splitByCharacterType(\"fooBar\")     \u003d [\"foo\", \"B\", \"ar\"]\n     * StringUtils.splitByCharacterType(\"foo200Bar\")  \u003d [\"foo\", \"200\", \"B\", \"ar\"]\n     * StringUtils.splitByCharacterType(\"ASFRules\")   \u003d [\"ASFR\", \"ules\"]\n     * \u003c/pre\u003e\n     * @param str the String to split, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3094,col 9)-(line 3094,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase(java.lang.String)",
      "begin_line": 3121,
      "end_line": 3123,
      "comment": "\n     * \u003cp\u003eSplits a String by Character type as returned by\n     * \u003ccode\u003ejava.lang.Character.getType(char)\u003c/code\u003e. Groups of contiguous\n     * characters of the same type are returned as complete tokens, with the\n     * following exception: the character of type\n     * \u003ccode\u003eCharacter.UPPERCASE_LETTER\u003c/code\u003e, if any, immediately\n     * preceding a token of type \u003ccode\u003eCharacter.LOWERCASE_LETTER\u003c/code\u003e\n     * will belong to the following token rather than to the preceding, if any,\n     * \u003ccode\u003eCharacter.UPPERCASE_LETTER\u003c/code\u003e token.\n     * \u003cpre\u003e\n     * StringUtils.splitByCharacterTypeCamelCase(null)         \u003d null\n     * StringUtils.splitByCharacterTypeCamelCase(\"\")           \u003d []\n     * StringUtils.splitByCharacterTypeCamelCase(\"ab de fg\")   \u003d [\"ab\", \" \", \"de\", \" \", \"fg\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"ab   de fg\") \u003d [\"ab\", \"   \", \"de\", \" \", \"fg\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"ab:cd:ef\")   \u003d [\"ab\", \":\", \"cd\", \":\", \"ef\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"number5\")    \u003d [\"number\", \"5\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"fooBar\")     \u003d [\"foo\", \"Bar\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"foo200Bar\")  \u003d [\"foo\", \"200\", \"Bar\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"ASFRules\")   \u003d [\"ASF\", \"Rules\"]\n     * \u003c/pre\u003e\n     * @param str the String to split, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3122,col 9)-(line 3122,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByCharacterType(java.lang.String, boolean)",
      "begin_line": 3139,
      "end_line": 3169,
      "comment": "\n     * \u003cp\u003eSplits a String by Character type as returned by\n     * \u003ccode\u003ejava.lang.Character.getType(char)\u003c/code\u003e. Groups of contiguous\n     * characters of the same type are returned as complete tokens, with the\n     * following exception: if \u003ccode\u003ecamelCase\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e,\n     * the character of type \u003ccode\u003eCharacter.UPPERCASE_LETTER\u003c/code\u003e, if any,\n     * immediately preceding a token of type \u003ccode\u003eCharacter.LOWERCASE_LETTER\u003c/code\u003e\n     * will belong to the following token rather than to the preceding, if any,\n     * \u003ccode\u003eCharacter.UPPERCASE_LETTER\u003c/code\u003e token.\n     * @param str the String to split, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param camelCase whether to use so-called \"camel-case\" for letter types\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3140,col 9)-(line 3142,col 9)",
        "(line 3143,col 9)-(line 3145,col 9)",
        "(line 3146,col 9)-(line 3146,col 37)",
        "(line 3147,col 9)-(line 3147,col 52)",
        "(line 3148,col 9)-(line 3148,col 27)",
        "(line 3149,col 9)-(line 3149,col 59)",
        "(line 3150,col 9)-(line 3166,col 9)",
        "(line 3167,col 9)-(line 3167,col 67)",
        "(line 3168,col 9)-(line 3168,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.concat(java.lang.Object...)",
      "begin_line": 3189,
      "end_line": 3191,
      "comment": "\n     * \u003cp\u003eJoins the provided elements into a single String. \u003c/p\u003e\n     *\n     * \u003cp\u003eNo separator is added to the joined String.\n     * Null objects or empty string elements are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.concat(\"a\", \"b\", \"c\") \u003d \"abc\"\n     * StringUtils.concat(null, \"\", \"a\") \u003d \"a\"\n     * \u003c/pre\u003e\n     *\n     * @param elements  the values to join together\n     * @return the concatenated String\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 3190,col 9)-(line 3190,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.concatWith(java.lang.String, java.lang.Object...)",
      "begin_line": 3211,
      "end_line": 3213,
      "comment": "\n     * \u003cp\u003eJoins the provided elements into a single String, with the specified \n     * separator between each element. \u003c/p\u003e\n     *\n     * \u003cp\u003eNo separator is added before or after the joined String.\n     * Null objects or empty string elements are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.concatWith(\".\", \"a\", \"b\", \"c\") \u003d \"a.b.c\"\n     * StringUtils.concatWith(\"\", null, \"\", \"a\") \u003d \"a\"\n     * \u003c/pre\u003e\n     *\n     * @param separator the value to put between elements\n     * @param elements  the values to join together\n     * @return the concatenated String\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 3212,col 9)-(line 3212,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.lang.Object[])",
      "begin_line": 3235,
      "end_line": 3237,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo separator is added to the joined String.\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null)            \u003d null\n     * StringUtils.join([])              \u003d \"\"\n     * StringUtils.join([null])          \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"]) \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"]) \u003d \"a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to join together, may be null\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 3236,col 9)-(line 3236,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.lang.Object[], char)",
      "begin_line": 3261,
      "end_line": 3267,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null, *)               \u003d null\n     * StringUtils.join([], *)                 \u003d \"\"\n     * StringUtils.join([null], *)             \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \u0027;\u0027)  \u003d \"a;b;c\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], null) \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"], \u0027;\u0027)  \u003d \";;a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to join together, may be null\n     * @param separator  the separator character to use\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 3262,col 9)-(line 3264,col 9)",
        "(line 3266,col 9)-(line 3266,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.lang.Object[], char, int, int)",
      "begin_line": 3295,
      "end_line": 3316,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null, *)               \u003d null\n     * StringUtils.join([], *)                 \u003d \"\"\n     * StringUtils.join([null], *)             \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \u0027;\u0027)  \u003d \"a;b;c\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], null) \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"], \u0027;\u0027)  \u003d \";;a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to join together, may be null\n     * @param separator  the separator character to use\n     * @param startIndex the first index to start joining from.  It is\n     * an error to pass in an end index past the end of the array\n     * @param endIndex the index to stop joining from (exclusive). It is\n     * an error to pass in an end index past the end of the array\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 3296,col 9)-(line 3298,col 9)",
        "(line 3299,col 9)-(line 3299,col 46)",
        "(line 3300,col 9)-(line 3302,col 9)",
        "(line 3304,col 9)-(line 3304,col 98)",
        "(line 3305,col 9)-(line 3305,col 55)",
        "(line 3307,col 9)-(line 3314,col 9)",
        "(line 3315,col 9)-(line 3315,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.lang.Object[], java.lang.String)",
      "begin_line": 3342,
      "end_line": 3347,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * A \u003ccode\u003enull\u003c/code\u003e separator is the same as an empty String (\"\").\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null, *)                \u003d null\n     * StringUtils.join([], *)                  \u003d \"\"\n     * StringUtils.join([null], *)              \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \"--\")  \u003d \"a--b--c\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], null)  \u003d \"abc\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \"\")    \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"], \u0027,\u0027)   \u003d \",,a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to join together, may be null\n     * @param separator  the separator character to use, null treated as \"\"\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 3343,col 9)-(line 3345,col 9)",
        "(line 3346,col 9)-(line 3346,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.lang.Object[], java.lang.String, int, int)",
      "begin_line": 3376,
      "end_line": 3405,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * A \u003ccode\u003enull\u003c/code\u003e separator is the same as an empty String (\"\").\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null, *)                \u003d null\n     * StringUtils.join([], *)                  \u003d \"\"\n     * StringUtils.join([null], *)              \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \"--\")  \u003d \"a--b--c\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], null)  \u003d \"abc\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \"\")    \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"], \u0027,\u0027)   \u003d \",,a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to join together, may be null\n     * @param separator  the separator character to use, null treated as \"\"\n     * @param startIndex the first index to start joining from.  It is\n     * an error to pass in an end index past the end of the array\n     * @param endIndex the index to stop joining from (exclusive). It is\n     * an error to pass in an end index past the end of the array\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 3377,col 9)-(line 3379,col 9)",
        "(line 3380,col 9)-(line 3382,col 9)",
        "(line 3386,col 9)-(line 3386,col 46)",
        "(line 3387,col 9)-(line 3389,col 9)",
        "(line 3391,col 9)-(line 3392,col 46)",
        "(line 3394,col 9)-(line 3394,col 55)",
        "(line 3396,col 9)-(line 3403,col 9)",
        "(line 3404,col 9)-(line 3404,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.util.Iterator\u003c?\u003e, char)",
      "begin_line": 3421,
      "end_line": 3450,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided \u003ccode\u003eIterator\u003c/code\u003e into\n     * a single String containing the provided elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list. Null objects or empty\n     * strings within the iteration are represented by empty strings.\u003c/p\u003e\n     *\n     * \u003cp\u003eSee the examples here: {@link #join(Object[],char)}. \u003c/p\u003e\n     *\n     * @param iterator  the \u003ccode\u003eIterator\u003c/code\u003e of values to join together, may be null\n     * @param separator  the separator character to use\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null iterator input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 3424,col 9)-(line 3426,col 9)",
        "(line 3427,col 9)-(line 3429,col 9)",
        "(line 3430,col 9)-(line 3430,col 39)",
        "(line 3431,col 9)-(line 3433,col 9)",
        "(line 3436,col 9)-(line 3436,col 51)",
        "(line 3437,col 9)-(line 3439,col 9)",
        "(line 3441,col 9)-(line 3447,col 9)",
        "(line 3449,col 9)-(line 3449,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.util.Iterator\u003c?\u003e, java.lang.String)",
      "begin_line": 3465,
      "end_line": 3495,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided \u003ccode\u003eIterator\u003c/code\u003e into\n     * a single String containing the provided elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * A \u003ccode\u003enull\u003c/code\u003e separator is the same as an empty String (\"\").\u003c/p\u003e\n     *\n     * \u003cp\u003eSee the examples here: {@link #join(Object[],String)}. \u003c/p\u003e\n     *\n     * @param iterator  the \u003ccode\u003eIterator\u003c/code\u003e of values to join together, may be null\n     * @param separator  the separator character to use, null treated as \"\"\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null iterator input\n     ",
      "child_ranges": [
        "(line 3468,col 9)-(line 3470,col 9)",
        "(line 3471,col 9)-(line 3473,col 9)",
        "(line 3474,col 9)-(line 3474,col 39)",
        "(line 3475,col 9)-(line 3477,col 9)",
        "(line 3480,col 9)-(line 3480,col 51)",
        "(line 3481,col 9)-(line 3483,col 9)",
        "(line 3485,col 9)-(line 3493,col 9)",
        "(line 3494,col 9)-(line 3494,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.lang.Iterable\u003c?\u003e, char)",
      "begin_line": 3511,
      "end_line": 3516,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided \u003ccode\u003eIterable\u003c/code\u003e into\n     * a single String containing the provided elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list. Null objects or empty\n     * strings within the iteration are represented by empty strings.\u003c/p\u003e\n     *\n     * \u003cp\u003eSee the examples here: {@link #join(Object[],char)}. \u003c/p\u003e\n     *\n     * @param iterable  the \u003ccode\u003eIterable\u003c/code\u003e providing the values to join together, may be null\n     * @param separator  the separator character to use\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null iterator input\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 3512,col 9)-(line 3514,col 9)",
        "(line 3515,col 9)-(line 3515,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.lang.Iterable\u003c?\u003e, java.lang.String)",
      "begin_line": 3532,
      "end_line": 3537,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided \u003ccode\u003eIterable\u003c/code\u003e into\n     * a single String containing the provided elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * A \u003ccode\u003enull\u003c/code\u003e separator is the same as an empty String (\"\").\u003c/p\u003e\n     *\n     * \u003cp\u003eSee the examples here: {@link #join(Object[],String)}. \u003c/p\u003e\n     *\n     * @param iterable  the \u003ccode\u003eIterable\u003c/code\u003e providing the values to join together, may be null\n     * @param separator  the separator character to use, null treated as \"\"\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null iterator input\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 3533,col 9)-(line 3535,col 9)",
        "(line 3536,col 9)-(line 3536,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.deleteWhitespace(java.lang.String)",
      "begin_line": 3555,
      "end_line": 3571,
      "comment": "\n     * \u003cp\u003eDeletes all whitespaces from a String as defined by\n     * {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.deleteWhitespace(null)         \u003d null\n     * StringUtils.deleteWhitespace(\"\")           \u003d \"\"\n     * StringUtils.deleteWhitespace(\"abc\")        \u003d \"abc\"\n     * StringUtils.deleteWhitespace(\"   ab  c  \") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to delete whitespace from, may be null\n     * @return the String without whitespaces, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 3556,col 9)-(line 3558,col 9)",
        "(line 3559,col 9)-(line 3559,col 30)",
        "(line 3560,col 9)-(line 3560,col 34)",
        "(line 3561,col 9)-(line 3561,col 22)",
        "(line 3562,col 9)-(line 3566,col 9)",
        "(line 3567,col 9)-(line 3569,col 9)",
        "(line 3570,col 9)-(line 3570,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.removeStart(java.lang.String, java.lang.String)",
      "begin_line": 3599,
      "end_line": 3607,
      "comment": "\n     * \u003cp\u003eRemoves a substring only if it is at the begining of a source string,\n     * otherwise returns the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e source string will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") source string will return the empty string.\n     * A \u003ccode\u003enull\u003c/code\u003e search string will return the source string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.removeStart(null, *)      \u003d null\n     * StringUtils.removeStart(\"\", *)        \u003d \"\"\n     * StringUtils.removeStart(*, null)      \u003d *\n     * StringUtils.removeStart(\"www.domain.com\", \"www.\")   \u003d \"domain.com\"\n     * StringUtils.removeStart(\"domain.com\", \"www.\")       \u003d \"domain.com\"\n     * StringUtils.removeStart(\"www.domain.com\", \"domain\") \u003d \"www.domain.com\"\n     * StringUtils.removeStart(\"abc\", \"\")    \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the String to search for and remove, may be null\n     * @return the substring with the string removed if found,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3600,col 9)-(line 3602,col 9)",
        "(line 3603,col 9)-(line 3605,col 9)",
        "(line 3606,col 9)-(line 3606,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.removeStartIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 3634,
      "end_line": 3642,
      "comment": "\n     * \u003cp\u003eCase insensitive removal of a substring if it is at the begining of a source string,\n     * otherwise returns the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e source string will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") source string will return the empty string.\n     * A \u003ccode\u003enull\u003c/code\u003e search string will return the source string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.removeStartIgnoreCase(null, *)      \u003d null\n     * StringUtils.removeStartIgnoreCase(\"\", *)        \u003d \"\"\n     * StringUtils.removeStartIgnoreCase(*, null)      \u003d *\n     * StringUtils.removeStartIgnoreCase(\"www.domain.com\", \"www.\")   \u003d \"domain.com\"\n     * StringUtils.removeStartIgnoreCase(\"www.domain.com\", \"WWW.\")   \u003d \"domain.com\"\n     * StringUtils.removeStartIgnoreCase(\"domain.com\", \"www.\")       \u003d \"domain.com\"\n     * StringUtils.removeStartIgnoreCase(\"www.domain.com\", \"domain\") \u003d \"www.domain.com\"\n     * StringUtils.removeStartIgnoreCase(\"abc\", \"\")    \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the String to search for (case insensitive) and remove, may be null\n     * @return the substring with the string removed if found,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3635,col 9)-(line 3637,col 9)",
        "(line 3638,col 9)-(line 3640,col 9)",
        "(line 3641,col 9)-(line 3641,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.removeEnd(java.lang.String, java.lang.String)",
      "begin_line": 3668,
      "end_line": 3676,
      "comment": "\n     * \u003cp\u003eRemoves a substring only if it is at the end of a source string,\n     * otherwise returns the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e source string will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") source string will return the empty string.\n     * A \u003ccode\u003enull\u003c/code\u003e search string will return the source string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.removeEnd(null, *)      \u003d null\n     * StringUtils.removeEnd(\"\", *)        \u003d \"\"\n     * StringUtils.removeEnd(*, null)      \u003d *\n     * StringUtils.removeEnd(\"www.domain.com\", \".com.\")  \u003d \"www.domain.com\"\n     * StringUtils.removeEnd(\"www.domain.com\", \".com\")   \u003d \"www.domain\"\n     * StringUtils.removeEnd(\"www.domain.com\", \"domain\") \u003d \"www.domain.com\"\n     * StringUtils.removeEnd(\"abc\", \"\")    \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the String to search for and remove, may be null\n     * @return the substring with the string removed if found,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3669,col 9)-(line 3671,col 9)",
        "(line 3672,col 9)-(line 3674,col 9)",
        "(line 3675,col 9)-(line 3675,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.removeEndIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 3704,
      "end_line": 3712,
      "comment": "\n     * \u003cp\u003eCase insensitive removal of a substring if it is at the end of a source string,\n     * otherwise returns the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e source string will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") source string will return the empty string.\n     * A \u003ccode\u003enull\u003c/code\u003e search string will return the source string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.removeEndIgnoreCase(null, *)      \u003d null\n     * StringUtils.removeEndIgnoreCase(\"\", *)        \u003d \"\"\n     * StringUtils.removeEndIgnoreCase(*, null)      \u003d *\n     * StringUtils.removeEndIgnoreCase(\"www.domain.com\", \".com.\")  \u003d \"www.domain.com\"\n     * StringUtils.removeEndIgnoreCase(\"www.domain.com\", \".com\")   \u003d \"www.domain\"\n     * StringUtils.removeEndIgnoreCase(\"www.domain.com\", \"domain\") \u003d \"www.domain.com\"\n     * StringUtils.removeEndIgnoreCase(\"abc\", \"\")    \u003d \"abc\"\n     * StringUtils.removeEndIgnoreCase(\"www.domain.com\", \".COM\") \u003d \"www.domain\")\n     * StringUtils.removeEndIgnoreCase(\"www.domain.COM\", \".com\") \u003d \"www.domain\")\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the String to search for (case insensitive) and remove, may be null\n     * @return the substring with the string removed if found,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3705,col 9)-(line 3707,col 9)",
        "(line 3708,col 9)-(line 3710,col 9)",
        "(line 3711,col 9)-(line 3711,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.remove(java.lang.String, java.lang.String)",
      "begin_line": 3737,
      "end_line": 3742,
      "comment": "\n     * \u003cp\u003eRemoves all occurrences of a substring from within the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e source string will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") source string will return the empty string.\n     * A \u003ccode\u003enull\u003c/code\u003e remove string will return the source string.\n     * An empty (\"\") remove string will return the source string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.remove(null, *)        \u003d null\n     * StringUtils.remove(\"\", *)          \u003d \"\"\n     * StringUtils.remove(*, null)        \u003d *\n     * StringUtils.remove(*, \"\")          \u003d *\n     * StringUtils.remove(\"queued\", \"ue\") \u003d \"qd\"\n     * StringUtils.remove(\"queued\", \"zz\") \u003d \"queued\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the String to search for and remove, may be null\n     * @return the substring with the string removed if found,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3738,col 9)-(line 3740,col 9)",
        "(line 3741,col 9)-(line 3741,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.remove(java.lang.String, char)",
      "begin_line": 3763,
      "end_line": 3775,
      "comment": "\n     * \u003cp\u003eRemoves all occurrences of a character from within the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e source string will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") source string will return the empty string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.remove(null, *)       \u003d null\n     * StringUtils.remove(\"\", *)         \u003d \"\"\n     * StringUtils.remove(\"queued\", \u0027u\u0027) \u003d \"qeed\"\n     * StringUtils.remove(\"queued\", \u0027z\u0027) \u003d \"queued\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the char to search for and remove, may be null\n     * @return the substring with the char removed if found,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3764,col 9)-(line 3766,col 9)",
        "(line 3767,col 9)-(line 3767,col 41)",
        "(line 3768,col 9)-(line 3768,col 20)",
        "(line 3769,col 9)-(line 3773,col 9)",
        "(line 3774,col 9)-(line 3774,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replaceOnce(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 3802,
      "end_line": 3804,
      "comment": "\n     * \u003cp\u003eReplaces a String with another String inside a larger String, once.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e reference passed to this method is a no-op.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replaceOnce(null, *, *)        \u003d null\n     * StringUtils.replaceOnce(\"\", *, *)          \u003d \"\"\n     * StringUtils.replaceOnce(\"any\", null, *)    \u003d \"any\"\n     * StringUtils.replaceOnce(\"any\", *, null)    \u003d \"any\"\n     * StringUtils.replaceOnce(\"any\", \"\", *)      \u003d \"any\"\n     * StringUtils.replaceOnce(\"aba\", \"a\", null)  \u003d \"aba\"\n     * StringUtils.replaceOnce(\"aba\", \"a\", \"\")    \u003d \"ba\"\n     * StringUtils.replaceOnce(\"aba\", \"a\", \"z\")   \u003d \"zba\"\n     * \u003c/pre\u003e\n     *\n     * @see #replace(String text, String searchString, String replacement, int max)\n     * @param text  text to search and replace in, may be null\n     * @param searchString  the String to search for, may be null\n     * @param replacement  the String to replace with, may be null\n     * @return the text with any replacements processed,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 3803,col 9)-(line 3803,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replace(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 3829,
      "end_line": 3831,
      "comment": "\n     * \u003cp\u003eReplaces all occurrences of a String within another String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e reference passed to this method is a no-op.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replace(null, *, *)        \u003d null\n     * StringUtils.replace(\"\", *, *)          \u003d \"\"\n     * StringUtils.replace(\"any\", null, *)    \u003d \"any\"\n     * StringUtils.replace(\"any\", *, null)    \u003d \"any\"\n     * StringUtils.replace(\"any\", \"\", *)      \u003d \"any\"\n     * StringUtils.replace(\"aba\", \"a\", null)  \u003d \"aba\"\n     * StringUtils.replace(\"aba\", \"a\", \"\")    \u003d \"b\"\n     * StringUtils.replace(\"aba\", \"a\", \"z\")   \u003d \"zbz\"\n     * \u003c/pre\u003e\n     *\n     * @see #replace(String text, String searchString, String replacement, int max)\n     * @param text  text to search and replace in, may be null\n     * @param searchString  the String to search for, may be null\n     * @param replacement  the String to replace it with, may be null\n     * @return the text with any replacements processed,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 3830,col 9)-(line 3830,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replace(java.lang.String, java.lang.String, java.lang.String, int)",
      "begin_line": 3861,
      "end_line": 3885,
      "comment": "\n     * \u003cp\u003eReplaces a String with another String inside a larger String,\n     * for the first \u003ccode\u003emax\u003c/code\u003e values of the search String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e reference passed to this method is a no-op.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replace(null, *, *, *)         \u003d null\n     * StringUtils.replace(\"\", *, *, *)           \u003d \"\"\n     * StringUtils.replace(\"any\", null, *, *)     \u003d \"any\"\n     * StringUtils.replace(\"any\", *, null, *)     \u003d \"any\"\n     * StringUtils.replace(\"any\", \"\", *, *)       \u003d \"any\"\n     * StringUtils.replace(\"any\", *, *, 0)        \u003d \"any\"\n     * StringUtils.replace(\"abaa\", \"a\", null, -1) \u003d \"abaa\"\n     * StringUtils.replace(\"abaa\", \"a\", \"\", -1)   \u003d \"b\"\n     * StringUtils.replace(\"abaa\", \"a\", \"z\", 0)   \u003d \"abaa\"\n     * StringUtils.replace(\"abaa\", \"a\", \"z\", 1)   \u003d \"zbaa\"\n     * StringUtils.replace(\"abaa\", \"a\", \"z\", 2)   \u003d \"zbza\"\n     * StringUtils.replace(\"abaa\", \"a\", \"z\", -1)  \u003d \"zbzz\"\n     * \u003c/pre\u003e\n     *\n     * @param text  text to search and replace in, may be null\n     * @param searchString  the String to search for, may be null\n     * @param replacement  the String to replace it with, may be null\n     * @param max  maximum number of values to replace, or \u003ccode\u003e-1\u003c/code\u003e if no maximum\n     * @return the text with any replacements processed,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 3862,col 9)-(line 3864,col 9)",
        "(line 3865,col 9)-(line 3865,col 22)",
        "(line 3866,col 9)-(line 3866,col 52)",
        "(line 3867,col 9)-(line 3869,col 9)",
        "(line 3870,col 9)-(line 3870,col 47)",
        "(line 3871,col 9)-(line 3871,col 57)",
        "(line 3872,col 9)-(line 3872,col 49)",
        "(line 3873,col 9)-(line 3873,col 59)",
        "(line 3874,col 9)-(line 3874,col 72)",
        "(line 3875,col 9)-(line 3882,col 9)",
        "(line 3883,col 9)-(line 3883,col 42)",
        "(line 3884,col 9)-(line 3884,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replaceEach(java.lang.String, java.lang.String[], java.lang.String[])",
      "begin_line": 3926,
      "end_line": 3928,
      "comment": "\n     * \u003cp\u003e\n     * Replaces all occurrences of Strings within another String.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e reference passed to this method is a no-op, or if\n     * any \"search string\" or \"string to replace\" is null, that replace will be\n     * ignored. This will not repeat. For repeating replaces, call the\n     * overloaded method.\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *  StringUtils.replaceEach(null, *, *)        \u003d null\n     *  StringUtils.replaceEach(\"\", *, *)          \u003d \"\"\n     *  StringUtils.replaceEach(\"aba\", null, null) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[0], null) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", null, new String[0]) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, null)  \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, new String[]{\"\"})  \u003d \"b\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{null}, new String[]{\"a\"})  \u003d \"aba\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"w\", \"t\"})  \u003d \"wcte\"\n     *  (example of how it does not repeat)\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"t\"})  \u003d \"dcte\"\n     * \u003c/pre\u003e\n     *\n     * @param text\n     *            text to search and replace in, no-op if null\n     * @param searchList\n     *            the Strings to search for, no-op if null\n     * @param replacementList\n     *            the Strings to replace them with, no-op if null\n     * @return the text with any replacements processed, \u003ccode\u003enull\u003c/code\u003e if\n     *         null String input\n     * @throws IndexOutOfBoundsException\n     *             if the lengths of the arrays are not the same (null is ok,\n     *             and/or size 0)\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3927,col 9)-(line 3927,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(java.lang.String, java.lang.String[], java.lang.String[])",
      "begin_line": 3975,
      "end_line": 3980,
      "comment": "\n     * \u003cp\u003e\n     * Replaces all occurrences of Strings within another String.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e reference passed to this method is a no-op, or if\n     * any \"search string\" or \"string to replace\" is null, that replace will be\n     * ignored. This will not repeat. For repeating replaces, call the\n     * overloaded method.\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *  StringUtils.replaceEach(null, *, *, *) \u003d null\n     *  StringUtils.replaceEach(\"\", *, *, *) \u003d \"\"\n     *  StringUtils.replaceEach(\"aba\", null, null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[0], null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", null, new String[0], *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, new String[]{\"\"}, *) \u003d \"b\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{null}, new String[]{\"a\"}, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"w\", \"t\"}, *) \u003d \"wcte\"\n     *  (example of how it repeats)\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"t\"}, false) \u003d \"dcte\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"t\"}, true) \u003d \"tcte\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"ab\"}, true) \u003d IllegalArgumentException\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"ab\"}, false) \u003d \"dcabe\"\n     * \u003c/pre\u003e\n     *\n     * @param text\n     *            text to search and replace in, no-op if null\n     * @param searchList\n     *            the Strings to search for, no-op if null\n     * @param replacementList\n     *            the Strings to replace them with, no-op if null\n     * @return the text with any replacements processed, \u003ccode\u003enull\u003c/code\u003e if\n     *         null String input\n     * @throws IllegalArgumentException\n     *             if the search is repeating and there is an endless loop due\n     *             to outputs of one being inputs to another\n     * @throws IndexOutOfBoundsException\n     *             if the lengths of the arrays are not the same (null is ok,\n     *             and/or size 0)\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3978,col 9)-(line 3978,col 68)",
        "(line 3979,col 9)-(line 3979,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replaceEach(java.lang.String, java.lang.String[], java.lang.String[], boolean, int)",
      "begin_line": 4030,
      "end_line": 4159,
      "comment": "\n     * \u003cp\u003e\n     * Replaces all occurrences of Strings within another String.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e reference passed to this method is a no-op, or if\n     * any \"search string\" or \"string to replace\" is null, that replace will be\n     * ignored.\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *  StringUtils.replaceEach(null, *, *, *) \u003d null\n     *  StringUtils.replaceEach(\"\", *, *, *) \u003d \"\"\n     *  StringUtils.replaceEach(\"aba\", null, null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[0], null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", null, new String[0], *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, new String[]{\"\"}, *) \u003d \"b\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{null}, new String[]{\"a\"}, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"w\", \"t\"}, *) \u003d \"wcte\"\n     *  (example of how it repeats)\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"t\"}, false) \u003d \"dcte\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"t\"}, true) \u003d \"tcte\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"ab\"}, *) \u003d IllegalArgumentException\n     * \u003c/pre\u003e\n     *\n     * @param text\n     *            text to search and replace in, no-op if null\n     * @param searchList\n     *            the Strings to search for, no-op if null\n     * @param replacementList\n     *            the Strings to replace them with, no-op if null\n     * @param repeat if true, then replace repeatedly\n     *       until there are no more possible replacements or timeToLive \u003c 0\n     * @param timeToLive\n     *            if less than 0 then there is a circular reference and endless\n     *            loop\n     * @return the text with any replacements processed, \u003ccode\u003enull\u003c/code\u003e if\n     *         null String input\n     * @throws IllegalArgumentException\n     *             if the search is repeating and there is an endless loop due\n     *             to outputs of one being inputs to another\n     * @throws IndexOutOfBoundsException\n     *             if the lengths of the arrays are not the same (null is ok,\n     *             and/or size 0)\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 4037,col 9)-(line 4041,col 9)",
        "(line 4044,col 9)-(line 4046,col 9)",
        "(line 4048,col 9)-(line 4048,col 45)",
        "(line 4049,col 9)-(line 4049,col 55)",
        "(line 4052,col 9)-(line 4057,col 9)",
        "(line 4060,col 9)-(line 4060,col 72)",
        "(line 4063,col 9)-(line 4063,col 27)",
        "(line 4064,col 9)-(line 4064,col 30)",
        "(line 4065,col 9)-(line 4065,col 27)",
        "(line 4069,col 9)-(line 4086,col 9)",
        "(line 4090,col 9)-(line 4092,col 9)",
        "(line 4094,col 9)-(line 4094,col 22)",
        "(line 4097,col 9)-(line 4097,col 25)",
        "(line 4100,col 9)-(line 4108,col 9)",
        "(line 4110,col 9)-(line 4110,col 57)",
        "(line 4112,col 9)-(line 4112,col 72)",
        "(line 4114,col 9)-(line 4148,col 9)",
        "(line 4149,col 9)-(line 4149,col 39)",
        "(line 4150,col 9)-(line 4152,col 9)",
        "(line 4153,col 9)-(line 4153,col 39)",
        "(line 4154,col 9)-(line 4156,col 9)",
        "(line 4158,col 9)-(line 4158,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replaceChars(java.lang.String, char, char)",
      "begin_line": 4183,
      "end_line": 4188,
      "comment": "\n     * \u003cp\u003eReplaces all occurrences of a character in a String with another.\n     * This is a null-safe version of {@link String#replace(char, char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input returns \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") string input returns an empty string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replaceChars(null, *, *)        \u003d null\n     * StringUtils.replaceChars(\"\", *, *)          \u003d \"\"\n     * StringUtils.replaceChars(\"abcba\", \u0027b\u0027, \u0027y\u0027) \u003d \"aycya\"\n     * StringUtils.replaceChars(\"abcba\", \u0027z\u0027, \u0027y\u0027) \u003d \"abcba\"\n     * \u003c/pre\u003e\n     *\n     * @param str  String to replace characters in, may be null\n     * @param searchChar  the character to search for, may be null\n     * @param replaceChar  the character to replace, may be null\n     * @return modified String, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4184,col 9)-(line 4186,col 9)",
        "(line 4187,col 9)-(line 4187,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replaceChars(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 4226,
      "end_line": 4253,
      "comment": "\n     * \u003cp\u003eReplaces multiple characters in a String in one go.\n     * This method can also be used to delete characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example:\u003cbr /\u003e\n     * \u003ccode\u003ereplaceChars(\u0026quot;hello\u0026quot;, \u0026quot;ho\u0026quot;, \u0026quot;jy\u0026quot;) \u003d jelly\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input returns \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") string input returns an empty string.\n     * A null or empty set of search characters returns the input string.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe length of the search characters should normally equal the length\n     * of the replace characters.\n     * If the search characters is longer, then the extra search characters\n     * are deleted.\n     * If the search characters is shorter, then the extra replace characters\n     * are ignored.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replaceChars(null, *, *)           \u003d null\n     * StringUtils.replaceChars(\"\", *, *)             \u003d \"\"\n     * StringUtils.replaceChars(\"abc\", null, *)       \u003d \"abc\"\n     * StringUtils.replaceChars(\"abc\", \"\", *)         \u003d \"abc\"\n     * StringUtils.replaceChars(\"abc\", \"b\", null)     \u003d \"ac\"\n     * StringUtils.replaceChars(\"abc\", \"b\", \"\")       \u003d \"ac\"\n     * StringUtils.replaceChars(\"abcba\", \"bc\", \"yz\")  \u003d \"ayzya\"\n     * StringUtils.replaceChars(\"abcba\", \"bc\", \"y\")   \u003d \"ayya\"\n     * StringUtils.replaceChars(\"abcba\", \"bc\", \"yzx\") \u003d \"ayzya\"\n     * \u003c/pre\u003e\n     *\n     * @param str  String to replace characters in, may be null\n     * @param searchChars  a set of characters to search for, may be null\n     * @param replaceChars  a set of characters to replace, may be null\n     * @return modified String, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4227,col 9)-(line 4229,col 9)",
        "(line 4230,col 9)-(line 4232,col 9)",
        "(line 4233,col 9)-(line 4233,col 33)",
        "(line 4234,col 9)-(line 4234,col 55)",
        "(line 4235,col 9)-(line 4235,col 37)",
        "(line 4236,col 9)-(line 4236,col 57)",
        "(line 4237,col 9)-(line 4248,col 9)",
        "(line 4249,col 9)-(line 4251,col 9)",
        "(line 4252,col 9)-(line 4252,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.overlay(java.lang.String, java.lang.String, int, int)",
      "begin_line": 4286,
      "end_line": 4316,
      "comment": "\n     * \u003cp\u003eOverlays part of a String with another String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input returns \u003ccode\u003enull\u003c/code\u003e.\n     * A negative index is treated as zero.\n     * An index greater than the string length is treated as the string length.\n     * The start index is always the smaller of the two indices.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.overlay(null, *, *, *)            \u003d null\n     * StringUtils.overlay(\"\", \"abc\", 0, 0)          \u003d \"abc\"\n     * StringUtils.overlay(\"abcdef\", null, 2, 4)     \u003d \"abef\"\n     * StringUtils.overlay(\"abcdef\", \"\", 2, 4)       \u003d \"abef\"\n     * StringUtils.overlay(\"abcdef\", \"\", 4, 2)       \u003d \"abef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", 2, 4)   \u003d \"abzzzzef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", 4, 2)   \u003d \"abzzzzef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", -1, 4)  \u003d \"zzzzef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", 2, 8)   \u003d \"abzzzz\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", -2, -3) \u003d \"zzzzabcdef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", 8, 10)  \u003d \"abcdefzzzz\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to do overlaying in, may be null\n     * @param overlay  the String to overlay, may be null\n     * @param start  the position to start overlaying at\n     * @param end  the position to stop overlaying before\n     * @return overlayed String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4287,col 9)-(line 4289,col 9)",
        "(line 4290,col 9)-(line 4292,col 9)",
        "(line 4293,col 9)-(line 4293,col 31)",
        "(line 4294,col 9)-(line 4296,col 9)",
        "(line 4297,col 9)-(line 4299,col 9)",
        "(line 4300,col 9)-(line 4302,col 9)",
        "(line 4303,col 9)-(line 4305,col 9)",
        "(line 4306,col 9)-(line 4310,col 9)",
        "(line 4311,col 9)-(line 4315,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.chomp(java.lang.String)",
      "begin_line": 4345,
      "end_line": 4369,
      "comment": "\n     * \u003cp\u003eRemoves one newline from end of a String if it\u0027s there,\n     * otherwise leave it alone.  A newline is \u0026quot;\u003ccode\u003e\\n\u003c/code\u003e\u0026quot;,\n     * \u0026quot;\u003ccode\u003e\\r\u003c/code\u003e\u0026quot;, or \u0026quot;\u003ccode\u003e\\r\\n\u003c/code\u003e\u0026quot;.\u003c/p\u003e\n     *\n     * \u003cp\u003eNOTE: This method changed in 2.0.\n     * It now more closely matches Perl chomp.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.chomp(null)          \u003d null\n     * StringUtils.chomp(\"\")            \u003d \"\"\n     * StringUtils.chomp(\"abc \\r\")      \u003d \"abc \"\n     * StringUtils.chomp(\"abc\\n\")       \u003d \"abc\"\n     * StringUtils.chomp(\"abc\\r\\n\")     \u003d \"abc\"\n     * StringUtils.chomp(\"abc\\r\\n\\r\\n\") \u003d \"abc\\r\\n\"\n     * StringUtils.chomp(\"abc\\n\\r\")     \u003d \"abc\\n\"\n     * StringUtils.chomp(\"abc\\n\\rabc\")  \u003d \"abc\\n\\rabc\"\n     * StringUtils.chomp(\"\\r\")          \u003d \"\"\n     * StringUtils.chomp(\"\\n\")          \u003d \"\"\n     * StringUtils.chomp(\"\\r\\n\")        \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to chomp a newline from, may be null\n     * @return String without newline, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4346,col 9)-(line 4348,col 9)",
        "(line 4350,col 9)-(line 4356,col 9)",
        "(line 4358,col 9)-(line 4358,col 39)",
        "(line 4359,col 9)-(line 4359,col 40)",
        "(line 4361,col 9)-(line 4367,col 9)",
        "(line 4368,col 9)-(line 4368,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.chomp(java.lang.String, java.lang.String)",
      "begin_line": 4397,
      "end_line": 4405,
      "comment": "\n     * \u003cp\u003eRemoves \u003ccode\u003eseparator\u003c/code\u003e from the end of\n     * \u003ccode\u003estr\u003c/code\u003e if it\u0027s there, otherwise leave it alone.\u003c/p\u003e\n     *\n     * \u003cp\u003eNOTE: This method changed in version 2.0.\n     * It now more closely matches Perl chomp.\n     * For the previous behavior, use {@link #substringBeforeLast(String, String)}.\n     * This method uses {@link String#endsWith(String)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.chomp(null, *)         \u003d null\n     * StringUtils.chomp(\"\", *)           \u003d \"\"\n     * StringUtils.chomp(\"foobar\", \"bar\") \u003d \"foo\"\n     * StringUtils.chomp(\"foobar\", \"baz\") \u003d \"foobar\"\n     * StringUtils.chomp(\"foo\", \"foo\")    \u003d \"\"\n     * StringUtils.chomp(\"foo \", \"foo\")   \u003d \"foo \"\n     * StringUtils.chomp(\" foo\", \"foo\")   \u003d \" \"\n     * StringUtils.chomp(\"foo\", \"foooo\")  \u003d \"foo\"\n     * StringUtils.chomp(\"foo\", \"\")       \u003d \"foo\"\n     * StringUtils.chomp(\"foo\", null)     \u003d \"foo\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to chomp from, may be null\n     * @param separator  separator String, may be null\n     * @return String without trailing separator, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4398,col 9)-(line 4400,col 9)",
        "(line 4401,col 9)-(line 4403,col 9)",
        "(line 4404,col 9)-(line 4404,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.chop(java.lang.String)",
      "begin_line": 4432,
      "end_line": 4449,
      "comment": "\n     * \u003cp\u003eRemove the last character from a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the String ends in \u003ccode\u003e\\r\\n\u003c/code\u003e, then remove both\n     * of them.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.chop(null)          \u003d null\n     * StringUtils.chop(\"\")            \u003d \"\"\n     * StringUtils.chop(\"abc \\r\")      \u003d \"abc \"\n     * StringUtils.chop(\"abc\\n\")       \u003d \"abc\"\n     * StringUtils.chop(\"abc\\r\\n\")     \u003d \"abc\"\n     * StringUtils.chop(\"abc\")         \u003d \"ab\"\n     * StringUtils.chop(\"abc\\nabc\")    \u003d \"abc\\nab\"\n     * StringUtils.chop(\"a\")           \u003d \"\"\n     * StringUtils.chop(\"\\r\")          \u003d \"\"\n     * StringUtils.chop(\"\\n\")          \u003d \"\"\n     * StringUtils.chop(\"\\r\\n\")        \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to chop last character from, may be null\n     * @return String without last character, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4433,col 9)-(line 4435,col 9)",
        "(line 4436,col 9)-(line 4436,col 34)",
        "(line 4437,col 9)-(line 4439,col 9)",
        "(line 4440,col 9)-(line 4440,col 33)",
        "(line 4441,col 9)-(line 4441,col 47)",
        "(line 4442,col 9)-(line 4442,col 40)",
        "(line 4443,col 9)-(line 4447,col 9)",
        "(line 4448,col 9)-(line 4448,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.repeat(java.lang.String, int)",
      "begin_line": 4474,
      "end_line": 4516,
      "comment": "\n     * \u003cp\u003eRepeat a String \u003ccode\u003erepeat\u003c/code\u003e times to form a\n     * new String.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.repeat(null, 2) \u003d null\n     * StringUtils.repeat(\"\", 0)   \u003d \"\"\n     * StringUtils.repeat(\"\", 2)   \u003d \"\"\n     * StringUtils.repeat(\"a\", 3)  \u003d \"aaa\"\n     * StringUtils.repeat(\"ab\", 2) \u003d \"abab\"\n     * StringUtils.repeat(\"a\", -2) \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to repeat, may be null\n     * @param repeat  number of times to repeat str, negative treated as zero\n     * @return a new String consisting of the original String repeated,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4477,col 9)-(line 4479,col 9)",
        "(line 4480,col 9)-(line 4482,col 9)",
        "(line 4483,col 9)-(line 4483,col 39)",
        "(line 4484,col 9)-(line 4486,col 9)",
        "(line 4487,col 9)-(line 4489,col 9)",
        "(line 4491,col 9)-(line 4491,col 48)",
        "(line 4492,col 9)-(line 4515,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.repeat(java.lang.String, java.lang.String, int)",
      "begin_line": 4538,
      "end_line": 4546,
      "comment": "\n     * \u003cp\u003eRepeat a String \u003ccode\u003erepeat\u003c/code\u003e times to form a\n     * new String, with a String separator injected each time. \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.repeat(null, null, 2) \u003d null\n     * StringUtils.repeat(null, \"x\", 2)  \u003d null\n     * StringUtils.repeat(\"\", null, 0)   \u003d \"\"\n     * StringUtils.repeat(\"\", \"\", 2)     \u003d \"\"\n     * StringUtils.repeat(\"\", \"x\", 3)    \u003d \"xxx\"\n     * StringUtils.repeat(\"?\", \", \", 3)  \u003d \"?, ?, ?\"\n     * \u003c/pre\u003e\n     *\n     * @param str        the String to repeat, may be null\n     * @param separator  the String to inject, may be null\n     * @param repeat     number of times to repeat str, negative treated as zero\n     * @return a new String consisting of the original String repeated,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 4539,col 9)-(line 4545,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.padding(int, char)",
      "begin_line": 4571,
      "end_line": 4580,
      "comment": "\n     * \u003cp\u003eReturns padding using the specified delimiter repeated\n     * to a given length.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.padding(0, \u0027e\u0027)  \u003d \"\"\n     * StringUtils.padding(3, \u0027e\u0027)  \u003d \"eee\"\n     * StringUtils.padding(-2, \u0027e\u0027) \u003d IndexOutOfBoundsException\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eNote: this method doesn\u0027t not support padding with\n     * \u003ca href\u003d\"http://www.unicode.org/glossary/#supplementary_character\"\u003eUnicode Supplementary Characters\u003c/a\u003e\n     * as they require a pair of \u003ccode\u003echar\u003c/code\u003es to be represented.\n     * If you are needing to support full I18N of your applications\n     * consider using {@link #repeat(String, int)} instead.\n     * \u003c/p\u003e\n     *\n     * @param repeat  number of times to repeat delim\n     * @param padChar  character to repeat\n     * @return String with repeated character\n     * @throws IndexOutOfBoundsException if \u003ccode\u003erepeat \u0026lt; 0\u003c/code\u003e\n     * @see #repeat(String, int)\n     ",
      "child_ranges": [
        "(line 4572,col 9)-(line 4574,col 9)",
        "(line 4575,col 9)-(line 4575,col 44)",
        "(line 4576,col 9)-(line 4578,col 9)",
        "(line 4579,col 9)-(line 4579,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.rightPad(java.lang.String, int)",
      "begin_line": 4601,
      "end_line": 4603,
      "comment": "\n     * \u003cp\u003eRight pad a String with spaces (\u0027 \u0027).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is padded to the size of \u003ccode\u003esize\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.rightPad(null, *)   \u003d null\n     * StringUtils.rightPad(\"\", 3)     \u003d \"   \"\n     * StringUtils.rightPad(\"bat\", 3)  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", 5)  \u003d \"bat  \"\n     * StringUtils.rightPad(\"bat\", 1)  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", -1) \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @return right padded String or original String if no padding is necessary,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4602,col 9)-(line 4602,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.rightPad(java.lang.String, int, char)",
      "begin_line": 4626,
      "end_line": 4638,
      "comment": "\n     * \u003cp\u003eRight pad a String with a specified character.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is padded to the size of \u003ccode\u003esize\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.rightPad(null, *, *)     \u003d null\n     * StringUtils.rightPad(\"\", 3, \u0027z\u0027)     \u003d \"zzz\"\n     * StringUtils.rightPad(\"bat\", 3, \u0027z\u0027)  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", 5, \u0027z\u0027)  \u003d \"batzz\"\n     * StringUtils.rightPad(\"bat\", 1, \u0027z\u0027)  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", -1, \u0027z\u0027) \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @param padChar  the character to pad with\n     * @return right padded String or original String if no padding is necessary,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4627,col 9)-(line 4629,col 9)",
        "(line 4630,col 9)-(line 4630,col 39)",
        "(line 4631,col 9)-(line 4633,col 9)",
        "(line 4634,col 9)-(line 4636,col 9)",
        "(line 4637,col 9)-(line 4637,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.rightPad(java.lang.String, int, java.lang.String)",
      "begin_line": 4663,
      "end_line": 4692,
      "comment": "\n     * \u003cp\u003eRight pad a String with a specified String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is padded to the size of \u003ccode\u003esize\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.rightPad(null, *, *)      \u003d null\n     * StringUtils.rightPad(\"\", 3, \"z\")      \u003d \"zzz\"\n     * StringUtils.rightPad(\"bat\", 3, \"yz\")  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", 5, \"yz\")  \u003d \"batyz\"\n     * StringUtils.rightPad(\"bat\", 8, \"yz\")  \u003d \"batyzyzy\"\n     * StringUtils.rightPad(\"bat\", 1, \"yz\")  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", -1, \"yz\") \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", 5, null)  \u003d \"bat  \"\n     * StringUtils.rightPad(\"bat\", 5, \"\")    \u003d \"bat  \"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @param padStr  the String to pad with, null or empty treated as single space\n     * @return right padded String or original String if no padding is necessary,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4664,col 9)-(line 4666,col 9)",
        "(line 4667,col 9)-(line 4669,col 9)",
        "(line 4670,col 9)-(line 4670,col 37)",
        "(line 4671,col 9)-(line 4671,col 34)",
        "(line 4672,col 9)-(line 4672,col 33)",
        "(line 4673,col 9)-(line 4675,col 9)",
        "(line 4676,col 9)-(line 4678,col 9)",
        "(line 4680,col 9)-(line 4691,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.leftPad(java.lang.String, int)",
      "begin_line": 4713,
      "end_line": 4715,
      "comment": "\n     * \u003cp\u003eLeft pad a String with spaces (\u0027 \u0027).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is padded to the size of \u003ccode\u003esize\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.leftPad(null, *)   \u003d null\n     * StringUtils.leftPad(\"\", 3)     \u003d \"   \"\n     * StringUtils.leftPad(\"bat\", 3)  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", 5)  \u003d \"  bat\"\n     * StringUtils.leftPad(\"bat\", 1)  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", -1) \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @return left padded String or original String if no padding is necessary,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4714,col 9)-(line 4714,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.leftPad(java.lang.String, int, char)",
      "begin_line": 4738,
      "end_line": 4750,
      "comment": "\n     * \u003cp\u003eLeft pad a String with a specified character.\u003c/p\u003e\n     *\n     * \u003cp\u003ePad to a size of \u003ccode\u003esize\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.leftPad(null, *, *)     \u003d null\n     * StringUtils.leftPad(\"\", 3, \u0027z\u0027)     \u003d \"zzz\"\n     * StringUtils.leftPad(\"bat\", 3, \u0027z\u0027)  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", 5, \u0027z\u0027)  \u003d \"zzbat\"\n     * StringUtils.leftPad(\"bat\", 1, \u0027z\u0027)  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", -1, \u0027z\u0027) \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @param padChar  the character to pad with\n     * @return left padded String or original String if no padding is necessary,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4739,col 9)-(line 4741,col 9)",
        "(line 4742,col 9)-(line 4742,col 39)",
        "(line 4743,col 9)-(line 4745,col 9)",
        "(line 4746,col 9)-(line 4748,col 9)",
        "(line 4749,col 9)-(line 4749,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.leftPad(java.lang.String, int, java.lang.String)",
      "begin_line": 4775,
      "end_line": 4804,
      "comment": "\n     * \u003cp\u003eLeft pad a String with a specified String.\u003c/p\u003e\n     *\n     * \u003cp\u003ePad to a size of \u003ccode\u003esize\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.leftPad(null, *, *)      \u003d null\n     * StringUtils.leftPad(\"\", 3, \"z\")      \u003d \"zzz\"\n     * StringUtils.leftPad(\"bat\", 3, \"yz\")  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", 5, \"yz\")  \u003d \"yzbat\"\n     * StringUtils.leftPad(\"bat\", 8, \"yz\")  \u003d \"yzyzybat\"\n     * StringUtils.leftPad(\"bat\", 1, \"yz\")  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", -1, \"yz\") \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", 5, null)  \u003d \"  bat\"\n     * StringUtils.leftPad(\"bat\", 5, \"\")    \u003d \"  bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @param padStr  the String to pad with, null or empty treated as single space\n     * @return left padded String or original String if no padding is necessary,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4776,col 9)-(line 4778,col 9)",
        "(line 4779,col 9)-(line 4781,col 9)",
        "(line 4782,col 9)-(line 4782,col 37)",
        "(line 4783,col 9)-(line 4783,col 34)",
        "(line 4784,col 9)-(line 4784,col 33)",
        "(line 4785,col 9)-(line 4787,col 9)",
        "(line 4788,col 9)-(line 4790,col 9)",
        "(line 4792,col 9)-(line 4803,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.length(java.lang.CharSequence)",
      "begin_line": 4817,
      "end_line": 4819,
      "comment": "\n     * Gets a CharSequence length or \u003ccode\u003e0\u003c/code\u003e if the CharSequence is\n     * \u003ccode\u003enull\u003c/code\u003e.\n     *\n     * @param cs\n     *            a CharSequence or \u003ccode\u003enull\u003c/code\u003e\n     * @return CharSequence length or \u003ccode\u003e0\u003c/code\u003e if the CharSequence is\n     *         \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.4\n     * @since 3.0 Changed signature from length(String) to length(CharSequence)\n     ",
      "child_ranges": [
        "(line 4818,col 9)-(line 4818,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.center(java.lang.String, int)",
      "begin_line": 4846,
      "end_line": 4848,
      "comment": "\n     * \u003cp\u003eCenters a String in a larger String of size \u003ccode\u003esize\u003c/code\u003e\n     * using the space character (\u0027 \u0027).\u003cp\u003e\n     *\n     * \u003cp\u003eIf the size is less than the String length, the String is returned.\n     * A \u003ccode\u003enull\u003c/code\u003e String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A negative size is treated as zero.\u003c/p\u003e\n     *\n     * \u003cp\u003eEquivalent to \u003ccode\u003ecenter(str, size, \" \")\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.center(null, *)   \u003d null\n     * StringUtils.center(\"\", 4)     \u003d \"    \"\n     * StringUtils.center(\"ab\", -1)  \u003d \"ab\"\n     * StringUtils.center(\"ab\", 4)   \u003d \" ab \"\n     * StringUtils.center(\"abcd\", 2) \u003d \"abcd\"\n     * StringUtils.center(\"a\", 4)    \u003d \" a  \"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to center, may be null\n     * @param size  the int size of new String, negative treated as zero\n     * @return centered String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4847,col 9)-(line 4847,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.center(java.lang.String, int, char)",
      "begin_line": 4874,
      "end_line": 4886,
      "comment": "\n     * \u003cp\u003eCenters a String in a larger String of size \u003ccode\u003esize\u003c/code\u003e.\n     * Uses a supplied character as the value to pad the String with.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the size is less than the String length, the String is returned.\n     * A \u003ccode\u003enull\u003c/code\u003e String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A negative size is treated as zero.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.center(null, *, *)     \u003d null\n     * StringUtils.center(\"\", 4, \u0027 \u0027)     \u003d \"    \"\n     * StringUtils.center(\"ab\", -1, \u0027 \u0027)  \u003d \"ab\"\n     * StringUtils.center(\"ab\", 4, \u0027 \u0027)   \u003d \" ab\"\n     * StringUtils.center(\"abcd\", 2, \u0027 \u0027) \u003d \"abcd\"\n     * StringUtils.center(\"a\", 4, \u0027 \u0027)    \u003d \" a  \"\n     * StringUtils.center(\"a\", 4, \u0027y\u0027)    \u003d \"yayy\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to center, may be null\n     * @param size  the int size of new String, negative treated as zero\n     * @param padChar  the character to pad the new String with\n     * @return centered String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4875,col 9)-(line 4877,col 9)",
        "(line 4878,col 9)-(line 4878,col 34)",
        "(line 4879,col 9)-(line 4879,col 33)",
        "(line 4880,col 9)-(line 4882,col 9)",
        "(line 4883,col 9)-(line 4883,col 55)",
        "(line 4884,col 9)-(line 4884,col 43)",
        "(line 4885,col 9)-(line 4885,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.center(java.lang.String, int, java.lang.String)",
      "begin_line": 4914,
      "end_line": 4929,
      "comment": "\n     * \u003cp\u003eCenters a String in a larger String of size \u003ccode\u003esize\u003c/code\u003e.\n     * Uses a supplied String as the value to pad the String with.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the size is less than the String length, the String is returned.\n     * A \u003ccode\u003enull\u003c/code\u003e String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A negative size is treated as zero.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.center(null, *, *)     \u003d null\n     * StringUtils.center(\"\", 4, \" \")     \u003d \"    \"\n     * StringUtils.center(\"ab\", -1, \" \")  \u003d \"ab\"\n     * StringUtils.center(\"ab\", 4, \" \")   \u003d \" ab\"\n     * StringUtils.center(\"abcd\", 2, \" \") \u003d \"abcd\"\n     * StringUtils.center(\"a\", 4, \" \")    \u003d \" a  \"\n     * StringUtils.center(\"a\", 4, \"yz\")   \u003d \"yayz\"\n     * StringUtils.center(\"abc\", 7, null) \u003d \"  abc  \"\n     * StringUtils.center(\"abc\", 7, \"\")   \u003d \"  abc  \"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to center, may be null\n     * @param size  the int size of new String, negative treated as zero\n     * @param padStr  the String to pad the new String with, must not be null or empty\n     * @return centered String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @throws IllegalArgumentException if padStr is \u003ccode\u003enull\u003c/code\u003e or empty\n     ",
      "child_ranges": [
        "(line 4915,col 9)-(line 4917,col 9)",
        "(line 4918,col 9)-(line 4920,col 9)",
        "(line 4921,col 9)-(line 4921,col 34)",
        "(line 4922,col 9)-(line 4922,col 33)",
        "(line 4923,col 9)-(line 4925,col 9)",
        "(line 4926,col 9)-(line 4926,col 54)",
        "(line 4927,col 9)-(line 4927,col 42)",
        "(line 4928,col 9)-(line 4928,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.upperCase(java.lang.String)",
      "begin_line": 4952,
      "end_line": 4957,
      "comment": "\n     * \u003cp\u003eConverts a String to upper case as per {@link String#toUpperCase()}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.upperCase(null)  \u003d null\n     * StringUtils.upperCase(\"\")    \u003d \"\"\n     * StringUtils.upperCase(\"aBc\") \u003d \"ABC\"\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003e\u003cstrong\u003eNote:\u003c/strong\u003e As described in the documentation for {@link String#toUpperCase()},\n     * the result of this method is affected by the current locale.\n     * For platform-independent case transformations, the method {@link #lowerCase(String, Locale)}\n     * should be used with a specific locale (e.g. {@link Locale#ENGLISH}).\u003c/p\u003e\n     *\n     * @param str  the String to upper case, may be null\n     * @return the upper cased String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4953,col 9)-(line 4955,col 9)",
        "(line 4956,col 9)-(line 4956,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.upperCase(java.lang.String, java.util.Locale)",
      "begin_line": 4975,
      "end_line": 4980,
      "comment": "\n     * \u003cp\u003eConverts a String to upper case as per {@link String#toUpperCase(Locale)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.upperCase(null, Locale.ENGLISH)  \u003d null\n     * StringUtils.upperCase(\"\", Locale.ENGLISH)    \u003d \"\"\n     * StringUtils.upperCase(\"aBc\", Locale.ENGLISH) \u003d \"ABC\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to upper case, may be null\n     * @param locale  the locale that defines the case transformation rules, must not be null\n     * @return the upper cased String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 4976,col 9)-(line 4978,col 9)",
        "(line 4979,col 9)-(line 4979,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lowerCase(java.lang.String)",
      "begin_line": 5001,
      "end_line": 5006,
      "comment": "\n     * \u003cp\u003eConverts a String to lower case as per {@link String#toLowerCase()}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lowerCase(null)  \u003d null\n     * StringUtils.lowerCase(\"\")    \u003d \"\"\n     * StringUtils.lowerCase(\"aBc\") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003e\u003cstrong\u003eNote:\u003c/strong\u003e As described in the documentation for {@link String#toLowerCase()},\n     * the result of this method is affected by the current locale.\n     * For platform-independent case transformations, the method {@link #lowerCase(String, Locale)}\n     * should be used with a specific locale (e.g. {@link Locale#ENGLISH}).\u003c/p\u003e\n     *\n     * @param str  the String to lower case, may be null\n     * @return the lower cased String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 5002,col 9)-(line 5004,col 9)",
        "(line 5005,col 9)-(line 5005,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lowerCase(java.lang.String, java.util.Locale)",
      "begin_line": 5024,
      "end_line": 5029,
      "comment": "\n     * \u003cp\u003eConverts a String to lower case as per {@link String#toLowerCase(Locale)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lowerCase(null, Locale.ENGLISH)  \u003d null\n     * StringUtils.lowerCase(\"\", Locale.ENGLISH)    \u003d \"\"\n     * StringUtils.lowerCase(\"aBc\", Locale.ENGLISH) \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to lower case, may be null\n     * @param locale  the locale that defines the case transformation rules, must not be null\n     * @return the lower cased String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 5025,col 9)-(line 5027,col 9)",
        "(line 5028,col 9)-(line 5028,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.capitalize(java.lang.CharSequence)",
      "begin_line": 5052,
      "end_line": 5064,
      "comment": "\n     * \u003cp\u003eCapitalizes a String changing the first letter to title case as\n     * per {@link Character#toTitleCase(char)}. No other letters are changed.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor a word based algorithm, see {@link org.apache.commons.lang3.text.WordUtils#capitalize(String)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.capitalize(null)  \u003d null\n     * StringUtils.capitalize(\"\")    \u003d \"\"\n     * StringUtils.capitalize(\"cat\") \u003d \"Cat\"\n     * StringUtils.capitalize(\"cAt\") \u003d \"CAt\"\n     * \u003c/pre\u003e\n     *\n     * @param cs the String to capitalize, may be null\n     * @return the capitalized String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @see org.apache.commons.lang3.text.WordUtils#capitalize(String)\n     * @see #uncapitalize(CharSequence)\n     * @since 2.0\n     * @since 3.0 Changed signature from capitalize(String) to capitalize(CharSequence)\n     ",
      "child_ranges": [
        "(line 5053,col 9)-(line 5055,col 9)",
        "(line 5056,col 9)-(line 5056,col 19)",
        "(line 5057,col 9)-(line 5059,col 9)",
        "(line 5060,col 9)-(line 5063,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.uncapitalize(java.lang.CharSequence)",
      "begin_line": 5087,
      "end_line": 5099,
      "comment": "\n     * \u003cp\u003eUncapitalizes a CharSequence changing the first letter to title case as\n     * per {@link Character#toLowerCase(char)}. No other letters are changed.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor a word based algorithm, see {@link org.apache.commons.lang3.text.WordUtils#uncapitalize(String)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.uncapitalize(null)  \u003d null\n     * StringUtils.uncapitalize(\"\")    \u003d \"\"\n     * StringUtils.uncapitalize(\"Cat\") \u003d \"cat\"\n     * StringUtils.uncapitalize(\"CAT\") \u003d \"cAT\"\n     * \u003c/pre\u003e\n     *\n     * @param cs the String to uncapitalize, may be null\n     * @return the uncapitalized String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @see org.apache.commons.lang3.text.WordUtils#uncapitalize(String)\n     * @see #capitalize(CharSequence)\n     * @since 2.0\n     * @since 3.0 Changed signature from uncapitalize(String) to uncapitalize(CharSequence)\n     ",
      "child_ranges": [
        "(line 5088,col 9)-(line 5090,col 9)",
        "(line 5091,col 9)-(line 5091,col 19)",
        "(line 5092,col 9)-(line 5094,col 9)",
        "(line 5095,col 9)-(line 5098,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.swapCase(java.lang.String)",
      "begin_line": 5128,
      "end_line": 5148,
      "comment": "\n     * \u003cp\u003eSwaps the case of a String changing upper and title case to\n     * lower case, and lower case to upper case.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     *  \u003cli\u003eUpper case character converts to Lower case\u003c/li\u003e\n     *  \u003cli\u003eTitle case character converts to Lower case\u003c/li\u003e\n     *  \u003cli\u003eLower case character converts to Upper case\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eFor a word based algorithm, see {@link org.apache.commons.lang3.text.WordUtils#swapCase(String)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.swapCase(null)                 \u003d null\n     * StringUtils.swapCase(\"\")                   \u003d \"\"\n     * StringUtils.swapCase(\"The dog has a BONE\") \u003d \"tHE DOG HAS A bone\"\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eNOTE: This method changed in Lang version 2.0.\n     * It no longer performs a word based algorithm.\n     * If you only use ASCII, you will notice no change.\n     * That functionality is available in org.apache.commons.lang3.text.WordUtils.\u003c/p\u003e\n     *\n     * @param str  the String to swap case, may be null\n     * @return the changed String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 5129,col 9)-(line 5129,col 19)",
        "(line 5130,col 9)-(line 5132,col 9)",
        "(line 5133,col 9)-(line 5133,col 57)",
        "(line 5135,col 9)-(line 5135,col 20)",
        "(line 5136,col 9)-(line 5146,col 9)",
        "(line 5147,col 9)-(line 5147,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.countMatches(java.lang.String, java.lang.String)",
      "begin_line": 5171,
      "end_line": 5182,
      "comment": "\n     * \u003cp\u003eCounts how many times the substring appears in the larger String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e or empty (\"\") String input returns \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.countMatches(null, *)       \u003d 0\n     * StringUtils.countMatches(\"\", *)         \u003d 0\n     * StringUtils.countMatches(\"abba\", null)  \u003d 0\n     * StringUtils.countMatches(\"abba\", \"\")    \u003d 0\n     * StringUtils.countMatches(\"abba\", \"a\")   \u003d 2\n     * StringUtils.countMatches(\"abba\", \"ab\")  \u003d 1\n     * StringUtils.countMatches(\"abba\", \"xxx\") \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param sub  the substring to count, may be null\n     * @return the number of occurrences, 0 if either String is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 5172,col 9)-(line 5174,col 9)",
        "(line 5175,col 9)-(line 5175,col 22)",
        "(line 5176,col 9)-(line 5176,col 20)",
        "(line 5177,col 9)-(line 5180,col 9)",
        "(line 5181,col 9)-(line 5181,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAlpha(java.lang.CharSequence)",
      "begin_line": 5205,
      "end_line": 5216,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only unicode letters.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty CharSequence (length()\u003d0) will return \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAlpha(null)   \u003d false\n     * StringUtils.isAlpha(\"\")     \u003d true\n     * StringUtils.isAlpha(\"  \")   \u003d false\n     * StringUtils.isAlpha(\"abc\")  \u003d true\n     * StringUtils.isAlpha(\"ab2c\") \u003d false\n     * StringUtils.isAlpha(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if only contains letters, and is non-null\n     * @since 3.0 Changed signature from isAlpha(String) to isAlpha(CharSequence)\n     ",
      "child_ranges": [
        "(line 5206,col 9)-(line 5208,col 9)",
        "(line 5209,col 9)-(line 5209,col 29)",
        "(line 5210,col 9)-(line 5214,col 9)",
        "(line 5215,col 9)-(line 5215,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAlphaSpace(java.lang.CharSequence)",
      "begin_line": 5240,
      "end_line": 5251,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only unicode letters and\n     * space (\u0027 \u0027).\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e\n     * An empty CharSequence (length()\u003d0) will return \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAlphaSpace(null)   \u003d false\n     * StringUtils.isAlphaSpace(\"\")     \u003d true\n     * StringUtils.isAlphaSpace(\"  \")   \u003d true\n     * StringUtils.isAlphaSpace(\"abc\")  \u003d true\n     * StringUtils.isAlphaSpace(\"ab c\") \u003d true\n     * StringUtils.isAlphaSpace(\"ab2c\") \u003d false\n     * StringUtils.isAlphaSpace(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if only contains letters and space,\n     *  and is non-null\n     * @since 3.0 Changed signature from isAlphaSpace(String) to isAlphaSpace(CharSequence)\n     ",
      "child_ranges": [
        "(line 5241,col 9)-(line 5243,col 9)",
        "(line 5244,col 9)-(line 5244,col 29)",
        "(line 5245,col 9)-(line 5249,col 9)",
        "(line 5250,col 9)-(line 5250,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAlphanumeric(java.lang.CharSequence)",
      "begin_line": 5274,
      "end_line": 5285,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only unicode letters or digits.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty CharSequence (length()\u003d0) will return \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAlphanumeric(null)   \u003d false\n     * StringUtils.isAlphanumeric(\"\")     \u003d true\n     * StringUtils.isAlphanumeric(\"  \")   \u003d false\n     * StringUtils.isAlphanumeric(\"abc\")  \u003d true\n     * StringUtils.isAlphanumeric(\"ab c\") \u003d false\n     * StringUtils.isAlphanumeric(\"ab2c\") \u003d true\n     * StringUtils.isAlphanumeric(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if only contains letters or digits,\n     *  and is non-null\n     * @since 3.0 Changed signature from isAlphanumeric(String) to isAlphanumeric(CharSequence)\n     ",
      "child_ranges": [
        "(line 5275,col 9)-(line 5277,col 9)",
        "(line 5278,col 9)-(line 5278,col 29)",
        "(line 5279,col 9)-(line 5283,col 9)",
        "(line 5284,col 9)-(line 5284,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAlphanumericSpace(java.lang.CharSequence)",
      "begin_line": 5309,
      "end_line": 5320,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only unicode letters, digits\n     * or space (\u003ccode\u003e\u0027 \u0027\u003c/code\u003e).\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty CharSequence (length()\u003d0) will return \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAlphanumeric(null)   \u003d false\n     * StringUtils.isAlphanumeric(\"\")     \u003d true\n     * StringUtils.isAlphanumeric(\"  \")   \u003d true\n     * StringUtils.isAlphanumeric(\"abc\")  \u003d true\n     * StringUtils.isAlphanumeric(\"ab c\") \u003d true\n     * StringUtils.isAlphanumeric(\"ab2c\") \u003d true\n     * StringUtils.isAlphanumeric(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if only contains letters, digits or space,\n     *  and is non-null\n     * @since 3.0 Changed signature from isAlphanumericSpace(String) to isAlphanumericSpace(CharSequence)\n     ",
      "child_ranges": [
        "(line 5310,col 9)-(line 5312,col 9)",
        "(line 5313,col 9)-(line 5313,col 29)",
        "(line 5314,col 9)-(line 5318,col 9)",
        "(line 5319,col 9)-(line 5319,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAsciiPrintable(java.lang.CharSequence)",
      "begin_line": 5348,
      "end_line": 5359,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only ASCII printable characters.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty CharSequence (length()\u003d0) will return \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAsciiPrintable(null)     \u003d false\n     * StringUtils.isAsciiPrintable(\"\")       \u003d true\n     * StringUtils.isAsciiPrintable(\" \")      \u003d true\n     * StringUtils.isAsciiPrintable(\"Ceki\")   \u003d true\n     * StringUtils.isAsciiPrintable(\"ab2c\")   \u003d true\n     * StringUtils.isAsciiPrintable(\"!ab-c~\") \u003d true\n     * StringUtils.isAsciiPrintable(\"\\u0020\") \u003d true\n     * StringUtils.isAsciiPrintable(\"\\u0021\") \u003d true\n     * StringUtils.isAsciiPrintable(\"\\u007e\") \u003d true\n     * StringUtils.isAsciiPrintable(\"\\u007f\") \u003d false\n     * StringUtils.isAsciiPrintable(\"Ceki G\\u00fclc\\u00fc\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs the CharSequence to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if every character is in the range\n     *  32 thru 126\n     * @since 2.1\n     * @since 3.0 Changed signature from isAsciiPrintable(String) to isAsciiPrintable(CharSequence)\n     ",
      "child_ranges": [
        "(line 5349,col 9)-(line 5351,col 9)",
        "(line 5352,col 9)-(line 5352,col 29)",
        "(line 5353,col 9)-(line 5357,col 9)",
        "(line 5358,col 9)-(line 5358,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isNumeric(java.lang.CharSequence)",
      "begin_line": 5383,
      "end_line": 5394,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only unicode digits.\n     * A decimal point is not a unicode digit and returns false.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty CharSequence (length()\u003d0) will return \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isNumeric(null)   \u003d false\n     * StringUtils.isNumeric(\"\")     \u003d true\n     * StringUtils.isNumeric(\"  \")   \u003d false\n     * StringUtils.isNumeric(\"123\")  \u003d true\n     * StringUtils.isNumeric(\"12 3\") \u003d false\n     * StringUtils.isNumeric(\"ab2c\") \u003d false\n     * StringUtils.isNumeric(\"12-3\") \u003d false\n     * StringUtils.isNumeric(\"12.3\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if only contains digits, and is non-null\n     * @since 3.0 Changed signature from isNumeric(String) to isNumeric(CharSequence)\n     ",
      "child_ranges": [
        "(line 5384,col 9)-(line 5386,col 9)",
        "(line 5387,col 9)-(line 5387,col 29)",
        "(line 5388,col 9)-(line 5392,col 9)",
        "(line 5393,col 9)-(line 5393,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isNumericSpace(java.lang.CharSequence)",
      "begin_line": 5420,
      "end_line": 5431,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only unicode digits or space\n     * (\u003ccode\u003e\u0027 \u0027\u003c/code\u003e).\n     * A decimal point is not a unicode digit and returns false.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty CharSequence (length()\u003d0) will return \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isNumeric(null)   \u003d false\n     * StringUtils.isNumeric(\"\")     \u003d true\n     * StringUtils.isNumeric(\"  \")   \u003d true\n     * StringUtils.isNumeric(\"123\")  \u003d true\n     * StringUtils.isNumeric(\"12 3\") \u003d true\n     * StringUtils.isNumeric(\"ab2c\") \u003d false\n     * StringUtils.isNumeric(\"12-3\") \u003d false\n     * StringUtils.isNumeric(\"12.3\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if only contains digits or space,\n     *  and is non-null\n     * @since 3.0 Changed signature from isNumericSpace(String) to isNumericSpace(CharSequence)\n     ",
      "child_ranges": [
        "(line 5421,col 9)-(line 5423,col 9)",
        "(line 5424,col 9)-(line 5424,col 29)",
        "(line 5425,col 9)-(line 5429,col 9)",
        "(line 5430,col 9)-(line 5430,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isWhitespace(java.lang.CharSequence)",
      "begin_line": 5453,
      "end_line": 5464,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only whitespace.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty CharSequence (length()\u003d0) will return \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isWhitespace(null)   \u003d false\n     * StringUtils.isWhitespace(\"\")     \u003d true\n     * StringUtils.isWhitespace(\"  \")   \u003d true\n     * StringUtils.isWhitespace(\"abc\")  \u003d false\n     * StringUtils.isWhitespace(\"ab2c\") \u003d false\n     * StringUtils.isWhitespace(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if only contains whitespace, and is non-null\n     * @since 2.0\n     * @since 3.0 Changed signature from isWhitespace(String) to isWhitespace(CharSequence)\n     ",
      "child_ranges": [
        "(line 5454,col 9)-(line 5456,col 9)",
        "(line 5457,col 9)-(line 5457,col 29)",
        "(line 5458,col 9)-(line 5462,col 9)",
        "(line 5463,col 9)-(line 5463,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAllLowerCase(java.lang.CharSequence)",
      "begin_line": 5485,
      "end_line": 5496,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only lowercase characters.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty CharSequence (length()\u003d0) will return \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAllLowerCase(null)   \u003d false\n     * StringUtils.isAllLowerCase(\"\")     \u003d false\n     * StringUtils.isAllLowerCase(\"  \")   \u003d false\n     * StringUtils.isAllLowerCase(\"abc\")  \u003d true\n     * StringUtils.isAllLowerCase(\"abC\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if only contains lowercase characters, and is non-null\n     * @since 2.5\n     * @since 3.0 Changed signature from isAllLowerCase(String) to isAllLowerCase(CharSequence)\n     ",
      "child_ranges": [
        "(line 5486,col 9)-(line 5488,col 9)",
        "(line 5489,col 9)-(line 5489,col 29)",
        "(line 5490,col 9)-(line 5494,col 9)",
        "(line 5495,col 9)-(line 5495,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAllUpperCase(java.lang.CharSequence)",
      "begin_line": 5517,
      "end_line": 5528,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only uppercase characters.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty String (length()\u003d0) will return \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAllUpperCase(null)   \u003d false\n     * StringUtils.isAllUpperCase(\"\")     \u003d false\n     * StringUtils.isAllUpperCase(\"  \")   \u003d false\n     * StringUtils.isAllUpperCase(\"ABC\")  \u003d true\n     * StringUtils.isAllUpperCase(\"aBC\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs the CharSequence to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if only contains uppercase characters, and is non-null\n     * @since 2.5\n     * @since 3.0 Changed signature from isAllUpperCase(String) to isAllUpperCase(CharSequence)\n     ",
      "child_ranges": [
        "(line 5518,col 9)-(line 5520,col 9)",
        "(line 5521,col 9)-(line 5521,col 29)",
        "(line 5522,col 9)-(line 5526,col 9)",
        "(line 5527,col 9)-(line 5527,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.defaultString(java.lang.String)",
      "begin_line": 5548,
      "end_line": 5550,
      "comment": "\n     * \u003cp\u003eReturns either the passed in String,\n     * or if the String is \u003ccode\u003enull\u003c/code\u003e, an empty String (\"\").\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.defaultString(null)  \u003d \"\"\n     * StringUtils.defaultString(\"\")    \u003d \"\"\n     * StringUtils.defaultString(\"bat\") \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @see ObjectUtils#toString(Object)\n     * @see String#valueOf(Object)\n     * @param str  the String to check, may be null\n     * @return the passed in String, or the empty String if it\n     *  was \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 5549,col 9)-(line 5549,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.defaultString(java.lang.String, java.lang.String)",
      "begin_line": 5569,
      "end_line": 5571,
      "comment": "\n     * \u003cp\u003eReturns either the passed in String, or if the String is\n     * \u003ccode\u003enull\u003c/code\u003e, the value of \u003ccode\u003edefaultStr\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.defaultString(null, \"NULL\")  \u003d \"NULL\"\n     * StringUtils.defaultString(\"\", \"NULL\")    \u003d \"\"\n     * StringUtils.defaultString(\"bat\", \"NULL\") \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @see ObjectUtils#toString(Object,String)\n     * @see String#valueOf(Object)\n     * @param str  the String to check, may be null\n     * @param defaultStr  the default String to return\n     *  if the input is \u003ccode\u003enull\u003c/code\u003e, may be null\n     * @return the passed in String, or the default if it was \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 5570,col 9)-(line 5570,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.defaultIfBlank(T, T)",
      "begin_line": 5591,
      "end_line": 5593,
      "comment": "\n     * \u003cp\u003eReturns either the passed in CharSequence, or if the CharSequence is\n     * whitespace, empty (\"\") or \u003ccode\u003enull\u003c/code\u003e, the value of \u003ccode\u003edefaultStr\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.defaultIfBlank(null, \"NULL\")  \u003d \"NULL\"\n     * StringUtils.defaultIfBlank(\"\", \"NULL\")    \u003d \"NULL\"\n     * StringUtils.defaultIfBlank(\" \", \"NULL\")   \u003d \"NULL\"\n     * StringUtils.defaultIfBlank(\"bat\", \"NULL\") \u003d \"bat\"\n     * StringUtils.defaultIfBlank(\"\", null)      \u003d null\n     * \u003c/pre\u003e\n     * @param \u003cT\u003e the specific kind of CharSequence\n     * @param str the CharSequence to check, may be null\n     * @param defaultStr  the default CharSequence to return\n     *  if the input is whitespace, empty (\"\") or \u003ccode\u003enull\u003c/code\u003e, may be null\n     * @return the passed in CharSequence, or the default\n     * @see StringUtils#defaultString(String, String)\n     ",
      "child_ranges": [
        "(line 5592,col 9)-(line 5592,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.defaultIfEmpty(T, T)",
      "begin_line": 5612,
      "end_line": 5614,
      "comment": "\n     * \u003cp\u003eReturns either the passed in CharSequence, or if the CharSequence is\n     * empty or \u003ccode\u003enull\u003c/code\u003e, the value of \u003ccode\u003edefaultStr\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.defaultIfEmpty(null, \"NULL\")  \u003d \"NULL\"\n     * StringUtils.defaultIfEmpty(\"\", \"NULL\")    \u003d \"NULL\"\n     * StringUtils.defaultIfEmpty(\"bat\", \"NULL\") \u003d \"bat\"\n     * StringUtils.defaultIfEmpty(\"\", null)      \u003d null\n     * \u003c/pre\u003e\n     * @param \u003cT\u003e the specific kind of CharSequence\n     * @param str  the CharSequence to check, may be null\n     * @param defaultStr  the default CharSequence to return\n     *  if the input is empty (\"\") or \u003ccode\u003enull\u003c/code\u003e, may be null\n     * @return the passed in CharSequence, or the default\n     * @see StringUtils#defaultString(String, String)\n     ",
      "child_ranges": [
        "(line 5613,col 9)-(line 5613,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.reverse(java.lang.String)",
      "begin_line": 5632,
      "end_line": 5637,
      "comment": "\n     * \u003cp\u003eReverses a String as per {@link StringBuilder#reverse()}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.reverse(null)  \u003d null\n     * StringUtils.reverse(\"\")    \u003d \"\"\n     * StringUtils.reverse(\"bat\") \u003d \"tab\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to reverse, may be null\n     * @return the reversed String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 5633,col 9)-(line 5635,col 9)",
        "(line 5636,col 9)-(line 5636,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.reverseDelimited(java.lang.String, char)",
      "begin_line": 5658,
      "end_line": 5667,
      "comment": "\n     * \u003cp\u003eReverses a String that is delimited by a specific character.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe Strings between the delimiters are not reversed.\n     * Thus java.lang.String becomes String.lang.java (if the delimiter\n     * is \u003ccode\u003e\u0027.\u0027\u003c/code\u003e).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.reverseDelimited(null, *)      \u003d null\n     * StringUtils.reverseDelimited(\"\", *)        \u003d \"\"\n     * StringUtils.reverseDelimited(\"a.b.c\", \u0027x\u0027) \u003d \"a.b.c\"\n     * StringUtils.reverseDelimited(\"a.b.c\", \".\") \u003d \"c.b.a\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to reverse, may be null\n     * @param separatorChar  the separator character to use\n     * @return the reversed String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 5659,col 9)-(line 5661,col 9)",
        "(line 5664,col 9)-(line 5664,col 50)",
        "(line 5665,col 9)-(line 5665,col 33)",
        "(line 5666,col 9)-(line 5666,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.abbreviate(java.lang.String, int)",
      "begin_line": 5703,
      "end_line": 5705,
      "comment": "\n     * \u003cp\u003eAbbreviates a String using ellipses. This will turn\n     * \"Now is the time for all good men\" into \"Now is the time for...\"\u003c/p\u003e\n     *\n     * \u003cp\u003eSpecifically:\n     * \u003cul\u003e\n     *   \u003cli\u003eIf \u003ccode\u003estr\u003c/code\u003e is less than \u003ccode\u003emaxWidth\u003c/code\u003e characters\n     *       long, return it.\u003c/li\u003e\n     *   \u003cli\u003eElse abbreviate it to \u003ccode\u003e(substring(str, 0, max-3) + \"...\")\u003c/code\u003e.\u003c/li\u003e\n     *   \u003cli\u003eIf \u003ccode\u003emaxWidth\u003c/code\u003e is less than \u003ccode\u003e4\u003c/code\u003e, throw an\n     *       \u003ccode\u003eIllegalArgumentException\u003c/code\u003e.\u003c/li\u003e\n     *   \u003cli\u003eIn no case will it return a String of length greater than\n     *       \u003ccode\u003emaxWidth\u003c/code\u003e.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.abbreviate(null, *)      \u003d null\n     * StringUtils.abbreviate(\"\", 4)        \u003d \"\"\n     * StringUtils.abbreviate(\"abcdefg\", 6) \u003d \"abc...\"\n     * StringUtils.abbreviate(\"abcdefg\", 7) \u003d \"abcdefg\"\n     * StringUtils.abbreviate(\"abcdefg\", 8) \u003d \"abcdefg\"\n     * StringUtils.abbreviate(\"abcdefg\", 4) \u003d \"a...\"\n     * StringUtils.abbreviate(\"abcdefg\", 3) \u003d IllegalArgumentException\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param maxWidth  maximum length of result String, must be at least 4\n     * @return abbreviated String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @throws IllegalArgumentException if the width is too small\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 5704,col 9)-(line 5704,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.abbreviate(java.lang.String, int, int)",
      "begin_line": 5742,
      "end_line": 5769,
      "comment": "\n     * \u003cp\u003eAbbreviates a String using ellipses. This will turn\n     * \"Now is the time for all good men\" into \"...is the time for...\"\u003c/p\u003e\n     *\n     * \u003cp\u003eWorks like \u003ccode\u003eabbreviate(String, int)\u003c/code\u003e, but allows you to specify\n     * a \"left edge\" offset.  Note that this left edge is not necessarily going to\n     * be the leftmost character in the result, or the first character following the\n     * ellipses, but it will appear somewhere in the result.\n     *\n     * \u003cp\u003eIn no case will it return a String of length greater than\n     * \u003ccode\u003emaxWidth\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.abbreviate(null, *, *)                \u003d null\n     * StringUtils.abbreviate(\"\", 0, 4)                  \u003d \"\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", -1, 10) \u003d \"abcdefg...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 0, 10)  \u003d \"abcdefg...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 1, 10)  \u003d \"abcdefg...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 4, 10)  \u003d \"abcdefg...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 5, 10)  \u003d \"...fghi...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 6, 10)  \u003d \"...ghij...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 8, 10)  \u003d \"...ijklmno\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 10, 10) \u003d \"...ijklmno\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 12, 10) \u003d \"...ijklmno\"\n     * StringUtils.abbreviate(\"abcdefghij\", 0, 3)        \u003d IllegalArgumentException\n     * StringUtils.abbreviate(\"abcdefghij\", 5, 6)        \u003d IllegalArgumentException\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param offset  left edge of source String\n     * @param maxWidth  maximum length of result String, must be at least 4\n     * @return abbreviated String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @throws IllegalArgumentException if the width is too small\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 5743,col 9)-(line 5745,col 9)",
        "(line 5746,col 9)-(line 5748,col 9)",
        "(line 5749,col 9)-(line 5751,col 9)",
        "(line 5752,col 9)-(line 5754,col 9)",
        "(line 5755,col 9)-(line 5757,col 9)",
        "(line 5758,col 9)-(line 5758,col 41)",
        "(line 5759,col 9)-(line 5761,col 9)",
        "(line 5762,col 9)-(line 5764,col 9)",
        "(line 5765,col 9)-(line 5767,col 9)",
        "(line 5768,col 9)-(line 5768,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.abbreviateMiddle(java.lang.String, java.lang.String, int)",
      "begin_line": 5800,
      "end_line": 5819,
      "comment": "\n     * \u003cp\u003eAbbreviates a String to the length passed, replacing the middle characters with the supplied\n     * replacement String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis abbreviation only occurs if the following criteria is met:\n     * \u003cul\u003e\n     * \u003cli\u003eNeither the String for abbreviation nor the replacement String are null or empty \u003c/li\u003e\n     * \u003cli\u003eThe length to truncate to is less than the length of the supplied String\u003c/li\u003e\n     * \u003cli\u003eThe length to truncate to is greater than 0\u003c/li\u003e\n     * \u003cli\u003eThe abbreviated String will have enough room for the length supplied replacement String\n     * and the first and last characters of the supplied String for abbreviation\u003c/li\u003e\n     * \u003c/ul\u003e\n     * Otherwise, the returned String will be the same as the supplied String for abbreviation.\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.abbreviateMiddle(null, null, 0)      \u003d null\n     * StringUtils.abbreviateMiddle(\"abc\", null, 0)      \u003d \"abc\"\n     * StringUtils.abbreviateMiddle(\"abc\", \".\", 0)      \u003d \"abc\"\n     * StringUtils.abbreviateMiddle(\"abc\", \".\", 3)      \u003d \"abc\"\n     * StringUtils.abbreviateMiddle(\"abcdef\", \".\", 4)     \u003d \"ab.f\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to abbreviate, may be null\n     * @param middle the String to replace the middle characters with, may be null\n     * @param length the length to abbreviate \u003ccode\u003estr\u003c/code\u003e to.\n     * @return the abbreviated String if the above criteria is met, or the original String supplied for abbreviation.\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 5801,col 9)-(line 5803,col 9)",
        "(line 5805,col 9)-(line 5807,col 9)",
        "(line 5809,col 9)-(line 5809,col 49)",
        "(line 5810,col 9)-(line 5810,col 54)",
        "(line 5811,col 9)-(line 5811,col 51)",
        "(line 5813,col 9)-(line 5813,col 58)",
        "(line 5814,col 9)-(line 5814,col 53)",
        "(line 5815,col 9)-(line 5815,col 31)",
        "(line 5816,col 9)-(line 5816,col 49)",
        "(line 5818,col 9)-(line 5818,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.difference(java.lang.String, java.lang.String)",
      "begin_line": 5848,
      "end_line": 5860,
      "comment": "\n     * \u003cp\u003eCompares two Strings, and returns the portion where they differ.\n     * (More precisely, return the remainder of the second String,\n     * starting from where it\u0027s different from the first.)\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example,\n     * \u003ccode\u003edifference(\"i am a machine\", \"i am a robot\") -\u003e \"robot\"\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.difference(null, null) \u003d null\n     * StringUtils.difference(\"\", \"\") \u003d \"\"\n     * StringUtils.difference(\"\", \"abc\") \u003d \"abc\"\n     * StringUtils.difference(\"abc\", \"\") \u003d \"\"\n     * StringUtils.difference(\"abc\", \"abc\") \u003d \"\"\n     * StringUtils.difference(\"ab\", \"abxyz\") \u003d \"xyz\"\n     * StringUtils.difference(\"abcde\", \"abxyz\") \u003d \"xyz\"\n     * StringUtils.difference(\"abcde\", \"xyz\") \u003d \"xyz\"\n     * \u003c/pre\u003e\n     *\n     * @param str1  the first String, may be null\n     * @param str2  the second String, may be null\n     * @return the portion of str2 where it differs from str1; returns the\n     * empty String if they are equal\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 5849,col 9)-(line 5851,col 9)",
        "(line 5852,col 9)-(line 5854,col 9)",
        "(line 5855,col 9)-(line 5855,col 47)",
        "(line 5856,col 9)-(line 5858,col 9)",
        "(line 5859,col 9)-(line 5859,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfDifference(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 5886,
      "end_line": 5903,
      "comment": "\n     * \u003cp\u003eCompares two CharSequences, and returns the index at which the\n     * CharSequences begin to differ.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example,\n     * \u003ccode\u003eindexOfDifference(\"i am a machine\", \"i am a robot\") -\u003e 7\u003c/code\u003e\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfDifference(null, null) \u003d -1\n     * StringUtils.indexOfDifference(\"\", \"\") \u003d -1\n     * StringUtils.indexOfDifference(\"\", \"abc\") \u003d 0\n     * StringUtils.indexOfDifference(\"abc\", \"\") \u003d 0\n     * StringUtils.indexOfDifference(\"abc\", \"abc\") \u003d -1\n     * StringUtils.indexOfDifference(\"ab\", \"abxyz\") \u003d 2\n     * StringUtils.indexOfDifference(\"abcde\", \"abxyz\") \u003d 2\n     * StringUtils.indexOfDifference(\"abcde\", \"xyz\") \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param cs1  the first CharSequence, may be null\n     * @param cs2  the second CharSequence, may be null\n     * @return the index where cs1 and cs2 begin to differ; -1 if they are equal\n     * @since 2.0\n     * @since 3.0 Changed signature from indexOfDifference(String, String) to indexOfDifference(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 5887,col 9)-(line 5889,col 9)",
        "(line 5890,col 9)-(line 5892,col 9)",
        "(line 5893,col 9)-(line 5893,col 14)",
        "(line 5894,col 9)-(line 5898,col 9)",
        "(line 5899,col 9)-(line 5901,col 9)",
        "(line 5902,col 9)-(line 5902,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfDifference(java.lang.CharSequence...)",
      "begin_line": 5937,
      "end_line": 5993,
      "comment": "\n     * \u003cp\u003eCompares all CharSequences in an array and returns the index at which the\n     * CharSequences begin to differ.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example,\n     * \u003ccode\u003eindexOfDifference(new String[] {\"i am a machine\", \"i am a robot\"}) -\u003e 7\u003c/code\u003e\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfDifference(null) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {}) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {\"abc\"}) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {null, null}) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {\"\", \"\"}) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {\"\", null}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"abc\", null, null}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {null, null, \"abc\"}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"\", \"abc\"}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"abc\", \"\"}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"abc\", \"abc\"}) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {\"abc\", \"a\"}) \u003d 1\n     * StringUtils.indexOfDifference(new String[] {\"ab\", \"abxyz\"}) \u003d 2\n     * StringUtils.indexOfDifference(new String[] {\"abcde\", \"abxyz\"}) \u003d 2\n     * StringUtils.indexOfDifference(new String[] {\"abcde\", \"xyz\"}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"xyz\", \"abcde\"}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"i am a machine\", \"i am a robot\"}) \u003d 7\n     * \u003c/pre\u003e\n     *\n     * @param css  array of CharSequences, entries may be null\n     * @return the index where the strings begin to differ; -1 if they are all equal\n     * @since 2.4\n     * @since 3.0 Changed signature from indexOfDifference(String...) to indexOfDifference(CharSequence...)\n     ",
      "child_ranges": [
        "(line 5938,col 9)-(line 5940,col 9)",
        "(line 5941,col 9)-(line 5941,col 38)",
        "(line 5942,col 9)-(line 5942,col 38)",
        "(line 5943,col 9)-(line 5943,col 34)",
        "(line 5944,col 9)-(line 5944,col 47)",
        "(line 5945,col 9)-(line 5945,col 30)",
        "(line 5950,col 9)-(line 5959,col 9)",
        "(line 5962,col 9)-(line 5964,col 9)",
        "(line 5967,col 9)-(line 5969,col 9)",
        "(line 5972,col 9)-(line 5972,col 27)",
        "(line 5973,col 9)-(line 5984,col 9)",
        "(line 5986,col 9)-(line 5991,col 9)",
        "(line 5992,col 9)-(line 5992,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.getCommonPrefix(java.lang.String...)",
      "begin_line": 6028,
      "end_line": 6046,
      "comment": "\n     * \u003cp\u003eCompares all Strings in an array and returns the initial sequence of\n     * characters that is common to all of them.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example,\n     * \u003ccode\u003egetCommonPrefix(new String[] {\"i am a machine\", \"i am a robot\"}) -\u003e \"i am a \"\u003c/code\u003e\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.getCommonPrefix(null) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"abc\"}) \u003d \"abc\"\n     * StringUtils.getCommonPrefix(new String[] {null, null}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"\", \"\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"\", null}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"abc\", null, null}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {null, null, \"abc\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"\", \"abc\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"abc\", \"\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"abc\", \"abc\"}) \u003d \"abc\"\n     * StringUtils.getCommonPrefix(new String[] {\"abc\", \"a\"}) \u003d \"a\"\n     * StringUtils.getCommonPrefix(new String[] {\"ab\", \"abxyz\"}) \u003d \"ab\"\n     * StringUtils.getCommonPrefix(new String[] {\"abcde\", \"abxyz\"}) \u003d \"ab\"\n     * StringUtils.getCommonPrefix(new String[] {\"abcde\", \"xyz\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"xyz\", \"abcde\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"i am a machine\", \"i am a robot\"}) \u003d \"i am a \"\n     * \u003c/pre\u003e\n     *\n     * @param strs  array of String objects, entries may be null\n     * @return the initial sequence of characters that are common to all Strings\n     * in the array; empty String if the array is null, the elements are all null\n     * or if there is no common prefix.\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 6029,col 9)-(line 6031,col 9)",
        "(line 6032,col 9)-(line 6032,col 58)",
        "(line 6033,col 9)-(line 6045,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.getLevenshteinDistance(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 6085,
      "end_line": 6160,
      "comment": "\n     * \u003cp\u003eFind the Levenshtein distance between two Strings.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is the number of changes needed to change one String into\n     * another, where each change is a single character modification (deletion,\n     * insertion or substitution).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe previous implementation of the Levenshtein distance algorithm\n     * was from \u003ca href\u003d\"http://www.merriampark.com/ld.htm\"\u003ehttp://www.merriampark.com/ld.htm\u003c/a\u003e\u003c/p\u003e\n     *\n     * \u003cp\u003eChas Emerick has written an implementation in Java, which avoids an OutOfMemoryError\n     * which can occur when my Java implementation is used with very large strings.\u003cbr\u003e\n     * This implementation of the Levenshtein distance algorithm\n     * is from \u003ca href\u003d\"http://www.merriampark.com/ldjava.htm\"\u003ehttp://www.merriampark.com/ldjava.htm\u003c/a\u003e\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.getLevenshteinDistance(null, *)             \u003d IllegalArgumentException\n     * StringUtils.getLevenshteinDistance(*, null)             \u003d IllegalArgumentException\n     * StringUtils.getLevenshteinDistance(\"\",\"\")               \u003d 0\n     * StringUtils.getLevenshteinDistance(\"\",\"a\")              \u003d 1\n     * StringUtils.getLevenshteinDistance(\"aaapppp\", \"\")       \u003d 7\n     * StringUtils.getLevenshteinDistance(\"frog\", \"fog\")       \u003d 1\n     * StringUtils.getLevenshteinDistance(\"fly\", \"ant\")        \u003d 3\n     * StringUtils.getLevenshteinDistance(\"elephant\", \"hippo\") \u003d 7\n     * StringUtils.getLevenshteinDistance(\"hippo\", \"elephant\") \u003d 7\n     * StringUtils.getLevenshteinDistance(\"hippo\", \"zzzzzzzz\") \u003d 8\n     * StringUtils.getLevenshteinDistance(\"hello\", \"hallo\")    \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @param s  the first String, must not be null\n     * @param t  the second String, must not be null\n     * @return result distance\n     * @throws IllegalArgumentException if either String input \u003ccode\u003enull\u003c/code\u003e\n     * @since 3.0 Changed signature from getLevenshteinDistance(String, String) to getLevenshteinDistance(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 6086,col 9)-(line 6088,col 9)",
        "(line 6107,col 9)-(line 6107,col 27)",
        "(line 6108,col 9)-(line 6108,col 27)",
        "(line 6110,col 9)-(line 6114,col 9)",
        "(line 6116,col 9)-(line 6123,col 9)",
        "(line 6125,col 9)-(line 6125,col 31)",
        "(line 6126,col 9)-(line 6126,col 31)",
        "(line 6127,col 9)-(line 6127,col 17)",
        "(line 6130,col 9)-(line 6130,col 14)",
        "(line 6131,col 9)-(line 6131,col 14)",
        "(line 6133,col 9)-(line 6133,col 17)",
        "(line 6135,col 9)-(line 6135,col 17)",
        "(line 6137,col 9)-(line 6139,col 9)",
        "(line 6141,col 9)-(line 6155,col 9)",
        "(line 6159,col 9)-(line 6159,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.startsWith(java.lang.String, java.lang.String)",
      "begin_line": 6186,
      "end_line": 6188,
      "comment": "\n     * \u003cp\u003eCheck if a String starts with a specified prefix.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003es are handled without exceptions. Two \u003ccode\u003enull\u003c/code\u003e\n     * references are considered to be equal. The comparison is case sensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.startsWith(null, null)      \u003d true\n     * StringUtils.startsWith(null, \"abc\")     \u003d false\n     * StringUtils.startsWith(\"abcdef\", null)  \u003d false\n     * StringUtils.startsWith(\"abcdef\", \"abc\") \u003d true\n     * StringUtils.startsWith(\"ABCDEF\", \"abc\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#startsWith(String)\n     * @param str  the String to check, may be null\n     * @param prefix the prefix to find, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the String starts with the prefix, case sensitive, or\n     *  both \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 6187,col 9)-(line 6187,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 6211,
      "end_line": 6213,
      "comment": "\n     * \u003cp\u003eCase insensitive check if a String starts with a specified prefix.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003es are handled without exceptions. Two \u003ccode\u003enull\u003c/code\u003e\n     * references are considered to be equal. The comparison is case insensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.startsWithIgnoreCase(null, null)      \u003d true\n     * StringUtils.startsWithIgnoreCase(null, \"abc\")     \u003d false\n     * StringUtils.startsWithIgnoreCase(\"abcdef\", null)  \u003d false\n     * StringUtils.startsWithIgnoreCase(\"abcdef\", \"abc\") \u003d true\n     * StringUtils.startsWithIgnoreCase(\"ABCDEF\", \"abc\") \u003d true\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#startsWith(String)\n     * @param str  the String to check, may be null\n     * @param prefix the prefix to find, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the String starts with the prefix, case insensitive, or\n     *  both \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 6212,col 9)-(line 6212,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.startsWith(java.lang.String, java.lang.String, boolean)",
      "begin_line": 6226,
      "end_line": 6234,
      "comment": "\n     * \u003cp\u003eCheck if a String starts with a specified prefix (optionally case insensitive).\u003c/p\u003e\n     *\n     * @see java.lang.String#startsWith(String)\n     * @param str  the String to check, may be null\n     * @param prefix the prefix to find, may be null\n     * @param ignoreCase inidicates whether the compare should ignore case\n     *  (case insensitive) or not.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the String starts with the prefix or\n     *  both \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 6227,col 9)-(line 6229,col 9)",
        "(line 6230,col 9)-(line 6232,col 9)",
        "(line 6233,col 9)-(line 6233,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.startsWithAny(java.lang.String, java.lang.String...)",
      "begin_line": 6254,
      "end_line": 6265,
      "comment": "\n     * \u003cp\u003eCheck if a String starts with any of an array of specified strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.startsWithAny(null, null)      \u003d false\n     * StringUtils.startsWithAny(null, new String[] {\"abc\"})  \u003d false\n     * StringUtils.startsWithAny(\"abcxyz\", null)     \u003d false\n     * StringUtils.startsWithAny(\"abcxyz\", new String[] {\"\"}) \u003d false\n     * StringUtils.startsWithAny(\"abcxyz\", new String[] {\"abc\"}) \u003d true\n     * StringUtils.startsWithAny(\"abcxyz\", new String[] {null, \"xyz\", \"abc\"}) \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param string  the String to check, may be null\n     * @param searchStrings the Strings to find, may be null or empty\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the String starts with any of the the prefixes, case insensitive, or\n     *  both \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 6255,col 9)-(line 6257,col 9)",
        "(line 6258,col 9)-(line 6263,col 9)",
        "(line 6264,col 9)-(line 6264,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.endsWith(java.lang.String, java.lang.String)",
      "begin_line": 6292,
      "end_line": 6294,
      "comment": "\n     * \u003cp\u003eCheck if a String ends with a specified suffix.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003es are handled without exceptions. Two \u003ccode\u003enull\u003c/code\u003e\n     * references are considered to be equal. The comparison is case sensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.endsWith(null, null)      \u003d true\n     * StringUtils.endsWith(null, \"def\")     \u003d false\n     * StringUtils.endsWith(\"abcdef\", null)  \u003d false\n     * StringUtils.endsWith(\"abcdef\", \"def\") \u003d true\n     * StringUtils.endsWith(\"ABCDEF\", \"def\") \u003d false\n     * StringUtils.endsWith(\"ABCDEF\", \"cde\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#endsWith(String)\n     * @param str  the String to check, may be null\n     * @param suffix the suffix to find, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the String ends with the suffix, case sensitive, or\n     *  both \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 6293,col 9)-(line 6293,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 6318,
      "end_line": 6320,
      "comment": "\n     * \u003cp\u003eCase insensitive check if a String ends with a specified suffix.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003es are handled without exceptions. Two \u003ccode\u003enull\u003c/code\u003e\n     * references are considered to be equal. The comparison is case insensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.endsWithIgnoreCase(null, null)      \u003d true\n     * StringUtils.endsWithIgnoreCase(null, \"def\")     \u003d false\n     * StringUtils.endsWithIgnoreCase(\"abcdef\", null)  \u003d false\n     * StringUtils.endsWithIgnoreCase(\"abcdef\", \"def\") \u003d true\n     * StringUtils.endsWithIgnoreCase(\"ABCDEF\", \"def\") \u003d true\n     * StringUtils.endsWithIgnoreCase(\"ABCDEF\", \"cde\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#endsWith(String)\n     * @param str  the String to check, may be null\n     * @param suffix the suffix to find, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the String ends with the suffix, case insensitive, or\n     *  both \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 6319,col 9)-(line 6319,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.endsWith(java.lang.String, java.lang.String, boolean)",
      "begin_line": 6333,
      "end_line": 6342,
      "comment": "\n     * \u003cp\u003eCheck if a String ends with a specified suffix (optionally case insensitive).\u003c/p\u003e\n     *\n     * @see java.lang.String#endsWith(String)\n     * @param str  the String to check, may be null\n     * @param suffix the suffix to find, may be null\n     * @param ignoreCase inidicates whether the compare should ignore case\n     *  (case insensitive) or not.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the String starts with the prefix or\n     *  both \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 6334,col 9)-(line 6336,col 9)",
        "(line 6337,col 9)-(line 6339,col 9)",
        "(line 6340,col 9)-(line 6340,col 55)",
        "(line 6341,col 9)-(line 6341,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.normalizeSpace(java.lang.String)",
      "begin_line": 6385,
      "end_line": 6390,
      "comment": "\n     * \u003cp\u003e\n     * Similar to \u003ca\n     * href\u003d\"http://www.w3.org/TR/xpath/#function-normalize-space\"\u003ehttp://www.w3.org/TR/xpath/#function-normalize\n     * -space\u003c/a\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The function returns the argument string with whitespace normalized by using\n     * \u003ccode\u003e{@link #trim(String)}\u003c/code\u003e to remove leading and trailing whitespace\n     * and then replacing sequences of whitespace characters by a single space.\n     * \u003c/p\u003e\n     * In XML Whitespace characters are the same as those allowed by the \u003ca\n     * href\u003d\"http://www.w3.org/TR/REC-xml/#NT-S\"\u003eS\u003c/a\u003e production, which is S ::\u003d (#x20 | #x9 | #xD | #xA)+\n     * \u003cp\u003e\n     * Java\u0027s regexp pattern \\s defines whitespace as [ \\t\\n\\x0B\\f\\r]\n     * \u003cp\u003e\n     * For reference:\n     * \u003cul\u003e\n     * \u003cli\u003e\\x0B \u003d vertical tab\u003c/li\u003e\n     * \u003cli\u003e\\f \u003d #xC \u003d form feed\u003c/li\u003e\n     * \u003cli\u003e#x20 \u003d space\u003c/li\u003e\n     * \u003cli\u003e#x9 \u003d \\t\u003c/li\u003e\n     * \u003cli\u003e#xA \u003d \\n\u003c/li\u003e\n     * \u003cli\u003e#xD \u003d \\r\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The difference is that Java\u0027s whitespace includes vertical tab and form feed, which this functional will also\n     * normalize. Additonally \u003ccode\u003e{@link #trim(String)}\u003c/code\u003e removes control characters (char \u0026lt;\u003d 32) from both\n     * ends of this String.\n     * \u003c/p\u003e\n     * \n     * @see Pattern\n     * @see #trim(String)\n     * @see \u003ca\n     *      href\u003d\"http://www.w3.org/TR/xpath/#function-normalize-space\"\u003ehttp://www.w3.org/TR/xpath/#function-normalize-space\u003c/a\u003e\n     * @param str the source String to normalize whitespaces from, may be null\n     * @return the modified string with whitespace normalized, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * \n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 6386,col 9)-(line 6388,col 9)",
        "(line 6389,col 9)-(line 6389,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.endsWithAny(java.lang.String, java.lang.String...)",
      "begin_line": 6410,
      "end_line": 6421,
      "comment": "\n     * \u003cp\u003eCheck if a String ends with any of an array of specified strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.endsWithAny(null, null)      \u003d false\n     * StringUtils.endsWithAny(null, new String[] {\"abc\"})  \u003d false\n     * StringUtils.endsWithAny(\"abcxyz\", null)     \u003d false\n     * StringUtils.endsWithAny(\"abcxyz\", new String[] {\"\"}) \u003d true\n     * StringUtils.endsWithAny(\"abcxyz\", new String[] {\"xyz\"}) \u003d true\n     * StringUtils.endsWithAny(\"abcxyz\", new String[] {null, \"xyz\", \"abc\"}) \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param string  the String to check, may be null\n     * @param searchStrings the Strings to find, may be null or empty\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the String ends with any of the the prefixes, case insensitive, or\n     *  both \u003ccode\u003enull\u003c/code\u003e\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 6411,col 9)-(line 6413,col 9)",
        "(line 6414,col 9)-(line 6419,col 9)",
        "(line 6420,col 9)-(line 6420,col 21)"
      ]
    }
  ]
}