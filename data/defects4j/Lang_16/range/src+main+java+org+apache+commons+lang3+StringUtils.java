{
  "filepath": "/tmp/Lang-16b/src/main/java/org/apache/commons/lang3/StringUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StringUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 110,
      "end_line": 6561,
      "comment": "@Immutable"
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": "\n     * The empty String {@code \"\"}.\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INDEX_NOT_FOUND"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": "\n     * Represents a failed index search.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PAD_LIMIT"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": "\n     * \u003cp\u003eThe maximum size to which the padding constant(s) can expand.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "WHITESPACE_BLOCK"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": "\n     * A regex pattern for recognizing blocks of whitespace characters.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.StringUtils.StringUtils()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * \u003cp\u003e{@code StringUtils} instances should NOT be constructed in\n     * standard programming. Instead, the class should be used as\n     * {@code StringUtils.trim(\" foo \");}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isEmpty(java.lang.CharSequence)",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\n     * \u003cp\u003eChecks if a CharSequence is empty (\"\") or null.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isEmpty(null)      \u003d true\n     * StringUtils.isEmpty(\"\")        \u003d true\n     * StringUtils.isEmpty(\" \")       \u003d false\n     * StringUtils.isEmpty(\"bob\")     \u003d false\n     * StringUtils.isEmpty(\"  bob  \") \u003d false\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eNOTE: This method changed in Lang version 2.0.\n     * It no longer trims the CharSequence.\n     * That functionality is available in isBlank().\u003c/p\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return {@code true} if the CharSequence is empty or null\n     * @since 3.0 Changed signature from isEmpty(String) to isEmpty(CharSequence)\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isNotEmpty(java.lang.CharSequence)",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\n     * \u003cp\u003eChecks if a CharSequence is not empty (\"\") and not null.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isNotEmpty(null)      \u003d false\n     * StringUtils.isNotEmpty(\"\")        \u003d false\n     * StringUtils.isNotEmpty(\" \")       \u003d true\n     * StringUtils.isNotEmpty(\"bob\")     \u003d true\n     * StringUtils.isNotEmpty(\"  bob  \") \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return {@code true} if the CharSequence is not empty and not null\n     * @since 3.0 Changed signature from isNotEmpty(String) to isNotEmpty(CharSequence)\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isBlank(java.lang.CharSequence)",
      "begin_line": 221,
      "end_line": 232,
      "comment": "\n     * \u003cp\u003eChecks if a CharSequence is whitespace, empty (\"\") or null.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isBlank(null)      \u003d true\n     * StringUtils.isBlank(\"\")        \u003d true\n     * StringUtils.isBlank(\" \")       \u003d true\n     * StringUtils.isBlank(\"bob\")     \u003d false\n     * StringUtils.isBlank(\"  bob  \") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return {@code true} if the CharSequence is null, empty or whitespace\n     * @since 2.0\n     * @since 3.0 Changed signature from isBlank(String) to isBlank(CharSequence)\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 19)",
        "(line 223,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 231,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isNotBlank(java.lang.CharSequence)",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\n     * \u003cp\u003eChecks if a CharSequence is not empty (\"\"), not null and not whitespace only.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isNotBlank(null)      \u003d false\n     * StringUtils.isNotBlank(\"\")        \u003d false\n     * StringUtils.isNotBlank(\" \")       \u003d false\n     * StringUtils.isNotBlank(\"bob\")     \u003d true\n     * StringUtils.isNotBlank(\"  bob  \") \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return {@code true} if the CharSequence is\n     *  not empty and not null and not whitespace\n     * @since 2.0\n     * @since 3.0 Changed signature from isNotBlank(String) to isNotBlank(CharSequence)\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.trim(java.lang.String)",
      "begin_line": 280,
      "end_line": 282,
      "comment": "\n     * \u003cp\u003eRemoves control characters (char \u0026lt;\u003d 32) from both\n     * ends of this String, handling {@code null} by returning\n     * {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is trimmed using {@link String#trim()}.\n     * Trim removes start and end characters \u0026lt;\u003d 32.\n     * To strip whitespace use {@link #strip(String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eTo trim your choice of characters, use the\n     * {@link #strip(String, String)} methods.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.trim(null)          \u003d null\n     * StringUtils.trim(\"\")            \u003d \"\"\n     * StringUtils.trim(\"     \")       \u003d \"\"\n     * StringUtils.trim(\"abc\")         \u003d \"abc\"\n     * StringUtils.trim(\"    abc    \") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be trimmed, may be null\n     * @return the trimmed string, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.trimToNull(java.lang.String)",
      "begin_line": 306,
      "end_line": 309,
      "comment": "\n     * \u003cp\u003eRemoves control characters (char \u0026lt;\u003d 32) from both\n     * ends of this String returning {@code null} if the String is\n     * empty (\"\") after the trim or if it is {@code null}.\n     *\n     * \u003cp\u003eThe String is trimmed using {@link String#trim()}.\n     * Trim removes start and end characters \u0026lt;\u003d 32.\n     * To strip whitespace use {@link #stripToNull(String)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.trimToNull(null)          \u003d null\n     * StringUtils.trimToNull(\"\")            \u003d null\n     * StringUtils.trimToNull(\"     \")       \u003d null\n     * StringUtils.trimToNull(\"abc\")         \u003d \"abc\"\n     * StringUtils.trimToNull(\"    abc    \") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be trimmed, may be null\n     * @return the trimmed String,\n     *  {@code null} if only chars \u0026lt;\u003d 32, empty or null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 30)",
        "(line 308,col 9)-(line 308,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.trimToEmpty(java.lang.String)",
      "begin_line": 332,
      "end_line": 334,
      "comment": "\n     * \u003cp\u003eRemoves control characters (char \u0026lt;\u003d 32) from both\n     * ends of this String returning an empty String (\"\") if the String\n     * is empty (\"\") after the trim or if it is {@code null}.\n     *\n     * \u003cp\u003eThe String is trimmed using {@link String#trim()}.\n     * Trim removes start and end characters \u0026lt;\u003d 32.\n     * To strip whitespace use {@link #stripToEmpty(String)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.trimToEmpty(null)          \u003d \"\"\n     * StringUtils.trimToEmpty(\"\")            \u003d \"\"\n     * StringUtils.trimToEmpty(\"     \")       \u003d \"\"\n     * StringUtils.trimToEmpty(\"abc\")         \u003d \"abc\"\n     * StringUtils.trimToEmpty(\"    abc    \") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be trimmed, may be null\n     * @return the trimmed String, or an empty String if {@code null} input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.strip(java.lang.String)",
      "begin_line": 360,
      "end_line": 362,
      "comment": "\n     * \u003cp\u003eStrips whitespace from the start and end of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is similar to {@link #trim(String)} but removes whitespace.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.strip(null)     \u003d null\n     * StringUtils.strip(\"\")       \u003d \"\"\n     * StringUtils.strip(\"   \")    \u003d \"\"\n     * StringUtils.strip(\"abc\")    \u003d \"abc\"\n     * StringUtils.strip(\"  abc\")  \u003d \"abc\"\n     * StringUtils.strip(\"abc  \")  \u003d \"abc\"\n     * StringUtils.strip(\" abc \")  \u003d \"abc\"\n     * StringUtils.strip(\" ab c \") \u003d \"ab c\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to remove whitespace from, may be null\n     * @return the stripped String, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.stripToNull(java.lang.String)",
      "begin_line": 387,
      "end_line": 393,
      "comment": "\n     * \u003cp\u003eStrips whitespace from the start and end of a String  returning\n     * {@code null} if the String is empty (\"\") after the strip.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is similar to {@link #trimToNull(String)} but removes whitespace.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripToNull(null)     \u003d null\n     * StringUtils.stripToNull(\"\")       \u003d null\n     * StringUtils.stripToNull(\"   \")    \u003d null\n     * StringUtils.stripToNull(\"abc\")    \u003d \"abc\"\n     * StringUtils.stripToNull(\"  abc\")  \u003d \"abc\"\n     * StringUtils.stripToNull(\"abc  \")  \u003d \"abc\"\n     * StringUtils.stripToNull(\" abc \")  \u003d \"abc\"\n     * StringUtils.stripToNull(\" ab c \") \u003d \"ab c\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be stripped, may be null\n     * @return the stripped String,\n     *  {@code null} if whitespace, empty or null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 390,col 9)",
        "(line 391,col 9)-(line 391,col 31)",
        "(line 392,col 9)-(line 392,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.stripToEmpty(java.lang.String)",
      "begin_line": 417,
      "end_line": 419,
      "comment": "\n     * \u003cp\u003eStrips whitespace from the start and end of a String  returning\n     * an empty String if {@code null} input.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is similar to {@link #trimToEmpty(String)} but removes whitespace.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripToEmpty(null)     \u003d \"\"\n     * StringUtils.stripToEmpty(\"\")       \u003d \"\"\n     * StringUtils.stripToEmpty(\"   \")    \u003d \"\"\n     * StringUtils.stripToEmpty(\"abc\")    \u003d \"abc\"\n     * StringUtils.stripToEmpty(\"  abc\")  \u003d \"abc\"\n     * StringUtils.stripToEmpty(\"abc  \")  \u003d \"abc\"\n     * StringUtils.stripToEmpty(\" abc \")  \u003d \"abc\"\n     * StringUtils.stripToEmpty(\" ab c \") \u003d \"ab c\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be stripped, may be null\n     * @return the trimmed String, or an empty String if {@code null} input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.strip(java.lang.String, java.lang.String)",
      "begin_line": 447,
      "end_line": 453,
      "comment": "\n     * \u003cp\u003eStrips any of a set of characters from the start and end of a String.\n     * This is similar to {@link String#trim()} but allows the characters\n     * to be stripped to be controlled.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * An empty string (\"\") input returns the empty string.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the stripChars String is {@code null}, whitespace is\n     * stripped as defined by {@link Character#isWhitespace(char)}.\n     * Alternatively use {@link #strip(String)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.strip(null, *)          \u003d null\n     * StringUtils.strip(\"\", *)            \u003d \"\"\n     * StringUtils.strip(\"abc\", null)      \u003d \"abc\"\n     * StringUtils.strip(\"  abc\", null)    \u003d \"abc\"\n     * StringUtils.strip(\"abc  \", null)    \u003d \"abc\"\n     * StringUtils.strip(\" abc \", null)    \u003d \"abc\"\n     * StringUtils.strip(\"  abcyx\", \"xyz\") \u003d \"  abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to remove characters from, may be null\n     * @param stripChars  the characters to remove, null treated as whitespace\n     * @return the stripped String, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 450,col 9)",
        "(line 451,col 9)-(line 451,col 42)",
        "(line 452,col 9)-(line 452,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.stripStart(java.lang.String, java.lang.String)",
      "begin_line": 479,
      "end_line": 497,
      "comment": "\n     * \u003cp\u003eStrips any of a set of characters from the start of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * An empty string (\"\") input returns the empty string.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the stripChars String is {@code null}, whitespace is\n     * stripped as defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripStart(null, *)          \u003d null\n     * StringUtils.stripStart(\"\", *)            \u003d \"\"\n     * StringUtils.stripStart(\"abc\", \"\")        \u003d \"abc\"\n     * StringUtils.stripStart(\"abc\", null)      \u003d \"abc\"\n     * StringUtils.stripStart(\"  abc\", null)    \u003d \"abc\"\n     * StringUtils.stripStart(\"abc  \", null)    \u003d \"abc  \"\n     * StringUtils.stripStart(\" abc \", null)    \u003d \"abc \"\n     * StringUtils.stripStart(\"yxabc  \", \"xyz\") \u003d \"abc  \"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to remove characters from, may be null\n     * @param stripChars  the characters to remove, null treated as whitespace\n     * @return the stripped String, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 19)",
        "(line 481,col 9)-(line 483,col 9)",
        "(line 484,col 9)-(line 484,col 22)",
        "(line 485,col 9)-(line 495,col 9)",
        "(line 496,col 9)-(line 496,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.stripEnd(java.lang.String, java.lang.String)",
      "begin_line": 524,
      "end_line": 542,
      "comment": "\n     * \u003cp\u003eStrips any of a set of characters from the end of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * An empty string (\"\") input returns the empty string.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the stripChars String is {@code null}, whitespace is\n     * stripped as defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripEnd(null, *)          \u003d null\n     * StringUtils.stripEnd(\"\", *)            \u003d \"\"\n     * StringUtils.stripEnd(\"abc\", \"\")        \u003d \"abc\"\n     * StringUtils.stripEnd(\"abc\", null)      \u003d \"abc\"\n     * StringUtils.stripEnd(\"  abc\", null)    \u003d \"  abc\"\n     * StringUtils.stripEnd(\"abc  \", null)    \u003d \"abc\"\n     * StringUtils.stripEnd(\" abc \", null)    \u003d \" abc\"\n     * StringUtils.stripEnd(\"  abcyx\", \"xyz\") \u003d \"  abc\"\n     * StringUtils.stripEnd(\"120.00\", \".0\")   \u003d \"12\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to remove characters from, may be null\n     * @param stripChars  the set of characters to remove, null treated as whitespace\n     * @return the stripped String, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 525,col 9)-(line 525,col 16)",
        "(line 526,col 9)-(line 528,col 9)",
        "(line 530,col 9)-(line 540,col 9)",
        "(line 541,col 9)-(line 541,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.stripAll(java.lang.String...)",
      "begin_line": 565,
      "end_line": 567,
      "comment": "\n     * \u003cp\u003eStrips whitespace from the start and end of every String in an array.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA new array is returned each time, except for length zero.\n     * A {@code null} array will return {@code null}.\n     * An empty array will return itself.\n     * A {@code null} array entry will be ignored.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripAll(null)             \u003d null\n     * StringUtils.stripAll([])               \u003d []\n     * StringUtils.stripAll([\"abc\", \"  abc\"]) \u003d [\"abc\", \"abc\"]\n     * StringUtils.stripAll([\"abc  \", null])  \u003d [\"abc\", null]\n     * \u003c/pre\u003e\n     *\n     * @param strs  the array to remove whitespace from, may be null\n     * @return the stripped Strings, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.stripAll(java.lang.String[], java.lang.String)",
      "begin_line": 594,
      "end_line": 604,
      "comment": "\n     * \u003cp\u003eStrips any of a set of characters from the start and end of every\n     * String in an array.\u003c/p\u003e\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA new array is returned each time, except for length zero.\n     * A {@code null} array will return {@code null}.\n     * An empty array will return itself.\n     * A {@code null} array entry will be ignored.\n     * A {@code null} stripChars will strip whitespace as defined by\n     * {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripAll(null, *)                \u003d null\n     * StringUtils.stripAll([], *)                  \u003d []\n     * StringUtils.stripAll([\"abc\", \"  abc\"], null) \u003d [\"abc\", \"abc\"]\n     * StringUtils.stripAll([\"abc  \", null], null)  \u003d [\"abc\", null]\n     * StringUtils.stripAll([\"abc  \", null], \"yz\")  \u003d [\"abc  \", null]\n     * StringUtils.stripAll([\"yabcz\", null], \"yz\")  \u003d [\"abc\", null]\n     * \u003c/pre\u003e\n     *\n     * @param strs  the array to remove characters from, may be null\n     * @param stripChars  the characters to remove, null treated as whitespace\n     * @return the stripped Strings, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 595,col 9)-(line 595,col 20)",
        "(line 596,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 599,col 46)",
        "(line 600,col 9)-(line 602,col 9)",
        "(line 603,col 9)-(line 603,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.stripAccents(java.lang.String)",
      "begin_line": 627,
      "end_line": 652,
      "comment": " See also Lucene\u0027s ASCIIFoldingFilter (Lucene 2.9) that replaces accented characters by their unaccented equivalent (and uncommitted bug fix: https://issues.apache.org/jira/browse/LUCENE-1343?focusedCommentId\u003d12858907\u0026page\u003dcom.atlassian.jira.plugin.system.issuetabpanels%3Acomment-tabpanel#action_12858907).",
      "child_ranges": [
        "(line 628,col 9)-(line 630,col 9)",
        "(line 631,col 9)-(line 651,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.removeAccentsJava6(java.lang.CharSequence)",
      "begin_line": 664,
      "end_line": 677,
      "comment": "\n     * Use {@code java.text.Normalizer#normalize(CharSequence, Normalizer.Form)}\n     * (but be careful, this class exists in Java 1.3, with an entirely different meaning!)\n     *\n     * @param text the text to be processed\n     * @return the processed string\n     * @throws IllegalAccessException may be thrown by a reflection call\n     * @throws InvocationTargetException if a reflection call throws an exception\n     * @throws IllegalStateException if the {@code Normalizer} class is not available\n     ",
      "child_ranges": [
        "(line 670,col 9)-(line 672,col 9)",
        "(line 673,col 9)-(line 673,col 22)",
        "(line 674,col 9)-(line 674,col 105)",
        "(line 675,col 9)-(line 675,col 61)",
        "(line 676,col 9)-(line 676,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.removeAccentsSUN(java.lang.CharSequence)",
      "begin_line": 688,
      "end_line": 701,
      "comment": "\n     * Use {@code sun.text.Normalizer#decompose(String, boolean, int)}\n     *\n     * @param text the text to be processed\n     * @return the processed string\n     * @throws IllegalAccessException may be thrown by a reflection call\n     * @throws InvocationTargetException if a reflection call throws an exception\n     * @throws IllegalStateException if the {@code Normalizer} class is not available\n     ",
      "child_ranges": [
        "(line 694,col 9)-(line 696,col 9)",
        "(line 697,col 9)-(line 697,col 22)",
        "(line 698,col 9)-(line 698,col 114)",
        "(line 699,col 9)-(line 699,col 59)",
        "(line 700,col 9)-(line 700,col 22)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sunAvailable"
      ],
      "begin_line": 704,
      "end_line": 704,
      "comment": " SUN internal, Java 1.3 -\u003e Java 5"
    },
    {
      "type": "field",
      "varNames": [
        "sunDecomposeMethod"
      ],
      "begin_line": 705,
      "end_line": 705,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sunPattern"
      ],
      "begin_line": 706,
      "end_line": 706,
      "comment": "$NON-NLS-1$"
    },
    {
      "type": "field",
      "varNames": [
        "java6Available"
      ],
      "begin_line": 708,
      "end_line": 708,
      "comment": " Java 6+"
    },
    {
      "type": "field",
      "varNames": [
        "java6NormalizeMethod"
      ],
      "begin_line": 709,
      "end_line": 709,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "java6NormalizerFormNFD"
      ],
      "begin_line": 710,
      "end_line": 710,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "java6Pattern"
      ],
      "begin_line": 711,
      "end_line": 711,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.equals(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 775,
      "end_line": 777,
      "comment": "\n     * \u003cp\u003eCompares two CharSequences, returning {@code true} if they are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null}s are handled without exceptions. Two {@code null}\n     * references are considered to be equal. The comparison is case sensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.equals(null, null)   \u003d true\n     * StringUtils.equals(null, \"abc\")  \u003d false\n     * StringUtils.equals(\"abc\", null)  \u003d false\n     * StringUtils.equals(\"abc\", \"abc\") \u003d true\n     * StringUtils.equals(\"abc\", \"ABC\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#equals(Object)\n     * @param cs1  the first CharSequence, may be null\n     * @param cs2  the second CharSequence, may be null\n     * @return {@code true} if the CharSequences are equal, case sensitive, or\n     *  both {@code null}\n     * @since 3.0 Changed signature from equals(String, String) to equals(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 776,col 9)-(line 776,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.equalsIgnoreCase(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 800,
      "end_line": 806,
      "comment": "\n     * \u003cp\u003eCompares two CharSequences, returning {@code true} if they are equal ignoring\n     * the case.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null}s are handled without exceptions. Two {@code null}\n     * references are considered equal. Comparison is case insensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.equalsIgnoreCase(null, null)   \u003d true\n     * StringUtils.equalsIgnoreCase(null, \"abc\")  \u003d false\n     * StringUtils.equalsIgnoreCase(\"abc\", null)  \u003d false\n     * StringUtils.equalsIgnoreCase(\"abc\", \"abc\") \u003d true\n     * StringUtils.equalsIgnoreCase(\"abc\", \"ABC\") \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param str1  the first CharSequence, may be null\n     * @param str2  the second CharSequence, may be null\n     * @return {@code true} if the CharSequence are equal, case insensitive, or\n     *  both {@code null}\n     * @since 3.0 Changed signature from equalsIgnoreCase(String, String) to equalsIgnoreCase(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 801,col 9)-(line 805,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOf(java.lang.CharSequence, int)",
      "begin_line": 830,
      "end_line": 835,
      "comment": "\n     * \u003cp\u003eFinds the first index within a CharSequence, handling {@code null}.\n     * This method uses {@link String#indexOf(int, int)} if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} or empty (\"\") CharSequence will return {@code INDEX_NOT_FOUND (-1)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOf(null, *)         \u003d -1\n     * StringUtils.indexOf(\"\", *)           \u003d -1\n     * StringUtils.indexOf(\"aabaabaa\", \u0027a\u0027) \u003d 0\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027) \u003d 2\n     * \u003c/pre\u003e\n     *\n     * @param seq  the CharSequence to check, may be null\n     * @param searchChar  the character to find\n     * @return the first index of the search character,\n     *  -1 if no match or {@code null} string input\n     * @since 2.0\n     * @since 3.0 Changed signature from indexOf(String, int) to indexOf(CharSequence, int)\n     ",
      "child_ranges": [
        "(line 831,col 9)-(line 833,col 9)",
        "(line 834,col 9)-(line 834,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOf(java.lang.CharSequence, int, int)",
      "begin_line": 863,
      "end_line": 868,
      "comment": "\n     * \u003cp\u003eFinds the first index within a CharSequence from a start position,\n     * handling {@code null}.\n     * This method uses {@link String#indexOf(int, int)} if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} or empty (\"\") CharSequence will return {@code (INDEX_NOT_FOUND) -1}.\n     * A negative start position is treated as zero.\n     * A start position greater than the string length returns {@code -1}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOf(null, *, *)          \u003d -1\n     * StringUtils.indexOf(\"\", *, *)            \u003d -1\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027, 0)  \u003d 2\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027, 3)  \u003d 5\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027, 9)  \u003d -1\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027, -1) \u003d 2\n     * \u003c/pre\u003e\n     *\n     * @param seq  the CharSequence to check, may be null\n     * @param searchChar  the character to find\n     * @param startPos  the start position, negative treated as zero\n     * @return the first index of the search character,\n     *  -1 if no match or {@code null} string input\n     * @since 2.0\n     * @since 3.0 Changed signature from indexOf(String, int, int) to indexOf(CharSequence, int, int)\n     ",
      "child_ranges": [
        "(line 864,col 9)-(line 866,col 9)",
        "(line 867,col 9)-(line 867,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOf(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 894,
      "end_line": 899,
      "comment": "\n     * \u003cp\u003eFinds the first index within a CharSequence, handling {@code null}.\n     * This method uses {@link String#indexOf(String, int)} if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOf(null, *)          \u003d -1\n     * StringUtils.indexOf(*, null)          \u003d -1\n     * StringUtils.indexOf(\"\", \"\")           \u003d 0\n     * StringUtils.indexOf(\"\", *)            \u003d -1 (except when * \u003d \"\")\n     * StringUtils.indexOf(\"aabaabaa\", \"a\")  \u003d 0\n     * StringUtils.indexOf(\"aabaabaa\", \"b\")  \u003d 2\n     * StringUtils.indexOf(\"aabaabaa\", \"ab\") \u003d 1\n     * StringUtils.indexOf(\"aabaabaa\", \"\")   \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param seq  the CharSequence to check, may be null\n     * @param searchSeq  the CharSequence to find, may be null\n     * @return the first index of the search CharSequence,\n     *  -1 if no match or {@code null} string input\n     * @since 2.0\n     * @since 3.0 Changed signature from indexOf(String, String) to indexOf(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 895,col 9)-(line 897,col 9)",
        "(line 898,col 9)-(line 898,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOf(java.lang.CharSequence, java.lang.CharSequence, int)",
      "begin_line": 934,
      "end_line": 939,
      "comment": "\n     * \u003cp\u003eFinds the first index within a CharSequence, handling {@code null}.\n     * This method uses {@link String#indexOf(String, int)} if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\n     * A negative start position is treated as zero.\n     * An empty (\"\") search CharSequence always matches.\n     * A start position greater than the string length only matches\n     * an empty search CharSequence.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOf(null, *, *)          \u003d -1\n     * StringUtils.indexOf(*, null, *)          \u003d -1\n     * StringUtils.indexOf(\"\", \"\", 0)           \u003d 0\n     * StringUtils.indexOf(\"\", *, 0)            \u003d -1 (except when * \u003d \"\")\n     * StringUtils.indexOf(\"aabaabaa\", \"a\", 0)  \u003d 0\n     * StringUtils.indexOf(\"aabaabaa\", \"b\", 0)  \u003d 2\n     * StringUtils.indexOf(\"aabaabaa\", \"ab\", 0) \u003d 1\n     * StringUtils.indexOf(\"aabaabaa\", \"b\", 3)  \u003d 5\n     * StringUtils.indexOf(\"aabaabaa\", \"b\", 9)  \u003d -1\n     * StringUtils.indexOf(\"aabaabaa\", \"b\", -1) \u003d 2\n     * StringUtils.indexOf(\"aabaabaa\", \"\", 2)   \u003d 2\n     * StringUtils.indexOf(\"abc\", \"\", 9)        \u003d 3\n     * \u003c/pre\u003e\n     *\n     * @param seq  the CharSequence to check, may be null\n     * @param searchSeq  the CharSequence to find, may be null\n     * @param startPos  the start position, negative treated as zero\n     * @return the first index of the search CharSequence,\n     *  -1 if no match or {@code null} string input\n     * @since 2.0\n     * @since 3.0 Changed signature from indexOf(String, String, int) to indexOf(CharSequence, CharSequence, int)\n     ",
      "child_ranges": [
        "(line 935,col 9)-(line 937,col 9)",
        "(line 938,col 9)-(line 938,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.ordinalIndexOf(java.lang.CharSequence, java.lang.CharSequence, int)",
      "begin_line": 975,
      "end_line": 977,
      "comment": "\n     * \u003cp\u003eFinds the n-th index within a CharSequence, handling {@code null}.\n     * This method uses {@link String#indexOf(String)} if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.ordinalIndexOf(null, *, *)          \u003d -1\n     * StringUtils.ordinalIndexOf(*, null, *)          \u003d -1\n     * StringUtils.ordinalIndexOf(\"\", \"\", *)           \u003d 0\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"a\", 1)  \u003d 0\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"a\", 2)  \u003d 1\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"b\", 1)  \u003d 2\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"b\", 2)  \u003d 5\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"ab\", 1) \u003d 1\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"ab\", 2) \u003d 4\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"\", 1)   \u003d 0\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"\", 2)   \u003d 0\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eNote that \u0027head(CharSequence str, int n)\u0027 may be implemented as: \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   str.substring(0, lastOrdinalIndexOf(str, \"\\n\", n))\n     * \u003c/pre\u003e\n     *\n     * @param str  the CharSequence to check, may be null\n     * @param searchStr  the CharSequence to find, may be null\n     * @param ordinal  the n-th {@code searchStr} to find\n     * @return the n-th index of the search CharSequence,\n     *  {@code -1} ({@code INDEX_NOT_FOUND}) if no match or {@code null} string input\n     * @since 2.1\n     * @since 3.0 Changed signature from ordinalIndexOf(String, String, int) to ordinalIndexOf(CharSequence, CharSequence, int)\n     ",
      "child_ranges": [
        "(line 976,col 9)-(line 976,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.ordinalIndexOf(java.lang.CharSequence, java.lang.CharSequence, int, boolean)",
      "begin_line": 993,
      "end_line": 1014,
      "comment": " Shared code between ordinalIndexOf(String,String,int) and lastOrdinalIndexOf(String,String,int)",
      "child_ranges": [
        "(line 994,col 9)-(line 996,col 9)",
        "(line 997,col 9)-(line 999,col 9)",
        "(line 1000,col 9)-(line 1000,col 22)",
        "(line 1001,col 9)-(line 1001,col 63)",
        "(line 1002,col 9)-(line 1012,col 34)",
        "(line 1013,col 9)-(line 1013,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 1041,
      "end_line": 1043,
      "comment": "\n     * \u003cp\u003eCase in-sensitive find of the first index within a CharSequence.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\n     * A negative start position is treated as zero.\n     * An empty (\"\") search CharSequence always matches.\n     * A start position greater than the string length only matches\n     * an empty search CharSequence.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfIgnoreCase(null, *)          \u003d -1\n     * StringUtils.indexOfIgnoreCase(*, null)          \u003d -1\n     * StringUtils.indexOfIgnoreCase(\"\", \"\")           \u003d 0\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"a\")  \u003d 0\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"b\")  \u003d 2\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"ab\") \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @param str  the CharSequence to check, may be null\n     * @param searchStr  the CharSequence to find, may be null\n     * @return the first index of the search CharSequence,\n     *  -1 if no match or {@code null} string input\n     * @since 2.5\n     * @since 3.0 Changed signature from indexOfIgnoreCase(String, String) to indexOfIgnoreCase(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 1042,col 9)-(line 1042,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(java.lang.CharSequence, java.lang.CharSequence, int)",
      "begin_line": 1077,
      "end_line": 1097,
      "comment": "\n     * \u003cp\u003eCase in-sensitive find of the first index within a CharSequence\n     * from the specified position.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\n     * A negative start position is treated as zero.\n     * An empty (\"\") search CharSequence always matches.\n     * A start position greater than the string length only matches\n     * an empty search CharSequence.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfIgnoreCase(null, *, *)          \u003d -1\n     * StringUtils.indexOfIgnoreCase(*, null, *)          \u003d -1\n     * StringUtils.indexOfIgnoreCase(\"\", \"\", 0)           \u003d 0\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"A\", 0)  \u003d 0\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"B\", 0)  \u003d 2\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"AB\", 0) \u003d 1\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"B\", 3)  \u003d 5\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"B\", 9)  \u003d -1\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"B\", -1) \u003d 2\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"\", 2)   \u003d 2\n     * StringUtils.indexOfIgnoreCase(\"abc\", \"\", 9)        \u003d 3\n     * \u003c/pre\u003e\n     *\n     * @param str  the CharSequence to check, may be null\n     * @param searchStr  the CharSequence to find, may be null\n     * @param startPos  the start position, negative treated as zero\n     * @return the first index of the search CharSequence,\n     *  -1 if no match or {@code null} string input\n     * @since 2.5\n     * @since 3.0 Changed signature from indexOfIgnoreCase(String, String, int) to indexOfIgnoreCase(CharSequence, CharSequence, int)\n     ",
      "child_ranges": [
        "(line 1078,col 9)-(line 1080,col 9)",
        "(line 1081,col 9)-(line 1083,col 9)",
        "(line 1084,col 9)-(line 1084,col 63)",
        "(line 1085,col 9)-(line 1087,col 9)",
        "(line 1088,col 9)-(line 1090,col 9)",
        "(line 1091,col 9)-(line 1095,col 9)",
        "(line 1096,col 9)-(line 1096,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastIndexOf(java.lang.CharSequence, int)",
      "begin_line": 1121,
      "end_line": 1126,
      "comment": "\n     * \u003cp\u003eFinds the last index within a CharSequence, handling {@code null}.\n     * This method uses {@link String#lastIndexOf(int)} if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} or empty (\"\") CharSequence will return {@code -1}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOf(null, *)         \u003d -1\n     * StringUtils.lastIndexOf(\"\", *)           \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027a\u0027) \u003d 7\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027) \u003d 5\n     * \u003c/pre\u003e\n     *\n     * @param seq  the CharSequence to check, may be null\n     * @param searchChar  the character to find\n     * @return the last index of the search character,\n     *  -1 if no match or {@code null} string input\n     * @since 2.0\n     * @since 3.0 Changed signature from lastIndexOf(String, int) to lastIndexOf(CharSequence, int)\n     ",
      "child_ranges": [
        "(line 1122,col 9)-(line 1124,col 9)",
        "(line 1125,col 9)-(line 1125,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastIndexOf(java.lang.CharSequence, int, int)",
      "begin_line": 1156,
      "end_line": 1161,
      "comment": "\n     * \u003cp\u003eFinds the last index within a CharSequence from a start position,\n     * handling {@code null}.\n     * This method uses {@link String#lastIndexOf(int, int)} if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} or empty (\"\") CharSequence will return {@code -1}.\n     * A negative start position returns {@code -1}.\n     * A start position greater than the string length searches the whole string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOf(null, *, *)          \u003d -1\n     * StringUtils.lastIndexOf(\"\", *,  *)           \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, 8)  \u003d 5\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, 4)  \u003d 2\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, 0)  \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, 9)  \u003d 5\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, -1) \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027a\u0027, 0)  \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param seq  the CharSequence to check, may be null\n     * @param searchChar  the character to find\n     * @param startPos  the start position\n     * @return the last index of the search character,\n     *  -1 if no match or {@code null} string input\n     * @since 2.0\n     * @since 3.0 Changed signature from lastIndexOf(String, int, int) to lastIndexOf(CharSequence, int, int)\n     ",
      "child_ranges": [
        "(line 1157,col 9)-(line 1159,col 9)",
        "(line 1160,col 9)-(line 1160,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastIndexOf(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 1186,
      "end_line": 1191,
      "comment": "\n     * \u003cp\u003eFinds the last index within a CharSequence, handling {@code null}.\n     * This method uses {@link String#lastIndexOf(String)} if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOf(null, *)          \u003d -1\n     * StringUtils.lastIndexOf(*, null)          \u003d -1\n     * StringUtils.lastIndexOf(\"\", \"\")           \u003d 0\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"a\")  \u003d 7\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\")  \u003d 5\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"ab\") \u003d 4\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"\")   \u003d 8\n     * \u003c/pre\u003e\n     *\n     * @param seq  the CharSequence to check, may be null\n     * @param searchSeq  the CharSequence to find, may be null\n     * @return the last index of the search String,\n     *  -1 if no match or {@code null} string input\n     * @since 2.0\n     * @since 3.0 Changed signature from lastIndexOf(String, String) to lastIndexOf(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 1187,col 9)-(line 1189,col 9)",
        "(line 1190,col 9)-(line 1190,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf(java.lang.CharSequence, java.lang.CharSequence, int)",
      "begin_line": 1227,
      "end_line": 1229,
      "comment": "\n     * \u003cp\u003eFinds the n-th last index within a String, handling {@code null}.\n     * This method uses {@link String#lastIndexOf(String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} String will return {@code -1}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastOrdinalIndexOf(null, *, *)          \u003d -1\n     * StringUtils.lastOrdinalIndexOf(*, null, *)          \u003d -1\n     * StringUtils.lastOrdinalIndexOf(\"\", \"\", *)           \u003d 0\n     * StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"a\", 1)  \u003d 7\n     * StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"a\", 2)  \u003d 6\n     * StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"b\", 1)  \u003d 5\n     * StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"b\", 2)  \u003d 2\n     * StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"ab\", 1) \u003d 4\n     * StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"ab\", 2) \u003d 1\n     * StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"\", 1)   \u003d 8\n     * StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"\", 2)   \u003d 8\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eNote that \u0027tail(CharSequence str, int n)\u0027 may be implemented as: \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   str.substring(lastOrdinalIndexOf(str, \"\\n\", n) + 1)\n     * \u003c/pre\u003e\n     *\n     * @param str  the CharSequence to check, may be null\n     * @param searchStr  the CharSequence to find, may be null\n     * @param ordinal  the n-th last {@code searchStr} to find\n     * @return the n-th last index of the search CharSequence,\n     *  {@code -1} ({@code INDEX_NOT_FOUND}) if no match or {@code null} string input\n     * @since 2.5\n     * @since 3.0 Changed signature from lastOrdinalIndexOf(String, String, int) to lastOrdinalIndexOf(CharSequence, CharSequence, int)\n     ",
      "child_ranges": [
        "(line 1228,col 9)-(line 1228,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastIndexOf(java.lang.CharSequence, java.lang.CharSequence, int)",
      "begin_line": 1260,
      "end_line": 1265,
      "comment": "\n     * \u003cp\u003eFinds the first index within a CharSequence, handling {@code null}.\n     * This method uses {@link String#lastIndexOf(String, int)} if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\n     * A negative start position returns {@code -1}.\n     * An empty (\"\") search CharSequence always matches unless the start position is negative.\n     * A start position greater than the string length searches the whole string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOf(null, *, *)          \u003d -1\n     * StringUtils.lastIndexOf(*, null, *)          \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"a\", 8)  \u003d 7\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\", 8)  \u003d 5\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"ab\", 8) \u003d 4\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\", 9)  \u003d 5\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\", -1) \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"a\", 0)  \u003d 0\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\", 0)  \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param seq  the CharSequence to check, may be null\n     * @param searchSeq  the CharSequence to find, may be null\n     * @param startPos  the start position, negative treated as zero\n     * @return the first index of the search CharSequence,\n     *  -1 if no match or {@code null} string input\n     * @since 2.0\n     * @since 3.0 Changed signature from lastIndexOf(String, String, int) to lastIndexOf(CharSequence, CharSequence, int)\n     ",
      "child_ranges": [
        "(line 1261,col 9)-(line 1263,col 9)",
        "(line 1264,col 9)-(line 1264,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 1290,
      "end_line": 1295,
      "comment": "\n     * \u003cp\u003eCase in-sensitive find of the last index within a CharSequence.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\n     * A negative start position returns {@code -1}.\n     * An empty (\"\") search CharSequence always matches unless the start position is negative.\n     * A start position greater than the string length searches the whole string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOfIgnoreCase(null, *)          \u003d -1\n     * StringUtils.lastIndexOfIgnoreCase(*, null)          \u003d -1\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"A\")  \u003d 7\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"B\")  \u003d 5\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"AB\") \u003d 4\n     * \u003c/pre\u003e\n     *\n     * @param str  the CharSequence to check, may be null\n     * @param searchStr  the CharSequence to find, may be null\n     * @return the first index of the search CharSequence,\n     *  -1 if no match or {@code null} string input\n     * @since 2.5\n     * @since 3.0 Changed signature from lastIndexOfIgnoreCase(String, String) to lastIndexOfIgnoreCase(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 1291,col 9)-(line 1293,col 9)",
        "(line 1294,col 9)-(line 1294,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(java.lang.CharSequence, java.lang.CharSequence, int)",
      "begin_line": 1326,
      "end_line": 1346,
      "comment": "\n     * \u003cp\u003eCase in-sensitive find of the last index within a CharSequence\n     * from the specified position.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\n     * A negative start position returns {@code -1}.\n     * An empty (\"\") search CharSequence always matches unless the start position is negative.\n     * A start position greater than the string length searches the whole string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOfIgnoreCase(null, *, *)          \u003d -1\n     * StringUtils.lastIndexOfIgnoreCase(*, null, *)          \u003d -1\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"A\", 8)  \u003d 7\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"B\", 8)  \u003d 5\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"AB\", 8) \u003d 4\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"B\", 9)  \u003d 5\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"B\", -1) \u003d -1\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"A\", 0)  \u003d 0\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"B\", 0)  \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param str  the CharSequence to check, may be null\n     * @param searchStr  the CharSequence to find, may be null\n     * @param startPos  the start position\n     * @return the first index of the search CharSequence,\n     *  -1 if no match or {@code null} input\n     * @since 2.5\n     * @since 3.0 Changed signature from lastIndexOfIgnoreCase(String, String, int) to lastIndexOfIgnoreCase(CharSequence, CharSequence, int)\n     ",
      "child_ranges": [
        "(line 1327,col 9)-(line 1329,col 9)",
        "(line 1330,col 9)-(line 1332,col 9)",
        "(line 1333,col 9)-(line 1335,col 9)",
        "(line 1336,col 9)-(line 1338,col 9)",
        "(line 1340,col 9)-(line 1344,col 9)",
        "(line 1345,col 9)-(line 1345,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.contains(java.lang.CharSequence, int)",
      "begin_line": 1370,
      "end_line": 1375,
      "comment": "\n     * \u003cp\u003eChecks if CharSequence contains a search character, handling {@code null}.\n     * This method uses {@link String#indexOf(int)} if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} or empty (\"\") CharSequence will return {@code false}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.contains(null, *)    \u003d false\n     * StringUtils.contains(\"\", *)      \u003d false\n     * StringUtils.contains(\"abc\", \u0027a\u0027) \u003d true\n     * StringUtils.contains(\"abc\", \u0027z\u0027) \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param seq  the CharSequence to check, may be null\n     * @param searchChar  the character to find\n     * @return true if the CharSequence contains the search character,\n     *  false if not or {@code null} string input\n     * @since 2.0\n     * @since 3.0 Changed signature from contains(String, int) to contains(CharSequence, int)\n     ",
      "child_ranges": [
        "(line 1371,col 9)-(line 1373,col 9)",
        "(line 1374,col 9)-(line 1374,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.contains(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 1399,
      "end_line": 1404,
      "comment": "\n     * \u003cp\u003eChecks if CharSequence contains a search CharSequence, handling {@code null}.\n     * This method uses {@link String#indexOf(String)} if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code false}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.contains(null, *)     \u003d false\n     * StringUtils.contains(*, null)     \u003d false\n     * StringUtils.contains(\"\", \"\")      \u003d true\n     * StringUtils.contains(\"abc\", \"\")   \u003d true\n     * StringUtils.contains(\"abc\", \"a\")  \u003d true\n     * StringUtils.contains(\"abc\", \"z\")  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param seq  the CharSequence to check, may be null\n     * @param searchSeq  the CharSequence to find, may be null\n     * @return true if the CharSequence contains the search CharSequence,\n     *  false if not or {@code null} string input\n     * @since 2.0\n     * @since 3.0 Changed signature from contains(String, String) to contains(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 1400,col 9)-(line 1402,col 9)",
        "(line 1403,col 9)-(line 1403,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsIgnoreCase(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 1430,
      "end_line": 1442,
      "comment": "\n     * \u003cp\u003eChecks if CharSequence contains a search CharSequence irrespective of case,\n     * handling {@code null}. Case-insensitivity is defined as by\n     * {@link String#equalsIgnoreCase(String)}.\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code false}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.contains(null, *) \u003d false\n     * StringUtils.contains(*, null) \u003d false\n     * StringUtils.contains(\"\", \"\") \u003d true\n     * StringUtils.contains(\"abc\", \"\") \u003d true\n     * StringUtils.contains(\"abc\", \"a\") \u003d true\n     * StringUtils.contains(\"abc\", \"z\") \u003d false\n     * StringUtils.contains(\"abc\", \"A\") \u003d true\n     * StringUtils.contains(\"abc\", \"Z\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the CharSequence to check, may be null\n     * @param searchStr  the CharSequence to find, may be null\n     * @return true if the CharSequence contains the search CharSequence irrespective of\n     * case or false if not or {@code null} string input\n     * @since 3.0 Changed signature from containsIgnoreCase(String, String) to containsIgnoreCase(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 1431,col 9)-(line 1433,col 9)",
        "(line 1434,col 9)-(line 1434,col 37)",
        "(line 1435,col 9)-(line 1435,col 37)",
        "(line 1436,col 9)-(line 1440,col 9)",
        "(line 1441,col 9)-(line 1441,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsWhitespace(java.lang.CharSequence)",
      "begin_line": 1453,
      "end_line": 1464,
      "comment": " From org.springframework.util.StringUtils, under Apache License 2.0",
      "child_ranges": [
        "(line 1454,col 9)-(line 1456,col 9)",
        "(line 1457,col 9)-(line 1457,col 34)",
        "(line 1458,col 9)-(line 1462,col 9)",
        "(line 1463,col 9)-(line 1463,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfAny(java.lang.CharSequence, char...)",
      "begin_line": 1491,
      "end_line": 1515,
      "comment": "\n     * \u003cp\u003eSearch a CharSequence to find the first index of any\n     * character in the given set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} String will return {@code -1}.\n     * A {@code null} or zero length search array will return {@code -1}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAny(null, *)                \u003d -1\n     * StringUtils.indexOfAny(\"\", *)                  \u003d -1\n     * StringUtils.indexOfAny(*, null)                \u003d -1\n     * StringUtils.indexOfAny(*, [])                  \u003d -1\n     * StringUtils.indexOfAny(\"zzabyycdxx\",[\u0027z\u0027,\u0027a\u0027]) \u003d 0\n     * StringUtils.indexOfAny(\"zzabyycdxx\",[\u0027b\u0027,\u0027y\u0027]) \u003d 3\n     * StringUtils.indexOfAny(\"aba\", [\u0027z\u0027])           \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the index of any of the chars, -1 if no match or null input\n     * @since 2.0\n     * @since 3.0 Changed signature from indexOfAny(String, char[]) to indexOfAny(CharSequence, char...)\n     ",
      "child_ranges": [
        "(line 1492,col 9)-(line 1494,col 9)",
        "(line 1495,col 9)-(line 1495,col 32)",
        "(line 1496,col 9)-(line 1496,col 31)",
        "(line 1497,col 9)-(line 1497,col 43)",
        "(line 1498,col 9)-(line 1498,col 39)",
        "(line 1499,col 9)-(line 1513,col 9)",
        "(line 1514,col 9)-(line 1514,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfAny(java.lang.CharSequence, java.lang.String)",
      "begin_line": 1540,
      "end_line": 1545,
      "comment": "\n     * \u003cp\u003eSearch a CharSequence to find the first index of any\n     * character in the given set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} String will return {@code -1}.\n     * A {@code null} search string will return {@code -1}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAny(null, *)            \u003d -1\n     * StringUtils.indexOfAny(\"\", *)              \u003d -1\n     * StringUtils.indexOfAny(*, null)            \u003d -1\n     * StringUtils.indexOfAny(*, \"\")              \u003d -1\n     * StringUtils.indexOfAny(\"zzabyycdxx\", \"za\") \u003d 0\n     * StringUtils.indexOfAny(\"zzabyycdxx\", \"by\") \u003d 3\n     * StringUtils.indexOfAny(\"aba\",\"z\")          \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the index of any of the chars, -1 if no match or null input\n     * @since 2.0\n     * @since 3.0 Changed signature from indexOfAny(String, String) to indexOfAny(CharSequence, String)\n     ",
      "child_ranges": [
        "(line 1541,col 9)-(line 1543,col 9)",
        "(line 1544,col 9)-(line 1544,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsAny(java.lang.CharSequence, char...)",
      "begin_line": 1573,
      "end_line": 1601,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains any character in the given\n     * set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code false}.\n     * A {@code null} or zero length search array will return {@code false}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsAny(null, *)                \u003d false\n     * StringUtils.containsAny(\"\", *)                  \u003d false\n     * StringUtils.containsAny(*, null)                \u003d false\n     * StringUtils.containsAny(*, [])                  \u003d false\n     * StringUtils.containsAny(\"zzabyycdxx\",[\u0027z\u0027,\u0027a\u0027]) \u003d true\n     * StringUtils.containsAny(\"zzabyycdxx\",[\u0027b\u0027,\u0027y\u0027]) \u003d true\n     * StringUtils.containsAny(\"aba\", [\u0027z\u0027])           \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the {@code true} if any of the chars are found,\n     * {@code false} if no match or null input\n     * @since 2.4\n     * @since 3.0 Changed signature from containsAny(String, char[]) to containsAny(CharSequence, char...)\n     ",
      "child_ranges": [
        "(line 1574,col 9)-(line 1576,col 9)",
        "(line 1577,col 9)-(line 1577,col 35)",
        "(line 1578,col 9)-(line 1578,col 46)",
        "(line 1579,col 9)-(line 1579,col 34)",
        "(line 1580,col 9)-(line 1580,col 42)",
        "(line 1581,col 9)-(line 1599,col 9)",
        "(line 1600,col 9)-(line 1600,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsAny(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 1631,
      "end_line": 1636,
      "comment": "\n     * \u003cp\u003e\n     * Checks if the CharSequence contains any character in the given set of characters.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * A {@code null} CharSequence will return {@code false}. A {@code null} search CharSequence will return\n     * {@code false}.\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsAny(null, *)            \u003d false\n     * StringUtils.containsAny(\"\", *)              \u003d false\n     * StringUtils.containsAny(*, null)            \u003d false\n     * StringUtils.containsAny(*, \"\")              \u003d false\n     * StringUtils.containsAny(\"zzabyycdxx\", \"za\") \u003d true\n     * StringUtils.containsAny(\"zzabyycdxx\", \"by\") \u003d true\n     * StringUtils.containsAny(\"aba\",\"z\")          \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs\n     *            the CharSequence to check, may be null\n     * @param searchChars\n     *            the chars to search for, may be null\n     * @return the {@code true} if any of the chars are found, {@code false} if no match or null input\n     * @since 2.4\n     * @since 3.0 Changed signature from containsAny(String, String) to containsAny(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 1632,col 9)-(line 1634,col 9)",
        "(line 1635,col 9)-(line 1635,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfAnyBut(java.lang.CharSequence, char...)",
      "begin_line": 1664,
      "end_line": 1689,
      "comment": "\n     * \u003cp\u003eSearches a CharSequence to find the first index of any\n     * character not in the given set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\n     * A {@code null} or zero length search array will return {@code -1}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAnyBut(null, *)                              \u003d -1\n     * StringUtils.indexOfAnyBut(\"\", *)                                \u003d -1\n     * StringUtils.indexOfAnyBut(*, null)                              \u003d -1\n     * StringUtils.indexOfAnyBut(*, [])                                \u003d -1\n     * StringUtils.indexOfAnyBut(\"zzabyycdxx\", new char[] {\u0027z\u0027, \u0027a\u0027} ) \u003d 3\n     * StringUtils.indexOfAnyBut(\"aba\", new char[] {\u0027z\u0027} )             \u003d 0\n     * StringUtils.indexOfAnyBut(\"aba\", new char[] {\u0027a\u0027, \u0027b\u0027} )        \u003d -1\n\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the index of any of the chars, -1 if no match or null input\n     * @since 2.0\n     * @since 3.0 Changed signature from indexOfAnyBut(String, char[]) to indexOfAnyBut(CharSequence, char...)\n     ",
      "child_ranges": [
        "(line 1665,col 9)-(line 1667,col 9)",
        "(line 1668,col 9)-(line 1668,col 32)",
        "(line 1669,col 9)-(line 1669,col 31)",
        "(line 1670,col 9)-(line 1670,col 43)",
        "(line 1671,col 9)-(line 1671,col 39)",
        "(line 1672,col 9)-(line 1687,col 9)",
        "(line 1688,col 9)-(line 1688,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfAnyBut(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 1714,
      "end_line": 1734,
      "comment": "\n     * \u003cp\u003eSearch a CharSequence to find the first index of any\n     * character not in the given set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\n     * A {@code null} or empty search string will return {@code -1}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAnyBut(null, *)            \u003d -1\n     * StringUtils.indexOfAnyBut(\"\", *)              \u003d -1\n     * StringUtils.indexOfAnyBut(*, null)            \u003d -1\n     * StringUtils.indexOfAnyBut(*, \"\")              \u003d -1\n     * StringUtils.indexOfAnyBut(\"zzabyycdxx\", \"za\") \u003d 3\n     * StringUtils.indexOfAnyBut(\"zzabyycdxx\", \"\")   \u003d -1\n     * StringUtils.indexOfAnyBut(\"aba\",\"ab\")         \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param seq  the CharSequence to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the index of any of the chars, -1 if no match or null input\n     * @since 2.0\n     * @since 3.0 Changed signature from indexOfAnyBut(String, String) to indexOfAnyBut(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 1715,col 9)-(line 1717,col 9)",
        "(line 1718,col 9)-(line 1718,col 34)",
        "(line 1719,col 9)-(line 1732,col 9)",
        "(line 1733,col 9)-(line 1733,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsOnly(java.lang.CharSequence, char...)",
      "begin_line": 1760,
      "end_line": 1772,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only certain characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code false}.\n     * A {@code null} valid character array will return {@code false}.\n     * An empty CharSequence (length()\u003d0) always returns {@code true}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsOnly(null, *)       \u003d false\n     * StringUtils.containsOnly(*, null)       \u003d false\n     * StringUtils.containsOnly(\"\", *)         \u003d true\n     * StringUtils.containsOnly(\"ab\", \u0027\u0027)      \u003d false\n     * StringUtils.containsOnly(\"abab\", \u0027abc\u0027) \u003d true\n     * StringUtils.containsOnly(\"ab1\", \u0027abc\u0027)  \u003d false\n     * StringUtils.containsOnly(\"abz\", \u0027abc\u0027)  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the String to check, may be null\n     * @param valid  an array of valid chars, may be null\n     * @return true if it only contains valid chars and is non-null\n     * @since 3.0 Changed signature from containsOnly(String, char[]) to containsOnly(CharSequence, char...)\n     ",
      "child_ranges": [
        "(line 1762,col 9)-(line 1764,col 9)",
        "(line 1765,col 9)-(line 1767,col 9)",
        "(line 1768,col 9)-(line 1770,col 9)",
        "(line 1771,col 9)-(line 1771,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsOnly(java.lang.CharSequence, java.lang.String)",
      "begin_line": 1797,
      "end_line": 1802,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only certain characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code false}.\n     * A {@code null} valid character String will return {@code false}.\n     * An empty String (length()\u003d0) always returns {@code true}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsOnly(null, *)       \u003d false\n     * StringUtils.containsOnly(*, null)       \u003d false\n     * StringUtils.containsOnly(\"\", *)         \u003d true\n     * StringUtils.containsOnly(\"ab\", \"\")      \u003d false\n     * StringUtils.containsOnly(\"abab\", \"abc\") \u003d true\n     * StringUtils.containsOnly(\"ab1\", \"abc\")  \u003d false\n     * StringUtils.containsOnly(\"abz\", \"abc\")  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @param validChars  a String of valid chars, may be null\n     * @return true if it only contains valid chars and is non-null\n     * @since 2.0\n     * @since 3.0 Changed signature from containsOnly(String, String) to containsOnly(CharSequence, String)\n     ",
      "child_ranges": [
        "(line 1798,col 9)-(line 1800,col 9)",
        "(line 1801,col 9)-(line 1801,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsNone(java.lang.CharSequence, char...)",
      "begin_line": 1829,
      "end_line": 1857,
      "comment": "\n     * \u003cp\u003eChecks that the CharSequence does not contain certain characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code true}.\n     * A {@code null} invalid character array will return {@code true}.\n     * An empty CharSequence (length()\u003d0) always returns true.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsNone(null, *)       \u003d true\n     * StringUtils.containsNone(*, null)       \u003d true\n     * StringUtils.containsNone(\"\", *)         \u003d true\n     * StringUtils.containsNone(\"ab\", \u0027\u0027)      \u003d true\n     * StringUtils.containsNone(\"abab\", \u0027xyz\u0027) \u003d true\n     * StringUtils.containsNone(\"ab1\", \u0027xyz\u0027)  \u003d true\n     * StringUtils.containsNone(\"abz\", \u0027xyz\u0027)  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @param searchChars  an array of invalid chars, may be null\n     * @return true if it contains none of the invalid chars, or is null\n     * @since 2.0\n     * @since 3.0 Changed signature from containsNone(String, char[]) to containsNone(CharSequence, char...)\n     ",
      "child_ranges": [
        "(line 1830,col 9)-(line 1832,col 9)",
        "(line 1833,col 9)-(line 1833,col 32)",
        "(line 1834,col 9)-(line 1834,col 31)",
        "(line 1835,col 9)-(line 1835,col 43)",
        "(line 1836,col 9)-(line 1836,col 39)",
        "(line 1837,col 9)-(line 1855,col 9)",
        "(line 1856,col 9)-(line 1856,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsNone(java.lang.CharSequence, java.lang.String)",
      "begin_line": 1882,
      "end_line": 1887,
      "comment": "\n     * \u003cp\u003eChecks that the CharSequence does not contain certain characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code true}.\n     * A {@code null} invalid character array will return {@code true}.\n     * An empty String (\"\") always returns true.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsNone(null, *)       \u003d true\n     * StringUtils.containsNone(*, null)       \u003d true\n     * StringUtils.containsNone(\"\", *)         \u003d true\n     * StringUtils.containsNone(\"ab\", \"\")      \u003d true\n     * StringUtils.containsNone(\"abab\", \"xyz\") \u003d true\n     * StringUtils.containsNone(\"ab1\", \"xyz\")  \u003d true\n     * StringUtils.containsNone(\"abz\", \"xyz\")  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @param invalidChars  a String of invalid chars, may be null\n     * @return true if it contains none of the invalid chars, or is null\n     * @since 2.0\n     * @since 3.0 Changed signature from containsNone(String, String) to containsNone(CharSequence, String)\n     ",
      "child_ranges": [
        "(line 1883,col 9)-(line 1885,col 9)",
        "(line 1886,col 9)-(line 1886,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfAny(java.lang.CharSequence, java.lang.CharSequence...)",
      "begin_line": 1918,
      "end_line": 1944,
      "comment": "\n     * \u003cp\u003eFind the first index of any of a set of potential substrings.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\n     * A {@code null} or zero length search array will return {@code -1}.\n     * A {@code null} search array entry will be ignored, but a search\n     * array containing \"\" will return {@code 0} if {@code str} is not\n     * null. This method uses {@link String#indexOf(String)} if possible.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAny(null, *)                     \u003d -1\n     * StringUtils.indexOfAny(*, null)                     \u003d -1\n     * StringUtils.indexOfAny(*, [])                       \u003d -1\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"ab\",\"cd\"])   \u003d 2\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"cd\",\"ab\"])   \u003d 2\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"mn\",\"op\"])   \u003d -1\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"zab\",\"aby\"]) \u003d 1\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"\"])          \u003d 0\n     * StringUtils.indexOfAny(\"\", [\"\"])                    \u003d 0\n     * StringUtils.indexOfAny(\"\", [\"a\"])                   \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param str  the CharSequence to check, may be null\n     * @param searchStrs  the CharSequences to search for, may be null\n     * @return the first index of any of the searchStrs in str, -1 if no match\n     * @since 3.0 Changed signature from indexOfAny(String, String[]) to indexOfAny(CharSequence, CharSequence...)\n     ",
      "child_ranges": [
        "(line 1919,col 9)-(line 1921,col 9)",
        "(line 1922,col 9)-(line 1922,col 35)",
        "(line 1925,col 9)-(line 1925,col 36)",
        "(line 1927,col 9)-(line 1927,col 20)",
        "(line 1928,col 9)-(line 1941,col 9)",
        "(line 1943,col 9)-(line 1943,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastIndexOfAny(java.lang.CharSequence, java.lang.CharSequence...)",
      "begin_line": 1972,
      "end_line": 1990,
      "comment": "\n     * \u003cp\u003eFind the latest index of any of a set of potential substrings.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\n     * A {@code null} search array will return {@code -1}.\n     * A {@code null} or zero length search array entry will be ignored,\n     * but a search array containing \"\" will return the length of {@code str}\n     * if {@code str} is not null. This method uses {@link String#indexOf(String)} if possible\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOfAny(null, *)                   \u003d -1\n     * StringUtils.lastIndexOfAny(*, null)                   \u003d -1\n     * StringUtils.lastIndexOfAny(*, [])                     \u003d -1\n     * StringUtils.lastIndexOfAny(*, [null])                 \u003d -1\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"ab\",\"cd\"]) \u003d 6\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"cd\",\"ab\"]) \u003d 6\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"mn\",\"op\"]) \u003d -1\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"mn\",\"op\"]) \u003d -1\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"mn\",\"\"])   \u003d 10\n     * \u003c/pre\u003e\n     *\n     * @param str  the CharSequence to check, may be null\n     * @param searchStrs  the CharSequences to search for, may be null\n     * @return the last index of any of the CharSequences, -1 if no match\n     * @since 3.0 Changed signature from lastIndexOfAny(String, String[]) to lastIndexOfAny(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 1973,col 9)-(line 1975,col 9)",
        "(line 1976,col 9)-(line 1976,col 35)",
        "(line 1977,col 9)-(line 1977,col 34)",
        "(line 1978,col 9)-(line 1978,col 20)",
        "(line 1979,col 9)-(line 1988,col 9)",
        "(line 1989,col 9)-(line 1989,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substring(java.lang.String, int)",
      "begin_line": 2018,
      "end_line": 2036,
      "comment": "\n     * \u003cp\u003eGets a substring from the specified String avoiding exceptions.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative start position can be used to start {@code n}\n     * characters from the end of the String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} String will return {@code null}.\n     * An empty (\"\") String will return \"\".\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substring(null, *)   \u003d null\n     * StringUtils.substring(\"\", *)     \u003d \"\"\n     * StringUtils.substring(\"abc\", 0)  \u003d \"abc\"\n     * StringUtils.substring(\"abc\", 2)  \u003d \"c\"\n     * StringUtils.substring(\"abc\", 4)  \u003d \"\"\n     * StringUtils.substring(\"abc\", -2) \u003d \"bc\"\n     * StringUtils.substring(\"abc\", -4) \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the substring from, may be null\n     * @param start  the position to start from, negative means\n     *  count back from the end of the String by this many characters\n     * @return substring from start position, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 2019,col 9)-(line 2021,col 9)",
        "(line 2024,col 9)-(line 2026,col 9)",
        "(line 2028,col 9)-(line 2030,col 9)",
        "(line 2031,col 9)-(line 2033,col 9)",
        "(line 2035,col 9)-(line 2035,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substring(java.lang.String, int, int)",
      "begin_line": 2073,
      "end_line": 2104,
      "comment": "\n     * \u003cp\u003eGets a substring from the specified String avoiding exceptions.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative start position can be used to start/end {@code n}\n     * characters from the end of the String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe returned substring starts with the character in the {@code start}\n     * position and ends before the {@code end} position. All position counting is\n     * zero-based -- i.e., to start at the beginning of the string use\n     * {@code start \u003d 0}. Negative start and end positions can be used to\n     * specify offsets relative to the end of the String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf {@code start} is not strictly to the left of {@code end}, \"\"\n     * is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substring(null, *, *)    \u003d null\n     * StringUtils.substring(\"\", * ,  *)    \u003d \"\";\n     * StringUtils.substring(\"abc\", 0, 2)   \u003d \"ab\"\n     * StringUtils.substring(\"abc\", 2, 0)   \u003d \"\"\n     * StringUtils.substring(\"abc\", 2, 4)   \u003d \"c\"\n     * StringUtils.substring(\"abc\", 4, 6)   \u003d \"\"\n     * StringUtils.substring(\"abc\", 2, 2)   \u003d \"\"\n     * StringUtils.substring(\"abc\", -2, -1) \u003d \"b\"\n     * StringUtils.substring(\"abc\", -4, 2)  \u003d \"ab\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the substring from, may be null\n     * @param start  the position to start from, negative means\n     *  count back from the end of the String by this many characters\n     * @param end  the position to end at (exclusive), negative means\n     *  count back from the end of the String by this many characters\n     * @return substring from start position to end position,\n     *  {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 2074,col 9)-(line 2076,col 9)",
        "(line 2079,col 9)-(line 2081,col 9)",
        "(line 2082,col 9)-(line 2084,col 9)",
        "(line 2087,col 9)-(line 2089,col 9)",
        "(line 2092,col 9)-(line 2094,col 9)",
        "(line 2096,col 9)-(line 2098,col 9)",
        "(line 2099,col 9)-(line 2101,col 9)",
        "(line 2103,col 9)-(line 2103,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.left(java.lang.String, int)",
      "begin_line": 2128,
      "end_line": 2139,
      "comment": "\n     * \u003cp\u003eGets the leftmost {@code len} characters of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf {@code len} characters are not available, or the\n     * String is {@code null}, the String will be returned without\n     * an exception. An empty String is returned if len is negative.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.left(null, *)    \u003d null\n     * StringUtils.left(*, -ve)     \u003d \"\"\n     * StringUtils.left(\"\", *)      \u003d \"\"\n     * StringUtils.left(\"abc\", 0)   \u003d \"\"\n     * StringUtils.left(\"abc\", 2)   \u003d \"ab\"\n     * StringUtils.left(\"abc\", 4)   \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the leftmost characters from, may be null\n     * @param len  the length of the required String\n     * @return the leftmost characters, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 2129,col 9)-(line 2131,col 9)",
        "(line 2132,col 9)-(line 2134,col 9)",
        "(line 2135,col 9)-(line 2137,col 9)",
        "(line 2138,col 9)-(line 2138,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.right(java.lang.String, int)",
      "begin_line": 2161,
      "end_line": 2172,
      "comment": "\n     * \u003cp\u003eGets the rightmost {@code len} characters of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf {@code len} characters are not available, or the String\n     * is {@code null}, the String will be returned without an\n     * an exception. An empty String is returned if len is negative.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.right(null, *)    \u003d null\n     * StringUtils.right(*, -ve)     \u003d \"\"\n     * StringUtils.right(\"\", *)      \u003d \"\"\n     * StringUtils.right(\"abc\", 0)   \u003d \"\"\n     * StringUtils.right(\"abc\", 2)   \u003d \"bc\"\n     * StringUtils.right(\"abc\", 4)   \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the rightmost characters from, may be null\n     * @param len  the length of the required String\n     * @return the rightmost characters, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 2162,col 9)-(line 2164,col 9)",
        "(line 2165,col 9)-(line 2167,col 9)",
        "(line 2168,col 9)-(line 2170,col 9)",
        "(line 2171,col 9)-(line 2171,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.mid(java.lang.String, int, int)",
      "begin_line": 2199,
      "end_line": 2213,
      "comment": "\n     * \u003cp\u003eGets {@code len} characters from the middle of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf {@code len} characters are not available, the remainder\n     * of the String will be returned without an exception. If the\n     * String is {@code null}, {@code null} will be returned.\n     * An empty String is returned if len is negative or exceeds the\n     * length of {@code str}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.mid(null, *, *)    \u003d null\n     * StringUtils.mid(*, *, -ve)     \u003d \"\"\n     * StringUtils.mid(\"\", 0, *)      \u003d \"\"\n     * StringUtils.mid(\"abc\", 0, 2)   \u003d \"ab\"\n     * StringUtils.mid(\"abc\", 0, 4)   \u003d \"abc\"\n     * StringUtils.mid(\"abc\", 2, 4)   \u003d \"c\"\n     * StringUtils.mid(\"abc\", 4, 2)   \u003d \"\"\n     * StringUtils.mid(\"abc\", -2, 2)  \u003d \"ab\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the characters from, may be null\n     * @param pos  the position to start from, negative treated as zero\n     * @param len  the length of the required String\n     * @return the middle characters, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 2200,col 9)-(line 2202,col 9)",
        "(line 2203,col 9)-(line 2205,col 9)",
        "(line 2206,col 9)-(line 2208,col 9)",
        "(line 2209,col 9)-(line 2211,col 9)",
        "(line 2212,col 9)-(line 2212,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringBefore(java.lang.String, java.lang.String)",
      "begin_line": 2244,
      "end_line": 2256,
      "comment": "\n     * \u003cp\u003eGets the substring before the first occurrence of a separator.\n     * The separator is not returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} string input will return {@code null}.\n     * An empty (\"\") string input will return the empty string.\n     * A {@code null} separator will return the input string.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf nothing is found, the string input is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringBefore(null, *)      \u003d null\n     * StringUtils.substringBefore(\"\", *)        \u003d \"\"\n     * StringUtils.substringBefore(\"abc\", \"a\")   \u003d \"\"\n     * StringUtils.substringBefore(\"abcba\", \"b\") \u003d \"a\"\n     * StringUtils.substringBefore(\"abc\", \"c\")   \u003d \"ab\"\n     * StringUtils.substringBefore(\"abc\", \"d\")   \u003d \"abc\"\n     * StringUtils.substringBefore(\"abc\", \"\")    \u003d \"\"\n     * StringUtils.substringBefore(\"abc\", null)  \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get a substring from, may be null\n     * @param separator  the String to search for, may be null\n     * @return the substring before the first occurrence of the separator,\n     *  {@code null} if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2245,col 9)-(line 2247,col 9)",
        "(line 2248,col 9)-(line 2250,col 9)",
        "(line 2251,col 9)-(line 2251,col 41)",
        "(line 2252,col 9)-(line 2254,col 9)",
        "(line 2255,col 9)-(line 2255,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringAfter(java.lang.String, java.lang.String)",
      "begin_line": 2286,
      "end_line": 2298,
      "comment": "\n     * \u003cp\u003eGets the substring after the first occurrence of a separator.\n     * The separator is not returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} string input will return {@code null}.\n     * An empty (\"\") string input will return the empty string.\n     * A {@code null} separator will return the empty string if the\n     * input string is not {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf nothing is found, the empty string is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringAfter(null, *)      \u003d null\n     * StringUtils.substringAfter(\"\", *)        \u003d \"\"\n     * StringUtils.substringAfter(*, null)      \u003d \"\"\n     * StringUtils.substringAfter(\"abc\", \"a\")   \u003d \"bc\"\n     * StringUtils.substringAfter(\"abcba\", \"b\") \u003d \"cba\"\n     * StringUtils.substringAfter(\"abc\", \"c\")   \u003d \"\"\n     * StringUtils.substringAfter(\"abc\", \"d\")   \u003d \"\"\n     * StringUtils.substringAfter(\"abc\", \"\")    \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get a substring from, may be null\n     * @param separator  the String to search for, may be null\n     * @return the substring after the first occurrence of the separator,\n     *  {@code null} if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2287,col 9)-(line 2289,col 9)",
        "(line 2290,col 9)-(line 2292,col 9)",
        "(line 2293,col 9)-(line 2293,col 41)",
        "(line 2294,col 9)-(line 2296,col 9)",
        "(line 2297,col 9)-(line 2297,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringBeforeLast(java.lang.String, java.lang.String)",
      "begin_line": 2327,
      "end_line": 2336,
      "comment": "\n     * \u003cp\u003eGets the substring before the last occurrence of a separator.\n     * The separator is not returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} string input will return {@code null}.\n     * An empty (\"\") string input will return the empty string.\n     * An empty or {@code null} separator will return the input string.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf nothing is found, the string input is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringBeforeLast(null, *)      \u003d null\n     * StringUtils.substringBeforeLast(\"\", *)        \u003d \"\"\n     * StringUtils.substringBeforeLast(\"abcba\", \"b\") \u003d \"abc\"\n     * StringUtils.substringBeforeLast(\"abc\", \"c\")   \u003d \"ab\"\n     * StringUtils.substringBeforeLast(\"a\", \"a\")     \u003d \"\"\n     * StringUtils.substringBeforeLast(\"a\", \"z\")     \u003d \"a\"\n     * StringUtils.substringBeforeLast(\"a\", null)    \u003d \"a\"\n     * StringUtils.substringBeforeLast(\"a\", \"\")      \u003d \"a\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get a substring from, may be null\n     * @param separator  the String to search for, may be null\n     * @return the substring before the last occurrence of the separator,\n     *  {@code null} if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2328,col 9)-(line 2330,col 9)",
        "(line 2331,col 9)-(line 2331,col 45)",
        "(line 2332,col 9)-(line 2334,col 9)",
        "(line 2335,col 9)-(line 2335,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringAfterLast(java.lang.String, java.lang.String)",
      "begin_line": 2367,
      "end_line": 2379,
      "comment": "\n     * \u003cp\u003eGets the substring after the last occurrence of a separator.\n     * The separator is not returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} string input will return {@code null}.\n     * An empty (\"\") string input will return the empty string.\n     * An empty or {@code null} separator will return the empty string if\n     * the input string is not {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf nothing is found, the empty string is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringAfterLast(null, *)      \u003d null\n     * StringUtils.substringAfterLast(\"\", *)        \u003d \"\"\n     * StringUtils.substringAfterLast(*, \"\")        \u003d \"\"\n     * StringUtils.substringAfterLast(*, null)      \u003d \"\"\n     * StringUtils.substringAfterLast(\"abc\", \"a\")   \u003d \"bc\"\n     * StringUtils.substringAfterLast(\"abcba\", \"b\") \u003d \"a\"\n     * StringUtils.substringAfterLast(\"abc\", \"c\")   \u003d \"\"\n     * StringUtils.substringAfterLast(\"a\", \"a\")     \u003d \"\"\n     * StringUtils.substringAfterLast(\"a\", \"z\")     \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get a substring from, may be null\n     * @param separator  the String to search for, may be null\n     * @return the substring after the last occurrence of the separator,\n     *  {@code null} if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2368,col 9)-(line 2370,col 9)",
        "(line 2371,col 9)-(line 2373,col 9)",
        "(line 2374,col 9)-(line 2374,col 45)",
        "(line 2375,col 9)-(line 2377,col 9)",
        "(line 2378,col 9)-(line 2378,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringBetween(java.lang.String, java.lang.String)",
      "begin_line": 2404,
      "end_line": 2406,
      "comment": "\n     * \u003cp\u003eGets the String that is nested in between two instances of the\n     * same String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * A {@code null} tag returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringBetween(null, *)            \u003d null\n     * StringUtils.substringBetween(\"\", \"\")             \u003d \"\"\n     * StringUtils.substringBetween(\"\", \"tag\")          \u003d null\n     * StringUtils.substringBetween(\"tagabctag\", null)  \u003d null\n     * StringUtils.substringBetween(\"tagabctag\", \"\")    \u003d \"\"\n     * StringUtils.substringBetween(\"tagabctag\", \"tag\") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String containing the substring, may be null\n     * @param tag  the String before and after the substring, may be null\n     * @return the substring, {@code null} if no match\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2405,col 9)-(line 2405,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringBetween(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 2435,
      "end_line": 2447,
      "comment": "\n     * \u003cp\u003eGets the String that is nested in between two Strings.\n     * Only the first match is returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * A {@code null} open/close returns {@code null} (no match).\n     * An empty (\"\") open and close returns an empty string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringBetween(\"wx[b]yz\", \"[\", \"]\") \u003d \"b\"\n     * StringUtils.substringBetween(null, *, *)          \u003d null\n     * StringUtils.substringBetween(*, null, *)          \u003d null\n     * StringUtils.substringBetween(*, *, null)          \u003d null\n     * StringUtils.substringBetween(\"\", \"\", \"\")          \u003d \"\"\n     * StringUtils.substringBetween(\"\", \"\", \"]\")         \u003d null\n     * StringUtils.substringBetween(\"\", \"[\", \"]\")        \u003d null\n     * StringUtils.substringBetween(\"yabcz\", \"\", \"\")     \u003d \"\"\n     * StringUtils.substringBetween(\"yabcz\", \"y\", \"z\")   \u003d \"abc\"\n     * StringUtils.substringBetween(\"yabczyabcz\", \"y\", \"z\")   \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String containing the substring, may be null\n     * @param open  the String before the substring, may be null\n     * @param close  the String after the substring, may be null\n     * @return the substring, {@code null} if no match\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2436,col 9)-(line 2438,col 9)",
        "(line 2439,col 9)-(line 2439,col 38)",
        "(line 2440,col 9)-(line 2445,col 9)",
        "(line 2446,col 9)-(line 2446,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringsBetween(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 2471,
      "end_line": 2500,
      "comment": "\n     * \u003cp\u003eSearches a String for substrings delimited by a start and end tag,\n     * returning all matching substrings in an array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * A {@code null} open/close returns {@code null} (no match).\n     * An empty (\"\") open/close returns {@code null} (no match).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringsBetween(\"[a][b][c]\", \"[\", \"]\") \u003d [\"a\",\"b\",\"c\"]\n     * StringUtils.substringsBetween(null, *, *)            \u003d null\n     * StringUtils.substringsBetween(*, null, *)            \u003d null\n     * StringUtils.substringsBetween(*, *, null)            \u003d null\n     * StringUtils.substringsBetween(\"\", \"[\", \"]\")          \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param str  the String containing the substrings, null returns null, empty returns empty\n     * @param open  the String identifying the start of the substring, empty returns null\n     * @param close  the String identifying the end of the substring, empty returns null\n     * @return a String Array of substrings, or {@code null} if no match\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 2472,col 9)-(line 2474,col 9)",
        "(line 2475,col 9)-(line 2475,col 34)",
        "(line 2476,col 9)-(line 2478,col 9)",
        "(line 2479,col 9)-(line 2479,col 38)",
        "(line 2480,col 9)-(line 2480,col 36)",
        "(line 2481,col 9)-(line 2481,col 52)",
        "(line 2482,col 9)-(line 2482,col 20)",
        "(line 2483,col 9)-(line 2495,col 9)",
        "(line 2496,col 9)-(line 2498,col 9)",
        "(line 2499,col 9)-(line 2499,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.split(java.lang.String)",
      "begin_line": 2529,
      "end_line": 2531,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, using whitespace as the\n     * separator.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as one separator.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.split(null)       \u003d null\n     * StringUtils.split(\"\")         \u003d []\n     * StringUtils.split(\"abc def\")  \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\"abc  def\") \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\" abc \")    \u003d [\"abc\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @return an array of parsed Strings, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 2530,col 9)-(line 2530,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.split(java.lang.String, char)",
      "begin_line": 2557,
      "end_line": 2559,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator specified.\n     * This is an alternative to using StringTokenizer.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as one separator.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.split(null, *)         \u003d null\n     * StringUtils.split(\"\", *)           \u003d []\n     * StringUtils.split(\"a.b.c\", \u0027.\u0027)    \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.split(\"a..b.c\", \u0027.\u0027)   \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.split(\"a:b:c\", \u0027.\u0027)    \u003d [\"a:b:c\"]\n     * StringUtils.split(\"a b c\", \u0027 \u0027)    \u003d [\"a\", \"b\", \"c\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separatorChar  the character used as the delimiter\n     * @return an array of parsed Strings, {@code null} if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2558,col 9)-(line 2558,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.split(java.lang.String, java.lang.String)",
      "begin_line": 2586,
      "end_line": 2588,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separators specified.\n     * This is an alternative to using StringTokenizer.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as one separator.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * A {@code null} separatorChars splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.split(null, *)         \u003d null\n     * StringUtils.split(\"\", *)           \u003d []\n     * StringUtils.split(\"abc def\", null) \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\"abc def\", \" \")  \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\"abc  def\", \" \") \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\"ab:cd:ef\", \":\") \u003d [\"ab\", \"cd\", \"ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separatorChars  the characters used as the delimiters,\n     *  {@code null} splits on whitespace\n     * @return an array of parsed Strings, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 2587,col 9)-(line 2587,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.split(java.lang.String, java.lang.String, int)",
      "begin_line": 2620,
      "end_line": 2622,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array with a maximum length,\n     * separators specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as one separator.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * A {@code null} separatorChars splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf more than {@code max} delimited substrings are found, the last\n     * returned string includes all characters after the first {@code max - 1}\n     * returned strings (including separator characters).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.split(null, *, *)            \u003d null\n     * StringUtils.split(\"\", *, *)              \u003d []\n     * StringUtils.split(\"ab de fg\", null, 0)   \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.split(\"ab   de fg\", null, 0) \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.split(\"ab:cd:ef\", \":\", 0)    \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.split(\"ab:cd:ef\", \":\", 2)    \u003d [\"ab\", \"cd:ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separatorChars  the characters used as the delimiters,\n     *  {@code null} splits on whitespace\n     * @param max  the maximum number of elements to include in the\n     *  array. A zero or negative value implies no limit\n     * @return an array of parsed Strings, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 2621,col 9)-(line 2621,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByWholeSeparator(java.lang.String, java.lang.String)",
      "begin_line": 2647,
      "end_line": 2649,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator string specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator(s) will not be included in the returned String array.\n     * Adjacent separators are treated as one separator.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * A {@code null} separator splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitByWholeSeparator(null, *)               \u003d null\n     * StringUtils.splitByWholeSeparator(\"\", *)                 \u003d []\n     * StringUtils.splitByWholeSeparator(\"ab de fg\", null)      \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparator(\"ab   de fg\", null)    \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparator(\"ab:cd:ef\", \":\")       \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitByWholeSeparator(\"ab-!-cd-!-ef\", \"-!-\") \u003d [\"ab\", \"cd\", \"ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separator  String containing the String to be used as a delimiter,\n     *  {@code null} splits on whitespace\n     * @return an array of parsed Strings, {@code null} if null String was input\n     ",
      "child_ranges": [
        "(line 2648,col 9)-(line 2648,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByWholeSeparator(java.lang.String, java.lang.String, int)",
      "begin_line": 2678,
      "end_line": 2680,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator string specified.\n     * Returns a maximum of {@code max} substrings.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator(s) will not be included in the returned String array.\n     * Adjacent separators are treated as one separator.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * A {@code null} separator splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitByWholeSeparator(null, *, *)               \u003d null\n     * StringUtils.splitByWholeSeparator(\"\", *, *)                 \u003d []\n     * StringUtils.splitByWholeSeparator(\"ab de fg\", null, 0)      \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparator(\"ab   de fg\", null, 0)    \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparator(\"ab:cd:ef\", \":\", 2)       \u003d [\"ab\", \"cd:ef\"]\n     * StringUtils.splitByWholeSeparator(\"ab-!-cd-!-ef\", \"-!-\", 5) \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitByWholeSeparator(\"ab-!-cd-!-ef\", \"-!-\", 2) \u003d [\"ab\", \"cd-!-ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separator  String containing the String to be used as a delimiter,\n     *  {@code null} splits on whitespace\n     * @param max  the maximum number of elements to include in the returned\n     *  array. A zero or negative value implies no limit.\n     * @return an array of parsed Strings, {@code null} if null String was input\n     ",
      "child_ranges": [
        "(line 2679,col 9)-(line 2679,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(java.lang.String, java.lang.String)",
      "begin_line": 2707,
      "end_line": 2709,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator string specified. \u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * A {@code null} separator splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(null, *)               \u003d null\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"\", *)                 \u003d []\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab de fg\", null)      \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab   de fg\", null)    \u003d [\"ab\", \"\", \"\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab:cd:ef\", \":\")       \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab-!-cd-!-ef\", \"-!-\") \u003d [\"ab\", \"cd\", \"ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separator  String containing the String to be used as a delimiter,\n     *  {@code null} splits on whitespace\n     * @return an array of parsed Strings, {@code null} if null String was input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 2708,col 9)-(line 2708,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(java.lang.String, java.lang.String, int)",
      "begin_line": 2740,
      "end_line": 2742,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator string specified.\n     * Returns a maximum of {@code max} substrings.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * A {@code null} separator splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(null, *, *)               \u003d null\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"\", *, *)                 \u003d []\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab de fg\", null, 0)      \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab   de fg\", null, 0)    \u003d [\"ab\", \"\", \"\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab:cd:ef\", \":\", 2)       \u003d [\"ab\", \"cd:ef\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab-!-cd-!-ef\", \"-!-\", 5) \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab-!-cd-!-ef\", \"-!-\", 2) \u003d [\"ab\", \"cd-!-ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separator  String containing the String to be used as a delimiter,\n     *  {@code null} splits on whitespace\n     * @param max  the maximum number of elements to include in the returned\n     *  array. A zero or negative value implies no limit.\n     * @return an array of parsed Strings, {@code null} if null String was input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 2741,col 9)-(line 2741,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByWholeSeparatorWorker(java.lang.String, java.lang.String, int, boolean)",
      "begin_line": 2758,
      "end_line": 2822,
      "comment": "\n     * Performs the logic for the {@code splitByWholeSeparatorPreserveAllTokens} methods.\n     *\n     * @param str  the String to parse, may be {@code null}\n     * @param separator  String containing the String to be used as a delimiter,\n     *  {@code null} splits on whitespace\n     * @param max  the maximum number of elements to include in the returned\n     *  array. A zero or negative value implies no limit.\n     * @param preserveAllTokens if {@code true}, adjacent separators are\n     * treated as empty token separators; if {@code false}, adjacent\n     * separators are treated as one separator.\n     * @return an array of parsed Strings, {@code null} if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 2760,col 9)-(line 2762,col 9)",
        "(line 2764,col 9)-(line 2764,col 31)",
        "(line 2766,col 9)-(line 2768,col 9)",
        "(line 2770,col 9)-(line 2773,col 9)",
        "(line 2775,col 9)-(line 2775,col 49)",
        "(line 2777,col 9)-(line 2777,col 63)",
        "(line 2778,col 9)-(line 2778,col 35)",
        "(line 2779,col 9)-(line 2779,col 20)",
        "(line 2780,col 9)-(line 2780,col 20)",
        "(line 2781,col 9)-(line 2819,col 9)",
        "(line 2821,col 9)-(line 2821,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(java.lang.String)",
      "begin_line": 2849,
      "end_line": 2851,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, using whitespace as the\n     * separator, preserving all tokens, including empty tokens created by\n     * adjacent separators. This is an alternative to using StringTokenizer.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitPreserveAllTokens(null)       \u003d null\n     * StringUtils.splitPreserveAllTokens(\"\")         \u003d []\n     * StringUtils.splitPreserveAllTokens(\"abc def\")  \u003d [\"abc\", \"def\"]\n     * StringUtils.splitPreserveAllTokens(\"abc  def\") \u003d [\"abc\", \"\", \"def\"]\n     * StringUtils.splitPreserveAllTokens(\" abc \")    \u003d [\"\", \"abc\", \"\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be {@code null}\n     * @return an array of parsed Strings, {@code null} if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2850,col 9)-(line 2850,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(java.lang.String, char)",
      "begin_line": 2885,
      "end_line": 2887,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator specified,\n     * preserving all tokens, including empty tokens created by adjacent\n     * separators. This is an alternative to using StringTokenizer.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitPreserveAllTokens(null, *)         \u003d null\n     * StringUtils.splitPreserveAllTokens(\"\", *)           \u003d []\n     * StringUtils.splitPreserveAllTokens(\"a.b.c\", \u0027.\u0027)    \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"a..b.c\", \u0027.\u0027)   \u003d [\"a\", \"\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"a:b:c\", \u0027.\u0027)    \u003d [\"a:b:c\"]\n     * StringUtils.splitPreserveAllTokens(\"a\\tb\\nc\", null) \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"a b c\", \u0027 \u0027)    \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"a b c \", \u0027 \u0027)   \u003d [\"a\", \"b\", \"c\", \"\"]\n     * StringUtils.splitPreserveAllTokens(\"a b c  \", \u0027 \u0027)   \u003d [\"a\", \"b\", \"c\", \"\", \"\"]\n     * StringUtils.splitPreserveAllTokens(\" a b c\", \u0027 \u0027)   \u003d [\"\", a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"  a b c\", \u0027 \u0027)  \u003d [\"\", \"\", a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\" a b c \", \u0027 \u0027)  \u003d [\"\", a\", \"b\", \"c\", \"\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be {@code null}\n     * @param separatorChar  the character used as the delimiter,\n     *  {@code null} splits on whitespace\n     * @return an array of parsed Strings, {@code null} if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2886,col 9)-(line 2886,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitWorker(java.lang.String, char, boolean)",
      "begin_line": 2901,
      "end_line": 2933,
      "comment": "\n     * Performs the logic for the {@code split} and\n     * {@code splitPreserveAllTokens} methods that do not return a\n     * maximum array length.\n     *\n     * @param str  the String to parse, may be {@code null}\n     * @param separatorChar the separate character\n     * @param preserveAllTokens if {@code true}, adjacent separators are\n     * treated as empty token separators; if {@code false}, adjacent\n     * separators are treated as one separator.\n     * @return an array of parsed Strings, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 2904,col 9)-(line 2906,col 9)",
        "(line 2907,col 9)-(line 2907,col 31)",
        "(line 2908,col 9)-(line 2910,col 9)",
        "(line 2911,col 9)-(line 2911,col 52)",
        "(line 2912,col 9)-(line 2912,col 29)",
        "(line 2913,col 9)-(line 2913,col 30)",
        "(line 2914,col 9)-(line 2914,col 34)",
        "(line 2915,col 9)-(line 2928,col 9)",
        "(line 2929,col 9)-(line 2931,col 9)",
        "(line 2932,col 9)-(line 2932,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(java.lang.String, java.lang.String)",
      "begin_line": 2968,
      "end_line": 2970,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separators specified,\n     * preserving all tokens, including empty tokens created by adjacent\n     * separators. This is an alternative to using StringTokenizer.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * A {@code null} separatorChars splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitPreserveAllTokens(null, *)           \u003d null\n     * StringUtils.splitPreserveAllTokens(\"\", *)             \u003d []\n     * StringUtils.splitPreserveAllTokens(\"abc def\", null)   \u003d [\"abc\", \"def\"]\n     * StringUtils.splitPreserveAllTokens(\"abc def\", \" \")    \u003d [\"abc\", \"def\"]\n     * StringUtils.splitPreserveAllTokens(\"abc  def\", \" \")   \u003d [\"abc\", \"\", def\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef\", \":\")   \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef:\", \":\")  \u003d [\"ab\", \"cd\", \"ef\", \"\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef::\", \":\") \u003d [\"ab\", \"cd\", \"ef\", \"\", \"\"]\n     * StringUtils.splitPreserveAllTokens(\"ab::cd:ef\", \":\")  \u003d [\"ab\", \"\", cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\":cd:ef\", \":\")     \u003d [\"\", cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"::cd:ef\", \":\")    \u003d [\"\", \"\", cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\":cd:ef:\", \":\")    \u003d [\"\", cd\", \"ef\", \"\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be {@code null}\n     * @param separatorChars  the characters used as the delimiters,\n     *  {@code null} splits on whitespace\n     * @return an array of parsed Strings, {@code null} if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2969,col 9)-(line 2969,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(java.lang.String, java.lang.String, int)",
      "begin_line": 3008,
      "end_line": 3010,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array with a maximum length,\n     * separators specified, preserving all tokens, including empty tokens\n     * created by adjacent separators.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * Adjacent separators are treated as one separator.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * A {@code null} separatorChars splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf more than {@code max} delimited substrings are found, the last\n     * returned string includes all characters after the first {@code max - 1}\n     * returned strings (including separator characters).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitPreserveAllTokens(null, *, *)            \u003d null\n     * StringUtils.splitPreserveAllTokens(\"\", *, *)              \u003d []\n     * StringUtils.splitPreserveAllTokens(\"ab de fg\", null, 0)   \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab   de fg\", null, 0) \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef\", \":\", 0)    \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef\", \":\", 2)    \u003d [\"ab\", \"cd:ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab   de fg\", null, 2) \u003d [\"ab\", \"  de fg\"]\n     * StringUtils.splitPreserveAllTokens(\"ab   de fg\", null, 3) \u003d [\"ab\", \"\", \" de fg\"]\n     * StringUtils.splitPreserveAllTokens(\"ab   de fg\", null, 4) \u003d [\"ab\", \"\", \"\", \"de fg\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be {@code null}\n     * @param separatorChars  the characters used as the delimiters,\n     *  {@code null} splits on whitespace\n     * @param max  the maximum number of elements to include in the\n     *  array. A zero or negative value implies no limit\n     * @return an array of parsed Strings, {@code null} if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3009,col 9)-(line 3009,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitWorker(java.lang.String, java.lang.String, int, boolean)",
      "begin_line": 3026,
      "end_line": 3109,
      "comment": "\n     * Performs the logic for the {@code split} and\n     * {@code splitPreserveAllTokens} methods that return a maximum array\n     * length.\n     *\n     * @param str  the String to parse, may be {@code null}\n     * @param separatorChars the separate character\n     * @param max  the maximum number of elements to include in the\n     *  array. A zero or negative value implies no limit.\n     * @param preserveAllTokens if {@code true}, adjacent separators are\n     * treated as empty token separators; if {@code false}, adjacent\n     * separators are treated as one separator.\n     * @return an array of parsed Strings, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 3031,col 9)-(line 3033,col 9)",
        "(line 3034,col 9)-(line 3034,col 31)",
        "(line 3035,col 9)-(line 3037,col 9)",
        "(line 3038,col 9)-(line 3038,col 52)",
        "(line 3039,col 9)-(line 3039,col 26)",
        "(line 3040,col 9)-(line 3040,col 29)",
        "(line 3041,col 9)-(line 3041,col 30)",
        "(line 3042,col 9)-(line 3042,col 34)",
        "(line 3043,col 9)-(line 3104,col 9)",
        "(line 3105,col 9)-(line 3107,col 9)",
        "(line 3108,col 9)-(line 3108,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByCharacterType(java.lang.String)",
      "begin_line": 3130,
      "end_line": 3132,
      "comment": "\n     * \u003cp\u003eSplits a String by Character type as returned by\n     * {@code java.lang.Character.getType(char)}. Groups of contiguous\n     * characters of the same type are returned as complete tokens.\n     * \u003cpre\u003e\n     * StringUtils.splitByCharacterType(null)         \u003d null\n     * StringUtils.splitByCharacterType(\"\")           \u003d []\n     * StringUtils.splitByCharacterType(\"ab de fg\")   \u003d [\"ab\", \" \", \"de\", \" \", \"fg\"]\n     * StringUtils.splitByCharacterType(\"ab   de fg\") \u003d [\"ab\", \"   \", \"de\", \" \", \"fg\"]\n     * StringUtils.splitByCharacterType(\"ab:cd:ef\")   \u003d [\"ab\", \":\", \"cd\", \":\", \"ef\"]\n     * StringUtils.splitByCharacterType(\"number5\")    \u003d [\"number\", \"5\"]\n     * StringUtils.splitByCharacterType(\"fooBar\")     \u003d [\"foo\", \"B\", \"ar\"]\n     * StringUtils.splitByCharacterType(\"foo200Bar\")  \u003d [\"foo\", \"200\", \"B\", \"ar\"]\n     * StringUtils.splitByCharacterType(\"ASFRules\")   \u003d [\"ASFR\", \"ules\"]\n     * \u003c/pre\u003e\n     * @param str the String to split, may be {@code null}\n     * @return an array of parsed Strings, {@code null} if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3131,col 9)-(line 3131,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase(java.lang.String)",
      "begin_line": 3158,
      "end_line": 3160,
      "comment": "\n     * \u003cp\u003eSplits a String by Character type as returned by\n     * {@code java.lang.Character.getType(char)}. Groups of contiguous\n     * characters of the same type are returned as complete tokens, with the\n     * following exception: the character of type\n     * {@code Character.UPPERCASE_LETTER}, if any, immediately\n     * preceding a token of type {@code Character.LOWERCASE_LETTER}\n     * will belong to the following token rather than to the preceding, if any,\n     * {@code Character.UPPERCASE_LETTER} token.\n     * \u003cpre\u003e\n     * StringUtils.splitByCharacterTypeCamelCase(null)         \u003d null\n     * StringUtils.splitByCharacterTypeCamelCase(\"\")           \u003d []\n     * StringUtils.splitByCharacterTypeCamelCase(\"ab de fg\")   \u003d [\"ab\", \" \", \"de\", \" \", \"fg\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"ab   de fg\") \u003d [\"ab\", \"   \", \"de\", \" \", \"fg\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"ab:cd:ef\")   \u003d [\"ab\", \":\", \"cd\", \":\", \"ef\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"number5\")    \u003d [\"number\", \"5\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"fooBar\")     \u003d [\"foo\", \"Bar\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"foo200Bar\")  \u003d [\"foo\", \"200\", \"Bar\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"ASFRules\")   \u003d [\"ASF\", \"Rules\"]\n     * \u003c/pre\u003e\n     * @param str the String to split, may be {@code null}\n     * @return an array of parsed Strings, {@code null} if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3159,col 9)-(line 3159,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByCharacterType(java.lang.String, boolean)",
      "begin_line": 3176,
      "end_line": 3206,
      "comment": "\n     * \u003cp\u003eSplits a String by Character type as returned by\n     * {@code java.lang.Character.getType(char)}. Groups of contiguous\n     * characters of the same type are returned as complete tokens, with the\n     * following exception: if {@code camelCase} is {@code true},\n     * the character of type {@code Character.UPPERCASE_LETTER}, if any,\n     * immediately preceding a token of type {@code Character.LOWERCASE_LETTER}\n     * will belong to the following token rather than to the preceding, if any,\n     * {@code Character.UPPERCASE_LETTER} token.\n     * @param str the String to split, may be {@code null}\n     * @param camelCase whether to use so-called \"camel-case\" for letter types\n     * @return an array of parsed Strings, {@code null} if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3177,col 9)-(line 3179,col 9)",
        "(line 3180,col 9)-(line 3182,col 9)",
        "(line 3183,col 9)-(line 3183,col 37)",
        "(line 3184,col 9)-(line 3184,col 52)",
        "(line 3185,col 9)-(line 3185,col 27)",
        "(line 3186,col 9)-(line 3186,col 59)",
        "(line 3187,col 9)-(line 3203,col 9)",
        "(line 3204,col 9)-(line 3204,col 67)",
        "(line 3205,col 9)-(line 3205,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(T...)",
      "begin_line": 3232,
      "end_line": 3234,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo separator is added to the joined String.\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null)            \u003d null\n     * StringUtils.join([])              \u003d \"\"\n     * StringUtils.join([null])          \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"]) \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"]) \u003d \"a\"\n     * \u003c/pre\u003e\n     *\n     * @param \u003cT\u003e the specific type of values to join together\n     * @param elements  the values to join together, may be null\n     * @return the joined String, {@code null} if null array input\n     * @since 2.0\n     * @since 3.0 Changed signature to use varargs\n     ",
      "child_ranges": [
        "(line 3233,col 9)-(line 3233,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.lang.Object[], char)",
      "begin_line": 3258,
      "end_line": 3264,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null, *)               \u003d null\n     * StringUtils.join([], *)                 \u003d \"\"\n     * StringUtils.join([null], *)             \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \u0027;\u0027)  \u003d \"a;b;c\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], null) \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"], \u0027;\u0027)  \u003d \";;a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to join together, may be null\n     * @param separator  the separator character to use\n     * @return the joined String, {@code null} if null array input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 3259,col 9)-(line 3261,col 9)",
        "(line 3263,col 9)-(line 3263,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.lang.Object[], char, int, int)",
      "begin_line": 3292,
      "end_line": 3312,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null, *)               \u003d null\n     * StringUtils.join([], *)                 \u003d \"\"\n     * StringUtils.join([null], *)             \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \u0027;\u0027)  \u003d \"a;b;c\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], null) \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"], \u0027;\u0027)  \u003d \";;a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to join together, may be null\n     * @param separator  the separator character to use\n     * @param startIndex the first index to start joining from.  It is\n     * an error to pass in an end index past the end of the array\n     * @param endIndex the index to stop joining from (exclusive). It is\n     * an error to pass in an end index past the end of the array\n     * @return the joined String, {@code null} if null array input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 3293,col 9)-(line 3295,col 9)",
        "(line 3296,col 9)-(line 3296,col 48)",
        "(line 3297,col 9)-(line 3299,col 9)",
        "(line 3301,col 9)-(line 3301,col 62)",
        "(line 3303,col 9)-(line 3310,col 9)",
        "(line 3311,col 9)-(line 3311,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.lang.Object[], java.lang.String)",
      "begin_line": 3337,
      "end_line": 3342,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * A {@code null} separator is the same as an empty String (\"\").\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null, *)                \u003d null\n     * StringUtils.join([], *)                  \u003d \"\"\n     * StringUtils.join([null], *)              \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \"--\")  \u003d \"a--b--c\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], null)  \u003d \"abc\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \"\")    \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"], \u0027,\u0027)   \u003d \",,a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to join together, may be null\n     * @param separator  the separator character to use, null treated as \"\"\n     * @return the joined String, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 3338,col 9)-(line 3340,col 9)",
        "(line 3341,col 9)-(line 3341,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.lang.Object[], java.lang.String, int, int)",
      "begin_line": 3371,
      "end_line": 3397,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * A {@code null} separator is the same as an empty String (\"\").\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null, *)                \u003d null\n     * StringUtils.join([], *)                  \u003d \"\"\n     * StringUtils.join([null], *)              \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \"--\")  \u003d \"a--b--c\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], null)  \u003d \"abc\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \"\")    \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"], \u0027,\u0027)   \u003d \",,a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to join together, may be null\n     * @param separator  the separator character to use, null treated as \"\"\n     * @param startIndex the first index to start joining from.  It is\n     * an error to pass in an end index past the end of the array\n     * @param endIndex the index to stop joining from (exclusive). It is\n     * an error to pass in an end index past the end of the array\n     * @return the joined String, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 3372,col 9)-(line 3374,col 9)",
        "(line 3375,col 9)-(line 3377,col 9)",
        "(line 3381,col 9)-(line 3381,col 48)",
        "(line 3382,col 9)-(line 3384,col 9)",
        "(line 3386,col 9)-(line 3386,col 62)",
        "(line 3388,col 9)-(line 3395,col 9)",
        "(line 3396,col 9)-(line 3396,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.util.Iterator\u003c?\u003e, char)",
      "begin_line": 3413,
      "end_line": 3442,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided {@code Iterator} into\n     * a single String containing the provided elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list. Null objects or empty\n     * strings within the iteration are represented by empty strings.\u003c/p\u003e\n     *\n     * \u003cp\u003eSee the examples here: {@link #join(Object[],char)}. \u003c/p\u003e\n     *\n     * @param iterator  the {@code Iterator} of values to join together, may be null\n     * @param separator  the separator character to use\n     * @return the joined String, {@code null} if null iterator input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 3416,col 9)-(line 3418,col 9)",
        "(line 3419,col 9)-(line 3421,col 9)",
        "(line 3422,col 9)-(line 3422,col 39)",
        "(line 3423,col 9)-(line 3425,col 9)",
        "(line 3428,col 9)-(line 3428,col 51)",
        "(line 3429,col 9)-(line 3431,col 9)",
        "(line 3433,col 9)-(line 3439,col 9)",
        "(line 3441,col 9)-(line 3441,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.util.Iterator\u003c?\u003e, java.lang.String)",
      "begin_line": 3457,
      "end_line": 3487,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided {@code Iterator} into\n     * a single String containing the provided elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * A {@code null} separator is the same as an empty String (\"\").\u003c/p\u003e\n     *\n     * \u003cp\u003eSee the examples here: {@link #join(Object[],String)}. \u003c/p\u003e\n     *\n     * @param iterator  the {@code Iterator} of values to join together, may be null\n     * @param separator  the separator character to use, null treated as \"\"\n     * @return the joined String, {@code null} if null iterator input\n     ",
      "child_ranges": [
        "(line 3460,col 9)-(line 3462,col 9)",
        "(line 3463,col 9)-(line 3465,col 9)",
        "(line 3466,col 9)-(line 3466,col 39)",
        "(line 3467,col 9)-(line 3469,col 9)",
        "(line 3472,col 9)-(line 3472,col 51)",
        "(line 3473,col 9)-(line 3475,col 9)",
        "(line 3477,col 9)-(line 3485,col 9)",
        "(line 3486,col 9)-(line 3486,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.lang.Iterable\u003c?\u003e, char)",
      "begin_line": 3503,
      "end_line": 3508,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided {@code Iterable} into\n     * a single String containing the provided elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list. Null objects or empty\n     * strings within the iteration are represented by empty strings.\u003c/p\u003e\n     *\n     * \u003cp\u003eSee the examples here: {@link #join(Object[],char)}. \u003c/p\u003e\n     *\n     * @param iterable  the {@code Iterable} providing the values to join together, may be null\n     * @param separator  the separator character to use\n     * @return the joined String, {@code null} if null iterator input\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 3504,col 9)-(line 3506,col 9)",
        "(line 3507,col 9)-(line 3507,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.lang.Iterable\u003c?\u003e, java.lang.String)",
      "begin_line": 3524,
      "end_line": 3529,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided {@code Iterable} into\n     * a single String containing the provided elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * A {@code null} separator is the same as an empty String (\"\").\u003c/p\u003e\n     *\n     * \u003cp\u003eSee the examples here: {@link #join(Object[],String)}. \u003c/p\u003e\n     *\n     * @param iterable  the {@code Iterable} providing the values to join together, may be null\n     * @param separator  the separator character to use, null treated as \"\"\n     * @return the joined String, {@code null} if null iterator input\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 3525,col 9)-(line 3527,col 9)",
        "(line 3528,col 9)-(line 3528,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.deleteWhitespace(java.lang.String)",
      "begin_line": 3547,
      "end_line": 3563,
      "comment": "\n     * \u003cp\u003eDeletes all whitespaces from a String as defined by\n     * {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.deleteWhitespace(null)         \u003d null\n     * StringUtils.deleteWhitespace(\"\")           \u003d \"\"\n     * StringUtils.deleteWhitespace(\"abc\")        \u003d \"abc\"\n     * StringUtils.deleteWhitespace(\"   ab  c  \") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to delete whitespace from, may be null\n     * @return the String without whitespaces, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 3548,col 9)-(line 3550,col 9)",
        "(line 3551,col 9)-(line 3551,col 30)",
        "(line 3552,col 9)-(line 3552,col 34)",
        "(line 3553,col 9)-(line 3553,col 22)",
        "(line 3554,col 9)-(line 3558,col 9)",
        "(line 3559,col 9)-(line 3561,col 9)",
        "(line 3562,col 9)-(line 3562,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.removeStart(java.lang.String, java.lang.String)",
      "begin_line": 3591,
      "end_line": 3599,
      "comment": "\n     * \u003cp\u003eRemoves a substring only if it is at the beginning of a source string,\n     * otherwise returns the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} source string will return {@code null}.\n     * An empty (\"\") source string will return the empty string.\n     * A {@code null} search string will return the source string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.removeStart(null, *)      \u003d null\n     * StringUtils.removeStart(\"\", *)        \u003d \"\"\n     * StringUtils.removeStart(*, null)      \u003d *\n     * StringUtils.removeStart(\"www.domain.com\", \"www.\")   \u003d \"domain.com\"\n     * StringUtils.removeStart(\"domain.com\", \"www.\")       \u003d \"domain.com\"\n     * StringUtils.removeStart(\"www.domain.com\", \"domain\") \u003d \"www.domain.com\"\n     * StringUtils.removeStart(\"abc\", \"\")    \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the String to search for and remove, may be null\n     * @return the substring with the string removed if found,\n     *  {@code null} if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3592,col 9)-(line 3594,col 9)",
        "(line 3595,col 9)-(line 3597,col 9)",
        "(line 3598,col 9)-(line 3598,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.removeStartIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 3626,
      "end_line": 3634,
      "comment": "\n     * \u003cp\u003eCase insensitive removal of a substring if it is at the beginning of a source string,\n     * otherwise returns the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} source string will return {@code null}.\n     * An empty (\"\") source string will return the empty string.\n     * A {@code null} search string will return the source string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.removeStartIgnoreCase(null, *)      \u003d null\n     * StringUtils.removeStartIgnoreCase(\"\", *)        \u003d \"\"\n     * StringUtils.removeStartIgnoreCase(*, null)      \u003d *\n     * StringUtils.removeStartIgnoreCase(\"www.domain.com\", \"www.\")   \u003d \"domain.com\"\n     * StringUtils.removeStartIgnoreCase(\"www.domain.com\", \"WWW.\")   \u003d \"domain.com\"\n     * StringUtils.removeStartIgnoreCase(\"domain.com\", \"www.\")       \u003d \"domain.com\"\n     * StringUtils.removeStartIgnoreCase(\"www.domain.com\", \"domain\") \u003d \"www.domain.com\"\n     * StringUtils.removeStartIgnoreCase(\"abc\", \"\")    \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the String to search for (case insensitive) and remove, may be null\n     * @return the substring with the string removed if found,\n     *  {@code null} if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3627,col 9)-(line 3629,col 9)",
        "(line 3630,col 9)-(line 3632,col 9)",
        "(line 3633,col 9)-(line 3633,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.removeEnd(java.lang.String, java.lang.String)",
      "begin_line": 3660,
      "end_line": 3668,
      "comment": "\n     * \u003cp\u003eRemoves a substring only if it is at the end of a source string,\n     * otherwise returns the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} source string will return {@code null}.\n     * An empty (\"\") source string will return the empty string.\n     * A {@code null} search string will return the source string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.removeEnd(null, *)      \u003d null\n     * StringUtils.removeEnd(\"\", *)        \u003d \"\"\n     * StringUtils.removeEnd(*, null)      \u003d *\n     * StringUtils.removeEnd(\"www.domain.com\", \".com.\")  \u003d \"www.domain.com\"\n     * StringUtils.removeEnd(\"www.domain.com\", \".com\")   \u003d \"www.domain\"\n     * StringUtils.removeEnd(\"www.domain.com\", \"domain\") \u003d \"www.domain.com\"\n     * StringUtils.removeEnd(\"abc\", \"\")    \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the String to search for and remove, may be null\n     * @return the substring with the string removed if found,\n     *  {@code null} if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3661,col 9)-(line 3663,col 9)",
        "(line 3664,col 9)-(line 3666,col 9)",
        "(line 3667,col 9)-(line 3667,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.removeEndIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 3696,
      "end_line": 3704,
      "comment": "\n     * \u003cp\u003eCase insensitive removal of a substring if it is at the end of a source string,\n     * otherwise returns the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} source string will return {@code null}.\n     * An empty (\"\") source string will return the empty string.\n     * A {@code null} search string will return the source string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.removeEndIgnoreCase(null, *)      \u003d null\n     * StringUtils.removeEndIgnoreCase(\"\", *)        \u003d \"\"\n     * StringUtils.removeEndIgnoreCase(*, null)      \u003d *\n     * StringUtils.removeEndIgnoreCase(\"www.domain.com\", \".com.\")  \u003d \"www.domain.com\"\n     * StringUtils.removeEndIgnoreCase(\"www.domain.com\", \".com\")   \u003d \"www.domain\"\n     * StringUtils.removeEndIgnoreCase(\"www.domain.com\", \"domain\") \u003d \"www.domain.com\"\n     * StringUtils.removeEndIgnoreCase(\"abc\", \"\")    \u003d \"abc\"\n     * StringUtils.removeEndIgnoreCase(\"www.domain.com\", \".COM\") \u003d \"www.domain\")\n     * StringUtils.removeEndIgnoreCase(\"www.domain.COM\", \".com\") \u003d \"www.domain\")\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the String to search for (case insensitive) and remove, may be null\n     * @return the substring with the string removed if found,\n     *  {@code null} if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3697,col 9)-(line 3699,col 9)",
        "(line 3700,col 9)-(line 3702,col 9)",
        "(line 3703,col 9)-(line 3703,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.remove(java.lang.String, java.lang.String)",
      "begin_line": 3729,
      "end_line": 3734,
      "comment": "\n     * \u003cp\u003eRemoves all occurrences of a substring from within the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} source string will return {@code null}.\n     * An empty (\"\") source string will return the empty string.\n     * A {@code null} remove string will return the source string.\n     * An empty (\"\") remove string will return the source string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.remove(null, *)        \u003d null\n     * StringUtils.remove(\"\", *)          \u003d \"\"\n     * StringUtils.remove(*, null)        \u003d *\n     * StringUtils.remove(*, \"\")          \u003d *\n     * StringUtils.remove(\"queued\", \"ue\") \u003d \"qd\"\n     * StringUtils.remove(\"queued\", \"zz\") \u003d \"queued\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the String to search for and remove, may be null\n     * @return the substring with the string removed if found,\n     *  {@code null} if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3730,col 9)-(line 3732,col 9)",
        "(line 3733,col 9)-(line 3733,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.remove(java.lang.String, char)",
      "begin_line": 3755,
      "end_line": 3767,
      "comment": "\n     * \u003cp\u003eRemoves all occurrences of a character from within the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} source string will return {@code null}.\n     * An empty (\"\") source string will return the empty string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.remove(null, *)       \u003d null\n     * StringUtils.remove(\"\", *)         \u003d \"\"\n     * StringUtils.remove(\"queued\", \u0027u\u0027) \u003d \"qeed\"\n     * StringUtils.remove(\"queued\", \u0027z\u0027) \u003d \"queued\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the char to search for and remove, may be null\n     * @return the substring with the char removed if found,\n     *  {@code null} if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3756,col 9)-(line 3758,col 9)",
        "(line 3759,col 9)-(line 3759,col 41)",
        "(line 3760,col 9)-(line 3760,col 20)",
        "(line 3761,col 9)-(line 3765,col 9)",
        "(line 3766,col 9)-(line 3766,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replaceOnce(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 3794,
      "end_line": 3796,
      "comment": "\n     * \u003cp\u003eReplaces a String with another String inside a larger String, once.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} reference passed to this method is a no-op.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replaceOnce(null, *, *)        \u003d null\n     * StringUtils.replaceOnce(\"\", *, *)          \u003d \"\"\n     * StringUtils.replaceOnce(\"any\", null, *)    \u003d \"any\"\n     * StringUtils.replaceOnce(\"any\", *, null)    \u003d \"any\"\n     * StringUtils.replaceOnce(\"any\", \"\", *)      \u003d \"any\"\n     * StringUtils.replaceOnce(\"aba\", \"a\", null)  \u003d \"aba\"\n     * StringUtils.replaceOnce(\"aba\", \"a\", \"\")    \u003d \"ba\"\n     * StringUtils.replaceOnce(\"aba\", \"a\", \"z\")   \u003d \"zba\"\n     * \u003c/pre\u003e\n     *\n     * @see #replace(String text, String searchString, String replacement, int max)\n     * @param text  text to search and replace in, may be null\n     * @param searchString  the String to search for, may be null\n     * @param replacement  the String to replace with, may be null\n     * @return the text with any replacements processed,\n     *  {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 3795,col 9)-(line 3795,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replace(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 3821,
      "end_line": 3823,
      "comment": "\n     * \u003cp\u003eReplaces all occurrences of a String within another String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} reference passed to this method is a no-op.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replace(null, *, *)        \u003d null\n     * StringUtils.replace(\"\", *, *)          \u003d \"\"\n     * StringUtils.replace(\"any\", null, *)    \u003d \"any\"\n     * StringUtils.replace(\"any\", *, null)    \u003d \"any\"\n     * StringUtils.replace(\"any\", \"\", *)      \u003d \"any\"\n     * StringUtils.replace(\"aba\", \"a\", null)  \u003d \"aba\"\n     * StringUtils.replace(\"aba\", \"a\", \"\")    \u003d \"b\"\n     * StringUtils.replace(\"aba\", \"a\", \"z\")   \u003d \"zbz\"\n     * \u003c/pre\u003e\n     *\n     * @see #replace(String text, String searchString, String replacement, int max)\n     * @param text  text to search and replace in, may be null\n     * @param searchString  the String to search for, may be null\n     * @param replacement  the String to replace it with, may be null\n     * @return the text with any replacements processed,\n     *  {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 3822,col 9)-(line 3822,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replace(java.lang.String, java.lang.String, java.lang.String, int)",
      "begin_line": 3853,
      "end_line": 3877,
      "comment": "\n     * \u003cp\u003eReplaces a String with another String inside a larger String,\n     * for the first {@code max} values of the search String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} reference passed to this method is a no-op.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replace(null, *, *, *)         \u003d null\n     * StringUtils.replace(\"\", *, *, *)           \u003d \"\"\n     * StringUtils.replace(\"any\", null, *, *)     \u003d \"any\"\n     * StringUtils.replace(\"any\", *, null, *)     \u003d \"any\"\n     * StringUtils.replace(\"any\", \"\", *, *)       \u003d \"any\"\n     * StringUtils.replace(\"any\", *, *, 0)        \u003d \"any\"\n     * StringUtils.replace(\"abaa\", \"a\", null, -1) \u003d \"abaa\"\n     * StringUtils.replace(\"abaa\", \"a\", \"\", -1)   \u003d \"b\"\n     * StringUtils.replace(\"abaa\", \"a\", \"z\", 0)   \u003d \"abaa\"\n     * StringUtils.replace(\"abaa\", \"a\", \"z\", 1)   \u003d \"zbaa\"\n     * StringUtils.replace(\"abaa\", \"a\", \"z\", 2)   \u003d \"zbza\"\n     * StringUtils.replace(\"abaa\", \"a\", \"z\", -1)  \u003d \"zbzz\"\n     * \u003c/pre\u003e\n     *\n     * @param text  text to search and replace in, may be null\n     * @param searchString  the String to search for, may be null\n     * @param replacement  the String to replace it with, may be null\n     * @param max  maximum number of values to replace, or {@code -1} if no maximum\n     * @return the text with any replacements processed,\n     *  {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 3854,col 9)-(line 3856,col 9)",
        "(line 3857,col 9)-(line 3857,col 22)",
        "(line 3858,col 9)-(line 3858,col 52)",
        "(line 3859,col 9)-(line 3861,col 9)",
        "(line 3862,col 9)-(line 3862,col 47)",
        "(line 3863,col 9)-(line 3863,col 57)",
        "(line 3864,col 9)-(line 3864,col 49)",
        "(line 3865,col 9)-(line 3865,col 59)",
        "(line 3866,col 9)-(line 3866,col 72)",
        "(line 3867,col 9)-(line 3874,col 9)",
        "(line 3875,col 9)-(line 3875,col 42)",
        "(line 3876,col 9)-(line 3876,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replaceEach(java.lang.String, java.lang.String[], java.lang.String[])",
      "begin_line": 3918,
      "end_line": 3920,
      "comment": "\n     * \u003cp\u003e\n     * Replaces all occurrences of Strings within another String.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * A {@code null} reference passed to this method is a no-op, or if\n     * any \"search string\" or \"string to replace\" is null, that replace will be\n     * ignored. This will not repeat. For repeating replaces, call the\n     * overloaded method.\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *  StringUtils.replaceEach(null, *, *)        \u003d null\n     *  StringUtils.replaceEach(\"\", *, *)          \u003d \"\"\n     *  StringUtils.replaceEach(\"aba\", null, null) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[0], null) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", null, new String[0]) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, null)  \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, new String[]{\"\"})  \u003d \"b\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{null}, new String[]{\"a\"})  \u003d \"aba\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"w\", \"t\"})  \u003d \"wcte\"\n     *  (example of how it does not repeat)\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"t\"})  \u003d \"dcte\"\n     * \u003c/pre\u003e\n     *\n     * @param text\n     *            text to search and replace in, no-op if null\n     * @param searchList\n     *            the Strings to search for, no-op if null\n     * @param replacementList\n     *            the Strings to replace them with, no-op if null\n     * @return the text with any replacements processed, {@code null} if\n     *         null String input\n     * @throws IllegalArgumentException\n     *             if the lengths of the arrays are not the same (null is ok,\n     *             and/or size 0)\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3919,col 9)-(line 3919,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(java.lang.String, java.lang.String[], java.lang.String[])",
      "begin_line": 3966,
      "end_line": 3971,
      "comment": "\n     * \u003cp\u003e\n     * Replaces all occurrences of Strings within another String.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * A {@code null} reference passed to this method is a no-op, or if\n     * any \"search string\" or \"string to replace\" is null, that replace will be\n     * ignored. \n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *  StringUtils.replaceEach(null, *, *, *) \u003d null\n     *  StringUtils.replaceEach(\"\", *, *, *) \u003d \"\"\n     *  StringUtils.replaceEach(\"aba\", null, null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[0], null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", null, new String[0], *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, new String[]{\"\"}, *) \u003d \"b\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{null}, new String[]{\"a\"}, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"w\", \"t\"}, *) \u003d \"wcte\"\n     *  (example of how it repeats)\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"t\"}, false) \u003d \"dcte\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"t\"}, true) \u003d \"tcte\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"ab\"}, true) \u003d IllegalStateException\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"ab\"}, false) \u003d \"dcabe\"\n     * \u003c/pre\u003e\n     *\n     * @param text\n     *            text to search and replace in, no-op if null\n     * @param searchList\n     *            the Strings to search for, no-op if null\n     * @param replacementList\n     *            the Strings to replace them with, no-op if null\n     * @return the text with any replacements processed, {@code null} if\n     *         null String input\n     * @throws IllegalStateException\n     *             if the search is repeating and there is an endless loop due\n     *             to outputs of one being inputs to another\n     * @throws IllegalArgumentException\n     *             if the lengths of the arrays are not the same (null is ok,\n     *             and/or size 0)\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3969,col 9)-(line 3969,col 68)",
        "(line 3970,col 9)-(line 3970,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replaceEach(java.lang.String, java.lang.String[], java.lang.String[], boolean, int)",
      "begin_line": 4021,
      "end_line": 4147,
      "comment": "\n     * \u003cp\u003e\n     * Replaces all occurrences of Strings within another String.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * A {@code null} reference passed to this method is a no-op, or if\n     * any \"search string\" or \"string to replace\" is null, that replace will be\n     * ignored.\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *  StringUtils.replaceEach(null, *, *, *) \u003d null\n     *  StringUtils.replaceEach(\"\", *, *, *) \u003d \"\"\n     *  StringUtils.replaceEach(\"aba\", null, null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[0], null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", null, new String[0], *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, new String[]{\"\"}, *) \u003d \"b\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{null}, new String[]{\"a\"}, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"w\", \"t\"}, *) \u003d \"wcte\"\n     *  (example of how it repeats)\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"t\"}, false) \u003d \"dcte\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"t\"}, true) \u003d \"tcte\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"ab\"}, *) \u003d IllegalStateException\n     * \u003c/pre\u003e\n     *\n     * @param text\n     *            text to search and replace in, no-op if null\n     * @param searchList\n     *            the Strings to search for, no-op if null\n     * @param replacementList\n     *            the Strings to replace them with, no-op if null\n     * @param repeat if true, then replace repeatedly\n     *       until there are no more possible replacements or timeToLive \u003c 0\n     * @param timeToLive\n     *            if less than 0 then there is a circular reference and endless\n     *            loop\n     * @return the text with any replacements processed, {@code null} if\n     *         null String input\n     * @throws IllegalStateException\n     *             if the search is repeating and there is an endless loop due\n     *             to outputs of one being inputs to another\n     * @throws IllegalArgumentException\n     *             if the lengths of the arrays are not the same (null is ok,\n     *             and/or size 0)\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 4027,col 9)-(line 4030,col 9)",
        "(line 4033,col 9)-(line 4036,col 9)",
        "(line 4038,col 9)-(line 4038,col 45)",
        "(line 4039,col 9)-(line 4039,col 55)",
        "(line 4042,col 9)-(line 4047,col 9)",
        "(line 4050,col 9)-(line 4050,col 72)",
        "(line 4053,col 9)-(line 4053,col 27)",
        "(line 4054,col 9)-(line 4054,col 30)",
        "(line 4055,col 9)-(line 4055,col 27)",
        "(line 4059,col 9)-(line 4075,col 9)",
        "(line 4079,col 9)-(line 4081,col 9)",
        "(line 4083,col 9)-(line 4083,col 22)",
        "(line 4086,col 9)-(line 4086,col 25)",
        "(line 4089,col 9)-(line 4097,col 9)",
        "(line 4099,col 9)-(line 4099,col 57)",
        "(line 4101,col 9)-(line 4101,col 72)",
        "(line 4103,col 9)-(line 4136,col 9)",
        "(line 4137,col 9)-(line 4137,col 39)",
        "(line 4138,col 9)-(line 4140,col 9)",
        "(line 4141,col 9)-(line 4141,col 39)",
        "(line 4142,col 9)-(line 4144,col 9)",
        "(line 4146,col 9)-(line 4146,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replaceChars(java.lang.String, char, char)",
      "begin_line": 4171,
      "end_line": 4176,
      "comment": "\n     * \u003cp\u003eReplaces all occurrences of a character in a String with another.\n     * This is a null-safe version of {@link String#replace(char, char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} string input returns {@code null}.\n     * An empty (\"\") string input returns an empty string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replaceChars(null, *, *)        \u003d null\n     * StringUtils.replaceChars(\"\", *, *)          \u003d \"\"\n     * StringUtils.replaceChars(\"abcba\", \u0027b\u0027, \u0027y\u0027) \u003d \"aycya\"\n     * StringUtils.replaceChars(\"abcba\", \u0027z\u0027, \u0027y\u0027) \u003d \"abcba\"\n     * \u003c/pre\u003e\n     *\n     * @param str  String to replace characters in, may be null\n     * @param searchChar  the character to search for, may be null\n     * @param replaceChar  the character to replace, may be null\n     * @return modified String, {@code null} if null string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4172,col 9)-(line 4174,col 9)",
        "(line 4175,col 9)-(line 4175,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replaceChars(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 4214,
      "end_line": 4241,
      "comment": "\n     * \u003cp\u003eReplaces multiple characters in a String in one go.\n     * This method can also be used to delete characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example:\u003cbr /\u003e\n     * \u003ccode\u003ereplaceChars(\u0026quot;hello\u0026quot;, \u0026quot;ho\u0026quot;, \u0026quot;jy\u0026quot;) \u003d jelly\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} string input returns {@code null}.\n     * An empty (\"\") string input returns an empty string.\n     * A null or empty set of search characters returns the input string.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe length of the search characters should normally equal the length\n     * of the replace characters.\n     * If the search characters is longer, then the extra search characters\n     * are deleted.\n     * If the search characters is shorter, then the extra replace characters\n     * are ignored.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replaceChars(null, *, *)           \u003d null\n     * StringUtils.replaceChars(\"\", *, *)             \u003d \"\"\n     * StringUtils.replaceChars(\"abc\", null, *)       \u003d \"abc\"\n     * StringUtils.replaceChars(\"abc\", \"\", *)         \u003d \"abc\"\n     * StringUtils.replaceChars(\"abc\", \"b\", null)     \u003d \"ac\"\n     * StringUtils.replaceChars(\"abc\", \"b\", \"\")       \u003d \"ac\"\n     * StringUtils.replaceChars(\"abcba\", \"bc\", \"yz\")  \u003d \"ayzya\"\n     * StringUtils.replaceChars(\"abcba\", \"bc\", \"y\")   \u003d \"ayya\"\n     * StringUtils.replaceChars(\"abcba\", \"bc\", \"yzx\") \u003d \"ayzya\"\n     * \u003c/pre\u003e\n     *\n     * @param str  String to replace characters in, may be null\n     * @param searchChars  a set of characters to search for, may be null\n     * @param replaceChars  a set of characters to replace, may be null\n     * @return modified String, {@code null} if null string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4215,col 9)-(line 4217,col 9)",
        "(line 4218,col 9)-(line 4220,col 9)",
        "(line 4221,col 9)-(line 4221,col 33)",
        "(line 4222,col 9)-(line 4222,col 55)",
        "(line 4223,col 9)-(line 4223,col 37)",
        "(line 4224,col 9)-(line 4224,col 57)",
        "(line 4225,col 9)-(line 4236,col 9)",
        "(line 4237,col 9)-(line 4239,col 9)",
        "(line 4240,col 9)-(line 4240,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.overlay(java.lang.String, java.lang.String, int, int)",
      "begin_line": 4274,
      "end_line": 4304,
      "comment": "\n     * \u003cp\u003eOverlays part of a String with another String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} string input returns {@code null}.\n     * A negative index is treated as zero.\n     * An index greater than the string length is treated as the string length.\n     * The start index is always the smaller of the two indices.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.overlay(null, *, *, *)            \u003d null\n     * StringUtils.overlay(\"\", \"abc\", 0, 0)          \u003d \"abc\"\n     * StringUtils.overlay(\"abcdef\", null, 2, 4)     \u003d \"abef\"\n     * StringUtils.overlay(\"abcdef\", \"\", 2, 4)       \u003d \"abef\"\n     * StringUtils.overlay(\"abcdef\", \"\", 4, 2)       \u003d \"abef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", 2, 4)   \u003d \"abzzzzef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", 4, 2)   \u003d \"abzzzzef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", -1, 4)  \u003d \"zzzzef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", 2, 8)   \u003d \"abzzzz\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", -2, -3) \u003d \"zzzzabcdef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", 8, 10)  \u003d \"abcdefzzzz\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to do overlaying in, may be null\n     * @param overlay  the String to overlay, may be null\n     * @param start  the position to start overlaying at\n     * @param end  the position to stop overlaying before\n     * @return overlayed String, {@code null} if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4275,col 9)-(line 4277,col 9)",
        "(line 4278,col 9)-(line 4280,col 9)",
        "(line 4281,col 9)-(line 4281,col 31)",
        "(line 4282,col 9)-(line 4284,col 9)",
        "(line 4285,col 9)-(line 4287,col 9)",
        "(line 4288,col 9)-(line 4290,col 9)",
        "(line 4291,col 9)-(line 4293,col 9)",
        "(line 4294,col 9)-(line 4298,col 9)",
        "(line 4299,col 9)-(line 4303,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.chomp(java.lang.String)",
      "begin_line": 4333,
      "end_line": 4357,
      "comment": "\n     * \u003cp\u003eRemoves one newline from end of a String if it\u0027s there,\n     * otherwise leave it alone.  A newline is \u0026quot;{@code \\n}\u0026quot;,\n     * \u0026quot;{@code \\r}\u0026quot;, or \u0026quot;{@code \\r\\n}\u0026quot;.\u003c/p\u003e\n     *\n     * \u003cp\u003eNOTE: This method changed in 2.0.\n     * It now more closely matches Perl chomp.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.chomp(null)          \u003d null\n     * StringUtils.chomp(\"\")            \u003d \"\"\n     * StringUtils.chomp(\"abc \\r\")      \u003d \"abc \"\n     * StringUtils.chomp(\"abc\\n\")       \u003d \"abc\"\n     * StringUtils.chomp(\"abc\\r\\n\")     \u003d \"abc\"\n     * StringUtils.chomp(\"abc\\r\\n\\r\\n\") \u003d \"abc\\r\\n\"\n     * StringUtils.chomp(\"abc\\n\\r\")     \u003d \"abc\\n\"\n     * StringUtils.chomp(\"abc\\n\\rabc\")  \u003d \"abc\\n\\rabc\"\n     * StringUtils.chomp(\"\\r\")          \u003d \"\"\n     * StringUtils.chomp(\"\\n\")          \u003d \"\"\n     * StringUtils.chomp(\"\\r\\n\")        \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to chomp a newline from, may be null\n     * @return String without newline, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 4334,col 9)-(line 4336,col 9)",
        "(line 4338,col 9)-(line 4344,col 9)",
        "(line 4346,col 9)-(line 4346,col 39)",
        "(line 4347,col 9)-(line 4347,col 40)",
        "(line 4349,col 9)-(line 4355,col 9)",
        "(line 4356,col 9)-(line 4356,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.chomp(java.lang.String, java.lang.String)",
      "begin_line": 4385,
      "end_line": 4393,
      "comment": "\n     * \u003cp\u003eRemoves {@code separator} from the end of\n     * {@code str} if it\u0027s there, otherwise leave it alone.\u003c/p\u003e\n     *\n     * \u003cp\u003eNOTE: This method changed in version 2.0.\n     * It now more closely matches Perl chomp.\n     * For the previous behavior, use {@link #substringBeforeLast(String, String)}.\n     * This method uses {@link String#endsWith(String)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.chomp(null, *)         \u003d null\n     * StringUtils.chomp(\"\", *)           \u003d \"\"\n     * StringUtils.chomp(\"foobar\", \"bar\") \u003d \"foo\"\n     * StringUtils.chomp(\"foobar\", \"baz\") \u003d \"foobar\"\n     * StringUtils.chomp(\"foo\", \"foo\")    \u003d \"\"\n     * StringUtils.chomp(\"foo \", \"foo\")   \u003d \"foo \"\n     * StringUtils.chomp(\" foo\", \"foo\")   \u003d \" \"\n     * StringUtils.chomp(\"foo\", \"foooo\")  \u003d \"foo\"\n     * StringUtils.chomp(\"foo\", \"\")       \u003d \"foo\"\n     * StringUtils.chomp(\"foo\", null)     \u003d \"foo\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to chomp from, may be null\n     * @param separator  separator String, may be null\n     * @return String without trailing separator, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 4386,col 9)-(line 4388,col 9)",
        "(line 4389,col 9)-(line 4391,col 9)",
        "(line 4392,col 9)-(line 4392,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.chop(java.lang.String)",
      "begin_line": 4420,
      "end_line": 4435,
      "comment": "\n     * \u003cp\u003eRemove the last character from a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the String ends in {@code \\r\\n}, then remove both\n     * of them.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.chop(null)          \u003d null\n     * StringUtils.chop(\"\")            \u003d \"\"\n     * StringUtils.chop(\"abc \\r\")      \u003d \"abc \"\n     * StringUtils.chop(\"abc\\n\")       \u003d \"abc\"\n     * StringUtils.chop(\"abc\\r\\n\")     \u003d \"abc\"\n     * StringUtils.chop(\"abc\")         \u003d \"ab\"\n     * StringUtils.chop(\"abc\\nabc\")    \u003d \"abc\\nab\"\n     * StringUtils.chop(\"a\")           \u003d \"\"\n     * StringUtils.chop(\"\\r\")          \u003d \"\"\n     * StringUtils.chop(\"\\n\")          \u003d \"\"\n     * StringUtils.chop(\"\\r\\n\")        \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to chop last character from, may be null\n     * @return String without last character, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 4421,col 9)-(line 4423,col 9)",
        "(line 4424,col 9)-(line 4424,col 34)",
        "(line 4425,col 9)-(line 4427,col 9)",
        "(line 4428,col 9)-(line 4428,col 33)",
        "(line 4429,col 9)-(line 4429,col 47)",
        "(line 4430,col 9)-(line 4430,col 40)",
        "(line 4431,col 9)-(line 4433,col 9)",
        "(line 4434,col 9)-(line 4434,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.repeat(java.lang.String, int)",
      "begin_line": 4460,
      "end_line": 4497,
      "comment": "\n     * \u003cp\u003eRepeat a String {@code repeat} times to form a\n     * new String.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.repeat(null, 2) \u003d null\n     * StringUtils.repeat(\"\", 0)   \u003d \"\"\n     * StringUtils.repeat(\"\", 2)   \u003d \"\"\n     * StringUtils.repeat(\"a\", 3)  \u003d \"aaa\"\n     * StringUtils.repeat(\"ab\", 2) \u003d \"abab\"\n     * StringUtils.repeat(\"a\", -2) \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to repeat, may be null\n     * @param repeat  number of times to repeat str, negative treated as zero\n     * @return a new String consisting of the original String repeated,\n     *  {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 4463,col 9)-(line 4465,col 9)",
        "(line 4466,col 9)-(line 4468,col 9)",
        "(line 4469,col 9)-(line 4469,col 39)",
        "(line 4470,col 9)-(line 4472,col 9)",
        "(line 4473,col 9)-(line 4475,col 9)",
        "(line 4477,col 9)-(line 4477,col 48)",
        "(line 4478,col 9)-(line 4496,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.repeat(java.lang.String, java.lang.String, int)",
      "begin_line": 4519,
      "end_line": 4527,
      "comment": "\n     * \u003cp\u003eRepeat a String {@code repeat} times to form a\n     * new String, with a String separator injected each time. \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.repeat(null, null, 2) \u003d null\n     * StringUtils.repeat(null, \"x\", 2)  \u003d null\n     * StringUtils.repeat(\"\", null, 0)   \u003d \"\"\n     * StringUtils.repeat(\"\", \"\", 2)     \u003d \"\"\n     * StringUtils.repeat(\"\", \"x\", 3)    \u003d \"xxx\"\n     * StringUtils.repeat(\"?\", \", \", 3)  \u003d \"?, ?, ?\"\n     * \u003c/pre\u003e\n     *\n     * @param str        the String to repeat, may be null\n     * @param separator  the String to inject, may be null\n     * @param repeat     number of times to repeat str, negative treated as zero\n     * @return a new String consisting of the original String repeated,\n     *  {@code null} if null String input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 4520,col 9)-(line 4526,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.repeat(char, int)",
      "begin_line": 4551,
      "end_line": 4557,
      "comment": "\n     * \u003cp\u003eReturns padding using the specified delimiter repeated\n     * to a given length.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.repeat(0, \u0027e\u0027)  \u003d \"\"\n     * StringUtils.repeat(3, \u0027e\u0027)  \u003d \"eee\"\n     * StringUtils.repeat(-2, \u0027e\u0027) \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eNote: this method doesn\u0027t not support padding with\n     * \u003ca href\u003d\"http://www.unicode.org/glossary/#supplementary_character\"\u003eUnicode Supplementary Characters\u003c/a\u003e\n     * as they require a pair of {@code char}s to be represented.\n     * If you are needing to support full I18N of your applications\n     * consider using {@link #repeat(String, int)} instead.\n     * \u003c/p\u003e\n     *\n     * @param ch  character to repeat\n     * @param repeat  number of times to repeat char, negative treated as zero\n     * @return String with repeated character\n     * @see #repeat(String, int)\n     ",
      "child_ranges": [
        "(line 4552,col 9)-(line 4552,col 38)",
        "(line 4553,col 9)-(line 4555,col 9)",
        "(line 4556,col 9)-(line 4556,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.rightPad(java.lang.String, int)",
      "begin_line": 4578,
      "end_line": 4580,
      "comment": "\n     * \u003cp\u003eRight pad a String with spaces (\u0027 \u0027).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is padded to the size of {@code size}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.rightPad(null, *)   \u003d null\n     * StringUtils.rightPad(\"\", 3)     \u003d \"   \"\n     * StringUtils.rightPad(\"bat\", 3)  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", 5)  \u003d \"bat  \"\n     * StringUtils.rightPad(\"bat\", 1)  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", -1) \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @return right padded String or original String if no padding is necessary,\n     *  {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 4579,col 9)-(line 4579,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.rightPad(java.lang.String, int, char)",
      "begin_line": 4603,
      "end_line": 4615,
      "comment": "\n     * \u003cp\u003eRight pad a String with a specified character.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is padded to the size of {@code size}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.rightPad(null, *, *)     \u003d null\n     * StringUtils.rightPad(\"\", 3, \u0027z\u0027)     \u003d \"zzz\"\n     * StringUtils.rightPad(\"bat\", 3, \u0027z\u0027)  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", 5, \u0027z\u0027)  \u003d \"batzz\"\n     * StringUtils.rightPad(\"bat\", 1, \u0027z\u0027)  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", -1, \u0027z\u0027) \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @param padChar  the character to pad with\n     * @return right padded String or original String if no padding is necessary,\n     *  {@code null} if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4604,col 9)-(line 4606,col 9)",
        "(line 4607,col 9)-(line 4607,col 39)",
        "(line 4608,col 9)-(line 4610,col 9)",
        "(line 4611,col 9)-(line 4613,col 9)",
        "(line 4614,col 9)-(line 4614,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.rightPad(java.lang.String, int, java.lang.String)",
      "begin_line": 4640,
      "end_line": 4669,
      "comment": "\n     * \u003cp\u003eRight pad a String with a specified String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is padded to the size of {@code size}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.rightPad(null, *, *)      \u003d null\n     * StringUtils.rightPad(\"\", 3, \"z\")      \u003d \"zzz\"\n     * StringUtils.rightPad(\"bat\", 3, \"yz\")  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", 5, \"yz\")  \u003d \"batyz\"\n     * StringUtils.rightPad(\"bat\", 8, \"yz\")  \u003d \"batyzyzy\"\n     * StringUtils.rightPad(\"bat\", 1, \"yz\")  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", -1, \"yz\") \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", 5, null)  \u003d \"bat  \"\n     * StringUtils.rightPad(\"bat\", 5, \"\")    \u003d \"bat  \"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @param padStr  the String to pad with, null or empty treated as single space\n     * @return right padded String or original String if no padding is necessary,\n     *  {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 4641,col 9)-(line 4643,col 9)",
        "(line 4644,col 9)-(line 4646,col 9)",
        "(line 4647,col 9)-(line 4647,col 37)",
        "(line 4648,col 9)-(line 4648,col 34)",
        "(line 4649,col 9)-(line 4649,col 33)",
        "(line 4650,col 9)-(line 4652,col 9)",
        "(line 4653,col 9)-(line 4655,col 9)",
        "(line 4657,col 9)-(line 4668,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.leftPad(java.lang.String, int)",
      "begin_line": 4690,
      "end_line": 4692,
      "comment": "\n     * \u003cp\u003eLeft pad a String with spaces (\u0027 \u0027).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is padded to the size of {@code size}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.leftPad(null, *)   \u003d null\n     * StringUtils.leftPad(\"\", 3)     \u003d \"   \"\n     * StringUtils.leftPad(\"bat\", 3)  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", 5)  \u003d \"  bat\"\n     * StringUtils.leftPad(\"bat\", 1)  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", -1) \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @return left padded String or original String if no padding is necessary,\n     *  {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 4691,col 9)-(line 4691,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.leftPad(java.lang.String, int, char)",
      "begin_line": 4715,
      "end_line": 4727,
      "comment": "\n     * \u003cp\u003eLeft pad a String with a specified character.\u003c/p\u003e\n     *\n     * \u003cp\u003ePad to a size of {@code size}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.leftPad(null, *, *)     \u003d null\n     * StringUtils.leftPad(\"\", 3, \u0027z\u0027)     \u003d \"zzz\"\n     * StringUtils.leftPad(\"bat\", 3, \u0027z\u0027)  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", 5, \u0027z\u0027)  \u003d \"zzbat\"\n     * StringUtils.leftPad(\"bat\", 1, \u0027z\u0027)  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", -1, \u0027z\u0027) \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @param padChar  the character to pad with\n     * @return left padded String or original String if no padding is necessary,\n     *  {@code null} if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4716,col 9)-(line 4718,col 9)",
        "(line 4719,col 9)-(line 4719,col 39)",
        "(line 4720,col 9)-(line 4722,col 9)",
        "(line 4723,col 9)-(line 4725,col 9)",
        "(line 4726,col 9)-(line 4726,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.leftPad(java.lang.String, int, java.lang.String)",
      "begin_line": 4752,
      "end_line": 4781,
      "comment": "\n     * \u003cp\u003eLeft pad a String with a specified String.\u003c/p\u003e\n     *\n     * \u003cp\u003ePad to a size of {@code size}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.leftPad(null, *, *)      \u003d null\n     * StringUtils.leftPad(\"\", 3, \"z\")      \u003d \"zzz\"\n     * StringUtils.leftPad(\"bat\", 3, \"yz\")  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", 5, \"yz\")  \u003d \"yzbat\"\n     * StringUtils.leftPad(\"bat\", 8, \"yz\")  \u003d \"yzyzybat\"\n     * StringUtils.leftPad(\"bat\", 1, \"yz\")  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", -1, \"yz\") \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", 5, null)  \u003d \"  bat\"\n     * StringUtils.leftPad(\"bat\", 5, \"\")    \u003d \"  bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @param padStr  the String to pad with, null or empty treated as single space\n     * @return left padded String or original String if no padding is necessary,\n     *  {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 4753,col 9)-(line 4755,col 9)",
        "(line 4756,col 9)-(line 4758,col 9)",
        "(line 4759,col 9)-(line 4759,col 37)",
        "(line 4760,col 9)-(line 4760,col 34)",
        "(line 4761,col 9)-(line 4761,col 33)",
        "(line 4762,col 9)-(line 4764,col 9)",
        "(line 4765,col 9)-(line 4767,col 9)",
        "(line 4769,col 9)-(line 4780,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.length(java.lang.CharSequence)",
      "begin_line": 4794,
      "end_line": 4796,
      "comment": "\n     * Gets a CharSequence length or {@code 0} if the CharSequence is\n     * {@code null}.\n     *\n     * @param cs\n     *            a CharSequence or {@code null}\n     * @return CharSequence length or {@code 0} if the CharSequence is\n     *         {@code null}.\n     * @since 2.4\n     * @since 3.0 Changed signature from length(String) to length(CharSequence)\n     ",
      "child_ranges": [
        "(line 4795,col 9)-(line 4795,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.center(java.lang.String, int)",
      "begin_line": 4823,
      "end_line": 4825,
      "comment": "\n     * \u003cp\u003eCenters a String in a larger String of size {@code size}\n     * using the space character (\u0027 \u0027).\u003cp\u003e\n     *\n     * \u003cp\u003eIf the size is less than the String length, the String is returned.\n     * A {@code null} String returns {@code null}.\n     * A negative size is treated as zero.\u003c/p\u003e\n     *\n     * \u003cp\u003eEquivalent to {@code center(str, size, \" \")}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.center(null, *)   \u003d null\n     * StringUtils.center(\"\", 4)     \u003d \"    \"\n     * StringUtils.center(\"ab\", -1)  \u003d \"ab\"\n     * StringUtils.center(\"ab\", 4)   \u003d \" ab \"\n     * StringUtils.center(\"abcd\", 2) \u003d \"abcd\"\n     * StringUtils.center(\"a\", 4)    \u003d \" a  \"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to center, may be null\n     * @param size  the int size of new String, negative treated as zero\n     * @return centered String, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 4824,col 9)-(line 4824,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.center(java.lang.String, int, char)",
      "begin_line": 4851,
      "end_line": 4863,
      "comment": "\n     * \u003cp\u003eCenters a String in a larger String of size {@code size}.\n     * Uses a supplied character as the value to pad the String with.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the size is less than the String length, the String is returned.\n     * A {@code null} String returns {@code null}.\n     * A negative size is treated as zero.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.center(null, *, *)     \u003d null\n     * StringUtils.center(\"\", 4, \u0027 \u0027)     \u003d \"    \"\n     * StringUtils.center(\"ab\", -1, \u0027 \u0027)  \u003d \"ab\"\n     * StringUtils.center(\"ab\", 4, \u0027 \u0027)   \u003d \" ab\"\n     * StringUtils.center(\"abcd\", 2, \u0027 \u0027) \u003d \"abcd\"\n     * StringUtils.center(\"a\", 4, \u0027 \u0027)    \u003d \" a  \"\n     * StringUtils.center(\"a\", 4, \u0027y\u0027)    \u003d \"yayy\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to center, may be null\n     * @param size  the int size of new String, negative treated as zero\n     * @param padChar  the character to pad the new String with\n     * @return centered String, {@code null} if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4852,col 9)-(line 4854,col 9)",
        "(line 4855,col 9)-(line 4855,col 34)",
        "(line 4856,col 9)-(line 4856,col 33)",
        "(line 4857,col 9)-(line 4859,col 9)",
        "(line 4860,col 9)-(line 4860,col 55)",
        "(line 4861,col 9)-(line 4861,col 43)",
        "(line 4862,col 9)-(line 4862,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.center(java.lang.String, int, java.lang.String)",
      "begin_line": 4891,
      "end_line": 4906,
      "comment": "\n     * \u003cp\u003eCenters a String in a larger String of size {@code size}.\n     * Uses a supplied String as the value to pad the String with.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the size is less than the String length, the String is returned.\n     * A {@code null} String returns {@code null}.\n     * A negative size is treated as zero.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.center(null, *, *)     \u003d null\n     * StringUtils.center(\"\", 4, \" \")     \u003d \"    \"\n     * StringUtils.center(\"ab\", -1, \" \")  \u003d \"ab\"\n     * StringUtils.center(\"ab\", 4, \" \")   \u003d \" ab\"\n     * StringUtils.center(\"abcd\", 2, \" \") \u003d \"abcd\"\n     * StringUtils.center(\"a\", 4, \" \")    \u003d \" a  \"\n     * StringUtils.center(\"a\", 4, \"yz\")   \u003d \"yayz\"\n     * StringUtils.center(\"abc\", 7, null) \u003d \"  abc  \"\n     * StringUtils.center(\"abc\", 7, \"\")   \u003d \"  abc  \"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to center, may be null\n     * @param size  the int size of new String, negative treated as zero\n     * @param padStr  the String to pad the new String with, must not be null or empty\n     * @return centered String, {@code null} if null String input\n     * @throws IllegalArgumentException if padStr is {@code null} or empty\n     ",
      "child_ranges": [
        "(line 4892,col 9)-(line 4894,col 9)",
        "(line 4895,col 9)-(line 4897,col 9)",
        "(line 4898,col 9)-(line 4898,col 34)",
        "(line 4899,col 9)-(line 4899,col 33)",
        "(line 4900,col 9)-(line 4902,col 9)",
        "(line 4903,col 9)-(line 4903,col 54)",
        "(line 4904,col 9)-(line 4904,col 42)",
        "(line 4905,col 9)-(line 4905,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.upperCase(java.lang.String)",
      "begin_line": 4929,
      "end_line": 4934,
      "comment": "\n     * \u003cp\u003eConverts a String to upper case as per {@link String#toUpperCase()}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.upperCase(null)  \u003d null\n     * StringUtils.upperCase(\"\")    \u003d \"\"\n     * StringUtils.upperCase(\"aBc\") \u003d \"ABC\"\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003e\u003cstrong\u003eNote:\u003c/strong\u003e As described in the documentation for {@link String#toUpperCase()},\n     * the result of this method is affected by the current locale.\n     * For platform-independent case transformations, the method {@link #lowerCase(String, Locale)}\n     * should be used with a specific locale (e.g. {@link Locale#ENGLISH}).\u003c/p\u003e\n     *\n     * @param str  the String to upper case, may be null\n     * @return the upper cased String, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 4930,col 9)-(line 4932,col 9)",
        "(line 4933,col 9)-(line 4933,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.upperCase(java.lang.String, java.util.Locale)",
      "begin_line": 4952,
      "end_line": 4957,
      "comment": "\n     * \u003cp\u003eConverts a String to upper case as per {@link String#toUpperCase(Locale)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.upperCase(null, Locale.ENGLISH)  \u003d null\n     * StringUtils.upperCase(\"\", Locale.ENGLISH)    \u003d \"\"\n     * StringUtils.upperCase(\"aBc\", Locale.ENGLISH) \u003d \"ABC\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to upper case, may be null\n     * @param locale  the locale that defines the case transformation rules, must not be null\n     * @return the upper cased String, {@code null} if null String input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 4953,col 9)-(line 4955,col 9)",
        "(line 4956,col 9)-(line 4956,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lowerCase(java.lang.String)",
      "begin_line": 4978,
      "end_line": 4983,
      "comment": "\n     * \u003cp\u003eConverts a String to lower case as per {@link String#toLowerCase()}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lowerCase(null)  \u003d null\n     * StringUtils.lowerCase(\"\")    \u003d \"\"\n     * StringUtils.lowerCase(\"aBc\") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003e\u003cstrong\u003eNote:\u003c/strong\u003e As described in the documentation for {@link String#toLowerCase()},\n     * the result of this method is affected by the current locale.\n     * For platform-independent case transformations, the method {@link #lowerCase(String, Locale)}\n     * should be used with a specific locale (e.g. {@link Locale#ENGLISH}).\u003c/p\u003e\n     *\n     * @param str  the String to lower case, may be null\n     * @return the lower cased String, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 4979,col 9)-(line 4981,col 9)",
        "(line 4982,col 9)-(line 4982,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lowerCase(java.lang.String, java.util.Locale)",
      "begin_line": 5001,
      "end_line": 5006,
      "comment": "\n     * \u003cp\u003eConverts a String to lower case as per {@link String#toLowerCase(Locale)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lowerCase(null, Locale.ENGLISH)  \u003d null\n     * StringUtils.lowerCase(\"\", Locale.ENGLISH)    \u003d \"\"\n     * StringUtils.lowerCase(\"aBc\", Locale.ENGLISH) \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to lower case, may be null\n     * @param locale  the locale that defines the case transformation rules, must not be null\n     * @return the lower cased String, {@code null} if null String input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 5002,col 9)-(line 5004,col 9)",
        "(line 5005,col 9)-(line 5005,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.capitalize(java.lang.String)",
      "begin_line": 5028,
      "end_line": 5037,
      "comment": "\n     * \u003cp\u003eCapitalizes a String changing the first letter to title case as\n     * per {@link Character#toTitleCase(char)}. No other letters are changed.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor a word based algorithm, see {@link org.apache.commons.lang3.text.WordUtils#capitalize(String)}.\n     * A {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.capitalize(null)  \u003d null\n     * StringUtils.capitalize(\"\")    \u003d \"\"\n     * StringUtils.capitalize(\"cat\") \u003d \"Cat\"\n     * StringUtils.capitalize(\"cAt\") \u003d \"CAt\"\n     * \u003c/pre\u003e\n     *\n     * @param str the String to capitalize, may be null\n     * @return the capitalized String, {@code null} if null String input\n     * @see org.apache.commons.lang3.text.WordUtils#capitalize(String)\n     * @see #uncapitalize(String)\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 5029,col 9)-(line 5029,col 19)",
        "(line 5030,col 9)-(line 5032,col 9)",
        "(line 5033,col 9)-(line 5036,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.uncapitalize(java.lang.String)",
      "begin_line": 5059,
      "end_line": 5068,
      "comment": "\n     * \u003cp\u003eUncapitalizes a String changing the first letter to title case as\n     * per {@link Character#toLowerCase(char)}. No other letters are changed.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor a word based algorithm, see {@link org.apache.commons.lang3.text.WordUtils#uncapitalize(String)}.\n     * A {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.uncapitalize(null)  \u003d null\n     * StringUtils.uncapitalize(\"\")    \u003d \"\"\n     * StringUtils.uncapitalize(\"Cat\") \u003d \"cat\"\n     * StringUtils.uncapitalize(\"CAT\") \u003d \"cAT\"\n     * \u003c/pre\u003e\n     *\n     * @param str the String to uncapitalize, may be null\n     * @return the uncapitalized String, {@code null} if null String input\n     * @see org.apache.commons.lang3.text.WordUtils#uncapitalize(String)\n     * @see #capitalize(String)\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 5060,col 9)-(line 5060,col 19)",
        "(line 5061,col 9)-(line 5063,col 9)",
        "(line 5064,col 9)-(line 5067,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.swapCase(java.lang.String)",
      "begin_line": 5097,
      "end_line": 5115,
      "comment": "\n     * \u003cp\u003eSwaps the case of a String changing upper and title case to\n     * lower case, and lower case to upper case.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     *  \u003cli\u003eUpper case character converts to Lower case\u003c/li\u003e\n     *  \u003cli\u003eTitle case character converts to Lower case\u003c/li\u003e\n     *  \u003cli\u003eLower case character converts to Upper case\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eFor a word based algorithm, see {@link org.apache.commons.lang3.text.WordUtils#swapCase(String)}.\n     * A {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.swapCase(null)                 \u003d null\n     * StringUtils.swapCase(\"\")                   \u003d \"\"\n     * StringUtils.swapCase(\"The dog has a BONE\") \u003d \"tHE DOG HAS A bone\"\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eNOTE: This method changed in Lang version 2.0.\n     * It no longer performs a word based algorithm.\n     * If you only use ASCII, you will notice no change.\n     * That functionality is available in org.apache.commons.lang3.text.WordUtils.\u003c/p\u003e\n     *\n     * @param str  the String to swap case, may be null\n     * @return the changed String, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 5098,col 9)-(line 5100,col 9)",
        "(line 5102,col 9)-(line 5102,col 42)",
        "(line 5104,col 9)-(line 5113,col 9)",
        "(line 5114,col 9)-(line 5114,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.countMatches(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 5139,
      "end_line": 5150,
      "comment": "\n     * \u003cp\u003eCounts how many times the substring appears in the larger string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} or empty (\"\") String input returns {@code 0}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.countMatches(null, *)       \u003d 0\n     * StringUtils.countMatches(\"\", *)         \u003d 0\n     * StringUtils.countMatches(\"abba\", null)  \u003d 0\n     * StringUtils.countMatches(\"abba\", \"\")    \u003d 0\n     * StringUtils.countMatches(\"abba\", \"a\")   \u003d 2\n     * StringUtils.countMatches(\"abba\", \"ab\")  \u003d 1\n     * StringUtils.countMatches(\"abba\", \"xxx\") \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param str  the CharSequence to check, may be null\n     * @param sub  the substring to count, may be null\n     * @return the number of occurrences, 0 if either CharSequence is {@code null}\n     * @since 3.0 Changed signature from countMatches(String, String) to countMatches(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 5140,col 9)-(line 5142,col 9)",
        "(line 5143,col 9)-(line 5143,col 22)",
        "(line 5144,col 9)-(line 5144,col 20)",
        "(line 5145,col 9)-(line 5148,col 9)",
        "(line 5149,col 9)-(line 5149,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAlpha(java.lang.CharSequence)",
      "begin_line": 5174,
      "end_line": 5185,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only Unicode letters.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null} will return {@code false}.\n     * An empty CharSequence (length()\u003d0) will return {@code false}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAlpha(null)   \u003d false\n     * StringUtils.isAlpha(\"\")     \u003d false\n     * StringUtils.isAlpha(\"  \")   \u003d false\n     * StringUtils.isAlpha(\"abc\")  \u003d true\n     * StringUtils.isAlpha(\"ab2c\") \u003d false\n     * StringUtils.isAlpha(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return {@code true} if only contains letters, and is non-null\n     * @since 3.0 Changed signature from isAlpha(String) to isAlpha(CharSequence)\n     * @since 3.0 Changed \"\" to return false and not true\n     ",
      "child_ranges": [
        "(line 5175,col 9)-(line 5177,col 9)",
        "(line 5178,col 9)-(line 5178,col 29)",
        "(line 5179,col 9)-(line 5183,col 9)",
        "(line 5184,col 9)-(line 5184,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAlphaSpace(java.lang.CharSequence)",
      "begin_line": 5209,
      "end_line": 5220,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only Unicode letters and\n     * space (\u0027 \u0027).\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null} will return {@code false}\n     * An empty CharSequence (length()\u003d0) will return {@code true}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAlphaSpace(null)   \u003d false\n     * StringUtils.isAlphaSpace(\"\")     \u003d true\n     * StringUtils.isAlphaSpace(\"  \")   \u003d true\n     * StringUtils.isAlphaSpace(\"abc\")  \u003d true\n     * StringUtils.isAlphaSpace(\"ab c\") \u003d true\n     * StringUtils.isAlphaSpace(\"ab2c\") \u003d false\n     * StringUtils.isAlphaSpace(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return {@code true} if only contains letters and space,\n     *  and is non-null\n     * @since 3.0 Changed signature from isAlphaSpace(String) to isAlphaSpace(CharSequence)\n     ",
      "child_ranges": [
        "(line 5210,col 9)-(line 5212,col 9)",
        "(line 5213,col 9)-(line 5213,col 29)",
        "(line 5214,col 9)-(line 5218,col 9)",
        "(line 5219,col 9)-(line 5219,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAlphanumeric(java.lang.CharSequence)",
      "begin_line": 5244,
      "end_line": 5255,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only Unicode letters or digits.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null} will return {@code false}.\n     * An empty CharSequence (length()\u003d0) will return {@code false}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAlphanumeric(null)   \u003d false\n     * StringUtils.isAlphanumeric(\"\")     \u003d false\n     * StringUtils.isAlphanumeric(\"  \")   \u003d false\n     * StringUtils.isAlphanumeric(\"abc\")  \u003d true\n     * StringUtils.isAlphanumeric(\"ab c\") \u003d false\n     * StringUtils.isAlphanumeric(\"ab2c\") \u003d true\n     * StringUtils.isAlphanumeric(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return {@code true} if only contains letters or digits,\n     *  and is non-null\n     * @since 3.0 Changed signature from isAlphanumeric(String) to isAlphanumeric(CharSequence)\n     * @since 3.0 Changed \"\" to return false and not true\n     ",
      "child_ranges": [
        "(line 5245,col 9)-(line 5247,col 9)",
        "(line 5248,col 9)-(line 5248,col 29)",
        "(line 5249,col 9)-(line 5253,col 9)",
        "(line 5254,col 9)-(line 5254,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAlphanumericSpace(java.lang.CharSequence)",
      "begin_line": 5279,
      "end_line": 5290,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only Unicode letters, digits\n     * or space ({@code \u0027 \u0027}).\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null} will return {@code false}.\n     * An empty CharSequence (length()\u003d0) will return {@code true}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAlphanumericSpace(null)   \u003d false\n     * StringUtils.isAlphanumericSpace(\"\")     \u003d true\n     * StringUtils.isAlphanumericSpace(\"  \")   \u003d true\n     * StringUtils.isAlphanumericSpace(\"abc\")  \u003d true\n     * StringUtils.isAlphanumericSpace(\"ab c\") \u003d true\n     * StringUtils.isAlphanumericSpace(\"ab2c\") \u003d true\n     * StringUtils.isAlphanumericSpace(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return {@code true} if only contains letters, digits or space,\n     *  and is non-null\n     * @since 3.0 Changed signature from isAlphanumericSpace(String) to isAlphanumericSpace(CharSequence)\n     ",
      "child_ranges": [
        "(line 5280,col 9)-(line 5282,col 9)",
        "(line 5283,col 9)-(line 5283,col 29)",
        "(line 5284,col 9)-(line 5288,col 9)",
        "(line 5289,col 9)-(line 5289,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAsciiPrintable(java.lang.CharSequence)",
      "begin_line": 5318,
      "end_line": 5329,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only ASCII printable characters.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null} will return {@code false}.\n     * An empty CharSequence (length()\u003d0) will return {@code true}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAsciiPrintable(null)     \u003d false\n     * StringUtils.isAsciiPrintable(\"\")       \u003d true\n     * StringUtils.isAsciiPrintable(\" \")      \u003d true\n     * StringUtils.isAsciiPrintable(\"Ceki\")   \u003d true\n     * StringUtils.isAsciiPrintable(\"ab2c\")   \u003d true\n     * StringUtils.isAsciiPrintable(\"!ab-c~\") \u003d true\n     * StringUtils.isAsciiPrintable(\"\\u0020\") \u003d true\n     * StringUtils.isAsciiPrintable(\"\\u0021\") \u003d true\n     * StringUtils.isAsciiPrintable(\"\\u007e\") \u003d true\n     * StringUtils.isAsciiPrintable(\"\\u007f\") \u003d false\n     * StringUtils.isAsciiPrintable(\"Ceki G\\u00fclc\\u00fc\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs the CharSequence to check, may be null\n     * @return {@code true} if every character is in the range\n     *  32 thru 126\n     * @since 2.1\n     * @since 3.0 Changed signature from isAsciiPrintable(String) to isAsciiPrintable(CharSequence)\n     ",
      "child_ranges": [
        "(line 5319,col 9)-(line 5321,col 9)",
        "(line 5322,col 9)-(line 5322,col 29)",
        "(line 5323,col 9)-(line 5327,col 9)",
        "(line 5328,col 9)-(line 5328,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isNumeric(java.lang.CharSequence)",
      "begin_line": 5354,
      "end_line": 5365,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only Unicode digits.\n     * A decimal point is not a Unicode digit and returns false.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null} will return {@code false}.\n     * An empty CharSequence (length()\u003d0) will return {@code false}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isNumeric(null)   \u003d false\n     * StringUtils.isNumeric(\"\")     \u003d false\n     * StringUtils.isNumeric(\"  \")   \u003d false\n     * StringUtils.isNumeric(\"123\")  \u003d true\n     * StringUtils.isNumeric(\"12 3\") \u003d false\n     * StringUtils.isNumeric(\"ab2c\") \u003d false\n     * StringUtils.isNumeric(\"12-3\") \u003d false\n     * StringUtils.isNumeric(\"12.3\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return {@code true} if only contains digits, and is non-null\n     * @since 3.0 Changed signature from isNumeric(String) to isNumeric(CharSequence)\n     * @since 3.0 Changed \"\" to return false and not true\n     ",
      "child_ranges": [
        "(line 5355,col 9)-(line 5357,col 9)",
        "(line 5358,col 9)-(line 5358,col 29)",
        "(line 5359,col 9)-(line 5363,col 9)",
        "(line 5364,col 9)-(line 5364,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isNumericSpace(java.lang.CharSequence)",
      "begin_line": 5391,
      "end_line": 5402,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only Unicode digits or space\n     * ({@code \u0027 \u0027}).\n     * A decimal point is not a Unicode digit and returns false.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null} will return {@code false}.\n     * An empty CharSequence (length()\u003d0) will return {@code true}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isNumericSpace(null)   \u003d false\n     * StringUtils.isNumericSpace(\"\")     \u003d true\n     * StringUtils.isNumericSpace(\"  \")   \u003d true\n     * StringUtils.isNumericSpace(\"123\")  \u003d true\n     * StringUtils.isNumericSpace(\"12 3\") \u003d true\n     * StringUtils.isNumericSpace(\"ab2c\") \u003d false\n     * StringUtils.isNumericSpace(\"12-3\") \u003d false\n     * StringUtils.isNumericSpace(\"12.3\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return {@code true} if only contains digits or space,\n     *  and is non-null\n     * @since 3.0 Changed signature from isNumericSpace(String) to isNumericSpace(CharSequence)\n     ",
      "child_ranges": [
        "(line 5392,col 9)-(line 5394,col 9)",
        "(line 5395,col 9)-(line 5395,col 29)",
        "(line 5396,col 9)-(line 5400,col 9)",
        "(line 5401,col 9)-(line 5401,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isWhitespace(java.lang.CharSequence)",
      "begin_line": 5424,
      "end_line": 5435,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only whitespace.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null} will return {@code false}.\n     * An empty CharSequence (length()\u003d0) will return {@code true}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isWhitespace(null)   \u003d false\n     * StringUtils.isWhitespace(\"\")     \u003d true\n     * StringUtils.isWhitespace(\"  \")   \u003d true\n     * StringUtils.isWhitespace(\"abc\")  \u003d false\n     * StringUtils.isWhitespace(\"ab2c\") \u003d false\n     * StringUtils.isWhitespace(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return {@code true} if only contains whitespace, and is non-null\n     * @since 2.0\n     * @since 3.0 Changed signature from isWhitespace(String) to isWhitespace(CharSequence)\n     ",
      "child_ranges": [
        "(line 5425,col 9)-(line 5427,col 9)",
        "(line 5428,col 9)-(line 5428,col 29)",
        "(line 5429,col 9)-(line 5433,col 9)",
        "(line 5434,col 9)-(line 5434,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAllLowerCase(java.lang.CharSequence)",
      "begin_line": 5456,
      "end_line": 5467,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only lowercase characters.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null} will return {@code false}.\n     * An empty CharSequence (length()\u003d0) will return {@code false}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAllLowerCase(null)   \u003d false\n     * StringUtils.isAllLowerCase(\"\")     \u003d false\n     * StringUtils.isAllLowerCase(\"  \")   \u003d false\n     * StringUtils.isAllLowerCase(\"abc\")  \u003d true\n     * StringUtils.isAllLowerCase(\"abC\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return {@code true} if only contains lowercase characters, and is non-null\n     * @since 2.5\n     * @since 3.0 Changed signature from isAllLowerCase(String) to isAllLowerCase(CharSequence)\n     ",
      "child_ranges": [
        "(line 5457,col 9)-(line 5459,col 9)",
        "(line 5460,col 9)-(line 5460,col 29)",
        "(line 5461,col 9)-(line 5465,col 9)",
        "(line 5466,col 9)-(line 5466,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAllUpperCase(java.lang.CharSequence)",
      "begin_line": 5488,
      "end_line": 5499,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only uppercase characters.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null} will return {@code false}.\n     * An empty String (length()\u003d0) will return {@code false}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAllUpperCase(null)   \u003d false\n     * StringUtils.isAllUpperCase(\"\")     \u003d false\n     * StringUtils.isAllUpperCase(\"  \")   \u003d false\n     * StringUtils.isAllUpperCase(\"ABC\")  \u003d true\n     * StringUtils.isAllUpperCase(\"aBC\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs the CharSequence to check, may be null\n     * @return {@code true} if only contains uppercase characters, and is non-null\n     * @since 2.5\n     * @since 3.0 Changed signature from isAllUpperCase(String) to isAllUpperCase(CharSequence)\n     ",
      "child_ranges": [
        "(line 5489,col 9)-(line 5491,col 9)",
        "(line 5492,col 9)-(line 5492,col 29)",
        "(line 5493,col 9)-(line 5497,col 9)",
        "(line 5498,col 9)-(line 5498,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.defaultString(java.lang.String)",
      "begin_line": 5519,
      "end_line": 5521,
      "comment": "\n     * \u003cp\u003eReturns either the passed in String,\n     * or if the String is {@code null}, an empty String (\"\").\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.defaultString(null)  \u003d \"\"\n     * StringUtils.defaultString(\"\")    \u003d \"\"\n     * StringUtils.defaultString(\"bat\") \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @see ObjectUtils#toString(Object)\n     * @see String#valueOf(Object)\n     * @param str  the String to check, may be null\n     * @return the passed in String, or the empty String if it\n     *  was {@code null}\n     ",
      "child_ranges": [
        "(line 5520,col 9)-(line 5520,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.defaultString(java.lang.String, java.lang.String)",
      "begin_line": 5540,
      "end_line": 5542,
      "comment": "\n     * \u003cp\u003eReturns either the passed in String, or if the String is\n     * {@code null}, the value of {@code defaultStr}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.defaultString(null, \"NULL\")  \u003d \"NULL\"\n     * StringUtils.defaultString(\"\", \"NULL\")    \u003d \"\"\n     * StringUtils.defaultString(\"bat\", \"NULL\") \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @see ObjectUtils#toString(Object,String)\n     * @see String#valueOf(Object)\n     * @param str  the String to check, may be null\n     * @param defaultStr  the default String to return\n     *  if the input is {@code null}, may be null\n     * @return the passed in String, or the default if it was {@code null}\n     ",
      "child_ranges": [
        "(line 5541,col 9)-(line 5541,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.defaultIfBlank(T, T)",
      "begin_line": 5562,
      "end_line": 5564,
      "comment": "\n     * \u003cp\u003eReturns either the passed in CharSequence, or if the CharSequence is\n     * whitespace, empty (\"\") or {@code null}, the value of {@code defaultStr}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.defaultIfBlank(null, \"NULL\")  \u003d \"NULL\"\n     * StringUtils.defaultIfBlank(\"\", \"NULL\")    \u003d \"NULL\"\n     * StringUtils.defaultIfBlank(\" \", \"NULL\")   \u003d \"NULL\"\n     * StringUtils.defaultIfBlank(\"bat\", \"NULL\") \u003d \"bat\"\n     * StringUtils.defaultIfBlank(\"\", null)      \u003d null\n     * \u003c/pre\u003e\n     * @param \u003cT\u003e the specific kind of CharSequence\n     * @param str the CharSequence to check, may be null\n     * @param defaultStr  the default CharSequence to return\n     *  if the input is whitespace, empty (\"\") or {@code null}, may be null\n     * @return the passed in CharSequence, or the default\n     * @see StringUtils#defaultString(String, String)\n     ",
      "child_ranges": [
        "(line 5563,col 9)-(line 5563,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.defaultIfEmpty(T, T)",
      "begin_line": 5583,
      "end_line": 5585,
      "comment": "\n     * \u003cp\u003eReturns either the passed in CharSequence, or if the CharSequence is\n     * empty or {@code null}, the value of {@code defaultStr}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.defaultIfEmpty(null, \"NULL\")  \u003d \"NULL\"\n     * StringUtils.defaultIfEmpty(\"\", \"NULL\")    \u003d \"NULL\"\n     * StringUtils.defaultIfEmpty(\"bat\", \"NULL\") \u003d \"bat\"\n     * StringUtils.defaultIfEmpty(\"\", null)      \u003d null\n     * \u003c/pre\u003e\n     * @param \u003cT\u003e the specific kind of CharSequence\n     * @param str  the CharSequence to check, may be null\n     * @param defaultStr  the default CharSequence to return\n     *  if the input is empty (\"\") or {@code null}, may be null\n     * @return the passed in CharSequence, or the default\n     * @see StringUtils#defaultString(String, String)\n     ",
      "child_ranges": [
        "(line 5584,col 9)-(line 5584,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.reverse(java.lang.String)",
      "begin_line": 5603,
      "end_line": 5608,
      "comment": "\n     * \u003cp\u003eReverses a String as per {@link StringBuilder#reverse()}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.reverse(null)  \u003d null\n     * StringUtils.reverse(\"\")    \u003d \"\"\n     * StringUtils.reverse(\"bat\") \u003d \"tab\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to reverse, may be null\n     * @return the reversed String, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 5604,col 9)-(line 5606,col 9)",
        "(line 5607,col 9)-(line 5607,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.reverseDelimited(java.lang.String, char)",
      "begin_line": 5629,
      "end_line": 5638,
      "comment": "\n     * \u003cp\u003eReverses a String that is delimited by a specific character.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe Strings between the delimiters are not reversed.\n     * Thus java.lang.String becomes String.lang.java (if the delimiter\n     * is {@code \u0027.\u0027}).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.reverseDelimited(null, *)      \u003d null\n     * StringUtils.reverseDelimited(\"\", *)        \u003d \"\"\n     * StringUtils.reverseDelimited(\"a.b.c\", \u0027x\u0027) \u003d \"a.b.c\"\n     * StringUtils.reverseDelimited(\"a.b.c\", \".\") \u003d \"c.b.a\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to reverse, may be null\n     * @param separatorChar  the separator character to use\n     * @return the reversed String, {@code null} if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 5630,col 9)-(line 5632,col 9)",
        "(line 5635,col 9)-(line 5635,col 50)",
        "(line 5636,col 9)-(line 5636,col 33)",
        "(line 5637,col 9)-(line 5637,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.abbreviate(java.lang.String, int)",
      "begin_line": 5674,
      "end_line": 5676,
      "comment": "\n     * \u003cp\u003eAbbreviates a String using ellipses. This will turn\n     * \"Now is the time for all good men\" into \"Now is the time for...\"\u003c/p\u003e\n     *\n     * \u003cp\u003eSpecifically:\n     * \u003cul\u003e\n     *   \u003cli\u003eIf {@code str} is less than {@code maxWidth} characters\n     *       long, return it.\u003c/li\u003e\n     *   \u003cli\u003eElse abbreviate it to {@code (substring(str, 0, max-3) + \"...\")}.\u003c/li\u003e\n     *   \u003cli\u003eIf {@code maxWidth} is less than {@code 4}, throw an\n     *       {@code IllegalArgumentException}.\u003c/li\u003e\n     *   \u003cli\u003eIn no case will it return a String of length greater than\n     *       {@code maxWidth}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.abbreviate(null, *)      \u003d null\n     * StringUtils.abbreviate(\"\", 4)        \u003d \"\"\n     * StringUtils.abbreviate(\"abcdefg\", 6) \u003d \"abc...\"\n     * StringUtils.abbreviate(\"abcdefg\", 7) \u003d \"abcdefg\"\n     * StringUtils.abbreviate(\"abcdefg\", 8) \u003d \"abcdefg\"\n     * StringUtils.abbreviate(\"abcdefg\", 4) \u003d \"a...\"\n     * StringUtils.abbreviate(\"abcdefg\", 3) \u003d IllegalArgumentException\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param maxWidth  maximum length of result String, must be at least 4\n     * @return abbreviated String, {@code null} if null String input\n     * @throws IllegalArgumentException if the width is too small\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 5675,col 9)-(line 5675,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.abbreviate(java.lang.String, int, int)",
      "begin_line": 5713,
      "end_line": 5740,
      "comment": "\n     * \u003cp\u003eAbbreviates a String using ellipses. This will turn\n     * \"Now is the time for all good men\" into \"...is the time for...\"\u003c/p\u003e\n     *\n     * \u003cp\u003eWorks like {@code abbreviate(String, int)}, but allows you to specify\n     * a \"left edge\" offset.  Note that this left edge is not necessarily going to\n     * be the leftmost character in the result, or the first character following the\n     * ellipses, but it will appear somewhere in the result.\n     *\n     * \u003cp\u003eIn no case will it return a String of length greater than\n     * {@code maxWidth}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.abbreviate(null, *, *)                \u003d null\n     * StringUtils.abbreviate(\"\", 0, 4)                  \u003d \"\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", -1, 10) \u003d \"abcdefg...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 0, 10)  \u003d \"abcdefg...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 1, 10)  \u003d \"abcdefg...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 4, 10)  \u003d \"abcdefg...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 5, 10)  \u003d \"...fghi...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 6, 10)  \u003d \"...ghij...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 8, 10)  \u003d \"...ijklmno\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 10, 10) \u003d \"...ijklmno\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 12, 10) \u003d \"...ijklmno\"\n     * StringUtils.abbreviate(\"abcdefghij\", 0, 3)        \u003d IllegalArgumentException\n     * StringUtils.abbreviate(\"abcdefghij\", 5, 6)        \u003d IllegalArgumentException\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param offset  left edge of source String\n     * @param maxWidth  maximum length of result String, must be at least 4\n     * @return abbreviated String, {@code null} if null String input\n     * @throws IllegalArgumentException if the width is too small\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 5714,col 9)-(line 5716,col 9)",
        "(line 5717,col 9)-(line 5719,col 9)",
        "(line 5720,col 9)-(line 5722,col 9)",
        "(line 5723,col 9)-(line 5725,col 9)",
        "(line 5726,col 9)-(line 5728,col 9)",
        "(line 5729,col 9)-(line 5729,col 41)",
        "(line 5730,col 9)-(line 5732,col 9)",
        "(line 5733,col 9)-(line 5735,col 9)",
        "(line 5736,col 9)-(line 5738,col 9)",
        "(line 5739,col 9)-(line 5739,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.abbreviateMiddle(java.lang.String, java.lang.String, int)",
      "begin_line": 5771,
      "end_line": 5790,
      "comment": "\n     * \u003cp\u003eAbbreviates a String to the length passed, replacing the middle characters with the supplied\n     * replacement String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis abbreviation only occurs if the following criteria is met:\n     * \u003cul\u003e\n     * \u003cli\u003eNeither the String for abbreviation nor the replacement String are null or empty \u003c/li\u003e\n     * \u003cli\u003eThe length to truncate to is less than the length of the supplied String\u003c/li\u003e\n     * \u003cli\u003eThe length to truncate to is greater than 0\u003c/li\u003e\n     * \u003cli\u003eThe abbreviated String will have enough room for the length supplied replacement String\n     * and the first and last characters of the supplied String for abbreviation\u003c/li\u003e\n     * \u003c/ul\u003e\n     * Otherwise, the returned String will be the same as the supplied String for abbreviation.\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.abbreviateMiddle(null, null, 0)      \u003d null\n     * StringUtils.abbreviateMiddle(\"abc\", null, 0)      \u003d \"abc\"\n     * StringUtils.abbreviateMiddle(\"abc\", \".\", 0)      \u003d \"abc\"\n     * StringUtils.abbreviateMiddle(\"abc\", \".\", 3)      \u003d \"abc\"\n     * StringUtils.abbreviateMiddle(\"abcdef\", \".\", 4)     \u003d \"ab.f\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to abbreviate, may be null\n     * @param middle the String to replace the middle characters with, may be null\n     * @param length the length to abbreviate {@code str} to.\n     * @return the abbreviated String if the above criteria is met, or the original String supplied for abbreviation.\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 5772,col 9)-(line 5774,col 9)",
        "(line 5776,col 9)-(line 5778,col 9)",
        "(line 5780,col 9)-(line 5780,col 49)",
        "(line 5781,col 9)-(line 5781,col 54)",
        "(line 5782,col 9)-(line 5782,col 51)",
        "(line 5784,col 9)-(line 5784,col 58)",
        "(line 5785,col 9)-(line 5785,col 53)",
        "(line 5786,col 9)-(line 5786,col 31)",
        "(line 5787,col 9)-(line 5787,col 49)",
        "(line 5789,col 9)-(line 5789,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.difference(java.lang.String, java.lang.String)",
      "begin_line": 5819,
      "end_line": 5831,
      "comment": "\n     * \u003cp\u003eCompares two Strings, and returns the portion where they differ.\n     * (More precisely, return the remainder of the second String,\n     * starting from where it\u0027s different from the first.)\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example,\n     * {@code difference(\"i am a machine\", \"i am a robot\") -\u003e \"robot\"}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.difference(null, null) \u003d null\n     * StringUtils.difference(\"\", \"\") \u003d \"\"\n     * StringUtils.difference(\"\", \"abc\") \u003d \"abc\"\n     * StringUtils.difference(\"abc\", \"\") \u003d \"\"\n     * StringUtils.difference(\"abc\", \"abc\") \u003d \"\"\n     * StringUtils.difference(\"ab\", \"abxyz\") \u003d \"xyz\"\n     * StringUtils.difference(\"abcde\", \"abxyz\") \u003d \"xyz\"\n     * StringUtils.difference(\"abcde\", \"xyz\") \u003d \"xyz\"\n     * \u003c/pre\u003e\n     *\n     * @param str1  the first String, may be null\n     * @param str2  the second String, may be null\n     * @return the portion of str2 where it differs from str1; returns the\n     * empty String if they are equal\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 5820,col 9)-(line 5822,col 9)",
        "(line 5823,col 9)-(line 5825,col 9)",
        "(line 5826,col 9)-(line 5826,col 47)",
        "(line 5827,col 9)-(line 5829,col 9)",
        "(line 5830,col 9)-(line 5830,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfDifference(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 5858,
      "end_line": 5875,
      "comment": "\n     * \u003cp\u003eCompares two CharSequences, and returns the index at which the\n     * CharSequences begin to differ.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example,\n     * {@code indexOfDifference(\"i am a machine\", \"i am a robot\") -\u003e 7}\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfDifference(null, null) \u003d -1\n     * StringUtils.indexOfDifference(\"\", \"\") \u003d -1\n     * StringUtils.indexOfDifference(\"\", \"abc\") \u003d 0\n     * StringUtils.indexOfDifference(\"abc\", \"\") \u003d 0\n     * StringUtils.indexOfDifference(\"abc\", \"abc\") \u003d -1\n     * StringUtils.indexOfDifference(\"ab\", \"abxyz\") \u003d 2\n     * StringUtils.indexOfDifference(\"abcde\", \"abxyz\") \u003d 2\n     * StringUtils.indexOfDifference(\"abcde\", \"xyz\") \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param cs1  the first CharSequence, may be null\n     * @param cs2  the second CharSequence, may be null\n     * @return the index where cs1 and cs2 begin to differ; -1 if they are equal\n     * @since 2.0\n     * @since 3.0 Changed signature from indexOfDifference(String, String) to\n     * indexOfDifference(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 5859,col 9)-(line 5861,col 9)",
        "(line 5862,col 9)-(line 5864,col 9)",
        "(line 5865,col 9)-(line 5865,col 14)",
        "(line 5866,col 9)-(line 5870,col 9)",
        "(line 5871,col 9)-(line 5873,col 9)",
        "(line 5874,col 9)-(line 5874,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfDifference(java.lang.CharSequence...)",
      "begin_line": 5909,
      "end_line": 5965,
      "comment": "\n     * \u003cp\u003eCompares all CharSequences in an array and returns the index at which the\n     * CharSequences begin to differ.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example,\n     * \u003ccode\u003eindexOfDifference(new String[] {\"i am a machine\", \"i am a robot\"}) -\u003e 7\u003c/code\u003e\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfDifference(null) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {}) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {\"abc\"}) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {null, null}) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {\"\", \"\"}) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {\"\", null}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"abc\", null, null}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {null, null, \"abc\"}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"\", \"abc\"}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"abc\", \"\"}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"abc\", \"abc\"}) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {\"abc\", \"a\"}) \u003d 1\n     * StringUtils.indexOfDifference(new String[] {\"ab\", \"abxyz\"}) \u003d 2\n     * StringUtils.indexOfDifference(new String[] {\"abcde\", \"abxyz\"}) \u003d 2\n     * StringUtils.indexOfDifference(new String[] {\"abcde\", \"xyz\"}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"xyz\", \"abcde\"}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"i am a machine\", \"i am a robot\"}) \u003d 7\n     * \u003c/pre\u003e\n     *\n     * @param css  array of CharSequences, entries may be null\n     * @return the index where the strings begin to differ; -1 if they are all equal\n     * @since 2.4\n     * @since 3.0 Changed signature from indexOfDifference(String...) to indexOfDifference(CharSequence...)\n     ",
      "child_ranges": [
        "(line 5910,col 9)-(line 5912,col 9)",
        "(line 5913,col 9)-(line 5913,col 38)",
        "(line 5914,col 9)-(line 5914,col 38)",
        "(line 5915,col 9)-(line 5915,col 34)",
        "(line 5916,col 9)-(line 5916,col 47)",
        "(line 5917,col 9)-(line 5917,col 30)",
        "(line 5922,col 9)-(line 5931,col 9)",
        "(line 5934,col 9)-(line 5936,col 9)",
        "(line 5939,col 9)-(line 5941,col 9)",
        "(line 5944,col 9)-(line 5944,col 27)",
        "(line 5945,col 9)-(line 5956,col 9)",
        "(line 5958,col 9)-(line 5963,col 9)",
        "(line 5964,col 9)-(line 5964,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.getCommonPrefix(java.lang.String...)",
      "begin_line": 6000,
      "end_line": 6018,
      "comment": "\n     * \u003cp\u003eCompares all Strings in an array and returns the initial sequence of\n     * characters that is common to all of them.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example,\n     * \u003ccode\u003egetCommonPrefix(new String[] {\"i am a machine\", \"i am a robot\"}) -\u003e \"i am a \"\u003c/code\u003e\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.getCommonPrefix(null) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"abc\"}) \u003d \"abc\"\n     * StringUtils.getCommonPrefix(new String[] {null, null}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"\", \"\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"\", null}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"abc\", null, null}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {null, null, \"abc\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"\", \"abc\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"abc\", \"\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"abc\", \"abc\"}) \u003d \"abc\"\n     * StringUtils.getCommonPrefix(new String[] {\"abc\", \"a\"}) \u003d \"a\"\n     * StringUtils.getCommonPrefix(new String[] {\"ab\", \"abxyz\"}) \u003d \"ab\"\n     * StringUtils.getCommonPrefix(new String[] {\"abcde\", \"abxyz\"}) \u003d \"ab\"\n     * StringUtils.getCommonPrefix(new String[] {\"abcde\", \"xyz\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"xyz\", \"abcde\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"i am a machine\", \"i am a robot\"}) \u003d \"i am a \"\n     * \u003c/pre\u003e\n     *\n     * @param strs  array of String objects, entries may be null\n     * @return the initial sequence of characters that are common to all Strings\n     * in the array; empty String if the array is null, the elements are all null\n     * or if there is no common prefix.\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 6001,col 9)-(line 6003,col 9)",
        "(line 6004,col 9)-(line 6004,col 58)",
        "(line 6005,col 9)-(line 6017,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.getLevenshteinDistance(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 6058,
      "end_line": 6133,
      "comment": "\n     * \u003cp\u003eFind the Levenshtein distance between two Strings.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is the number of changes needed to change one String into\n     * another, where each change is a single character modification (deletion,\n     * insertion or substitution).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe previous implementation of the Levenshtein distance algorithm\n     * was from \u003ca href\u003d\"http://www.merriampark.com/ld.htm\"\u003ehttp://www.merriampark.com/ld.htm\u003c/a\u003e\u003c/p\u003e\n     *\n     * \u003cp\u003eChas Emerick has written an implementation in Java, which avoids an OutOfMemoryError\n     * which can occur when my Java implementation is used with very large strings.\u003cbr\u003e\n     * This implementation of the Levenshtein distance algorithm\n     * is from \u003ca href\u003d\"http://www.merriampark.com/ldjava.htm\"\u003ehttp://www.merriampark.com/ldjava.htm\u003c/a\u003e\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.getLevenshteinDistance(null, *)             \u003d IllegalArgumentException\n     * StringUtils.getLevenshteinDistance(*, null)             \u003d IllegalArgumentException\n     * StringUtils.getLevenshteinDistance(\"\",\"\")               \u003d 0\n     * StringUtils.getLevenshteinDistance(\"\",\"a\")              \u003d 1\n     * StringUtils.getLevenshteinDistance(\"aaapppp\", \"\")       \u003d 7\n     * StringUtils.getLevenshteinDistance(\"frog\", \"fog\")       \u003d 1\n     * StringUtils.getLevenshteinDistance(\"fly\", \"ant\")        \u003d 3\n     * StringUtils.getLevenshteinDistance(\"elephant\", \"hippo\") \u003d 7\n     * StringUtils.getLevenshteinDistance(\"hippo\", \"elephant\") \u003d 7\n     * StringUtils.getLevenshteinDistance(\"hippo\", \"zzzzzzzz\") \u003d 8\n     * StringUtils.getLevenshteinDistance(\"hello\", \"hallo\")    \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @param s  the first String, must not be null\n     * @param t  the second String, must not be null\n     * @return result distance\n     * @throws IllegalArgumentException if either String input {@code null}\n     * @since 3.0 Changed signature from getLevenshteinDistance(String, String) to\n     * getLevenshteinDistance(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 6059,col 9)-(line 6061,col 9)",
        "(line 6080,col 9)-(line 6080,col 27)",
        "(line 6081,col 9)-(line 6081,col 27)",
        "(line 6083,col 9)-(line 6087,col 9)",
        "(line 6089,col 9)-(line 6096,col 9)",
        "(line 6098,col 9)-(line 6098,col 33)",
        "(line 6099,col 9)-(line 6099,col 33)",
        "(line 6100,col 9)-(line 6100,col 17)",
        "(line 6103,col 9)-(line 6103,col 14)",
        "(line 6104,col 9)-(line 6104,col 14)",
        "(line 6106,col 9)-(line 6106,col 17)",
        "(line 6108,col 9)-(line 6108,col 17)",
        "(line 6110,col 9)-(line 6112,col 9)",
        "(line 6114,col 9)-(line 6128,col 9)",
        "(line 6132,col 9)-(line 6132,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.getLevenshteinDistance(java.lang.CharSequence, java.lang.CharSequence, int)",
      "begin_line": 6167,
      "end_line": 6295,
      "comment": "\n     * \u003cp\u003eFind the Levenshtein distance between two Strings if it\u0027s less than or equal to a given \n     * threshold.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is the number of changes needed to change one String into\n     * another, where each change is a single character modification (deletion,\n     * insertion or substitution).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis implementation follows from Algorithms on Strings, Trees and Sequences by Dan Gusfield\n     * and Chas Emerick\u0027s implementation of the Levenshtein distance algorithm from\n     * \u003ca href\u003d\"http://www.merriampark.com/ld.htm\"\u003ehttp://www.merriampark.com/ld.htm\u003c/a\u003e\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.getLevenshteinDistance(null, *, *)             \u003d IllegalArgumentException\n     * StringUtils.getLevenshteinDistance(*, null, *)             \u003d IllegalArgumentException\n     * StringUtils.getLevenshteinDistance(*, *, -1)               \u003d IllegalArgumentException\n     * StringUtils.getLevenshteinDistance(\"\",\"\", 0)               \u003d 0\n     * StringUtils.getLevenshteinDistance(\"aaapppp\", \"\", 8)       \u003d 7\n     * StringUtils.getLevenshteinDistance(\"aaapppp\", \"\", 7)       \u003d 7\n     * StringUtils.getLevenshteinDistance(\"aaapppp\", \"\", 6))      \u003d -1\n     * StringUtils.getLevenshteinDistance(\"elephant\", \"hippo\", 7) \u003d 7\n     * StringUtils.getLevenshteinDistance(\"elephant\", \"hippo\", 6) \u003d -1\n     * StringUtils.getLevenshteinDistance(\"hippo\", \"elephant\", 7) \u003d 7\n     * StringUtils.getLevenshteinDistance(\"hippo\", \"elephant\", 6) \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param s  the first String, must not be null\n     * @param t  the second String, must not be null\n     * @param threshold the target threshold, must not be negative\n     * @return result distance, or {@code -1} if the distance would be greater than the threshold\n     * @throws IllegalArgumentException if either String input {@code null} or negative threshold\n     ",
      "child_ranges": [
        "(line 6168,col 9)-(line 6170,col 9)",
        "(line 6171,col 9)-(line 6173,col 9)",
        "(line 6219,col 9)-(line 6219,col 27)",
        "(line 6220,col 9)-(line 6220,col 27)",
        "(line 6223,col 9)-(line 6227,col 9)",
        "(line 6229,col 9)-(line 6236,col 9)",
        "(line 6238,col 9)-(line 6238,col 33)",
        "(line 6239,col 9)-(line 6239,col 33)",
        "(line 6240,col 9)-(line 6240,col 17)",
        "(line 6243,col 9)-(line 6243,col 50)",
        "(line 6244,col 9)-(line 6246,col 9)",
        "(line 6249,col 9)-(line 6249,col 62)",
        "(line 6250,col 9)-(line 6250,col 42)",
        "(line 6253,col 9)-(line 6286,col 9)",
        "(line 6290,col 9)-(line 6294,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.startsWith(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 6322,
      "end_line": 6324,
      "comment": "\n     * \u003cp\u003eCheck if a CharSequence starts with a specified prefix.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null}s are handled without exceptions. Two {@code null}\n     * references are considered to be equal. The comparison is case sensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.startsWith(null, null)      \u003d true\n     * StringUtils.startsWith(null, \"abc\")     \u003d false\n     * StringUtils.startsWith(\"abcdef\", null)  \u003d false\n     * StringUtils.startsWith(\"abcdef\", \"abc\") \u003d true\n     * StringUtils.startsWith(\"ABCDEF\", \"abc\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#startsWith(String)\n     * @param str  the CharSequence to check, may be null\n     * @param prefix the prefix to find, may be null\n     * @return {@code true} if the CharSequence starts with the prefix, case sensitive, or\n     *  both {@code null}\n     * @since 2.4\n     * @since 3.0 Changed signature from startsWith(String, String) to startsWith(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 6323,col 9)-(line 6323,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 6348,
      "end_line": 6350,
      "comment": "\n     * \u003cp\u003eCase insensitive check if a CharSequence starts with a specified prefix.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null}s are handled without exceptions. Two {@code null}\n     * references are considered to be equal. The comparison is case insensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.startsWithIgnoreCase(null, null)      \u003d true\n     * StringUtils.startsWithIgnoreCase(null, \"abc\")     \u003d false\n     * StringUtils.startsWithIgnoreCase(\"abcdef\", null)  \u003d false\n     * StringUtils.startsWithIgnoreCase(\"abcdef\", \"abc\") \u003d true\n     * StringUtils.startsWithIgnoreCase(\"ABCDEF\", \"abc\") \u003d true\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#startsWith(String)\n     * @param str  the CharSequence to check, may be null\n     * @param prefix the prefix to find, may be null\n     * @return {@code true} if the CharSequence starts with the prefix, case insensitive, or\n     *  both {@code null}\n     * @since 2.4\n     * @since 3.0 Changed signature from startsWithIgnoreCase(String, String) to startsWithIgnoreCase(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 6349,col 9)-(line 6349,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.startsWith(java.lang.CharSequence, java.lang.CharSequence, boolean)",
      "begin_line": 6363,
      "end_line": 6371,
      "comment": "\n     * \u003cp\u003eCheck if a CharSequence starts with a specified prefix (optionally case insensitive).\u003c/p\u003e\n     *\n     * @see java.lang.String#startsWith(String)\n     * @param str  the CharSequence to check, may be null\n     * @param prefix the prefix to find, may be null\n     * @param ignoreCase indicates whether the compare should ignore case\n     *  (case insensitive) or not.\n     * @return {@code true} if the CharSequence starts with the prefix or\n     *  both {@code null}\n     ",
      "child_ranges": [
        "(line 6364,col 9)-(line 6366,col 9)",
        "(line 6367,col 9)-(line 6369,col 9)",
        "(line 6370,col 9)-(line 6370,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.startsWithAny(java.lang.CharSequence, java.lang.CharSequence...)",
      "begin_line": 6392,
      "end_line": 6402,
      "comment": "\n     * \u003cp\u003eCheck if a CharSequence starts with any of an array of specified strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.startsWithAny(null, null)      \u003d false\n     * StringUtils.startsWithAny(null, new String[] {\"abc\"})  \u003d false\n     * StringUtils.startsWithAny(\"abcxyz\", null)     \u003d false\n     * StringUtils.startsWithAny(\"abcxyz\", new String[] {\"\"}) \u003d false\n     * StringUtils.startsWithAny(\"abcxyz\", new String[] {\"abc\"}) \u003d true\n     * StringUtils.startsWithAny(\"abcxyz\", new String[] {null, \"xyz\", \"abc\"}) \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param string  the CharSequence to check, may be null\n     * @param searchStrings the CharSequences to find, may be null or empty\n     * @return {@code true} if the CharSequence starts with any of the the prefixes, case insensitive, or\n     *  both {@code null}\n     * @since 2.5\n     * @since 3.0 Changed signature from startsWithAny(String, String[]) to startsWithAny(CharSequence, CharSequence...)\n     ",
      "child_ranges": [
        "(line 6393,col 9)-(line 6395,col 9)",
        "(line 6396,col 9)-(line 6400,col 9)",
        "(line 6401,col 9)-(line 6401,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.endsWith(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 6430,
      "end_line": 6432,
      "comment": "\n     * \u003cp\u003eCheck if a CharSequence ends with a specified suffix.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null}s are handled without exceptions. Two {@code null}\n     * references are considered to be equal. The comparison is case sensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.endsWith(null, null)      \u003d true\n     * StringUtils.endsWith(null, \"def\")     \u003d false\n     * StringUtils.endsWith(\"abcdef\", null)  \u003d false\n     * StringUtils.endsWith(\"abcdef\", \"def\") \u003d true\n     * StringUtils.endsWith(\"ABCDEF\", \"def\") \u003d false\n     * StringUtils.endsWith(\"ABCDEF\", \"cde\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#endsWith(String)\n     * @param str  the CharSequence to check, may be null\n     * @param suffix the suffix to find, may be null\n     * @return {@code true} if the CharSequence ends with the suffix, case sensitive, or\n     *  both {@code null}\n     * @since 2.4\n     * @since 3.0 Changed signature from endsWith(String, String) to endsWith(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 6431,col 9)-(line 6431,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 6457,
      "end_line": 6459,
      "comment": "\n     * \u003cp\u003eCase insensitive check if a CharSequence ends with a specified suffix.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null}s are handled without exceptions. Two {@code null}\n     * references are considered to be equal. The comparison is case insensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.endsWithIgnoreCase(null, null)      \u003d true\n     * StringUtils.endsWithIgnoreCase(null, \"def\")     \u003d false\n     * StringUtils.endsWithIgnoreCase(\"abcdef\", null)  \u003d false\n     * StringUtils.endsWithIgnoreCase(\"abcdef\", \"def\") \u003d true\n     * StringUtils.endsWithIgnoreCase(\"ABCDEF\", \"def\") \u003d true\n     * StringUtils.endsWithIgnoreCase(\"ABCDEF\", \"cde\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#endsWith(String)\n     * @param str  the CharSequence to check, may be null\n     * @param suffix the suffix to find, may be null\n     * @return {@code true} if the CharSequence ends with the suffix, case insensitive, or\n     *  both {@code null}\n     * @since 2.4\n     * @since 3.0 Changed signature from endsWithIgnoreCase(String, String) to endsWithIgnoreCase(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 6458,col 9)-(line 6458,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.endsWith(java.lang.CharSequence, java.lang.CharSequence, boolean)",
      "begin_line": 6472,
      "end_line": 6481,
      "comment": "\n     * \u003cp\u003eCheck if a CharSequence ends with a specified suffix (optionally case insensitive).\u003c/p\u003e\n     *\n     * @see java.lang.String#endsWith(String)\n     * @param str  the CharSequence to check, may be null\n     * @param suffix the suffix to find, may be null\n     * @param ignoreCase indicates whether the compare should ignore case\n     *  (case insensitive) or not.\n     * @return {@code true} if the CharSequence starts with the prefix or\n     *  both {@code null}\n     ",
      "child_ranges": [
        "(line 6473,col 9)-(line 6475,col 9)",
        "(line 6476,col 9)-(line 6478,col 9)",
        "(line 6479,col 9)-(line 6479,col 55)",
        "(line 6480,col 9)-(line 6480,col 103)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.normalizeSpace(java.lang.String)",
      "begin_line": 6524,
      "end_line": 6529,
      "comment": "\n     * \u003cp\u003e\n     * Similar to \u003ca\n     * href\u003d\"http://www.w3.org/TR/xpath/#function-normalize-space\"\u003ehttp://www.w3.org/TR/xpath/#function-normalize\n     * -space\u003c/a\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The function returns the argument string with whitespace normalized by using\n     * \u003ccode\u003e{@link #trim(String)}\u003c/code\u003e to remove leading and trailing whitespace\n     * and then replacing sequences of whitespace characters by a single space.\n     * \u003c/p\u003e\n     * In XML Whitespace characters are the same as those allowed by the \u003ca\n     * href\u003d\"http://www.w3.org/TR/REC-xml/#NT-S\"\u003eS\u003c/a\u003e production, which is S ::\u003d (#x20 | #x9 | #xD | #xA)+\n     * \u003cp\u003e\n     * Java\u0027s regexp pattern \\s defines whitespace as [ \\t\\n\\x0B\\f\\r]\n     * \u003cp\u003e\n     * For reference:\n     * \u003cul\u003e\n     * \u003cli\u003e\\x0B \u003d vertical tab\u003c/li\u003e\n     * \u003cli\u003e\\f \u003d #xC \u003d form feed\u003c/li\u003e\n     * \u003cli\u003e#x20 \u003d space\u003c/li\u003e\n     * \u003cli\u003e#x9 \u003d \\t\u003c/li\u003e\n     * \u003cli\u003e#xA \u003d \\n\u003c/li\u003e\n     * \u003cli\u003e#xD \u003d \\r\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The difference is that Java\u0027s whitespace includes vertical tab and form feed, which this functional will also\n     * normalize. Additionally \u003ccode\u003e{@link #trim(String)}\u003c/code\u003e removes control characters (char \u0026lt;\u003d 32) from both\n     * ends of this String.\n     * \u003c/p\u003e\n     *\n     * @see Pattern\n     * @see #trim(String)\n     * @see \u003ca\n     *      href\u003d\"http://www.w3.org/TR/xpath/#function-normalize-space\"\u003ehttp://www.w3.org/TR/xpath/#function-normalize-space\u003c/a\u003e\n     * @param str the source String to normalize whitespaces from, may be null\n     * @return the modified string with whitespace normalized, {@code null} if null String input\n     *\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 6525,col 9)-(line 6527,col 9)",
        "(line 6528,col 9)-(line 6528,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.endsWithAny(java.lang.CharSequence, java.lang.CharSequence...)",
      "begin_line": 6549,
      "end_line": 6559,
      "comment": "\n     * \u003cp\u003eCheck if a CharSequence ends with any of an array of specified strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.endsWithAny(null, null)      \u003d false\n     * StringUtils.endsWithAny(null, new String[] {\"abc\"})  \u003d false\n     * StringUtils.endsWithAny(\"abcxyz\", null)     \u003d false\n     * StringUtils.endsWithAny(\"abcxyz\", new String[] {\"\"}) \u003d true\n     * StringUtils.endsWithAny(\"abcxyz\", new String[] {\"xyz\"}) \u003d true\n     * StringUtils.endsWithAny(\"abcxyz\", new String[] {null, \"xyz\", \"abc\"}) \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param string  the CharSequence to check, may be null\n     * @param searchStrings the CharSequences to find, may be null or empty\n     * @return {@code true} if the CharSequence ends with any of the the prefixes, case insensitive, or\n     *  both {@code null}\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 6550,col 9)-(line 6552,col 9)",
        "(line 6553,col 9)-(line 6557,col 9)",
        "(line 6558,col 9)-(line 6558,col 21)"
      ]
    }
  ]
}