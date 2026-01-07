{
  "filepath": "/tmp/Lang-5b/src/main/java/org/apache/commons/lang3/StringUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StringUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 110,
      "end_line": 7104,
      "comment": "@Immutable"
    },
    {
      "type": "field",
      "varNames": [
        "SPACE"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": "\n     * A String for a space character.\n     * \n     * @since 3.2\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": "\n     * The empty String {@code \"\"}.\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INDEX_NOT_FOUND"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": "\n     * Represents a failed index search.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PAD_LIMIT"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": "\n     * \u003cp\u003eThe maximum size to which the padding constant(s) can expand.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "WHITESPACE_PATTERN"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": "\n     * A regex pattern for recognizing blocks of whitespace characters.\n     * The apparent convolutedness of the pattern serves the purpose of\n     * ignoring \"blocks\" consisting of only a single space:  the pattern\n     * is used only to normalize whitespace, condensing \"blocks\" down to a\n     * single space, thus matching the same would likely cause a great\n     * many noop replacements.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.StringUtils.StringUtils()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * \u003cp\u003e{@code StringUtils} instances should NOT be constructed in\n     * standard programming. Instead, the class should be used as\n     * {@code StringUtils.trim(\" foo \");}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isEmpty(java.lang.CharSequence)",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * \u003cp\u003eChecks if a CharSequence is empty (\"\") or null.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isEmpty(null)      \u003d true\n     * StringUtils.isEmpty(\"\")        \u003d true\n     * StringUtils.isEmpty(\" \")       \u003d false\n     * StringUtils.isEmpty(\"bob\")     \u003d false\n     * StringUtils.isEmpty(\"  bob  \") \u003d false\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eNOTE: This method changed in Lang version 2.0.\n     * It no longer trims the CharSequence.\n     * That functionality is available in isBlank().\u003c/p\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return {@code true} if the CharSequence is empty or null\n     * @since 3.0 Changed signature from isEmpty(String) to isEmpty(CharSequence)\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isNotEmpty(java.lang.CharSequence)",
      "begin_line": 213,
      "end_line": 215,
      "comment": "\n     * \u003cp\u003eChecks if a CharSequence is not empty (\"\") and not null.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isNotEmpty(null)      \u003d false\n     * StringUtils.isNotEmpty(\"\")        \u003d false\n     * StringUtils.isNotEmpty(\" \")       \u003d true\n     * StringUtils.isNotEmpty(\"bob\")     \u003d true\n     * StringUtils.isNotEmpty(\"  bob  \") \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return {@code true} if the CharSequence is not empty and not null\n     * @since 3.0 Changed signature from isNotEmpty(String) to isNotEmpty(CharSequence)\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isBlank(java.lang.CharSequence)",
      "begin_line": 233,
      "end_line": 244,
      "comment": "\n     * \u003cp\u003eChecks if a CharSequence is whitespace, empty (\"\") or null.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isBlank(null)      \u003d true\n     * StringUtils.isBlank(\"\")        \u003d true\n     * StringUtils.isBlank(\" \")       \u003d true\n     * StringUtils.isBlank(\"bob\")     \u003d false\n     * StringUtils.isBlank(\"  bob  \") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return {@code true} if the CharSequence is null, empty or whitespace\n     * @since 2.0\n     * @since 3.0 Changed signature from isBlank(String) to isBlank(CharSequence)\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 19)",
        "(line 235,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 243,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isNotBlank(java.lang.CharSequence)",
      "begin_line": 263,
      "end_line": 265,
      "comment": "\n     * \u003cp\u003eChecks if a CharSequence is not empty (\"\"), not null and not whitespace only.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isNotBlank(null)      \u003d false\n     * StringUtils.isNotBlank(\"\")        \u003d false\n     * StringUtils.isNotBlank(\" \")       \u003d false\n     * StringUtils.isNotBlank(\"bob\")     \u003d true\n     * StringUtils.isNotBlank(\"  bob  \") \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return {@code true} if the CharSequence is\n     *  not empty and not null and not whitespace\n     * @since 2.0\n     * @since 3.0 Changed signature from isNotBlank(String) to isNotBlank(CharSequence)\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.trim(java.lang.String)",
      "begin_line": 292,
      "end_line": 294,
      "comment": "\n     * \u003cp\u003eRemoves control characters (char \u0026lt;\u003d 32) from both\n     * ends of this String, handling {@code null} by returning\n     * {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is trimmed using {@link String#trim()}.\n     * Trim removes start and end characters \u0026lt;\u003d 32.\n     * To strip whitespace use {@link #strip(String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eTo trim your choice of characters, use the\n     * {@link #strip(String, String)} methods.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.trim(null)          \u003d null\n     * StringUtils.trim(\"\")            \u003d \"\"\n     * StringUtils.trim(\"     \")       \u003d \"\"\n     * StringUtils.trim(\"abc\")         \u003d \"abc\"\n     * StringUtils.trim(\"    abc    \") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be trimmed, may be null\n     * @return the trimmed string, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.trimToNull(java.lang.String)",
      "begin_line": 318,
      "end_line": 321,
      "comment": "\n     * \u003cp\u003eRemoves control characters (char \u0026lt;\u003d 32) from both\n     * ends of this String returning {@code null} if the String is\n     * empty (\"\") after the trim or if it is {@code null}.\n     *\n     * \u003cp\u003eThe String is trimmed using {@link String#trim()}.\n     * Trim removes start and end characters \u0026lt;\u003d 32.\n     * To strip whitespace use {@link #stripToNull(String)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.trimToNull(null)          \u003d null\n     * StringUtils.trimToNull(\"\")            \u003d null\n     * StringUtils.trimToNull(\"     \")       \u003d null\n     * StringUtils.trimToNull(\"abc\")         \u003d \"abc\"\n     * StringUtils.trimToNull(\"    abc    \") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be trimmed, may be null\n     * @return the trimmed String,\n     *  {@code null} if only chars \u0026lt;\u003d 32, empty or null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 30)",
        "(line 320,col 9)-(line 320,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.trimToEmpty(java.lang.String)",
      "begin_line": 344,
      "end_line": 346,
      "comment": "\n     * \u003cp\u003eRemoves control characters (char \u0026lt;\u003d 32) from both\n     * ends of this String returning an empty String (\"\") if the String\n     * is empty (\"\") after the trim or if it is {@code null}.\n     *\n     * \u003cp\u003eThe String is trimmed using {@link String#trim()}.\n     * Trim removes start and end characters \u0026lt;\u003d 32.\n     * To strip whitespace use {@link #stripToEmpty(String)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.trimToEmpty(null)          \u003d \"\"\n     * StringUtils.trimToEmpty(\"\")            \u003d \"\"\n     * StringUtils.trimToEmpty(\"     \")       \u003d \"\"\n     * StringUtils.trimToEmpty(\"abc\")         \u003d \"abc\"\n     * StringUtils.trimToEmpty(\"    abc    \") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be trimmed, may be null\n     * @return the trimmed String, or an empty String if {@code null} input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.strip(java.lang.String)",
      "begin_line": 372,
      "end_line": 374,
      "comment": "\n     * \u003cp\u003eStrips whitespace from the start and end of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is similar to {@link #trim(String)} but removes whitespace.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.strip(null)     \u003d null\n     * StringUtils.strip(\"\")       \u003d \"\"\n     * StringUtils.strip(\"   \")    \u003d \"\"\n     * StringUtils.strip(\"abc\")    \u003d \"abc\"\n     * StringUtils.strip(\"  abc\")  \u003d \"abc\"\n     * StringUtils.strip(\"abc  \")  \u003d \"abc\"\n     * StringUtils.strip(\" abc \")  \u003d \"abc\"\n     * StringUtils.strip(\" ab c \") \u003d \"ab c\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to remove whitespace from, may be null\n     * @return the stripped String, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.stripToNull(java.lang.String)",
      "begin_line": 399,
      "end_line": 405,
      "comment": "\n     * \u003cp\u003eStrips whitespace from the start and end of a String  returning\n     * {@code null} if the String is empty (\"\") after the strip.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is similar to {@link #trimToNull(String)} but removes whitespace.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripToNull(null)     \u003d null\n     * StringUtils.stripToNull(\"\")       \u003d null\n     * StringUtils.stripToNull(\"   \")    \u003d null\n     * StringUtils.stripToNull(\"abc\")    \u003d \"abc\"\n     * StringUtils.stripToNull(\"  abc\")  \u003d \"abc\"\n     * StringUtils.stripToNull(\"abc  \")  \u003d \"abc\"\n     * StringUtils.stripToNull(\" abc \")  \u003d \"abc\"\n     * StringUtils.stripToNull(\" ab c \") \u003d \"ab c\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be stripped, may be null\n     * @return the stripped String,\n     *  {@code null} if whitespace, empty or null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 402,col 9)",
        "(line 403,col 9)-(line 403,col 31)",
        "(line 404,col 9)-(line 404,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.stripToEmpty(java.lang.String)",
      "begin_line": 429,
      "end_line": 431,
      "comment": "\n     * \u003cp\u003eStrips whitespace from the start and end of a String  returning\n     * an empty String if {@code null} input.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is similar to {@link #trimToEmpty(String)} but removes whitespace.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripToEmpty(null)     \u003d \"\"\n     * StringUtils.stripToEmpty(\"\")       \u003d \"\"\n     * StringUtils.stripToEmpty(\"   \")    \u003d \"\"\n     * StringUtils.stripToEmpty(\"abc\")    \u003d \"abc\"\n     * StringUtils.stripToEmpty(\"  abc\")  \u003d \"abc\"\n     * StringUtils.stripToEmpty(\"abc  \")  \u003d \"abc\"\n     * StringUtils.stripToEmpty(\" abc \")  \u003d \"abc\"\n     * StringUtils.stripToEmpty(\" ab c \") \u003d \"ab c\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be stripped, may be null\n     * @return the trimmed String, or an empty String if {@code null} input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.strip(java.lang.String, java.lang.String)",
      "begin_line": 459,
      "end_line": 465,
      "comment": "\n     * \u003cp\u003eStrips any of a set of characters from the start and end of a String.\n     * This is similar to {@link String#trim()} but allows the characters\n     * to be stripped to be controlled.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * An empty string (\"\") input returns the empty string.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the stripChars String is {@code null}, whitespace is\n     * stripped as defined by {@link Character#isWhitespace(char)}.\n     * Alternatively use {@link #strip(String)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.strip(null, *)          \u003d null\n     * StringUtils.strip(\"\", *)            \u003d \"\"\n     * StringUtils.strip(\"abc\", null)      \u003d \"abc\"\n     * StringUtils.strip(\"  abc\", null)    \u003d \"abc\"\n     * StringUtils.strip(\"abc  \", null)    \u003d \"abc\"\n     * StringUtils.strip(\" abc \", null)    \u003d \"abc\"\n     * StringUtils.strip(\"  abcyx\", \"xyz\") \u003d \"  abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to remove characters from, may be null\n     * @param stripChars  the characters to remove, null treated as whitespace\n     * @return the stripped String, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 462,col 9)",
        "(line 463,col 9)-(line 463,col 42)",
        "(line 464,col 9)-(line 464,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.stripStart(java.lang.String, java.lang.String)",
      "begin_line": 491,
      "end_line": 509,
      "comment": "\n     * \u003cp\u003eStrips any of a set of characters from the start of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * An empty string (\"\") input returns the empty string.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the stripChars String is {@code null}, whitespace is\n     * stripped as defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripStart(null, *)          \u003d null\n     * StringUtils.stripStart(\"\", *)            \u003d \"\"\n     * StringUtils.stripStart(\"abc\", \"\")        \u003d \"abc\"\n     * StringUtils.stripStart(\"abc\", null)      \u003d \"abc\"\n     * StringUtils.stripStart(\"  abc\", null)    \u003d \"abc\"\n     * StringUtils.stripStart(\"abc  \", null)    \u003d \"abc  \"\n     * StringUtils.stripStart(\" abc \", null)    \u003d \"abc \"\n     * StringUtils.stripStart(\"yxabc  \", \"xyz\") \u003d \"abc  \"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to remove characters from, may be null\n     * @param stripChars  the characters to remove, null treated as whitespace\n     * @return the stripped String, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 19)",
        "(line 493,col 9)-(line 495,col 9)",
        "(line 496,col 9)-(line 496,col 22)",
        "(line 497,col 9)-(line 507,col 9)",
        "(line 508,col 9)-(line 508,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.stripEnd(java.lang.String, java.lang.String)",
      "begin_line": 536,
      "end_line": 554,
      "comment": "\n     * \u003cp\u003eStrips any of a set of characters from the end of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * An empty string (\"\") input returns the empty string.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the stripChars String is {@code null}, whitespace is\n     * stripped as defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripEnd(null, *)          \u003d null\n     * StringUtils.stripEnd(\"\", *)            \u003d \"\"\n     * StringUtils.stripEnd(\"abc\", \"\")        \u003d \"abc\"\n     * StringUtils.stripEnd(\"abc\", null)      \u003d \"abc\"\n     * StringUtils.stripEnd(\"  abc\", null)    \u003d \"  abc\"\n     * StringUtils.stripEnd(\"abc  \", null)    \u003d \"abc\"\n     * StringUtils.stripEnd(\" abc \", null)    \u003d \" abc\"\n     * StringUtils.stripEnd(\"  abcyx\", \"xyz\") \u003d \"  abc\"\n     * StringUtils.stripEnd(\"120.00\", \".0\")   \u003d \"12\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to remove characters from, may be null\n     * @param stripChars  the set of characters to remove, null treated as whitespace\n     * @return the stripped String, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 16)",
        "(line 538,col 9)-(line 540,col 9)",
        "(line 542,col 9)-(line 552,col 9)",
        "(line 553,col 9)-(line 553,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.stripAll(java.lang.String...)",
      "begin_line": 577,
      "end_line": 579,
      "comment": "\n     * \u003cp\u003eStrips whitespace from the start and end of every String in an array.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA new array is returned each time, except for length zero.\n     * A {@code null} array will return {@code null}.\n     * An empty array will return itself.\n     * A {@code null} array entry will be ignored.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripAll(null)             \u003d null\n     * StringUtils.stripAll([])               \u003d []\n     * StringUtils.stripAll([\"abc\", \"  abc\"]) \u003d [\"abc\", \"abc\"]\n     * StringUtils.stripAll([\"abc  \", null])  \u003d [\"abc\", null]\n     * \u003c/pre\u003e\n     *\n     * @param strs  the array to remove whitespace from, may be null\n     * @return the stripped Strings, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.stripAll(java.lang.String[], java.lang.String)",
      "begin_line": 606,
      "end_line": 616,
      "comment": "\n     * \u003cp\u003eStrips any of a set of characters from the start and end of every\n     * String in an array.\u003c/p\u003e\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA new array is returned each time, except for length zero.\n     * A {@code null} array will return {@code null}.\n     * An empty array will return itself.\n     * A {@code null} array entry will be ignored.\n     * A {@code null} stripChars will strip whitespace as defined by\n     * {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripAll(null, *)                \u003d null\n     * StringUtils.stripAll([], *)                  \u003d []\n     * StringUtils.stripAll([\"abc\", \"  abc\"], null) \u003d [\"abc\", \"abc\"]\n     * StringUtils.stripAll([\"abc  \", null], null)  \u003d [\"abc\", null]\n     * StringUtils.stripAll([\"abc  \", null], \"yz\")  \u003d [\"abc  \", null]\n     * StringUtils.stripAll([\"yabcz\", null], \"yz\")  \u003d [\"abc\", null]\n     * \u003c/pre\u003e\n     *\n     * @param strs  the array to remove characters from, may be null\n     * @param stripChars  the characters to remove, null treated as whitespace\n     * @return the stripped Strings, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 20)",
        "(line 608,col 9)-(line 610,col 9)",
        "(line 611,col 9)-(line 611,col 46)",
        "(line 612,col 9)-(line 614,col 9)",
        "(line 615,col 9)-(line 615,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.stripAccents(java.lang.String)",
      "begin_line": 636,
      "end_line": 644,
      "comment": " See also Lucene\u0027s ASCIIFoldingFilter (Lucene 2.9) that replaces accented characters by their unaccented equivalent (and uncommitted bug fix: https://issues.apache.org/jira/browse/LUCENE-1343?focusedCommentId\u003d12858907\u0026page\u003dcom.atlassian.jira.plugin.system.issuetabpanels%3Acomment-tabpanel#action_12858907).",
      "child_ranges": [
        "(line 637,col 9)-(line 639,col 9)",
        "(line 640,col 9)-(line 640,col 79)",
        "(line 641,col 9)-(line 641,col 77)",
        "(line 643,col 9)-(line 643,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.equals(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 669,
      "end_line": 680,
      "comment": "\n     * \u003cp\u003eCompares two CharSequences, returning {@code true} if they represent\n     * equal sequences of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null}s are handled without exceptions. Two {@code null}\n     * references are considered to be equal. The comparison is case sensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.equals(null, null)   \u003d true\n     * StringUtils.equals(null, \"abc\")  \u003d false\n     * StringUtils.equals(\"abc\", null)  \u003d false\n     * StringUtils.equals(\"abc\", \"abc\") \u003d true\n     * StringUtils.equals(\"abc\", \"ABC\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @see Object#equals(Object)\n     * @param cs1  the first CharSequence, may be {@code null}\n     * @param cs2  the second CharSequence, may be {@code null}\n     * @return {@code true} if the CharSequences are equal (case-sensitive), or both {@code null}\n     * @since 3.0 Changed signature from equals(String, String) to equals(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 670,col 9)-(line 672,col 9)",
        "(line 673,col 9)-(line 675,col 9)",
        "(line 676,col 9)-(line 678,col 9)",
        "(line 679,col 9)-(line 679,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.equalsIgnoreCase(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 703,
      "end_line": 713,
      "comment": "\n     * \u003cp\u003eCompares two CharSequences, returning {@code true} if they represent\n     * equal sequences of characters, ignoring case.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null}s are handled without exceptions. Two {@code null}\n     * references are considered equal. Comparison is case insensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.equalsIgnoreCase(null, null)   \u003d true\n     * StringUtils.equalsIgnoreCase(null, \"abc\")  \u003d false\n     * StringUtils.equalsIgnoreCase(\"abc\", null)  \u003d false\n     * StringUtils.equalsIgnoreCase(\"abc\", \"abc\") \u003d true\n     * StringUtils.equalsIgnoreCase(\"abc\", \"ABC\") \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param str1  the first CharSequence, may be null\n     * @param str2  the second CharSequence, may be null\n     * @return {@code true} if the CharSequence are equal, case insensitive, or\n     *  both {@code null}\n     * @since 3.0 Changed signature from equalsIgnoreCase(String, String) to equalsIgnoreCase(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 704,col 9)-(line 712,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOf(java.lang.CharSequence, int)",
      "begin_line": 737,
      "end_line": 742,
      "comment": "\n     * \u003cp\u003eFinds the first index within a CharSequence, handling {@code null}.\n     * This method uses {@link String#indexOf(int, int)} if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} or empty (\"\") CharSequence will return {@code INDEX_NOT_FOUND (-1)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOf(null, *)         \u003d -1\n     * StringUtils.indexOf(\"\", *)           \u003d -1\n     * StringUtils.indexOf(\"aabaabaa\", \u0027a\u0027) \u003d 0\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027) \u003d 2\n     * \u003c/pre\u003e\n     *\n     * @param seq  the CharSequence to check, may be null\n     * @param searchChar  the character to find\n     * @return the first index of the search character,\n     *  -1 if no match or {@code null} string input\n     * @since 2.0\n     * @since 3.0 Changed signature from indexOf(String, int) to indexOf(CharSequence, int)\n     ",
      "child_ranges": [
        "(line 738,col 9)-(line 740,col 9)",
        "(line 741,col 9)-(line 741,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOf(java.lang.CharSequence, int, int)",
      "begin_line": 770,
      "end_line": 775,
      "comment": "\n     * \u003cp\u003eFinds the first index within a CharSequence from a start position,\n     * handling {@code null}.\n     * This method uses {@link String#indexOf(int, int)} if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} or empty (\"\") CharSequence will return {@code (INDEX_NOT_FOUND) -1}.\n     * A negative start position is treated as zero.\n     * A start position greater than the string length returns {@code -1}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOf(null, *, *)          \u003d -1\n     * StringUtils.indexOf(\"\", *, *)            \u003d -1\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027, 0)  \u003d 2\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027, 3)  \u003d 5\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027, 9)  \u003d -1\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027, -1) \u003d 2\n     * \u003c/pre\u003e\n     *\n     * @param seq  the CharSequence to check, may be null\n     * @param searchChar  the character to find\n     * @param startPos  the start position, negative treated as zero\n     * @return the first index of the search character,\n     *  -1 if no match or {@code null} string input\n     * @since 2.0\n     * @since 3.0 Changed signature from indexOf(String, int, int) to indexOf(CharSequence, int, int)\n     ",
      "child_ranges": [
        "(line 771,col 9)-(line 773,col 9)",
        "(line 774,col 9)-(line 774,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOf(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 801,
      "end_line": 806,
      "comment": "\n     * \u003cp\u003eFinds the first index within a CharSequence, handling {@code null}.\n     * This method uses {@link String#indexOf(String, int)} if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOf(null, *)          \u003d -1\n     * StringUtils.indexOf(*, null)          \u003d -1\n     * StringUtils.indexOf(\"\", \"\")           \u003d 0\n     * StringUtils.indexOf(\"\", *)            \u003d -1 (except when * \u003d \"\")\n     * StringUtils.indexOf(\"aabaabaa\", \"a\")  \u003d 0\n     * StringUtils.indexOf(\"aabaabaa\", \"b\")  \u003d 2\n     * StringUtils.indexOf(\"aabaabaa\", \"ab\") \u003d 1\n     * StringUtils.indexOf(\"aabaabaa\", \"\")   \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param seq  the CharSequence to check, may be null\n     * @param searchSeq  the CharSequence to find, may be null\n     * @return the first index of the search CharSequence,\n     *  -1 if no match or {@code null} string input\n     * @since 2.0\n     * @since 3.0 Changed signature from indexOf(String, String) to indexOf(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 802,col 9)-(line 804,col 9)",
        "(line 805,col 9)-(line 805,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOf(java.lang.CharSequence, java.lang.CharSequence, int)",
      "begin_line": 841,
      "end_line": 846,
      "comment": "\n     * \u003cp\u003eFinds the first index within a CharSequence, handling {@code null}.\n     * This method uses {@link String#indexOf(String, int)} if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\n     * A negative start position is treated as zero.\n     * An empty (\"\") search CharSequence always matches.\n     * A start position greater than the string length only matches\n     * an empty search CharSequence.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOf(null, *, *)          \u003d -1\n     * StringUtils.indexOf(*, null, *)          \u003d -1\n     * StringUtils.indexOf(\"\", \"\", 0)           \u003d 0\n     * StringUtils.indexOf(\"\", *, 0)            \u003d -1 (except when * \u003d \"\")\n     * StringUtils.indexOf(\"aabaabaa\", \"a\", 0)  \u003d 0\n     * StringUtils.indexOf(\"aabaabaa\", \"b\", 0)  \u003d 2\n     * StringUtils.indexOf(\"aabaabaa\", \"ab\", 0) \u003d 1\n     * StringUtils.indexOf(\"aabaabaa\", \"b\", 3)  \u003d 5\n     * StringUtils.indexOf(\"aabaabaa\", \"b\", 9)  \u003d -1\n     * StringUtils.indexOf(\"aabaabaa\", \"b\", -1) \u003d 2\n     * StringUtils.indexOf(\"aabaabaa\", \"\", 2)   \u003d 2\n     * StringUtils.indexOf(\"abc\", \"\", 9)        \u003d 3\n     * \u003c/pre\u003e\n     *\n     * @param seq  the CharSequence to check, may be null\n     * @param searchSeq  the CharSequence to find, may be null\n     * @param startPos  the start position, negative treated as zero\n     * @return the first index of the search CharSequence,\n     *  -1 if no match or {@code null} string input\n     * @since 2.0\n     * @since 3.0 Changed signature from indexOf(String, String, int) to indexOf(CharSequence, CharSequence, int)\n     ",
      "child_ranges": [
        "(line 842,col 9)-(line 844,col 9)",
        "(line 845,col 9)-(line 845,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.ordinalIndexOf(java.lang.CharSequence, java.lang.CharSequence, int)",
      "begin_line": 882,
      "end_line": 884,
      "comment": "\n     * \u003cp\u003eFinds the n-th index within a CharSequence, handling {@code null}.\n     * This method uses {@link String#indexOf(String)} if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.ordinalIndexOf(null, *, *)          \u003d -1\n     * StringUtils.ordinalIndexOf(*, null, *)          \u003d -1\n     * StringUtils.ordinalIndexOf(\"\", \"\", *)           \u003d 0\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"a\", 1)  \u003d 0\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"a\", 2)  \u003d 1\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"b\", 1)  \u003d 2\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"b\", 2)  \u003d 5\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"ab\", 1) \u003d 1\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"ab\", 2) \u003d 4\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"\", 1)   \u003d 0\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"\", 2)   \u003d 0\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eNote that \u0027head(CharSequence str, int n)\u0027 may be implemented as: \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   str.substring(0, lastOrdinalIndexOf(str, \"\\n\", n))\n     * \u003c/pre\u003e\n     *\n     * @param str  the CharSequence to check, may be null\n     * @param searchStr  the CharSequence to find, may be null\n     * @param ordinal  the n-th {@code searchStr} to find\n     * @return the n-th index of the search CharSequence,\n     *  {@code -1} ({@code INDEX_NOT_FOUND}) if no match or {@code null} string input\n     * @since 2.1\n     * @since 3.0 Changed signature from ordinalIndexOf(String, String, int) to ordinalIndexOf(CharSequence, CharSequence, int)\n     ",
      "child_ranges": [
        "(line 883,col 9)-(line 883,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.ordinalIndexOf(java.lang.CharSequence, java.lang.CharSequence, int, boolean)",
      "begin_line": 900,
      "end_line": 921,
      "comment": " Shared code between ordinalIndexOf(String,String,int) and lastOrdinalIndexOf(String,String,int)",
      "child_ranges": [
        "(line 901,col 9)-(line 903,col 9)",
        "(line 904,col 9)-(line 906,col 9)",
        "(line 907,col 9)-(line 907,col 22)",
        "(line 908,col 9)-(line 908,col 63)",
        "(line 909,col 9)-(line 919,col 34)",
        "(line 920,col 9)-(line 920,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 948,
      "end_line": 950,
      "comment": "\n     * \u003cp\u003eCase in-sensitive find of the first index within a CharSequence.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\n     * A negative start position is treated as zero.\n     * An empty (\"\") search CharSequence always matches.\n     * A start position greater than the string length only matches\n     * an empty search CharSequence.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfIgnoreCase(null, *)          \u003d -1\n     * StringUtils.indexOfIgnoreCase(*, null)          \u003d -1\n     * StringUtils.indexOfIgnoreCase(\"\", \"\")           \u003d 0\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"a\")  \u003d 0\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"b\")  \u003d 2\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"ab\") \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @param str  the CharSequence to check, may be null\n     * @param searchStr  the CharSequence to find, may be null\n     * @return the first index of the search CharSequence,\n     *  -1 if no match or {@code null} string input\n     * @since 2.5\n     * @since 3.0 Changed signature from indexOfIgnoreCase(String, String) to indexOfIgnoreCase(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 949,col 9)-(line 949,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(java.lang.CharSequence, java.lang.CharSequence, int)",
      "begin_line": 984,
      "end_line": 1004,
      "comment": "\n     * \u003cp\u003eCase in-sensitive find of the first index within a CharSequence\n     * from the specified position.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\n     * A negative start position is treated as zero.\n     * An empty (\"\") search CharSequence always matches.\n     * A start position greater than the string length only matches\n     * an empty search CharSequence.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfIgnoreCase(null, *, *)          \u003d -1\n     * StringUtils.indexOfIgnoreCase(*, null, *)          \u003d -1\n     * StringUtils.indexOfIgnoreCase(\"\", \"\", 0)           \u003d 0\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"A\", 0)  \u003d 0\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"B\", 0)  \u003d 2\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"AB\", 0) \u003d 1\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"B\", 3)  \u003d 5\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"B\", 9)  \u003d -1\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"B\", -1) \u003d 2\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"\", 2)   \u003d 2\n     * StringUtils.indexOfIgnoreCase(\"abc\", \"\", 9)        \u003d 3\n     * \u003c/pre\u003e\n     *\n     * @param str  the CharSequence to check, may be null\n     * @param searchStr  the CharSequence to find, may be null\n     * @param startPos  the start position, negative treated as zero\n     * @return the first index of the search CharSequence,\n     *  -1 if no match or {@code null} string input\n     * @since 2.5\n     * @since 3.0 Changed signature from indexOfIgnoreCase(String, String, int) to indexOfIgnoreCase(CharSequence, CharSequence, int)\n     ",
      "child_ranges": [
        "(line 985,col 9)-(line 987,col 9)",
        "(line 988,col 9)-(line 990,col 9)",
        "(line 991,col 9)-(line 991,col 61)",
        "(line 992,col 9)-(line 994,col 9)",
        "(line 995,col 9)-(line 997,col 9)",
        "(line 998,col 9)-(line 1002,col 9)",
        "(line 1003,col 9)-(line 1003,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastIndexOf(java.lang.CharSequence, int)",
      "begin_line": 1028,
      "end_line": 1033,
      "comment": "\n     * \u003cp\u003eFinds the last index within a CharSequence, handling {@code null}.\n     * This method uses {@link String#lastIndexOf(int)} if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} or empty (\"\") CharSequence will return {@code -1}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOf(null, *)         \u003d -1\n     * StringUtils.lastIndexOf(\"\", *)           \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027a\u0027) \u003d 7\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027) \u003d 5\n     * \u003c/pre\u003e\n     *\n     * @param seq  the CharSequence to check, may be null\n     * @param searchChar  the character to find\n     * @return the last index of the search character,\n     *  -1 if no match or {@code null} string input\n     * @since 2.0\n     * @since 3.0 Changed signature from lastIndexOf(String, int) to lastIndexOf(CharSequence, int)\n     ",
      "child_ranges": [
        "(line 1029,col 9)-(line 1031,col 9)",
        "(line 1032,col 9)-(line 1032,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastIndexOf(java.lang.CharSequence, int, int)",
      "begin_line": 1063,
      "end_line": 1068,
      "comment": "\n     * \u003cp\u003eFinds the last index within a CharSequence from a start position,\n     * handling {@code null}.\n     * This method uses {@link String#lastIndexOf(int, int)} if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} or empty (\"\") CharSequence will return {@code -1}.\n     * A negative start position returns {@code -1}.\n     * A start position greater than the string length searches the whole string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOf(null, *, *)          \u003d -1\n     * StringUtils.lastIndexOf(\"\", *,  *)           \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, 8)  \u003d 5\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, 4)  \u003d 2\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, 0)  \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, 9)  \u003d 5\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, -1) \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027a\u0027, 0)  \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param seq  the CharSequence to check, may be null\n     * @param searchChar  the character to find\n     * @param startPos  the start position\n     * @return the last index of the search character,\n     *  -1 if no match or {@code null} string input\n     * @since 2.0\n     * @since 3.0 Changed signature from lastIndexOf(String, int, int) to lastIndexOf(CharSequence, int, int)\n     ",
      "child_ranges": [
        "(line 1064,col 9)-(line 1066,col 9)",
        "(line 1067,col 9)-(line 1067,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastIndexOf(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 1093,
      "end_line": 1098,
      "comment": "\n     * \u003cp\u003eFinds the last index within a CharSequence, handling {@code null}.\n     * This method uses {@link String#lastIndexOf(String)} if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOf(null, *)          \u003d -1\n     * StringUtils.lastIndexOf(*, null)          \u003d -1\n     * StringUtils.lastIndexOf(\"\", \"\")           \u003d 0\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"a\")  \u003d 7\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\")  \u003d 5\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"ab\") \u003d 4\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"\")   \u003d 8\n     * \u003c/pre\u003e\n     *\n     * @param seq  the CharSequence to check, may be null\n     * @param searchSeq  the CharSequence to find, may be null\n     * @return the last index of the search String,\n     *  -1 if no match or {@code null} string input\n     * @since 2.0\n     * @since 3.0 Changed signature from lastIndexOf(String, String) to lastIndexOf(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 1094,col 9)-(line 1096,col 9)",
        "(line 1097,col 9)-(line 1097,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf(java.lang.CharSequence, java.lang.CharSequence, int)",
      "begin_line": 1134,
      "end_line": 1136,
      "comment": "\n     * \u003cp\u003eFinds the n-th last index within a String, handling {@code null}.\n     * This method uses {@link String#lastIndexOf(String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} String will return {@code -1}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastOrdinalIndexOf(null, *, *)          \u003d -1\n     * StringUtils.lastOrdinalIndexOf(*, null, *)          \u003d -1\n     * StringUtils.lastOrdinalIndexOf(\"\", \"\", *)           \u003d 0\n     * StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"a\", 1)  \u003d 7\n     * StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"a\", 2)  \u003d 6\n     * StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"b\", 1)  \u003d 5\n     * StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"b\", 2)  \u003d 2\n     * StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"ab\", 1) \u003d 4\n     * StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"ab\", 2) \u003d 1\n     * StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"\", 1)   \u003d 8\n     * StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"\", 2)   \u003d 8\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eNote that \u0027tail(CharSequence str, int n)\u0027 may be implemented as: \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   str.substring(lastOrdinalIndexOf(str, \"\\n\", n) + 1)\n     * \u003c/pre\u003e\n     *\n     * @param str  the CharSequence to check, may be null\n     * @param searchStr  the CharSequence to find, may be null\n     * @param ordinal  the n-th last {@code searchStr} to find\n     * @return the n-th last index of the search CharSequence,\n     *  {@code -1} ({@code INDEX_NOT_FOUND}) if no match or {@code null} string input\n     * @since 2.5\n     * @since 3.0 Changed signature from lastOrdinalIndexOf(String, String, int) to lastOrdinalIndexOf(CharSequence, CharSequence, int)\n     ",
      "child_ranges": [
        "(line 1135,col 9)-(line 1135,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastIndexOf(java.lang.CharSequence, java.lang.CharSequence, int)",
      "begin_line": 1167,
      "end_line": 1172,
      "comment": "\n     * \u003cp\u003eFinds the first index within a CharSequence, handling {@code null}.\n     * This method uses {@link String#lastIndexOf(String, int)} if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\n     * A negative start position returns {@code -1}.\n     * An empty (\"\") search CharSequence always matches unless the start position is negative.\n     * A start position greater than the string length searches the whole string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOf(null, *, *)          \u003d -1\n     * StringUtils.lastIndexOf(*, null, *)          \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"a\", 8)  \u003d 7\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\", 8)  \u003d 5\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"ab\", 8) \u003d 4\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\", 9)  \u003d 5\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\", -1) \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"a\", 0)  \u003d 0\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\", 0)  \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param seq  the CharSequence to check, may be null\n     * @param searchSeq  the CharSequence to find, may be null\n     * @param startPos  the start position, negative treated as zero\n     * @return the first index of the search CharSequence,\n     *  -1 if no match or {@code null} string input\n     * @since 2.0\n     * @since 3.0 Changed signature from lastIndexOf(String, String, int) to lastIndexOf(CharSequence, CharSequence, int)\n     ",
      "child_ranges": [
        "(line 1168,col 9)-(line 1170,col 9)",
        "(line 1171,col 9)-(line 1171,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 1197,
      "end_line": 1202,
      "comment": "\n     * \u003cp\u003eCase in-sensitive find of the last index within a CharSequence.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\n     * A negative start position returns {@code -1}.\n     * An empty (\"\") search CharSequence always matches unless the start position is negative.\n     * A start position greater than the string length searches the whole string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOfIgnoreCase(null, *)          \u003d -1\n     * StringUtils.lastIndexOfIgnoreCase(*, null)          \u003d -1\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"A\")  \u003d 7\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"B\")  \u003d 5\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"AB\") \u003d 4\n     * \u003c/pre\u003e\n     *\n     * @param str  the CharSequence to check, may be null\n     * @param searchStr  the CharSequence to find, may be null\n     * @return the first index of the search CharSequence,\n     *  -1 if no match or {@code null} string input\n     * @since 2.5\n     * @since 3.0 Changed signature from lastIndexOfIgnoreCase(String, String) to lastIndexOfIgnoreCase(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 1198,col 9)-(line 1200,col 9)",
        "(line 1201,col 9)-(line 1201,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(java.lang.CharSequence, java.lang.CharSequence, int)",
      "begin_line": 1233,
      "end_line": 1253,
      "comment": "\n     * \u003cp\u003eCase in-sensitive find of the last index within a CharSequence\n     * from the specified position.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\n     * A negative start position returns {@code -1}.\n     * An empty (\"\") search CharSequence always matches unless the start position is negative.\n     * A start position greater than the string length searches the whole string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOfIgnoreCase(null, *, *)          \u003d -1\n     * StringUtils.lastIndexOfIgnoreCase(*, null, *)          \u003d -1\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"A\", 8)  \u003d 7\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"B\", 8)  \u003d 5\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"AB\", 8) \u003d 4\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"B\", 9)  \u003d 5\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"B\", -1) \u003d -1\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"A\", 0)  \u003d 0\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"B\", 0)  \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param str  the CharSequence to check, may be null\n     * @param searchStr  the CharSequence to find, may be null\n     * @param startPos  the start position\n     * @return the first index of the search CharSequence,\n     *  -1 if no match or {@code null} input\n     * @since 2.5\n     * @since 3.0 Changed signature from lastIndexOfIgnoreCase(String, String, int) to lastIndexOfIgnoreCase(CharSequence, CharSequence, int)\n     ",
      "child_ranges": [
        "(line 1234,col 9)-(line 1236,col 9)",
        "(line 1237,col 9)-(line 1239,col 9)",
        "(line 1240,col 9)-(line 1242,col 9)",
        "(line 1243,col 9)-(line 1245,col 9)",
        "(line 1247,col 9)-(line 1251,col 9)",
        "(line 1252,col 9)-(line 1252,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.contains(java.lang.CharSequence, int)",
      "begin_line": 1277,
      "end_line": 1282,
      "comment": "\n     * \u003cp\u003eChecks if CharSequence contains a search character, handling {@code null}.\n     * This method uses {@link String#indexOf(int)} if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} or empty (\"\") CharSequence will return {@code false}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.contains(null, *)    \u003d false\n     * StringUtils.contains(\"\", *)      \u003d false\n     * StringUtils.contains(\"abc\", \u0027a\u0027) \u003d true\n     * StringUtils.contains(\"abc\", \u0027z\u0027) \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param seq  the CharSequence to check, may be null\n     * @param searchChar  the character to find\n     * @return true if the CharSequence contains the search character,\n     *  false if not or {@code null} string input\n     * @since 2.0\n     * @since 3.0 Changed signature from contains(String, int) to contains(CharSequence, int)\n     ",
      "child_ranges": [
        "(line 1278,col 9)-(line 1280,col 9)",
        "(line 1281,col 9)-(line 1281,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.contains(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 1306,
      "end_line": 1311,
      "comment": "\n     * \u003cp\u003eChecks if CharSequence contains a search CharSequence, handling {@code null}.\n     * This method uses {@link String#indexOf(String)} if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code false}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.contains(null, *)     \u003d false\n     * StringUtils.contains(*, null)     \u003d false\n     * StringUtils.contains(\"\", \"\")      \u003d true\n     * StringUtils.contains(\"abc\", \"\")   \u003d true\n     * StringUtils.contains(\"abc\", \"a\")  \u003d true\n     * StringUtils.contains(\"abc\", \"z\")  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param seq  the CharSequence to check, may be null\n     * @param searchSeq  the CharSequence to find, may be null\n     * @return true if the CharSequence contains the search CharSequence,\n     *  false if not or {@code null} string input\n     * @since 2.0\n     * @since 3.0 Changed signature from contains(String, String) to contains(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 1307,col 9)-(line 1309,col 9)",
        "(line 1310,col 9)-(line 1310,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsIgnoreCase(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 1337,
      "end_line": 1349,
      "comment": "\n     * \u003cp\u003eChecks if CharSequence contains a search CharSequence irrespective of case,\n     * handling {@code null}. Case-insensitivity is defined as by\n     * {@link String#equalsIgnoreCase(String)}.\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code false}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.contains(null, *) \u003d false\n     * StringUtils.contains(*, null) \u003d false\n     * StringUtils.contains(\"\", \"\") \u003d true\n     * StringUtils.contains(\"abc\", \"\") \u003d true\n     * StringUtils.contains(\"abc\", \"a\") \u003d true\n     * StringUtils.contains(\"abc\", \"z\") \u003d false\n     * StringUtils.contains(\"abc\", \"A\") \u003d true\n     * StringUtils.contains(\"abc\", \"Z\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the CharSequence to check, may be null\n     * @param searchStr  the CharSequence to find, may be null\n     * @return true if the CharSequence contains the search CharSequence irrespective of\n     * case or false if not or {@code null} string input\n     * @since 3.0 Changed signature from containsIgnoreCase(String, String) to containsIgnoreCase(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 1338,col 9)-(line 1340,col 9)",
        "(line 1341,col 9)-(line 1341,col 37)",
        "(line 1342,col 9)-(line 1342,col 37)",
        "(line 1343,col 9)-(line 1347,col 9)",
        "(line 1348,col 9)-(line 1348,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsWhitespace(java.lang.CharSequence)",
      "begin_line": 1360,
      "end_line": 1371,
      "comment": " From org.springframework.util.StringUtils, under Apache License 2.0",
      "child_ranges": [
        "(line 1361,col 9)-(line 1363,col 9)",
        "(line 1364,col 9)-(line 1364,col 34)",
        "(line 1365,col 9)-(line 1369,col 9)",
        "(line 1370,col 9)-(line 1370,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfAny(java.lang.CharSequence, char...)",
      "begin_line": 1398,
      "end_line": 1422,
      "comment": "\n     * \u003cp\u003eSearch a CharSequence to find the first index of any\n     * character in the given set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} String will return {@code -1}.\n     * A {@code null} or zero length search array will return {@code -1}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAny(null, *)                \u003d -1\n     * StringUtils.indexOfAny(\"\", *)                  \u003d -1\n     * StringUtils.indexOfAny(*, null)                \u003d -1\n     * StringUtils.indexOfAny(*, [])                  \u003d -1\n     * StringUtils.indexOfAny(\"zzabyycdxx\",[\u0027z\u0027,\u0027a\u0027]) \u003d 0\n     * StringUtils.indexOfAny(\"zzabyycdxx\",[\u0027b\u0027,\u0027y\u0027]) \u003d 3\n     * StringUtils.indexOfAny(\"aba\", [\u0027z\u0027])           \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the index of any of the chars, -1 if no match or null input\n     * @since 2.0\n     * @since 3.0 Changed signature from indexOfAny(String, char[]) to indexOfAny(CharSequence, char...)\n     ",
      "child_ranges": [
        "(line 1399,col 9)-(line 1401,col 9)",
        "(line 1402,col 9)-(line 1402,col 32)",
        "(line 1403,col 9)-(line 1403,col 31)",
        "(line 1404,col 9)-(line 1404,col 43)",
        "(line 1405,col 9)-(line 1405,col 39)",
        "(line 1406,col 9)-(line 1420,col 9)",
        "(line 1421,col 9)-(line 1421,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfAny(java.lang.CharSequence, java.lang.String)",
      "begin_line": 1447,
      "end_line": 1452,
      "comment": "\n     * \u003cp\u003eSearch a CharSequence to find the first index of any\n     * character in the given set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} String will return {@code -1}.\n     * A {@code null} search string will return {@code -1}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAny(null, *)            \u003d -1\n     * StringUtils.indexOfAny(\"\", *)              \u003d -1\n     * StringUtils.indexOfAny(*, null)            \u003d -1\n     * StringUtils.indexOfAny(*, \"\")              \u003d -1\n     * StringUtils.indexOfAny(\"zzabyycdxx\", \"za\") \u003d 0\n     * StringUtils.indexOfAny(\"zzabyycdxx\", \"by\") \u003d 3\n     * StringUtils.indexOfAny(\"aba\",\"z\")          \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the index of any of the chars, -1 if no match or null input\n     * @since 2.0\n     * @since 3.0 Changed signature from indexOfAny(String, String) to indexOfAny(CharSequence, String)\n     ",
      "child_ranges": [
        "(line 1448,col 9)-(line 1450,col 9)",
        "(line 1451,col 9)-(line 1451,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsAny(java.lang.CharSequence, char...)",
      "begin_line": 1480,
      "end_line": 1508,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains any character in the given\n     * set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code false}.\n     * A {@code null} or zero length search array will return {@code false}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsAny(null, *)                \u003d false\n     * StringUtils.containsAny(\"\", *)                  \u003d false\n     * StringUtils.containsAny(*, null)                \u003d false\n     * StringUtils.containsAny(*, [])                  \u003d false\n     * StringUtils.containsAny(\"zzabyycdxx\",[\u0027z\u0027,\u0027a\u0027]) \u003d true\n     * StringUtils.containsAny(\"zzabyycdxx\",[\u0027b\u0027,\u0027y\u0027]) \u003d true\n     * StringUtils.containsAny(\"aba\", [\u0027z\u0027])           \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the {@code true} if any of the chars are found,\n     * {@code false} if no match or null input\n     * @since 2.4\n     * @since 3.0 Changed signature from containsAny(String, char[]) to containsAny(CharSequence, char...)\n     ",
      "child_ranges": [
        "(line 1481,col 9)-(line 1483,col 9)",
        "(line 1484,col 9)-(line 1484,col 35)",
        "(line 1485,col 9)-(line 1485,col 46)",
        "(line 1486,col 9)-(line 1486,col 34)",
        "(line 1487,col 9)-(line 1487,col 42)",
        "(line 1488,col 9)-(line 1506,col 9)",
        "(line 1507,col 9)-(line 1507,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsAny(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 1538,
      "end_line": 1543,
      "comment": "\n     * \u003cp\u003e\n     * Checks if the CharSequence contains any character in the given set of characters.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * A {@code null} CharSequence will return {@code false}. A {@code null} search CharSequence will return\n     * {@code false}.\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsAny(null, *)            \u003d false\n     * StringUtils.containsAny(\"\", *)              \u003d false\n     * StringUtils.containsAny(*, null)            \u003d false\n     * StringUtils.containsAny(*, \"\")              \u003d false\n     * StringUtils.containsAny(\"zzabyycdxx\", \"za\") \u003d true\n     * StringUtils.containsAny(\"zzabyycdxx\", \"by\") \u003d true\n     * StringUtils.containsAny(\"aba\",\"z\")          \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs\n     *            the CharSequence to check, may be null\n     * @param searchChars\n     *            the chars to search for, may be null\n     * @return the {@code true} if any of the chars are found, {@code false} if no match or null input\n     * @since 2.4\n     * @since 3.0 Changed signature from containsAny(String, String) to containsAny(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 1539,col 9)-(line 1541,col 9)",
        "(line 1542,col 9)-(line 1542,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfAnyBut(java.lang.CharSequence, char...)",
      "begin_line": 1571,
      "end_line": 1596,
      "comment": "\n     * \u003cp\u003eSearches a CharSequence to find the first index of any\n     * character not in the given set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\n     * A {@code null} or zero length search array will return {@code -1}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAnyBut(null, *)                              \u003d -1\n     * StringUtils.indexOfAnyBut(\"\", *)                                \u003d -1\n     * StringUtils.indexOfAnyBut(*, null)                              \u003d -1\n     * StringUtils.indexOfAnyBut(*, [])                                \u003d -1\n     * StringUtils.indexOfAnyBut(\"zzabyycdxx\", new char[] {\u0027z\u0027, \u0027a\u0027} ) \u003d 3\n     * StringUtils.indexOfAnyBut(\"aba\", new char[] {\u0027z\u0027} )             \u003d 0\n     * StringUtils.indexOfAnyBut(\"aba\", new char[] {\u0027a\u0027, \u0027b\u0027} )        \u003d -1\n\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the index of any of the chars, -1 if no match or null input\n     * @since 2.0\n     * @since 3.0 Changed signature from indexOfAnyBut(String, char[]) to indexOfAnyBut(CharSequence, char...)\n     ",
      "child_ranges": [
        "(line 1572,col 9)-(line 1574,col 9)",
        "(line 1575,col 9)-(line 1575,col 32)",
        "(line 1576,col 9)-(line 1576,col 31)",
        "(line 1577,col 9)-(line 1577,col 43)",
        "(line 1578,col 9)-(line 1578,col 39)",
        "(line 1579,col 9)-(line 1594,col 9)",
        "(line 1595,col 9)-(line 1595,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfAnyBut(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 1621,
      "end_line": 1641,
      "comment": "\n     * \u003cp\u003eSearch a CharSequence to find the first index of any\n     * character not in the given set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\n     * A {@code null} or empty search string will return {@code -1}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAnyBut(null, *)            \u003d -1\n     * StringUtils.indexOfAnyBut(\"\", *)              \u003d -1\n     * StringUtils.indexOfAnyBut(*, null)            \u003d -1\n     * StringUtils.indexOfAnyBut(*, \"\")              \u003d -1\n     * StringUtils.indexOfAnyBut(\"zzabyycdxx\", \"za\") \u003d 3\n     * StringUtils.indexOfAnyBut(\"zzabyycdxx\", \"\")   \u003d -1\n     * StringUtils.indexOfAnyBut(\"aba\",\"ab\")         \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param seq  the CharSequence to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the index of any of the chars, -1 if no match or null input\n     * @since 2.0\n     * @since 3.0 Changed signature from indexOfAnyBut(String, String) to indexOfAnyBut(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 1622,col 9)-(line 1624,col 9)",
        "(line 1625,col 9)-(line 1625,col 34)",
        "(line 1626,col 9)-(line 1639,col 9)",
        "(line 1640,col 9)-(line 1640,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsOnly(java.lang.CharSequence, char...)",
      "begin_line": 1667,
      "end_line": 1679,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only certain characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code false}.\n     * A {@code null} valid character array will return {@code false}.\n     * An empty CharSequence (length()\u003d0) always returns {@code true}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsOnly(null, *)       \u003d false\n     * StringUtils.containsOnly(*, null)       \u003d false\n     * StringUtils.containsOnly(\"\", *)         \u003d true\n     * StringUtils.containsOnly(\"ab\", \u0027\u0027)      \u003d false\n     * StringUtils.containsOnly(\"abab\", \u0027abc\u0027) \u003d true\n     * StringUtils.containsOnly(\"ab1\", \u0027abc\u0027)  \u003d false\n     * StringUtils.containsOnly(\"abz\", \u0027abc\u0027)  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the String to check, may be null\n     * @param valid  an array of valid chars, may be null\n     * @return true if it only contains valid chars and is non-null\n     * @since 3.0 Changed signature from containsOnly(String, char[]) to containsOnly(CharSequence, char...)\n     ",
      "child_ranges": [
        "(line 1669,col 9)-(line 1671,col 9)",
        "(line 1672,col 9)-(line 1674,col 9)",
        "(line 1675,col 9)-(line 1677,col 9)",
        "(line 1678,col 9)-(line 1678,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsOnly(java.lang.CharSequence, java.lang.String)",
      "begin_line": 1704,
      "end_line": 1709,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only certain characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code false}.\n     * A {@code null} valid character String will return {@code false}.\n     * An empty String (length()\u003d0) always returns {@code true}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsOnly(null, *)       \u003d false\n     * StringUtils.containsOnly(*, null)       \u003d false\n     * StringUtils.containsOnly(\"\", *)         \u003d true\n     * StringUtils.containsOnly(\"ab\", \"\")      \u003d false\n     * StringUtils.containsOnly(\"abab\", \"abc\") \u003d true\n     * StringUtils.containsOnly(\"ab1\", \"abc\")  \u003d false\n     * StringUtils.containsOnly(\"abz\", \"abc\")  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @param validChars  a String of valid chars, may be null\n     * @return true if it only contains valid chars and is non-null\n     * @since 2.0\n     * @since 3.0 Changed signature from containsOnly(String, String) to containsOnly(CharSequence, String)\n     ",
      "child_ranges": [
        "(line 1705,col 9)-(line 1707,col 9)",
        "(line 1708,col 9)-(line 1708,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsNone(java.lang.CharSequence, char...)",
      "begin_line": 1736,
      "end_line": 1764,
      "comment": "\n     * \u003cp\u003eChecks that the CharSequence does not contain certain characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code true}.\n     * A {@code null} invalid character array will return {@code true}.\n     * An empty CharSequence (length()\u003d0) always returns true.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsNone(null, *)       \u003d true\n     * StringUtils.containsNone(*, null)       \u003d true\n     * StringUtils.containsNone(\"\", *)         \u003d true\n     * StringUtils.containsNone(\"ab\", \u0027\u0027)      \u003d true\n     * StringUtils.containsNone(\"abab\", \u0027xyz\u0027) \u003d true\n     * StringUtils.containsNone(\"ab1\", \u0027xyz\u0027)  \u003d true\n     * StringUtils.containsNone(\"abz\", \u0027xyz\u0027)  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @param searchChars  an array of invalid chars, may be null\n     * @return true if it contains none of the invalid chars, or is null\n     * @since 2.0\n     * @since 3.0 Changed signature from containsNone(String, char[]) to containsNone(CharSequence, char...)\n     ",
      "child_ranges": [
        "(line 1737,col 9)-(line 1739,col 9)",
        "(line 1740,col 9)-(line 1740,col 32)",
        "(line 1741,col 9)-(line 1741,col 31)",
        "(line 1742,col 9)-(line 1742,col 43)",
        "(line 1743,col 9)-(line 1743,col 39)",
        "(line 1744,col 9)-(line 1762,col 9)",
        "(line 1763,col 9)-(line 1763,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsNone(java.lang.CharSequence, java.lang.String)",
      "begin_line": 1789,
      "end_line": 1794,
      "comment": "\n     * \u003cp\u003eChecks that the CharSequence does not contain certain characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code true}.\n     * A {@code null} invalid character array will return {@code true}.\n     * An empty String (\"\") always returns true.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsNone(null, *)       \u003d true\n     * StringUtils.containsNone(*, null)       \u003d true\n     * StringUtils.containsNone(\"\", *)         \u003d true\n     * StringUtils.containsNone(\"ab\", \"\")      \u003d true\n     * StringUtils.containsNone(\"abab\", \"xyz\") \u003d true\n     * StringUtils.containsNone(\"ab1\", \"xyz\")  \u003d true\n     * StringUtils.containsNone(\"abz\", \"xyz\")  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @param invalidChars  a String of invalid chars, may be null\n     * @return true if it contains none of the invalid chars, or is null\n     * @since 2.0\n     * @since 3.0 Changed signature from containsNone(String, String) to containsNone(CharSequence, String)\n     ",
      "child_ranges": [
        "(line 1790,col 9)-(line 1792,col 9)",
        "(line 1793,col 9)-(line 1793,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfAny(java.lang.CharSequence, java.lang.CharSequence...)",
      "begin_line": 1825,
      "end_line": 1851,
      "comment": "\n     * \u003cp\u003eFind the first index of any of a set of potential substrings.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\n     * A {@code null} or zero length search array will return {@code -1}.\n     * A {@code null} search array entry will be ignored, but a search\n     * array containing \"\" will return {@code 0} if {@code str} is not\n     * null. This method uses {@link String#indexOf(String)} if possible.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAny(null, *)                     \u003d -1\n     * StringUtils.indexOfAny(*, null)                     \u003d -1\n     * StringUtils.indexOfAny(*, [])                       \u003d -1\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"ab\",\"cd\"])   \u003d 2\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"cd\",\"ab\"])   \u003d 2\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"mn\",\"op\"])   \u003d -1\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"zab\",\"aby\"]) \u003d 1\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"\"])          \u003d 0\n     * StringUtils.indexOfAny(\"\", [\"\"])                    \u003d 0\n     * StringUtils.indexOfAny(\"\", [\"a\"])                   \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param str  the CharSequence to check, may be null\n     * @param searchStrs  the CharSequences to search for, may be null\n     * @return the first index of any of the searchStrs in str, -1 if no match\n     * @since 3.0 Changed signature from indexOfAny(String, String[]) to indexOfAny(CharSequence, CharSequence...)\n     ",
      "child_ranges": [
        "(line 1826,col 9)-(line 1828,col 9)",
        "(line 1829,col 9)-(line 1829,col 35)",
        "(line 1832,col 9)-(line 1832,col 36)",
        "(line 1834,col 9)-(line 1834,col 20)",
        "(line 1835,col 9)-(line 1848,col 9)",
        "(line 1850,col 9)-(line 1850,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastIndexOfAny(java.lang.CharSequence, java.lang.CharSequence...)",
      "begin_line": 1879,
      "end_line": 1897,
      "comment": "\n     * \u003cp\u003eFind the latest index of any of a set of potential substrings.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\n     * A {@code null} search array will return {@code -1}.\n     * A {@code null} or zero length search array entry will be ignored,\n     * but a search array containing \"\" will return the length of {@code str}\n     * if {@code str} is not null. This method uses {@link String#indexOf(String)} if possible\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOfAny(null, *)                   \u003d -1\n     * StringUtils.lastIndexOfAny(*, null)                   \u003d -1\n     * StringUtils.lastIndexOfAny(*, [])                     \u003d -1\n     * StringUtils.lastIndexOfAny(*, [null])                 \u003d -1\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"ab\",\"cd\"]) \u003d 6\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"cd\",\"ab\"]) \u003d 6\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"mn\",\"op\"]) \u003d -1\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"mn\",\"op\"]) \u003d -1\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"mn\",\"\"])   \u003d 10\n     * \u003c/pre\u003e\n     *\n     * @param str  the CharSequence to check, may be null\n     * @param searchStrs  the CharSequences to search for, may be null\n     * @return the last index of any of the CharSequences, -1 if no match\n     * @since 3.0 Changed signature from lastIndexOfAny(String, String[]) to lastIndexOfAny(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 1880,col 9)-(line 1882,col 9)",
        "(line 1883,col 9)-(line 1883,col 35)",
        "(line 1884,col 9)-(line 1884,col 34)",
        "(line 1885,col 9)-(line 1885,col 20)",
        "(line 1886,col 9)-(line 1895,col 9)",
        "(line 1896,col 9)-(line 1896,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substring(java.lang.String, int)",
      "begin_line": 1925,
      "end_line": 1943,
      "comment": "\n     * \u003cp\u003eGets a substring from the specified String avoiding exceptions.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative start position can be used to start {@code n}\n     * characters from the end of the String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} String will return {@code null}.\n     * An empty (\"\") String will return \"\".\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substring(null, *)   \u003d null\n     * StringUtils.substring(\"\", *)     \u003d \"\"\n     * StringUtils.substring(\"abc\", 0)  \u003d \"abc\"\n     * StringUtils.substring(\"abc\", 2)  \u003d \"c\"\n     * StringUtils.substring(\"abc\", 4)  \u003d \"\"\n     * StringUtils.substring(\"abc\", -2) \u003d \"bc\"\n     * StringUtils.substring(\"abc\", -4) \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the substring from, may be null\n     * @param start  the position to start from, negative means\n     *  count back from the end of the String by this many characters\n     * @return substring from start position, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 1926,col 9)-(line 1928,col 9)",
        "(line 1931,col 9)-(line 1933,col 9)",
        "(line 1935,col 9)-(line 1937,col 9)",
        "(line 1938,col 9)-(line 1940,col 9)",
        "(line 1942,col 9)-(line 1942,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substring(java.lang.String, int, int)",
      "begin_line": 1980,
      "end_line": 2011,
      "comment": "\n     * \u003cp\u003eGets a substring from the specified String avoiding exceptions.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative start position can be used to start/end {@code n}\n     * characters from the end of the String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe returned substring starts with the character in the {@code start}\n     * position and ends before the {@code end} position. All position counting is\n     * zero-based -- i.e., to start at the beginning of the string use\n     * {@code start \u003d 0}. Negative start and end positions can be used to\n     * specify offsets relative to the end of the String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf {@code start} is not strictly to the left of {@code end}, \"\"\n     * is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substring(null, *, *)    \u003d null\n     * StringUtils.substring(\"\", * ,  *)    \u003d \"\";\n     * StringUtils.substring(\"abc\", 0, 2)   \u003d \"ab\"\n     * StringUtils.substring(\"abc\", 2, 0)   \u003d \"\"\n     * StringUtils.substring(\"abc\", 2, 4)   \u003d \"c\"\n     * StringUtils.substring(\"abc\", 4, 6)   \u003d \"\"\n     * StringUtils.substring(\"abc\", 2, 2)   \u003d \"\"\n     * StringUtils.substring(\"abc\", -2, -1) \u003d \"b\"\n     * StringUtils.substring(\"abc\", -4, 2)  \u003d \"ab\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the substring from, may be null\n     * @param start  the position to start from, negative means\n     *  count back from the end of the String by this many characters\n     * @param end  the position to end at (exclusive), negative means\n     *  count back from the end of the String by this many characters\n     * @return substring from start position to end position,\n     *  {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 1981,col 9)-(line 1983,col 9)",
        "(line 1986,col 9)-(line 1988,col 9)",
        "(line 1989,col 9)-(line 1991,col 9)",
        "(line 1994,col 9)-(line 1996,col 9)",
        "(line 1999,col 9)-(line 2001,col 9)",
        "(line 2003,col 9)-(line 2005,col 9)",
        "(line 2006,col 9)-(line 2008,col 9)",
        "(line 2010,col 9)-(line 2010,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.left(java.lang.String, int)",
      "begin_line": 2035,
      "end_line": 2046,
      "comment": "\n     * \u003cp\u003eGets the leftmost {@code len} characters of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf {@code len} characters are not available, or the\n     * String is {@code null}, the String will be returned without\n     * an exception. An empty String is returned if len is negative.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.left(null, *)    \u003d null\n     * StringUtils.left(*, -ve)     \u003d \"\"\n     * StringUtils.left(\"\", *)      \u003d \"\"\n     * StringUtils.left(\"abc\", 0)   \u003d \"\"\n     * StringUtils.left(\"abc\", 2)   \u003d \"ab\"\n     * StringUtils.left(\"abc\", 4)   \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the leftmost characters from, may be null\n     * @param len  the length of the required String\n     * @return the leftmost characters, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 2036,col 9)-(line 2038,col 9)",
        "(line 2039,col 9)-(line 2041,col 9)",
        "(line 2042,col 9)-(line 2044,col 9)",
        "(line 2045,col 9)-(line 2045,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.right(java.lang.String, int)",
      "begin_line": 2068,
      "end_line": 2079,
      "comment": "\n     * \u003cp\u003eGets the rightmost {@code len} characters of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf {@code len} characters are not available, or the String\n     * is {@code null}, the String will be returned without an\n     * an exception. An empty String is returned if len is negative.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.right(null, *)    \u003d null\n     * StringUtils.right(*, -ve)     \u003d \"\"\n     * StringUtils.right(\"\", *)      \u003d \"\"\n     * StringUtils.right(\"abc\", 0)   \u003d \"\"\n     * StringUtils.right(\"abc\", 2)   \u003d \"bc\"\n     * StringUtils.right(\"abc\", 4)   \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the rightmost characters from, may be null\n     * @param len  the length of the required String\n     * @return the rightmost characters, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 2069,col 9)-(line 2071,col 9)",
        "(line 2072,col 9)-(line 2074,col 9)",
        "(line 2075,col 9)-(line 2077,col 9)",
        "(line 2078,col 9)-(line 2078,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.mid(java.lang.String, int, int)",
      "begin_line": 2106,
      "end_line": 2120,
      "comment": "\n     * \u003cp\u003eGets {@code len} characters from the middle of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf {@code len} characters are not available, the remainder\n     * of the String will be returned without an exception. If the\n     * String is {@code null}, {@code null} will be returned.\n     * An empty String is returned if len is negative or exceeds the\n     * length of {@code str}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.mid(null, *, *)    \u003d null\n     * StringUtils.mid(*, *, -ve)     \u003d \"\"\n     * StringUtils.mid(\"\", 0, *)      \u003d \"\"\n     * StringUtils.mid(\"abc\", 0, 2)   \u003d \"ab\"\n     * StringUtils.mid(\"abc\", 0, 4)   \u003d \"abc\"\n     * StringUtils.mid(\"abc\", 2, 4)   \u003d \"c\"\n     * StringUtils.mid(\"abc\", 4, 2)   \u003d \"\"\n     * StringUtils.mid(\"abc\", -2, 2)  \u003d \"ab\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the characters from, may be null\n     * @param pos  the position to start from, negative treated as zero\n     * @param len  the length of the required String\n     * @return the middle characters, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 2107,col 9)-(line 2109,col 9)",
        "(line 2110,col 9)-(line 2112,col 9)",
        "(line 2113,col 9)-(line 2115,col 9)",
        "(line 2116,col 9)-(line 2118,col 9)",
        "(line 2119,col 9)-(line 2119,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringBefore(java.lang.String, java.lang.String)",
      "begin_line": 2151,
      "end_line": 2163,
      "comment": "\n     * \u003cp\u003eGets the substring before the first occurrence of a separator.\n     * The separator is not returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} string input will return {@code null}.\n     * An empty (\"\") string input will return the empty string.\n     * A {@code null} separator will return the input string.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf nothing is found, the string input is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringBefore(null, *)      \u003d null\n     * StringUtils.substringBefore(\"\", *)        \u003d \"\"\n     * StringUtils.substringBefore(\"abc\", \"a\")   \u003d \"\"\n     * StringUtils.substringBefore(\"abcba\", \"b\") \u003d \"a\"\n     * StringUtils.substringBefore(\"abc\", \"c\")   \u003d \"ab\"\n     * StringUtils.substringBefore(\"abc\", \"d\")   \u003d \"abc\"\n     * StringUtils.substringBefore(\"abc\", \"\")    \u003d \"\"\n     * StringUtils.substringBefore(\"abc\", null)  \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get a substring from, may be null\n     * @param separator  the String to search for, may be null\n     * @return the substring before the first occurrence of the separator,\n     *  {@code null} if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2152,col 9)-(line 2154,col 9)",
        "(line 2155,col 9)-(line 2157,col 9)",
        "(line 2158,col 9)-(line 2158,col 41)",
        "(line 2159,col 9)-(line 2161,col 9)",
        "(line 2162,col 9)-(line 2162,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringAfter(java.lang.String, java.lang.String)",
      "begin_line": 2193,
      "end_line": 2205,
      "comment": "\n     * \u003cp\u003eGets the substring after the first occurrence of a separator.\n     * The separator is not returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} string input will return {@code null}.\n     * An empty (\"\") string input will return the empty string.\n     * A {@code null} separator will return the empty string if the\n     * input string is not {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf nothing is found, the empty string is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringAfter(null, *)      \u003d null\n     * StringUtils.substringAfter(\"\", *)        \u003d \"\"\n     * StringUtils.substringAfter(*, null)      \u003d \"\"\n     * StringUtils.substringAfter(\"abc\", \"a\")   \u003d \"bc\"\n     * StringUtils.substringAfter(\"abcba\", \"b\") \u003d \"cba\"\n     * StringUtils.substringAfter(\"abc\", \"c\")   \u003d \"\"\n     * StringUtils.substringAfter(\"abc\", \"d\")   \u003d \"\"\n     * StringUtils.substringAfter(\"abc\", \"\")    \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get a substring from, may be null\n     * @param separator  the String to search for, may be null\n     * @return the substring after the first occurrence of the separator,\n     *  {@code null} if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2194,col 9)-(line 2196,col 9)",
        "(line 2197,col 9)-(line 2199,col 9)",
        "(line 2200,col 9)-(line 2200,col 41)",
        "(line 2201,col 9)-(line 2203,col 9)",
        "(line 2204,col 9)-(line 2204,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringBeforeLast(java.lang.String, java.lang.String)",
      "begin_line": 2234,
      "end_line": 2243,
      "comment": "\n     * \u003cp\u003eGets the substring before the last occurrence of a separator.\n     * The separator is not returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} string input will return {@code null}.\n     * An empty (\"\") string input will return the empty string.\n     * An empty or {@code null} separator will return the input string.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf nothing is found, the string input is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringBeforeLast(null, *)      \u003d null\n     * StringUtils.substringBeforeLast(\"\", *)        \u003d \"\"\n     * StringUtils.substringBeforeLast(\"abcba\", \"b\") \u003d \"abc\"\n     * StringUtils.substringBeforeLast(\"abc\", \"c\")   \u003d \"ab\"\n     * StringUtils.substringBeforeLast(\"a\", \"a\")     \u003d \"\"\n     * StringUtils.substringBeforeLast(\"a\", \"z\")     \u003d \"a\"\n     * StringUtils.substringBeforeLast(\"a\", null)    \u003d \"a\"\n     * StringUtils.substringBeforeLast(\"a\", \"\")      \u003d \"a\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get a substring from, may be null\n     * @param separator  the String to search for, may be null\n     * @return the substring before the last occurrence of the separator,\n     *  {@code null} if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2235,col 9)-(line 2237,col 9)",
        "(line 2238,col 9)-(line 2238,col 45)",
        "(line 2239,col 9)-(line 2241,col 9)",
        "(line 2242,col 9)-(line 2242,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringAfterLast(java.lang.String, java.lang.String)",
      "begin_line": 2274,
      "end_line": 2286,
      "comment": "\n     * \u003cp\u003eGets the substring after the last occurrence of a separator.\n     * The separator is not returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} string input will return {@code null}.\n     * An empty (\"\") string input will return the empty string.\n     * An empty or {@code null} separator will return the empty string if\n     * the input string is not {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf nothing is found, the empty string is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringAfterLast(null, *)      \u003d null\n     * StringUtils.substringAfterLast(\"\", *)        \u003d \"\"\n     * StringUtils.substringAfterLast(*, \"\")        \u003d \"\"\n     * StringUtils.substringAfterLast(*, null)      \u003d \"\"\n     * StringUtils.substringAfterLast(\"abc\", \"a\")   \u003d \"bc\"\n     * StringUtils.substringAfterLast(\"abcba\", \"b\") \u003d \"a\"\n     * StringUtils.substringAfterLast(\"abc\", \"c\")   \u003d \"\"\n     * StringUtils.substringAfterLast(\"a\", \"a\")     \u003d \"\"\n     * StringUtils.substringAfterLast(\"a\", \"z\")     \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get a substring from, may be null\n     * @param separator  the String to search for, may be null\n     * @return the substring after the last occurrence of the separator,\n     *  {@code null} if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2275,col 9)-(line 2277,col 9)",
        "(line 2278,col 9)-(line 2280,col 9)",
        "(line 2281,col 9)-(line 2281,col 45)",
        "(line 2282,col 9)-(line 2284,col 9)",
        "(line 2285,col 9)-(line 2285,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringBetween(java.lang.String, java.lang.String)",
      "begin_line": 2311,
      "end_line": 2313,
      "comment": "\n     * \u003cp\u003eGets the String that is nested in between two instances of the\n     * same String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * A {@code null} tag returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringBetween(null, *)            \u003d null\n     * StringUtils.substringBetween(\"\", \"\")             \u003d \"\"\n     * StringUtils.substringBetween(\"\", \"tag\")          \u003d null\n     * StringUtils.substringBetween(\"tagabctag\", null)  \u003d null\n     * StringUtils.substringBetween(\"tagabctag\", \"\")    \u003d \"\"\n     * StringUtils.substringBetween(\"tagabctag\", \"tag\") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String containing the substring, may be null\n     * @param tag  the String before and after the substring, may be null\n     * @return the substring, {@code null} if no match\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2312,col 9)-(line 2312,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringBetween(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 2342,
      "end_line": 2354,
      "comment": "\n     * \u003cp\u003eGets the String that is nested in between two Strings.\n     * Only the first match is returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * A {@code null} open/close returns {@code null} (no match).\n     * An empty (\"\") open and close returns an empty string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringBetween(\"wx[b]yz\", \"[\", \"]\") \u003d \"b\"\n     * StringUtils.substringBetween(null, *, *)          \u003d null\n     * StringUtils.substringBetween(*, null, *)          \u003d null\n     * StringUtils.substringBetween(*, *, null)          \u003d null\n     * StringUtils.substringBetween(\"\", \"\", \"\")          \u003d \"\"\n     * StringUtils.substringBetween(\"\", \"\", \"]\")         \u003d null\n     * StringUtils.substringBetween(\"\", \"[\", \"]\")        \u003d null\n     * StringUtils.substringBetween(\"yabcz\", \"\", \"\")     \u003d \"\"\n     * StringUtils.substringBetween(\"yabcz\", \"y\", \"z\")   \u003d \"abc\"\n     * StringUtils.substringBetween(\"yabczyabcz\", \"y\", \"z\")   \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String containing the substring, may be null\n     * @param open  the String before the substring, may be null\n     * @param close  the String after the substring, may be null\n     * @return the substring, {@code null} if no match\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2343,col 9)-(line 2345,col 9)",
        "(line 2346,col 9)-(line 2346,col 38)",
        "(line 2347,col 9)-(line 2352,col 9)",
        "(line 2353,col 9)-(line 2353,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringsBetween(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 2378,
      "end_line": 2407,
      "comment": "\n     * \u003cp\u003eSearches a String for substrings delimited by a start and end tag,\n     * returning all matching substrings in an array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * A {@code null} open/close returns {@code null} (no match).\n     * An empty (\"\") open/close returns {@code null} (no match).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringsBetween(\"[a][b][c]\", \"[\", \"]\") \u003d [\"a\",\"b\",\"c\"]\n     * StringUtils.substringsBetween(null, *, *)            \u003d null\n     * StringUtils.substringsBetween(*, null, *)            \u003d null\n     * StringUtils.substringsBetween(*, *, null)            \u003d null\n     * StringUtils.substringsBetween(\"\", \"[\", \"]\")          \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param str  the String containing the substrings, null returns null, empty returns empty\n     * @param open  the String identifying the start of the substring, empty returns null\n     * @param close  the String identifying the end of the substring, empty returns null\n     * @return a String Array of substrings, or {@code null} if no match\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 2379,col 9)-(line 2381,col 9)",
        "(line 2382,col 9)-(line 2382,col 34)",
        "(line 2383,col 9)-(line 2385,col 9)",
        "(line 2386,col 9)-(line 2386,col 38)",
        "(line 2387,col 9)-(line 2387,col 36)",
        "(line 2388,col 9)-(line 2388,col 52)",
        "(line 2389,col 9)-(line 2389,col 20)",
        "(line 2390,col 9)-(line 2402,col 9)",
        "(line 2403,col 9)-(line 2405,col 9)",
        "(line 2406,col 9)-(line 2406,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.split(java.lang.String)",
      "begin_line": 2436,
      "end_line": 2438,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, using whitespace as the\n     * separator.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as one separator.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.split(null)       \u003d null\n     * StringUtils.split(\"\")         \u003d []\n     * StringUtils.split(\"abc def\")  \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\"abc  def\") \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\" abc \")    \u003d [\"abc\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @return an array of parsed Strings, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 2437,col 9)-(line 2437,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.split(java.lang.String, char)",
      "begin_line": 2464,
      "end_line": 2466,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator specified.\n     * This is an alternative to using StringTokenizer.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as one separator.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.split(null, *)         \u003d null\n     * StringUtils.split(\"\", *)           \u003d []\n     * StringUtils.split(\"a.b.c\", \u0027.\u0027)    \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.split(\"a..b.c\", \u0027.\u0027)   \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.split(\"a:b:c\", \u0027.\u0027)    \u003d [\"a:b:c\"]\n     * StringUtils.split(\"a b c\", \u0027 \u0027)    \u003d [\"a\", \"b\", \"c\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separatorChar  the character used as the delimiter\n     * @return an array of parsed Strings, {@code null} if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2465,col 9)-(line 2465,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.split(java.lang.String, java.lang.String)",
      "begin_line": 2493,
      "end_line": 2495,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separators specified.\n     * This is an alternative to using StringTokenizer.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as one separator.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * A {@code null} separatorChars splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.split(null, *)         \u003d null\n     * StringUtils.split(\"\", *)           \u003d []\n     * StringUtils.split(\"abc def\", null) \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\"abc def\", \" \")  \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\"abc  def\", \" \") \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\"ab:cd:ef\", \":\") \u003d [\"ab\", \"cd\", \"ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separatorChars  the characters used as the delimiters,\n     *  {@code null} splits on whitespace\n     * @return an array of parsed Strings, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 2494,col 9)-(line 2494,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.split(java.lang.String, java.lang.String, int)",
      "begin_line": 2527,
      "end_line": 2529,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array with a maximum length,\n     * separators specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as one separator.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * A {@code null} separatorChars splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf more than {@code max} delimited substrings are found, the last\n     * returned string includes all characters after the first {@code max - 1}\n     * returned strings (including separator characters).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.split(null, *, *)            \u003d null\n     * StringUtils.split(\"\", *, *)              \u003d []\n     * StringUtils.split(\"ab cd ef\", null, 0)   \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.split(\"ab   cd ef\", null, 0) \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.split(\"ab:cd:ef\", \":\", 0)    \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.split(\"ab:cd:ef\", \":\", 2)    \u003d [\"ab\", \"cd:ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separatorChars  the characters used as the delimiters,\n     *  {@code null} splits on whitespace\n     * @param max  the maximum number of elements to include in the\n     *  array. A zero or negative value implies no limit\n     * @return an array of parsed Strings, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 2528,col 9)-(line 2528,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByWholeSeparator(java.lang.String, java.lang.String)",
      "begin_line": 2554,
      "end_line": 2556,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator string specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator(s) will not be included in the returned String array.\n     * Adjacent separators are treated as one separator.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * A {@code null} separator splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitByWholeSeparator(null, *)               \u003d null\n     * StringUtils.splitByWholeSeparator(\"\", *)                 \u003d []\n     * StringUtils.splitByWholeSeparator(\"ab de fg\", null)      \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparator(\"ab   de fg\", null)    \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparator(\"ab:cd:ef\", \":\")       \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitByWholeSeparator(\"ab-!-cd-!-ef\", \"-!-\") \u003d [\"ab\", \"cd\", \"ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separator  String containing the String to be used as a delimiter,\n     *  {@code null} splits on whitespace\n     * @return an array of parsed Strings, {@code null} if null String was input\n     ",
      "child_ranges": [
        "(line 2555,col 9)-(line 2555,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByWholeSeparator(java.lang.String, java.lang.String, int)",
      "begin_line": 2585,
      "end_line": 2587,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator string specified.\n     * Returns a maximum of {@code max} substrings.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator(s) will not be included in the returned String array.\n     * Adjacent separators are treated as one separator.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * A {@code null} separator splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitByWholeSeparator(null, *, *)               \u003d null\n     * StringUtils.splitByWholeSeparator(\"\", *, *)                 \u003d []\n     * StringUtils.splitByWholeSeparator(\"ab de fg\", null, 0)      \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparator(\"ab   de fg\", null, 0)    \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparator(\"ab:cd:ef\", \":\", 2)       \u003d [\"ab\", \"cd:ef\"]\n     * StringUtils.splitByWholeSeparator(\"ab-!-cd-!-ef\", \"-!-\", 5) \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitByWholeSeparator(\"ab-!-cd-!-ef\", \"-!-\", 2) \u003d [\"ab\", \"cd-!-ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separator  String containing the String to be used as a delimiter,\n     *  {@code null} splits on whitespace\n     * @param max  the maximum number of elements to include in the returned\n     *  array. A zero or negative value implies no limit.\n     * @return an array of parsed Strings, {@code null} if null String was input\n     ",
      "child_ranges": [
        "(line 2586,col 9)-(line 2586,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(java.lang.String, java.lang.String)",
      "begin_line": 2614,
      "end_line": 2616,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator string specified. \u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * A {@code null} separator splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(null, *)               \u003d null\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"\", *)                 \u003d []\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab de fg\", null)      \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab   de fg\", null)    \u003d [\"ab\", \"\", \"\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab:cd:ef\", \":\")       \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab-!-cd-!-ef\", \"-!-\") \u003d [\"ab\", \"cd\", \"ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separator  String containing the String to be used as a delimiter,\n     *  {@code null} splits on whitespace\n     * @return an array of parsed Strings, {@code null} if null String was input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 2615,col 9)-(line 2615,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(java.lang.String, java.lang.String, int)",
      "begin_line": 2647,
      "end_line": 2649,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator string specified.\n     * Returns a maximum of {@code max} substrings.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * A {@code null} separator splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(null, *, *)               \u003d null\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"\", *, *)                 \u003d []\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab de fg\", null, 0)      \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab   de fg\", null, 0)    \u003d [\"ab\", \"\", \"\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab:cd:ef\", \":\", 2)       \u003d [\"ab\", \"cd:ef\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab-!-cd-!-ef\", \"-!-\", 5) \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab-!-cd-!-ef\", \"-!-\", 2) \u003d [\"ab\", \"cd-!-ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separator  String containing the String to be used as a delimiter,\n     *  {@code null} splits on whitespace\n     * @param max  the maximum number of elements to include in the returned\n     *  array. A zero or negative value implies no limit.\n     * @return an array of parsed Strings, {@code null} if null String was input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 2648,col 9)-(line 2648,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByWholeSeparatorWorker(java.lang.String, java.lang.String, int, boolean)",
      "begin_line": 2665,
      "end_line": 2729,
      "comment": "\n     * Performs the logic for the {@code splitByWholeSeparatorPreserveAllTokens} methods.\n     *\n     * @param str  the String to parse, may be {@code null}\n     * @param separator  String containing the String to be used as a delimiter,\n     *  {@code null} splits on whitespace\n     * @param max  the maximum number of elements to include in the returned\n     *  array. A zero or negative value implies no limit.\n     * @param preserveAllTokens if {@code true}, adjacent separators are\n     * treated as empty token separators; if {@code false}, adjacent\n     * separators are treated as one separator.\n     * @return an array of parsed Strings, {@code null} if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 2667,col 9)-(line 2669,col 9)",
        "(line 2671,col 9)-(line 2671,col 31)",
        "(line 2673,col 9)-(line 2675,col 9)",
        "(line 2677,col 9)-(line 2680,col 9)",
        "(line 2682,col 9)-(line 2682,col 49)",
        "(line 2684,col 9)-(line 2684,col 63)",
        "(line 2685,col 9)-(line 2685,col 35)",
        "(line 2686,col 9)-(line 2686,col 20)",
        "(line 2687,col 9)-(line 2687,col 20)",
        "(line 2688,col 9)-(line 2726,col 9)",
        "(line 2728,col 9)-(line 2728,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(java.lang.String)",
      "begin_line": 2756,
      "end_line": 2758,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, using whitespace as the\n     * separator, preserving all tokens, including empty tokens created by\n     * adjacent separators. This is an alternative to using StringTokenizer.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitPreserveAllTokens(null)       \u003d null\n     * StringUtils.splitPreserveAllTokens(\"\")         \u003d []\n     * StringUtils.splitPreserveAllTokens(\"abc def\")  \u003d [\"abc\", \"def\"]\n     * StringUtils.splitPreserveAllTokens(\"abc  def\") \u003d [\"abc\", \"\", \"def\"]\n     * StringUtils.splitPreserveAllTokens(\" abc \")    \u003d [\"\", \"abc\", \"\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be {@code null}\n     * @return an array of parsed Strings, {@code null} if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2757,col 9)-(line 2757,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(java.lang.String, char)",
      "begin_line": 2792,
      "end_line": 2794,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator specified,\n     * preserving all tokens, including empty tokens created by adjacent\n     * separators. This is an alternative to using StringTokenizer.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitPreserveAllTokens(null, *)         \u003d null\n     * StringUtils.splitPreserveAllTokens(\"\", *)           \u003d []\n     * StringUtils.splitPreserveAllTokens(\"a.b.c\", \u0027.\u0027)    \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"a..b.c\", \u0027.\u0027)   \u003d [\"a\", \"\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"a:b:c\", \u0027.\u0027)    \u003d [\"a:b:c\"]\n     * StringUtils.splitPreserveAllTokens(\"a\\tb\\nc\", null) \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"a b c\", \u0027 \u0027)    \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"a b c \", \u0027 \u0027)   \u003d [\"a\", \"b\", \"c\", \"\"]\n     * StringUtils.splitPreserveAllTokens(\"a b c  \", \u0027 \u0027)   \u003d [\"a\", \"b\", \"c\", \"\", \"\"]\n     * StringUtils.splitPreserveAllTokens(\" a b c\", \u0027 \u0027)   \u003d [\"\", a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"  a b c\", \u0027 \u0027)  \u003d [\"\", \"\", a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\" a b c \", \u0027 \u0027)  \u003d [\"\", a\", \"b\", \"c\", \"\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be {@code null}\n     * @param separatorChar  the character used as the delimiter,\n     *  {@code null} splits on whitespace\n     * @return an array of parsed Strings, {@code null} if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2793,col 9)-(line 2793,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitWorker(java.lang.String, char, boolean)",
      "begin_line": 2808,
      "end_line": 2840,
      "comment": "\n     * Performs the logic for the {@code split} and\n     * {@code splitPreserveAllTokens} methods that do not return a\n     * maximum array length.\n     *\n     * @param str  the String to parse, may be {@code null}\n     * @param separatorChar the separate character\n     * @param preserveAllTokens if {@code true}, adjacent separators are\n     * treated as empty token separators; if {@code false}, adjacent\n     * separators are treated as one separator.\n     * @return an array of parsed Strings, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 2811,col 9)-(line 2813,col 9)",
        "(line 2814,col 9)-(line 2814,col 31)",
        "(line 2815,col 9)-(line 2817,col 9)",
        "(line 2818,col 9)-(line 2818,col 52)",
        "(line 2819,col 9)-(line 2819,col 29)",
        "(line 2820,col 9)-(line 2820,col 30)",
        "(line 2821,col 9)-(line 2821,col 34)",
        "(line 2822,col 9)-(line 2835,col 9)",
        "(line 2836,col 9)-(line 2838,col 9)",
        "(line 2839,col 9)-(line 2839,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(java.lang.String, java.lang.String)",
      "begin_line": 2875,
      "end_line": 2877,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separators specified,\n     * preserving all tokens, including empty tokens created by adjacent\n     * separators. This is an alternative to using StringTokenizer.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * A {@code null} separatorChars splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitPreserveAllTokens(null, *)           \u003d null\n     * StringUtils.splitPreserveAllTokens(\"\", *)             \u003d []\n     * StringUtils.splitPreserveAllTokens(\"abc def\", null)   \u003d [\"abc\", \"def\"]\n     * StringUtils.splitPreserveAllTokens(\"abc def\", \" \")    \u003d [\"abc\", \"def\"]\n     * StringUtils.splitPreserveAllTokens(\"abc  def\", \" \")   \u003d [\"abc\", \"\", def\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef\", \":\")   \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef:\", \":\")  \u003d [\"ab\", \"cd\", \"ef\", \"\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef::\", \":\") \u003d [\"ab\", \"cd\", \"ef\", \"\", \"\"]\n     * StringUtils.splitPreserveAllTokens(\"ab::cd:ef\", \":\")  \u003d [\"ab\", \"\", cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\":cd:ef\", \":\")     \u003d [\"\", cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"::cd:ef\", \":\")    \u003d [\"\", \"\", cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\":cd:ef:\", \":\")    \u003d [\"\", cd\", \"ef\", \"\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be {@code null}\n     * @param separatorChars  the characters used as the delimiters,\n     *  {@code null} splits on whitespace\n     * @return an array of parsed Strings, {@code null} if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2876,col 9)-(line 2876,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(java.lang.String, java.lang.String, int)",
      "begin_line": 2915,
      "end_line": 2917,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array with a maximum length,\n     * separators specified, preserving all tokens, including empty tokens\n     * created by adjacent separators.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * Adjacent separators are treated as one separator.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * A {@code null} separatorChars splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf more than {@code max} delimited substrings are found, the last\n     * returned string includes all characters after the first {@code max - 1}\n     * returned strings (including separator characters).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitPreserveAllTokens(null, *, *)            \u003d null\n     * StringUtils.splitPreserveAllTokens(\"\", *, *)              \u003d []\n     * StringUtils.splitPreserveAllTokens(\"ab de fg\", null, 0)   \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab   de fg\", null, 0) \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef\", \":\", 0)    \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef\", \":\", 2)    \u003d [\"ab\", \"cd:ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab   de fg\", null, 2) \u003d [\"ab\", \"  de fg\"]\n     * StringUtils.splitPreserveAllTokens(\"ab   de fg\", null, 3) \u003d [\"ab\", \"\", \" de fg\"]\n     * StringUtils.splitPreserveAllTokens(\"ab   de fg\", null, 4) \u003d [\"ab\", \"\", \"\", \"de fg\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be {@code null}\n     * @param separatorChars  the characters used as the delimiters,\n     *  {@code null} splits on whitespace\n     * @param max  the maximum number of elements to include in the\n     *  array. A zero or negative value implies no limit\n     * @return an array of parsed Strings, {@code null} if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2916,col 9)-(line 2916,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitWorker(java.lang.String, java.lang.String, int, boolean)",
      "begin_line": 2933,
      "end_line": 3016,
      "comment": "\n     * Performs the logic for the {@code split} and\n     * {@code splitPreserveAllTokens} methods that return a maximum array\n     * length.\n     *\n     * @param str  the String to parse, may be {@code null}\n     * @param separatorChars the separate character\n     * @param max  the maximum number of elements to include in the\n     *  array. A zero or negative value implies no limit.\n     * @param preserveAllTokens if {@code true}, adjacent separators are\n     * treated as empty token separators; if {@code false}, adjacent\n     * separators are treated as one separator.\n     * @return an array of parsed Strings, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 2938,col 9)-(line 2940,col 9)",
        "(line 2941,col 9)-(line 2941,col 31)",
        "(line 2942,col 9)-(line 2944,col 9)",
        "(line 2945,col 9)-(line 2945,col 52)",
        "(line 2946,col 9)-(line 2946,col 26)",
        "(line 2947,col 9)-(line 2947,col 29)",
        "(line 2948,col 9)-(line 2948,col 30)",
        "(line 2949,col 9)-(line 2949,col 34)",
        "(line 2950,col 9)-(line 3011,col 9)",
        "(line 3012,col 9)-(line 3014,col 9)",
        "(line 3015,col 9)-(line 3015,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByCharacterType(java.lang.String)",
      "begin_line": 3037,
      "end_line": 3039,
      "comment": "\n     * \u003cp\u003eSplits a String by Character type as returned by\n     * {@code java.lang.Character.getType(char)}. Groups of contiguous\n     * characters of the same type are returned as complete tokens.\n     * \u003cpre\u003e\n     * StringUtils.splitByCharacterType(null)         \u003d null\n     * StringUtils.splitByCharacterType(\"\")           \u003d []\n     * StringUtils.splitByCharacterType(\"ab de fg\")   \u003d [\"ab\", \" \", \"de\", \" \", \"fg\"]\n     * StringUtils.splitByCharacterType(\"ab   de fg\") \u003d [\"ab\", \"   \", \"de\", \" \", \"fg\"]\n     * StringUtils.splitByCharacterType(\"ab:cd:ef\")   \u003d [\"ab\", \":\", \"cd\", \":\", \"ef\"]\n     * StringUtils.splitByCharacterType(\"number5\")    \u003d [\"number\", \"5\"]\n     * StringUtils.splitByCharacterType(\"fooBar\")     \u003d [\"foo\", \"B\", \"ar\"]\n     * StringUtils.splitByCharacterType(\"foo200Bar\")  \u003d [\"foo\", \"200\", \"B\", \"ar\"]\n     * StringUtils.splitByCharacterType(\"ASFRules\")   \u003d [\"ASFR\", \"ules\"]\n     * \u003c/pre\u003e\n     * @param str the String to split, may be {@code null}\n     * @return an array of parsed Strings, {@code null} if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3038,col 9)-(line 3038,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase(java.lang.String)",
      "begin_line": 3065,
      "end_line": 3067,
      "comment": "\n     * \u003cp\u003eSplits a String by Character type as returned by\n     * {@code java.lang.Character.getType(char)}. Groups of contiguous\n     * characters of the same type are returned as complete tokens, with the\n     * following exception: the character of type\n     * {@code Character.UPPERCASE_LETTER}, if any, immediately\n     * preceding a token of type {@code Character.LOWERCASE_LETTER}\n     * will belong to the following token rather than to the preceding, if any,\n     * {@code Character.UPPERCASE_LETTER} token.\n     * \u003cpre\u003e\n     * StringUtils.splitByCharacterTypeCamelCase(null)         \u003d null\n     * StringUtils.splitByCharacterTypeCamelCase(\"\")           \u003d []\n     * StringUtils.splitByCharacterTypeCamelCase(\"ab de fg\")   \u003d [\"ab\", \" \", \"de\", \" \", \"fg\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"ab   de fg\") \u003d [\"ab\", \"   \", \"de\", \" \", \"fg\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"ab:cd:ef\")   \u003d [\"ab\", \":\", \"cd\", \":\", \"ef\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"number5\")    \u003d [\"number\", \"5\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"fooBar\")     \u003d [\"foo\", \"Bar\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"foo200Bar\")  \u003d [\"foo\", \"200\", \"Bar\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"ASFRules\")   \u003d [\"ASF\", \"Rules\"]\n     * \u003c/pre\u003e\n     * @param str the String to split, may be {@code null}\n     * @return an array of parsed Strings, {@code null} if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3066,col 9)-(line 3066,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByCharacterType(java.lang.String, boolean)",
      "begin_line": 3083,
      "end_line": 3113,
      "comment": "\n     * \u003cp\u003eSplits a String by Character type as returned by\n     * {@code java.lang.Character.getType(char)}. Groups of contiguous\n     * characters of the same type are returned as complete tokens, with the\n     * following exception: if {@code camelCase} is {@code true},\n     * the character of type {@code Character.UPPERCASE_LETTER}, if any,\n     * immediately preceding a token of type {@code Character.LOWERCASE_LETTER}\n     * will belong to the following token rather than to the preceding, if any,\n     * {@code Character.UPPERCASE_LETTER} token.\n     * @param str the String to split, may be {@code null}\n     * @param camelCase whether to use so-called \"camel-case\" for letter types\n     * @return an array of parsed Strings, {@code null} if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3084,col 9)-(line 3086,col 9)",
        "(line 3087,col 9)-(line 3089,col 9)",
        "(line 3090,col 9)-(line 3090,col 37)",
        "(line 3091,col 9)-(line 3091,col 52)",
        "(line 3092,col 9)-(line 3092,col 27)",
        "(line 3093,col 9)-(line 3093,col 59)",
        "(line 3094,col 9)-(line 3110,col 9)",
        "(line 3111,col 9)-(line 3111,col 67)",
        "(line 3112,col 9)-(line 3112,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(T...)",
      "begin_line": 3139,
      "end_line": 3141,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo separator is added to the joined String.\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null)            \u003d null\n     * StringUtils.join([])              \u003d \"\"\n     * StringUtils.join([null])          \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"]) \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"]) \u003d \"a\"\n     * \u003c/pre\u003e\n     *\n     * @param \u003cT\u003e the specific type of values to join together\n     * @param elements  the values to join together, may be null\n     * @return the joined String, {@code null} if null array input\n     * @since 2.0\n     * @since 3.0 Changed signature to use varargs\n     ",
      "child_ranges": [
        "(line 3140,col 9)-(line 3140,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.lang.Object[], char)",
      "begin_line": 3165,
      "end_line": 3170,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null, *)               \u003d null\n     * StringUtils.join([], *)                 \u003d \"\"\n     * StringUtils.join([null], *)             \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \u0027;\u0027)  \u003d \"a;b;c\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], null) \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"], \u0027;\u0027)  \u003d \";;a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to join together, may be null\n     * @param separator  the separator character to use\n     * @return the joined String, {@code null} if null array input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 3166,col 9)-(line 3168,col 9)",
        "(line 3169,col 9)-(line 3169,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(long[], char)",
      "begin_line": 3197,
      "end_line": 3202,
      "comment": "\n     * \u003cp\u003e\n     * Joins the elements of the provided array into a single String containing the provided list of elements.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented\n     * by empty strings.\n     * \u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * StringUtils.join(null, *)               \u003d null\n     * StringUtils.join([], *)                 \u003d \"\"\n     * StringUtils.join([null], *)             \u003d \"\"\n     * StringUtils.join([1, 2, 3], \u0027;\u0027)  \u003d \"1;2;3\"\n     * StringUtils.join([1, 2, 3], null) \u003d \"123\"\n     * \u003c/pre\u003e\n     * \n     * @param array\n     *            the array of values to join together, may be null\n     * @param separator\n     *            the separator character to use\n     * @return the joined String, {@code null} if null array input\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 3198,col 9)-(line 3200,col 9)",
        "(line 3201,col 9)-(line 3201,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(int[], char)",
      "begin_line": 3229,
      "end_line": 3234,
      "comment": "\n     * \u003cp\u003e\n     * Joins the elements of the provided array into a single String containing the provided list of elements.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented\n     * by empty strings.\n     * \u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * StringUtils.join(null, *)               \u003d null\n     * StringUtils.join([], *)                 \u003d \"\"\n     * StringUtils.join([null], *)             \u003d \"\"\n     * StringUtils.join([1, 2, 3], \u0027;\u0027)  \u003d \"1;2;3\"\n     * StringUtils.join([1, 2, 3], null) \u003d \"123\"\n     * \u003c/pre\u003e\n     * \n     * @param array\n     *            the array of values to join together, may be null\n     * @param separator\n     *            the separator character to use\n     * @return the joined String, {@code null} if null array input\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 3230,col 9)-(line 3232,col 9)",
        "(line 3233,col 9)-(line 3233,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(short[], char)",
      "begin_line": 3261,
      "end_line": 3266,
      "comment": "\n     * \u003cp\u003e\n     * Joins the elements of the provided array into a single String containing the provided list of elements.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented\n     * by empty strings.\n     * \u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * StringUtils.join(null, *)               \u003d null\n     * StringUtils.join([], *)                 \u003d \"\"\n     * StringUtils.join([null], *)             \u003d \"\"\n     * StringUtils.join([1, 2, 3], \u0027;\u0027)  \u003d \"1;2;3\"\n     * StringUtils.join([1, 2, 3], null) \u003d \"123\"\n     * \u003c/pre\u003e\n     * \n     * @param array\n     *            the array of values to join together, may be null\n     * @param separator\n     *            the separator character to use\n     * @return the joined String, {@code null} if null array input\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 3262,col 9)-(line 3264,col 9)",
        "(line 3265,col 9)-(line 3265,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(byte[], char)",
      "begin_line": 3293,
      "end_line": 3298,
      "comment": "\n     * \u003cp\u003e\n     * Joins the elements of the provided array into a single String containing the provided list of elements.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented\n     * by empty strings.\n     * \u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * StringUtils.join(null, *)               \u003d null\n     * StringUtils.join([], *)                 \u003d \"\"\n     * StringUtils.join([null], *)             \u003d \"\"\n     * StringUtils.join([1, 2, 3], \u0027;\u0027)  \u003d \"1;2;3\"\n     * StringUtils.join([1, 2, 3], null) \u003d \"123\"\n     * \u003c/pre\u003e\n     * \n     * @param array\n     *            the array of values to join together, may be null\n     * @param separator\n     *            the separator character to use\n     * @return the joined String, {@code null} if null array input\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 3294,col 9)-(line 3296,col 9)",
        "(line 3297,col 9)-(line 3297,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(char[], char)",
      "begin_line": 3325,
      "end_line": 3330,
      "comment": "\n     * \u003cp\u003e\n     * Joins the elements of the provided array into a single String containing the provided list of elements.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented\n     * by empty strings.\n     * \u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * StringUtils.join(null, *)               \u003d null\n     * StringUtils.join([], *)                 \u003d \"\"\n     * StringUtils.join([null], *)             \u003d \"\"\n     * StringUtils.join([1, 2, 3], \u0027;\u0027)  \u003d \"1;2;3\"\n     * StringUtils.join([1, 2, 3], null) \u003d \"123\"\n     * \u003c/pre\u003e\n     * \n     * @param array\n     *            the array of values to join together, may be null\n     * @param separator\n     *            the separator character to use\n     * @return the joined String, {@code null} if null array input\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 3326,col 9)-(line 3328,col 9)",
        "(line 3329,col 9)-(line 3329,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(float[], char)",
      "begin_line": 3357,
      "end_line": 3362,
      "comment": "\n     * \u003cp\u003e\n     * Joins the elements of the provided array into a single String containing the provided list of elements.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented\n     * by empty strings.\n     * \u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * StringUtils.join(null, *)               \u003d null\n     * StringUtils.join([], *)                 \u003d \"\"\n     * StringUtils.join([null], *)             \u003d \"\"\n     * StringUtils.join([1, 2, 3], \u0027;\u0027)  \u003d \"1;2;3\"\n     * StringUtils.join([1, 2, 3], null) \u003d \"123\"\n     * \u003c/pre\u003e\n     * \n     * @param array\n     *            the array of values to join together, may be null\n     * @param separator\n     *            the separator character to use\n     * @return the joined String, {@code null} if null array input\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 3358,col 9)-(line 3360,col 9)",
        "(line 3361,col 9)-(line 3361,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(double[], char)",
      "begin_line": 3389,
      "end_line": 3394,
      "comment": "\n     * \u003cp\u003e\n     * Joins the elements of the provided array into a single String containing the provided list of elements.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented\n     * by empty strings.\n     * \u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * StringUtils.join(null, *)               \u003d null\n     * StringUtils.join([], *)                 \u003d \"\"\n     * StringUtils.join([null], *)             \u003d \"\"\n     * StringUtils.join([1, 2, 3], \u0027;\u0027)  \u003d \"1;2;3\"\n     * StringUtils.join([1, 2, 3], null) \u003d \"123\"\n     * \u003c/pre\u003e\n     * \n     * @param array\n     *            the array of values to join together, may be null\n     * @param separator\n     *            the separator character to use\n     * @return the joined String, {@code null} if null array input\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 3390,col 9)-(line 3392,col 9)",
        "(line 3393,col 9)-(line 3393,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.lang.Object[], char, int, int)",
      "begin_line": 3423,
      "end_line": 3441,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null, *)               \u003d null\n     * StringUtils.join([], *)                 \u003d \"\"\n     * StringUtils.join([null], *)             \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \u0027;\u0027)  \u003d \"a;b;c\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], null) \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"], \u0027;\u0027)  \u003d \";;a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to join together, may be null\n     * @param separator  the separator character to use\n     * @param startIndex the first index to start joining from.  It is\n     * an error to pass in an end index past the end of the array\n     * @param endIndex the index to stop joining from (exclusive). It is\n     * an error to pass in an end index past the end of the array\n     * @return the joined String, {@code null} if null array input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 3424,col 9)-(line 3426,col 9)",
        "(line 3427,col 9)-(line 3427,col 46)",
        "(line 3428,col 9)-(line 3430,col 9)",
        "(line 3431,col 9)-(line 3431,col 62)",
        "(line 3432,col 9)-(line 3439,col 9)",
        "(line 3440,col 9)-(line 3440,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(long[], char, int, int)",
      "begin_line": 3474,
      "end_line": 3490,
      "comment": "\n     * \u003cp\u003e\n     * Joins the elements of the provided array into a single String containing the provided list of elements.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented\n     * by empty strings.\n     * \u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * StringUtils.join(null, *)               \u003d null\n     * StringUtils.join([], *)                 \u003d \"\"\n     * StringUtils.join([null], *)             \u003d \"\"\n     * StringUtils.join([1, 2, 3], \u0027;\u0027)  \u003d \"1;2;3\"\n     * StringUtils.join([1, 2, 3], null) \u003d \"123\"\n     * \u003c/pre\u003e\n     * \n     * @param array\n     *            the array of values to join together, may be null\n     * @param separator\n     *            the separator character to use\n     * @param startIndex\n     *            the first index to start joining from. It is an error to pass in an end index past the end of the\n     *            array\n     * @param endIndex\n     *            the index to stop joining from (exclusive). It is an error to pass in an end index past the end of\n     *            the array\n     * @return the joined String, {@code null} if null array input\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 3475,col 9)-(line 3477,col 9)",
        "(line 3478,col 9)-(line 3478,col 46)",
        "(line 3479,col 9)-(line 3481,col 9)",
        "(line 3482,col 9)-(line 3482,col 62)",
        "(line 3483,col 9)-(line 3488,col 9)",
        "(line 3489,col 9)-(line 3489,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(int[], char, int, int)",
      "begin_line": 3523,
      "end_line": 3539,
      "comment": "\n     * \u003cp\u003e\n     * Joins the elements of the provided array into a single String containing the provided list of elements.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented\n     * by empty strings.\n     * \u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * StringUtils.join(null, *)               \u003d null\n     * StringUtils.join([], *)                 \u003d \"\"\n     * StringUtils.join([null], *)             \u003d \"\"\n     * StringUtils.join([1, 2, 3], \u0027;\u0027)  \u003d \"1;2;3\"\n     * StringUtils.join([1, 2, 3], null) \u003d \"123\"\n     * \u003c/pre\u003e\n     * \n     * @param array\n     *            the array of values to join together, may be null\n     * @param separator\n     *            the separator character to use\n     * @param startIndex\n     *            the first index to start joining from. It is an error to pass in an end index past the end of the\n     *            array\n     * @param endIndex\n     *            the index to stop joining from (exclusive). It is an error to pass in an end index past the end of\n     *            the array\n     * @return the joined String, {@code null} if null array input\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 3524,col 9)-(line 3526,col 9)",
        "(line 3527,col 9)-(line 3527,col 46)",
        "(line 3528,col 9)-(line 3530,col 9)",
        "(line 3531,col 9)-(line 3531,col 62)",
        "(line 3532,col 9)-(line 3537,col 9)",
        "(line 3538,col 9)-(line 3538,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(byte[], char, int, int)",
      "begin_line": 3572,
      "end_line": 3588,
      "comment": "\n     * \u003cp\u003e\n     * Joins the elements of the provided array into a single String containing the provided list of elements.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented\n     * by empty strings.\n     * \u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * StringUtils.join(null, *)               \u003d null\n     * StringUtils.join([], *)                 \u003d \"\"\n     * StringUtils.join([null], *)             \u003d \"\"\n     * StringUtils.join([1, 2, 3], \u0027;\u0027)  \u003d \"1;2;3\"\n     * StringUtils.join([1, 2, 3], null) \u003d \"123\"\n     * \u003c/pre\u003e\n     * \n     * @param array\n     *            the array of values to join together, may be null\n     * @param separator\n     *            the separator character to use\n     * @param startIndex\n     *            the first index to start joining from. It is an error to pass in an end index past the end of the\n     *            array\n     * @param endIndex\n     *            the index to stop joining from (exclusive). It is an error to pass in an end index past the end of\n     *            the array\n     * @return the joined String, {@code null} if null array input\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 3573,col 9)-(line 3575,col 9)",
        "(line 3576,col 9)-(line 3576,col 46)",
        "(line 3577,col 9)-(line 3579,col 9)",
        "(line 3580,col 9)-(line 3580,col 62)",
        "(line 3581,col 9)-(line 3586,col 9)",
        "(line 3587,col 9)-(line 3587,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(short[], char, int, int)",
      "begin_line": 3621,
      "end_line": 3637,
      "comment": "\n     * \u003cp\u003e\n     * Joins the elements of the provided array into a single String containing the provided list of elements.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented\n     * by empty strings.\n     * \u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * StringUtils.join(null, *)               \u003d null\n     * StringUtils.join([], *)                 \u003d \"\"\n     * StringUtils.join([null], *)             \u003d \"\"\n     * StringUtils.join([1, 2, 3], \u0027;\u0027)  \u003d \"1;2;3\"\n     * StringUtils.join([1, 2, 3], null) \u003d \"123\"\n     * \u003c/pre\u003e\n     * \n     * @param array\n     *            the array of values to join together, may be null\n     * @param separator\n     *            the separator character to use\n     * @param startIndex\n     *            the first index to start joining from. It is an error to pass in an end index past the end of the\n     *            array\n     * @param endIndex\n     *            the index to stop joining from (exclusive). It is an error to pass in an end index past the end of\n     *            the array\n     * @return the joined String, {@code null} if null array input\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 3622,col 9)-(line 3624,col 9)",
        "(line 3625,col 9)-(line 3625,col 46)",
        "(line 3626,col 9)-(line 3628,col 9)",
        "(line 3629,col 9)-(line 3629,col 62)",
        "(line 3630,col 9)-(line 3635,col 9)",
        "(line 3636,col 9)-(line 3636,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(char[], char, int, int)",
      "begin_line": 3670,
      "end_line": 3686,
      "comment": "\n     * \u003cp\u003e\n     * Joins the elements of the provided array into a single String containing the provided list of elements.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented\n     * by empty strings.\n     * \u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * StringUtils.join(null, *)               \u003d null\n     * StringUtils.join([], *)                 \u003d \"\"\n     * StringUtils.join([null], *)             \u003d \"\"\n     * StringUtils.join([1, 2, 3], \u0027;\u0027)  \u003d \"1;2;3\"\n     * StringUtils.join([1, 2, 3], null) \u003d \"123\"\n     * \u003c/pre\u003e\n     * \n     * @param array\n     *            the array of values to join together, may be null\n     * @param separator\n     *            the separator character to use\n     * @param startIndex\n     *            the first index to start joining from. It is an error to pass in an end index past the end of the\n     *            array\n     * @param endIndex\n     *            the index to stop joining from (exclusive). It is an error to pass in an end index past the end of\n     *            the array\n     * @return the joined String, {@code null} if null array input\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 3671,col 9)-(line 3673,col 9)",
        "(line 3674,col 9)-(line 3674,col 46)",
        "(line 3675,col 9)-(line 3677,col 9)",
        "(line 3678,col 9)-(line 3678,col 62)",
        "(line 3679,col 9)-(line 3684,col 9)",
        "(line 3685,col 9)-(line 3685,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(double[], char, int, int)",
      "begin_line": 3719,
      "end_line": 3735,
      "comment": "\n     * \u003cp\u003e\n     * Joins the elements of the provided array into a single String containing the provided list of elements.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented\n     * by empty strings.\n     * \u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * StringUtils.join(null, *)               \u003d null\n     * StringUtils.join([], *)                 \u003d \"\"\n     * StringUtils.join([null], *)             \u003d \"\"\n     * StringUtils.join([1, 2, 3], \u0027;\u0027)  \u003d \"1;2;3\"\n     * StringUtils.join([1, 2, 3], null) \u003d \"123\"\n     * \u003c/pre\u003e\n     * \n     * @param array\n     *            the array of values to join together, may be null\n     * @param separator\n     *            the separator character to use\n     * @param startIndex\n     *            the first index to start joining from. It is an error to pass in an end index past the end of the\n     *            array\n     * @param endIndex\n     *            the index to stop joining from (exclusive). It is an error to pass in an end index past the end of\n     *            the array\n     * @return the joined String, {@code null} if null array input\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 3720,col 9)-(line 3722,col 9)",
        "(line 3723,col 9)-(line 3723,col 46)",
        "(line 3724,col 9)-(line 3726,col 9)",
        "(line 3727,col 9)-(line 3727,col 62)",
        "(line 3728,col 9)-(line 3733,col 9)",
        "(line 3734,col 9)-(line 3734,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(float[], char, int, int)",
      "begin_line": 3768,
      "end_line": 3784,
      "comment": "\n     * \u003cp\u003e\n     * Joins the elements of the provided array into a single String containing the provided list of elements.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented\n     * by empty strings.\n     * \u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * StringUtils.join(null, *)               \u003d null\n     * StringUtils.join([], *)                 \u003d \"\"\n     * StringUtils.join([null], *)             \u003d \"\"\n     * StringUtils.join([1, 2, 3], \u0027;\u0027)  \u003d \"1;2;3\"\n     * StringUtils.join([1, 2, 3], null) \u003d \"123\"\n     * \u003c/pre\u003e\n     * \n     * @param array\n     *            the array of values to join together, may be null\n     * @param separator\n     *            the separator character to use\n     * @param startIndex\n     *            the first index to start joining from. It is an error to pass in an end index past the end of the\n     *            array\n     * @param endIndex\n     *            the index to stop joining from (exclusive). It is an error to pass in an end index past the end of\n     *            the array\n     * @return the joined String, {@code null} if null array input\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 3769,col 9)-(line 3771,col 9)",
        "(line 3772,col 9)-(line 3772,col 46)",
        "(line 3773,col 9)-(line 3775,col 9)",
        "(line 3776,col 9)-(line 3776,col 62)",
        "(line 3777,col 9)-(line 3782,col 9)",
        "(line 3783,col 9)-(line 3783,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.lang.Object[], java.lang.String)",
      "begin_line": 3810,
      "end_line": 3815,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * A {@code null} separator is the same as an empty String (\"\").\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null, *)                \u003d null\n     * StringUtils.join([], *)                  \u003d \"\"\n     * StringUtils.join([null], *)              \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \"--\")  \u003d \"a--b--c\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], null)  \u003d \"abc\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \"\")    \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"], \u0027,\u0027)   \u003d \",,a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to join together, may be null\n     * @param separator  the separator character to use, null treated as \"\"\n     * @return the joined String, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 3811,col 9)-(line 3813,col 9)",
        "(line 3814,col 9)-(line 3814,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.lang.Object[], java.lang.String, int, int)",
      "begin_line": 3852,
      "end_line": 3878,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * A {@code null} separator is the same as an empty String (\"\").\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null, *, *, *)                \u003d null\n     * StringUtils.join([], *, *, *)                  \u003d \"\"\n     * StringUtils.join([null], *, *, *)              \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \"--\", 0, 3)  \u003d \"a--b--c\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \"--\", 1, 3)  \u003d \"b--c\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \"--\", 2, 3)  \u003d \"c\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \"--\", 2, 2)  \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], null, 0, 3)  \u003d \"abc\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \"\", 0, 3)    \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"], \u0027,\u0027, 0, 3)   \u003d \",,a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to join together, may be null\n     * @param separator  the separator character to use, null treated as \"\"\n     * @param startIndex the first index to start joining from.\n     * @param endIndex the index to stop joining from (exclusive).\n     * @return the joined String, {@code null} if null array input; or the empty string\n     * if {@code endIndex - startIndex \u003c\u003d 0}. The number of joined entries is given by\n     * {@code endIndex - startIndex}\n     * @throws ArrayIndexOutOfBoundsException ife\u003cbr/\u003e\n     * {@code startIndex \u003c 0} or \u003cbr/\u003e\n     * {@code startIndex \u003e\u003d array.length()} or \u003cbr/\u003e\n     * {@code endIndex \u003c 0} or \u003cbr/\u003e\n     * {@code endIndex \u003e array.length()} \n     ",
      "child_ranges": [
        "(line 3853,col 9)-(line 3855,col 9)",
        "(line 3856,col 9)-(line 3858,col 9)",
        "(line 3862,col 9)-(line 3862,col 46)",
        "(line 3863,col 9)-(line 3865,col 9)",
        "(line 3867,col 9)-(line 3867,col 62)",
        "(line 3869,col 9)-(line 3876,col 9)",
        "(line 3877,col 9)-(line 3877,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.util.Iterator\u003c?\u003e, char)",
      "begin_line": 3894,
      "end_line": 3923,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided {@code Iterator} into\n     * a single String containing the provided elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list. Null objects or empty\n     * strings within the iteration are represented by empty strings.\u003c/p\u003e\n     *\n     * \u003cp\u003eSee the examples here: {@link #join(Object[],char)}. \u003c/p\u003e\n     *\n     * @param iterator  the {@code Iterator} of values to join together, may be null\n     * @param separator  the separator character to use\n     * @return the joined String, {@code null} if null iterator input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 3897,col 9)-(line 3899,col 9)",
        "(line 3900,col 9)-(line 3902,col 9)",
        "(line 3903,col 9)-(line 3903,col 39)",
        "(line 3904,col 9)-(line 3906,col 9)",
        "(line 3909,col 9)-(line 3909,col 51)",
        "(line 3910,col 9)-(line 3912,col 9)",
        "(line 3914,col 9)-(line 3920,col 9)",
        "(line 3922,col 9)-(line 3922,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.util.Iterator\u003c?\u003e, java.lang.String)",
      "begin_line": 3938,
      "end_line": 3968,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided {@code Iterator} into\n     * a single String containing the provided elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * A {@code null} separator is the same as an empty String (\"\").\u003c/p\u003e\n     *\n     * \u003cp\u003eSee the examples here: {@link #join(Object[],String)}. \u003c/p\u003e\n     *\n     * @param iterator  the {@code Iterator} of values to join together, may be null\n     * @param separator  the separator character to use, null treated as \"\"\n     * @return the joined String, {@code null} if null iterator input\n     ",
      "child_ranges": [
        "(line 3941,col 9)-(line 3943,col 9)",
        "(line 3944,col 9)-(line 3946,col 9)",
        "(line 3947,col 9)-(line 3947,col 39)",
        "(line 3948,col 9)-(line 3950,col 9)",
        "(line 3953,col 9)-(line 3953,col 51)",
        "(line 3954,col 9)-(line 3956,col 9)",
        "(line 3958,col 9)-(line 3966,col 9)",
        "(line 3967,col 9)-(line 3967,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.lang.Iterable\u003c?\u003e, char)",
      "begin_line": 3984,
      "end_line": 3989,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided {@code Iterable} into\n     * a single String containing the provided elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list. Null objects or empty\n     * strings within the iteration are represented by empty strings.\u003c/p\u003e\n     *\n     * \u003cp\u003eSee the examples here: {@link #join(Object[],char)}. \u003c/p\u003e\n     *\n     * @param iterable  the {@code Iterable} providing the values to join together, may be null\n     * @param separator  the separator character to use\n     * @return the joined String, {@code null} if null iterator input\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 3985,col 9)-(line 3987,col 9)",
        "(line 3988,col 9)-(line 3988,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.lang.Iterable\u003c?\u003e, java.lang.String)",
      "begin_line": 4005,
      "end_line": 4010,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided {@code Iterable} into\n     * a single String containing the provided elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * A {@code null} separator is the same as an empty String (\"\").\u003c/p\u003e\n     *\n     * \u003cp\u003eSee the examples here: {@link #join(Object[],String)}. \u003c/p\u003e\n     *\n     * @param iterable  the {@code Iterable} providing the values to join together, may be null\n     * @param separator  the separator character to use, null treated as \"\"\n     * @return the joined String, {@code null} if null iterator input\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 4006,col 9)-(line 4008,col 9)",
        "(line 4009,col 9)-(line 4009,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.deleteWhitespace(java.lang.String)",
      "begin_line": 4028,
      "end_line": 4044,
      "comment": "\n     * \u003cp\u003eDeletes all whitespaces from a String as defined by\n     * {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.deleteWhitespace(null)         \u003d null\n     * StringUtils.deleteWhitespace(\"\")           \u003d \"\"\n     * StringUtils.deleteWhitespace(\"abc\")        \u003d \"abc\"\n     * StringUtils.deleteWhitespace(\"   ab  c  \") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to delete whitespace from, may be null\n     * @return the String without whitespaces, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 4029,col 9)-(line 4031,col 9)",
        "(line 4032,col 9)-(line 4032,col 30)",
        "(line 4033,col 9)-(line 4033,col 34)",
        "(line 4034,col 9)-(line 4034,col 22)",
        "(line 4035,col 9)-(line 4039,col 9)",
        "(line 4040,col 9)-(line 4042,col 9)",
        "(line 4043,col 9)-(line 4043,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.removeStart(java.lang.String, java.lang.String)",
      "begin_line": 4072,
      "end_line": 4080,
      "comment": "\n     * \u003cp\u003eRemoves a substring only if it is at the beginning of a source string,\n     * otherwise returns the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} source string will return {@code null}.\n     * An empty (\"\") source string will return the empty string.\n     * A {@code null} search string will return the source string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.removeStart(null, *)      \u003d null\n     * StringUtils.removeStart(\"\", *)        \u003d \"\"\n     * StringUtils.removeStart(*, null)      \u003d *\n     * StringUtils.removeStart(\"www.domain.com\", \"www.\")   \u003d \"domain.com\"\n     * StringUtils.removeStart(\"domain.com\", \"www.\")       \u003d \"domain.com\"\n     * StringUtils.removeStart(\"www.domain.com\", \"domain\") \u003d \"www.domain.com\"\n     * StringUtils.removeStart(\"abc\", \"\")    \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the String to search for and remove, may be null\n     * @return the substring with the string removed if found,\n     *  {@code null} if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4073,col 9)-(line 4075,col 9)",
        "(line 4076,col 9)-(line 4078,col 9)",
        "(line 4079,col 9)-(line 4079,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.removeStartIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 4107,
      "end_line": 4115,
      "comment": "\n     * \u003cp\u003eCase insensitive removal of a substring if it is at the beginning of a source string,\n     * otherwise returns the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} source string will return {@code null}.\n     * An empty (\"\") source string will return the empty string.\n     * A {@code null} search string will return the source string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.removeStartIgnoreCase(null, *)      \u003d null\n     * StringUtils.removeStartIgnoreCase(\"\", *)        \u003d \"\"\n     * StringUtils.removeStartIgnoreCase(*, null)      \u003d *\n     * StringUtils.removeStartIgnoreCase(\"www.domain.com\", \"www.\")   \u003d \"domain.com\"\n     * StringUtils.removeStartIgnoreCase(\"www.domain.com\", \"WWW.\")   \u003d \"domain.com\"\n     * StringUtils.removeStartIgnoreCase(\"domain.com\", \"www.\")       \u003d \"domain.com\"\n     * StringUtils.removeStartIgnoreCase(\"www.domain.com\", \"domain\") \u003d \"www.domain.com\"\n     * StringUtils.removeStartIgnoreCase(\"abc\", \"\")    \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the String to search for (case insensitive) and remove, may be null\n     * @return the substring with the string removed if found,\n     *  {@code null} if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 4108,col 9)-(line 4110,col 9)",
        "(line 4111,col 9)-(line 4113,col 9)",
        "(line 4114,col 9)-(line 4114,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.removeEnd(java.lang.String, java.lang.String)",
      "begin_line": 4141,
      "end_line": 4149,
      "comment": "\n     * \u003cp\u003eRemoves a substring only if it is at the end of a source string,\n     * otherwise returns the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} source string will return {@code null}.\n     * An empty (\"\") source string will return the empty string.\n     * A {@code null} search string will return the source string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.removeEnd(null, *)      \u003d null\n     * StringUtils.removeEnd(\"\", *)        \u003d \"\"\n     * StringUtils.removeEnd(*, null)      \u003d *\n     * StringUtils.removeEnd(\"www.domain.com\", \".com.\")  \u003d \"www.domain.com\"\n     * StringUtils.removeEnd(\"www.domain.com\", \".com\")   \u003d \"www.domain\"\n     * StringUtils.removeEnd(\"www.domain.com\", \"domain\") \u003d \"www.domain.com\"\n     * StringUtils.removeEnd(\"abc\", \"\")    \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the String to search for and remove, may be null\n     * @return the substring with the string removed if found,\n     *  {@code null} if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4142,col 9)-(line 4144,col 9)",
        "(line 4145,col 9)-(line 4147,col 9)",
        "(line 4148,col 9)-(line 4148,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.removeEndIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 4177,
      "end_line": 4185,
      "comment": "\n     * \u003cp\u003eCase insensitive removal of a substring if it is at the end of a source string,\n     * otherwise returns the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} source string will return {@code null}.\n     * An empty (\"\") source string will return the empty string.\n     * A {@code null} search string will return the source string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.removeEndIgnoreCase(null, *)      \u003d null\n     * StringUtils.removeEndIgnoreCase(\"\", *)        \u003d \"\"\n     * StringUtils.removeEndIgnoreCase(*, null)      \u003d *\n     * StringUtils.removeEndIgnoreCase(\"www.domain.com\", \".com.\")  \u003d \"www.domain.com\"\n     * StringUtils.removeEndIgnoreCase(\"www.domain.com\", \".com\")   \u003d \"www.domain\"\n     * StringUtils.removeEndIgnoreCase(\"www.domain.com\", \"domain\") \u003d \"www.domain.com\"\n     * StringUtils.removeEndIgnoreCase(\"abc\", \"\")    \u003d \"abc\"\n     * StringUtils.removeEndIgnoreCase(\"www.domain.com\", \".COM\") \u003d \"www.domain\")\n     * StringUtils.removeEndIgnoreCase(\"www.domain.COM\", \".com\") \u003d \"www.domain\")\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the String to search for (case insensitive) and remove, may be null\n     * @return the substring with the string removed if found,\n     *  {@code null} if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 4178,col 9)-(line 4180,col 9)",
        "(line 4181,col 9)-(line 4183,col 9)",
        "(line 4184,col 9)-(line 4184,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.remove(java.lang.String, java.lang.String)",
      "begin_line": 4210,
      "end_line": 4215,
      "comment": "\n     * \u003cp\u003eRemoves all occurrences of a substring from within the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} source string will return {@code null}.\n     * An empty (\"\") source string will return the empty string.\n     * A {@code null} remove string will return the source string.\n     * An empty (\"\") remove string will return the source string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.remove(null, *)        \u003d null\n     * StringUtils.remove(\"\", *)          \u003d \"\"\n     * StringUtils.remove(*, null)        \u003d *\n     * StringUtils.remove(*, \"\")          \u003d *\n     * StringUtils.remove(\"queued\", \"ue\") \u003d \"qd\"\n     * StringUtils.remove(\"queued\", \"zz\") \u003d \"queued\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the String to search for and remove, may be null\n     * @return the substring with the string removed if found,\n     *  {@code null} if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4211,col 9)-(line 4213,col 9)",
        "(line 4214,col 9)-(line 4214,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.remove(java.lang.String, char)",
      "begin_line": 4236,
      "end_line": 4248,
      "comment": "\n     * \u003cp\u003eRemoves all occurrences of a character from within the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} source string will return {@code null}.\n     * An empty (\"\") source string will return the empty string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.remove(null, *)       \u003d null\n     * StringUtils.remove(\"\", *)         \u003d \"\"\n     * StringUtils.remove(\"queued\", \u0027u\u0027) \u003d \"qeed\"\n     * StringUtils.remove(\"queued\", \u0027z\u0027) \u003d \"queued\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the char to search for and remove, may be null\n     * @return the substring with the char removed if found,\n     *  {@code null} if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4237,col 9)-(line 4239,col 9)",
        "(line 4240,col 9)-(line 4240,col 41)",
        "(line 4241,col 9)-(line 4241,col 20)",
        "(line 4242,col 9)-(line 4246,col 9)",
        "(line 4247,col 9)-(line 4247,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replaceOnce(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 4275,
      "end_line": 4277,
      "comment": "\n     * \u003cp\u003eReplaces a String with another String inside a larger String, once.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} reference passed to this method is a no-op.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replaceOnce(null, *, *)        \u003d null\n     * StringUtils.replaceOnce(\"\", *, *)          \u003d \"\"\n     * StringUtils.replaceOnce(\"any\", null, *)    \u003d \"any\"\n     * StringUtils.replaceOnce(\"any\", *, null)    \u003d \"any\"\n     * StringUtils.replaceOnce(\"any\", \"\", *)      \u003d \"any\"\n     * StringUtils.replaceOnce(\"aba\", \"a\", null)  \u003d \"aba\"\n     * StringUtils.replaceOnce(\"aba\", \"a\", \"\")    \u003d \"ba\"\n     * StringUtils.replaceOnce(\"aba\", \"a\", \"z\")   \u003d \"zba\"\n     * \u003c/pre\u003e\n     *\n     * @see #replace(String text, String searchString, String replacement, int max)\n     * @param text  text to search and replace in, may be null\n     * @param searchString  the String to search for, may be null\n     * @param replacement  the String to replace with, may be null\n     * @return the text with any replacements processed,\n     *  {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 4276,col 9)-(line 4276,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replacePattern(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 4299,
      "end_line": 4301,
      "comment": "\n     * Replaces each substring of the source String that matches the given regular expression with the given\n     * replacement using the {@link Pattern#DOTALL} option. DOTALL is also know as single-line mode in Perl. This call\n     * is also equivalent to:\n     * \u003cul\u003e\n     * \u003cli\u003e{@code source.replaceAll(\u0026quot;(?s)\u0026quot; + regex, replacement)}\u003c/li\u003e\n     * \u003cli\u003e{@code Pattern.compile(regex, Pattern.DOTALL).matcher(source).replaceAll(replacement)}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param source\n     *            the source string\n     * @param regex\n     *            the regular expression to which this string is to be matched\n     * @param replacement\n     *            the string to be substituted for each match\n     * @return The resulting {@code String}\n     * @see String#replaceAll(String, String)\n     * @see Pattern#DOTALL\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 4300,col 9)-(line 4300,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.removePattern(java.lang.String, java.lang.String)",
      "begin_line": 4315,
      "end_line": 4317,
      "comment": "\n     * Removes each substring of the source String that matches the given regular expression using the DOTALL option.\n     * \n     * @param source\n     *            the source string\n     * @param regex\n     *            the regular expression to which this string is to be matched\n     * @return The resulting {@code String}\n     * @see String#replaceAll(String, String)\n     * @see Pattern#DOTALL\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 4316,col 9)-(line 4316,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replace(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 4342,
      "end_line": 4344,
      "comment": "\n     * \u003cp\u003eReplaces all occurrences of a String within another String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} reference passed to this method is a no-op.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replace(null, *, *)        \u003d null\n     * StringUtils.replace(\"\", *, *)          \u003d \"\"\n     * StringUtils.replace(\"any\", null, *)    \u003d \"any\"\n     * StringUtils.replace(\"any\", *, null)    \u003d \"any\"\n     * StringUtils.replace(\"any\", \"\", *)      \u003d \"any\"\n     * StringUtils.replace(\"aba\", \"a\", null)  \u003d \"aba\"\n     * StringUtils.replace(\"aba\", \"a\", \"\")    \u003d \"b\"\n     * StringUtils.replace(\"aba\", \"a\", \"z\")   \u003d \"zbz\"\n     * \u003c/pre\u003e\n     *\n     * @see #replace(String text, String searchString, String replacement, int max)\n     * @param text  text to search and replace in, may be null\n     * @param searchString  the String to search for, may be null\n     * @param replacement  the String to replace it with, may be null\n     * @return the text with any replacements processed,\n     *  {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 4343,col 9)-(line 4343,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replace(java.lang.String, java.lang.String, java.lang.String, int)",
      "begin_line": 4374,
      "end_line": 4398,
      "comment": "\n     * \u003cp\u003eReplaces a String with another String inside a larger String,\n     * for the first {@code max} values of the search String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} reference passed to this method is a no-op.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replace(null, *, *, *)         \u003d null\n     * StringUtils.replace(\"\", *, *, *)           \u003d \"\"\n     * StringUtils.replace(\"any\", null, *, *)     \u003d \"any\"\n     * StringUtils.replace(\"any\", *, null, *)     \u003d \"any\"\n     * StringUtils.replace(\"any\", \"\", *, *)       \u003d \"any\"\n     * StringUtils.replace(\"any\", *, *, 0)        \u003d \"any\"\n     * StringUtils.replace(\"abaa\", \"a\", null, -1) \u003d \"abaa\"\n     * StringUtils.replace(\"abaa\", \"a\", \"\", -1)   \u003d \"b\"\n     * StringUtils.replace(\"abaa\", \"a\", \"z\", 0)   \u003d \"abaa\"\n     * StringUtils.replace(\"abaa\", \"a\", \"z\", 1)   \u003d \"zbaa\"\n     * StringUtils.replace(\"abaa\", \"a\", \"z\", 2)   \u003d \"zbza\"\n     * StringUtils.replace(\"abaa\", \"a\", \"z\", -1)  \u003d \"zbzz\"\n     * \u003c/pre\u003e\n     *\n     * @param text  text to search and replace in, may be null\n     * @param searchString  the String to search for, may be null\n     * @param replacement  the String to replace it with, may be null\n     * @param max  maximum number of values to replace, or {@code -1} if no maximum\n     * @return the text with any replacements processed,\n     *  {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 4375,col 9)-(line 4377,col 9)",
        "(line 4378,col 9)-(line 4378,col 22)",
        "(line 4379,col 9)-(line 4379,col 52)",
        "(line 4380,col 9)-(line 4382,col 9)",
        "(line 4383,col 9)-(line 4383,col 47)",
        "(line 4384,col 9)-(line 4384,col 57)",
        "(line 4385,col 9)-(line 4385,col 47)",
        "(line 4386,col 9)-(line 4386,col 55)",
        "(line 4387,col 9)-(line 4387,col 72)",
        "(line 4388,col 9)-(line 4395,col 9)",
        "(line 4396,col 9)-(line 4396,col 42)",
        "(line 4397,col 9)-(line 4397,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replaceEach(java.lang.String, java.lang.String[], java.lang.String[])",
      "begin_line": 4439,
      "end_line": 4441,
      "comment": "\n     * \u003cp\u003e\n     * Replaces all occurrences of Strings within another String.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * A {@code null} reference passed to this method is a no-op, or if\n     * any \"search string\" or \"string to replace\" is null, that replace will be\n     * ignored. This will not repeat. For repeating replaces, call the\n     * overloaded method.\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *  StringUtils.replaceEach(null, *, *)        \u003d null\n     *  StringUtils.replaceEach(\"\", *, *)          \u003d \"\"\n     *  StringUtils.replaceEach(\"aba\", null, null) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[0], null) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", null, new String[0]) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, null)  \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, new String[]{\"\"})  \u003d \"b\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{null}, new String[]{\"a\"})  \u003d \"aba\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"w\", \"t\"})  \u003d \"wcte\"\n     *  (example of how it does not repeat)\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"t\"})  \u003d \"dcte\"\n     * \u003c/pre\u003e\n     *\n     * @param text\n     *            text to search and replace in, no-op if null\n     * @param searchList\n     *            the Strings to search for, no-op if null\n     * @param replacementList\n     *            the Strings to replace them with, no-op if null\n     * @return the text with any replacements processed, {@code null} if\n     *         null String input\n     * @throws IllegalArgumentException\n     *             if the lengths of the arrays are not the same (null is ok,\n     *             and/or size 0)\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 4440,col 9)-(line 4440,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(java.lang.String, java.lang.String[], java.lang.String[])",
      "begin_line": 4487,
      "end_line": 4492,
      "comment": "\n     * \u003cp\u003e\n     * Replaces all occurrences of Strings within another String.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * A {@code null} reference passed to this method is a no-op, or if\n     * any \"search string\" or \"string to replace\" is null, that replace will be\n     * ignored. \n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *  StringUtils.replaceEach(null, *, *, *) \u003d null\n     *  StringUtils.replaceEach(\"\", *, *, *) \u003d \"\"\n     *  StringUtils.replaceEach(\"aba\", null, null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[0], null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", null, new String[0], *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, new String[]{\"\"}, *) \u003d \"b\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{null}, new String[]{\"a\"}, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"w\", \"t\"}, *) \u003d \"wcte\"\n     *  (example of how it repeats)\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"t\"}, false) \u003d \"dcte\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"t\"}, true) \u003d \"tcte\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"ab\"}, true) \u003d IllegalStateException\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"ab\"}, false) \u003d \"dcabe\"\n     * \u003c/pre\u003e\n     *\n     * @param text\n     *            text to search and replace in, no-op if null\n     * @param searchList\n     *            the Strings to search for, no-op if null\n     * @param replacementList\n     *            the Strings to replace them with, no-op if null\n     * @return the text with any replacements processed, {@code null} if\n     *         null String input\n     * @throws IllegalStateException\n     *             if the search is repeating and there is an endless loop due\n     *             to outputs of one being inputs to another\n     * @throws IllegalArgumentException\n     *             if the lengths of the arrays are not the same (null is ok,\n     *             and/or size 0)\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 4490,col 9)-(line 4490,col 68)",
        "(line 4491,col 9)-(line 4491,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replaceEach(java.lang.String, java.lang.String[], java.lang.String[], boolean, int)",
      "begin_line": 4542,
      "end_line": 4668,
      "comment": "\n     * \u003cp\u003e\n     * Replaces all occurrences of Strings within another String.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * A {@code null} reference passed to this method is a no-op, or if\n     * any \"search string\" or \"string to replace\" is null, that replace will be\n     * ignored.\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *  StringUtils.replaceEach(null, *, *, *) \u003d null\n     *  StringUtils.replaceEach(\"\", *, *, *) \u003d \"\"\n     *  StringUtils.replaceEach(\"aba\", null, null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[0], null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", null, new String[0], *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, new String[]{\"\"}, *) \u003d \"b\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{null}, new String[]{\"a\"}, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"w\", \"t\"}, *) \u003d \"wcte\"\n     *  (example of how it repeats)\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"t\"}, false) \u003d \"dcte\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"t\"}, true) \u003d \"tcte\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"ab\"}, *) \u003d IllegalStateException\n     * \u003c/pre\u003e\n     *\n     * @param text\n     *            text to search and replace in, no-op if null\n     * @param searchList\n     *            the Strings to search for, no-op if null\n     * @param replacementList\n     *            the Strings to replace them with, no-op if null\n     * @param repeat if true, then replace repeatedly\n     *       until there are no more possible replacements or timeToLive \u003c 0\n     * @param timeToLive\n     *            if less than 0 then there is a circular reference and endless\n     *            loop\n     * @return the text with any replacements processed, {@code null} if\n     *         null String input\n     * @throws IllegalStateException\n     *             if the search is repeating and there is an endless loop due\n     *             to outputs of one being inputs to another\n     * @throws IllegalArgumentException\n     *             if the lengths of the arrays are not the same (null is ok,\n     *             and/or size 0)\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 4548,col 9)-(line 4551,col 9)",
        "(line 4554,col 9)-(line 4557,col 9)",
        "(line 4559,col 9)-(line 4559,col 45)",
        "(line 4560,col 9)-(line 4560,col 55)",
        "(line 4563,col 9)-(line 4568,col 9)",
        "(line 4571,col 9)-(line 4571,col 72)",
        "(line 4574,col 9)-(line 4574,col 27)",
        "(line 4575,col 9)-(line 4575,col 30)",
        "(line 4576,col 9)-(line 4576,col 27)",
        "(line 4580,col 9)-(line 4596,col 9)",
        "(line 4600,col 9)-(line 4602,col 9)",
        "(line 4604,col 9)-(line 4604,col 22)",
        "(line 4607,col 9)-(line 4607,col 25)",
        "(line 4610,col 9)-(line 4618,col 9)",
        "(line 4620,col 9)-(line 4620,col 57)",
        "(line 4622,col 9)-(line 4622,col 72)",
        "(line 4624,col 9)-(line 4657,col 9)",
        "(line 4658,col 9)-(line 4658,col 39)",
        "(line 4659,col 9)-(line 4661,col 9)",
        "(line 4662,col 9)-(line 4662,col 39)",
        "(line 4663,col 9)-(line 4665,col 9)",
        "(line 4667,col 9)-(line 4667,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replaceChars(java.lang.String, char, char)",
      "begin_line": 4692,
      "end_line": 4697,
      "comment": "\n     * \u003cp\u003eReplaces all occurrences of a character in a String with another.\n     * This is a null-safe version of {@link String#replace(char, char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} string input returns {@code null}.\n     * An empty (\"\") string input returns an empty string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replaceChars(null, *, *)        \u003d null\n     * StringUtils.replaceChars(\"\", *, *)          \u003d \"\"\n     * StringUtils.replaceChars(\"abcba\", \u0027b\u0027, \u0027y\u0027) \u003d \"aycya\"\n     * StringUtils.replaceChars(\"abcba\", \u0027z\u0027, \u0027y\u0027) \u003d \"abcba\"\n     * \u003c/pre\u003e\n     *\n     * @param str  String to replace characters in, may be null\n     * @param searchChar  the character to search for, may be null\n     * @param replaceChar  the character to replace, may be null\n     * @return modified String, {@code null} if null string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4693,col 9)-(line 4695,col 9)",
        "(line 4696,col 9)-(line 4696,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replaceChars(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 4735,
      "end_line": 4762,
      "comment": "\n     * \u003cp\u003eReplaces multiple characters in a String in one go.\n     * This method can also be used to delete characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example:\u003cbr /\u003e\n     * \u003ccode\u003ereplaceChars(\u0026quot;hello\u0026quot;, \u0026quot;ho\u0026quot;, \u0026quot;jy\u0026quot;) \u003d jelly\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} string input returns {@code null}.\n     * An empty (\"\") string input returns an empty string.\n     * A null or empty set of search characters returns the input string.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe length of the search characters should normally equal the length\n     * of the replace characters.\n     * If the search characters is longer, then the extra search characters\n     * are deleted.\n     * If the search characters is shorter, then the extra replace characters\n     * are ignored.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replaceChars(null, *, *)           \u003d null\n     * StringUtils.replaceChars(\"\", *, *)             \u003d \"\"\n     * StringUtils.replaceChars(\"abc\", null, *)       \u003d \"abc\"\n     * StringUtils.replaceChars(\"abc\", \"\", *)         \u003d \"abc\"\n     * StringUtils.replaceChars(\"abc\", \"b\", null)     \u003d \"ac\"\n     * StringUtils.replaceChars(\"abc\", \"b\", \"\")       \u003d \"ac\"\n     * StringUtils.replaceChars(\"abcba\", \"bc\", \"yz\")  \u003d \"ayzya\"\n     * StringUtils.replaceChars(\"abcba\", \"bc\", \"y\")   \u003d \"ayya\"\n     * StringUtils.replaceChars(\"abcba\", \"bc\", \"yzx\") \u003d \"ayzya\"\n     * \u003c/pre\u003e\n     *\n     * @param str  String to replace characters in, may be null\n     * @param searchChars  a set of characters to search for, may be null\n     * @param replaceChars  a set of characters to replace, may be null\n     * @return modified String, {@code null} if null string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4736,col 9)-(line 4738,col 9)",
        "(line 4739,col 9)-(line 4741,col 9)",
        "(line 4742,col 9)-(line 4742,col 33)",
        "(line 4743,col 9)-(line 4743,col 55)",
        "(line 4744,col 9)-(line 4744,col 37)",
        "(line 4745,col 9)-(line 4745,col 57)",
        "(line 4746,col 9)-(line 4757,col 9)",
        "(line 4758,col 9)-(line 4760,col 9)",
        "(line 4761,col 9)-(line 4761,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.overlay(java.lang.String, java.lang.String, int, int)",
      "begin_line": 4795,
      "end_line": 4825,
      "comment": "\n     * \u003cp\u003eOverlays part of a String with another String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} string input returns {@code null}.\n     * A negative index is treated as zero.\n     * An index greater than the string length is treated as the string length.\n     * The start index is always the smaller of the two indices.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.overlay(null, *, *, *)            \u003d null\n     * StringUtils.overlay(\"\", \"abc\", 0, 0)          \u003d \"abc\"\n     * StringUtils.overlay(\"abcdef\", null, 2, 4)     \u003d \"abef\"\n     * StringUtils.overlay(\"abcdef\", \"\", 2, 4)       \u003d \"abef\"\n     * StringUtils.overlay(\"abcdef\", \"\", 4, 2)       \u003d \"abef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", 2, 4)   \u003d \"abzzzzef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", 4, 2)   \u003d \"abzzzzef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", -1, 4)  \u003d \"zzzzef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", 2, 8)   \u003d \"abzzzz\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", -2, -3) \u003d \"zzzzabcdef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", 8, 10)  \u003d \"abcdefzzzz\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to do overlaying in, may be null\n     * @param overlay  the String to overlay, may be null\n     * @param start  the position to start overlaying at\n     * @param end  the position to stop overlaying before\n     * @return overlayed String, {@code null} if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4796,col 9)-(line 4798,col 9)",
        "(line 4799,col 9)-(line 4801,col 9)",
        "(line 4802,col 9)-(line 4802,col 31)",
        "(line 4803,col 9)-(line 4805,col 9)",
        "(line 4806,col 9)-(line 4808,col 9)",
        "(line 4809,col 9)-(line 4811,col 9)",
        "(line 4812,col 9)-(line 4814,col 9)",
        "(line 4815,col 9)-(line 4819,col 9)",
        "(line 4820,col 9)-(line 4824,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.chomp(java.lang.String)",
      "begin_line": 4854,
      "end_line": 4878,
      "comment": "\n     * \u003cp\u003eRemoves one newline from end of a String if it\u0027s there,\n     * otherwise leave it alone.  A newline is \u0026quot;{@code \\n}\u0026quot;,\n     * \u0026quot;{@code \\r}\u0026quot;, or \u0026quot;{@code \\r\\n}\u0026quot;.\u003c/p\u003e\n     *\n     * \u003cp\u003eNOTE: This method changed in 2.0.\n     * It now more closely matches Perl chomp.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.chomp(null)          \u003d null\n     * StringUtils.chomp(\"\")            \u003d \"\"\n     * StringUtils.chomp(\"abc \\r\")      \u003d \"abc \"\n     * StringUtils.chomp(\"abc\\n\")       \u003d \"abc\"\n     * StringUtils.chomp(\"abc\\r\\n\")     \u003d \"abc\"\n     * StringUtils.chomp(\"abc\\r\\n\\r\\n\") \u003d \"abc\\r\\n\"\n     * StringUtils.chomp(\"abc\\n\\r\")     \u003d \"abc\\n\"\n     * StringUtils.chomp(\"abc\\n\\rabc\")  \u003d \"abc\\n\\rabc\"\n     * StringUtils.chomp(\"\\r\")          \u003d \"\"\n     * StringUtils.chomp(\"\\n\")          \u003d \"\"\n     * StringUtils.chomp(\"\\r\\n\")        \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to chomp a newline from, may be null\n     * @return String without newline, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 4855,col 9)-(line 4857,col 9)",
        "(line 4859,col 9)-(line 4865,col 9)",
        "(line 4867,col 9)-(line 4867,col 39)",
        "(line 4868,col 9)-(line 4868,col 40)",
        "(line 4870,col 9)-(line 4876,col 9)",
        "(line 4877,col 9)-(line 4877,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.chomp(java.lang.String, java.lang.String)",
      "begin_line": 4907,
      "end_line": 4910,
      "comment": "\n     * \u003cp\u003eRemoves {@code separator} from the end of\n     * {@code str} if it\u0027s there, otherwise leave it alone.\u003c/p\u003e\n     *\n     * \u003cp\u003eNOTE: This method changed in version 2.0.\n     * It now more closely matches Perl chomp.\n     * For the previous behavior, use {@link #substringBeforeLast(String, String)}.\n     * This method uses {@link String#endsWith(String)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.chomp(null, *)         \u003d null\n     * StringUtils.chomp(\"\", *)           \u003d \"\"\n     * StringUtils.chomp(\"foobar\", \"bar\") \u003d \"foo\"\n     * StringUtils.chomp(\"foobar\", \"baz\") \u003d \"foobar\"\n     * StringUtils.chomp(\"foo\", \"foo\")    \u003d \"\"\n     * StringUtils.chomp(\"foo \", \"foo\")   \u003d \"foo \"\n     * StringUtils.chomp(\" foo\", \"foo\")   \u003d \" \"\n     * StringUtils.chomp(\"foo\", \"foooo\")  \u003d \"foo\"\n     * StringUtils.chomp(\"foo\", \"\")       \u003d \"foo\"\n     * StringUtils.chomp(\"foo\", null)     \u003d \"foo\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to chomp from, may be null\n     * @param separator  separator String, may be null\n     * @return String without trailing separator, {@code null} if null String input\n     * @deprecated This feature will be removed in Lang 4.0, use {@link StringUtils#removeEnd(String, String)} instead\n     ",
      "child_ranges": [
        "(line 4909,col 9)-(line 4909,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.chop(java.lang.String)",
      "begin_line": 4937,
      "end_line": 4952,
      "comment": "\n     * \u003cp\u003eRemove the last character from a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the String ends in {@code \\r\\n}, then remove both\n     * of them.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.chop(null)          \u003d null\n     * StringUtils.chop(\"\")            \u003d \"\"\n     * StringUtils.chop(\"abc \\r\")      \u003d \"abc \"\n     * StringUtils.chop(\"abc\\n\")       \u003d \"abc\"\n     * StringUtils.chop(\"abc\\r\\n\")     \u003d \"abc\"\n     * StringUtils.chop(\"abc\")         \u003d \"ab\"\n     * StringUtils.chop(\"abc\\nabc\")    \u003d \"abc\\nab\"\n     * StringUtils.chop(\"a\")           \u003d \"\"\n     * StringUtils.chop(\"\\r\")          \u003d \"\"\n     * StringUtils.chop(\"\\n\")          \u003d \"\"\n     * StringUtils.chop(\"\\r\\n\")        \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to chop last character from, may be null\n     * @return String without last character, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 4938,col 9)-(line 4940,col 9)",
        "(line 4941,col 9)-(line 4941,col 34)",
        "(line 4942,col 9)-(line 4944,col 9)",
        "(line 4945,col 9)-(line 4945,col 33)",
        "(line 4946,col 9)-(line 4946,col 47)",
        "(line 4947,col 9)-(line 4947,col 40)",
        "(line 4948,col 9)-(line 4950,col 9)",
        "(line 4951,col 9)-(line 4951,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.repeat(java.lang.String, int)",
      "begin_line": 4977,
      "end_line": 5014,
      "comment": "\n     * \u003cp\u003eRepeat a String {@code repeat} times to form a\n     * new String.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.repeat(null, 2) \u003d null\n     * StringUtils.repeat(\"\", 0)   \u003d \"\"\n     * StringUtils.repeat(\"\", 2)   \u003d \"\"\n     * StringUtils.repeat(\"a\", 3)  \u003d \"aaa\"\n     * StringUtils.repeat(\"ab\", 2) \u003d \"abab\"\n     * StringUtils.repeat(\"a\", -2) \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to repeat, may be null\n     * @param repeat  number of times to repeat str, negative treated as zero\n     * @return a new String consisting of the original String repeated,\n     *  {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 4980,col 9)-(line 4982,col 9)",
        "(line 4983,col 9)-(line 4985,col 9)",
        "(line 4986,col 9)-(line 4986,col 39)",
        "(line 4987,col 9)-(line 4989,col 9)",
        "(line 4990,col 9)-(line 4992,col 9)",
        "(line 4994,col 9)-(line 4994,col 48)",
        "(line 4995,col 9)-(line 5013,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.repeat(java.lang.String, java.lang.String, int)",
      "begin_line": 5036,
      "end_line": 5044,
      "comment": "\n     * \u003cp\u003eRepeat a String {@code repeat} times to form a\n     * new String, with a String separator injected each time. \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.repeat(null, null, 2) \u003d null\n     * StringUtils.repeat(null, \"x\", 2)  \u003d null\n     * StringUtils.repeat(\"\", null, 0)   \u003d \"\"\n     * StringUtils.repeat(\"\", \"\", 2)     \u003d \"\"\n     * StringUtils.repeat(\"\", \"x\", 3)    \u003d \"xxx\"\n     * StringUtils.repeat(\"?\", \", \", 3)  \u003d \"?, ?, ?\"\n     * \u003c/pre\u003e\n     *\n     * @param str        the String to repeat, may be null\n     * @param separator  the String to inject, may be null\n     * @param repeat     number of times to repeat str, negative treated as zero\n     * @return a new String consisting of the original String repeated,\n     *  {@code null} if null String input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 5037,col 9)-(line 5043,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.repeat(char, int)",
      "begin_line": 5068,
      "end_line": 5074,
      "comment": "\n     * \u003cp\u003eReturns padding using the specified delimiter repeated\n     * to a given length.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.repeat(0, \u0027e\u0027)  \u003d \"\"\n     * StringUtils.repeat(3, \u0027e\u0027)  \u003d \"eee\"\n     * StringUtils.repeat(-2, \u0027e\u0027) \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eNote: this method doesn\u0027t not support padding with\n     * \u003ca href\u003d\"http://www.unicode.org/glossary/#supplementary_character\"\u003eUnicode Supplementary Characters\u003c/a\u003e\n     * as they require a pair of {@code char}s to be represented.\n     * If you are needing to support full I18N of your applications\n     * consider using {@link #repeat(String, int)} instead.\n     * \u003c/p\u003e\n     *\n     * @param ch  character to repeat\n     * @param repeat  number of times to repeat char, negative treated as zero\n     * @return String with repeated character\n     * @see #repeat(String, int)\n     ",
      "child_ranges": [
        "(line 5069,col 9)-(line 5069,col 38)",
        "(line 5070,col 9)-(line 5072,col 9)",
        "(line 5073,col 9)-(line 5073,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.rightPad(java.lang.String, int)",
      "begin_line": 5095,
      "end_line": 5097,
      "comment": "\n     * \u003cp\u003eRight pad a String with spaces (\u0027 \u0027).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is padded to the size of {@code size}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.rightPad(null, *)   \u003d null\n     * StringUtils.rightPad(\"\", 3)     \u003d \"   \"\n     * StringUtils.rightPad(\"bat\", 3)  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", 5)  \u003d \"bat  \"\n     * StringUtils.rightPad(\"bat\", 1)  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", -1) \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @return right padded String or original String if no padding is necessary,\n     *  {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 5096,col 9)-(line 5096,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.rightPad(java.lang.String, int, char)",
      "begin_line": 5120,
      "end_line": 5132,
      "comment": "\n     * \u003cp\u003eRight pad a String with a specified character.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is padded to the size of {@code size}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.rightPad(null, *, *)     \u003d null\n     * StringUtils.rightPad(\"\", 3, \u0027z\u0027)     \u003d \"zzz\"\n     * StringUtils.rightPad(\"bat\", 3, \u0027z\u0027)  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", 5, \u0027z\u0027)  \u003d \"batzz\"\n     * StringUtils.rightPad(\"bat\", 1, \u0027z\u0027)  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", -1, \u0027z\u0027) \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @param padChar  the character to pad with\n     * @return right padded String or original String if no padding is necessary,\n     *  {@code null} if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 5121,col 9)-(line 5123,col 9)",
        "(line 5124,col 9)-(line 5124,col 39)",
        "(line 5125,col 9)-(line 5127,col 9)",
        "(line 5128,col 9)-(line 5130,col 9)",
        "(line 5131,col 9)-(line 5131,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.rightPad(java.lang.String, int, java.lang.String)",
      "begin_line": 5157,
      "end_line": 5186,
      "comment": "\n     * \u003cp\u003eRight pad a String with a specified String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is padded to the size of {@code size}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.rightPad(null, *, *)      \u003d null\n     * StringUtils.rightPad(\"\", 3, \"z\")      \u003d \"zzz\"\n     * StringUtils.rightPad(\"bat\", 3, \"yz\")  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", 5, \"yz\")  \u003d \"batyz\"\n     * StringUtils.rightPad(\"bat\", 8, \"yz\")  \u003d \"batyzyzy\"\n     * StringUtils.rightPad(\"bat\", 1, \"yz\")  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", -1, \"yz\") \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", 5, null)  \u003d \"bat  \"\n     * StringUtils.rightPad(\"bat\", 5, \"\")    \u003d \"bat  \"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @param padStr  the String to pad with, null or empty treated as single space\n     * @return right padded String or original String if no padding is necessary,\n     *  {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 5158,col 9)-(line 5160,col 9)",
        "(line 5161,col 9)-(line 5163,col 9)",
        "(line 5164,col 9)-(line 5164,col 37)",
        "(line 5165,col 9)-(line 5165,col 34)",
        "(line 5166,col 9)-(line 5166,col 33)",
        "(line 5167,col 9)-(line 5169,col 9)",
        "(line 5170,col 9)-(line 5172,col 9)",
        "(line 5174,col 9)-(line 5185,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.leftPad(java.lang.String, int)",
      "begin_line": 5207,
      "end_line": 5209,
      "comment": "\n     * \u003cp\u003eLeft pad a String with spaces (\u0027 \u0027).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is padded to the size of {@code size}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.leftPad(null, *)   \u003d null\n     * StringUtils.leftPad(\"\", 3)     \u003d \"   \"\n     * StringUtils.leftPad(\"bat\", 3)  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", 5)  \u003d \"  bat\"\n     * StringUtils.leftPad(\"bat\", 1)  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", -1) \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @return left padded String or original String if no padding is necessary,\n     *  {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 5208,col 9)-(line 5208,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.leftPad(java.lang.String, int, char)",
      "begin_line": 5232,
      "end_line": 5244,
      "comment": "\n     * \u003cp\u003eLeft pad a String with a specified character.\u003c/p\u003e\n     *\n     * \u003cp\u003ePad to a size of {@code size}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.leftPad(null, *, *)     \u003d null\n     * StringUtils.leftPad(\"\", 3, \u0027z\u0027)     \u003d \"zzz\"\n     * StringUtils.leftPad(\"bat\", 3, \u0027z\u0027)  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", 5, \u0027z\u0027)  \u003d \"zzbat\"\n     * StringUtils.leftPad(\"bat\", 1, \u0027z\u0027)  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", -1, \u0027z\u0027) \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @param padChar  the character to pad with\n     * @return left padded String or original String if no padding is necessary,\n     *  {@code null} if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 5233,col 9)-(line 5235,col 9)",
        "(line 5236,col 9)-(line 5236,col 39)",
        "(line 5237,col 9)-(line 5239,col 9)",
        "(line 5240,col 9)-(line 5242,col 9)",
        "(line 5243,col 9)-(line 5243,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.leftPad(java.lang.String, int, java.lang.String)",
      "begin_line": 5269,
      "end_line": 5298,
      "comment": "\n     * \u003cp\u003eLeft pad a String with a specified String.\u003c/p\u003e\n     *\n     * \u003cp\u003ePad to a size of {@code size}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.leftPad(null, *, *)      \u003d null\n     * StringUtils.leftPad(\"\", 3, \"z\")      \u003d \"zzz\"\n     * StringUtils.leftPad(\"bat\", 3, \"yz\")  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", 5, \"yz\")  \u003d \"yzbat\"\n     * StringUtils.leftPad(\"bat\", 8, \"yz\")  \u003d \"yzyzybat\"\n     * StringUtils.leftPad(\"bat\", 1, \"yz\")  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", -1, \"yz\") \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", 5, null)  \u003d \"  bat\"\n     * StringUtils.leftPad(\"bat\", 5, \"\")    \u003d \"  bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @param padStr  the String to pad with, null or empty treated as single space\n     * @return left padded String or original String if no padding is necessary,\n     *  {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 5270,col 9)-(line 5272,col 9)",
        "(line 5273,col 9)-(line 5275,col 9)",
        "(line 5276,col 9)-(line 5276,col 37)",
        "(line 5277,col 9)-(line 5277,col 34)",
        "(line 5278,col 9)-(line 5278,col 33)",
        "(line 5279,col 9)-(line 5281,col 9)",
        "(line 5282,col 9)-(line 5284,col 9)",
        "(line 5286,col 9)-(line 5297,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.length(java.lang.CharSequence)",
      "begin_line": 5311,
      "end_line": 5313,
      "comment": "\n     * Gets a CharSequence length or {@code 0} if the CharSequence is\n     * {@code null}.\n     *\n     * @param cs\n     *            a CharSequence or {@code null}\n     * @return CharSequence length or {@code 0} if the CharSequence is\n     *         {@code null}.\n     * @since 2.4\n     * @since 3.0 Changed signature from length(String) to length(CharSequence)\n     ",
      "child_ranges": [
        "(line 5312,col 9)-(line 5312,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.center(java.lang.String, int)",
      "begin_line": 5340,
      "end_line": 5342,
      "comment": "\n     * \u003cp\u003eCenters a String in a larger String of size {@code size}\n     * using the space character (\u0027 \u0027).\u003cp\u003e\n     *\n     * \u003cp\u003eIf the size is less than the String length, the String is returned.\n     * A {@code null} String returns {@code null}.\n     * A negative size is treated as zero.\u003c/p\u003e\n     *\n     * \u003cp\u003eEquivalent to {@code center(str, size, \" \")}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.center(null, *)   \u003d null\n     * StringUtils.center(\"\", 4)     \u003d \"    \"\n     * StringUtils.center(\"ab\", -1)  \u003d \"ab\"\n     * StringUtils.center(\"ab\", 4)   \u003d \" ab \"\n     * StringUtils.center(\"abcd\", 2) \u003d \"abcd\"\n     * StringUtils.center(\"a\", 4)    \u003d \" a  \"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to center, may be null\n     * @param size  the int size of new String, negative treated as zero\n     * @return centered String, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 5341,col 9)-(line 5341,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.center(java.lang.String, int, char)",
      "begin_line": 5368,
      "end_line": 5380,
      "comment": "\n     * \u003cp\u003eCenters a String in a larger String of size {@code size}.\n     * Uses a supplied character as the value to pad the String with.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the size is less than the String length, the String is returned.\n     * A {@code null} String returns {@code null}.\n     * A negative size is treated as zero.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.center(null, *, *)     \u003d null\n     * StringUtils.center(\"\", 4, \u0027 \u0027)     \u003d \"    \"\n     * StringUtils.center(\"ab\", -1, \u0027 \u0027)  \u003d \"ab\"\n     * StringUtils.center(\"ab\", 4, \u0027 \u0027)   \u003d \" ab \"\n     * StringUtils.center(\"abcd\", 2, \u0027 \u0027) \u003d \"abcd\"\n     * StringUtils.center(\"a\", 4, \u0027 \u0027)    \u003d \" a  \"\n     * StringUtils.center(\"a\", 4, \u0027y\u0027)    \u003d \"yayy\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to center, may be null\n     * @param size  the int size of new String, negative treated as zero\n     * @param padChar  the character to pad the new String with\n     * @return centered String, {@code null} if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 5369,col 9)-(line 5371,col 9)",
        "(line 5372,col 9)-(line 5372,col 34)",
        "(line 5373,col 9)-(line 5373,col 33)",
        "(line 5374,col 9)-(line 5376,col 9)",
        "(line 5377,col 9)-(line 5377,col 55)",
        "(line 5378,col 9)-(line 5378,col 43)",
        "(line 5379,col 9)-(line 5379,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.center(java.lang.String, int, java.lang.String)",
      "begin_line": 5408,
      "end_line": 5423,
      "comment": "\n     * \u003cp\u003eCenters a String in a larger String of size {@code size}.\n     * Uses a supplied String as the value to pad the String with.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the size is less than the String length, the String is returned.\n     * A {@code null} String returns {@code null}.\n     * A negative size is treated as zero.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.center(null, *, *)     \u003d null\n     * StringUtils.center(\"\", 4, \" \")     \u003d \"    \"\n     * StringUtils.center(\"ab\", -1, \" \")  \u003d \"ab\"\n     * StringUtils.center(\"ab\", 4, \" \")   \u003d \" ab \"\n     * StringUtils.center(\"abcd\", 2, \" \") \u003d \"abcd\"\n     * StringUtils.center(\"a\", 4, \" \")    \u003d \" a  \"\n     * StringUtils.center(\"a\", 4, \"yz\")   \u003d \"yayz\"\n     * StringUtils.center(\"abc\", 7, null) \u003d \"  abc  \"\n     * StringUtils.center(\"abc\", 7, \"\")   \u003d \"  abc  \"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to center, may be null\n     * @param size  the int size of new String, negative treated as zero\n     * @param padStr  the String to pad the new String with, must not be null or empty\n     * @return centered String, {@code null} if null String input\n     * @throws IllegalArgumentException if padStr is {@code null} or empty\n     ",
      "child_ranges": [
        "(line 5409,col 9)-(line 5411,col 9)",
        "(line 5412,col 9)-(line 5414,col 9)",
        "(line 5415,col 9)-(line 5415,col 34)",
        "(line 5416,col 9)-(line 5416,col 33)",
        "(line 5417,col 9)-(line 5419,col 9)",
        "(line 5420,col 9)-(line 5420,col 54)",
        "(line 5421,col 9)-(line 5421,col 42)",
        "(line 5422,col 9)-(line 5422,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.upperCase(java.lang.String)",
      "begin_line": 5446,
      "end_line": 5451,
      "comment": "\n     * \u003cp\u003eConverts a String to upper case as per {@link String#toUpperCase()}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.upperCase(null)  \u003d null\n     * StringUtils.upperCase(\"\")    \u003d \"\"\n     * StringUtils.upperCase(\"aBc\") \u003d \"ABC\"\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003e\u003cstrong\u003eNote:\u003c/strong\u003e As described in the documentation for {@link String#toUpperCase()},\n     * the result of this method is affected by the current locale.\n     * For platform-independent case transformations, the method {@link #lowerCase(String, Locale)}\n     * should be used with a specific locale (e.g. {@link Locale#ENGLISH}).\u003c/p\u003e\n     *\n     * @param str  the String to upper case, may be null\n     * @return the upper cased String, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 5447,col 9)-(line 5449,col 9)",
        "(line 5450,col 9)-(line 5450,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.upperCase(java.lang.String, java.util.Locale)",
      "begin_line": 5469,
      "end_line": 5474,
      "comment": "\n     * \u003cp\u003eConverts a String to upper case as per {@link String#toUpperCase(Locale)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.upperCase(null, Locale.ENGLISH)  \u003d null\n     * StringUtils.upperCase(\"\", Locale.ENGLISH)    \u003d \"\"\n     * StringUtils.upperCase(\"aBc\", Locale.ENGLISH) \u003d \"ABC\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to upper case, may be null\n     * @param locale  the locale that defines the case transformation rules, must not be null\n     * @return the upper cased String, {@code null} if null String input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 5470,col 9)-(line 5472,col 9)",
        "(line 5473,col 9)-(line 5473,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lowerCase(java.lang.String)",
      "begin_line": 5495,
      "end_line": 5500,
      "comment": "\n     * \u003cp\u003eConverts a String to lower case as per {@link String#toLowerCase()}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lowerCase(null)  \u003d null\n     * StringUtils.lowerCase(\"\")    \u003d \"\"\n     * StringUtils.lowerCase(\"aBc\") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003e\u003cstrong\u003eNote:\u003c/strong\u003e As described in the documentation for {@link String#toLowerCase()},\n     * the result of this method is affected by the current locale.\n     * For platform-independent case transformations, the method {@link #lowerCase(String, Locale)}\n     * should be used with a specific locale (e.g. {@link Locale#ENGLISH}).\u003c/p\u003e\n     *\n     * @param str  the String to lower case, may be null\n     * @return the lower cased String, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 5496,col 9)-(line 5498,col 9)",
        "(line 5499,col 9)-(line 5499,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lowerCase(java.lang.String, java.util.Locale)",
      "begin_line": 5518,
      "end_line": 5523,
      "comment": "\n     * \u003cp\u003eConverts a String to lower case as per {@link String#toLowerCase(Locale)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lowerCase(null, Locale.ENGLISH)  \u003d null\n     * StringUtils.lowerCase(\"\", Locale.ENGLISH)    \u003d \"\"\n     * StringUtils.lowerCase(\"aBc\", Locale.ENGLISH) \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to lower case, may be null\n     * @param locale  the locale that defines the case transformation rules, must not be null\n     * @return the lower cased String, {@code null} if null String input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 5519,col 9)-(line 5521,col 9)",
        "(line 5522,col 9)-(line 5522,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.capitalize(java.lang.String)",
      "begin_line": 5545,
      "end_line": 5554,
      "comment": "\n     * \u003cp\u003eCapitalizes a String changing the first letter to title case as\n     * per {@link Character#toTitleCase(char)}. No other letters are changed.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor a word based algorithm, see {@link org.apache.commons.lang3.text.WordUtils#capitalize(String)}.\n     * A {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.capitalize(null)  \u003d null\n     * StringUtils.capitalize(\"\")    \u003d \"\"\n     * StringUtils.capitalize(\"cat\") \u003d \"Cat\"\n     * StringUtils.capitalize(\"cAt\") \u003d \"CAt\"\n     * \u003c/pre\u003e\n     *\n     * @param str the String to capitalize, may be null\n     * @return the capitalized String, {@code null} if null String input\n     * @see org.apache.commons.lang3.text.WordUtils#capitalize(String)\n     * @see #uncapitalize(String)\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 5546,col 9)-(line 5546,col 19)",
        "(line 5547,col 9)-(line 5549,col 9)",
        "(line 5550,col 9)-(line 5553,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.uncapitalize(java.lang.String)",
      "begin_line": 5576,
      "end_line": 5585,
      "comment": "\n     * \u003cp\u003eUncapitalizes a String changing the first letter to title case as\n     * per {@link Character#toLowerCase(char)}. No other letters are changed.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor a word based algorithm, see {@link org.apache.commons.lang3.text.WordUtils#uncapitalize(String)}.\n     * A {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.uncapitalize(null)  \u003d null\n     * StringUtils.uncapitalize(\"\")    \u003d \"\"\n     * StringUtils.uncapitalize(\"Cat\") \u003d \"cat\"\n     * StringUtils.uncapitalize(\"CAT\") \u003d \"cAT\"\n     * \u003c/pre\u003e\n     *\n     * @param str the String to uncapitalize, may be null\n     * @return the uncapitalized String, {@code null} if null String input\n     * @see org.apache.commons.lang3.text.WordUtils#uncapitalize(String)\n     * @see #capitalize(String)\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 5577,col 9)-(line 5577,col 19)",
        "(line 5578,col 9)-(line 5580,col 9)",
        "(line 5581,col 9)-(line 5584,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.swapCase(java.lang.String)",
      "begin_line": 5614,
      "end_line": 5632,
      "comment": "\n     * \u003cp\u003eSwaps the case of a String changing upper and title case to\n     * lower case, and lower case to upper case.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     *  \u003cli\u003eUpper case character converts to Lower case\u003c/li\u003e\n     *  \u003cli\u003eTitle case character converts to Lower case\u003c/li\u003e\n     *  \u003cli\u003eLower case character converts to Upper case\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eFor a word based algorithm, see {@link org.apache.commons.lang3.text.WordUtils#swapCase(String)}.\n     * A {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.swapCase(null)                 \u003d null\n     * StringUtils.swapCase(\"\")                   \u003d \"\"\n     * StringUtils.swapCase(\"The dog has a BONE\") \u003d \"tHE DOG HAS A bone\"\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eNOTE: This method changed in Lang version 2.0.\n     * It no longer performs a word based algorithm.\n     * If you only use ASCII, you will notice no change.\n     * That functionality is available in org.apache.commons.lang3.text.WordUtils.\u003c/p\u003e\n     *\n     * @param str  the String to swap case, may be null\n     * @return the changed String, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 5615,col 9)-(line 5617,col 9)",
        "(line 5619,col 9)-(line 5619,col 42)",
        "(line 5621,col 9)-(line 5630,col 9)",
        "(line 5631,col 9)-(line 5631,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.countMatches(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 5656,
      "end_line": 5667,
      "comment": "\n     * \u003cp\u003eCounts how many times the substring appears in the larger string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} or empty (\"\") String input returns {@code 0}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.countMatches(null, *)       \u003d 0\n     * StringUtils.countMatches(\"\", *)         \u003d 0\n     * StringUtils.countMatches(\"abba\", null)  \u003d 0\n     * StringUtils.countMatches(\"abba\", \"\")    \u003d 0\n     * StringUtils.countMatches(\"abba\", \"a\")   \u003d 2\n     * StringUtils.countMatches(\"abba\", \"ab\")  \u003d 1\n     * StringUtils.countMatches(\"abba\", \"xxx\") \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param str  the CharSequence to check, may be null\n     * @param sub  the substring to count, may be null\n     * @return the number of occurrences, 0 if either CharSequence is {@code null}\n     * @since 3.0 Changed signature from countMatches(String, String) to countMatches(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 5657,col 9)-(line 5659,col 9)",
        "(line 5660,col 9)-(line 5660,col 22)",
        "(line 5661,col 9)-(line 5661,col 20)",
        "(line 5662,col 9)-(line 5665,col 9)",
        "(line 5666,col 9)-(line 5666,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAlpha(java.lang.CharSequence)",
      "begin_line": 5691,
      "end_line": 5702,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only Unicode letters.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null} will return {@code false}.\n     * An empty CharSequence (length()\u003d0) will return {@code false}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAlpha(null)   \u003d false\n     * StringUtils.isAlpha(\"\")     \u003d false\n     * StringUtils.isAlpha(\"  \")   \u003d false\n     * StringUtils.isAlpha(\"abc\")  \u003d true\n     * StringUtils.isAlpha(\"ab2c\") \u003d false\n     * StringUtils.isAlpha(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return {@code true} if only contains letters, and is non-null\n     * @since 3.0 Changed signature from isAlpha(String) to isAlpha(CharSequence)\n     * @since 3.0 Changed \"\" to return false and not true\n     ",
      "child_ranges": [
        "(line 5692,col 9)-(line 5694,col 9)",
        "(line 5695,col 9)-(line 5695,col 29)",
        "(line 5696,col 9)-(line 5700,col 9)",
        "(line 5701,col 9)-(line 5701,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAlphaSpace(java.lang.CharSequence)",
      "begin_line": 5726,
      "end_line": 5737,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only Unicode letters and\n     * space (\u0027 \u0027).\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null} will return {@code false}\n     * An empty CharSequence (length()\u003d0) will return {@code true}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAlphaSpace(null)   \u003d false\n     * StringUtils.isAlphaSpace(\"\")     \u003d true\n     * StringUtils.isAlphaSpace(\"  \")   \u003d true\n     * StringUtils.isAlphaSpace(\"abc\")  \u003d true\n     * StringUtils.isAlphaSpace(\"ab c\") \u003d true\n     * StringUtils.isAlphaSpace(\"ab2c\") \u003d false\n     * StringUtils.isAlphaSpace(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return {@code true} if only contains letters and space,\n     *  and is non-null\n     * @since 3.0 Changed signature from isAlphaSpace(String) to isAlphaSpace(CharSequence)\n     ",
      "child_ranges": [
        "(line 5727,col 9)-(line 5729,col 9)",
        "(line 5730,col 9)-(line 5730,col 29)",
        "(line 5731,col 9)-(line 5735,col 9)",
        "(line 5736,col 9)-(line 5736,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAlphanumeric(java.lang.CharSequence)",
      "begin_line": 5761,
      "end_line": 5772,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only Unicode letters or digits.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null} will return {@code false}.\n     * An empty CharSequence (length()\u003d0) will return {@code false}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAlphanumeric(null)   \u003d false\n     * StringUtils.isAlphanumeric(\"\")     \u003d false\n     * StringUtils.isAlphanumeric(\"  \")   \u003d false\n     * StringUtils.isAlphanumeric(\"abc\")  \u003d true\n     * StringUtils.isAlphanumeric(\"ab c\") \u003d false\n     * StringUtils.isAlphanumeric(\"ab2c\") \u003d true\n     * StringUtils.isAlphanumeric(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return {@code true} if only contains letters or digits,\n     *  and is non-null\n     * @since 3.0 Changed signature from isAlphanumeric(String) to isAlphanumeric(CharSequence)\n     * @since 3.0 Changed \"\" to return false and not true\n     ",
      "child_ranges": [
        "(line 5762,col 9)-(line 5764,col 9)",
        "(line 5765,col 9)-(line 5765,col 29)",
        "(line 5766,col 9)-(line 5770,col 9)",
        "(line 5771,col 9)-(line 5771,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAlphanumericSpace(java.lang.CharSequence)",
      "begin_line": 5796,
      "end_line": 5807,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only Unicode letters, digits\n     * or space ({@code \u0027 \u0027}).\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null} will return {@code false}.\n     * An empty CharSequence (length()\u003d0) will return {@code true}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAlphanumericSpace(null)   \u003d false\n     * StringUtils.isAlphanumericSpace(\"\")     \u003d true\n     * StringUtils.isAlphanumericSpace(\"  \")   \u003d true\n     * StringUtils.isAlphanumericSpace(\"abc\")  \u003d true\n     * StringUtils.isAlphanumericSpace(\"ab c\") \u003d true\n     * StringUtils.isAlphanumericSpace(\"ab2c\") \u003d true\n     * StringUtils.isAlphanumericSpace(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return {@code true} if only contains letters, digits or space,\n     *  and is non-null\n     * @since 3.0 Changed signature from isAlphanumericSpace(String) to isAlphanumericSpace(CharSequence)\n     ",
      "child_ranges": [
        "(line 5797,col 9)-(line 5799,col 9)",
        "(line 5800,col 9)-(line 5800,col 29)",
        "(line 5801,col 9)-(line 5805,col 9)",
        "(line 5806,col 9)-(line 5806,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAsciiPrintable(java.lang.CharSequence)",
      "begin_line": 5835,
      "end_line": 5846,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only ASCII printable characters.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null} will return {@code false}.\n     * An empty CharSequence (length()\u003d0) will return {@code true}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAsciiPrintable(null)     \u003d false\n     * StringUtils.isAsciiPrintable(\"\")       \u003d true\n     * StringUtils.isAsciiPrintable(\" \")      \u003d true\n     * StringUtils.isAsciiPrintable(\"Ceki\")   \u003d true\n     * StringUtils.isAsciiPrintable(\"ab2c\")   \u003d true\n     * StringUtils.isAsciiPrintable(\"!ab-c~\") \u003d true\n     * StringUtils.isAsciiPrintable(\"\\u0020\") \u003d true\n     * StringUtils.isAsciiPrintable(\"\\u0021\") \u003d true\n     * StringUtils.isAsciiPrintable(\"\\u007e\") \u003d true\n     * StringUtils.isAsciiPrintable(\"\\u007f\") \u003d false\n     * StringUtils.isAsciiPrintable(\"Ceki G\\u00fclc\\u00fc\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs the CharSequence to check, may be null\n     * @return {@code true} if every character is in the range\n     *  32 thru 126\n     * @since 2.1\n     * @since 3.0 Changed signature from isAsciiPrintable(String) to isAsciiPrintable(CharSequence)\n     ",
      "child_ranges": [
        "(line 5836,col 9)-(line 5838,col 9)",
        "(line 5839,col 9)-(line 5839,col 29)",
        "(line 5840,col 9)-(line 5844,col 9)",
        "(line 5845,col 9)-(line 5845,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isNumeric(java.lang.CharSequence)",
      "begin_line": 5878,
      "end_line": 5889,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only Unicode digits.\n     * A decimal point is not a Unicode digit and returns false.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null} will return {@code false}.\n     * An empty CharSequence (length()\u003d0) will return {@code false}.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote that the method does not allow for a leading sign, either positive or negative.\n     * Also, if a String passes the numeric test, it may still generate a NumberFormatException\n     * when parsed by Integer.parseInt or Long.parseLong, e.g. if the value is outside the range\n     * for int or long respectively.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isNumeric(null)   \u003d false\n     * StringUtils.isNumeric(\"\")     \u003d false\n     * StringUtils.isNumeric(\"  \")   \u003d false\n     * StringUtils.isNumeric(\"123\")  \u003d true\n     * StringUtils.isNumeric(\"12 3\") \u003d false\n     * StringUtils.isNumeric(\"ab2c\") \u003d false\n     * StringUtils.isNumeric(\"12-3\") \u003d false\n     * StringUtils.isNumeric(\"12.3\") \u003d false\n     * StringUtils.isNumeric(\"-123\") \u003d false\n     * StringUtils.isNumeric(\"+123\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return {@code true} if only contains digits, and is non-null\n     * @since 3.0 Changed signature from isNumeric(String) to isNumeric(CharSequence)\n     * @since 3.0 Changed \"\" to return false and not true\n     ",
      "child_ranges": [
        "(line 5879,col 9)-(line 5881,col 9)",
        "(line 5882,col 9)-(line 5882,col 29)",
        "(line 5883,col 9)-(line 5887,col 9)",
        "(line 5888,col 9)-(line 5888,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isNumericSpace(java.lang.CharSequence)",
      "begin_line": 5915,
      "end_line": 5926,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only Unicode digits or space\n     * ({@code \u0027 \u0027}).\n     * A decimal point is not a Unicode digit and returns false.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null} will return {@code false}.\n     * An empty CharSequence (length()\u003d0) will return {@code true}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isNumericSpace(null)   \u003d false\n     * StringUtils.isNumericSpace(\"\")     \u003d true\n     * StringUtils.isNumericSpace(\"  \")   \u003d true\n     * StringUtils.isNumericSpace(\"123\")  \u003d true\n     * StringUtils.isNumericSpace(\"12 3\") \u003d true\n     * StringUtils.isNumericSpace(\"ab2c\") \u003d false\n     * StringUtils.isNumericSpace(\"12-3\") \u003d false\n     * StringUtils.isNumericSpace(\"12.3\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return {@code true} if only contains digits or space,\n     *  and is non-null\n     * @since 3.0 Changed signature from isNumericSpace(String) to isNumericSpace(CharSequence)\n     ",
      "child_ranges": [
        "(line 5916,col 9)-(line 5918,col 9)",
        "(line 5919,col 9)-(line 5919,col 29)",
        "(line 5920,col 9)-(line 5924,col 9)",
        "(line 5925,col 9)-(line 5925,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isWhitespace(java.lang.CharSequence)",
      "begin_line": 5948,
      "end_line": 5959,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only whitespace.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null} will return {@code false}.\n     * An empty CharSequence (length()\u003d0) will return {@code true}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isWhitespace(null)   \u003d false\n     * StringUtils.isWhitespace(\"\")     \u003d true\n     * StringUtils.isWhitespace(\"  \")   \u003d true\n     * StringUtils.isWhitespace(\"abc\")  \u003d false\n     * StringUtils.isWhitespace(\"ab2c\") \u003d false\n     * StringUtils.isWhitespace(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return {@code true} if only contains whitespace, and is non-null\n     * @since 2.0\n     * @since 3.0 Changed signature from isWhitespace(String) to isWhitespace(CharSequence)\n     ",
      "child_ranges": [
        "(line 5949,col 9)-(line 5951,col 9)",
        "(line 5952,col 9)-(line 5952,col 29)",
        "(line 5953,col 9)-(line 5957,col 9)",
        "(line 5958,col 9)-(line 5958,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAllLowerCase(java.lang.CharSequence)",
      "begin_line": 5980,
      "end_line": 5991,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only lowercase characters.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null} will return {@code false}.\n     * An empty CharSequence (length()\u003d0) will return {@code false}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAllLowerCase(null)   \u003d false\n     * StringUtils.isAllLowerCase(\"\")     \u003d false\n     * StringUtils.isAllLowerCase(\"  \")   \u003d false\n     * StringUtils.isAllLowerCase(\"abc\")  \u003d true\n     * StringUtils.isAllLowerCase(\"abC\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return {@code true} if only contains lowercase characters, and is non-null\n     * @since 2.5\n     * @since 3.0 Changed signature from isAllLowerCase(String) to isAllLowerCase(CharSequence)\n     ",
      "child_ranges": [
        "(line 5981,col 9)-(line 5983,col 9)",
        "(line 5984,col 9)-(line 5984,col 29)",
        "(line 5985,col 9)-(line 5989,col 9)",
        "(line 5990,col 9)-(line 5990,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAllUpperCase(java.lang.CharSequence)",
      "begin_line": 6012,
      "end_line": 6023,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only uppercase characters.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null} will return {@code false}.\n     * An empty String (length()\u003d0) will return {@code false}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAllUpperCase(null)   \u003d false\n     * StringUtils.isAllUpperCase(\"\")     \u003d false\n     * StringUtils.isAllUpperCase(\"  \")   \u003d false\n     * StringUtils.isAllUpperCase(\"ABC\")  \u003d true\n     * StringUtils.isAllUpperCase(\"aBC\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs the CharSequence to check, may be null\n     * @return {@code true} if only contains uppercase characters, and is non-null\n     * @since 2.5\n     * @since 3.0 Changed signature from isAllUpperCase(String) to isAllUpperCase(CharSequence)\n     ",
      "child_ranges": [
        "(line 6013,col 9)-(line 6015,col 9)",
        "(line 6016,col 9)-(line 6016,col 29)",
        "(line 6017,col 9)-(line 6021,col 9)",
        "(line 6022,col 9)-(line 6022,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.defaultString(java.lang.String)",
      "begin_line": 6043,
      "end_line": 6045,
      "comment": "\n     * \u003cp\u003eReturns either the passed in String,\n     * or if the String is {@code null}, an empty String (\"\").\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.defaultString(null)  \u003d \"\"\n     * StringUtils.defaultString(\"\")    \u003d \"\"\n     * StringUtils.defaultString(\"bat\") \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @see ObjectUtils#toString(Object)\n     * @see String#valueOf(Object)\n     * @param str  the String to check, may be null\n     * @return the passed in String, or the empty String if it\n     *  was {@code null}\n     ",
      "child_ranges": [
        "(line 6044,col 9)-(line 6044,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.defaultString(java.lang.String, java.lang.String)",
      "begin_line": 6064,
      "end_line": 6066,
      "comment": "\n     * \u003cp\u003eReturns either the passed in String, or if the String is\n     * {@code null}, the value of {@code defaultStr}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.defaultString(null, \"NULL\")  \u003d \"NULL\"\n     * StringUtils.defaultString(\"\", \"NULL\")    \u003d \"\"\n     * StringUtils.defaultString(\"bat\", \"NULL\") \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @see ObjectUtils#toString(Object,String)\n     * @see String#valueOf(Object)\n     * @param str  the String to check, may be null\n     * @param defaultStr  the default String to return\n     *  if the input is {@code null}, may be null\n     * @return the passed in String, or the default if it was {@code null}\n     ",
      "child_ranges": [
        "(line 6065,col 9)-(line 6065,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.defaultIfBlank(T, T)",
      "begin_line": 6086,
      "end_line": 6088,
      "comment": "\n     * \u003cp\u003eReturns either the passed in CharSequence, or if the CharSequence is\n     * whitespace, empty (\"\") or {@code null}, the value of {@code defaultStr}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.defaultIfBlank(null, \"NULL\")  \u003d \"NULL\"\n     * StringUtils.defaultIfBlank(\"\", \"NULL\")    \u003d \"NULL\"\n     * StringUtils.defaultIfBlank(\" \", \"NULL\")   \u003d \"NULL\"\n     * StringUtils.defaultIfBlank(\"bat\", \"NULL\") \u003d \"bat\"\n     * StringUtils.defaultIfBlank(\"\", null)      \u003d null\n     * \u003c/pre\u003e\n     * @param \u003cT\u003e the specific kind of CharSequence\n     * @param str the CharSequence to check, may be null\n     * @param defaultStr  the default CharSequence to return\n     *  if the input is whitespace, empty (\"\") or {@code null}, may be null\n     * @return the passed in CharSequence, or the default\n     * @see StringUtils#defaultString(String, String)\n     ",
      "child_ranges": [
        "(line 6087,col 9)-(line 6087,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.defaultIfEmpty(T, T)",
      "begin_line": 6108,
      "end_line": 6110,
      "comment": "\n     * \u003cp\u003eReturns either the passed in CharSequence, or if the CharSequence is\n     * empty or {@code null}, the value of {@code defaultStr}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.defaultIfEmpty(null, \"NULL\")  \u003d \"NULL\"\n     * StringUtils.defaultIfEmpty(\"\", \"NULL\")    \u003d \"NULL\"\n     * StringUtils.defaultIfEmpty(\" \", \"NULL\")   \u003d \" \"\n     * StringUtils.defaultIfEmpty(\"bat\", \"NULL\") \u003d \"bat\"\n     * StringUtils.defaultIfEmpty(\"\", null)      \u003d null\n     * \u003c/pre\u003e\n     * @param \u003cT\u003e the specific kind of CharSequence\n     * @param str  the CharSequence to check, may be null\n     * @param defaultStr  the default CharSequence to return\n     *  if the input is empty (\"\") or {@code null}, may be null\n     * @return the passed in CharSequence, or the default\n     * @see StringUtils#defaultString(String, String)\n     ",
      "child_ranges": [
        "(line 6109,col 9)-(line 6109,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.reverse(java.lang.String)",
      "begin_line": 6128,
      "end_line": 6133,
      "comment": "\n     * \u003cp\u003eReverses a String as per {@link StringBuilder#reverse()}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.reverse(null)  \u003d null\n     * StringUtils.reverse(\"\")    \u003d \"\"\n     * StringUtils.reverse(\"bat\") \u003d \"tab\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to reverse, may be null\n     * @return the reversed String, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 6129,col 9)-(line 6131,col 9)",
        "(line 6132,col 9)-(line 6132,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.reverseDelimited(java.lang.String, char)",
      "begin_line": 6154,
      "end_line": 6163,
      "comment": "\n     * \u003cp\u003eReverses a String that is delimited by a specific character.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe Strings between the delimiters are not reversed.\n     * Thus java.lang.String becomes String.lang.java (if the delimiter\n     * is {@code \u0027.\u0027}).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.reverseDelimited(null, *)      \u003d null\n     * StringUtils.reverseDelimited(\"\", *)        \u003d \"\"\n     * StringUtils.reverseDelimited(\"a.b.c\", \u0027x\u0027) \u003d \"a.b.c\"\n     * StringUtils.reverseDelimited(\"a.b.c\", \".\") \u003d \"c.b.a\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to reverse, may be null\n     * @param separatorChar  the separator character to use\n     * @return the reversed String, {@code null} if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 6155,col 9)-(line 6157,col 9)",
        "(line 6160,col 9)-(line 6160,col 50)",
        "(line 6161,col 9)-(line 6161,col 33)",
        "(line 6162,col 9)-(line 6162,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.abbreviate(java.lang.String, int)",
      "begin_line": 6199,
      "end_line": 6201,
      "comment": "\n     * \u003cp\u003eAbbreviates a String using ellipses. This will turn\n     * \"Now is the time for all good men\" into \"Now is the time for...\"\u003c/p\u003e\n     *\n     * \u003cp\u003eSpecifically:\n     * \u003cul\u003e\n     *   \u003cli\u003eIf {@code str} is less than {@code maxWidth} characters\n     *       long, return it.\u003c/li\u003e\n     *   \u003cli\u003eElse abbreviate it to {@code (substring(str, 0, max-3) + \"...\")}.\u003c/li\u003e\n     *   \u003cli\u003eIf {@code maxWidth} is less than {@code 4}, throw an\n     *       {@code IllegalArgumentException}.\u003c/li\u003e\n     *   \u003cli\u003eIn no case will it return a String of length greater than\n     *       {@code maxWidth}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.abbreviate(null, *)      \u003d null\n     * StringUtils.abbreviate(\"\", 4)        \u003d \"\"\n     * StringUtils.abbreviate(\"abcdefg\", 6) \u003d \"abc...\"\n     * StringUtils.abbreviate(\"abcdefg\", 7) \u003d \"abcdefg\"\n     * StringUtils.abbreviate(\"abcdefg\", 8) \u003d \"abcdefg\"\n     * StringUtils.abbreviate(\"abcdefg\", 4) \u003d \"a...\"\n     * StringUtils.abbreviate(\"abcdefg\", 3) \u003d IllegalArgumentException\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param maxWidth  maximum length of result String, must be at least 4\n     * @return abbreviated String, {@code null} if null String input\n     * @throws IllegalArgumentException if the width is too small\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 6200,col 9)-(line 6200,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.abbreviate(java.lang.String, int, int)",
      "begin_line": 6238,
      "end_line": 6265,
      "comment": "\n     * \u003cp\u003eAbbreviates a String using ellipses. This will turn\n     * \"Now is the time for all good men\" into \"...is the time for...\"\u003c/p\u003e\n     *\n     * \u003cp\u003eWorks like {@code abbreviate(String, int)}, but allows you to specify\n     * a \"left edge\" offset.  Note that this left edge is not necessarily going to\n     * be the leftmost character in the result, or the first character following the\n     * ellipses, but it will appear somewhere in the result.\n     *\n     * \u003cp\u003eIn no case will it return a String of length greater than\n     * {@code maxWidth}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.abbreviate(null, *, *)                \u003d null\n     * StringUtils.abbreviate(\"\", 0, 4)                  \u003d \"\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", -1, 10) \u003d \"abcdefg...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 0, 10)  \u003d \"abcdefg...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 1, 10)  \u003d \"abcdefg...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 4, 10)  \u003d \"abcdefg...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 5, 10)  \u003d \"...fghi...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 6, 10)  \u003d \"...ghij...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 8, 10)  \u003d \"...ijklmno\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 10, 10) \u003d \"...ijklmno\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 12, 10) \u003d \"...ijklmno\"\n     * StringUtils.abbreviate(\"abcdefghij\", 0, 3)        \u003d IllegalArgumentException\n     * StringUtils.abbreviate(\"abcdefghij\", 5, 6)        \u003d IllegalArgumentException\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param offset  left edge of source String\n     * @param maxWidth  maximum length of result String, must be at least 4\n     * @return abbreviated String, {@code null} if null String input\n     * @throws IllegalArgumentException if the width is too small\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 6239,col 9)-(line 6241,col 9)",
        "(line 6242,col 9)-(line 6244,col 9)",
        "(line 6245,col 9)-(line 6247,col 9)",
        "(line 6248,col 9)-(line 6250,col 9)",
        "(line 6251,col 9)-(line 6253,col 9)",
        "(line 6254,col 9)-(line 6254,col 41)",
        "(line 6255,col 9)-(line 6257,col 9)",
        "(line 6258,col 9)-(line 6260,col 9)",
        "(line 6261,col 9)-(line 6263,col 9)",
        "(line 6264,col 9)-(line 6264,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.abbreviateMiddle(java.lang.String, java.lang.String, int)",
      "begin_line": 6296,
      "end_line": 6315,
      "comment": "\n     * \u003cp\u003eAbbreviates a String to the length passed, replacing the middle characters with the supplied\n     * replacement String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis abbreviation only occurs if the following criteria is met:\n     * \u003cul\u003e\n     * \u003cli\u003eNeither the String for abbreviation nor the replacement String are null or empty \u003c/li\u003e\n     * \u003cli\u003eThe length to truncate to is less than the length of the supplied String\u003c/li\u003e\n     * \u003cli\u003eThe length to truncate to is greater than 0\u003c/li\u003e\n     * \u003cli\u003eThe abbreviated String will have enough room for the length supplied replacement String\n     * and the first and last characters of the supplied String for abbreviation\u003c/li\u003e\n     * \u003c/ul\u003e\n     * Otherwise, the returned String will be the same as the supplied String for abbreviation.\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.abbreviateMiddle(null, null, 0)      \u003d null\n     * StringUtils.abbreviateMiddle(\"abc\", null, 0)      \u003d \"abc\"\n     * StringUtils.abbreviateMiddle(\"abc\", \".\", 0)      \u003d \"abc\"\n     * StringUtils.abbreviateMiddle(\"abc\", \".\", 3)      \u003d \"abc\"\n     * StringUtils.abbreviateMiddle(\"abcdef\", \".\", 4)     \u003d \"ab.f\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to abbreviate, may be null\n     * @param middle the String to replace the middle characters with, may be null\n     * @param length the length to abbreviate {@code str} to.\n     * @return the abbreviated String if the above criteria is met, or the original String supplied for abbreviation.\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 6297,col 9)-(line 6299,col 9)",
        "(line 6301,col 9)-(line 6303,col 9)",
        "(line 6305,col 9)-(line 6305,col 49)",
        "(line 6306,col 9)-(line 6306,col 54)",
        "(line 6307,col 9)-(line 6307,col 51)",
        "(line 6309,col 9)-(line 6309,col 58)",
        "(line 6310,col 9)-(line 6310,col 53)",
        "(line 6311,col 9)-(line 6311,col 31)",
        "(line 6312,col 9)-(line 6312,col 49)",
        "(line 6314,col 9)-(line 6314,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.difference(java.lang.String, java.lang.String)",
      "begin_line": 6344,
      "end_line": 6356,
      "comment": "\n     * \u003cp\u003eCompares two Strings, and returns the portion where they differ.\n     * (More precisely, return the remainder of the second String,\n     * starting from where it\u0027s different from the first.)\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example,\n     * {@code difference(\"i am a machine\", \"i am a robot\") -\u003e \"robot\"}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.difference(null, null) \u003d null\n     * StringUtils.difference(\"\", \"\") \u003d \"\"\n     * StringUtils.difference(\"\", \"abc\") \u003d \"abc\"\n     * StringUtils.difference(\"abc\", \"\") \u003d \"\"\n     * StringUtils.difference(\"abc\", \"abc\") \u003d \"\"\n     * StringUtils.difference(\"ab\", \"abxyz\") \u003d \"xyz\"\n     * StringUtils.difference(\"abcde\", \"abxyz\") \u003d \"xyz\"\n     * StringUtils.difference(\"abcde\", \"xyz\") \u003d \"xyz\"\n     * \u003c/pre\u003e\n     *\n     * @param str1  the first String, may be null\n     * @param str2  the second String, may be null\n     * @return the portion of str2 where it differs from str1; returns the\n     * empty String if they are equal\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 6345,col 9)-(line 6347,col 9)",
        "(line 6348,col 9)-(line 6350,col 9)",
        "(line 6351,col 9)-(line 6351,col 47)",
        "(line 6352,col 9)-(line 6354,col 9)",
        "(line 6355,col 9)-(line 6355,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfDifference(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 6383,
      "end_line": 6400,
      "comment": "\n     * \u003cp\u003eCompares two CharSequences, and returns the index at which the\n     * CharSequences begin to differ.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example,\n     * {@code indexOfDifference(\"i am a machine\", \"i am a robot\") -\u003e 7}\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfDifference(null, null) \u003d -1\n     * StringUtils.indexOfDifference(\"\", \"\") \u003d -1\n     * StringUtils.indexOfDifference(\"\", \"abc\") \u003d 0\n     * StringUtils.indexOfDifference(\"abc\", \"\") \u003d 0\n     * StringUtils.indexOfDifference(\"abc\", \"abc\") \u003d -1\n     * StringUtils.indexOfDifference(\"ab\", \"abxyz\") \u003d 2\n     * StringUtils.indexOfDifference(\"abcde\", \"abxyz\") \u003d 2\n     * StringUtils.indexOfDifference(\"abcde\", \"xyz\") \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param cs1  the first CharSequence, may be null\n     * @param cs2  the second CharSequence, may be null\n     * @return the index where cs1 and cs2 begin to differ; -1 if they are equal\n     * @since 2.0\n     * @since 3.0 Changed signature from indexOfDifference(String, String) to\n     * indexOfDifference(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 6384,col 9)-(line 6386,col 9)",
        "(line 6387,col 9)-(line 6389,col 9)",
        "(line 6390,col 9)-(line 6390,col 14)",
        "(line 6391,col 9)-(line 6395,col 9)",
        "(line 6396,col 9)-(line 6398,col 9)",
        "(line 6399,col 9)-(line 6399,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfDifference(java.lang.CharSequence...)",
      "begin_line": 6434,
      "end_line": 6490,
      "comment": "\n     * \u003cp\u003eCompares all CharSequences in an array and returns the index at which the\n     * CharSequences begin to differ.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example,\n     * \u003ccode\u003eindexOfDifference(new String[] {\"i am a machine\", \"i am a robot\"}) -\u003e 7\u003c/code\u003e\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfDifference(null) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {}) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {\"abc\"}) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {null, null}) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {\"\", \"\"}) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {\"\", null}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"abc\", null, null}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {null, null, \"abc\"}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"\", \"abc\"}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"abc\", \"\"}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"abc\", \"abc\"}) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {\"abc\", \"a\"}) \u003d 1\n     * StringUtils.indexOfDifference(new String[] {\"ab\", \"abxyz\"}) \u003d 2\n     * StringUtils.indexOfDifference(new String[] {\"abcde\", \"abxyz\"}) \u003d 2\n     * StringUtils.indexOfDifference(new String[] {\"abcde\", \"xyz\"}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"xyz\", \"abcde\"}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"i am a machine\", \"i am a robot\"}) \u003d 7\n     * \u003c/pre\u003e\n     *\n     * @param css  array of CharSequences, entries may be null\n     * @return the index where the strings begin to differ; -1 if they are all equal\n     * @since 2.4\n     * @since 3.0 Changed signature from indexOfDifference(String...) to indexOfDifference(CharSequence...)\n     ",
      "child_ranges": [
        "(line 6435,col 9)-(line 6437,col 9)",
        "(line 6438,col 9)-(line 6438,col 38)",
        "(line 6439,col 9)-(line 6439,col 38)",
        "(line 6440,col 9)-(line 6440,col 34)",
        "(line 6441,col 9)-(line 6441,col 47)",
        "(line 6442,col 9)-(line 6442,col 30)",
        "(line 6447,col 9)-(line 6456,col 9)",
        "(line 6459,col 9)-(line 6461,col 9)",
        "(line 6464,col 9)-(line 6466,col 9)",
        "(line 6469,col 9)-(line 6469,col 27)",
        "(line 6470,col 9)-(line 6481,col 9)",
        "(line 6483,col 9)-(line 6488,col 9)",
        "(line 6489,col 9)-(line 6489,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.getCommonPrefix(java.lang.String...)",
      "begin_line": 6525,
      "end_line": 6543,
      "comment": "\n     * \u003cp\u003eCompares all Strings in an array and returns the initial sequence of\n     * characters that is common to all of them.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example,\n     * \u003ccode\u003egetCommonPrefix(new String[] {\"i am a machine\", \"i am a robot\"}) -\u003e \"i am a \"\u003c/code\u003e\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.getCommonPrefix(null) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"abc\"}) \u003d \"abc\"\n     * StringUtils.getCommonPrefix(new String[] {null, null}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"\", \"\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"\", null}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"abc\", null, null}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {null, null, \"abc\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"\", \"abc\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"abc\", \"\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"abc\", \"abc\"}) \u003d \"abc\"\n     * StringUtils.getCommonPrefix(new String[] {\"abc\", \"a\"}) \u003d \"a\"\n     * StringUtils.getCommonPrefix(new String[] {\"ab\", \"abxyz\"}) \u003d \"ab\"\n     * StringUtils.getCommonPrefix(new String[] {\"abcde\", \"abxyz\"}) \u003d \"ab\"\n     * StringUtils.getCommonPrefix(new String[] {\"abcde\", \"xyz\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"xyz\", \"abcde\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"i am a machine\", \"i am a robot\"}) \u003d \"i am a \"\n     * \u003c/pre\u003e\n     *\n     * @param strs  array of String objects, entries may be null\n     * @return the initial sequence of characters that are common to all Strings\n     * in the array; empty String if the array is null, the elements are all null\n     * or if there is no common prefix.\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 6526,col 9)-(line 6528,col 9)",
        "(line 6529,col 9)-(line 6529,col 58)",
        "(line 6530,col 9)-(line 6542,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.getLevenshteinDistance(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 6583,
      "end_line": 6658,
      "comment": "\n     * \u003cp\u003eFind the Levenshtein distance between two Strings.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is the number of changes needed to change one String into\n     * another, where each change is a single character modification (deletion,\n     * insertion or substitution).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe previous implementation of the Levenshtein distance algorithm\n     * was from \u003ca href\u003d\"http://www.merriampark.com/ld.htm\"\u003ehttp://www.merriampark.com/ld.htm\u003c/a\u003e\u003c/p\u003e\n     *\n     * \u003cp\u003eChas Emerick has written an implementation in Java, which avoids an OutOfMemoryError\n     * which can occur when my Java implementation is used with very large strings.\u003cbr\u003e\n     * This implementation of the Levenshtein distance algorithm\n     * is from \u003ca href\u003d\"http://www.merriampark.com/ldjava.htm\"\u003ehttp://www.merriampark.com/ldjava.htm\u003c/a\u003e\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.getLevenshteinDistance(null, *)             \u003d IllegalArgumentException\n     * StringUtils.getLevenshteinDistance(*, null)             \u003d IllegalArgumentException\n     * StringUtils.getLevenshteinDistance(\"\",\"\")               \u003d 0\n     * StringUtils.getLevenshteinDistance(\"\",\"a\")              \u003d 1\n     * StringUtils.getLevenshteinDistance(\"aaapppp\", \"\")       \u003d 7\n     * StringUtils.getLevenshteinDistance(\"frog\", \"fog\")       \u003d 1\n     * StringUtils.getLevenshteinDistance(\"fly\", \"ant\")        \u003d 3\n     * StringUtils.getLevenshteinDistance(\"elephant\", \"hippo\") \u003d 7\n     * StringUtils.getLevenshteinDistance(\"hippo\", \"elephant\") \u003d 7\n     * StringUtils.getLevenshteinDistance(\"hippo\", \"zzzzzzzz\") \u003d 8\n     * StringUtils.getLevenshteinDistance(\"hello\", \"hallo\")    \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @param s  the first String, must not be null\n     * @param t  the second String, must not be null\n     * @return result distance\n     * @throws IllegalArgumentException if either String input {@code null}\n     * @since 3.0 Changed signature from getLevenshteinDistance(String, String) to\n     * getLevenshteinDistance(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 6584,col 9)-(line 6586,col 9)",
        "(line 6605,col 9)-(line 6605,col 27)",
        "(line 6606,col 9)-(line 6606,col 27)",
        "(line 6608,col 9)-(line 6612,col 9)",
        "(line 6614,col 9)-(line 6621,col 9)",
        "(line 6623,col 9)-(line 6623,col 33)",
        "(line 6624,col 9)-(line 6624,col 33)",
        "(line 6625,col 9)-(line 6625,col 17)",
        "(line 6628,col 9)-(line 6628,col 14)",
        "(line 6629,col 9)-(line 6629,col 14)",
        "(line 6631,col 9)-(line 6631,col 17)",
        "(line 6633,col 9)-(line 6633,col 17)",
        "(line 6635,col 9)-(line 6637,col 9)",
        "(line 6639,col 9)-(line 6653,col 9)",
        "(line 6657,col 9)-(line 6657,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.getLevenshteinDistance(java.lang.CharSequence, java.lang.CharSequence, int)",
      "begin_line": 6692,
      "end_line": 6820,
      "comment": "\n     * \u003cp\u003eFind the Levenshtein distance between two Strings if it\u0027s less than or equal to a given \n     * threshold.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is the number of changes needed to change one String into\n     * another, where each change is a single character modification (deletion,\n     * insertion or substitution).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis implementation follows from Algorithms on Strings, Trees and Sequences by Dan Gusfield\n     * and Chas Emerick\u0027s implementation of the Levenshtein distance algorithm from\n     * \u003ca href\u003d\"http://www.merriampark.com/ld.htm\"\u003ehttp://www.merriampark.com/ld.htm\u003c/a\u003e\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.getLevenshteinDistance(null, *, *)             \u003d IllegalArgumentException\n     * StringUtils.getLevenshteinDistance(*, null, *)             \u003d IllegalArgumentException\n     * StringUtils.getLevenshteinDistance(*, *, -1)               \u003d IllegalArgumentException\n     * StringUtils.getLevenshteinDistance(\"\",\"\", 0)               \u003d 0\n     * StringUtils.getLevenshteinDistance(\"aaapppp\", \"\", 8)       \u003d 7\n     * StringUtils.getLevenshteinDistance(\"aaapppp\", \"\", 7)       \u003d 7\n     * StringUtils.getLevenshteinDistance(\"aaapppp\", \"\", 6))      \u003d -1\n     * StringUtils.getLevenshteinDistance(\"elephant\", \"hippo\", 7) \u003d 7\n     * StringUtils.getLevenshteinDistance(\"elephant\", \"hippo\", 6) \u003d -1\n     * StringUtils.getLevenshteinDistance(\"hippo\", \"elephant\", 7) \u003d 7\n     * StringUtils.getLevenshteinDistance(\"hippo\", \"elephant\", 6) \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param s  the first String, must not be null\n     * @param t  the second String, must not be null\n     * @param threshold the target threshold, must not be negative\n     * @return result distance, or {@code -1} if the distance would be greater than the threshold\n     * @throws IllegalArgumentException if either String input {@code null} or negative threshold\n     ",
      "child_ranges": [
        "(line 6693,col 9)-(line 6695,col 9)",
        "(line 6696,col 9)-(line 6698,col 9)",
        "(line 6744,col 9)-(line 6744,col 27)",
        "(line 6745,col 9)-(line 6745,col 27)",
        "(line 6748,col 9)-(line 6752,col 9)",
        "(line 6754,col 9)-(line 6761,col 9)",
        "(line 6763,col 9)-(line 6763,col 33)",
        "(line 6764,col 9)-(line 6764,col 33)",
        "(line 6765,col 9)-(line 6765,col 17)",
        "(line 6768,col 9)-(line 6768,col 50)",
        "(line 6769,col 9)-(line 6771,col 9)",
        "(line 6774,col 9)-(line 6774,col 62)",
        "(line 6775,col 9)-(line 6775,col 42)",
        "(line 6778,col 9)-(line 6811,col 9)",
        "(line 6815,col 9)-(line 6819,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.startsWith(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 6847,
      "end_line": 6849,
      "comment": "\n     * \u003cp\u003eCheck if a CharSequence starts with a specified prefix.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null}s are handled without exceptions. Two {@code null}\n     * references are considered to be equal. The comparison is case sensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.startsWith(null, null)      \u003d true\n     * StringUtils.startsWith(null, \"abc\")     \u003d false\n     * StringUtils.startsWith(\"abcdef\", null)  \u003d false\n     * StringUtils.startsWith(\"abcdef\", \"abc\") \u003d true\n     * StringUtils.startsWith(\"ABCDEF\", \"abc\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#startsWith(String)\n     * @param str  the CharSequence to check, may be null\n     * @param prefix the prefix to find, may be null\n     * @return {@code true} if the CharSequence starts with the prefix, case sensitive, or\n     *  both {@code null}\n     * @since 2.4\n     * @since 3.0 Changed signature from startsWith(String, String) to startsWith(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 6848,col 9)-(line 6848,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 6873,
      "end_line": 6875,
      "comment": "\n     * \u003cp\u003eCase insensitive check if a CharSequence starts with a specified prefix.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null}s are handled without exceptions. Two {@code null}\n     * references are considered to be equal. The comparison is case insensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.startsWithIgnoreCase(null, null)      \u003d true\n     * StringUtils.startsWithIgnoreCase(null, \"abc\")     \u003d false\n     * StringUtils.startsWithIgnoreCase(\"abcdef\", null)  \u003d false\n     * StringUtils.startsWithIgnoreCase(\"abcdef\", \"abc\") \u003d true\n     * StringUtils.startsWithIgnoreCase(\"ABCDEF\", \"abc\") \u003d true\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#startsWith(String)\n     * @param str  the CharSequence to check, may be null\n     * @param prefix the prefix to find, may be null\n     * @return {@code true} if the CharSequence starts with the prefix, case insensitive, or\n     *  both {@code null}\n     * @since 2.4\n     * @since 3.0 Changed signature from startsWithIgnoreCase(String, String) to startsWithIgnoreCase(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 6874,col 9)-(line 6874,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.startsWith(java.lang.CharSequence, java.lang.CharSequence, boolean)",
      "begin_line": 6888,
      "end_line": 6896,
      "comment": "\n     * \u003cp\u003eCheck if a CharSequence starts with a specified prefix (optionally case insensitive).\u003c/p\u003e\n     *\n     * @see java.lang.String#startsWith(String)\n     * @param str  the CharSequence to check, may be null\n     * @param prefix the prefix to find, may be null\n     * @param ignoreCase indicates whether the compare should ignore case\n     *  (case insensitive) or not.\n     * @return {@code true} if the CharSequence starts with the prefix or\n     *  both {@code null}\n     ",
      "child_ranges": [
        "(line 6889,col 9)-(line 6891,col 9)",
        "(line 6892,col 9)-(line 6894,col 9)",
        "(line 6895,col 9)-(line 6895,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.startsWithAny(java.lang.CharSequence, java.lang.CharSequence...)",
      "begin_line": 6917,
      "end_line": 6927,
      "comment": "\n     * \u003cp\u003eCheck if a CharSequence starts with any of an array of specified strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.startsWithAny(null, null)      \u003d false\n     * StringUtils.startsWithAny(null, new String[] {\"abc\"})  \u003d false\n     * StringUtils.startsWithAny(\"abcxyz\", null)     \u003d false\n     * StringUtils.startsWithAny(\"abcxyz\", new String[] {\"\"}) \u003d false\n     * StringUtils.startsWithAny(\"abcxyz\", new String[] {\"abc\"}) \u003d true\n     * StringUtils.startsWithAny(\"abcxyz\", new String[] {null, \"xyz\", \"abc\"}) \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param string  the CharSequence to check, may be null\n     * @param searchStrings the CharSequences to find, may be null or empty\n     * @return {@code true} if the CharSequence starts with any of the the prefixes, case insensitive, or\n     *  both {@code null}\n     * @since 2.5\n     * @since 3.0 Changed signature from startsWithAny(String, String[]) to startsWithAny(CharSequence, CharSequence...)\n     ",
      "child_ranges": [
        "(line 6918,col 9)-(line 6920,col 9)",
        "(line 6921,col 9)-(line 6925,col 9)",
        "(line 6926,col 9)-(line 6926,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.endsWith(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 6955,
      "end_line": 6957,
      "comment": "\n     * \u003cp\u003eCheck if a CharSequence ends with a specified suffix.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null}s are handled without exceptions. Two {@code null}\n     * references are considered to be equal. The comparison is case sensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.endsWith(null, null)      \u003d true\n     * StringUtils.endsWith(null, \"def\")     \u003d false\n     * StringUtils.endsWith(\"abcdef\", null)  \u003d false\n     * StringUtils.endsWith(\"abcdef\", \"def\") \u003d true\n     * StringUtils.endsWith(\"ABCDEF\", \"def\") \u003d false\n     * StringUtils.endsWith(\"ABCDEF\", \"cde\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#endsWith(String)\n     * @param str  the CharSequence to check, may be null\n     * @param suffix the suffix to find, may be null\n     * @return {@code true} if the CharSequence ends with the suffix, case sensitive, or\n     *  both {@code null}\n     * @since 2.4\n     * @since 3.0 Changed signature from endsWith(String, String) to endsWith(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 6956,col 9)-(line 6956,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 6982,
      "end_line": 6984,
      "comment": "\n     * \u003cp\u003eCase insensitive check if a CharSequence ends with a specified suffix.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null}s are handled without exceptions. Two {@code null}\n     * references are considered to be equal. The comparison is case insensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.endsWithIgnoreCase(null, null)      \u003d true\n     * StringUtils.endsWithIgnoreCase(null, \"def\")     \u003d false\n     * StringUtils.endsWithIgnoreCase(\"abcdef\", null)  \u003d false\n     * StringUtils.endsWithIgnoreCase(\"abcdef\", \"def\") \u003d true\n     * StringUtils.endsWithIgnoreCase(\"ABCDEF\", \"def\") \u003d true\n     * StringUtils.endsWithIgnoreCase(\"ABCDEF\", \"cde\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#endsWith(String)\n     * @param str  the CharSequence to check, may be null\n     * @param suffix the suffix to find, may be null\n     * @return {@code true} if the CharSequence ends with the suffix, case insensitive, or\n     *  both {@code null}\n     * @since 2.4\n     * @since 3.0 Changed signature from endsWithIgnoreCase(String, String) to endsWithIgnoreCase(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 6983,col 9)-(line 6983,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.endsWith(java.lang.CharSequence, java.lang.CharSequence, boolean)",
      "begin_line": 6997,
      "end_line": 7006,
      "comment": "\n     * \u003cp\u003eCheck if a CharSequence ends with a specified suffix (optionally case insensitive).\u003c/p\u003e\n     *\n     * @see java.lang.String#endsWith(String)\n     * @param str  the CharSequence to check, may be null\n     * @param suffix the suffix to find, may be null\n     * @param ignoreCase indicates whether the compare should ignore case\n     *  (case insensitive) or not.\n     * @return {@code true} if the CharSequence starts with the prefix or\n     *  both {@code null}\n     ",
      "child_ranges": [
        "(line 6998,col 9)-(line 7000,col 9)",
        "(line 7001,col 9)-(line 7003,col 9)",
        "(line 7004,col 9)-(line 7004,col 55)",
        "(line 7005,col 9)-(line 7005,col 103)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.normalizeSpace(java.lang.String)",
      "begin_line": 7049,
      "end_line": 7054,
      "comment": "\n     * \u003cp\u003e\n     * Similar to \u003ca\n     * href\u003d\"http://www.w3.org/TR/xpath/#function-normalize-space\"\u003ehttp://www.w3.org/TR/xpath/#function-normalize\n     * -space\u003c/a\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The function returns the argument string with whitespace normalized by using\n     * \u003ccode\u003e{@link #trim(String)}\u003c/code\u003e to remove leading and trailing whitespace\n     * and then replacing sequences of whitespace characters by a single space.\n     * \u003c/p\u003e\n     * In XML Whitespace characters are the same as those allowed by the \u003ca\n     * href\u003d\"http://www.w3.org/TR/REC-xml/#NT-S\"\u003eS\u003c/a\u003e production, which is S ::\u003d (#x20 | #x9 | #xD | #xA)+\n     * \u003cp\u003e\n     * Java\u0027s regexp pattern \\s defines whitespace as [ \\t\\n\\x0B\\f\\r]\n     * \u003cp\u003e\n     * For reference:\n     * \u003cul\u003e\n     * \u003cli\u003e\\x0B \u003d vertical tab\u003c/li\u003e\n     * \u003cli\u003e\\f \u003d #xC \u003d form feed\u003c/li\u003e\n     * \u003cli\u003e#x20 \u003d space\u003c/li\u003e\n     * \u003cli\u003e#x9 \u003d \\t\u003c/li\u003e\n     * \u003cli\u003e#xA \u003d \\n\u003c/li\u003e\n     * \u003cli\u003e#xD \u003d \\r\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The difference is that Java\u0027s whitespace includes vertical tab and form feed, which this functional will also\n     * normalize. Additionally \u003ccode\u003e{@link #trim(String)}\u003c/code\u003e removes control characters (char \u0026lt;\u003d 32) from both\n     * ends of this String.\n     * \u003c/p\u003e\n     *\n     * @see Pattern\n     * @see #trim(String)\n     * @see \u003ca\n     *      href\u003d\"http://www.w3.org/TR/xpath/#function-normalize-space\"\u003ehttp://www.w3.org/TR/xpath/#function-normalize-space\u003c/a\u003e\n     * @param str the source String to normalize whitespaces from, may be null\n     * @return the modified string with whitespace normalized, {@code null} if null String input\n     *\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 7050,col 9)-(line 7052,col 9)",
        "(line 7053,col 9)-(line 7053,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.endsWithAny(java.lang.CharSequence, java.lang.CharSequence...)",
      "begin_line": 7074,
      "end_line": 7084,
      "comment": "\n     * \u003cp\u003eCheck if a CharSequence ends with any of an array of specified strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.endsWithAny(null, null)      \u003d false\n     * StringUtils.endsWithAny(null, new String[] {\"abc\"})  \u003d false\n     * StringUtils.endsWithAny(\"abcxyz\", null)     \u003d false\n     * StringUtils.endsWithAny(\"abcxyz\", new String[] {\"\"}) \u003d true\n     * StringUtils.endsWithAny(\"abcxyz\", new String[] {\"xyz\"}) \u003d true\n     * StringUtils.endsWithAny(\"abcxyz\", new String[] {null, \"xyz\", \"abc\"}) \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param string  the CharSequence to check, may be null\n     * @param searchStrings the CharSequences to find, may be null or empty\n     * @return {@code true} if the CharSequence ends with any of the the prefixes, case insensitive, or\n     *  both {@code null}\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 7075,col 9)-(line 7077,col 9)",
        "(line 7078,col 9)-(line 7082,col 9)",
        "(line 7083,col 9)-(line 7083,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.toString(byte[], java.lang.String)",
      "begin_line": 7100,
      "end_line": 7102,
      "comment": "\n     * Converts a \u003ccode\u003ebyte[]\u003c/code\u003e to a String using the specified character encoding.\n     * \n     * @param bytes\n     *            the byte array to read from\n     * @param charsetName\n     *            the encoding to use, if null then use the platform default\n     * @return a new String\n     * @throws UnsupportedEncodingException\n     *             If the named charset is not supported\n     * @throws NullPointerException\n     *             if the input is null\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 7101,col 9)-(line 7101,col 88)"
      ]
    }
  ]
}