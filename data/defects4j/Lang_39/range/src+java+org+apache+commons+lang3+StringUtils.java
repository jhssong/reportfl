{
  "filepath": "/tmp/Lang-39b/src/java/org/apache/commons/lang3/StringUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StringUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 124,
      "end_line": 5837,
      "comment": "@Immutable"
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": "\n     * The empty String \u003ccode\u003e\"\"\u003c/code\u003e.\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INDEX_NOT_FOUND"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": "\n     * Represents a failed index search.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PAD_LIMIT"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": "\n     * \u003cp\u003eThe maximum size to which the padding constant(s) can expand.\u003c/p\u003e\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.StringUtils.StringUtils()",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eStringUtils\u003c/code\u003e instances should NOT be constructed in\n     * standard programming. Instead, the class should be used as\n     * \u003ccode\u003eStringUtils.trim(\" foo \");\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isEmpty(java.lang.CharSequence)",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * \u003cp\u003eChecks if a String is empty (\"\") or null.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isEmpty(null)      \u003d true\n     * StringUtils.isEmpty(\"\")        \u003d true\n     * StringUtils.isEmpty(\" \")       \u003d false\n     * StringUtils.isEmpty(\"bob\")     \u003d false\n     * StringUtils.isEmpty(\"  bob  \") \u003d false\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eNOTE: This method changed in Lang version 2.0.\n     * It no longer trims the String.\n     * That functionality is available in isBlank().\u003c/p\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the String is empty or null\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isNotEmpty(java.lang.CharSequence)",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\n     * \u003cp\u003eChecks if a String is not empty (\"\") and not null.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isNotEmpty(null)      \u003d false\n     * StringUtils.isNotEmpty(\"\")        \u003d false\n     * StringUtils.isNotEmpty(\" \")       \u003d true\n     * StringUtils.isNotEmpty(\"bob\")     \u003d true\n     * StringUtils.isNotEmpty(\"  bob  \") \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the String is not empty and not null\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isBlank(java.lang.CharSequence)",
      "begin_line": 227,
      "end_line": 238,
      "comment": "\n     * \u003cp\u003eChecks if a String is whitespace, empty (\"\") or null.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isBlank(null)      \u003d true\n     * StringUtils.isBlank(\"\")        \u003d true\n     * StringUtils.isBlank(\" \")       \u003d true\n     * StringUtils.isBlank(\"bob\")     \u003d false\n     * StringUtils.isBlank(\"  bob  \") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the String is null, empty or whitespace\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 19)",
        "(line 229,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 237,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isNotBlank(java.lang.CharSequence)",
      "begin_line": 256,
      "end_line": 258,
      "comment": "\n     * \u003cp\u003eChecks if a String is not empty (\"\"), not null and not whitespace only.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isNotBlank(null)      \u003d false\n     * StringUtils.isNotBlank(\"\")        \u003d false\n     * StringUtils.isNotBlank(\" \")       \u003d false\n     * StringUtils.isNotBlank(\"bob\")     \u003d true\n     * StringUtils.isNotBlank(\"  bob  \") \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the String is\n     *  not empty and not null and not whitespace\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.trim(java.lang.String)",
      "begin_line": 285,
      "end_line": 287,
      "comment": "\n     * \u003cp\u003eRemoves control characters (char \u0026lt;\u003d 32) from both\n     * ends of this String, handling \u003ccode\u003enull\u003c/code\u003e by returning\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is trimmed using {@link String#trim()}.\n     * Trim removes start and end characters \u0026lt;\u003d 32.\n     * To strip whitespace use {@link #strip(String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eTo trim your choice of characters, use the\n     * {@link #strip(String, String)} methods.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.trim(null)          \u003d null\n     * StringUtils.trim(\"\")            \u003d \"\"\n     * StringUtils.trim(\"     \")       \u003d \"\"\n     * StringUtils.trim(\"abc\")         \u003d \"abc\"\n     * StringUtils.trim(\"    abc    \") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be trimmed, may be null\n     * @return the trimmed string, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.trimToNull(java.lang.String)",
      "begin_line": 311,
      "end_line": 314,
      "comment": "\n     * \u003cp\u003eRemoves control characters (char \u0026lt;\u003d 32) from both\n     * ends of this String returning \u003ccode\u003enull\u003c/code\u003e if the String is\n     * empty (\"\") after the trim or if it is \u003ccode\u003enull\u003c/code\u003e.\n     *\n     * \u003cp\u003eThe String is trimmed using {@link String#trim()}.\n     * Trim removes start and end characters \u0026lt;\u003d 32.\n     * To strip whitespace use {@link #stripToNull(String)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.trimToNull(null)          \u003d null\n     * StringUtils.trimToNull(\"\")            \u003d null\n     * StringUtils.trimToNull(\"     \")       \u003d null\n     * StringUtils.trimToNull(\"abc\")         \u003d \"abc\"\n     * StringUtils.trimToNull(\"    abc    \") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be trimmed, may be null\n     * @return the trimmed String,\n     *  \u003ccode\u003enull\u003c/code\u003e if only chars \u0026lt;\u003d 32, empty or null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 30)",
        "(line 313,col 9)-(line 313,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.trimToEmpty(java.lang.String)",
      "begin_line": 337,
      "end_line": 339,
      "comment": "\n     * \u003cp\u003eRemoves control characters (char \u0026lt;\u003d 32) from both\n     * ends of this String returning an empty String (\"\") if the String\n     * is empty (\"\") after the trim or if it is \u003ccode\u003enull\u003c/code\u003e.\n     *\n     * \u003cp\u003eThe String is trimmed using {@link String#trim()}.\n     * Trim removes start and end characters \u0026lt;\u003d 32.\n     * To strip whitespace use {@link #stripToEmpty(String)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.trimToEmpty(null)          \u003d \"\"\n     * StringUtils.trimToEmpty(\"\")            \u003d \"\"\n     * StringUtils.trimToEmpty(\"     \")       \u003d \"\"\n     * StringUtils.trimToEmpty(\"abc\")         \u003d \"abc\"\n     * StringUtils.trimToEmpty(\"    abc    \") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be trimmed, may be null\n     * @return the trimmed String, or an empty String if \u003ccode\u003enull\u003c/code\u003e input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.strip(java.lang.String)",
      "begin_line": 365,
      "end_line": 367,
      "comment": "\n     * \u003cp\u003eStrips whitespace from the start and end of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is similar to {@link #trim(String)} but removes whitespace.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.strip(null)     \u003d null\n     * StringUtils.strip(\"\")       \u003d \"\"\n     * StringUtils.strip(\"   \")    \u003d \"\"\n     * StringUtils.strip(\"abc\")    \u003d \"abc\"\n     * StringUtils.strip(\"  abc\")  \u003d \"abc\"\n     * StringUtils.strip(\"abc  \")  \u003d \"abc\"\n     * StringUtils.strip(\" abc \")  \u003d \"abc\"\n     * StringUtils.strip(\" ab c \") \u003d \"ab c\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to remove whitespace from, may be null\n     * @return the stripped String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.stripToNull(java.lang.String)",
      "begin_line": 392,
      "end_line": 398,
      "comment": "\n     * \u003cp\u003eStrips whitespace from the start and end of a String  returning\n     * \u003ccode\u003enull\u003c/code\u003e if the String is empty (\"\") after the strip.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is similar to {@link #trimToNull(String)} but removes whitespace.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripToNull(null)     \u003d null\n     * StringUtils.stripToNull(\"\")       \u003d null\n     * StringUtils.stripToNull(\"   \")    \u003d null\n     * StringUtils.stripToNull(\"abc\")    \u003d \"abc\"\n     * StringUtils.stripToNull(\"  abc\")  \u003d \"abc\"\n     * StringUtils.stripToNull(\"abc  \")  \u003d \"abc\"\n     * StringUtils.stripToNull(\" abc \")  \u003d \"abc\"\n     * StringUtils.stripToNull(\" ab c \") \u003d \"ab c\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be stripped, may be null\n     * @return the stripped String,\n     *  \u003ccode\u003enull\u003c/code\u003e if whitespace, empty or null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 396,col 31)",
        "(line 397,col 9)-(line 397,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.stripToEmpty(java.lang.String)",
      "begin_line": 422,
      "end_line": 424,
      "comment": "\n     * \u003cp\u003eStrips whitespace from the start and end of a String  returning\n     * an empty String if \u003ccode\u003enull\u003c/code\u003e input.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is similar to {@link #trimToEmpty(String)} but removes whitespace.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripToEmpty(null)     \u003d \"\"\n     * StringUtils.stripToEmpty(\"\")       \u003d \"\"\n     * StringUtils.stripToEmpty(\"   \")    \u003d \"\"\n     * StringUtils.stripToEmpty(\"abc\")    \u003d \"abc\"\n     * StringUtils.stripToEmpty(\"  abc\")  \u003d \"abc\"\n     * StringUtils.stripToEmpty(\"abc  \")  \u003d \"abc\"\n     * StringUtils.stripToEmpty(\" abc \")  \u003d \"abc\"\n     * StringUtils.stripToEmpty(\" ab c \") \u003d \"ab c\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be stripped, may be null\n     * @return the trimmed String, or an empty String if \u003ccode\u003enull\u003c/code\u003e input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.strip(java.lang.String, java.lang.String)",
      "begin_line": 452,
      "end_line": 458,
      "comment": "\n     * \u003cp\u003eStrips any of a set of characters from the start and end of a String.\n     * This is similar to {@link String#trim()} but allows the characters\n     * to be stripped to be controlled.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * An empty string (\"\") input returns the empty string.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the stripChars String is \u003ccode\u003enull\u003c/code\u003e, whitespace is\n     * stripped as defined by {@link Character#isWhitespace(char)}.\n     * Alternatively use {@link #strip(String)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.strip(null, *)          \u003d null\n     * StringUtils.strip(\"\", *)            \u003d \"\"\n     * StringUtils.strip(\"abc\", null)      \u003d \"abc\"\n     * StringUtils.strip(\"  abc\", null)    \u003d \"abc\"\n     * StringUtils.strip(\"abc  \", null)    \u003d \"abc\"\n     * StringUtils.strip(\" abc \", null)    \u003d \"abc\"\n     * StringUtils.strip(\"  abcyx\", \"xyz\") \u003d \"  abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to remove characters from, may be null\n     * @param stripChars  the characters to remove, null treated as whitespace\n     * @return the stripped String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 455,col 9)",
        "(line 456,col 9)-(line 456,col 42)",
        "(line 457,col 9)-(line 457,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.stripStart(java.lang.String, java.lang.String)",
      "begin_line": 484,
      "end_line": 502,
      "comment": "\n     * \u003cp\u003eStrips any of a set of characters from the start of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * An empty string (\"\") input returns the empty string.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the stripChars String is \u003ccode\u003enull\u003c/code\u003e, whitespace is\n     * stripped as defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripStart(null, *)          \u003d null\n     * StringUtils.stripStart(\"\", *)            \u003d \"\"\n     * StringUtils.stripStart(\"abc\", \"\")        \u003d \"abc\"\n     * StringUtils.stripStart(\"abc\", null)      \u003d \"abc\"\n     * StringUtils.stripStart(\"  abc\", null)    \u003d \"abc\"\n     * StringUtils.stripStart(\"abc  \", null)    \u003d \"abc  \"\n     * StringUtils.stripStart(\" abc \", null)    \u003d \"abc \"\n     * StringUtils.stripStart(\"yxabc  \", \"xyz\") \u003d \"abc  \"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to remove characters from, may be null\n     * @param stripChars  the characters to remove, null treated as whitespace\n     * @return the stripped String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 19)",
        "(line 486,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 489,col 22)",
        "(line 490,col 9)-(line 500,col 9)",
        "(line 501,col 9)-(line 501,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.stripEnd(java.lang.String, java.lang.String)",
      "begin_line": 528,
      "end_line": 546,
      "comment": "\n     * \u003cp\u003eStrips any of a set of characters from the end of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * An empty string (\"\") input returns the empty string.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the stripChars String is \u003ccode\u003enull\u003c/code\u003e, whitespace is\n     * stripped as defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripEnd(null, *)          \u003d null\n     * StringUtils.stripEnd(\"\", *)            \u003d \"\"\n     * StringUtils.stripEnd(\"abc\", \"\")        \u003d \"abc\"\n     * StringUtils.stripEnd(\"abc\", null)      \u003d \"abc\"\n     * StringUtils.stripEnd(\"  abc\", null)    \u003d \"  abc\"\n     * StringUtils.stripEnd(\"abc  \", null)    \u003d \"abc\"\n     * StringUtils.stripEnd(\" abc \", null)    \u003d \" abc\"\n     * StringUtils.stripEnd(\"  abcyx\", \"xyz\") \u003d \"  abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to remove characters from, may be null\n     * @param stripChars  the characters to remove, null treated as whitespace\n     * @return the stripped String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 529,col 9)-(line 529,col 16)",
        "(line 530,col 9)-(line 532,col 9)",
        "(line 534,col 9)-(line 544,col 9)",
        "(line 545,col 9)-(line 545,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.stripAll(java.lang.String[])",
      "begin_line": 569,
      "end_line": 571,
      "comment": "\n     * \u003cp\u003eStrips whitespace from the start and end of every String in an array.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA new array is returned each time, except for length zero.\n     * A \u003ccode\u003enull\u003c/code\u003e array will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty array will return itself.\n     * A \u003ccode\u003enull\u003c/code\u003e array entry will be ignored.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripAll(null)             \u003d null\n     * StringUtils.stripAll([])               \u003d []\n     * StringUtils.stripAll([\"abc\", \"  abc\"]) \u003d [\"abc\", \"abc\"]\n     * StringUtils.stripAll([\"abc  \", null])  \u003d [\"abc\", null]\n     * \u003c/pre\u003e\n     *\n     * @param strs  the array to remove whitespace from, may be null\n     * @return the stripped Strings, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.stripAll(java.lang.String[], java.lang.String)",
      "begin_line": 598,
      "end_line": 608,
      "comment": "\n     * \u003cp\u003eStrips any of a set of characters from the start and end of every\n     * String in an array.\u003c/p\u003e\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA new array is returned each time, except for length zero.\n     * A \u003ccode\u003enull\u003c/code\u003e array will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty array will return itself.\n     * A \u003ccode\u003enull\u003c/code\u003e array entry will be ignored.\n     * A \u003ccode\u003enull\u003c/code\u003e stripChars will strip whitespace as defined by\n     * {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripAll(null, *)                \u003d null\n     * StringUtils.stripAll([], *)                  \u003d []\n     * StringUtils.stripAll([\"abc\", \"  abc\"], null) \u003d [\"abc\", \"abc\"]\n     * StringUtils.stripAll([\"abc  \", null], null)  \u003d [\"abc\", null]\n     * StringUtils.stripAll([\"abc  \", null], \"yz\")  \u003d [\"abc  \", null]\n     * StringUtils.stripAll([\"yabcz\", null], \"yz\")  \u003d [\"abc\", null]\n     * \u003c/pre\u003e\n     *\n     * @param strs  the array to remove characters from, may be null\n     * @param stripChars  the characters to remove, null treated as whitespace\n     * @return the stripped Strings, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 599,col 9)-(line 599,col 20)",
        "(line 600,col 9)-(line 602,col 9)",
        "(line 603,col 9)-(line 603,col 46)",
        "(line 604,col 9)-(line 606,col 9)",
        "(line 607,col 9)-(line 607,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.stripAccents(java.lang.String)",
      "begin_line": 626,
      "end_line": 672,
      "comment": "\n     * \u003cp\u003eRemoves the accents from a string. \u003c/p\u003e\n     * \u003cp\u003eNOTE: This is a JDK 1.6 method, it will fail on JDK 1.5. \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripAccents(null)                \u003d null\n     * StringUtils.stripAccents(\"\")                  \u003d \"\"\n     * StringUtils.stripAccents(\"control\")           \u003d \"control\"\n     * StringUtils.stripAccents(\"\u0026ecute;clair\")      \u003d \"eclair\"\n     * \u003c/pre\u003e\n     * \n     * @param input String to be stripped\n     * @return String without accents on the text\n     *\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 627,col 9)-(line 629,col 9)",
        "(line 630,col 9)-(line 671,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.equals(java.lang.String, java.lang.String)",
      "begin_line": 696,
      "end_line": 698,
      "comment": "\n     * \u003cp\u003eCompares two Strings, returning \u003ccode\u003etrue\u003c/code\u003e if they are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003es are handled without exceptions. Two \u003ccode\u003enull\u003c/code\u003e\n     * references are considered to be equal. The comparison is case sensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.equals(null, null)   \u003d true\n     * StringUtils.equals(null, \"abc\")  \u003d false\n     * StringUtils.equals(\"abc\", null)  \u003d false\n     * StringUtils.equals(\"abc\", \"abc\") \u003d true\n     * StringUtils.equals(\"abc\", \"ABC\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#equals(Object)\n     * @param str1  the first String, may be null\n     * @param str2  the second String, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the Strings are equal, case sensitive, or\n     *  both \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 697,col 9)-(line 697,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.equalsIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 721,
      "end_line": 723,
      "comment": "\n     * \u003cp\u003eCompares two Strings, returning \u003ccode\u003etrue\u003c/code\u003e if they are equal ignoring\n     * the case.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003es are handled without exceptions. Two \u003ccode\u003enull\u003c/code\u003e\n     * references are considered equal. Comparison is case insensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.equalsIgnoreCase(null, null)   \u003d true\n     * StringUtils.equalsIgnoreCase(null, \"abc\")  \u003d false\n     * StringUtils.equalsIgnoreCase(\"abc\", null)  \u003d false\n     * StringUtils.equalsIgnoreCase(\"abc\", \"abc\") \u003d true\n     * StringUtils.equalsIgnoreCase(\"abc\", \"ABC\") \u003d true\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#equalsIgnoreCase(String)\n     * @param str1  the first String, may be null\n     * @param str2  the second String, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the Strings are equal, case insensitive, or\n     *  both \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 722,col 9)-(line 722,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOf(java.lang.String, char)",
      "begin_line": 746,
      "end_line": 751,
      "comment": "\n     * \u003cp\u003eFinds the first index within a String, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#indexOf(int)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e or empty (\"\") String will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOf(null, *)         \u003d -1\n     * StringUtils.indexOf(\"\", *)           \u003d -1\n     * StringUtils.indexOf(\"aabaabaa\", \u0027a\u0027) \u003d 0\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027) \u003d 2\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChar  the character to find\n     * @return the first index of the search character,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 747,col 9)-(line 749,col 9)",
        "(line 750,col 9)-(line 750,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOf(java.lang.String, char, int)",
      "begin_line": 778,
      "end_line": 783,
      "comment": "\n     * \u003cp\u003eFinds the first index within a String from a start position,\n     * handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#indexOf(int, int)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e or empty (\"\") String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A negative start position is treated as zero.\n     * A start position greater than the string length returns \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOf(null, *, *)          \u003d -1\n     * StringUtils.indexOf(\"\", *, *)            \u003d -1\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027, 0)  \u003d 2\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027, 3)  \u003d 5\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027, 9)  \u003d -1\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027, -1) \u003d 2\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChar  the character to find\n     * @param startPos  the start position, negative treated as zero\n     * @return the first index of the search character,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 779,col 9)-(line 781,col 9)",
        "(line 782,col 9)-(line 782,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOf(java.lang.String, java.lang.String)",
      "begin_line": 807,
      "end_line": 812,
      "comment": "\n     * \u003cp\u003eFinds the first index within a String, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#indexOf(String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOf(null, *)          \u003d -1\n     * StringUtils.indexOf(*, null)          \u003d -1\n     * StringUtils.indexOf(\"\", \"\")           \u003d 0\n     * StringUtils.indexOf(\"aabaabaa\", \"a\")  \u003d 0\n     * StringUtils.indexOf(\"aabaabaa\", \"b\")  \u003d 2\n     * StringUtils.indexOf(\"aabaabaa\", \"ab\") \u003d 1\n     * StringUtils.indexOf(\"aabaabaa\", \"\")   \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStr  the String to find, may be null\n     * @return the first index of the search String,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 808,col 9)-(line 810,col 9)",
        "(line 811,col 9)-(line 811,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.ordinalIndexOf(java.lang.String, java.lang.String, int)",
      "begin_line": 841,
      "end_line": 858,
      "comment": "\n     * \u003cp\u003eFinds the n-th index within a String, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#indexOf(String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.ordinalIndexOf(null, *, *)          \u003d -1\n     * StringUtils.ordinalIndexOf(*, null, *)          \u003d -1\n     * StringUtils.ordinalIndexOf(\"\", \"\", *)           \u003d 0\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"a\", 1)  \u003d 0\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"a\", 2)  \u003d 1\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"b\", 1)  \u003d 2\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"b\", 2)  \u003d 5\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"ab\", 1) \u003d 1\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"ab\", 2) \u003d 4\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"\", 1)   \u003d 0\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"\", 2)   \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStr  the String to find, may be null\n     * @param ordinal  the n-th \u003ccode\u003esearchStr\u003c/code\u003e to find\n     * @return the n-th index of the search String,\n     *  \u003ccode\u003e-1\u003c/code\u003e (\u003ccode\u003eINDEX_NOT_FOUND\u003c/code\u003e) if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 842,col 9)-(line 844,col 9)",
        "(line 845,col 9)-(line 847,col 9)",
        "(line 848,col 9)-(line 848,col 22)",
        "(line 849,col 9)-(line 849,col 36)",
        "(line 850,col 9)-(line 856,col 34)",
        "(line 857,col 9)-(line 857,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOf(java.lang.String, java.lang.String, int)",
      "begin_line": 891,
      "end_line": 900,
      "comment": "\n     * \u003cp\u003eFinds the first index within a String, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#indexOf(String, int)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A negative start position is treated as zero.\n     * An empty (\"\") search String always matches.\n     * A start position greater than the string length only matches\n     * an empty search String.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOf(null, *, *)          \u003d -1\n     * StringUtils.indexOf(*, null, *)          \u003d -1\n     * StringUtils.indexOf(\"\", \"\", 0)           \u003d 0\n     * StringUtils.indexOf(\"aabaabaa\", \"a\", 0)  \u003d 0\n     * StringUtils.indexOf(\"aabaabaa\", \"b\", 0)  \u003d 2\n     * StringUtils.indexOf(\"aabaabaa\", \"ab\", 0) \u003d 1\n     * StringUtils.indexOf(\"aabaabaa\", \"b\", 3)  \u003d 5\n     * StringUtils.indexOf(\"aabaabaa\", \"b\", 9)  \u003d -1\n     * StringUtils.indexOf(\"aabaabaa\", \"b\", -1) \u003d 2\n     * StringUtils.indexOf(\"aabaabaa\", \"\", 2)   \u003d 2\n     * StringUtils.indexOf(\"abc\", \"\", 9)        \u003d 3\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStr  the String to find, may be null\n     * @param startPos  the start position, negative treated as zero\n     * @return the first index of the search String,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 892,col 9)-(line 894,col 9)",
        "(line 896,col 9)-(line 898,col 9)",
        "(line 899,col 9)-(line 899,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastIndexOf(java.lang.String, char)",
      "begin_line": 923,
      "end_line": 928,
      "comment": "\n     * \u003cp\u003eFinds the last index within a String, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#lastIndexOf(int)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e or empty (\"\") String will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOf(null, *)         \u003d -1\n     * StringUtils.lastIndexOf(\"\", *)           \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027a\u0027) \u003d 7\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027) \u003d 5\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChar  the character to find\n     * @return the last index of the search character,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 924,col 9)-(line 926,col 9)",
        "(line 927,col 9)-(line 927,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastIndexOf(java.lang.String, char, int)",
      "begin_line": 957,
      "end_line": 962,
      "comment": "\n     * \u003cp\u003eFinds the last index within a String from a start position,\n     * handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#lastIndexOf(int, int)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e or empty (\"\") String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A negative start position returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A start position greater than the string length searches the whole string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOf(null, *, *)          \u003d -1\n     * StringUtils.lastIndexOf(\"\", *,  *)           \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, 8)  \u003d 5\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, 4)  \u003d 2\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, 0)  \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, 9)  \u003d 5\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, -1) \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027a\u0027, 0)  \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChar  the character to find\n     * @param startPos  the start position\n     * @return the last index of the search character,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 958,col 9)-(line 960,col 9)",
        "(line 961,col 9)-(line 961,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastIndexOf(java.lang.String, java.lang.String)",
      "begin_line": 986,
      "end_line": 991,
      "comment": "\n     * \u003cp\u003eFinds the last index within a String, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#lastIndexOf(String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOf(null, *)          \u003d -1\n     * StringUtils.lastIndexOf(*, null)          \u003d -1\n     * StringUtils.lastIndexOf(\"\", \"\")           \u003d 0\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"a\")  \u003d 0\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\")  \u003d 2\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"ab\") \u003d 1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"\")   \u003d 8\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStr  the String to find, may be null\n     * @return the last index of the search String,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 987,col 9)-(line 989,col 9)",
        "(line 990,col 9)-(line 990,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastIndexOf(java.lang.String, java.lang.String, int)",
      "begin_line": 1021,
      "end_line": 1026,
      "comment": "\n     * \u003cp\u003eFinds the first index within a String, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#lastIndexOf(String, int)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A negative start position returns \u003ccode\u003e-1\u003c/code\u003e.\n     * An empty (\"\") search String always matches unless the start position is negative.\n     * A start position greater than the string length searches the whole string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOf(null, *, *)          \u003d -1\n     * StringUtils.lastIndexOf(*, null, *)          \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"a\", 8)  \u003d 7\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\", 8)  \u003d 5\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"ab\", 8) \u003d 4\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\", 9)  \u003d 5\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\", -1) \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"a\", 0)  \u003d 0\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\", 0)  \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStr  the String to find, may be null\n     * @param startPos  the start position, negative treated as zero\n     * @return the first index of the search String,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1022,col 9)-(line 1024,col 9)",
        "(line 1025,col 9)-(line 1025,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.contains(java.lang.String, char)",
      "begin_line": 1049,
      "end_line": 1054,
      "comment": "\n     * \u003cp\u003eChecks if String contains a search character, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#indexOf(int)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e or empty (\"\") String will return \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.contains(null, *)    \u003d false\n     * StringUtils.contains(\"\", *)      \u003d false\n     * StringUtils.contains(\"abc\", \u0027a\u0027) \u003d true\n     * StringUtils.contains(\"abc\", \u0027z\u0027) \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChar  the character to find\n     * @return true if the String contains the search character,\n     *  false if not or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1050,col 9)-(line 1052,col 9)",
        "(line 1053,col 9)-(line 1053,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.contains(java.lang.String, java.lang.String)",
      "begin_line": 1077,
      "end_line": 1082,
      "comment": "\n     * \u003cp\u003eChecks if String contains a search String, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#indexOf(String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.contains(null, *)     \u003d false\n     * StringUtils.contains(*, null)     \u003d false\n     * StringUtils.contains(\"\", \"\")      \u003d true\n     * StringUtils.contains(\"abc\", \"\")   \u003d true\n     * StringUtils.contains(\"abc\", \"a\")  \u003d true\n     * StringUtils.contains(\"abc\", \"z\")  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStr  the String to find, may be null\n     * @return true if the String contains the search String,\n     *  false if not or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1078,col 9)-(line 1080,col 9)",
        "(line 1081,col 9)-(line 1081,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 1107,
      "end_line": 1119,
      "comment": "\n     * \u003cp\u003eChecks if String contains a search String irrespective of case,\n     * handling \u003ccode\u003enull\u003c/code\u003e. Case-insensitivity is defined as by\n     * {@link String#equalsIgnoreCase(String)}.\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.contains(null, *) \u003d false\n     * StringUtils.contains(*, null) \u003d false\n     * StringUtils.contains(\"\", \"\") \u003d true\n     * StringUtils.contains(\"abc\", \"\") \u003d true\n     * StringUtils.contains(\"abc\", \"a\") \u003d true\n     * StringUtils.contains(\"abc\", \"z\") \u003d false\n     * StringUtils.contains(\"abc\", \"A\") \u003d true\n     * StringUtils.contains(\"abc\", \"Z\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStr  the String to find, may be null\n     * @return true if the String contains the search String irrespective of\n     * case or false if not or \u003ccode\u003enull\u003c/code\u003e string input\n     ",
      "child_ranges": [
        "(line 1108,col 9)-(line 1110,col 9)",
        "(line 1111,col 9)-(line 1111,col 37)",
        "(line 1112,col 9)-(line 1112,col 37)",
        "(line 1113,col 9)-(line 1117,col 9)",
        "(line 1118,col 9)-(line 1118,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfAny(java.lang.String, char[])",
      "begin_line": 1145,
      "end_line": 1158,
      "comment": "\n     * \u003cp\u003eSearch a String to find the first index of any\n     * character in the given set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e or zero length search array will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAny(null, *)                \u003d -1\n     * StringUtils.indexOfAny(\"\", *)                  \u003d -1\n     * StringUtils.indexOfAny(*, null)                \u003d -1\n     * StringUtils.indexOfAny(*, [])                  \u003d -1\n     * StringUtils.indexOfAny(\"zzabyycdxx\",[\u0027z\u0027,\u0027a\u0027]) \u003d 0\n     * StringUtils.indexOfAny(\"zzabyycdxx\",[\u0027b\u0027,\u0027y\u0027]) \u003d 3\n     * StringUtils.indexOfAny(\"aba\", [\u0027z\u0027])           \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the index of any of the chars, -1 if no match or null input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1146,col 9)-(line 1148,col 9)",
        "(line 1149,col 9)-(line 1156,col 9)",
        "(line 1157,col 9)-(line 1157,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfAny(java.lang.String, java.lang.String)",
      "begin_line": 1182,
      "end_line": 1187,
      "comment": "\n     * \u003cp\u003eSearch a String to find the first index of any\n     * character in the given set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e search string will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAny(null, *)            \u003d -1\n     * StringUtils.indexOfAny(\"\", *)              \u003d -1\n     * StringUtils.indexOfAny(*, null)            \u003d -1\n     * StringUtils.indexOfAny(*, \"\")              \u003d -1\n     * StringUtils.indexOfAny(\"zzabyycdxx\", \"za\") \u003d 0\n     * StringUtils.indexOfAny(\"zzabyycdxx\", \"by\") \u003d 3\n     * StringUtils.indexOfAny(\"aba\",\"z\")          \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the index of any of the chars, -1 if no match or null input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1183,col 9)-(line 1185,col 9)",
        "(line 1186,col 9)-(line 1186,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsAny(java.lang.String, char[])",
      "begin_line": 1214,
      "end_line": 1227,
      "comment": "\n     * \u003cp\u003eChecks if the String contains any character in the given\n     * set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003efalse\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e or zero length search array will return \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsAny(null, *)                \u003d false\n     * StringUtils.containsAny(\"\", *)                  \u003d false\n     * StringUtils.containsAny(*, null)                \u003d false\n     * StringUtils.containsAny(*, [])                  \u003d false\n     * StringUtils.containsAny(\"zzabyycdxx\",[\u0027z\u0027,\u0027a\u0027]) \u003d true\n     * StringUtils.containsAny(\"zzabyycdxx\",[\u0027b\u0027,\u0027y\u0027]) \u003d true\n     * StringUtils.containsAny(\"aba\", [\u0027z\u0027])           \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the \u003ccode\u003etrue\u003c/code\u003e if any of the chars are found,\n     * \u003ccode\u003efalse\u003c/code\u003e if no match or null input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1215,col 9)-(line 1217,col 9)",
        "(line 1218,col 9)-(line 1225,col 9)",
        "(line 1226,col 9)-(line 1226,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsAny(java.lang.String, java.lang.String)",
      "begin_line": 1256,
      "end_line": 1261,
      "comment": "\n     * \u003cp\u003e\n     * Checks if the String contains any character in the given set of characters.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003efalse\u003c/code\u003e. A \u003ccode\u003enull\u003c/code\u003e search string will return\n     * \u003ccode\u003efalse\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * StringUtils.containsAny(null, *)            \u003d false\n     * StringUtils.containsAny(\"\", *)              \u003d false\n     * StringUtils.containsAny(*, null)            \u003d false\n     * StringUtils.containsAny(*, \"\")              \u003d false\n     * StringUtils.containsAny(\"zzabyycdxx\", \"za\") \u003d true\n     * StringUtils.containsAny(\"zzabyycdxx\", \"by\") \u003d true\n     * StringUtils.containsAny(\"aba\",\"z\")          \u003d false\n     * \u003c/pre\u003e\n     * \n     * @param str\n     *            the String to check, may be null\n     * @param searchChars\n     *            the chars to search for, may be null\n     * @return the \u003ccode\u003etrue\u003c/code\u003e if any of the chars are found, \u003ccode\u003efalse\u003c/code\u003e if no match or null input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1257,col 9)-(line 1259,col 9)",
        "(line 1260,col 9)-(line 1260,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfAnyBut(java.lang.String, char[])",
      "begin_line": 1287,
      "end_line": 1301,
      "comment": "\n     * \u003cp\u003eSearch a String to find the first index of any\n     * character not in the given set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e or zero length search array will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAnyBut(null, *)           \u003d -1\n     * StringUtils.indexOfAnyBut(\"\", *)             \u003d -1\n     * StringUtils.indexOfAnyBut(*, null)           \u003d -1\n     * StringUtils.indexOfAnyBut(*, [])             \u003d -1\n     * StringUtils.indexOfAnyBut(\"zzabyycdxx\",\u0027za\u0027) \u003d 3\n     * StringUtils.indexOfAnyBut(\"zzabyycdxx\", \u0027\u0027)  \u003d 0\n     * StringUtils.indexOfAnyBut(\"aba\", \u0027ab\u0027)       \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the index of any of the chars, -1 if no match or null input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1288,col 9)-(line 1290,col 9)",
        "(line 1291,col 9)-(line 1299,col 9)",
        "(line 1300,col 9)-(line 1300,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfAnyBut(java.lang.String, java.lang.String)",
      "begin_line": 1325,
      "end_line": 1335,
      "comment": "\n     * \u003cp\u003eSearch a String to find the first index of any\n     * character not in the given set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e search string will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAnyBut(null, *)            \u003d -1\n     * StringUtils.indexOfAnyBut(\"\", *)              \u003d -1\n     * StringUtils.indexOfAnyBut(*, null)            \u003d -1\n     * StringUtils.indexOfAnyBut(*, \"\")              \u003d -1\n     * StringUtils.indexOfAnyBut(\"zzabyycdxx\", \"za\") \u003d 3\n     * StringUtils.indexOfAnyBut(\"zzabyycdxx\", \"\")   \u003d 0\n     * StringUtils.indexOfAnyBut(\"aba\",\"ab\")         \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the index of any of the chars, -1 if no match or null input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1326,col 9)-(line 1328,col 9)",
        "(line 1329,col 9)-(line 1333,col 9)",
        "(line 1334,col 9)-(line 1334,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsOnly(java.lang.String, char[])",
      "begin_line": 1360,
      "end_line": 1372,
      "comment": "\n     * \u003cp\u003eChecks if the String contains only certain characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003efalse\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e valid character array will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty String (\"\") always returns \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsOnly(null, *)       \u003d false\n     * StringUtils.containsOnly(*, null)       \u003d false\n     * StringUtils.containsOnly(\"\", *)         \u003d true\n     * StringUtils.containsOnly(\"ab\", \u0027\u0027)      \u003d false\n     * StringUtils.containsOnly(\"abab\", \u0027abc\u0027) \u003d true\n     * StringUtils.containsOnly(\"ab1\", \u0027abc\u0027)  \u003d false\n     * StringUtils.containsOnly(\"abz\", \u0027abc\u0027)  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param valid  an array of valid chars, may be null\n     * @return true if it only contains valid chars and is non-null\n     ",
      "child_ranges": [
        "(line 1362,col 9)-(line 1364,col 9)",
        "(line 1365,col 9)-(line 1367,col 9)",
        "(line 1368,col 9)-(line 1370,col 9)",
        "(line 1371,col 9)-(line 1371,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsOnly(java.lang.String, java.lang.String)",
      "begin_line": 1396,
      "end_line": 1401,
      "comment": "\n     * \u003cp\u003eChecks if the String contains only certain characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003efalse\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e valid character String will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty String (\"\") always returns \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsOnly(null, *)       \u003d false\n     * StringUtils.containsOnly(*, null)       \u003d false\n     * StringUtils.containsOnly(\"\", *)         \u003d true\n     * StringUtils.containsOnly(\"ab\", \"\")      \u003d false\n     * StringUtils.containsOnly(\"abab\", \"abc\") \u003d true\n     * StringUtils.containsOnly(\"ab1\", \"abc\")  \u003d false\n     * StringUtils.containsOnly(\"abz\", \"abc\")  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param validChars  a String of valid chars, may be null\n     * @return true if it only contains valid chars and is non-null\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1397,col 9)-(line 1399,col 9)",
        "(line 1400,col 9)-(line 1400,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsNone(java.lang.String, char[])",
      "begin_line": 1427,
      "end_line": 1442,
      "comment": "\n     * \u003cp\u003eChecks that the String does not contain certain characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003etrue\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e invalid character array will return \u003ccode\u003etrue\u003c/code\u003e.\n     * An empty String (\"\") always returns true.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsNone(null, *)       \u003d true\n     * StringUtils.containsNone(*, null)       \u003d true\n     * StringUtils.containsNone(\"\", *)         \u003d true\n     * StringUtils.containsNone(\"ab\", \u0027\u0027)      \u003d true\n     * StringUtils.containsNone(\"abab\", \u0027xyz\u0027) \u003d true\n     * StringUtils.containsNone(\"ab1\", \u0027xyz\u0027)  \u003d true\n     * StringUtils.containsNone(\"abz\", \u0027xyz\u0027)  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param invalidChars  an array of invalid chars, may be null\n     * @return true if it contains none of the invalid chars, or is null\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1428,col 9)-(line 1430,col 9)",
        "(line 1431,col 9)-(line 1431,col 35)",
        "(line 1432,col 9)-(line 1432,col 44)",
        "(line 1433,col 9)-(line 1440,col 9)",
        "(line 1441,col 9)-(line 1441,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsNone(java.lang.String, java.lang.String)",
      "begin_line": 1466,
      "end_line": 1471,
      "comment": "\n     * \u003cp\u003eChecks that the String does not contain certain characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003etrue\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e invalid character array will return \u003ccode\u003etrue\u003c/code\u003e.\n     * An empty String (\"\") always returns true.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsNone(null, *)       \u003d true\n     * StringUtils.containsNone(*, null)       \u003d true\n     * StringUtils.containsNone(\"\", *)         \u003d true\n     * StringUtils.containsNone(\"ab\", \"\")      \u003d true\n     * StringUtils.containsNone(\"abab\", \"xyz\") \u003d true\n     * StringUtils.containsNone(\"ab1\", \"xyz\")  \u003d true\n     * StringUtils.containsNone(\"abz\", \"xyz\")  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param invalidChars  a String of invalid chars, may be null\n     * @return true if it contains none of the invalid chars, or is null\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1467,col 9)-(line 1469,col 9)",
        "(line 1470,col 9)-(line 1470,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfAny(java.lang.String, java.lang.String[])",
      "begin_line": 1501,
      "end_line": 1527,
      "comment": "\n     * \u003cp\u003eFind the first index of any of a set of potential substrings.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e or zero length search array will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e search array entry will be ignored, but a search\n     * array containing \"\" will return \u003ccode\u003e0\u003c/code\u003e if \u003ccode\u003estr\u003c/code\u003e is not\n     * null. This method uses {@link String#indexOf(String)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAny(null, *)                     \u003d -1\n     * StringUtils.indexOfAny(*, null)                     \u003d -1\n     * StringUtils.indexOfAny(*, [])                       \u003d -1\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"ab\",\"cd\"])   \u003d 2\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"cd\",\"ab\"])   \u003d 2\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"mn\",\"op\"])   \u003d -1\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"zab\",\"aby\"]) \u003d 1\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"\"])          \u003d 0\n     * StringUtils.indexOfAny(\"\", [\"\"])                    \u003d 0\n     * StringUtils.indexOfAny(\"\", [\"a\"])                   \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStrs  the Strings to search for, may be null\n     * @return the first index of any of the searchStrs in str, -1 if no match\n     ",
      "child_ranges": [
        "(line 1502,col 9)-(line 1504,col 9)",
        "(line 1505,col 9)-(line 1505,col 35)",
        "(line 1508,col 9)-(line 1508,col 36)",
        "(line 1510,col 9)-(line 1510,col 20)",
        "(line 1511,col 9)-(line 1524,col 9)",
        "(line 1526,col 9)-(line 1526,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastIndexOfAny(java.lang.String, java.lang.String[])",
      "begin_line": 1554,
      "end_line": 1572,
      "comment": "\n     * \u003cp\u003eFind the latest index of any of a set of potential substrings.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e search array will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e or zero length search array entry will be ignored,\n     * but a search array containing \"\" will return the length of \u003ccode\u003estr\u003c/code\u003e\n     * if \u003ccode\u003estr\u003c/code\u003e is not null. This method uses {@link String#indexOf(String)}\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOfAny(null, *)                   \u003d -1\n     * StringUtils.lastIndexOfAny(*, null)                   \u003d -1\n     * StringUtils.lastIndexOfAny(*, [])                     \u003d -1\n     * StringUtils.lastIndexOfAny(*, [null])                 \u003d -1\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"ab\",\"cd\"]) \u003d 6\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"cd\",\"ab\"]) \u003d 6\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"mn\",\"op\"]) \u003d -1\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"mn\",\"op\"]) \u003d -1\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"mn\",\"\"])   \u003d 10\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStrs  the Strings to search for, may be null\n     * @return the last index of any of the Strings, -1 if no match\n     ",
      "child_ranges": [
        "(line 1555,col 9)-(line 1557,col 9)",
        "(line 1558,col 9)-(line 1558,col 35)",
        "(line 1559,col 9)-(line 1559,col 21)",
        "(line 1560,col 9)-(line 1560,col 20)",
        "(line 1561,col 9)-(line 1570,col 9)",
        "(line 1571,col 9)-(line 1571,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substring(java.lang.String, int)",
      "begin_line": 1600,
      "end_line": 1618,
      "comment": "\n     * \u003cp\u003eGets a substring from the specified String avoiding exceptions.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative start position can be used to start \u003ccode\u003en\u003c/code\u003e\n     * characters from the end of the String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") String will return \"\".\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substring(null, *)   \u003d null\n     * StringUtils.substring(\"\", *)     \u003d \"\"\n     * StringUtils.substring(\"abc\", 0)  \u003d \"abc\"\n     * StringUtils.substring(\"abc\", 2)  \u003d \"c\"\n     * StringUtils.substring(\"abc\", 4)  \u003d \"\"\n     * StringUtils.substring(\"abc\", -2) \u003d \"bc\"\n     * StringUtils.substring(\"abc\", -4) \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the substring from, may be null\n     * @param start  the position to start from, negative means\n     *  count back from the end of the String by this many characters\n     * @return substring from start position, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 1601,col 9)-(line 1603,col 9)",
        "(line 1606,col 9)-(line 1608,col 9)",
        "(line 1610,col 9)-(line 1612,col 9)",
        "(line 1613,col 9)-(line 1615,col 9)",
        "(line 1617,col 9)-(line 1617,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substring(java.lang.String, int, int)",
      "begin_line": 1655,
      "end_line": 1686,
      "comment": "\n     * \u003cp\u003eGets a substring from the specified String avoiding exceptions.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative start position can be used to start/end \u003ccode\u003en\u003c/code\u003e\n     * characters from the end of the String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe returned substring starts with the character in the \u003ccode\u003estart\u003c/code\u003e\n     * position and ends before the \u003ccode\u003eend\u003c/code\u003e position. All position counting is\n     * zero-based -- i.e., to start at the beginning of the string use\n     * \u003ccode\u003estart \u003d 0\u003c/code\u003e. Negative start and end positions can be used to\n     * specify offsets relative to the end of the String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf \u003ccode\u003estart\u003c/code\u003e is not strictly to the left of \u003ccode\u003eend\u003c/code\u003e, \"\"\n     * is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substring(null, *, *)    \u003d null\n     * StringUtils.substring(\"\", * ,  *)    \u003d \"\";\n     * StringUtils.substring(\"abc\", 0, 2)   \u003d \"ab\"\n     * StringUtils.substring(\"abc\", 2, 0)   \u003d \"\"\n     * StringUtils.substring(\"abc\", 2, 4)   \u003d \"c\"\n     * StringUtils.substring(\"abc\", 4, 6)   \u003d \"\"\n     * StringUtils.substring(\"abc\", 2, 2)   \u003d \"\"\n     * StringUtils.substring(\"abc\", -2, -1) \u003d \"b\"\n     * StringUtils.substring(\"abc\", -4, 2)  \u003d \"ab\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the substring from, may be null\n     * @param start  the position to start from, negative means\n     *  count back from the end of the String by this many characters\n     * @param end  the position to end at (exclusive), negative means\n     *  count back from the end of the String by this many characters\n     * @return substring from start position to end positon,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 1656,col 9)-(line 1658,col 9)",
        "(line 1661,col 9)-(line 1663,col 9)",
        "(line 1664,col 9)-(line 1666,col 9)",
        "(line 1669,col 9)-(line 1671,col 9)",
        "(line 1674,col 9)-(line 1676,col 9)",
        "(line 1678,col 9)-(line 1680,col 9)",
        "(line 1681,col 9)-(line 1683,col 9)",
        "(line 1685,col 9)-(line 1685,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.left(java.lang.String, int)",
      "begin_line": 1710,
      "end_line": 1721,
      "comment": "\n     * \u003cp\u003eGets the leftmost \u003ccode\u003elen\u003c/code\u003e characters of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf \u003ccode\u003elen\u003c/code\u003e characters are not available, or the\n     * String is \u003ccode\u003enull\u003c/code\u003e, the String will be returned without\n     * an exception. An exception is thrown if len is negative.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.left(null, *)    \u003d null\n     * StringUtils.left(*, -ve)     \u003d \"\"\n     * StringUtils.left(\"\", *)      \u003d \"\"\n     * StringUtils.left(\"abc\", 0)   \u003d \"\"\n     * StringUtils.left(\"abc\", 2)   \u003d \"ab\"\n     * StringUtils.left(\"abc\", 4)   \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the leftmost characters from, may be null\n     * @param len  the length of the required String, must be zero or positive\n     * @return the leftmost characters, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 1711,col 9)-(line 1713,col 9)",
        "(line 1714,col 9)-(line 1716,col 9)",
        "(line 1717,col 9)-(line 1719,col 9)",
        "(line 1720,col 9)-(line 1720,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.right(java.lang.String, int)",
      "begin_line": 1743,
      "end_line": 1754,
      "comment": "\n     * \u003cp\u003eGets the rightmost \u003ccode\u003elen\u003c/code\u003e characters of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf \u003ccode\u003elen\u003c/code\u003e characters are not available, or the String\n     * is \u003ccode\u003enull\u003c/code\u003e, the String will be returned without an\n     * an exception. An exception is thrown if len is negative.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.right(null, *)    \u003d null\n     * StringUtils.right(*, -ve)     \u003d \"\"\n     * StringUtils.right(\"\", *)      \u003d \"\"\n     * StringUtils.right(\"abc\", 0)   \u003d \"\"\n     * StringUtils.right(\"abc\", 2)   \u003d \"bc\"\n     * StringUtils.right(\"abc\", 4)   \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the rightmost characters from, may be null\n     * @param len  the length of the required String, must be zero or positive\n     * @return the rightmost characters, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 1744,col 9)-(line 1746,col 9)",
        "(line 1747,col 9)-(line 1749,col 9)",
        "(line 1750,col 9)-(line 1752,col 9)",
        "(line 1753,col 9)-(line 1753,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.mid(java.lang.String, int, int)",
      "begin_line": 1780,
      "end_line": 1794,
      "comment": "\n     * \u003cp\u003eGets \u003ccode\u003elen\u003c/code\u003e characters from the middle of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf \u003ccode\u003elen\u003c/code\u003e characters are not available, the remainder\n     * of the String will be returned without an exception. If the\n     * String is \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e will be returned.\n     * An exception is thrown if len is negative.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.mid(null, *, *)    \u003d null\n     * StringUtils.mid(*, *, -ve)     \u003d \"\"\n     * StringUtils.mid(\"\", 0, *)      \u003d \"\"\n     * StringUtils.mid(\"abc\", 0, 2)   \u003d \"ab\"\n     * StringUtils.mid(\"abc\", 0, 4)   \u003d \"abc\"\n     * StringUtils.mid(\"abc\", 2, 4)   \u003d \"c\"\n     * StringUtils.mid(\"abc\", 4, 2)   \u003d \"\"\n     * StringUtils.mid(\"abc\", -2, 2)  \u003d \"ab\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the characters from, may be null\n     * @param pos  the position to start from, negative treated as zero\n     * @param len  the length of the required String, must be zero or positive\n     * @return the middle characters, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 1781,col 9)-(line 1783,col 9)",
        "(line 1784,col 9)-(line 1786,col 9)",
        "(line 1787,col 9)-(line 1789,col 9)",
        "(line 1790,col 9)-(line 1792,col 9)",
        "(line 1793,col 9)-(line 1793,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringBefore(java.lang.String, java.lang.String)",
      "begin_line": 1825,
      "end_line": 1837,
      "comment": "\n     * \u003cp\u003eGets the substring before the first occurrence of a separator.\n     * The separator is not returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") string input will return the empty string.\n     * A \u003ccode\u003enull\u003c/code\u003e separator will return the input string.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf nothing is found, the string input is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringBefore(null, *)      \u003d null\n     * StringUtils.substringBefore(\"\", *)        \u003d \"\"\n     * StringUtils.substringBefore(\"abc\", \"a\")   \u003d \"\"\n     * StringUtils.substringBefore(\"abcba\", \"b\") \u003d \"a\"\n     * StringUtils.substringBefore(\"abc\", \"c\")   \u003d \"ab\"\n     * StringUtils.substringBefore(\"abc\", \"d\")   \u003d \"abc\"\n     * StringUtils.substringBefore(\"abc\", \"\")    \u003d \"\"\n     * StringUtils.substringBefore(\"abc\", null)  \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get a substring from, may be null\n     * @param separator  the String to search for, may be null\n     * @return the substring before the first occurrence of the separator,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1826,col 9)-(line 1828,col 9)",
        "(line 1829,col 9)-(line 1831,col 9)",
        "(line 1832,col 9)-(line 1832,col 41)",
        "(line 1833,col 9)-(line 1835,col 9)",
        "(line 1836,col 9)-(line 1836,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringAfter(java.lang.String, java.lang.String)",
      "begin_line": 1867,
      "end_line": 1879,
      "comment": "\n     * \u003cp\u003eGets the substring after the first occurrence of a separator.\n     * The separator is not returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") string input will return the empty string.\n     * A \u003ccode\u003enull\u003c/code\u003e separator will return the empty string if the\n     * input string is not \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf nothing is found, the empty string is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringAfter(null, *)      \u003d null\n     * StringUtils.substringAfter(\"\", *)        \u003d \"\"\n     * StringUtils.substringAfter(*, null)      \u003d \"\"\n     * StringUtils.substringAfter(\"abc\", \"a\")   \u003d \"bc\"\n     * StringUtils.substringAfter(\"abcba\", \"b\") \u003d \"cba\"\n     * StringUtils.substringAfter(\"abc\", \"c\")   \u003d \"\"\n     * StringUtils.substringAfter(\"abc\", \"d\")   \u003d \"\"\n     * StringUtils.substringAfter(\"abc\", \"\")    \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get a substring from, may be null\n     * @param separator  the String to search for, may be null\n     * @return the substring after the first occurrence of the separator,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1868,col 9)-(line 1870,col 9)",
        "(line 1871,col 9)-(line 1873,col 9)",
        "(line 1874,col 9)-(line 1874,col 41)",
        "(line 1875,col 9)-(line 1877,col 9)",
        "(line 1878,col 9)-(line 1878,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringBeforeLast(java.lang.String, java.lang.String)",
      "begin_line": 1908,
      "end_line": 1917,
      "comment": "\n     * \u003cp\u003eGets the substring before the last occurrence of a separator.\n     * The separator is not returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") string input will return the empty string.\n     * An empty or \u003ccode\u003enull\u003c/code\u003e separator will return the input string.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf nothing is found, the string input is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringBeforeLast(null, *)      \u003d null\n     * StringUtils.substringBeforeLast(\"\", *)        \u003d \"\"\n     * StringUtils.substringBeforeLast(\"abcba\", \"b\") \u003d \"abc\"\n     * StringUtils.substringBeforeLast(\"abc\", \"c\")   \u003d \"ab\"\n     * StringUtils.substringBeforeLast(\"a\", \"a\")     \u003d \"\"\n     * StringUtils.substringBeforeLast(\"a\", \"z\")     \u003d \"a\"\n     * StringUtils.substringBeforeLast(\"a\", null)    \u003d \"a\"\n     * StringUtils.substringBeforeLast(\"a\", \"\")      \u003d \"a\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get a substring from, may be null\n     * @param separator  the String to search for, may be null\n     * @return the substring before the last occurrence of the separator,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1909,col 9)-(line 1911,col 9)",
        "(line 1912,col 9)-(line 1912,col 45)",
        "(line 1913,col 9)-(line 1915,col 9)",
        "(line 1916,col 9)-(line 1916,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringAfterLast(java.lang.String, java.lang.String)",
      "begin_line": 1948,
      "end_line": 1960,
      "comment": "\n     * \u003cp\u003eGets the substring after the last occurrence of a separator.\n     * The separator is not returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") string input will return the empty string.\n     * An empty or \u003ccode\u003enull\u003c/code\u003e separator will return the empty string if\n     * the input string is not \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf nothing is found, the empty string is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringAfterLast(null, *)      \u003d null\n     * StringUtils.substringAfterLast(\"\", *)        \u003d \"\"\n     * StringUtils.substringAfterLast(*, \"\")        \u003d \"\"\n     * StringUtils.substringAfterLast(*, null)      \u003d \"\"\n     * StringUtils.substringAfterLast(\"abc\", \"a\")   \u003d \"bc\"\n     * StringUtils.substringAfterLast(\"abcba\", \"b\") \u003d \"a\"\n     * StringUtils.substringAfterLast(\"abc\", \"c\")   \u003d \"\"\n     * StringUtils.substringAfterLast(\"a\", \"a\")     \u003d \"\"\n     * StringUtils.substringAfterLast(\"a\", \"z\")     \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get a substring from, may be null\n     * @param separator  the String to search for, may be null\n     * @return the substring after the last occurrence of the separator,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1949,col 9)-(line 1951,col 9)",
        "(line 1952,col 9)-(line 1954,col 9)",
        "(line 1955,col 9)-(line 1955,col 45)",
        "(line 1956,col 9)-(line 1958,col 9)",
        "(line 1959,col 9)-(line 1959,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringBetween(java.lang.String, java.lang.String)",
      "begin_line": 1985,
      "end_line": 1987,
      "comment": "\n     * \u003cp\u003eGets the String that is nested in between two instances of the\n     * same String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e tag returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringBetween(null, *)            \u003d null\n     * StringUtils.substringBetween(\"\", \"\")             \u003d \"\"\n     * StringUtils.substringBetween(\"\", \"tag\")          \u003d null\n     * StringUtils.substringBetween(\"tagabctag\", null)  \u003d null\n     * StringUtils.substringBetween(\"tagabctag\", \"\")    \u003d \"\"\n     * StringUtils.substringBetween(\"tagabctag\", \"tag\") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String containing the substring, may be null\n     * @param tag  the String before and after the substring, may be null\n     * @return the substring, \u003ccode\u003enull\u003c/code\u003e if no match\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1986,col 9)-(line 1986,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringBetween(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 2016,
      "end_line": 2028,
      "comment": "\n     * \u003cp\u003eGets the String that is nested in between two Strings.\n     * Only the first match is returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e open/close returns \u003ccode\u003enull\u003c/code\u003e (no match).\n     * An empty (\"\") open and close returns an empty string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringBetween(\"wx[b]yz\", \"[\", \"]\") \u003d \"b\"\n     * StringUtils.substringBetween(null, *, *)          \u003d null\n     * StringUtils.substringBetween(*, null, *)          \u003d null\n     * StringUtils.substringBetween(*, *, null)          \u003d null\n     * StringUtils.substringBetween(\"\", \"\", \"\")          \u003d \"\"\n     * StringUtils.substringBetween(\"\", \"\", \"]\")         \u003d null\n     * StringUtils.substringBetween(\"\", \"[\", \"]\")        \u003d null\n     * StringUtils.substringBetween(\"yabcz\", \"\", \"\")     \u003d \"\"\n     * StringUtils.substringBetween(\"yabcz\", \"y\", \"z\")   \u003d \"abc\"\n     * StringUtils.substringBetween(\"yabczyabcz\", \"y\", \"z\")   \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String containing the substring, may be null\n     * @param open  the String before the substring, may be null\n     * @param close  the String after the substring, may be null\n     * @return the substring, \u003ccode\u003enull\u003c/code\u003e if no match\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2017,col 9)-(line 2019,col 9)",
        "(line 2020,col 9)-(line 2020,col 38)",
        "(line 2021,col 9)-(line 2026,col 9)",
        "(line 2027,col 9)-(line 2027,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringsBetween(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 2052,
      "end_line": 2081,
      "comment": "\n     * \u003cp\u003eSearches a String for substrings delimited by a start and end tag,\n     * returning all matching substrings in an array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e open/close returns \u003ccode\u003enull\u003c/code\u003e (no match).\n     * An empty (\"\") open/close returns \u003ccode\u003enull\u003c/code\u003e (no match).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringsBetween(\"[a][b][c]\", \"[\", \"]\") \u003d [\"a\",\"b\",\"c\"]\n     * StringUtils.substringsBetween(null, *, *)            \u003d null\n     * StringUtils.substringsBetween(*, null, *)            \u003d null\n     * StringUtils.substringsBetween(*, *, null)            \u003d null\n     * StringUtils.substringsBetween(\"\", \"[\", \"]\")          \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param str  the String containing the substrings, null returns null, empty returns empty\n     * @param open  the String identifying the start of the substring, empty returns null\n     * @param close  the String identifying the end of the substring, empty returns null\n     * @return a String Array of substrings, or \u003ccode\u003enull\u003c/code\u003e if no match\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 2053,col 9)-(line 2055,col 9)",
        "(line 2056,col 9)-(line 2056,col 34)",
        "(line 2057,col 9)-(line 2059,col 9)",
        "(line 2060,col 9)-(line 2060,col 38)",
        "(line 2061,col 9)-(line 2061,col 36)",
        "(line 2062,col 9)-(line 2062,col 52)",
        "(line 2063,col 9)-(line 2063,col 20)",
        "(line 2064,col 9)-(line 2076,col 9)",
        "(line 2077,col 9)-(line 2079,col 9)",
        "(line 2080,col 9)-(line 2080,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.split(java.lang.String)",
      "begin_line": 2110,
      "end_line": 2112,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, using whitespace as the\n     * separator.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as one separator.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.split(null)       \u003d null\n     * StringUtils.split(\"\")         \u003d []\n     * StringUtils.split(\"abc def\")  \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\"abc  def\") \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\" abc \")    \u003d [\"abc\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 2111,col 9)-(line 2111,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.split(java.lang.String, char)",
      "begin_line": 2138,
      "end_line": 2140,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator specified.\n     * This is an alternative to using StringTokenizer.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as one separator.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.split(null, *)         \u003d null\n     * StringUtils.split(\"\", *)           \u003d []\n     * StringUtils.split(\"a.b.c\", \u0027.\u0027)    \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.split(\"a..b.c\", \u0027.\u0027)   \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.split(\"a:b:c\", \u0027.\u0027)    \u003d [\"a:b:c\"]\n     * StringUtils.split(\"a b c\", \u0027 \u0027)    \u003d [\"a\", \"b\", \"c\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separatorChar  the character used as the delimiter\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2139,col 9)-(line 2139,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.split(java.lang.String, java.lang.String)",
      "begin_line": 2167,
      "end_line": 2169,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separators specified.\n     * This is an alternative to using StringTokenizer.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as one separator.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e separatorChars splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.split(null, *)         \u003d null\n     * StringUtils.split(\"\", *)           \u003d []\n     * StringUtils.split(\"abc def\", null) \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\"abc def\", \" \")  \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\"abc  def\", \" \") \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\"ab:cd:ef\", \":\") \u003d [\"ab\", \"cd\", \"ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separatorChars  the characters used as the delimiters,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 2168,col 9)-(line 2168,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.split(java.lang.String, java.lang.String, int)",
      "begin_line": 2201,
      "end_line": 2203,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array with a maximum length,\n     * separators specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as one separator.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e separatorChars splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf more than \u003ccode\u003emax\u003c/code\u003e delimited substrings are found, the last\n     * returned string includes all characters after the first \u003ccode\u003emax - 1\u003c/code\u003e\n     * returned strings (including separator characters).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.split(null, *, *)            \u003d null\n     * StringUtils.split(\"\", *, *)              \u003d []\n     * StringUtils.split(\"ab de fg\", null, 0)   \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.split(\"ab   de fg\", null, 0) \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.split(\"ab:cd:ef\", \":\", 0)    \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.split(\"ab:cd:ef\", \":\", 2)    \u003d [\"ab\", \"cd:ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separatorChars  the characters used as the delimiters,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @param max  the maximum number of elements to include in the\n     *  array. A zero or negative value implies no limit\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 2202,col 9)-(line 2202,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByWholeSeparator(java.lang.String, java.lang.String)",
      "begin_line": 2228,
      "end_line": 2230,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator string specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator(s) will not be included in the returned String array.\n     * Adjacent separators are treated as one separator.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e separator splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitByWholeSeparator(null, *)               \u003d null\n     * StringUtils.splitByWholeSeparator(\"\", *)                 \u003d []\n     * StringUtils.splitByWholeSeparator(\"ab de fg\", null)      \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparator(\"ab   de fg\", null)    \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparator(\"ab:cd:ef\", \":\")       \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitByWholeSeparator(\"ab-!-cd-!-ef\", \"-!-\") \u003d [\"ab\", \"cd\", \"ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separator  String containing the String to be used as a delimiter,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String was input\n     ",
      "child_ranges": [
        "(line 2229,col 9)-(line 2229,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByWholeSeparator(java.lang.String, java.lang.String, int)",
      "begin_line": 2259,
      "end_line": 2261,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator string specified.\n     * Returns a maximum of \u003ccode\u003emax\u003c/code\u003e substrings.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator(s) will not be included in the returned String array.\n     * Adjacent separators are treated as one separator.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e separator splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitByWholeSeparator(null, *, *)               \u003d null\n     * StringUtils.splitByWholeSeparator(\"\", *, *)                 \u003d []\n     * StringUtils.splitByWholeSeparator(\"ab de fg\", null, 0)      \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparator(\"ab   de fg\", null, 0)    \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparator(\"ab:cd:ef\", \":\", 2)       \u003d [\"ab\", \"cd:ef\"]\n     * StringUtils.splitByWholeSeparator(\"ab-!-cd-!-ef\", \"-!-\", 5) \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitByWholeSeparator(\"ab-!-cd-!-ef\", \"-!-\", 2) \u003d [\"ab\", \"cd-!-ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separator  String containing the String to be used as a delimiter,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @param max  the maximum number of elements to include in the returned\n     *  array. A zero or negative value implies no limit.\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String was input\n     ",
      "child_ranges": [
        "(line 2260,col 9)-(line 2260,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(java.lang.String, java.lang.String)",
      "begin_line": 2288,
      "end_line": 2290,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator string specified. \u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e separator splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(null, *)               \u003d null\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"\", *)                 \u003d []\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab de fg\", null)      \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab   de fg\", null)    \u003d [\"ab\", \"\", \"\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab:cd:ef\", \":\")       \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab-!-cd-!-ef\", \"-!-\") \u003d [\"ab\", \"cd\", \"ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separator  String containing the String to be used as a delimiter,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String was input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 2289,col 9)-(line 2289,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(java.lang.String, java.lang.String, int)",
      "begin_line": 2321,
      "end_line": 2323,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator string specified.\n     * Returns a maximum of \u003ccode\u003emax\u003c/code\u003e substrings.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e separator splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(null, *, *)               \u003d null\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"\", *, *)                 \u003d []\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab de fg\", null, 0)      \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab   de fg\", null, 0)    \u003d [\"ab\", \"\", \"\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab:cd:ef\", \":\", 2)       \u003d [\"ab\", \"cd:ef\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab-!-cd-!-ef\", \"-!-\", 5) \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab-!-cd-!-ef\", \"-!-\", 2) \u003d [\"ab\", \"cd-!-ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separator  String containing the String to be used as a delimiter,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @param max  the maximum number of elements to include in the returned\n     *  array. A zero or negative value implies no limit.\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String was input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 2322,col 9)-(line 2322,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByWholeSeparatorWorker(java.lang.String, java.lang.String, int, boolean)",
      "begin_line": 2339,
      "end_line": 2404,
      "comment": "\n     * Performs the logic for the \u003ccode\u003esplitByWholeSeparatorPreserveAllTokens\u003c/code\u003e methods.\n     *\n     * @param str  the String to parse, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param separator  String containing the String to be used as a delimiter,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @param max  the maximum number of elements to include in the returned\n     *  array. A zero or negative value implies no limit.\n     * @param preserveAllTokens if \u003ccode\u003etrue\u003c/code\u003e, adjacent separators are\n     * treated as empty token separators; if \u003ccode\u003efalse\u003c/code\u003e, adjacent\n     * separators are treated as one separator.\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 2342,col 9)-(line 2344,col 9)",
        "(line 2346,col 9)-(line 2346,col 31)",
        "(line 2348,col 9)-(line 2350,col 9)",
        "(line 2352,col 9)-(line 2355,col 9)",
        "(line 2357,col 9)-(line 2357,col 49)",
        "(line 2359,col 9)-(line 2359,col 63)",
        "(line 2360,col 9)-(line 2360,col 35)",
        "(line 2361,col 9)-(line 2361,col 20)",
        "(line 2362,col 9)-(line 2362,col 20)",
        "(line 2363,col 9)-(line 2401,col 9)",
        "(line 2403,col 9)-(line 2403,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(java.lang.String)",
      "begin_line": 2431,
      "end_line": 2433,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, using whitespace as the\n     * separator, preserving all tokens, including empty tokens created by \n     * adjacent separators. This is an alternative to using StringTokenizer.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitPreserveAllTokens(null)       \u003d null\n     * StringUtils.splitPreserveAllTokens(\"\")         \u003d []\n     * StringUtils.splitPreserveAllTokens(\"abc def\")  \u003d [\"abc\", \"def\"]\n     * StringUtils.splitPreserveAllTokens(\"abc  def\") \u003d [\"abc\", \"\", \"def\"]\n     * StringUtils.splitPreserveAllTokens(\" abc \")    \u003d [\"\", \"abc\", \"\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2432,col 9)-(line 2432,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(java.lang.String, char)",
      "begin_line": 2467,
      "end_line": 2469,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator specified,\n     * preserving all tokens, including empty tokens created by adjacent\n     * separators. This is an alternative to using StringTokenizer.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitPreserveAllTokens(null, *)         \u003d null\n     * StringUtils.splitPreserveAllTokens(\"\", *)           \u003d []\n     * StringUtils.splitPreserveAllTokens(\"a.b.c\", \u0027.\u0027)    \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"a..b.c\", \u0027.\u0027)   \u003d [\"a\", \"\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"a:b:c\", \u0027.\u0027)    \u003d [\"a:b:c\"]\n     * StringUtils.splitPreserveAllTokens(\"a\\tb\\nc\", null) \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"a b c\", \u0027 \u0027)    \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"a b c \", \u0027 \u0027)   \u003d [\"a\", \"b\", \"c\", \"\"]\n     * StringUtils.splitPreserveAllTokens(\"a b c  \", \u0027 \u0027)   \u003d [\"a\", \"b\", \"c\", \"\", \"\"]\n     * StringUtils.splitPreserveAllTokens(\" a b c\", \u0027 \u0027)   \u003d [\"\", a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"  a b c\", \u0027 \u0027)  \u003d [\"\", \"\", a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\" a b c \", \u0027 \u0027)  \u003d [\"\", a\", \"b\", \"c\", \"\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param separatorChar  the character used as the delimiter,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2468,col 9)-(line 2468,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitWorker(java.lang.String, char, boolean)",
      "begin_line": 2483,
      "end_line": 2515,
      "comment": "\n     * Performs the logic for the \u003ccode\u003esplit\u003c/code\u003e and \n     * \u003ccode\u003esplitPreserveAllTokens\u003c/code\u003e methods that do not return a\n     * maximum array length.\n     *\n     * @param str  the String to parse, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param separatorChar the separate character\n     * @param preserveAllTokens if \u003ccode\u003etrue\u003c/code\u003e, adjacent separators are\n     * treated as empty token separators; if \u003ccode\u003efalse\u003c/code\u003e, adjacent\n     * separators are treated as one separator.\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 2486,col 9)-(line 2488,col 9)",
        "(line 2489,col 9)-(line 2489,col 31)",
        "(line 2490,col 9)-(line 2492,col 9)",
        "(line 2493,col 9)-(line 2493,col 52)",
        "(line 2494,col 9)-(line 2494,col 29)",
        "(line 2495,col 9)-(line 2495,col 30)",
        "(line 2496,col 9)-(line 2496,col 34)",
        "(line 2497,col 9)-(line 2510,col 9)",
        "(line 2511,col 9)-(line 2513,col 9)",
        "(line 2514,col 9)-(line 2514,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(java.lang.String, java.lang.String)",
      "begin_line": 2550,
      "end_line": 2552,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separators specified, \n     * preserving all tokens, including empty tokens created by adjacent\n     * separators. This is an alternative to using StringTokenizer.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e separatorChars splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitPreserveAllTokens(null, *)           \u003d null\n     * StringUtils.splitPreserveAllTokens(\"\", *)             \u003d []\n     * StringUtils.splitPreserveAllTokens(\"abc def\", null)   \u003d [\"abc\", \"def\"]\n     * StringUtils.splitPreserveAllTokens(\"abc def\", \" \")    \u003d [\"abc\", \"def\"]\n     * StringUtils.splitPreserveAllTokens(\"abc  def\", \" \")   \u003d [\"abc\", \"\", def\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef\", \":\")   \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef:\", \":\")  \u003d [\"ab\", \"cd\", \"ef\", \"\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef::\", \":\") \u003d [\"ab\", \"cd\", \"ef\", \"\", \"\"]\n     * StringUtils.splitPreserveAllTokens(\"ab::cd:ef\", \":\")  \u003d [\"ab\", \"\", cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\":cd:ef\", \":\")     \u003d [\"\", cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"::cd:ef\", \":\")    \u003d [\"\", \"\", cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\":cd:ef:\", \":\")    \u003d [\"\", cd\", \"ef\", \"\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param separatorChars  the characters used as the delimiters,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2551,col 9)-(line 2551,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(java.lang.String, java.lang.String, int)",
      "begin_line": 2590,
      "end_line": 2592,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array with a maximum length,\n     * separators specified, preserving all tokens, including empty tokens \n     * created by adjacent separators.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * Adjacent separators are treated as one separator.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e separatorChars splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf more than \u003ccode\u003emax\u003c/code\u003e delimited substrings are found, the last\n     * returned string includes all characters after the first \u003ccode\u003emax - 1\u003c/code\u003e\n     * returned strings (including separator characters).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitPreserveAllTokens(null, *, *)            \u003d null\n     * StringUtils.splitPreserveAllTokens(\"\", *, *)              \u003d []\n     * StringUtils.splitPreserveAllTokens(\"ab de fg\", null, 0)   \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab   de fg\", null, 0) \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef\", \":\", 0)    \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef\", \":\", 2)    \u003d [\"ab\", \"cd:ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab   de fg\", null, 2) \u003d [\"ab\", \"  de fg\"]\n     * StringUtils.splitPreserveAllTokens(\"ab   de fg\", null, 3) \u003d [\"ab\", \"\", \" de fg\"]\n     * StringUtils.splitPreserveAllTokens(\"ab   de fg\", null, 4) \u003d [\"ab\", \"\", \"\", \"de fg\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param separatorChars  the characters used as the delimiters,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @param max  the maximum number of elements to include in the\n     *  array. A zero or negative value implies no limit\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2591,col 9)-(line 2591,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitWorker(java.lang.String, java.lang.String, int, boolean)",
      "begin_line": 2608,
      "end_line": 2691,
      "comment": "\n     * Performs the logic for the \u003ccode\u003esplit\u003c/code\u003e and \n     * \u003ccode\u003esplitPreserveAllTokens\u003c/code\u003e methods that return a maximum array \n     * length.\n     *\n     * @param str  the String to parse, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param separatorChars the separate character\n     * @param max  the maximum number of elements to include in the\n     *  array. A zero or negative value implies no limit.\n     * @param preserveAllTokens if \u003ccode\u003etrue\u003c/code\u003e, adjacent separators are\n     * treated as empty token separators; if \u003ccode\u003efalse\u003c/code\u003e, adjacent\n     * separators are treated as one separator.\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 2613,col 9)-(line 2615,col 9)",
        "(line 2616,col 9)-(line 2616,col 31)",
        "(line 2617,col 9)-(line 2619,col 9)",
        "(line 2620,col 9)-(line 2620,col 52)",
        "(line 2621,col 9)-(line 2621,col 26)",
        "(line 2622,col 9)-(line 2622,col 29)",
        "(line 2623,col 9)-(line 2623,col 30)",
        "(line 2624,col 9)-(line 2624,col 34)",
        "(line 2625,col 9)-(line 2686,col 9)",
        "(line 2687,col 9)-(line 2689,col 9)",
        "(line 2690,col 9)-(line 2690,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByCharacterType(java.lang.String)",
      "begin_line": 2712,
      "end_line": 2714,
      "comment": "\n     * \u003cp\u003eSplits a String by Character type as returned by\n     * \u003ccode\u003ejava.lang.Character.getType(char)\u003c/code\u003e. Groups of contiguous\n     * characters of the same type are returned as complete tokens. \n     * \u003cpre\u003e\n     * StringUtils.splitByCharacterType(null)         \u003d null\n     * StringUtils.splitByCharacterType(\"\")           \u003d []\n     * StringUtils.splitByCharacterType(\"ab de fg\")   \u003d [\"ab\", \" \", \"de\", \" \", \"fg\"]\n     * StringUtils.splitByCharacterType(\"ab   de fg\") \u003d [\"ab\", \"   \", \"de\", \" \", \"fg\"]\n     * StringUtils.splitByCharacterType(\"ab:cd:ef\")   \u003d [\"ab\", \":\", \"cd\", \":\", \"ef\"]\n     * StringUtils.splitByCharacterType(\"number5\")    \u003d [\"number\", \"5\"]\n     * StringUtils.splitByCharacterType(\"fooBar\")     \u003d [\"foo\", \"B\", \"ar\"]\n     * StringUtils.splitByCharacterType(\"foo200Bar\")  \u003d [\"foo\", \"200\", \"B\", \"ar\"]\n     * StringUtils.splitByCharacterType(\"ASFRules\")   \u003d [\"ASFR\", \"ules\"]\n     * \u003c/pre\u003e\n     * @param str the String to split, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 2713,col 9)-(line 2713,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase(java.lang.String)",
      "begin_line": 2740,
      "end_line": 2742,
      "comment": "\n     * \u003cp\u003eSplits a String by Character type as returned by\n     * \u003ccode\u003ejava.lang.Character.getType(char)\u003c/code\u003e. Groups of contiguous\n     * characters of the same type are returned as complete tokens, with the\n     * following exception: the character of type\n     * \u003ccode\u003eCharacter.UPPERCASE_LETTER\u003c/code\u003e, if any, immediately\n     * preceding a token of type \u003ccode\u003eCharacter.LOWERCASE_LETTER\u003c/code\u003e\n     * will belong to the following token rather than to the preceding, if any,\n     * \u003ccode\u003eCharacter.UPPERCASE_LETTER\u003c/code\u003e token. \n     * \u003cpre\u003e\n     * StringUtils.splitByCharacterTypeCamelCase(null)         \u003d null\n     * StringUtils.splitByCharacterTypeCamelCase(\"\")           \u003d []\n     * StringUtils.splitByCharacterTypeCamelCase(\"ab de fg\")   \u003d [\"ab\", \" \", \"de\", \" \", \"fg\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"ab   de fg\") \u003d [\"ab\", \"   \", \"de\", \" \", \"fg\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"ab:cd:ef\")   \u003d [\"ab\", \":\", \"cd\", \":\", \"ef\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"number5\")    \u003d [\"number\", \"5\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"fooBar\")     \u003d [\"foo\", \"Bar\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"foo200Bar\")  \u003d [\"foo\", \"200\", \"Bar\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"ASFRules\")   \u003d [\"ASF\", \"Rules\"]\n     * \u003c/pre\u003e\n     * @param str the String to split, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 2741,col 9)-(line 2741,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByCharacterType(java.lang.String, boolean)",
      "begin_line": 2758,
      "end_line": 2788,
      "comment": "\n     * \u003cp\u003eSplits a String by Character type as returned by\n     * \u003ccode\u003ejava.lang.Character.getType(char)\u003c/code\u003e. Groups of contiguous\n     * characters of the same type are returned as complete tokens, with the\n     * following exception: if \u003ccode\u003ecamelCase\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e,\n     * the character of type \u003ccode\u003eCharacter.UPPERCASE_LETTER\u003c/code\u003e, if any,\n     * immediately preceding a token of type \u003ccode\u003eCharacter.LOWERCASE_LETTER\u003c/code\u003e\n     * will belong to the following token rather than to the preceding, if any,\n     * \u003ccode\u003eCharacter.UPPERCASE_LETTER\u003c/code\u003e token. \n     * @param str the String to split, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param camelCase whether to use so-called \"camel-case\" for letter types\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 2759,col 9)-(line 2761,col 9)",
        "(line 2762,col 9)-(line 2764,col 9)",
        "(line 2765,col 9)-(line 2765,col 37)",
        "(line 2766,col 9)-(line 2766,col 52)",
        "(line 2767,col 9)-(line 2767,col 27)",
        "(line 2768,col 9)-(line 2768,col 59)",
        "(line 2769,col 9)-(line 2785,col 9)",
        "(line 2786,col 9)-(line 2786,col 67)",
        "(line 2787,col 9)-(line 2787,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.lang.Object[])",
      "begin_line": 2812,
      "end_line": 2814,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo separator is added to the joined String.\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null)            \u003d null\n     * StringUtils.join([])              \u003d \"\"\n     * StringUtils.join([null])          \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"]) \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"]) \u003d \"a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to join together, may be null\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2813,col 9)-(line 2813,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.lang.Object[], char)",
      "begin_line": 2838,
      "end_line": 2844,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null, *)               \u003d null\n     * StringUtils.join([], *)                 \u003d \"\"\n     * StringUtils.join([null], *)             \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \u0027;\u0027)  \u003d \"a;b;c\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], null) \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"], \u0027;\u0027)  \u003d \";;a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to join together, may be null\n     * @param separator  the separator character to use\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2839,col 9)-(line 2841,col 9)",
        "(line 2843,col 9)-(line 2843,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.lang.Object[], char, int, int)",
      "begin_line": 2872,
      "end_line": 2893,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null, *)               \u003d null\n     * StringUtils.join([], *)                 \u003d \"\"\n     * StringUtils.join([null], *)             \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \u0027;\u0027)  \u003d \"a;b;c\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], null) \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"], \u0027;\u0027)  \u003d \";;a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to join together, may be null\n     * @param separator  the separator character to use\n     * @param startIndex the first index to start joining from.  It is\n     * an error to pass in an end index past the end of the array\n     * @param endIndex the index to stop joining from (exclusive). It is\n     * an error to pass in an end index past the end of the array\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2873,col 9)-(line 2875,col 9)",
        "(line 2876,col 9)-(line 2876,col 46)",
        "(line 2877,col 9)-(line 2879,col 9)",
        "(line 2881,col 9)-(line 2881,col 98)",
        "(line 2882,col 9)-(line 2882,col 55)",
        "(line 2884,col 9)-(line 2891,col 9)",
        "(line 2892,col 9)-(line 2892,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.lang.Object[], java.lang.String)",
      "begin_line": 2919,
      "end_line": 2924,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * A \u003ccode\u003enull\u003c/code\u003e separator is the same as an empty String (\"\").\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null, *)                \u003d null\n     * StringUtils.join([], *)                  \u003d \"\"\n     * StringUtils.join([null], *)              \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \"--\")  \u003d \"a--b--c\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], null)  \u003d \"abc\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \"\")    \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"], \u0027,\u0027)   \u003d \",,a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to join together, may be null\n     * @param separator  the separator character to use, null treated as \"\"\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2920,col 9)-(line 2922,col 9)",
        "(line 2923,col 9)-(line 2923,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.lang.Object[], java.lang.String, int, int)",
      "begin_line": 2953,
      "end_line": 2982,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * A \u003ccode\u003enull\u003c/code\u003e separator is the same as an empty String (\"\").\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null, *)                \u003d null\n     * StringUtils.join([], *)                  \u003d \"\"\n     * StringUtils.join([null], *)              \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \"--\")  \u003d \"a--b--c\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], null)  \u003d \"abc\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \"\")    \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"], \u0027,\u0027)   \u003d \",,a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to join together, may be null\n     * @param separator  the separator character to use, null treated as \"\"\n     * @param startIndex the first index to start joining from.  It is\n     * an error to pass in an end index past the end of the array\n     * @param endIndex the index to stop joining from (exclusive). It is\n     * an error to pass in an end index past the end of the array\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2954,col 9)-(line 2956,col 9)",
        "(line 2957,col 9)-(line 2959,col 9)",
        "(line 2963,col 9)-(line 2963,col 46)",
        "(line 2964,col 9)-(line 2966,col 9)",
        "(line 2968,col 9)-(line 2969,col 46)",
        "(line 2971,col 9)-(line 2971,col 55)",
        "(line 2973,col 9)-(line 2980,col 9)",
        "(line 2981,col 9)-(line 2981,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.util.Iterator\u003c?\u003e, char)",
      "begin_line": 2998,
      "end_line": 3027,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided \u003ccode\u003eIterator\u003c/code\u003e into\n     * a single String containing the provided elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list. Null objects or empty\n     * strings within the iteration are represented by empty strings.\u003c/p\u003e\n     *\n     * \u003cp\u003eSee the examples here: {@link #join(Object[],char)}. \u003c/p\u003e\n     *\n     * @param iterator  the \u003ccode\u003eIterator\u003c/code\u003e of values to join together, may be null\n     * @param separator  the separator character to use\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null iterator input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 3001,col 9)-(line 3003,col 9)",
        "(line 3004,col 9)-(line 3006,col 9)",
        "(line 3007,col 9)-(line 3007,col 39)",
        "(line 3008,col 9)-(line 3010,col 9)",
        "(line 3013,col 9)-(line 3013,col 51)",
        "(line 3014,col 9)-(line 3016,col 9)",
        "(line 3018,col 9)-(line 3024,col 9)",
        "(line 3026,col 9)-(line 3026,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.util.Iterator\u003c?\u003e, java.lang.String)",
      "begin_line": 3042,
      "end_line": 3072,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided \u003ccode\u003eIterator\u003c/code\u003e into\n     * a single String containing the provided elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * A \u003ccode\u003enull\u003c/code\u003e separator is the same as an empty String (\"\").\u003c/p\u003e\n     *\n     * \u003cp\u003eSee the examples here: {@link #join(Object[],String)}. \u003c/p\u003e\n     *\n     * @param iterator  the \u003ccode\u003eIterator\u003c/code\u003e of values to join together, may be null\n     * @param separator  the separator character to use, null treated as \"\"\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null iterator input\n     ",
      "child_ranges": [
        "(line 3045,col 9)-(line 3047,col 9)",
        "(line 3048,col 9)-(line 3050,col 9)",
        "(line 3051,col 9)-(line 3051,col 39)",
        "(line 3052,col 9)-(line 3054,col 9)",
        "(line 3057,col 9)-(line 3057,col 51)",
        "(line 3058,col 9)-(line 3060,col 9)",
        "(line 3062,col 9)-(line 3070,col 9)",
        "(line 3071,col 9)-(line 3071,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.lang.Iterable\u003c?\u003e, char)",
      "begin_line": 3088,
      "end_line": 3093,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided \u003ccode\u003eIterable\u003c/code\u003e into\n     * a single String containing the provided elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list. Null objects or empty\n     * strings within the iteration are represented by empty strings.\u003c/p\u003e\n     *\n     * \u003cp\u003eSee the examples here: {@link #join(Object[],char)}. \u003c/p\u003e\n     *\n     * @param iterable  the \u003ccode\u003eIterable\u003c/code\u003e providing the values to join together, may be null\n     * @param separator  the separator character to use\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null iterator input\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 3089,col 9)-(line 3091,col 9)",
        "(line 3092,col 9)-(line 3092,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.lang.Iterable\u003c?\u003e, java.lang.String)",
      "begin_line": 3109,
      "end_line": 3114,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided \u003ccode\u003eIterable\u003c/code\u003e into\n     * a single String containing the provided elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * A \u003ccode\u003enull\u003c/code\u003e separator is the same as an empty String (\"\").\u003c/p\u003e\n     *\n     * \u003cp\u003eSee the examples here: {@link #join(Object[],String)}. \u003c/p\u003e\n     *\n     * @param iterable  the \u003ccode\u003eIterable\u003c/code\u003e providing the values to join together, may be null\n     * @param separator  the separator character to use, null treated as \"\"\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null iterator input\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 3110,col 9)-(line 3112,col 9)",
        "(line 3113,col 9)-(line 3113,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.deleteWhitespace(java.lang.String)",
      "begin_line": 3132,
      "end_line": 3148,
      "comment": "\n     * \u003cp\u003eDeletes all whitespaces from a String as defined by\n     * {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.deleteWhitespace(null)         \u003d null\n     * StringUtils.deleteWhitespace(\"\")           \u003d \"\"\n     * StringUtils.deleteWhitespace(\"abc\")        \u003d \"abc\"\n     * StringUtils.deleteWhitespace(\"   ab  c  \") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to delete whitespace from, may be null\n     * @return the String without whitespaces, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 3133,col 9)-(line 3135,col 9)",
        "(line 3136,col 9)-(line 3136,col 30)",
        "(line 3137,col 9)-(line 3137,col 34)",
        "(line 3138,col 9)-(line 3138,col 22)",
        "(line 3139,col 9)-(line 3143,col 9)",
        "(line 3144,col 9)-(line 3146,col 9)",
        "(line 3147,col 9)-(line 3147,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.removeStart(java.lang.String, java.lang.String)",
      "begin_line": 3176,
      "end_line": 3184,
      "comment": "\n     * \u003cp\u003eRemoves a substring only if it is at the begining of a source string,\n     * otherwise returns the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e source string will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") source string will return the empty string.\n     * A \u003ccode\u003enull\u003c/code\u003e search string will return the source string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.removeStart(null, *)      \u003d null\n     * StringUtils.removeStart(\"\", *)        \u003d \"\"\n     * StringUtils.removeStart(*, null)      \u003d *\n     * StringUtils.removeStart(\"www.domain.com\", \"www.\")   \u003d \"domain.com\"\n     * StringUtils.removeStart(\"domain.com\", \"www.\")       \u003d \"domain.com\"\n     * StringUtils.removeStart(\"www.domain.com\", \"domain\") \u003d \"www.domain.com\"\n     * StringUtils.removeStart(\"abc\", \"\")    \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the String to search for and remove, may be null\n     * @return the substring with the string removed if found,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3177,col 9)-(line 3179,col 9)",
        "(line 3180,col 9)-(line 3182,col 9)",
        "(line 3183,col 9)-(line 3183,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.removeStartIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 3211,
      "end_line": 3219,
      "comment": "\n     * \u003cp\u003eCase insensitive removal of a substring if it is at the begining of a source string,\n     * otherwise returns the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e source string will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") source string will return the empty string.\n     * A \u003ccode\u003enull\u003c/code\u003e search string will return the source string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.removeStartIgnoreCase(null, *)      \u003d null\n     * StringUtils.removeStartIgnoreCase(\"\", *)        \u003d \"\"\n     * StringUtils.removeStartIgnoreCase(*, null)      \u003d *\n     * StringUtils.removeStartIgnoreCase(\"www.domain.com\", \"www.\")   \u003d \"domain.com\"\n     * StringUtils.removeStartIgnoreCase(\"www.domain.com\", \"WWW.\")   \u003d \"domain.com\"\n     * StringUtils.removeStartIgnoreCase(\"domain.com\", \"www.\")       \u003d \"domain.com\"\n     * StringUtils.removeStartIgnoreCase(\"www.domain.com\", \"domain\") \u003d \"www.domain.com\"\n     * StringUtils.removeStartIgnoreCase(\"abc\", \"\")    \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the String to search for (case insensitive) and remove, may be null\n     * @return the substring with the string removed if found,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3212,col 9)-(line 3214,col 9)",
        "(line 3215,col 9)-(line 3217,col 9)",
        "(line 3218,col 9)-(line 3218,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.removeEnd(java.lang.String, java.lang.String)",
      "begin_line": 3245,
      "end_line": 3253,
      "comment": "\n     * \u003cp\u003eRemoves a substring only if it is at the end of a source string,\n     * otherwise returns the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e source string will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") source string will return the empty string.\n     * A \u003ccode\u003enull\u003c/code\u003e search string will return the source string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.removeEnd(null, *)      \u003d null\n     * StringUtils.removeEnd(\"\", *)        \u003d \"\"\n     * StringUtils.removeEnd(*, null)      \u003d *\n     * StringUtils.removeEnd(\"www.domain.com\", \".com.\")  \u003d \"www.domain.com\"\n     * StringUtils.removeEnd(\"www.domain.com\", \".com\")   \u003d \"www.domain\"\n     * StringUtils.removeEnd(\"www.domain.com\", \"domain\") \u003d \"www.domain.com\"\n     * StringUtils.removeEnd(\"abc\", \"\")    \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the String to search for and remove, may be null\n     * @return the substring with the string removed if found,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3246,col 9)-(line 3248,col 9)",
        "(line 3249,col 9)-(line 3251,col 9)",
        "(line 3252,col 9)-(line 3252,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.removeEndIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 3279,
      "end_line": 3287,
      "comment": "\n     * \u003cp\u003eCase insensitive removal of a substring if it is at the end of a source string,\n     * otherwise returns the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e source string will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") source string will return the empty string.\n     * A \u003ccode\u003enull\u003c/code\u003e search string will return the source string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.removeEnd(null, *)      \u003d null\n     * StringUtils.removeEnd(\"\", *)        \u003d \"\"\n     * StringUtils.removeEnd(*, null)      \u003d *\n     * StringUtils.removeEnd(\"www.domain.com\", \".com.\")  \u003d \"www.domain.com.\"\n     * StringUtils.removeEnd(\"www.domain.com\", \".com\")   \u003d \"www.domain\"\n     * StringUtils.removeEnd(\"www.domain.com\", \"domain\") \u003d \"www.domain.com\"\n     * StringUtils.removeEnd(\"abc\", \"\")    \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the String to search for (case insensitive) and remove, may be null\n     * @return the substring with the string removed if found,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3280,col 9)-(line 3282,col 9)",
        "(line 3283,col 9)-(line 3285,col 9)",
        "(line 3286,col 9)-(line 3286,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.remove(java.lang.String, java.lang.String)",
      "begin_line": 3312,
      "end_line": 3317,
      "comment": "\n     * \u003cp\u003eRemoves all occurrences of a substring from within the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e source string will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") source string will return the empty string.\n     * A \u003ccode\u003enull\u003c/code\u003e remove string will return the source string.\n     * An empty (\"\") remove string will return the source string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.remove(null, *)        \u003d null\n     * StringUtils.remove(\"\", *)          \u003d \"\"\n     * StringUtils.remove(*, null)        \u003d *\n     * StringUtils.remove(*, \"\")          \u003d *\n     * StringUtils.remove(\"queued\", \"ue\") \u003d \"qd\"\n     * StringUtils.remove(\"queued\", \"zz\") \u003d \"queued\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the String to search for and remove, may be null\n     * @return the substring with the string removed if found,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3313,col 9)-(line 3315,col 9)",
        "(line 3316,col 9)-(line 3316,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.remove(java.lang.String, char)",
      "begin_line": 3338,
      "end_line": 3350,
      "comment": "\n     * \u003cp\u003eRemoves all occurrences of a character from within the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e source string will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") source string will return the empty string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.remove(null, *)       \u003d null\n     * StringUtils.remove(\"\", *)         \u003d \"\"\n     * StringUtils.remove(\"queued\", \u0027u\u0027) \u003d \"qeed\"\n     * StringUtils.remove(\"queued\", \u0027z\u0027) \u003d \"queued\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the char to search for and remove, may be null\n     * @return the substring with the char removed if found,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3339,col 9)-(line 3341,col 9)",
        "(line 3342,col 9)-(line 3342,col 41)",
        "(line 3343,col 9)-(line 3343,col 20)",
        "(line 3344,col 9)-(line 3348,col 9)",
        "(line 3349,col 9)-(line 3349,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replaceOnce(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 3377,
      "end_line": 3379,
      "comment": "\n     * \u003cp\u003eReplaces a String with another String inside a larger String, once.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e reference passed to this method is a no-op.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replaceOnce(null, *, *)        \u003d null\n     * StringUtils.replaceOnce(\"\", *, *)          \u003d \"\"\n     * StringUtils.replaceOnce(\"any\", null, *)    \u003d \"any\"\n     * StringUtils.replaceOnce(\"any\", *, null)    \u003d \"any\"\n     * StringUtils.replaceOnce(\"any\", \"\", *)      \u003d \"any\"\n     * StringUtils.replaceOnce(\"aba\", \"a\", null)  \u003d \"aba\"\n     * StringUtils.replaceOnce(\"aba\", \"a\", \"\")    \u003d \"ba\"\n     * StringUtils.replaceOnce(\"aba\", \"a\", \"z\")   \u003d \"zba\"\n     * \u003c/pre\u003e\n     *\n     * @see #replace(String text, String searchString, String replacement, int max)\n     * @param text  text to search and replace in, may be null\n     * @param searchString  the String to search for, may be null\n     * @param replacement  the String to replace with, may be null\n     * @return the text with any replacements processed,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 3378,col 9)-(line 3378,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replace(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 3404,
      "end_line": 3406,
      "comment": "\n     * \u003cp\u003eReplaces all occurrences of a String within another String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e reference passed to this method is a no-op.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replace(null, *, *)        \u003d null\n     * StringUtils.replace(\"\", *, *)          \u003d \"\"\n     * StringUtils.replace(\"any\", null, *)    \u003d \"any\"\n     * StringUtils.replace(\"any\", *, null)    \u003d \"any\"\n     * StringUtils.replace(\"any\", \"\", *)      \u003d \"any\"\n     * StringUtils.replace(\"aba\", \"a\", null)  \u003d \"aba\"\n     * StringUtils.replace(\"aba\", \"a\", \"\")    \u003d \"b\"\n     * StringUtils.replace(\"aba\", \"a\", \"z\")   \u003d \"zbz\"\n     * \u003c/pre\u003e\n     *\n     * @see #replace(String text, String searchString, String replacement, int max)\n     * @param text  text to search and replace in, may be null\n     * @param searchString  the String to search for, may be null\n     * @param replacement  the String to replace it with, may be null\n     * @return the text with any replacements processed,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 3405,col 9)-(line 3405,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replace(java.lang.String, java.lang.String, java.lang.String, int)",
      "begin_line": 3436,
      "end_line": 3460,
      "comment": "\n     * \u003cp\u003eReplaces a String with another String inside a larger String,\n     * for the first \u003ccode\u003emax\u003c/code\u003e values of the search String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e reference passed to this method is a no-op.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replace(null, *, *, *)         \u003d null\n     * StringUtils.replace(\"\", *, *, *)           \u003d \"\"\n     * StringUtils.replace(\"any\", null, *, *)     \u003d \"any\"\n     * StringUtils.replace(\"any\", *, null, *)     \u003d \"any\"\n     * StringUtils.replace(\"any\", \"\", *, *)       \u003d \"any\"\n     * StringUtils.replace(\"any\", *, *, 0)        \u003d \"any\"\n     * StringUtils.replace(\"abaa\", \"a\", null, -1) \u003d \"abaa\"\n     * StringUtils.replace(\"abaa\", \"a\", \"\", -1)   \u003d \"b\"\n     * StringUtils.replace(\"abaa\", \"a\", \"z\", 0)   \u003d \"abaa\"\n     * StringUtils.replace(\"abaa\", \"a\", \"z\", 1)   \u003d \"zbaa\"\n     * StringUtils.replace(\"abaa\", \"a\", \"z\", 2)   \u003d \"zbza\"\n     * StringUtils.replace(\"abaa\", \"a\", \"z\", -1)  \u003d \"zbzz\"\n     * \u003c/pre\u003e\n     *\n     * @param text  text to search and replace in, may be null\n     * @param searchString  the String to search for, may be null\n     * @param replacement  the String to replace it with, may be null\n     * @param max  maximum number of values to replace, or \u003ccode\u003e-1\u003c/code\u003e if no maximum\n     * @return the text with any replacements processed,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 3437,col 9)-(line 3439,col 9)",
        "(line 3440,col 9)-(line 3440,col 22)",
        "(line 3441,col 9)-(line 3441,col 52)",
        "(line 3442,col 9)-(line 3444,col 9)",
        "(line 3445,col 9)-(line 3445,col 47)",
        "(line 3446,col 9)-(line 3446,col 57)",
        "(line 3447,col 9)-(line 3447,col 49)",
        "(line 3448,col 9)-(line 3448,col 59)",
        "(line 3449,col 9)-(line 3449,col 72)",
        "(line 3450,col 9)-(line 3457,col 9)",
        "(line 3458,col 9)-(line 3458,col 42)",
        "(line 3459,col 9)-(line 3459,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replaceEach(java.lang.String, java.lang.String[], java.lang.String[])",
      "begin_line": 3501,
      "end_line": 3503,
      "comment": "\n     * \u003cp\u003e\n     * Replaces all occurrences of Strings within another String.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e reference passed to this method is a no-op, or if\n     * any \"search string\" or \"string to replace\" is null, that replace will be\n     * ignored. This will not repeat. For repeating replaces, call the\n     * overloaded method.\n     * \u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *  StringUtils.replaceEach(null, *, *)        \u003d null\n     *  StringUtils.replaceEach(\"\", *, *)          \u003d \"\"\n     *  StringUtils.replaceEach(\"aba\", null, null) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[0], null) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", null, new String[0]) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, null)  \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, new String[]{\"\"})  \u003d \"b\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{null}, new String[]{\"a\"})  \u003d \"aba\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"w\", \"t\"})  \u003d \"wcte\"\n     *  (example of how it does not repeat)\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"t\"})  \u003d \"dcte\"\n     * \u003c/pre\u003e\n     * \n     * @param text\n     *            text to search and replace in, no-op if null\n     * @param searchList\n     *            the Strings to search for, no-op if null\n     * @param replacementList\n     *            the Strings to replace them with, no-op if null\n     * @return the text with any replacements processed, \u003ccode\u003enull\u003c/code\u003e if\n     *         null String input\n     * @throws IndexOutOfBoundsException\n     *             if the lengths of the arrays are not the same (null is ok,\n     *             and/or size 0)\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3502,col 9)-(line 3502,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(java.lang.String, java.lang.String[], java.lang.String[])",
      "begin_line": 3550,
      "end_line": 3555,
      "comment": "\n     * \u003cp\u003e\n     * Replaces all occurrences of Strings within another String.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e reference passed to this method is a no-op, or if\n     * any \"search string\" or \"string to replace\" is null, that replace will be\n     * ignored. This will not repeat. For repeating replaces, call the\n     * overloaded method.\n     * \u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *  StringUtils.replaceEach(null, *, *, *) \u003d null\n     *  StringUtils.replaceEach(\"\", *, *, *) \u003d \"\"\n     *  StringUtils.replaceEach(\"aba\", null, null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[0], null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", null, new String[0], *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, new String[]{\"\"}, *) \u003d \"b\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{null}, new String[]{\"a\"}, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"w\", \"t\"}, *) \u003d \"wcte\"\n     *  (example of how it repeats)\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"t\"}, false) \u003d \"dcte\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"t\"}, true) \u003d \"tcte\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"ab\"}, true) \u003d IllegalArgumentException\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"ab\"}, false) \u003d \"dcabe\"\n     * \u003c/pre\u003e\n     * \n     * @param text\n     *            text to search and replace in, no-op if null\n     * @param searchList\n     *            the Strings to search for, no-op if null\n     * @param replacementList\n     *            the Strings to replace them with, no-op if null\n     * @return the text with any replacements processed, \u003ccode\u003enull\u003c/code\u003e if\n     *         null String input\n     * @throws IllegalArgumentException\n     *             if the search is repeating and there is an endless loop due\n     *             to outputs of one being inputs to another\n     * @throws IndexOutOfBoundsException\n     *             if the lengths of the arrays are not the same (null is ok,\n     *             and/or size 0)\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3553,col 9)-(line 3553,col 68)",
        "(line 3554,col 9)-(line 3554,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replaceEach(java.lang.String, java.lang.String[], java.lang.String[], boolean, int)",
      "begin_line": 3605,
      "end_line": 3731,
      "comment": "\n     * \u003cp\u003e\n     * Replaces all occurrences of Strings within another String.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e reference passed to this method is a no-op, or if\n     * any \"search string\" or \"string to replace\" is null, that replace will be\n     * ignored. \n     * \u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *  StringUtils.replaceEach(null, *, *, *) \u003d null\n     *  StringUtils.replaceEach(\"\", *, *, *) \u003d \"\"\n     *  StringUtils.replaceEach(\"aba\", null, null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[0], null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", null, new String[0], *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, new String[]{\"\"}, *) \u003d \"b\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{null}, new String[]{\"a\"}, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"w\", \"t\"}, *) \u003d \"wcte\"\n     *  (example of how it repeats)\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"t\"}, false) \u003d \"dcte\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"t\"}, true) \u003d \"tcte\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"ab\"}, *) \u003d IllegalArgumentException\n     * \u003c/pre\u003e\n     * \n     * @param text\n     *            text to search and replace in, no-op if null\n     * @param searchList\n     *            the Strings to search for, no-op if null\n     * @param replacementList\n     *            the Strings to replace them with, no-op if null\n     * @param repeat if true, then replace repeatedly \n     *       until there are no more possible replacements or timeToLive \u003c 0\n     * @param timeToLive\n     *            if less than 0 then there is a circular reference and endless\n     *            loop\n     * @return the text with any replacements processed, \u003ccode\u003enull\u003c/code\u003e if\n     *         null String input\n     * @throws IllegalArgumentException\n     *             if the search is repeating and there is an endless loop due\n     *             to outputs of one being inputs to another\n     * @throws IndexOutOfBoundsException\n     *             if the lengths of the arrays are not the same (null is ok,\n     *             and/or size 0)\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3612,col 9)-(line 3616,col 9)",
        "(line 3619,col 9)-(line 3621,col 9)",
        "(line 3623,col 9)-(line 3623,col 45)",
        "(line 3624,col 9)-(line 3624,col 55)",
        "(line 3627,col 9)-(line 3632,col 9)",
        "(line 3635,col 9)-(line 3635,col 72)",
        "(line 3638,col 9)-(line 3638,col 27)",
        "(line 3639,col 9)-(line 3639,col 30)",
        "(line 3640,col 9)-(line 3640,col 27)",
        "(line 3644,col 9)-(line 3661,col 9)",
        "(line 3665,col 9)-(line 3667,col 9)",
        "(line 3669,col 9)-(line 3669,col 22)",
        "(line 3672,col 9)-(line 3672,col 25)",
        "(line 3675,col 9)-(line 3680,col 9)",
        "(line 3682,col 9)-(line 3682,col 57)",
        "(line 3684,col 9)-(line 3684,col 72)",
        "(line 3686,col 9)-(line 3720,col 9)",
        "(line 3721,col 9)-(line 3721,col 39)",
        "(line 3722,col 9)-(line 3724,col 9)",
        "(line 3725,col 9)-(line 3725,col 39)",
        "(line 3726,col 9)-(line 3728,col 9)",
        "(line 3730,col 9)-(line 3730,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replaceChars(java.lang.String, char, char)",
      "begin_line": 3755,
      "end_line": 3760,
      "comment": "\n     * \u003cp\u003eReplaces all occurrences of a character in a String with another.\n     * This is a null-safe version of {@link String#replace(char, char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input returns \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") string input returns an empty string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replaceChars(null, *, *)        \u003d null\n     * StringUtils.replaceChars(\"\", *, *)          \u003d \"\"\n     * StringUtils.replaceChars(\"abcba\", \u0027b\u0027, \u0027y\u0027) \u003d \"aycya\"\n     * StringUtils.replaceChars(\"abcba\", \u0027z\u0027, \u0027y\u0027) \u003d \"abcba\"\n     * \u003c/pre\u003e\n     *\n     * @param str  String to replace characters in, may be null\n     * @param searchChar  the character to search for, may be null\n     * @param replaceChar  the character to replace, may be null\n     * @return modified String, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 3756,col 9)-(line 3758,col 9)",
        "(line 3759,col 9)-(line 3759,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replaceChars(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 3798,
      "end_line": 3825,
      "comment": "\n     * \u003cp\u003eReplaces multiple characters in a String in one go.\n     * This method can also be used to delete characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example:\u003cbr /\u003e\n     * \u003ccode\u003ereplaceChars(\u0026quot;hello\u0026quot;, \u0026quot;ho\u0026quot;, \u0026quot;jy\u0026quot;) \u003d jelly\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input returns \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") string input returns an empty string.\n     * A null or empty set of search characters returns the input string.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe length of the search characters should normally equal the length\n     * of the replace characters.\n     * If the search characters is longer, then the extra search characters\n     * are deleted.\n     * If the search characters is shorter, then the extra replace characters\n     * are ignored.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replaceChars(null, *, *)           \u003d null\n     * StringUtils.replaceChars(\"\", *, *)             \u003d \"\"\n     * StringUtils.replaceChars(\"abc\", null, *)       \u003d \"abc\"\n     * StringUtils.replaceChars(\"abc\", \"\", *)         \u003d \"abc\"\n     * StringUtils.replaceChars(\"abc\", \"b\", null)     \u003d \"ac\"\n     * StringUtils.replaceChars(\"abc\", \"b\", \"\")       \u003d \"ac\"\n     * StringUtils.replaceChars(\"abcba\", \"bc\", \"yz\")  \u003d \"ayzya\"\n     * StringUtils.replaceChars(\"abcba\", \"bc\", \"y\")   \u003d \"ayya\"\n     * StringUtils.replaceChars(\"abcba\", \"bc\", \"yzx\") \u003d \"ayzya\"\n     * \u003c/pre\u003e\n     *\n     * @param str  String to replace characters in, may be null\n     * @param searchChars  a set of characters to search for, may be null\n     * @param replaceChars  a set of characters to replace, may be null\n     * @return modified String, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 3799,col 9)-(line 3801,col 9)",
        "(line 3802,col 9)-(line 3804,col 9)",
        "(line 3805,col 9)-(line 3805,col 33)",
        "(line 3806,col 9)-(line 3806,col 55)",
        "(line 3807,col 9)-(line 3807,col 37)",
        "(line 3808,col 9)-(line 3808,col 57)",
        "(line 3809,col 9)-(line 3820,col 9)",
        "(line 3821,col 9)-(line 3823,col 9)",
        "(line 3824,col 9)-(line 3824,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.overlay(java.lang.String, java.lang.String, int, int)",
      "begin_line": 3858,
      "end_line": 3888,
      "comment": "\n     * \u003cp\u003eOverlays part of a String with another String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input returns \u003ccode\u003enull\u003c/code\u003e.\n     * A negative index is treated as zero.\n     * An index greater than the string length is treated as the string length.\n     * The start index is always the smaller of the two indices.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.overlay(null, *, *, *)            \u003d null\n     * StringUtils.overlay(\"\", \"abc\", 0, 0)          \u003d \"abc\"\n     * StringUtils.overlay(\"abcdef\", null, 2, 4)     \u003d \"abef\"\n     * StringUtils.overlay(\"abcdef\", \"\", 2, 4)       \u003d \"abef\"\n     * StringUtils.overlay(\"abcdef\", \"\", 4, 2)       \u003d \"abef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", 2, 4)   \u003d \"abzzzzef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", 4, 2)   \u003d \"abzzzzef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", -1, 4)  \u003d \"zzzzef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", 2, 8)   \u003d \"abzzzz\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", -2, -3) \u003d \"zzzzabcdef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", 8, 10)  \u003d \"abcdefzzzz\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to do overlaying in, may be null\n     * @param overlay  the String to overlay, may be null\n     * @param start  the position to start overlaying at\n     * @param end  the position to stop overlaying before\n     * @return overlayed String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 3859,col 9)-(line 3861,col 9)",
        "(line 3862,col 9)-(line 3864,col 9)",
        "(line 3865,col 9)-(line 3865,col 31)",
        "(line 3866,col 9)-(line 3868,col 9)",
        "(line 3869,col 9)-(line 3871,col 9)",
        "(line 3872,col 9)-(line 3874,col 9)",
        "(line 3875,col 9)-(line 3877,col 9)",
        "(line 3878,col 9)-(line 3882,col 9)",
        "(line 3883,col 9)-(line 3887,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.chomp(java.lang.String)",
      "begin_line": 3917,
      "end_line": 3941,
      "comment": "\n     * \u003cp\u003eRemoves one newline from end of a String if it\u0027s there,\n     * otherwise leave it alone.  A newline is \u0026quot;\u003ccode\u003e\\n\u003c/code\u003e\u0026quot;,\n     * \u0026quot;\u003ccode\u003e\\r\u003c/code\u003e\u0026quot;, or \u0026quot;\u003ccode\u003e\\r\\n\u003c/code\u003e\u0026quot;.\u003c/p\u003e\n     *\n     * \u003cp\u003eNOTE: This method changed in 2.0.\n     * It now more closely matches Perl chomp.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.chomp(null)          \u003d null\n     * StringUtils.chomp(\"\")            \u003d \"\"\n     * StringUtils.chomp(\"abc \\r\")      \u003d \"abc \"\n     * StringUtils.chomp(\"abc\\n\")       \u003d \"abc\"\n     * StringUtils.chomp(\"abc\\r\\n\")     \u003d \"abc\"\n     * StringUtils.chomp(\"abc\\r\\n\\r\\n\") \u003d \"abc\\r\\n\"\n     * StringUtils.chomp(\"abc\\n\\r\")     \u003d \"abc\\n\"\n     * StringUtils.chomp(\"abc\\n\\rabc\")  \u003d \"abc\\n\\rabc\"\n     * StringUtils.chomp(\"\\r\")          \u003d \"\"\n     * StringUtils.chomp(\"\\n\")          \u003d \"\"\n     * StringUtils.chomp(\"\\r\\n\")        \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to chomp a newline from, may be null\n     * @return String without newline, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 3918,col 9)-(line 3920,col 9)",
        "(line 3922,col 9)-(line 3928,col 9)",
        "(line 3930,col 9)-(line 3930,col 39)",
        "(line 3931,col 9)-(line 3931,col 40)",
        "(line 3933,col 9)-(line 3939,col 9)",
        "(line 3940,col 9)-(line 3940,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.chomp(java.lang.String, java.lang.String)",
      "begin_line": 3969,
      "end_line": 3977,
      "comment": "\n     * \u003cp\u003eRemoves \u003ccode\u003eseparator\u003c/code\u003e from the end of\n     * \u003ccode\u003estr\u003c/code\u003e if it\u0027s there, otherwise leave it alone.\u003c/p\u003e\n     *\n     * \u003cp\u003eNOTE: This method changed in version 2.0.\n     * It now more closely matches Perl chomp.\n     * For the previous behavior, use {@link #substringBeforeLast(String, String)}.\n     * This method uses {@link String#endsWith(String)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.chomp(null, *)         \u003d null\n     * StringUtils.chomp(\"\", *)           \u003d \"\"\n     * StringUtils.chomp(\"foobar\", \"bar\") \u003d \"foo\"\n     * StringUtils.chomp(\"foobar\", \"baz\") \u003d \"foobar\"\n     * StringUtils.chomp(\"foo\", \"foo\")    \u003d \"\"\n     * StringUtils.chomp(\"foo \", \"foo\")   \u003d \"foo \"\n     * StringUtils.chomp(\" foo\", \"foo\")   \u003d \" \"\n     * StringUtils.chomp(\"foo\", \"foooo\")  \u003d \"foo\"\n     * StringUtils.chomp(\"foo\", \"\")       \u003d \"foo\"\n     * StringUtils.chomp(\"foo\", null)     \u003d \"foo\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to chomp from, may be null\n     * @param separator  separator String, may be null\n     * @return String without trailing separator, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 3970,col 9)-(line 3972,col 9)",
        "(line 3973,col 9)-(line 3975,col 9)",
        "(line 3976,col 9)-(line 3976,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.chop(java.lang.String)",
      "begin_line": 4004,
      "end_line": 4021,
      "comment": "\n     * \u003cp\u003eRemove the last character from a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the String ends in \u003ccode\u003e\\r\\n\u003c/code\u003e, then remove both\n     * of them.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.chop(null)          \u003d null\n     * StringUtils.chop(\"\")            \u003d \"\"\n     * StringUtils.chop(\"abc \\r\")      \u003d \"abc \"\n     * StringUtils.chop(\"abc\\n\")       \u003d \"abc\"\n     * StringUtils.chop(\"abc\\r\\n\")     \u003d \"abc\"\n     * StringUtils.chop(\"abc\")         \u003d \"ab\"\n     * StringUtils.chop(\"abc\\nabc\")    \u003d \"abc\\nab\"\n     * StringUtils.chop(\"a\")           \u003d \"\"\n     * StringUtils.chop(\"\\r\")          \u003d \"\"\n     * StringUtils.chop(\"\\n\")          \u003d \"\"\n     * StringUtils.chop(\"\\r\\n\")        \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to chop last character from, may be null\n     * @return String without last character, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4005,col 9)-(line 4007,col 9)",
        "(line 4008,col 9)-(line 4008,col 34)",
        "(line 4009,col 9)-(line 4011,col 9)",
        "(line 4012,col 9)-(line 4012,col 33)",
        "(line 4013,col 9)-(line 4013,col 47)",
        "(line 4014,col 9)-(line 4014,col 40)",
        "(line 4015,col 9)-(line 4019,col 9)",
        "(line 4020,col 9)-(line 4020,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.repeat(java.lang.String, int)",
      "begin_line": 4046,
      "end_line": 4088,
      "comment": "\n     * \u003cp\u003eRepeat a String \u003ccode\u003erepeat\u003c/code\u003e times to form a\n     * new String.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.repeat(null, 2) \u003d null\n     * StringUtils.repeat(\"\", 0)   \u003d \"\"\n     * StringUtils.repeat(\"\", 2)   \u003d \"\"\n     * StringUtils.repeat(\"a\", 3)  \u003d \"aaa\"\n     * StringUtils.repeat(\"ab\", 2) \u003d \"abab\"\n     * StringUtils.repeat(\"a\", -2) \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to repeat, may be null\n     * @param repeat  number of times to repeat str, negative treated as zero\n     * @return a new String consisting of the original String repeated,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4049,col 9)-(line 4051,col 9)",
        "(line 4052,col 9)-(line 4054,col 9)",
        "(line 4055,col 9)-(line 4055,col 39)",
        "(line 4056,col 9)-(line 4058,col 9)",
        "(line 4059,col 9)-(line 4061,col 9)",
        "(line 4063,col 9)-(line 4063,col 48)",
        "(line 4064,col 9)-(line 4087,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.repeat(java.lang.String, java.lang.String, int)",
      "begin_line": 4109,
      "end_line": 4117,
      "comment": "\n     * \u003cp\u003eRepeat a String \u003ccode\u003erepeat\u003c/code\u003e times to form a\n     * new String, with a String separator injected each time. \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.repeat(null, null, 2) \u003d null\n     * StringUtils.repeat(null, \"x\", 2)  \u003d null\n     * StringUtils.repeat(\"\", null, 0)   \u003d \"\"\n     * StringUtils.repeat(\"\", \"\", 2)     \u003d \"\"\n     * StringUtils.repeat(\"\", \"x\", 3)    \u003d \"xxx\"\n     * StringUtils.repeat(\"?\", \", \", 3)  \u003d \"?, ?, ?\"\n     * \u003c/pre\u003e\n     *\n     * @param str        the String to repeat, may be null\n     * @param separator  the String to inject, may be null\n     * @param repeat     number of times to repeat str, negative treated as zero\n     * @return a new String consisting of the original String repeated,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4110,col 9)-(line 4116,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.padding(int, char)",
      "begin_line": 4142,
      "end_line": 4151,
      "comment": "\n     * \u003cp\u003eReturns padding using the specified delimiter repeated\n     * to a given length.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.padding(0, \u0027e\u0027)  \u003d \"\"\n     * StringUtils.padding(3, \u0027e\u0027)  \u003d \"eee\"\n     * StringUtils.padding(-2, \u0027e\u0027) \u003d IndexOutOfBoundsException\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eNote: this method doesn\u0027t not support padding with\n     * \u003ca href\u003d\"http://www.unicode.org/glossary/#supplementary_character\"\u003eUnicode Supplementary Characters\u003c/a\u003e\n     * as they require a pair of \u003ccode\u003echar\u003c/code\u003es to be represented.\n     * If you are needing to support full I18N of your applications\n     * consider using {@link #repeat(String, int)} instead. \n     * \u003c/p\u003e\n     *\n     * @param repeat  number of times to repeat delim\n     * @param padChar  character to repeat\n     * @return String with repeated character\n     * @throws IndexOutOfBoundsException if \u003ccode\u003erepeat \u0026lt; 0\u003c/code\u003e\n     * @see #repeat(String, int)\n     ",
      "child_ranges": [
        "(line 4143,col 9)-(line 4145,col 9)",
        "(line 4146,col 9)-(line 4146,col 44)",
        "(line 4147,col 9)-(line 4149,col 9)",
        "(line 4150,col 9)-(line 4150,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.rightPad(java.lang.String, int)",
      "begin_line": 4172,
      "end_line": 4174,
      "comment": "\n     * \u003cp\u003eRight pad a String with spaces (\u0027 \u0027).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is padded to the size of \u003ccode\u003esize\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.rightPad(null, *)   \u003d null\n     * StringUtils.rightPad(\"\", 3)     \u003d \"   \"\n     * StringUtils.rightPad(\"bat\", 3)  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", 5)  \u003d \"bat  \"\n     * StringUtils.rightPad(\"bat\", 1)  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", -1) \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @return right padded String or original String if no padding is necessary,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4173,col 9)-(line 4173,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.rightPad(java.lang.String, int, char)",
      "begin_line": 4197,
      "end_line": 4209,
      "comment": "\n     * \u003cp\u003eRight pad a String with a specified character.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is padded to the size of \u003ccode\u003esize\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.rightPad(null, *, *)     \u003d null\n     * StringUtils.rightPad(\"\", 3, \u0027z\u0027)     \u003d \"zzz\"\n     * StringUtils.rightPad(\"bat\", 3, \u0027z\u0027)  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", 5, \u0027z\u0027)  \u003d \"batzz\"\n     * StringUtils.rightPad(\"bat\", 1, \u0027z\u0027)  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", -1, \u0027z\u0027) \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @param padChar  the character to pad with\n     * @return right padded String or original String if no padding is necessary,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4198,col 9)-(line 4200,col 9)",
        "(line 4201,col 9)-(line 4201,col 39)",
        "(line 4202,col 9)-(line 4204,col 9)",
        "(line 4205,col 9)-(line 4207,col 9)",
        "(line 4208,col 9)-(line 4208,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.rightPad(java.lang.String, int, java.lang.String)",
      "begin_line": 4234,
      "end_line": 4263,
      "comment": "\n     * \u003cp\u003eRight pad a String with a specified String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is padded to the size of \u003ccode\u003esize\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.rightPad(null, *, *)      \u003d null\n     * StringUtils.rightPad(\"\", 3, \"z\")      \u003d \"zzz\"\n     * StringUtils.rightPad(\"bat\", 3, \"yz\")  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", 5, \"yz\")  \u003d \"batyz\"\n     * StringUtils.rightPad(\"bat\", 8, \"yz\")  \u003d \"batyzyzy\"\n     * StringUtils.rightPad(\"bat\", 1, \"yz\")  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", -1, \"yz\") \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", 5, null)  \u003d \"bat  \"\n     * StringUtils.rightPad(\"bat\", 5, \"\")    \u003d \"bat  \"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @param padStr  the String to pad with, null or empty treated as single space\n     * @return right padded String or original String if no padding is necessary,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4235,col 9)-(line 4237,col 9)",
        "(line 4238,col 9)-(line 4240,col 9)",
        "(line 4241,col 9)-(line 4241,col 37)",
        "(line 4242,col 9)-(line 4242,col 34)",
        "(line 4243,col 9)-(line 4243,col 33)",
        "(line 4244,col 9)-(line 4246,col 9)",
        "(line 4247,col 9)-(line 4249,col 9)",
        "(line 4251,col 9)-(line 4262,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.leftPad(java.lang.String, int)",
      "begin_line": 4284,
      "end_line": 4286,
      "comment": "\n     * \u003cp\u003eLeft pad a String with spaces (\u0027 \u0027).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is padded to the size of \u003ccode\u003esize\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.leftPad(null, *)   \u003d null\n     * StringUtils.leftPad(\"\", 3)     \u003d \"   \"\n     * StringUtils.leftPad(\"bat\", 3)  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", 5)  \u003d \"  bat\"\n     * StringUtils.leftPad(\"bat\", 1)  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", -1) \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @return left padded String or original String if no padding is necessary,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4285,col 9)-(line 4285,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.leftPad(java.lang.String, int, char)",
      "begin_line": 4309,
      "end_line": 4321,
      "comment": "\n     * \u003cp\u003eLeft pad a String with a specified character.\u003c/p\u003e\n     *\n     * \u003cp\u003ePad to a size of \u003ccode\u003esize\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.leftPad(null, *, *)     \u003d null\n     * StringUtils.leftPad(\"\", 3, \u0027z\u0027)     \u003d \"zzz\"\n     * StringUtils.leftPad(\"bat\", 3, \u0027z\u0027)  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", 5, \u0027z\u0027)  \u003d \"zzbat\"\n     * StringUtils.leftPad(\"bat\", 1, \u0027z\u0027)  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", -1, \u0027z\u0027) \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @param padChar  the character to pad with\n     * @return left padded String or original String if no padding is necessary,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4310,col 9)-(line 4312,col 9)",
        "(line 4313,col 9)-(line 4313,col 39)",
        "(line 4314,col 9)-(line 4316,col 9)",
        "(line 4317,col 9)-(line 4319,col 9)",
        "(line 4320,col 9)-(line 4320,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.leftPad(java.lang.String, int, java.lang.String)",
      "begin_line": 4346,
      "end_line": 4375,
      "comment": "\n     * \u003cp\u003eLeft pad a String with a specified String.\u003c/p\u003e\n     *\n     * \u003cp\u003ePad to a size of \u003ccode\u003esize\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.leftPad(null, *, *)      \u003d null\n     * StringUtils.leftPad(\"\", 3, \"z\")      \u003d \"zzz\"\n     * StringUtils.leftPad(\"bat\", 3, \"yz\")  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", 5, \"yz\")  \u003d \"yzbat\"\n     * StringUtils.leftPad(\"bat\", 8, \"yz\")  \u003d \"yzyzybat\"\n     * StringUtils.leftPad(\"bat\", 1, \"yz\")  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", -1, \"yz\") \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", 5, null)  \u003d \"  bat\"\n     * StringUtils.leftPad(\"bat\", 5, \"\")    \u003d \"  bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @param padStr  the String to pad with, null or empty treated as single space\n     * @return left padded String or original String if no padding is necessary,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4347,col 9)-(line 4349,col 9)",
        "(line 4350,col 9)-(line 4352,col 9)",
        "(line 4353,col 9)-(line 4353,col 37)",
        "(line 4354,col 9)-(line 4354,col 34)",
        "(line 4355,col 9)-(line 4355,col 33)",
        "(line 4356,col 9)-(line 4358,col 9)",
        "(line 4359,col 9)-(line 4361,col 9)",
        "(line 4363,col 9)-(line 4374,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.length(java.lang.String)",
      "begin_line": 4385,
      "end_line": 4387,
      "comment": "\n     * Gets a String\u0027s length or \u003ccode\u003e0\u003c/code\u003e if the String is \u003ccode\u003enull\u003c/code\u003e.\n     * \n     * @param str\n     *            a String or \u003ccode\u003enull\u003c/code\u003e\n     * @return String length or \u003ccode\u003e0\u003c/code\u003e if the String is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 4386,col 9)-(line 4386,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.center(java.lang.String, int)",
      "begin_line": 4414,
      "end_line": 4416,
      "comment": "\n     * \u003cp\u003eCenters a String in a larger String of size \u003ccode\u003esize\u003c/code\u003e\n     * using the space character (\u0027 \u0027).\u003cp\u003e\n     *\n     * \u003cp\u003eIf the size is less than the String length, the String is returned.\n     * A \u003ccode\u003enull\u003c/code\u003e String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A negative size is treated as zero.\u003c/p\u003e\n     *\n     * \u003cp\u003eEquivalent to \u003ccode\u003ecenter(str, size, \" \")\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.center(null, *)   \u003d null\n     * StringUtils.center(\"\", 4)     \u003d \"    \"\n     * StringUtils.center(\"ab\", -1)  \u003d \"ab\"\n     * StringUtils.center(\"ab\", 4)   \u003d \" ab \"\n     * StringUtils.center(\"abcd\", 2) \u003d \"abcd\"\n     * StringUtils.center(\"a\", 4)    \u003d \" a  \"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to center, may be null\n     * @param size  the int size of new String, negative treated as zero\n     * @return centered String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4415,col 9)-(line 4415,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.center(java.lang.String, int, char)",
      "begin_line": 4442,
      "end_line": 4454,
      "comment": "\n     * \u003cp\u003eCenters a String in a larger String of size \u003ccode\u003esize\u003c/code\u003e.\n     * Uses a supplied character as the value to pad the String with.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the size is less than the String length, the String is returned.\n     * A \u003ccode\u003enull\u003c/code\u003e String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A negative size is treated as zero.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.center(null, *, *)     \u003d null\n     * StringUtils.center(\"\", 4, \u0027 \u0027)     \u003d \"    \"\n     * StringUtils.center(\"ab\", -1, \u0027 \u0027)  \u003d \"ab\"\n     * StringUtils.center(\"ab\", 4, \u0027 \u0027)   \u003d \" ab\"\n     * StringUtils.center(\"abcd\", 2, \u0027 \u0027) \u003d \"abcd\"\n     * StringUtils.center(\"a\", 4, \u0027 \u0027)    \u003d \" a  \"\n     * StringUtils.center(\"a\", 4, \u0027y\u0027)    \u003d \"yayy\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to center, may be null\n     * @param size  the int size of new String, negative treated as zero\n     * @param padChar  the character to pad the new String with\n     * @return centered String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4443,col 9)-(line 4445,col 9)",
        "(line 4446,col 9)-(line 4446,col 34)",
        "(line 4447,col 9)-(line 4447,col 33)",
        "(line 4448,col 9)-(line 4450,col 9)",
        "(line 4451,col 9)-(line 4451,col 55)",
        "(line 4452,col 9)-(line 4452,col 43)",
        "(line 4453,col 9)-(line 4453,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.center(java.lang.String, int, java.lang.String)",
      "begin_line": 4482,
      "end_line": 4497,
      "comment": "\n     * \u003cp\u003eCenters a String in a larger String of size \u003ccode\u003esize\u003c/code\u003e.\n     * Uses a supplied String as the value to pad the String with.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the size is less than the String length, the String is returned.\n     * A \u003ccode\u003enull\u003c/code\u003e String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A negative size is treated as zero.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.center(null, *, *)     \u003d null\n     * StringUtils.center(\"\", 4, \" \")     \u003d \"    \"\n     * StringUtils.center(\"ab\", -1, \" \")  \u003d \"ab\"\n     * StringUtils.center(\"ab\", 4, \" \")   \u003d \" ab\"\n     * StringUtils.center(\"abcd\", 2, \" \") \u003d \"abcd\"\n     * StringUtils.center(\"a\", 4, \" \")    \u003d \" a  \"\n     * StringUtils.center(\"a\", 4, \"yz\")   \u003d \"yayz\"\n     * StringUtils.center(\"abc\", 7, null) \u003d \"  abc  \"\n     * StringUtils.center(\"abc\", 7, \"\")   \u003d \"  abc  \"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to center, may be null\n     * @param size  the int size of new String, negative treated as zero\n     * @param padStr  the String to pad the new String with, must not be null or empty\n     * @return centered String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @throws IllegalArgumentException if padStr is \u003ccode\u003enull\u003c/code\u003e or empty\n     ",
      "child_ranges": [
        "(line 4483,col 9)-(line 4485,col 9)",
        "(line 4486,col 9)-(line 4488,col 9)",
        "(line 4489,col 9)-(line 4489,col 34)",
        "(line 4490,col 9)-(line 4490,col 33)",
        "(line 4491,col 9)-(line 4493,col 9)",
        "(line 4494,col 9)-(line 4494,col 54)",
        "(line 4495,col 9)-(line 4495,col 42)",
        "(line 4496,col 9)-(line 4496,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.upperCase(java.lang.String)",
      "begin_line": 4520,
      "end_line": 4525,
      "comment": "\n     * \u003cp\u003eConverts a String to upper case as per {@link String#toUpperCase()}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.upperCase(null)  \u003d null\n     * StringUtils.upperCase(\"\")    \u003d \"\"\n     * StringUtils.upperCase(\"aBc\") \u003d \"ABC\"\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003e\u003cstrong\u003eNote:\u003c/strong\u003e As described in the documentation for {@link String#toUpperCase()},\n     * the result of this method is affected by the current locale.\n     * For platform-independent case transformations, the method {@link #lowerCase(String, Locale)}\n     * should be used with a specific locale (e.g. {@link Locale#ENGLISH}).\u003c/p\u003e\n     *\n     * @param str  the String to upper case, may be null\n     * @return the upper cased String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4521,col 9)-(line 4523,col 9)",
        "(line 4524,col 9)-(line 4524,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.upperCase(java.lang.String, java.util.Locale)",
      "begin_line": 4543,
      "end_line": 4548,
      "comment": "\n     * \u003cp\u003eConverts a String to upper case as per {@link String#toUpperCase(Locale)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.upperCase(null, Locale.ENGLISH)  \u003d null\n     * StringUtils.upperCase(\"\", Locale.ENGLISH)    \u003d \"\"\n     * StringUtils.upperCase(\"aBc\", Locale.ENGLISH) \u003d \"ABC\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to upper case, may be null\n     * @param locale  the locale that defines the case transformation rules, must not be null\n     * @return the upper cased String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 4544,col 9)-(line 4546,col 9)",
        "(line 4547,col 9)-(line 4547,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lowerCase(java.lang.String)",
      "begin_line": 4569,
      "end_line": 4574,
      "comment": "\n     * \u003cp\u003eConverts a String to lower case as per {@link String#toLowerCase()}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lowerCase(null)  \u003d null\n     * StringUtils.lowerCase(\"\")    \u003d \"\"\n     * StringUtils.lowerCase(\"aBc\") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003e\u003cstrong\u003eNote:\u003c/strong\u003e As described in the documentation for {@link String#toLowerCase()},\n     * the result of this method is affected by the current locale.\n     * For platform-independent case transformations, the method {@link #lowerCase(String, Locale)}\n     * should be used with a specific locale (e.g. {@link Locale#ENGLISH}).\u003c/p\u003e\n     *\n     * @param str  the String to lower case, may be null\n     * @return the lower cased String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4570,col 9)-(line 4572,col 9)",
        "(line 4573,col 9)-(line 4573,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lowerCase(java.lang.String, java.util.Locale)",
      "begin_line": 4592,
      "end_line": 4597,
      "comment": "\n     * \u003cp\u003eConverts a String to lower case as per {@link String#toLowerCase(Locale)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lowerCase(null, Locale.ENGLISH)  \u003d null\n     * StringUtils.lowerCase(\"\", Locale.ENGLISH)    \u003d \"\"\n     * StringUtils.lowerCase(\"aBc\", Locale.ENGLISH) \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to lower case, may be null\n     * @param locale  the locale that defines the case transformation rules, must not be null\n     * @return the lower cased String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 4593,col 9)-(line 4595,col 9)",
        "(line 4596,col 9)-(line 4596,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.capitalize(java.lang.String)",
      "begin_line": 4619,
      "end_line": 4628,
      "comment": "\n     * \u003cp\u003eCapitalizes a String changing the first letter to title case as\n     * per {@link Character#toTitleCase(char)}. No other letters are changed.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor a word based algorithm, see {@link WordUtils#capitalize(String)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.capitalize(null)  \u003d null\n     * StringUtils.capitalize(\"\")    \u003d \"\"\n     * StringUtils.capitalize(\"cat\") \u003d \"Cat\"\n     * StringUtils.capitalize(\"cAt\") \u003d \"CAt\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to capitalize, may be null\n     * @return the capitalized String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @see WordUtils#capitalize(String)\n     * @see #uncapitalize(String)\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4620,col 9)-(line 4620,col 19)",
        "(line 4621,col 9)-(line 4623,col 9)",
        "(line 4624,col 9)-(line 4627,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.uncapitalize(java.lang.String)",
      "begin_line": 4650,
      "end_line": 4659,
      "comment": "\n     * \u003cp\u003eUncapitalizes a String changing the first letter to title case as\n     * per {@link Character#toLowerCase(char)}. No other letters are changed.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor a word based algorithm, see {@link WordUtils#uncapitalize(String)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.uncapitalize(null)  \u003d null\n     * StringUtils.uncapitalize(\"\")    \u003d \"\"\n     * StringUtils.uncapitalize(\"Cat\") \u003d \"cat\"\n     * StringUtils.uncapitalize(\"CAT\") \u003d \"cAT\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to uncapitalize, may be null\n     * @return the uncapitalized String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @see WordUtils#uncapitalize(String)\n     * @see #capitalize(String)\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4651,col 9)-(line 4651,col 19)",
        "(line 4652,col 9)-(line 4654,col 9)",
        "(line 4655,col 9)-(line 4658,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.swapCase(java.lang.String)",
      "begin_line": 4688,
      "end_line": 4708,
      "comment": "\n     * \u003cp\u003eSwaps the case of a String changing upper and title case to\n     * lower case, and lower case to upper case.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     *  \u003cli\u003eUpper case character converts to Lower case\u003c/li\u003e\n     *  \u003cli\u003eTitle case character converts to Lower case\u003c/li\u003e\n     *  \u003cli\u003eLower case character converts to Upper case\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eFor a word based algorithm, see {@link WordUtils#swapCase(String)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.swapCase(null)                 \u003d null\n     * StringUtils.swapCase(\"\")                   \u003d \"\"\n     * StringUtils.swapCase(\"The dog has a BONE\") \u003d \"tHE DOG HAS A bone\"\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eNOTE: This method changed in Lang version 2.0.\n     * It no longer performs a word based algorithm.\n     * If you only use ASCII, you will notice no change.\n     * That functionality is available in WordUtils.\u003c/p\u003e\n     *\n     * @param str  the String to swap case, may be null\n     * @return the changed String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4689,col 9)-(line 4689,col 19)",
        "(line 4690,col 9)-(line 4692,col 9)",
        "(line 4693,col 9)-(line 4693,col 57)",
        "(line 4695,col 9)-(line 4695,col 20)",
        "(line 4696,col 9)-(line 4706,col 9)",
        "(line 4707,col 9)-(line 4707,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.countMatches(java.lang.String, java.lang.String)",
      "begin_line": 4731,
      "end_line": 4742,
      "comment": "\n     * \u003cp\u003eCounts how many times the substring appears in the larger String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e or empty (\"\") String input returns \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.countMatches(null, *)       \u003d 0\n     * StringUtils.countMatches(\"\", *)         \u003d 0\n     * StringUtils.countMatches(\"abba\", null)  \u003d 0\n     * StringUtils.countMatches(\"abba\", \"\")    \u003d 0\n     * StringUtils.countMatches(\"abba\", \"a\")   \u003d 2\n     * StringUtils.countMatches(\"abba\", \"ab\")  \u003d 1\n     * StringUtils.countMatches(\"abba\", \"xxx\") \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param sub  the substring to count, may be null\n     * @return the number of occurrences, 0 if either String is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 4732,col 9)-(line 4734,col 9)",
        "(line 4735,col 9)-(line 4735,col 22)",
        "(line 4736,col 9)-(line 4736,col 20)",
        "(line 4737,col 9)-(line 4740,col 9)",
        "(line 4741,col 9)-(line 4741,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAlpha(java.lang.String)",
      "begin_line": 4764,
      "end_line": 4775,
      "comment": "\n     * \u003cp\u003eChecks if the String contains only unicode letters.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty String (\"\") will return \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAlpha(null)   \u003d false\n     * StringUtils.isAlpha(\"\")     \u003d true\n     * StringUtils.isAlpha(\"  \")   \u003d false\n     * StringUtils.isAlpha(\"abc\")  \u003d true\n     * StringUtils.isAlpha(\"ab2c\") \u003d false\n     * StringUtils.isAlpha(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if only contains letters, and is non-null\n     ",
      "child_ranges": [
        "(line 4765,col 9)-(line 4767,col 9)",
        "(line 4768,col 9)-(line 4768,col 30)",
        "(line 4769,col 9)-(line 4773,col 9)",
        "(line 4774,col 9)-(line 4774,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAlphaSpace(java.lang.String)",
      "begin_line": 4798,
      "end_line": 4809,
      "comment": "\n     * \u003cp\u003eChecks if the String contains only unicode letters and\n     * space (\u0027 \u0027).\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e\n     * An empty String (\"\") will return \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAlphaSpace(null)   \u003d false\n     * StringUtils.isAlphaSpace(\"\")     \u003d true\n     * StringUtils.isAlphaSpace(\"  \")   \u003d true\n     * StringUtils.isAlphaSpace(\"abc\")  \u003d true\n     * StringUtils.isAlphaSpace(\"ab c\") \u003d true\n     * StringUtils.isAlphaSpace(\"ab2c\") \u003d false\n     * StringUtils.isAlphaSpace(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if only contains letters and space,\n     *  and is non-null\n     ",
      "child_ranges": [
        "(line 4799,col 9)-(line 4801,col 9)",
        "(line 4802,col 9)-(line 4802,col 30)",
        "(line 4803,col 9)-(line 4807,col 9)",
        "(line 4808,col 9)-(line 4808,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAlphanumeric(java.lang.String)",
      "begin_line": 4831,
      "end_line": 4842,
      "comment": "\n     * \u003cp\u003eChecks if the String contains only unicode letters or digits.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty String (\"\") will return \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAlphanumeric(null)   \u003d false\n     * StringUtils.isAlphanumeric(\"\")     \u003d true\n     * StringUtils.isAlphanumeric(\"  \")   \u003d false\n     * StringUtils.isAlphanumeric(\"abc\")  \u003d true\n     * StringUtils.isAlphanumeric(\"ab c\") \u003d false\n     * StringUtils.isAlphanumeric(\"ab2c\") \u003d true\n     * StringUtils.isAlphanumeric(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if only contains letters or digits,\n     *  and is non-null\n     ",
      "child_ranges": [
        "(line 4832,col 9)-(line 4834,col 9)",
        "(line 4835,col 9)-(line 4835,col 30)",
        "(line 4836,col 9)-(line 4840,col 9)",
        "(line 4841,col 9)-(line 4841,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAlphanumericSpace(java.lang.String)",
      "begin_line": 4865,
      "end_line": 4876,
      "comment": "\n     * \u003cp\u003eChecks if the String contains only unicode letters, digits\n     * or space (\u003ccode\u003e\u0027 \u0027\u003c/code\u003e).\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty String (\"\") will return \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAlphanumeric(null)   \u003d false\n     * StringUtils.isAlphanumeric(\"\")     \u003d true\n     * StringUtils.isAlphanumeric(\"  \")   \u003d true\n     * StringUtils.isAlphanumeric(\"abc\")  \u003d true\n     * StringUtils.isAlphanumeric(\"ab c\") \u003d true\n     * StringUtils.isAlphanumeric(\"ab2c\") \u003d true\n     * StringUtils.isAlphanumeric(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if only contains letters, digits or space,\n     *  and is non-null\n     ",
      "child_ranges": [
        "(line 4866,col 9)-(line 4868,col 9)",
        "(line 4869,col 9)-(line 4869,col 30)",
        "(line 4870,col 9)-(line 4874,col 9)",
        "(line 4875,col 9)-(line 4875,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAsciiPrintable(java.lang.String)",
      "begin_line": 4903,
      "end_line": 4914,
      "comment": "\n     * \u003cp\u003eChecks if the string contains only ASCII printable characters.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty String (\"\") will return \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * StringUtils.isAsciiPrintable(null)     \u003d false\n     * StringUtils.isAsciiPrintable(\"\")       \u003d true\n     * StringUtils.isAsciiPrintable(\" \")      \u003d true\n     * StringUtils.isAsciiPrintable(\"Ceki\")   \u003d true\n     * StringUtils.isAsciiPrintable(\"ab2c\")   \u003d true\n     * StringUtils.isAsciiPrintable(\"!ab-c~\") \u003d true\n     * StringUtils.isAsciiPrintable(\"\\u0020\") \u003d true\n     * StringUtils.isAsciiPrintable(\"\\u0021\") \u003d true\n     * StringUtils.isAsciiPrintable(\"\\u007e\") \u003d true\n     * StringUtils.isAsciiPrintable(\"\\u007f\") \u003d false\n     * StringUtils.isAsciiPrintable(\"Ceki G\\u00fclc\\u00fc\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str the string to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if every character is in the range\n     *  32 thru 126\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4904,col 9)-(line 4906,col 9)",
        "(line 4907,col 9)-(line 4907,col 30)",
        "(line 4908,col 9)-(line 4912,col 9)",
        "(line 4913,col 9)-(line 4913,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isNumeric(java.lang.String)",
      "begin_line": 4937,
      "end_line": 4948,
      "comment": "\n     * \u003cp\u003eChecks if the String contains only unicode digits.\n     * A decimal point is not a unicode digit and returns false.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty String (\"\") will return \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isNumeric(null)   \u003d false\n     * StringUtils.isNumeric(\"\")     \u003d true\n     * StringUtils.isNumeric(\"  \")   \u003d false\n     * StringUtils.isNumeric(\"123\")  \u003d true\n     * StringUtils.isNumeric(\"12 3\") \u003d false\n     * StringUtils.isNumeric(\"ab2c\") \u003d false\n     * StringUtils.isNumeric(\"12-3\") \u003d false\n     * StringUtils.isNumeric(\"12.3\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if only contains digits, and is non-null\n     ",
      "child_ranges": [
        "(line 4938,col 9)-(line 4940,col 9)",
        "(line 4941,col 9)-(line 4941,col 30)",
        "(line 4942,col 9)-(line 4946,col 9)",
        "(line 4947,col 9)-(line 4947,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isNumericSpace(java.lang.String)",
      "begin_line": 4973,
      "end_line": 4984,
      "comment": "\n     * \u003cp\u003eChecks if the String contains only unicode digits or space\n     * (\u003ccode\u003e\u0027 \u0027\u003c/code\u003e).\n     * A decimal point is not a unicode digit and returns false.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty String (\"\") will return \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isNumeric(null)   \u003d false\n     * StringUtils.isNumeric(\"\")     \u003d true\n     * StringUtils.isNumeric(\"  \")   \u003d true\n     * StringUtils.isNumeric(\"123\")  \u003d true\n     * StringUtils.isNumeric(\"12 3\") \u003d true\n     * StringUtils.isNumeric(\"ab2c\") \u003d false\n     * StringUtils.isNumeric(\"12-3\") \u003d false\n     * StringUtils.isNumeric(\"12.3\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if only contains digits or space,\n     *  and is non-null\n     ",
      "child_ranges": [
        "(line 4974,col 9)-(line 4976,col 9)",
        "(line 4977,col 9)-(line 4977,col 30)",
        "(line 4978,col 9)-(line 4982,col 9)",
        "(line 4983,col 9)-(line 4983,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isWhitespace(java.lang.String)",
      "begin_line": 5005,
      "end_line": 5016,
      "comment": "\n     * \u003cp\u003eChecks if the String contains only whitespace.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty String (\"\") will return \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isWhitespace(null)   \u003d false\n     * StringUtils.isWhitespace(\"\")     \u003d true\n     * StringUtils.isWhitespace(\"  \")   \u003d true\n     * StringUtils.isWhitespace(\"abc\")  \u003d false\n     * StringUtils.isWhitespace(\"ab2c\") \u003d false\n     * StringUtils.isWhitespace(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if only contains whitespace, and is non-null\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 5006,col 9)-(line 5008,col 9)",
        "(line 5009,col 9)-(line 5009,col 30)",
        "(line 5010,col 9)-(line 5014,col 9)",
        "(line 5015,col 9)-(line 5015,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAllLowerCase(java.lang.String)",
      "begin_line": 5035,
      "end_line": 5046,
      "comment": "\n     * \u003cp\u003eChecks if the String contains only lowercase characters.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty String (\"\") will return \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAllLowerCase(null)   \u003d false\n     * StringUtils.isAllLowerCase(\"\")     \u003d false\n     * StringUtils.isAllLowerCase(\"  \")   \u003d false\n     * StringUtils.isAllLowerCase(\"abc\")  \u003d true\n     * StringUtils.isAllLowerCase(\"abC\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if only contains lowercase characters, and is non-null\n     ",
      "child_ranges": [
        "(line 5036,col 9)-(line 5038,col 9)",
        "(line 5039,col 9)-(line 5039,col 30)",
        "(line 5040,col 9)-(line 5044,col 9)",
        "(line 5045,col 9)-(line 5045,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAllUpperCase(java.lang.String)",
      "begin_line": 5065,
      "end_line": 5076,
      "comment": "\n     * \u003cp\u003eChecks if the String contains only uppercase characters.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty String (\"\") will return \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAllUpperCase(null)   \u003d false\n     * StringUtils.isAllUpperCase(\"\")     \u003d false\n     * StringUtils.isAllUpperCase(\"  \")   \u003d false\n     * StringUtils.isAllUpperCase(\"ABC\")  \u003d true\n     * StringUtils.isAllUpperCase(\"aBC\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if only contains uppercase characters, and is non-null\n     ",
      "child_ranges": [
        "(line 5066,col 9)-(line 5068,col 9)",
        "(line 5069,col 9)-(line 5069,col 30)",
        "(line 5070,col 9)-(line 5074,col 9)",
        "(line 5075,col 9)-(line 5075,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.defaultString(java.lang.String)",
      "begin_line": 5096,
      "end_line": 5098,
      "comment": "\n     * \u003cp\u003eReturns either the passed in String,\n     * or if the String is \u003ccode\u003enull\u003c/code\u003e, an empty String (\"\").\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.defaultString(null)  \u003d \"\"\n     * StringUtils.defaultString(\"\")    \u003d \"\"\n     * StringUtils.defaultString(\"bat\") \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @see ObjectUtils#toString(Object)\n     * @see String#valueOf(Object)\n     * @param str  the String to check, may be null\n     * @return the passed in String, or the empty String if it\n     *  was \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 5097,col 9)-(line 5097,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.defaultString(java.lang.String, java.lang.String)",
      "begin_line": 5117,
      "end_line": 5119,
      "comment": "\n     * \u003cp\u003eReturns either the passed in String, or if the String is\n     * \u003ccode\u003enull\u003c/code\u003e, the value of \u003ccode\u003edefaultStr\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.defaultString(null, \"NULL\")  \u003d \"NULL\"\n     * StringUtils.defaultString(\"\", \"NULL\")    \u003d \"\"\n     * StringUtils.defaultString(\"bat\", \"NULL\") \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @see ObjectUtils#toString(Object,String)\n     * @see String#valueOf(Object)\n     * @param str  the String to check, may be null\n     * @param defaultStr  the default String to return\n     *  if the input is \u003ccode\u003enull\u003c/code\u003e, may be null\n     * @return the passed in String, or the default if it was \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 5118,col 9)-(line 5118,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.defaultIfEmpty(java.lang.String, java.lang.String)",
      "begin_line": 5138,
      "end_line": 5140,
      "comment": "\n     * \u003cp\u003eReturns either the passed in String, or if the String is\n     * empty or \u003ccode\u003enull\u003c/code\u003e, the value of \u003ccode\u003edefaultStr\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.defaultIfEmpty(null, \"NULL\")  \u003d \"NULL\"\n     * StringUtils.defaultIfEmpty(\"\", \"NULL\")    \u003d \"NULL\"\n     * StringUtils.defaultIfEmpty(\"bat\", \"NULL\") \u003d \"bat\"\n     * StringUtils.defaultIfEmpty(\"\", null)      \u003d null\n     * \u003c/pre\u003e\n     *\n     * @see StringUtils#defaultString(String, String)\n     * @param str  the String to check, may be null\n     * @param defaultStr  the default String to return\n     *  if the input is empty (\"\") or \u003ccode\u003enull\u003c/code\u003e, may be null\n     * @return the passed in String, or the default\n     ",
      "child_ranges": [
        "(line 5139,col 9)-(line 5139,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.reverse(java.lang.String)",
      "begin_line": 5158,
      "end_line": 5163,
      "comment": "\n     * \u003cp\u003eReverses a String as per {@link StringBuilder#reverse()}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.reverse(null)  \u003d null\n     * StringUtils.reverse(\"\")    \u003d \"\"\n     * StringUtils.reverse(\"bat\") \u003d \"tab\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to reverse, may be null\n     * @return the reversed String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 5159,col 9)-(line 5161,col 9)",
        "(line 5162,col 9)-(line 5162,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.reverseDelimited(java.lang.String, char)",
      "begin_line": 5184,
      "end_line": 5193,
      "comment": "\n     * \u003cp\u003eReverses a String that is delimited by a specific character.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe Strings between the delimiters are not reversed.\n     * Thus java.lang.String becomes String.lang.java (if the delimiter\n     * is \u003ccode\u003e\u0027.\u0027\u003c/code\u003e).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.reverseDelimited(null, *)      \u003d null\n     * StringUtils.reverseDelimited(\"\", *)        \u003d \"\"\n     * StringUtils.reverseDelimited(\"a.b.c\", \u0027x\u0027) \u003d \"a.b.c\"\n     * StringUtils.reverseDelimited(\"a.b.c\", \".\") \u003d \"c.b.a\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to reverse, may be null\n     * @param separatorChar  the separator character to use\n     * @return the reversed String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 5185,col 9)-(line 5187,col 9)",
        "(line 5190,col 9)-(line 5190,col 50)",
        "(line 5191,col 9)-(line 5191,col 33)",
        "(line 5192,col 9)-(line 5192,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.abbreviate(java.lang.String, int)",
      "begin_line": 5229,
      "end_line": 5231,
      "comment": "\n     * \u003cp\u003eAbbreviates a String using ellipses. This will turn\n     * \"Now is the time for all good men\" into \"Now is the time for...\"\u003c/p\u003e\n     *\n     * \u003cp\u003eSpecifically:\n     * \u003cul\u003e\n     *   \u003cli\u003eIf \u003ccode\u003estr\u003c/code\u003e is less than \u003ccode\u003emaxWidth\u003c/code\u003e characters\n     *       long, return it.\u003c/li\u003e\n     *   \u003cli\u003eElse abbreviate it to \u003ccode\u003e(substring(str, 0, max-3) + \"...\")\u003c/code\u003e.\u003c/li\u003e\n     *   \u003cli\u003eIf \u003ccode\u003emaxWidth\u003c/code\u003e is less than \u003ccode\u003e4\u003c/code\u003e, throw an\n     *       \u003ccode\u003eIllegalArgumentException\u003c/code\u003e.\u003c/li\u003e\n     *   \u003cli\u003eIn no case will it return a String of length greater than\n     *       \u003ccode\u003emaxWidth\u003c/code\u003e.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.abbreviate(null, *)      \u003d null\n     * StringUtils.abbreviate(\"\", 4)        \u003d \"\"\n     * StringUtils.abbreviate(\"abcdefg\", 6) \u003d \"abc...\"\n     * StringUtils.abbreviate(\"abcdefg\", 7) \u003d \"abcdefg\"\n     * StringUtils.abbreviate(\"abcdefg\", 8) \u003d \"abcdefg\"\n     * StringUtils.abbreviate(\"abcdefg\", 4) \u003d \"a...\"\n     * StringUtils.abbreviate(\"abcdefg\", 3) \u003d IllegalArgumentException\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param maxWidth  maximum length of result String, must be at least 4\n     * @return abbreviated String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @throws IllegalArgumentException if the width is too small\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 5230,col 9)-(line 5230,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.abbreviate(java.lang.String, int, int)",
      "begin_line": 5268,
      "end_line": 5294,
      "comment": "\n     * \u003cp\u003eAbbreviates a String using ellipses. This will turn\n     * \"Now is the time for all good men\" into \"...is the time for...\"\u003c/p\u003e\n     *\n     * \u003cp\u003eWorks like \u003ccode\u003eabbreviate(String, int)\u003c/code\u003e, but allows you to specify\n     * a \"left edge\" offset.  Note that this left edge is not necessarily going to\n     * be the leftmost character in the result, or the first character following the\n     * ellipses, but it will appear somewhere in the result.\n     *\n     * \u003cp\u003eIn no case will it return a String of length greater than\n     * \u003ccode\u003emaxWidth\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.abbreviate(null, *, *)                \u003d null\n     * StringUtils.abbreviate(\"\", 0, 4)                  \u003d \"\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", -1, 10) \u003d \"abcdefg...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 0, 10)  \u003d \"abcdefg...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 1, 10)  \u003d \"abcdefg...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 4, 10)  \u003d \"abcdefg...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 5, 10)  \u003d \"...fghi...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 6, 10)  \u003d \"...ghij...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 8, 10)  \u003d \"...ijklmno\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 10, 10) \u003d \"...ijklmno\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 12, 10) \u003d \"...ijklmno\"\n     * StringUtils.abbreviate(\"abcdefghij\", 0, 3)        \u003d IllegalArgumentException\n     * StringUtils.abbreviate(\"abcdefghij\", 5, 6)        \u003d IllegalArgumentException\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param offset  left edge of source String\n     * @param maxWidth  maximum length of result String, must be at least 4\n     * @return abbreviated String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @throws IllegalArgumentException if the width is too small\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 5269,col 9)-(line 5271,col 9)",
        "(line 5272,col 9)-(line 5274,col 9)",
        "(line 5275,col 9)-(line 5277,col 9)",
        "(line 5278,col 9)-(line 5280,col 9)",
        "(line 5281,col 9)-(line 5283,col 9)",
        "(line 5284,col 9)-(line 5286,col 9)",
        "(line 5287,col 9)-(line 5289,col 9)",
        "(line 5290,col 9)-(line 5292,col 9)",
        "(line 5293,col 9)-(line 5293,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.difference(java.lang.String, java.lang.String)",
      "begin_line": 5323,
      "end_line": 5335,
      "comment": "\n     * \u003cp\u003eCompares two Strings, and returns the portion where they differ.\n     * (More precisely, return the remainder of the second String,\n     * starting from where it\u0027s different from the first.)\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example,\n     * \u003ccode\u003edifference(\"i am a machine\", \"i am a robot\") -\u003e \"robot\"\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.difference(null, null) \u003d null\n     * StringUtils.difference(\"\", \"\") \u003d \"\"\n     * StringUtils.difference(\"\", \"abc\") \u003d \"abc\"\n     * StringUtils.difference(\"abc\", \"\") \u003d \"\"\n     * StringUtils.difference(\"abc\", \"abc\") \u003d \"\"\n     * StringUtils.difference(\"ab\", \"abxyz\") \u003d \"xyz\"\n     * StringUtils.difference(\"abcde\", \"abxyz\") \u003d \"xyz\"\n     * StringUtils.difference(\"abcde\", \"xyz\") \u003d \"xyz\"\n     * \u003c/pre\u003e\n     *\n     * @param str1  the first String, may be null\n     * @param str2  the second String, may be null\n     * @return the portion of str2 where it differs from str1; returns the\n     * empty String if they are equal\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 5324,col 9)-(line 5326,col 9)",
        "(line 5327,col 9)-(line 5329,col 9)",
        "(line 5330,col 9)-(line 5330,col 47)",
        "(line 5331,col 9)-(line 5333,col 9)",
        "(line 5334,col 9)-(line 5334,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfDifference(java.lang.String, java.lang.String)",
      "begin_line": 5360,
      "end_line": 5377,
      "comment": "\n     * \u003cp\u003eCompares two Strings, and returns the index at which the\n     * Strings begin to differ.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example,\n     * \u003ccode\u003eindexOfDifference(\"i am a machine\", \"i am a robot\") -\u003e 7\u003c/code\u003e\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfDifference(null, null) \u003d -1\n     * StringUtils.indexOfDifference(\"\", \"\") \u003d -1\n     * StringUtils.indexOfDifference(\"\", \"abc\") \u003d 0\n     * StringUtils.indexOfDifference(\"abc\", \"\") \u003d 0\n     * StringUtils.indexOfDifference(\"abc\", \"abc\") \u003d -1\n     * StringUtils.indexOfDifference(\"ab\", \"abxyz\") \u003d 2\n     * StringUtils.indexOfDifference(\"abcde\", \"abxyz\") \u003d 2\n     * StringUtils.indexOfDifference(\"abcde\", \"xyz\") \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param str1  the first String, may be null\n     * @param str2  the second String, may be null\n     * @return the index where str2 and str1 begin to differ; -1 if they are equal\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 5361,col 9)-(line 5363,col 9)",
        "(line 5364,col 9)-(line 5366,col 9)",
        "(line 5367,col 9)-(line 5367,col 14)",
        "(line 5368,col 9)-(line 5372,col 9)",
        "(line 5373,col 9)-(line 5375,col 9)",
        "(line 5376,col 9)-(line 5376,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfDifference(java.lang.String[])",
      "begin_line": 5410,
      "end_line": 5466,
      "comment": "\n     * \u003cp\u003eCompares all Strings in an array and returns the index at which the\n     * Strings begin to differ.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example,\n     * \u003ccode\u003eindexOfDifference(new String[] {\"i am a machine\", \"i am a robot\"}) -\u003e 7\u003c/code\u003e\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfDifference(null) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {}) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {\"abc\"}) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {null, null}) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {\"\", \"\"}) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {\"\", null}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"abc\", null, null}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {null, null, \"abc\"}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"\", \"abc\"}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"abc\", \"\"}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"abc\", \"abc\"}) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {\"abc\", \"a\"}) \u003d 1\n     * StringUtils.indexOfDifference(new String[] {\"ab\", \"abxyz\"}) \u003d 2\n     * StringUtils.indexOfDifference(new String[] {\"abcde\", \"abxyz\"}) \u003d 2\n     * StringUtils.indexOfDifference(new String[] {\"abcde\", \"xyz\"}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"xyz\", \"abcde\"}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"i am a machine\", \"i am a robot\"}) \u003d 7\n     * \u003c/pre\u003e\n     *\n     * @param strs  array of strings, entries may be null\n     * @return the index where the strings begin to differ; -1 if they are all equal\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 5411,col 9)-(line 5413,col 9)",
        "(line 5414,col 9)-(line 5414,col 38)",
        "(line 5415,col 9)-(line 5415,col 38)",
        "(line 5416,col 9)-(line 5416,col 35)",
        "(line 5417,col 9)-(line 5417,col 47)",
        "(line 5418,col 9)-(line 5418,col 30)",
        "(line 5423,col 9)-(line 5432,col 9)",
        "(line 5435,col 9)-(line 5437,col 9)",
        "(line 5440,col 9)-(line 5442,col 9)",
        "(line 5445,col 9)-(line 5445,col 27)",
        "(line 5446,col 9)-(line 5457,col 9)",
        "(line 5459,col 9)-(line 5464,col 9)",
        "(line 5465,col 9)-(line 5465,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.getCommonPrefix(java.lang.String[])",
      "begin_line": 5501,
      "end_line": 5519,
      "comment": "\n     * \u003cp\u003eCompares all Strings in an array and returns the initial sequence of \n     * characters that is common to all of them.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example,\n     * \u003ccode\u003egetCommonPrefix(new String[] {\"i am a machine\", \"i am a robot\"}) -\u003e \"i am a \"\u003c/code\u003e\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.getCommonPrefix(null) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"abc\"}) \u003d \"abc\"\n     * StringUtils.getCommonPrefix(new String[] {null, null}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"\", \"\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"\", null}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"abc\", null, null}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {null, null, \"abc\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"\", \"abc\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"abc\", \"\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"abc\", \"abc\"}) \u003d \"abc\"\n     * StringUtils.getCommonPrefix(new String[] {\"abc\", \"a\"}) \u003d \"a\"\n     * StringUtils.getCommonPrefix(new String[] {\"ab\", \"abxyz\"}) \u003d \"ab\"\n     * StringUtils.getCommonPrefix(new String[] {\"abcde\", \"abxyz\"}) \u003d \"ab\"\n     * StringUtils.getCommonPrefix(new String[] {\"abcde\", \"xyz\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"xyz\", \"abcde\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"i am a machine\", \"i am a robot\"}) \u003d \"i am a \"\n     * \u003c/pre\u003e\n     *\n     * @param strs  array of String objects, entries may be null\n     * @return the initial sequence of characters that are common to all Strings\n     * in the array; empty String if the array is null, the elements are all null \n     * or if there is no common prefix. \n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 5502,col 9)-(line 5504,col 9)",
        "(line 5505,col 9)-(line 5505,col 58)",
        "(line 5506,col 9)-(line 5518,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.getLevenshteinDistance(java.lang.String, java.lang.String)",
      "begin_line": 5557,
      "end_line": 5632,
      "comment": "\n     * \u003cp\u003eFind the Levenshtein distance between two Strings.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is the number of changes needed to change one String into\n     * another, where each change is a single character modification (deletion,\n     * insertion or substitution).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe previous implementation of the Levenshtein distance algorithm\n     * was from \u003ca href\u003d\"http://www.merriampark.com/ld.htm\"\u003ehttp://www.merriampark.com/ld.htm\u003c/a\u003e\u003c/p\u003e\n     *\n     * \u003cp\u003eChas Emerick has written an implementation in Java, which avoids an OutOfMemoryError\n     * which can occur when my Java implementation is used with very large strings.\u003cbr\u003e\n     * This implementation of the Levenshtein distance algorithm\n     * is from \u003ca href\u003d\"http://www.merriampark.com/ldjava.htm\"\u003ehttp://www.merriampark.com/ldjava.htm\u003c/a\u003e\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.getLevenshteinDistance(null, *)             \u003d IllegalArgumentException\n     * StringUtils.getLevenshteinDistance(*, null)             \u003d IllegalArgumentException\n     * StringUtils.getLevenshteinDistance(\"\",\"\")               \u003d 0\n     * StringUtils.getLevenshteinDistance(\"\",\"a\")              \u003d 1\n     * StringUtils.getLevenshteinDistance(\"aaapppp\", \"\")       \u003d 7\n     * StringUtils.getLevenshteinDistance(\"frog\", \"fog\")       \u003d 1\n     * StringUtils.getLevenshteinDistance(\"fly\", \"ant\")        \u003d 3\n     * StringUtils.getLevenshteinDistance(\"elephant\", \"hippo\") \u003d 7\n     * StringUtils.getLevenshteinDistance(\"hippo\", \"elephant\") \u003d 7\n     * StringUtils.getLevenshteinDistance(\"hippo\", \"zzzzzzzz\") \u003d 8\n     * StringUtils.getLevenshteinDistance(\"hello\", \"hallo\")    \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @param s  the first String, must not be null\n     * @param t  the second String, must not be null\n     * @return result distance\n     * @throws IllegalArgumentException if either String input \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 5558,col 9)-(line 5560,col 9)",
        "(line 5579,col 9)-(line 5579,col 27)",
        "(line 5580,col 9)-(line 5580,col 27)",
        "(line 5582,col 9)-(line 5586,col 9)",
        "(line 5588,col 9)-(line 5595,col 9)",
        "(line 5597,col 9)-(line 5597,col 31)",
        "(line 5598,col 9)-(line 5598,col 31)",
        "(line 5599,col 9)-(line 5599,col 17)",
        "(line 5602,col 9)-(line 5602,col 14)",
        "(line 5603,col 9)-(line 5603,col 14)",
        "(line 5605,col 9)-(line 5605,col 17)",
        "(line 5607,col 9)-(line 5607,col 17)",
        "(line 5609,col 9)-(line 5611,col 9)",
        "(line 5613,col 9)-(line 5627,col 9)",
        "(line 5631,col 9)-(line 5631,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.startsWith(java.lang.String, java.lang.String)",
      "begin_line": 5679,
      "end_line": 5681,
      "comment": "\n     * \u003cp\u003eCheck if a String starts with a specified prefix.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003es are handled without exceptions. Two \u003ccode\u003enull\u003c/code\u003e\n     * references are considered to be equal. The comparison is case sensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.startsWith(null, null)      \u003d true\n     * StringUtils.startsWith(null, \"abc\")     \u003d false\n     * StringUtils.startsWith(\"abcdef\", null)  \u003d false\n     * StringUtils.startsWith(\"abcdef\", \"abc\") \u003d true\n     * StringUtils.startsWith(\"ABCDEF\", \"abc\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#startsWith(String)\n     * @param str  the String to check, may be null\n     * @param prefix the prefix to find, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the String starts with the prefix, case sensitive, or\n     *  both \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 5680,col 9)-(line 5680,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 5704,
      "end_line": 5706,
      "comment": "\n     * \u003cp\u003eCase insensitive check if a String starts with a specified prefix.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003es are handled without exceptions. Two \u003ccode\u003enull\u003c/code\u003e\n     * references are considered to be equal. The comparison is case insensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.startsWithIgnoreCase(null, null)      \u003d true\n     * StringUtils.startsWithIgnoreCase(null, \"abc\")     \u003d false\n     * StringUtils.startsWithIgnoreCase(\"abcdef\", null)  \u003d false\n     * StringUtils.startsWithIgnoreCase(\"abcdef\", \"abc\") \u003d true\n     * StringUtils.startsWithIgnoreCase(\"ABCDEF\", \"abc\") \u003d true\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#startsWith(String)\n     * @param str  the String to check, may be null\n     * @param prefix the prefix to find, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the String starts with the prefix, case insensitive, or\n     *  both \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 5705,col 9)-(line 5705,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.startsWith(java.lang.String, java.lang.String, boolean)",
      "begin_line": 5719,
      "end_line": 5727,
      "comment": "\n     * \u003cp\u003eCheck if a String starts with a specified prefix (optionally case insensitive).\u003c/p\u003e\n     *\n     * @see java.lang.String#startsWith(String)\n     * @param str  the String to check, may be null\n     * @param prefix the prefix to find, may be null\n     * @param ignoreCase inidicates whether the compare should ignore case\n     *  (case insensitive) or not.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the String starts with the prefix or\n     *  both \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 5720,col 9)-(line 5722,col 9)",
        "(line 5723,col 9)-(line 5725,col 9)",
        "(line 5726,col 9)-(line 5726,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.startsWithAny(java.lang.String, java.lang.String[])",
      "begin_line": 5747,
      "end_line": 5758,
      "comment": "\n     * \u003cp\u003eCheck if a String starts with any of an array of specified strings.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * StringUtils.startsWithAny(null, null)      \u003d false\n     * StringUtils.startsWithAny(null, new String[] {\"abc\"})  \u003d false\n     * StringUtils.startsWithAny(\"abcxyz\", null)     \u003d false\n     * StringUtils.startsWithAny(\"abcxyz\", new String[] {\"\"}) \u003d false\n     * StringUtils.startsWithAny(\"abcxyz\", new String[] {\"abc\"}) \u003d true\n     * StringUtils.startsWithAny(\"abcxyz\", new String[] {null, \"xyz\", \"abc\"}) \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param string  the String to check, may be null\n     * @param searchStrings the Strings to find, may be null or empty\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the String starts with any of the the prefixes, case insensitive, or\n     *  both \u003ccode\u003enull\u003c/code\u003e\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 5748,col 9)-(line 5750,col 9)",
        "(line 5751,col 9)-(line 5756,col 9)",
        "(line 5757,col 9)-(line 5757,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.endsWith(java.lang.String, java.lang.String)",
      "begin_line": 5785,
      "end_line": 5787,
      "comment": "\n     * \u003cp\u003eCheck if a String ends with a specified suffix.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003es are handled without exceptions. Two \u003ccode\u003enull\u003c/code\u003e\n     * references are considered to be equal. The comparison is case sensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.endsWith(null, null)      \u003d true\n     * StringUtils.endsWith(null, \"def\")     \u003d false\n     * StringUtils.endsWith(\"abcdef\", null)  \u003d false\n     * StringUtils.endsWith(\"abcdef\", \"def\") \u003d true\n     * StringUtils.endsWith(\"ABCDEF\", \"def\") \u003d false\n     * StringUtils.endsWith(\"ABCDEF\", \"cde\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#endsWith(String)\n     * @param str  the String to check, may be null\n     * @param suffix the suffix to find, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the String ends with the suffix, case sensitive, or\n     *  both \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 5786,col 9)-(line 5786,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 5811,
      "end_line": 5813,
      "comment": "\n     * \u003cp\u003eCase insensitive check if a String ends with a specified suffix.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003es are handled without exceptions. Two \u003ccode\u003enull\u003c/code\u003e\n     * references are considered to be equal. The comparison is case insensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.endsWithIgnoreCase(null, null)      \u003d true\n     * StringUtils.endsWithIgnoreCase(null, \"def\")     \u003d false\n     * StringUtils.endsWithIgnoreCase(\"abcdef\", null)  \u003d false\n     * StringUtils.endsWithIgnoreCase(\"abcdef\", \"def\") \u003d true\n     * StringUtils.endsWithIgnoreCase(\"ABCDEF\", \"def\") \u003d true\n     * StringUtils.endsWithIgnoreCase(\"ABCDEF\", \"cde\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#endsWith(String)\n     * @param str  the String to check, may be null\n     * @param suffix the suffix to find, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the String ends with the suffix, case insensitive, or\n     *  both \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 5812,col 9)-(line 5812,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.endsWith(java.lang.String, java.lang.String, boolean)",
      "begin_line": 5826,
      "end_line": 5835,
      "comment": "\n     * \u003cp\u003eCheck if a String ends with a specified suffix (optionally case insensitive).\u003c/p\u003e\n     *\n     * @see java.lang.String#endsWith(String)\n     * @param str  the String to check, may be null\n     * @param suffix the suffix to find, may be null\n     * @param ignoreCase inidicates whether the compare should ignore case\n     *  (case insensitive) or not.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the String starts with the prefix or\n     *  both \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 5827,col 9)-(line 5829,col 9)",
        "(line 5830,col 9)-(line 5832,col 9)",
        "(line 5833,col 9)-(line 5833,col 55)",
        "(line 5834,col 9)-(line 5834,col 84)"
      ]
    }
  ]
}