{
  "filepath": "/tmp/Lang-12b/src/main/java/org/apache/commons/lang3/StringUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StringUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 110,
      "end_line": 6467,
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
      "begin_line": 624,
      "end_line": 632,
      "comment": " See also Lucene\u0027s ASCIIFoldingFilter (Lucene 2.9) that replaces accented characters by their unaccented equivalent (and uncommitted bug fix: https://issues.apache.org/jira/browse/LUCENE-1343?focusedCommentId\u003d12858907\u0026page\u003dcom.atlassian.jira.plugin.system.issuetabpanels%3Acomment-tabpanel#action_12858907).",
      "child_ranges": [
        "(line 625,col 9)-(line 627,col 9)",
        "(line 628,col 9)-(line 628,col 79)",
        "(line 629,col 9)-(line 629,col 77)",
        "(line 631,col 9)-(line 631,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.equals(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 657,
      "end_line": 668,
      "comment": "\n     * \u003cp\u003eCompares two CharSequences, returning {@code true} if they represent\n     * equal sequences of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null}s are handled without exceptions. Two {@code null}\n     * references are considered to be equal. The comparison is case sensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.equals(null, null)   \u003d true\n     * StringUtils.equals(null, \"abc\")  \u003d false\n     * StringUtils.equals(\"abc\", null)  \u003d false\n     * StringUtils.equals(\"abc\", \"abc\") \u003d true\n     * StringUtils.equals(\"abc\", \"ABC\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @see Object#equals(Object)\n     * @param cs1  the first CharSequence, may be {@code null}\n     * @param cs2  the second CharSequence, may be {@code null}\n     * @return {@code true} if the CharSequences are equal (case-sensitive), or both {@code null}\n     * @since 3.0 Changed signature from equals(String, String) to equals(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 658,col 9)-(line 660,col 9)",
        "(line 661,col 9)-(line 663,col 9)",
        "(line 664,col 9)-(line 666,col 9)",
        "(line 667,col 9)-(line 667,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.equalsIgnoreCase(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 691,
      "end_line": 697,
      "comment": "\n     * \u003cp\u003eCompares two CharSequences, returning {@code true} if they represent\n     * equal sequences of characters, ignoring case.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null}s are handled without exceptions. Two {@code null}\n     * references are considered equal. Comparison is case insensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.equalsIgnoreCase(null, null)   \u003d true\n     * StringUtils.equalsIgnoreCase(null, \"abc\")  \u003d false\n     * StringUtils.equalsIgnoreCase(\"abc\", null)  \u003d false\n     * StringUtils.equalsIgnoreCase(\"abc\", \"abc\") \u003d true\n     * StringUtils.equalsIgnoreCase(\"abc\", \"ABC\") \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param str1  the first CharSequence, may be null\n     * @param str2  the second CharSequence, may be null\n     * @return {@code true} if the CharSequence are equal, case insensitive, or\n     *  both {@code null}\n     * @since 3.0 Changed signature from equalsIgnoreCase(String, String) to equalsIgnoreCase(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 692,col 9)-(line 696,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOf(java.lang.CharSequence, int)",
      "begin_line": 721,
      "end_line": 726,
      "comment": "\n     * \u003cp\u003eFinds the first index within a CharSequence, handling {@code null}.\n     * This method uses {@link String#indexOf(int, int)} if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} or empty (\"\") CharSequence will return {@code INDEX_NOT_FOUND (-1)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOf(null, *)         \u003d -1\n     * StringUtils.indexOf(\"\", *)           \u003d -1\n     * StringUtils.indexOf(\"aabaabaa\", \u0027a\u0027) \u003d 0\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027) \u003d 2\n     * \u003c/pre\u003e\n     *\n     * @param seq  the CharSequence to check, may be null\n     * @param searchChar  the character to find\n     * @return the first index of the search character,\n     *  -1 if no match or {@code null} string input\n     * @since 2.0\n     * @since 3.0 Changed signature from indexOf(String, int) to indexOf(CharSequence, int)\n     ",
      "child_ranges": [
        "(line 722,col 9)-(line 724,col 9)",
        "(line 725,col 9)-(line 725,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOf(java.lang.CharSequence, int, int)",
      "begin_line": 754,
      "end_line": 759,
      "comment": "\n     * \u003cp\u003eFinds the first index within a CharSequence from a start position,\n     * handling {@code null}.\n     * This method uses {@link String#indexOf(int, int)} if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} or empty (\"\") CharSequence will return {@code (INDEX_NOT_FOUND) -1}.\n     * A negative start position is treated as zero.\n     * A start position greater than the string length returns {@code -1}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOf(null, *, *)          \u003d -1\n     * StringUtils.indexOf(\"\", *, *)            \u003d -1\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027, 0)  \u003d 2\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027, 3)  \u003d 5\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027, 9)  \u003d -1\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027, -1) \u003d 2\n     * \u003c/pre\u003e\n     *\n     * @param seq  the CharSequence to check, may be null\n     * @param searchChar  the character to find\n     * @param startPos  the start position, negative treated as zero\n     * @return the first index of the search character,\n     *  -1 if no match or {@code null} string input\n     * @since 2.0\n     * @since 3.0 Changed signature from indexOf(String, int, int) to indexOf(CharSequence, int, int)\n     ",
      "child_ranges": [
        "(line 755,col 9)-(line 757,col 9)",
        "(line 758,col 9)-(line 758,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOf(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 785,
      "end_line": 790,
      "comment": "\n     * \u003cp\u003eFinds the first index within a CharSequence, handling {@code null}.\n     * This method uses {@link String#indexOf(String, int)} if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOf(null, *)          \u003d -1\n     * StringUtils.indexOf(*, null)          \u003d -1\n     * StringUtils.indexOf(\"\", \"\")           \u003d 0\n     * StringUtils.indexOf(\"\", *)            \u003d -1 (except when * \u003d \"\")\n     * StringUtils.indexOf(\"aabaabaa\", \"a\")  \u003d 0\n     * StringUtils.indexOf(\"aabaabaa\", \"b\")  \u003d 2\n     * StringUtils.indexOf(\"aabaabaa\", \"ab\") \u003d 1\n     * StringUtils.indexOf(\"aabaabaa\", \"\")   \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param seq  the CharSequence to check, may be null\n     * @param searchSeq  the CharSequence to find, may be null\n     * @return the first index of the search CharSequence,\n     *  -1 if no match or {@code null} string input\n     * @since 2.0\n     * @since 3.0 Changed signature from indexOf(String, String) to indexOf(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 786,col 9)-(line 788,col 9)",
        "(line 789,col 9)-(line 789,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOf(java.lang.CharSequence, java.lang.CharSequence, int)",
      "begin_line": 825,
      "end_line": 830,
      "comment": "\n     * \u003cp\u003eFinds the first index within a CharSequence, handling {@code null}.\n     * This method uses {@link String#indexOf(String, int)} if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\n     * A negative start position is treated as zero.\n     * An empty (\"\") search CharSequence always matches.\n     * A start position greater than the string length only matches\n     * an empty search CharSequence.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOf(null, *, *)          \u003d -1\n     * StringUtils.indexOf(*, null, *)          \u003d -1\n     * StringUtils.indexOf(\"\", \"\", 0)           \u003d 0\n     * StringUtils.indexOf(\"\", *, 0)            \u003d -1 (except when * \u003d \"\")\n     * StringUtils.indexOf(\"aabaabaa\", \"a\", 0)  \u003d 0\n     * StringUtils.indexOf(\"aabaabaa\", \"b\", 0)  \u003d 2\n     * StringUtils.indexOf(\"aabaabaa\", \"ab\", 0) \u003d 1\n     * StringUtils.indexOf(\"aabaabaa\", \"b\", 3)  \u003d 5\n     * StringUtils.indexOf(\"aabaabaa\", \"b\", 9)  \u003d -1\n     * StringUtils.indexOf(\"aabaabaa\", \"b\", -1) \u003d 2\n     * StringUtils.indexOf(\"aabaabaa\", \"\", 2)   \u003d 2\n     * StringUtils.indexOf(\"abc\", \"\", 9)        \u003d 3\n     * \u003c/pre\u003e\n     *\n     * @param seq  the CharSequence to check, may be null\n     * @param searchSeq  the CharSequence to find, may be null\n     * @param startPos  the start position, negative treated as zero\n     * @return the first index of the search CharSequence,\n     *  -1 if no match or {@code null} string input\n     * @since 2.0\n     * @since 3.0 Changed signature from indexOf(String, String, int) to indexOf(CharSequence, CharSequence, int)\n     ",
      "child_ranges": [
        "(line 826,col 9)-(line 828,col 9)",
        "(line 829,col 9)-(line 829,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.ordinalIndexOf(java.lang.CharSequence, java.lang.CharSequence, int)",
      "begin_line": 866,
      "end_line": 868,
      "comment": "\n     * \u003cp\u003eFinds the n-th index within a CharSequence, handling {@code null}.\n     * This method uses {@link String#indexOf(String)} if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.ordinalIndexOf(null, *, *)          \u003d -1\n     * StringUtils.ordinalIndexOf(*, null, *)          \u003d -1\n     * StringUtils.ordinalIndexOf(\"\", \"\", *)           \u003d 0\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"a\", 1)  \u003d 0\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"a\", 2)  \u003d 1\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"b\", 1)  \u003d 2\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"b\", 2)  \u003d 5\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"ab\", 1) \u003d 1\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"ab\", 2) \u003d 4\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"\", 1)   \u003d 0\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"\", 2)   \u003d 0\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eNote that \u0027head(CharSequence str, int n)\u0027 may be implemented as: \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   str.substring(0, lastOrdinalIndexOf(str, \"\\n\", n))\n     * \u003c/pre\u003e\n     *\n     * @param str  the CharSequence to check, may be null\n     * @param searchStr  the CharSequence to find, may be null\n     * @param ordinal  the n-th {@code searchStr} to find\n     * @return the n-th index of the search CharSequence,\n     *  {@code -1} ({@code INDEX_NOT_FOUND}) if no match or {@code null} string input\n     * @since 2.1\n     * @since 3.0 Changed signature from ordinalIndexOf(String, String, int) to ordinalIndexOf(CharSequence, CharSequence, int)\n     ",
      "child_ranges": [
        "(line 867,col 9)-(line 867,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.ordinalIndexOf(java.lang.CharSequence, java.lang.CharSequence, int, boolean)",
      "begin_line": 884,
      "end_line": 905,
      "comment": " Shared code between ordinalIndexOf(String,String,int) and lastOrdinalIndexOf(String,String,int)",
      "child_ranges": [
        "(line 885,col 9)-(line 887,col 9)",
        "(line 888,col 9)-(line 890,col 9)",
        "(line 891,col 9)-(line 891,col 22)",
        "(line 892,col 9)-(line 892,col 63)",
        "(line 893,col 9)-(line 903,col 34)",
        "(line 904,col 9)-(line 904,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 932,
      "end_line": 934,
      "comment": "\n     * \u003cp\u003eCase in-sensitive find of the first index within a CharSequence.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\n     * A negative start position is treated as zero.\n     * An empty (\"\") search CharSequence always matches.\n     * A start position greater than the string length only matches\n     * an empty search CharSequence.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfIgnoreCase(null, *)          \u003d -1\n     * StringUtils.indexOfIgnoreCase(*, null)          \u003d -1\n     * StringUtils.indexOfIgnoreCase(\"\", \"\")           \u003d 0\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"a\")  \u003d 0\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"b\")  \u003d 2\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"ab\") \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @param str  the CharSequence to check, may be null\n     * @param searchStr  the CharSequence to find, may be null\n     * @return the first index of the search CharSequence,\n     *  -1 if no match or {@code null} string input\n     * @since 2.5\n     * @since 3.0 Changed signature from indexOfIgnoreCase(String, String) to indexOfIgnoreCase(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 933,col 9)-(line 933,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(java.lang.CharSequence, java.lang.CharSequence, int)",
      "begin_line": 968,
      "end_line": 988,
      "comment": "\n     * \u003cp\u003eCase in-sensitive find of the first index within a CharSequence\n     * from the specified position.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\n     * A negative start position is treated as zero.\n     * An empty (\"\") search CharSequence always matches.\n     * A start position greater than the string length only matches\n     * an empty search CharSequence.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfIgnoreCase(null, *, *)          \u003d -1\n     * StringUtils.indexOfIgnoreCase(*, null, *)          \u003d -1\n     * StringUtils.indexOfIgnoreCase(\"\", \"\", 0)           \u003d 0\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"A\", 0)  \u003d 0\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"B\", 0)  \u003d 2\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"AB\", 0) \u003d 1\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"B\", 3)  \u003d 5\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"B\", 9)  \u003d -1\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"B\", -1) \u003d 2\n     * StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"\", 2)   \u003d 2\n     * StringUtils.indexOfIgnoreCase(\"abc\", \"\", 9)        \u003d 3\n     * \u003c/pre\u003e\n     *\n     * @param str  the CharSequence to check, may be null\n     * @param searchStr  the CharSequence to find, may be null\n     * @param startPos  the start position, negative treated as zero\n     * @return the first index of the search CharSequence,\n     *  -1 if no match or {@code null} string input\n     * @since 2.5\n     * @since 3.0 Changed signature from indexOfIgnoreCase(String, String, int) to indexOfIgnoreCase(CharSequence, CharSequence, int)\n     ",
      "child_ranges": [
        "(line 969,col 9)-(line 971,col 9)",
        "(line 972,col 9)-(line 974,col 9)",
        "(line 975,col 9)-(line 975,col 61)",
        "(line 976,col 9)-(line 978,col 9)",
        "(line 979,col 9)-(line 981,col 9)",
        "(line 982,col 9)-(line 986,col 9)",
        "(line 987,col 9)-(line 987,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastIndexOf(java.lang.CharSequence, int)",
      "begin_line": 1012,
      "end_line": 1017,
      "comment": "\n     * \u003cp\u003eFinds the last index within a CharSequence, handling {@code null}.\n     * This method uses {@link String#lastIndexOf(int)} if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} or empty (\"\") CharSequence will return {@code -1}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOf(null, *)         \u003d -1\n     * StringUtils.lastIndexOf(\"\", *)           \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027a\u0027) \u003d 7\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027) \u003d 5\n     * \u003c/pre\u003e\n     *\n     * @param seq  the CharSequence to check, may be null\n     * @param searchChar  the character to find\n     * @return the last index of the search character,\n     *  -1 if no match or {@code null} string input\n     * @since 2.0\n     * @since 3.0 Changed signature from lastIndexOf(String, int) to lastIndexOf(CharSequence, int)\n     ",
      "child_ranges": [
        "(line 1013,col 9)-(line 1015,col 9)",
        "(line 1016,col 9)-(line 1016,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastIndexOf(java.lang.CharSequence, int, int)",
      "begin_line": 1047,
      "end_line": 1052,
      "comment": "\n     * \u003cp\u003eFinds the last index within a CharSequence from a start position,\n     * handling {@code null}.\n     * This method uses {@link String#lastIndexOf(int, int)} if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} or empty (\"\") CharSequence will return {@code -1}.\n     * A negative start position returns {@code -1}.\n     * A start position greater than the string length searches the whole string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOf(null, *, *)          \u003d -1\n     * StringUtils.lastIndexOf(\"\", *,  *)           \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, 8)  \u003d 5\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, 4)  \u003d 2\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, 0)  \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, 9)  \u003d 5\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, -1) \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027a\u0027, 0)  \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param seq  the CharSequence to check, may be null\n     * @param searchChar  the character to find\n     * @param startPos  the start position\n     * @return the last index of the search character,\n     *  -1 if no match or {@code null} string input\n     * @since 2.0\n     * @since 3.0 Changed signature from lastIndexOf(String, int, int) to lastIndexOf(CharSequence, int, int)\n     ",
      "child_ranges": [
        "(line 1048,col 9)-(line 1050,col 9)",
        "(line 1051,col 9)-(line 1051,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastIndexOf(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 1077,
      "end_line": 1082,
      "comment": "\n     * \u003cp\u003eFinds the last index within a CharSequence, handling {@code null}.\n     * This method uses {@link String#lastIndexOf(String)} if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOf(null, *)          \u003d -1\n     * StringUtils.lastIndexOf(*, null)          \u003d -1\n     * StringUtils.lastIndexOf(\"\", \"\")           \u003d 0\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"a\")  \u003d 7\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\")  \u003d 5\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"ab\") \u003d 4\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"\")   \u003d 8\n     * \u003c/pre\u003e\n     *\n     * @param seq  the CharSequence to check, may be null\n     * @param searchSeq  the CharSequence to find, may be null\n     * @return the last index of the search String,\n     *  -1 if no match or {@code null} string input\n     * @since 2.0\n     * @since 3.0 Changed signature from lastIndexOf(String, String) to lastIndexOf(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 1078,col 9)-(line 1080,col 9)",
        "(line 1081,col 9)-(line 1081,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf(java.lang.CharSequence, java.lang.CharSequence, int)",
      "begin_line": 1118,
      "end_line": 1120,
      "comment": "\n     * \u003cp\u003eFinds the n-th last index within a String, handling {@code null}.\n     * This method uses {@link String#lastIndexOf(String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} String will return {@code -1}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastOrdinalIndexOf(null, *, *)          \u003d -1\n     * StringUtils.lastOrdinalIndexOf(*, null, *)          \u003d -1\n     * StringUtils.lastOrdinalIndexOf(\"\", \"\", *)           \u003d 0\n     * StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"a\", 1)  \u003d 7\n     * StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"a\", 2)  \u003d 6\n     * StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"b\", 1)  \u003d 5\n     * StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"b\", 2)  \u003d 2\n     * StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"ab\", 1) \u003d 4\n     * StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"ab\", 2) \u003d 1\n     * StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"\", 1)   \u003d 8\n     * StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"\", 2)   \u003d 8\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eNote that \u0027tail(CharSequence str, int n)\u0027 may be implemented as: \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *   str.substring(lastOrdinalIndexOf(str, \"\\n\", n) + 1)\n     * \u003c/pre\u003e\n     *\n     * @param str  the CharSequence to check, may be null\n     * @param searchStr  the CharSequence to find, may be null\n     * @param ordinal  the n-th last {@code searchStr} to find\n     * @return the n-th last index of the search CharSequence,\n     *  {@code -1} ({@code INDEX_NOT_FOUND}) if no match or {@code null} string input\n     * @since 2.5\n     * @since 3.0 Changed signature from lastOrdinalIndexOf(String, String, int) to lastOrdinalIndexOf(CharSequence, CharSequence, int)\n     ",
      "child_ranges": [
        "(line 1119,col 9)-(line 1119,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastIndexOf(java.lang.CharSequence, java.lang.CharSequence, int)",
      "begin_line": 1151,
      "end_line": 1156,
      "comment": "\n     * \u003cp\u003eFinds the first index within a CharSequence, handling {@code null}.\n     * This method uses {@link String#lastIndexOf(String, int)} if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\n     * A negative start position returns {@code -1}.\n     * An empty (\"\") search CharSequence always matches unless the start position is negative.\n     * A start position greater than the string length searches the whole string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOf(null, *, *)          \u003d -1\n     * StringUtils.lastIndexOf(*, null, *)          \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"a\", 8)  \u003d 7\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\", 8)  \u003d 5\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"ab\", 8) \u003d 4\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\", 9)  \u003d 5\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\", -1) \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"a\", 0)  \u003d 0\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\", 0)  \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param seq  the CharSequence to check, may be null\n     * @param searchSeq  the CharSequence to find, may be null\n     * @param startPos  the start position, negative treated as zero\n     * @return the first index of the search CharSequence,\n     *  -1 if no match or {@code null} string input\n     * @since 2.0\n     * @since 3.0 Changed signature from lastIndexOf(String, String, int) to lastIndexOf(CharSequence, CharSequence, int)\n     ",
      "child_ranges": [
        "(line 1152,col 9)-(line 1154,col 9)",
        "(line 1155,col 9)-(line 1155,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 1181,
      "end_line": 1186,
      "comment": "\n     * \u003cp\u003eCase in-sensitive find of the last index within a CharSequence.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\n     * A negative start position returns {@code -1}.\n     * An empty (\"\") search CharSequence always matches unless the start position is negative.\n     * A start position greater than the string length searches the whole string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOfIgnoreCase(null, *)          \u003d -1\n     * StringUtils.lastIndexOfIgnoreCase(*, null)          \u003d -1\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"A\")  \u003d 7\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"B\")  \u003d 5\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"AB\") \u003d 4\n     * \u003c/pre\u003e\n     *\n     * @param str  the CharSequence to check, may be null\n     * @param searchStr  the CharSequence to find, may be null\n     * @return the first index of the search CharSequence,\n     *  -1 if no match or {@code null} string input\n     * @since 2.5\n     * @since 3.0 Changed signature from lastIndexOfIgnoreCase(String, String) to lastIndexOfIgnoreCase(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 1182,col 9)-(line 1184,col 9)",
        "(line 1185,col 9)-(line 1185,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(java.lang.CharSequence, java.lang.CharSequence, int)",
      "begin_line": 1217,
      "end_line": 1237,
      "comment": "\n     * \u003cp\u003eCase in-sensitive find of the last index within a CharSequence\n     * from the specified position.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\n     * A negative start position returns {@code -1}.\n     * An empty (\"\") search CharSequence always matches unless the start position is negative.\n     * A start position greater than the string length searches the whole string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOfIgnoreCase(null, *, *)          \u003d -1\n     * StringUtils.lastIndexOfIgnoreCase(*, null, *)          \u003d -1\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"A\", 8)  \u003d 7\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"B\", 8)  \u003d 5\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"AB\", 8) \u003d 4\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"B\", 9)  \u003d 5\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"B\", -1) \u003d -1\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"A\", 0)  \u003d 0\n     * StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"B\", 0)  \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param str  the CharSequence to check, may be null\n     * @param searchStr  the CharSequence to find, may be null\n     * @param startPos  the start position\n     * @return the first index of the search CharSequence,\n     *  -1 if no match or {@code null} input\n     * @since 2.5\n     * @since 3.0 Changed signature from lastIndexOfIgnoreCase(String, String, int) to lastIndexOfIgnoreCase(CharSequence, CharSequence, int)\n     ",
      "child_ranges": [
        "(line 1218,col 9)-(line 1220,col 9)",
        "(line 1221,col 9)-(line 1223,col 9)",
        "(line 1224,col 9)-(line 1226,col 9)",
        "(line 1227,col 9)-(line 1229,col 9)",
        "(line 1231,col 9)-(line 1235,col 9)",
        "(line 1236,col 9)-(line 1236,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.contains(java.lang.CharSequence, int)",
      "begin_line": 1261,
      "end_line": 1266,
      "comment": "\n     * \u003cp\u003eChecks if CharSequence contains a search character, handling {@code null}.\n     * This method uses {@link String#indexOf(int)} if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} or empty (\"\") CharSequence will return {@code false}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.contains(null, *)    \u003d false\n     * StringUtils.contains(\"\", *)      \u003d false\n     * StringUtils.contains(\"abc\", \u0027a\u0027) \u003d true\n     * StringUtils.contains(\"abc\", \u0027z\u0027) \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param seq  the CharSequence to check, may be null\n     * @param searchChar  the character to find\n     * @return true if the CharSequence contains the search character,\n     *  false if not or {@code null} string input\n     * @since 2.0\n     * @since 3.0 Changed signature from contains(String, int) to contains(CharSequence, int)\n     ",
      "child_ranges": [
        "(line 1262,col 9)-(line 1264,col 9)",
        "(line 1265,col 9)-(line 1265,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.contains(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 1290,
      "end_line": 1295,
      "comment": "\n     * \u003cp\u003eChecks if CharSequence contains a search CharSequence, handling {@code null}.\n     * This method uses {@link String#indexOf(String)} if possible.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code false}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.contains(null, *)     \u003d false\n     * StringUtils.contains(*, null)     \u003d false\n     * StringUtils.contains(\"\", \"\")      \u003d true\n     * StringUtils.contains(\"abc\", \"\")   \u003d true\n     * StringUtils.contains(\"abc\", \"a\")  \u003d true\n     * StringUtils.contains(\"abc\", \"z\")  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param seq  the CharSequence to check, may be null\n     * @param searchSeq  the CharSequence to find, may be null\n     * @return true if the CharSequence contains the search CharSequence,\n     *  false if not or {@code null} string input\n     * @since 2.0\n     * @since 3.0 Changed signature from contains(String, String) to contains(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 1291,col 9)-(line 1293,col 9)",
        "(line 1294,col 9)-(line 1294,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsIgnoreCase(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 1321,
      "end_line": 1333,
      "comment": "\n     * \u003cp\u003eChecks if CharSequence contains a search CharSequence irrespective of case,\n     * handling {@code null}. Case-insensitivity is defined as by\n     * {@link String#equalsIgnoreCase(String)}.\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code false}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.contains(null, *) \u003d false\n     * StringUtils.contains(*, null) \u003d false\n     * StringUtils.contains(\"\", \"\") \u003d true\n     * StringUtils.contains(\"abc\", \"\") \u003d true\n     * StringUtils.contains(\"abc\", \"a\") \u003d true\n     * StringUtils.contains(\"abc\", \"z\") \u003d false\n     * StringUtils.contains(\"abc\", \"A\") \u003d true\n     * StringUtils.contains(\"abc\", \"Z\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the CharSequence to check, may be null\n     * @param searchStr  the CharSequence to find, may be null\n     * @return true if the CharSequence contains the search CharSequence irrespective of\n     * case or false if not or {@code null} string input\n     * @since 3.0 Changed signature from containsIgnoreCase(String, String) to containsIgnoreCase(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 1322,col 9)-(line 1324,col 9)",
        "(line 1325,col 9)-(line 1325,col 37)",
        "(line 1326,col 9)-(line 1326,col 37)",
        "(line 1327,col 9)-(line 1331,col 9)",
        "(line 1332,col 9)-(line 1332,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsWhitespace(java.lang.CharSequence)",
      "begin_line": 1344,
      "end_line": 1355,
      "comment": " From org.springframework.util.StringUtils, under Apache License 2.0",
      "child_ranges": [
        "(line 1345,col 9)-(line 1347,col 9)",
        "(line 1348,col 9)-(line 1348,col 34)",
        "(line 1349,col 9)-(line 1353,col 9)",
        "(line 1354,col 9)-(line 1354,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfAny(java.lang.CharSequence, char...)",
      "begin_line": 1382,
      "end_line": 1406,
      "comment": "\n     * \u003cp\u003eSearch a CharSequence to find the first index of any\n     * character in the given set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} String will return {@code -1}.\n     * A {@code null} or zero length search array will return {@code -1}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAny(null, *)                \u003d -1\n     * StringUtils.indexOfAny(\"\", *)                  \u003d -1\n     * StringUtils.indexOfAny(*, null)                \u003d -1\n     * StringUtils.indexOfAny(*, [])                  \u003d -1\n     * StringUtils.indexOfAny(\"zzabyycdxx\",[\u0027z\u0027,\u0027a\u0027]) \u003d 0\n     * StringUtils.indexOfAny(\"zzabyycdxx\",[\u0027b\u0027,\u0027y\u0027]) \u003d 3\n     * StringUtils.indexOfAny(\"aba\", [\u0027z\u0027])           \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the index of any of the chars, -1 if no match or null input\n     * @since 2.0\n     * @since 3.0 Changed signature from indexOfAny(String, char[]) to indexOfAny(CharSequence, char...)\n     ",
      "child_ranges": [
        "(line 1383,col 9)-(line 1385,col 9)",
        "(line 1386,col 9)-(line 1386,col 32)",
        "(line 1387,col 9)-(line 1387,col 31)",
        "(line 1388,col 9)-(line 1388,col 43)",
        "(line 1389,col 9)-(line 1389,col 39)",
        "(line 1390,col 9)-(line 1404,col 9)",
        "(line 1405,col 9)-(line 1405,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfAny(java.lang.CharSequence, java.lang.String)",
      "begin_line": 1431,
      "end_line": 1436,
      "comment": "\n     * \u003cp\u003eSearch a CharSequence to find the first index of any\n     * character in the given set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} String will return {@code -1}.\n     * A {@code null} search string will return {@code -1}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAny(null, *)            \u003d -1\n     * StringUtils.indexOfAny(\"\", *)              \u003d -1\n     * StringUtils.indexOfAny(*, null)            \u003d -1\n     * StringUtils.indexOfAny(*, \"\")              \u003d -1\n     * StringUtils.indexOfAny(\"zzabyycdxx\", \"za\") \u003d 0\n     * StringUtils.indexOfAny(\"zzabyycdxx\", \"by\") \u003d 3\n     * StringUtils.indexOfAny(\"aba\",\"z\")          \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the index of any of the chars, -1 if no match or null input\n     * @since 2.0\n     * @since 3.0 Changed signature from indexOfAny(String, String) to indexOfAny(CharSequence, String)\n     ",
      "child_ranges": [
        "(line 1432,col 9)-(line 1434,col 9)",
        "(line 1435,col 9)-(line 1435,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsAny(java.lang.CharSequence, char...)",
      "begin_line": 1464,
      "end_line": 1492,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains any character in the given\n     * set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code false}.\n     * A {@code null} or zero length search array will return {@code false}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsAny(null, *)                \u003d false\n     * StringUtils.containsAny(\"\", *)                  \u003d false\n     * StringUtils.containsAny(*, null)                \u003d false\n     * StringUtils.containsAny(*, [])                  \u003d false\n     * StringUtils.containsAny(\"zzabyycdxx\",[\u0027z\u0027,\u0027a\u0027]) \u003d true\n     * StringUtils.containsAny(\"zzabyycdxx\",[\u0027b\u0027,\u0027y\u0027]) \u003d true\n     * StringUtils.containsAny(\"aba\", [\u0027z\u0027])           \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the {@code true} if any of the chars are found,\n     * {@code false} if no match or null input\n     * @since 2.4\n     * @since 3.0 Changed signature from containsAny(String, char[]) to containsAny(CharSequence, char...)\n     ",
      "child_ranges": [
        "(line 1465,col 9)-(line 1467,col 9)",
        "(line 1468,col 9)-(line 1468,col 35)",
        "(line 1469,col 9)-(line 1469,col 46)",
        "(line 1470,col 9)-(line 1470,col 34)",
        "(line 1471,col 9)-(line 1471,col 42)",
        "(line 1472,col 9)-(line 1490,col 9)",
        "(line 1491,col 9)-(line 1491,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsAny(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 1522,
      "end_line": 1527,
      "comment": "\n     * \u003cp\u003e\n     * Checks if the CharSequence contains any character in the given set of characters.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * A {@code null} CharSequence will return {@code false}. A {@code null} search CharSequence will return\n     * {@code false}.\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsAny(null, *)            \u003d false\n     * StringUtils.containsAny(\"\", *)              \u003d false\n     * StringUtils.containsAny(*, null)            \u003d false\n     * StringUtils.containsAny(*, \"\")              \u003d false\n     * StringUtils.containsAny(\"zzabyycdxx\", \"za\") \u003d true\n     * StringUtils.containsAny(\"zzabyycdxx\", \"by\") \u003d true\n     * StringUtils.containsAny(\"aba\",\"z\")          \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs\n     *            the CharSequence to check, may be null\n     * @param searchChars\n     *            the chars to search for, may be null\n     * @return the {@code true} if any of the chars are found, {@code false} if no match or null input\n     * @since 2.4\n     * @since 3.0 Changed signature from containsAny(String, String) to containsAny(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 1523,col 9)-(line 1525,col 9)",
        "(line 1526,col 9)-(line 1526,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfAnyBut(java.lang.CharSequence, char...)",
      "begin_line": 1555,
      "end_line": 1580,
      "comment": "\n     * \u003cp\u003eSearches a CharSequence to find the first index of any\n     * character not in the given set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\n     * A {@code null} or zero length search array will return {@code -1}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAnyBut(null, *)                              \u003d -1\n     * StringUtils.indexOfAnyBut(\"\", *)                                \u003d -1\n     * StringUtils.indexOfAnyBut(*, null)                              \u003d -1\n     * StringUtils.indexOfAnyBut(*, [])                                \u003d -1\n     * StringUtils.indexOfAnyBut(\"zzabyycdxx\", new char[] {\u0027z\u0027, \u0027a\u0027} ) \u003d 3\n     * StringUtils.indexOfAnyBut(\"aba\", new char[] {\u0027z\u0027} )             \u003d 0\n     * StringUtils.indexOfAnyBut(\"aba\", new char[] {\u0027a\u0027, \u0027b\u0027} )        \u003d -1\n\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the index of any of the chars, -1 if no match or null input\n     * @since 2.0\n     * @since 3.0 Changed signature from indexOfAnyBut(String, char[]) to indexOfAnyBut(CharSequence, char...)\n     ",
      "child_ranges": [
        "(line 1556,col 9)-(line 1558,col 9)",
        "(line 1559,col 9)-(line 1559,col 32)",
        "(line 1560,col 9)-(line 1560,col 31)",
        "(line 1561,col 9)-(line 1561,col 43)",
        "(line 1562,col 9)-(line 1562,col 39)",
        "(line 1563,col 9)-(line 1578,col 9)",
        "(line 1579,col 9)-(line 1579,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfAnyBut(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 1605,
      "end_line": 1625,
      "comment": "\n     * \u003cp\u003eSearch a CharSequence to find the first index of any\n     * character not in the given set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\n     * A {@code null} or empty search string will return {@code -1}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAnyBut(null, *)            \u003d -1\n     * StringUtils.indexOfAnyBut(\"\", *)              \u003d -1\n     * StringUtils.indexOfAnyBut(*, null)            \u003d -1\n     * StringUtils.indexOfAnyBut(*, \"\")              \u003d -1\n     * StringUtils.indexOfAnyBut(\"zzabyycdxx\", \"za\") \u003d 3\n     * StringUtils.indexOfAnyBut(\"zzabyycdxx\", \"\")   \u003d -1\n     * StringUtils.indexOfAnyBut(\"aba\",\"ab\")         \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param seq  the CharSequence to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the index of any of the chars, -1 if no match or null input\n     * @since 2.0\n     * @since 3.0 Changed signature from indexOfAnyBut(String, String) to indexOfAnyBut(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 1606,col 9)-(line 1608,col 9)",
        "(line 1609,col 9)-(line 1609,col 34)",
        "(line 1610,col 9)-(line 1623,col 9)",
        "(line 1624,col 9)-(line 1624,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsOnly(java.lang.CharSequence, char...)",
      "begin_line": 1651,
      "end_line": 1663,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only certain characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code false}.\n     * A {@code null} valid character array will return {@code false}.\n     * An empty CharSequence (length()\u003d0) always returns {@code true}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsOnly(null, *)       \u003d false\n     * StringUtils.containsOnly(*, null)       \u003d false\n     * StringUtils.containsOnly(\"\", *)         \u003d true\n     * StringUtils.containsOnly(\"ab\", \u0027\u0027)      \u003d false\n     * StringUtils.containsOnly(\"abab\", \u0027abc\u0027) \u003d true\n     * StringUtils.containsOnly(\"ab1\", \u0027abc\u0027)  \u003d false\n     * StringUtils.containsOnly(\"abz\", \u0027abc\u0027)  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the String to check, may be null\n     * @param valid  an array of valid chars, may be null\n     * @return true if it only contains valid chars and is non-null\n     * @since 3.0 Changed signature from containsOnly(String, char[]) to containsOnly(CharSequence, char...)\n     ",
      "child_ranges": [
        "(line 1653,col 9)-(line 1655,col 9)",
        "(line 1656,col 9)-(line 1658,col 9)",
        "(line 1659,col 9)-(line 1661,col 9)",
        "(line 1662,col 9)-(line 1662,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsOnly(java.lang.CharSequence, java.lang.String)",
      "begin_line": 1688,
      "end_line": 1693,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only certain characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code false}.\n     * A {@code null} valid character String will return {@code false}.\n     * An empty String (length()\u003d0) always returns {@code true}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsOnly(null, *)       \u003d false\n     * StringUtils.containsOnly(*, null)       \u003d false\n     * StringUtils.containsOnly(\"\", *)         \u003d true\n     * StringUtils.containsOnly(\"ab\", \"\")      \u003d false\n     * StringUtils.containsOnly(\"abab\", \"abc\") \u003d true\n     * StringUtils.containsOnly(\"ab1\", \"abc\")  \u003d false\n     * StringUtils.containsOnly(\"abz\", \"abc\")  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @param validChars  a String of valid chars, may be null\n     * @return true if it only contains valid chars and is non-null\n     * @since 2.0\n     * @since 3.0 Changed signature from containsOnly(String, String) to containsOnly(CharSequence, String)\n     ",
      "child_ranges": [
        "(line 1689,col 9)-(line 1691,col 9)",
        "(line 1692,col 9)-(line 1692,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsNone(java.lang.CharSequence, char...)",
      "begin_line": 1720,
      "end_line": 1748,
      "comment": "\n     * \u003cp\u003eChecks that the CharSequence does not contain certain characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code true}.\n     * A {@code null} invalid character array will return {@code true}.\n     * An empty CharSequence (length()\u003d0) always returns true.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsNone(null, *)       \u003d true\n     * StringUtils.containsNone(*, null)       \u003d true\n     * StringUtils.containsNone(\"\", *)         \u003d true\n     * StringUtils.containsNone(\"ab\", \u0027\u0027)      \u003d true\n     * StringUtils.containsNone(\"abab\", \u0027xyz\u0027) \u003d true\n     * StringUtils.containsNone(\"ab1\", \u0027xyz\u0027)  \u003d true\n     * StringUtils.containsNone(\"abz\", \u0027xyz\u0027)  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @param searchChars  an array of invalid chars, may be null\n     * @return true if it contains none of the invalid chars, or is null\n     * @since 2.0\n     * @since 3.0 Changed signature from containsNone(String, char[]) to containsNone(CharSequence, char...)\n     ",
      "child_ranges": [
        "(line 1721,col 9)-(line 1723,col 9)",
        "(line 1724,col 9)-(line 1724,col 32)",
        "(line 1725,col 9)-(line 1725,col 31)",
        "(line 1726,col 9)-(line 1726,col 43)",
        "(line 1727,col 9)-(line 1727,col 39)",
        "(line 1728,col 9)-(line 1746,col 9)",
        "(line 1747,col 9)-(line 1747,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.containsNone(java.lang.CharSequence, java.lang.String)",
      "begin_line": 1773,
      "end_line": 1778,
      "comment": "\n     * \u003cp\u003eChecks that the CharSequence does not contain certain characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code true}.\n     * A {@code null} invalid character array will return {@code true}.\n     * An empty String (\"\") always returns true.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsNone(null, *)       \u003d true\n     * StringUtils.containsNone(*, null)       \u003d true\n     * StringUtils.containsNone(\"\", *)         \u003d true\n     * StringUtils.containsNone(\"ab\", \"\")      \u003d true\n     * StringUtils.containsNone(\"abab\", \"xyz\") \u003d true\n     * StringUtils.containsNone(\"ab1\", \"xyz\")  \u003d true\n     * StringUtils.containsNone(\"abz\", \"xyz\")  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @param invalidChars  a String of invalid chars, may be null\n     * @return true if it contains none of the invalid chars, or is null\n     * @since 2.0\n     * @since 3.0 Changed signature from containsNone(String, String) to containsNone(CharSequence, String)\n     ",
      "child_ranges": [
        "(line 1774,col 9)-(line 1776,col 9)",
        "(line 1777,col 9)-(line 1777,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfAny(java.lang.CharSequence, java.lang.CharSequence...)",
      "begin_line": 1809,
      "end_line": 1835,
      "comment": "\n     * \u003cp\u003eFind the first index of any of a set of potential substrings.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\n     * A {@code null} or zero length search array will return {@code -1}.\n     * A {@code null} search array entry will be ignored, but a search\n     * array containing \"\" will return {@code 0} if {@code str} is not\n     * null. This method uses {@link String#indexOf(String)} if possible.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAny(null, *)                     \u003d -1\n     * StringUtils.indexOfAny(*, null)                     \u003d -1\n     * StringUtils.indexOfAny(*, [])                       \u003d -1\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"ab\",\"cd\"])   \u003d 2\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"cd\",\"ab\"])   \u003d 2\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"mn\",\"op\"])   \u003d -1\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"zab\",\"aby\"]) \u003d 1\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"\"])          \u003d 0\n     * StringUtils.indexOfAny(\"\", [\"\"])                    \u003d 0\n     * StringUtils.indexOfAny(\"\", [\"a\"])                   \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param str  the CharSequence to check, may be null\n     * @param searchStrs  the CharSequences to search for, may be null\n     * @return the first index of any of the searchStrs in str, -1 if no match\n     * @since 3.0 Changed signature from indexOfAny(String, String[]) to indexOfAny(CharSequence, CharSequence...)\n     ",
      "child_ranges": [
        "(line 1810,col 9)-(line 1812,col 9)",
        "(line 1813,col 9)-(line 1813,col 35)",
        "(line 1816,col 9)-(line 1816,col 36)",
        "(line 1818,col 9)-(line 1818,col 20)",
        "(line 1819,col 9)-(line 1832,col 9)",
        "(line 1834,col 9)-(line 1834,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lastIndexOfAny(java.lang.CharSequence, java.lang.CharSequence...)",
      "begin_line": 1863,
      "end_line": 1881,
      "comment": "\n     * \u003cp\u003eFind the latest index of any of a set of potential substrings.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} CharSequence will return {@code -1}.\n     * A {@code null} search array will return {@code -1}.\n     * A {@code null} or zero length search array entry will be ignored,\n     * but a search array containing \"\" will return the length of {@code str}\n     * if {@code str} is not null. This method uses {@link String#indexOf(String)} if possible\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOfAny(null, *)                   \u003d -1\n     * StringUtils.lastIndexOfAny(*, null)                   \u003d -1\n     * StringUtils.lastIndexOfAny(*, [])                     \u003d -1\n     * StringUtils.lastIndexOfAny(*, [null])                 \u003d -1\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"ab\",\"cd\"]) \u003d 6\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"cd\",\"ab\"]) \u003d 6\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"mn\",\"op\"]) \u003d -1\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"mn\",\"op\"]) \u003d -1\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"mn\",\"\"])   \u003d 10\n     * \u003c/pre\u003e\n     *\n     * @param str  the CharSequence to check, may be null\n     * @param searchStrs  the CharSequences to search for, may be null\n     * @return the last index of any of the CharSequences, -1 if no match\n     * @since 3.0 Changed signature from lastIndexOfAny(String, String[]) to lastIndexOfAny(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 1864,col 9)-(line 1866,col 9)",
        "(line 1867,col 9)-(line 1867,col 35)",
        "(line 1868,col 9)-(line 1868,col 34)",
        "(line 1869,col 9)-(line 1869,col 20)",
        "(line 1870,col 9)-(line 1879,col 9)",
        "(line 1880,col 9)-(line 1880,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substring(java.lang.String, int)",
      "begin_line": 1909,
      "end_line": 1927,
      "comment": "\n     * \u003cp\u003eGets a substring from the specified String avoiding exceptions.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative start position can be used to start {@code n}\n     * characters from the end of the String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} String will return {@code null}.\n     * An empty (\"\") String will return \"\".\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substring(null, *)   \u003d null\n     * StringUtils.substring(\"\", *)     \u003d \"\"\n     * StringUtils.substring(\"abc\", 0)  \u003d \"abc\"\n     * StringUtils.substring(\"abc\", 2)  \u003d \"c\"\n     * StringUtils.substring(\"abc\", 4)  \u003d \"\"\n     * StringUtils.substring(\"abc\", -2) \u003d \"bc\"\n     * StringUtils.substring(\"abc\", -4) \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the substring from, may be null\n     * @param start  the position to start from, negative means\n     *  count back from the end of the String by this many characters\n     * @return substring from start position, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 1910,col 9)-(line 1912,col 9)",
        "(line 1915,col 9)-(line 1917,col 9)",
        "(line 1919,col 9)-(line 1921,col 9)",
        "(line 1922,col 9)-(line 1924,col 9)",
        "(line 1926,col 9)-(line 1926,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substring(java.lang.String, int, int)",
      "begin_line": 1964,
      "end_line": 1995,
      "comment": "\n     * \u003cp\u003eGets a substring from the specified String avoiding exceptions.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative start position can be used to start/end {@code n}\n     * characters from the end of the String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe returned substring starts with the character in the {@code start}\n     * position and ends before the {@code end} position. All position counting is\n     * zero-based -- i.e., to start at the beginning of the string use\n     * {@code start \u003d 0}. Negative start and end positions can be used to\n     * specify offsets relative to the end of the String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf {@code start} is not strictly to the left of {@code end}, \"\"\n     * is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substring(null, *, *)    \u003d null\n     * StringUtils.substring(\"\", * ,  *)    \u003d \"\";\n     * StringUtils.substring(\"abc\", 0, 2)   \u003d \"ab\"\n     * StringUtils.substring(\"abc\", 2, 0)   \u003d \"\"\n     * StringUtils.substring(\"abc\", 2, 4)   \u003d \"c\"\n     * StringUtils.substring(\"abc\", 4, 6)   \u003d \"\"\n     * StringUtils.substring(\"abc\", 2, 2)   \u003d \"\"\n     * StringUtils.substring(\"abc\", -2, -1) \u003d \"b\"\n     * StringUtils.substring(\"abc\", -4, 2)  \u003d \"ab\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the substring from, may be null\n     * @param start  the position to start from, negative means\n     *  count back from the end of the String by this many characters\n     * @param end  the position to end at (exclusive), negative means\n     *  count back from the end of the String by this many characters\n     * @return substring from start position to end position,\n     *  {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 1965,col 9)-(line 1967,col 9)",
        "(line 1970,col 9)-(line 1972,col 9)",
        "(line 1973,col 9)-(line 1975,col 9)",
        "(line 1978,col 9)-(line 1980,col 9)",
        "(line 1983,col 9)-(line 1985,col 9)",
        "(line 1987,col 9)-(line 1989,col 9)",
        "(line 1990,col 9)-(line 1992,col 9)",
        "(line 1994,col 9)-(line 1994,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.left(java.lang.String, int)",
      "begin_line": 2019,
      "end_line": 2030,
      "comment": "\n     * \u003cp\u003eGets the leftmost {@code len} characters of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf {@code len} characters are not available, or the\n     * String is {@code null}, the String will be returned without\n     * an exception. An empty String is returned if len is negative.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.left(null, *)    \u003d null\n     * StringUtils.left(*, -ve)     \u003d \"\"\n     * StringUtils.left(\"\", *)      \u003d \"\"\n     * StringUtils.left(\"abc\", 0)   \u003d \"\"\n     * StringUtils.left(\"abc\", 2)   \u003d \"ab\"\n     * StringUtils.left(\"abc\", 4)   \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the leftmost characters from, may be null\n     * @param len  the length of the required String\n     * @return the leftmost characters, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 2020,col 9)-(line 2022,col 9)",
        "(line 2023,col 9)-(line 2025,col 9)",
        "(line 2026,col 9)-(line 2028,col 9)",
        "(line 2029,col 9)-(line 2029,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.right(java.lang.String, int)",
      "begin_line": 2052,
      "end_line": 2063,
      "comment": "\n     * \u003cp\u003eGets the rightmost {@code len} characters of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf {@code len} characters are not available, or the String\n     * is {@code null}, the String will be returned without an\n     * an exception. An empty String is returned if len is negative.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.right(null, *)    \u003d null\n     * StringUtils.right(*, -ve)     \u003d \"\"\n     * StringUtils.right(\"\", *)      \u003d \"\"\n     * StringUtils.right(\"abc\", 0)   \u003d \"\"\n     * StringUtils.right(\"abc\", 2)   \u003d \"bc\"\n     * StringUtils.right(\"abc\", 4)   \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the rightmost characters from, may be null\n     * @param len  the length of the required String\n     * @return the rightmost characters, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 2053,col 9)-(line 2055,col 9)",
        "(line 2056,col 9)-(line 2058,col 9)",
        "(line 2059,col 9)-(line 2061,col 9)",
        "(line 2062,col 9)-(line 2062,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.mid(java.lang.String, int, int)",
      "begin_line": 2090,
      "end_line": 2104,
      "comment": "\n     * \u003cp\u003eGets {@code len} characters from the middle of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf {@code len} characters are not available, the remainder\n     * of the String will be returned without an exception. If the\n     * String is {@code null}, {@code null} will be returned.\n     * An empty String is returned if len is negative or exceeds the\n     * length of {@code str}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.mid(null, *, *)    \u003d null\n     * StringUtils.mid(*, *, -ve)     \u003d \"\"\n     * StringUtils.mid(\"\", 0, *)      \u003d \"\"\n     * StringUtils.mid(\"abc\", 0, 2)   \u003d \"ab\"\n     * StringUtils.mid(\"abc\", 0, 4)   \u003d \"abc\"\n     * StringUtils.mid(\"abc\", 2, 4)   \u003d \"c\"\n     * StringUtils.mid(\"abc\", 4, 2)   \u003d \"\"\n     * StringUtils.mid(\"abc\", -2, 2)  \u003d \"ab\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the characters from, may be null\n     * @param pos  the position to start from, negative treated as zero\n     * @param len  the length of the required String\n     * @return the middle characters, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 2091,col 9)-(line 2093,col 9)",
        "(line 2094,col 9)-(line 2096,col 9)",
        "(line 2097,col 9)-(line 2099,col 9)",
        "(line 2100,col 9)-(line 2102,col 9)",
        "(line 2103,col 9)-(line 2103,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringBefore(java.lang.String, java.lang.String)",
      "begin_line": 2135,
      "end_line": 2147,
      "comment": "\n     * \u003cp\u003eGets the substring before the first occurrence of a separator.\n     * The separator is not returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} string input will return {@code null}.\n     * An empty (\"\") string input will return the empty string.\n     * A {@code null} separator will return the input string.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf nothing is found, the string input is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringBefore(null, *)      \u003d null\n     * StringUtils.substringBefore(\"\", *)        \u003d \"\"\n     * StringUtils.substringBefore(\"abc\", \"a\")   \u003d \"\"\n     * StringUtils.substringBefore(\"abcba\", \"b\") \u003d \"a\"\n     * StringUtils.substringBefore(\"abc\", \"c\")   \u003d \"ab\"\n     * StringUtils.substringBefore(\"abc\", \"d\")   \u003d \"abc\"\n     * StringUtils.substringBefore(\"abc\", \"\")    \u003d \"\"\n     * StringUtils.substringBefore(\"abc\", null)  \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get a substring from, may be null\n     * @param separator  the String to search for, may be null\n     * @return the substring before the first occurrence of the separator,\n     *  {@code null} if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2136,col 9)-(line 2138,col 9)",
        "(line 2139,col 9)-(line 2141,col 9)",
        "(line 2142,col 9)-(line 2142,col 41)",
        "(line 2143,col 9)-(line 2145,col 9)",
        "(line 2146,col 9)-(line 2146,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringAfter(java.lang.String, java.lang.String)",
      "begin_line": 2177,
      "end_line": 2189,
      "comment": "\n     * \u003cp\u003eGets the substring after the first occurrence of a separator.\n     * The separator is not returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} string input will return {@code null}.\n     * An empty (\"\") string input will return the empty string.\n     * A {@code null} separator will return the empty string if the\n     * input string is not {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf nothing is found, the empty string is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringAfter(null, *)      \u003d null\n     * StringUtils.substringAfter(\"\", *)        \u003d \"\"\n     * StringUtils.substringAfter(*, null)      \u003d \"\"\n     * StringUtils.substringAfter(\"abc\", \"a\")   \u003d \"bc\"\n     * StringUtils.substringAfter(\"abcba\", \"b\") \u003d \"cba\"\n     * StringUtils.substringAfter(\"abc\", \"c\")   \u003d \"\"\n     * StringUtils.substringAfter(\"abc\", \"d\")   \u003d \"\"\n     * StringUtils.substringAfter(\"abc\", \"\")    \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get a substring from, may be null\n     * @param separator  the String to search for, may be null\n     * @return the substring after the first occurrence of the separator,\n     *  {@code null} if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2178,col 9)-(line 2180,col 9)",
        "(line 2181,col 9)-(line 2183,col 9)",
        "(line 2184,col 9)-(line 2184,col 41)",
        "(line 2185,col 9)-(line 2187,col 9)",
        "(line 2188,col 9)-(line 2188,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringBeforeLast(java.lang.String, java.lang.String)",
      "begin_line": 2218,
      "end_line": 2227,
      "comment": "\n     * \u003cp\u003eGets the substring before the last occurrence of a separator.\n     * The separator is not returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} string input will return {@code null}.\n     * An empty (\"\") string input will return the empty string.\n     * An empty or {@code null} separator will return the input string.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf nothing is found, the string input is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringBeforeLast(null, *)      \u003d null\n     * StringUtils.substringBeforeLast(\"\", *)        \u003d \"\"\n     * StringUtils.substringBeforeLast(\"abcba\", \"b\") \u003d \"abc\"\n     * StringUtils.substringBeforeLast(\"abc\", \"c\")   \u003d \"ab\"\n     * StringUtils.substringBeforeLast(\"a\", \"a\")     \u003d \"\"\n     * StringUtils.substringBeforeLast(\"a\", \"z\")     \u003d \"a\"\n     * StringUtils.substringBeforeLast(\"a\", null)    \u003d \"a\"\n     * StringUtils.substringBeforeLast(\"a\", \"\")      \u003d \"a\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get a substring from, may be null\n     * @param separator  the String to search for, may be null\n     * @return the substring before the last occurrence of the separator,\n     *  {@code null} if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2219,col 9)-(line 2221,col 9)",
        "(line 2222,col 9)-(line 2222,col 45)",
        "(line 2223,col 9)-(line 2225,col 9)",
        "(line 2226,col 9)-(line 2226,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringAfterLast(java.lang.String, java.lang.String)",
      "begin_line": 2258,
      "end_line": 2270,
      "comment": "\n     * \u003cp\u003eGets the substring after the last occurrence of a separator.\n     * The separator is not returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} string input will return {@code null}.\n     * An empty (\"\") string input will return the empty string.\n     * An empty or {@code null} separator will return the empty string if\n     * the input string is not {@code null}.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf nothing is found, the empty string is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringAfterLast(null, *)      \u003d null\n     * StringUtils.substringAfterLast(\"\", *)        \u003d \"\"\n     * StringUtils.substringAfterLast(*, \"\")        \u003d \"\"\n     * StringUtils.substringAfterLast(*, null)      \u003d \"\"\n     * StringUtils.substringAfterLast(\"abc\", \"a\")   \u003d \"bc\"\n     * StringUtils.substringAfterLast(\"abcba\", \"b\") \u003d \"a\"\n     * StringUtils.substringAfterLast(\"abc\", \"c\")   \u003d \"\"\n     * StringUtils.substringAfterLast(\"a\", \"a\")     \u003d \"\"\n     * StringUtils.substringAfterLast(\"a\", \"z\")     \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get a substring from, may be null\n     * @param separator  the String to search for, may be null\n     * @return the substring after the last occurrence of the separator,\n     *  {@code null} if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2259,col 9)-(line 2261,col 9)",
        "(line 2262,col 9)-(line 2264,col 9)",
        "(line 2265,col 9)-(line 2265,col 45)",
        "(line 2266,col 9)-(line 2268,col 9)",
        "(line 2269,col 9)-(line 2269,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringBetween(java.lang.String, java.lang.String)",
      "begin_line": 2295,
      "end_line": 2297,
      "comment": "\n     * \u003cp\u003eGets the String that is nested in between two instances of the\n     * same String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * A {@code null} tag returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringBetween(null, *)            \u003d null\n     * StringUtils.substringBetween(\"\", \"\")             \u003d \"\"\n     * StringUtils.substringBetween(\"\", \"tag\")          \u003d null\n     * StringUtils.substringBetween(\"tagabctag\", null)  \u003d null\n     * StringUtils.substringBetween(\"tagabctag\", \"\")    \u003d \"\"\n     * StringUtils.substringBetween(\"tagabctag\", \"tag\") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String containing the substring, may be null\n     * @param tag  the String before and after the substring, may be null\n     * @return the substring, {@code null} if no match\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2296,col 9)-(line 2296,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringBetween(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 2326,
      "end_line": 2338,
      "comment": "\n     * \u003cp\u003eGets the String that is nested in between two Strings.\n     * Only the first match is returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * A {@code null} open/close returns {@code null} (no match).\n     * An empty (\"\") open and close returns an empty string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringBetween(\"wx[b]yz\", \"[\", \"]\") \u003d \"b\"\n     * StringUtils.substringBetween(null, *, *)          \u003d null\n     * StringUtils.substringBetween(*, null, *)          \u003d null\n     * StringUtils.substringBetween(*, *, null)          \u003d null\n     * StringUtils.substringBetween(\"\", \"\", \"\")          \u003d \"\"\n     * StringUtils.substringBetween(\"\", \"\", \"]\")         \u003d null\n     * StringUtils.substringBetween(\"\", \"[\", \"]\")        \u003d null\n     * StringUtils.substringBetween(\"yabcz\", \"\", \"\")     \u003d \"\"\n     * StringUtils.substringBetween(\"yabcz\", \"y\", \"z\")   \u003d \"abc\"\n     * StringUtils.substringBetween(\"yabczyabcz\", \"y\", \"z\")   \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String containing the substring, may be null\n     * @param open  the String before the substring, may be null\n     * @param close  the String after the substring, may be null\n     * @return the substring, {@code null} if no match\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2327,col 9)-(line 2329,col 9)",
        "(line 2330,col 9)-(line 2330,col 38)",
        "(line 2331,col 9)-(line 2336,col 9)",
        "(line 2337,col 9)-(line 2337,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.substringsBetween(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 2362,
      "end_line": 2391,
      "comment": "\n     * \u003cp\u003eSearches a String for substrings delimited by a start and end tag,\n     * returning all matching substrings in an array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * A {@code null} open/close returns {@code null} (no match).\n     * An empty (\"\") open/close returns {@code null} (no match).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringsBetween(\"[a][b][c]\", \"[\", \"]\") \u003d [\"a\",\"b\",\"c\"]\n     * StringUtils.substringsBetween(null, *, *)            \u003d null\n     * StringUtils.substringsBetween(*, null, *)            \u003d null\n     * StringUtils.substringsBetween(*, *, null)            \u003d null\n     * StringUtils.substringsBetween(\"\", \"[\", \"]\")          \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param str  the String containing the substrings, null returns null, empty returns empty\n     * @param open  the String identifying the start of the substring, empty returns null\n     * @param close  the String identifying the end of the substring, empty returns null\n     * @return a String Array of substrings, or {@code null} if no match\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 2363,col 9)-(line 2365,col 9)",
        "(line 2366,col 9)-(line 2366,col 34)",
        "(line 2367,col 9)-(line 2369,col 9)",
        "(line 2370,col 9)-(line 2370,col 38)",
        "(line 2371,col 9)-(line 2371,col 36)",
        "(line 2372,col 9)-(line 2372,col 52)",
        "(line 2373,col 9)-(line 2373,col 20)",
        "(line 2374,col 9)-(line 2386,col 9)",
        "(line 2387,col 9)-(line 2389,col 9)",
        "(line 2390,col 9)-(line 2390,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.split(java.lang.String)",
      "begin_line": 2420,
      "end_line": 2422,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, using whitespace as the\n     * separator.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as one separator.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.split(null)       \u003d null\n     * StringUtils.split(\"\")         \u003d []\n     * StringUtils.split(\"abc def\")  \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\"abc  def\") \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\" abc \")    \u003d [\"abc\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @return an array of parsed Strings, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 2421,col 9)-(line 2421,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.split(java.lang.String, char)",
      "begin_line": 2448,
      "end_line": 2450,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator specified.\n     * This is an alternative to using StringTokenizer.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as one separator.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.split(null, *)         \u003d null\n     * StringUtils.split(\"\", *)           \u003d []\n     * StringUtils.split(\"a.b.c\", \u0027.\u0027)    \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.split(\"a..b.c\", \u0027.\u0027)   \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.split(\"a:b:c\", \u0027.\u0027)    \u003d [\"a:b:c\"]\n     * StringUtils.split(\"a b c\", \u0027 \u0027)    \u003d [\"a\", \"b\", \"c\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separatorChar  the character used as the delimiter\n     * @return an array of parsed Strings, {@code null} if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2449,col 9)-(line 2449,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.split(java.lang.String, java.lang.String)",
      "begin_line": 2477,
      "end_line": 2479,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separators specified.\n     * This is an alternative to using StringTokenizer.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as one separator.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * A {@code null} separatorChars splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.split(null, *)         \u003d null\n     * StringUtils.split(\"\", *)           \u003d []\n     * StringUtils.split(\"abc def\", null) \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\"abc def\", \" \")  \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\"abc  def\", \" \") \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\"ab:cd:ef\", \":\") \u003d [\"ab\", \"cd\", \"ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separatorChars  the characters used as the delimiters,\n     *  {@code null} splits on whitespace\n     * @return an array of parsed Strings, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 2478,col 9)-(line 2478,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.split(java.lang.String, java.lang.String, int)",
      "begin_line": 2511,
      "end_line": 2513,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array with a maximum length,\n     * separators specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as one separator.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * A {@code null} separatorChars splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf more than {@code max} delimited substrings are found, the last\n     * returned string includes all characters after the first {@code max - 1}\n     * returned strings (including separator characters).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.split(null, *, *)            \u003d null\n     * StringUtils.split(\"\", *, *)              \u003d []\n     * StringUtils.split(\"ab cd ef\", null, 0)   \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.split(\"ab   cd ef\", null, 0) \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.split(\"ab:cd:ef\", \":\", 0)    \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.split(\"ab:cd:ef\", \":\", 2)    \u003d [\"ab\", \"cd:ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separatorChars  the characters used as the delimiters,\n     *  {@code null} splits on whitespace\n     * @param max  the maximum number of elements to include in the\n     *  array. A zero or negative value implies no limit\n     * @return an array of parsed Strings, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 2512,col 9)-(line 2512,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByWholeSeparator(java.lang.String, java.lang.String)",
      "begin_line": 2538,
      "end_line": 2540,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator string specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator(s) will not be included in the returned String array.\n     * Adjacent separators are treated as one separator.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * A {@code null} separator splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitByWholeSeparator(null, *)               \u003d null\n     * StringUtils.splitByWholeSeparator(\"\", *)                 \u003d []\n     * StringUtils.splitByWholeSeparator(\"ab de fg\", null)      \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparator(\"ab   de fg\", null)    \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparator(\"ab:cd:ef\", \":\")       \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitByWholeSeparator(\"ab-!-cd-!-ef\", \"-!-\") \u003d [\"ab\", \"cd\", \"ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separator  String containing the String to be used as a delimiter,\n     *  {@code null} splits on whitespace\n     * @return an array of parsed Strings, {@code null} if null String was input\n     ",
      "child_ranges": [
        "(line 2539,col 9)-(line 2539,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByWholeSeparator(java.lang.String, java.lang.String, int)",
      "begin_line": 2569,
      "end_line": 2571,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator string specified.\n     * Returns a maximum of {@code max} substrings.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator(s) will not be included in the returned String array.\n     * Adjacent separators are treated as one separator.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * A {@code null} separator splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitByWholeSeparator(null, *, *)               \u003d null\n     * StringUtils.splitByWholeSeparator(\"\", *, *)                 \u003d []\n     * StringUtils.splitByWholeSeparator(\"ab de fg\", null, 0)      \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparator(\"ab   de fg\", null, 0)    \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparator(\"ab:cd:ef\", \":\", 2)       \u003d [\"ab\", \"cd:ef\"]\n     * StringUtils.splitByWholeSeparator(\"ab-!-cd-!-ef\", \"-!-\", 5) \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitByWholeSeparator(\"ab-!-cd-!-ef\", \"-!-\", 2) \u003d [\"ab\", \"cd-!-ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separator  String containing the String to be used as a delimiter,\n     *  {@code null} splits on whitespace\n     * @param max  the maximum number of elements to include in the returned\n     *  array. A zero or negative value implies no limit.\n     * @return an array of parsed Strings, {@code null} if null String was input\n     ",
      "child_ranges": [
        "(line 2570,col 9)-(line 2570,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(java.lang.String, java.lang.String)",
      "begin_line": 2598,
      "end_line": 2600,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator string specified. \u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * A {@code null} separator splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(null, *)               \u003d null\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"\", *)                 \u003d []\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab de fg\", null)      \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab   de fg\", null)    \u003d [\"ab\", \"\", \"\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab:cd:ef\", \":\")       \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab-!-cd-!-ef\", \"-!-\") \u003d [\"ab\", \"cd\", \"ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separator  String containing the String to be used as a delimiter,\n     *  {@code null} splits on whitespace\n     * @return an array of parsed Strings, {@code null} if null String was input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 2599,col 9)-(line 2599,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(java.lang.String, java.lang.String, int)",
      "begin_line": 2631,
      "end_line": 2633,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator string specified.\n     * Returns a maximum of {@code max} substrings.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * A {@code null} separator splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(null, *, *)               \u003d null\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"\", *, *)                 \u003d []\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab de fg\", null, 0)      \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab   de fg\", null, 0)    \u003d [\"ab\", \"\", \"\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab:cd:ef\", \":\", 2)       \u003d [\"ab\", \"cd:ef\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab-!-cd-!-ef\", \"-!-\", 5) \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab-!-cd-!-ef\", \"-!-\", 2) \u003d [\"ab\", \"cd-!-ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separator  String containing the String to be used as a delimiter,\n     *  {@code null} splits on whitespace\n     * @param max  the maximum number of elements to include in the returned\n     *  array. A zero or negative value implies no limit.\n     * @return an array of parsed Strings, {@code null} if null String was input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 2632,col 9)-(line 2632,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByWholeSeparatorWorker(java.lang.String, java.lang.String, int, boolean)",
      "begin_line": 2649,
      "end_line": 2713,
      "comment": "\n     * Performs the logic for the {@code splitByWholeSeparatorPreserveAllTokens} methods.\n     *\n     * @param str  the String to parse, may be {@code null}\n     * @param separator  String containing the String to be used as a delimiter,\n     *  {@code null} splits on whitespace\n     * @param max  the maximum number of elements to include in the returned\n     *  array. A zero or negative value implies no limit.\n     * @param preserveAllTokens if {@code true}, adjacent separators are\n     * treated as empty token separators; if {@code false}, adjacent\n     * separators are treated as one separator.\n     * @return an array of parsed Strings, {@code null} if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 2651,col 9)-(line 2653,col 9)",
        "(line 2655,col 9)-(line 2655,col 31)",
        "(line 2657,col 9)-(line 2659,col 9)",
        "(line 2661,col 9)-(line 2664,col 9)",
        "(line 2666,col 9)-(line 2666,col 49)",
        "(line 2668,col 9)-(line 2668,col 63)",
        "(line 2669,col 9)-(line 2669,col 35)",
        "(line 2670,col 9)-(line 2670,col 20)",
        "(line 2671,col 9)-(line 2671,col 20)",
        "(line 2672,col 9)-(line 2710,col 9)",
        "(line 2712,col 9)-(line 2712,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(java.lang.String)",
      "begin_line": 2740,
      "end_line": 2742,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, using whitespace as the\n     * separator, preserving all tokens, including empty tokens created by\n     * adjacent separators. This is an alternative to using StringTokenizer.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitPreserveAllTokens(null)       \u003d null\n     * StringUtils.splitPreserveAllTokens(\"\")         \u003d []\n     * StringUtils.splitPreserveAllTokens(\"abc def\")  \u003d [\"abc\", \"def\"]\n     * StringUtils.splitPreserveAllTokens(\"abc  def\") \u003d [\"abc\", \"\", \"def\"]\n     * StringUtils.splitPreserveAllTokens(\" abc \")    \u003d [\"\", \"abc\", \"\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be {@code null}\n     * @return an array of parsed Strings, {@code null} if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2741,col 9)-(line 2741,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(java.lang.String, char)",
      "begin_line": 2776,
      "end_line": 2778,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator specified,\n     * preserving all tokens, including empty tokens created by adjacent\n     * separators. This is an alternative to using StringTokenizer.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitPreserveAllTokens(null, *)         \u003d null\n     * StringUtils.splitPreserveAllTokens(\"\", *)           \u003d []\n     * StringUtils.splitPreserveAllTokens(\"a.b.c\", \u0027.\u0027)    \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"a..b.c\", \u0027.\u0027)   \u003d [\"a\", \"\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"a:b:c\", \u0027.\u0027)    \u003d [\"a:b:c\"]\n     * StringUtils.splitPreserveAllTokens(\"a\\tb\\nc\", null) \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"a b c\", \u0027 \u0027)    \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"a b c \", \u0027 \u0027)   \u003d [\"a\", \"b\", \"c\", \"\"]\n     * StringUtils.splitPreserveAllTokens(\"a b c  \", \u0027 \u0027)   \u003d [\"a\", \"b\", \"c\", \"\", \"\"]\n     * StringUtils.splitPreserveAllTokens(\" a b c\", \u0027 \u0027)   \u003d [\"\", a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"  a b c\", \u0027 \u0027)  \u003d [\"\", \"\", a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\" a b c \", \u0027 \u0027)  \u003d [\"\", a\", \"b\", \"c\", \"\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be {@code null}\n     * @param separatorChar  the character used as the delimiter,\n     *  {@code null} splits on whitespace\n     * @return an array of parsed Strings, {@code null} if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2777,col 9)-(line 2777,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitWorker(java.lang.String, char, boolean)",
      "begin_line": 2792,
      "end_line": 2824,
      "comment": "\n     * Performs the logic for the {@code split} and\n     * {@code splitPreserveAllTokens} methods that do not return a\n     * maximum array length.\n     *\n     * @param str  the String to parse, may be {@code null}\n     * @param separatorChar the separate character\n     * @param preserveAllTokens if {@code true}, adjacent separators are\n     * treated as empty token separators; if {@code false}, adjacent\n     * separators are treated as one separator.\n     * @return an array of parsed Strings, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 2795,col 9)-(line 2797,col 9)",
        "(line 2798,col 9)-(line 2798,col 31)",
        "(line 2799,col 9)-(line 2801,col 9)",
        "(line 2802,col 9)-(line 2802,col 52)",
        "(line 2803,col 9)-(line 2803,col 29)",
        "(line 2804,col 9)-(line 2804,col 30)",
        "(line 2805,col 9)-(line 2805,col 34)",
        "(line 2806,col 9)-(line 2819,col 9)",
        "(line 2820,col 9)-(line 2822,col 9)",
        "(line 2823,col 9)-(line 2823,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(java.lang.String, java.lang.String)",
      "begin_line": 2859,
      "end_line": 2861,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separators specified,\n     * preserving all tokens, including empty tokens created by adjacent\n     * separators. This is an alternative to using StringTokenizer.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * A {@code null} separatorChars splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitPreserveAllTokens(null, *)           \u003d null\n     * StringUtils.splitPreserveAllTokens(\"\", *)             \u003d []\n     * StringUtils.splitPreserveAllTokens(\"abc def\", null)   \u003d [\"abc\", \"def\"]\n     * StringUtils.splitPreserveAllTokens(\"abc def\", \" \")    \u003d [\"abc\", \"def\"]\n     * StringUtils.splitPreserveAllTokens(\"abc  def\", \" \")   \u003d [\"abc\", \"\", def\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef\", \":\")   \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef:\", \":\")  \u003d [\"ab\", \"cd\", \"ef\", \"\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef::\", \":\") \u003d [\"ab\", \"cd\", \"ef\", \"\", \"\"]\n     * StringUtils.splitPreserveAllTokens(\"ab::cd:ef\", \":\")  \u003d [\"ab\", \"\", cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\":cd:ef\", \":\")     \u003d [\"\", cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"::cd:ef\", \":\")    \u003d [\"\", \"\", cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\":cd:ef:\", \":\")    \u003d [\"\", cd\", \"ef\", \"\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be {@code null}\n     * @param separatorChars  the characters used as the delimiters,\n     *  {@code null} splits on whitespace\n     * @return an array of parsed Strings, {@code null} if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2860,col 9)-(line 2860,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(java.lang.String, java.lang.String, int)",
      "begin_line": 2899,
      "end_line": 2901,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array with a maximum length,\n     * separators specified, preserving all tokens, including empty tokens\n     * created by adjacent separators.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * Adjacent separators are treated as one separator.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\n     * A {@code null} separatorChars splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf more than {@code max} delimited substrings are found, the last\n     * returned string includes all characters after the first {@code max - 1}\n     * returned strings (including separator characters).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitPreserveAllTokens(null, *, *)            \u003d null\n     * StringUtils.splitPreserveAllTokens(\"\", *, *)              \u003d []\n     * StringUtils.splitPreserveAllTokens(\"ab de fg\", null, 0)   \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab   de fg\", null, 0) \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef\", \":\", 0)    \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef\", \":\", 2)    \u003d [\"ab\", \"cd:ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab   de fg\", null, 2) \u003d [\"ab\", \"  de fg\"]\n     * StringUtils.splitPreserveAllTokens(\"ab   de fg\", null, 3) \u003d [\"ab\", \"\", \" de fg\"]\n     * StringUtils.splitPreserveAllTokens(\"ab   de fg\", null, 4) \u003d [\"ab\", \"\", \"\", \"de fg\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be {@code null}\n     * @param separatorChars  the characters used as the delimiters,\n     *  {@code null} splits on whitespace\n     * @param max  the maximum number of elements to include in the\n     *  array. A zero or negative value implies no limit\n     * @return an array of parsed Strings, {@code null} if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2900,col 9)-(line 2900,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitWorker(java.lang.String, java.lang.String, int, boolean)",
      "begin_line": 2917,
      "end_line": 3000,
      "comment": "\n     * Performs the logic for the {@code split} and\n     * {@code splitPreserveAllTokens} methods that return a maximum array\n     * length.\n     *\n     * @param str  the String to parse, may be {@code null}\n     * @param separatorChars the separate character\n     * @param max  the maximum number of elements to include in the\n     *  array. A zero or negative value implies no limit.\n     * @param preserveAllTokens if {@code true}, adjacent separators are\n     * treated as empty token separators; if {@code false}, adjacent\n     * separators are treated as one separator.\n     * @return an array of parsed Strings, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 2922,col 9)-(line 2924,col 9)",
        "(line 2925,col 9)-(line 2925,col 31)",
        "(line 2926,col 9)-(line 2928,col 9)",
        "(line 2929,col 9)-(line 2929,col 52)",
        "(line 2930,col 9)-(line 2930,col 26)",
        "(line 2931,col 9)-(line 2931,col 29)",
        "(line 2932,col 9)-(line 2932,col 30)",
        "(line 2933,col 9)-(line 2933,col 34)",
        "(line 2934,col 9)-(line 2995,col 9)",
        "(line 2996,col 9)-(line 2998,col 9)",
        "(line 2999,col 9)-(line 2999,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByCharacterType(java.lang.String)",
      "begin_line": 3021,
      "end_line": 3023,
      "comment": "\n     * \u003cp\u003eSplits a String by Character type as returned by\n     * {@code java.lang.Character.getType(char)}. Groups of contiguous\n     * characters of the same type are returned as complete tokens.\n     * \u003cpre\u003e\n     * StringUtils.splitByCharacterType(null)         \u003d null\n     * StringUtils.splitByCharacterType(\"\")           \u003d []\n     * StringUtils.splitByCharacterType(\"ab de fg\")   \u003d [\"ab\", \" \", \"de\", \" \", \"fg\"]\n     * StringUtils.splitByCharacterType(\"ab   de fg\") \u003d [\"ab\", \"   \", \"de\", \" \", \"fg\"]\n     * StringUtils.splitByCharacterType(\"ab:cd:ef\")   \u003d [\"ab\", \":\", \"cd\", \":\", \"ef\"]\n     * StringUtils.splitByCharacterType(\"number5\")    \u003d [\"number\", \"5\"]\n     * StringUtils.splitByCharacterType(\"fooBar\")     \u003d [\"foo\", \"B\", \"ar\"]\n     * StringUtils.splitByCharacterType(\"foo200Bar\")  \u003d [\"foo\", \"200\", \"B\", \"ar\"]\n     * StringUtils.splitByCharacterType(\"ASFRules\")   \u003d [\"ASFR\", \"ules\"]\n     * \u003c/pre\u003e\n     * @param str the String to split, may be {@code null}\n     * @return an array of parsed Strings, {@code null} if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3022,col 9)-(line 3022,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase(java.lang.String)",
      "begin_line": 3049,
      "end_line": 3051,
      "comment": "\n     * \u003cp\u003eSplits a String by Character type as returned by\n     * {@code java.lang.Character.getType(char)}. Groups of contiguous\n     * characters of the same type are returned as complete tokens, with the\n     * following exception: the character of type\n     * {@code Character.UPPERCASE_LETTER}, if any, immediately\n     * preceding a token of type {@code Character.LOWERCASE_LETTER}\n     * will belong to the following token rather than to the preceding, if any,\n     * {@code Character.UPPERCASE_LETTER} token.\n     * \u003cpre\u003e\n     * StringUtils.splitByCharacterTypeCamelCase(null)         \u003d null\n     * StringUtils.splitByCharacterTypeCamelCase(\"\")           \u003d []\n     * StringUtils.splitByCharacterTypeCamelCase(\"ab de fg\")   \u003d [\"ab\", \" \", \"de\", \" \", \"fg\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"ab   de fg\") \u003d [\"ab\", \"   \", \"de\", \" \", \"fg\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"ab:cd:ef\")   \u003d [\"ab\", \":\", \"cd\", \":\", \"ef\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"number5\")    \u003d [\"number\", \"5\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"fooBar\")     \u003d [\"foo\", \"Bar\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"foo200Bar\")  \u003d [\"foo\", \"200\", \"Bar\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"ASFRules\")   \u003d [\"ASF\", \"Rules\"]\n     * \u003c/pre\u003e\n     * @param str the String to split, may be {@code null}\n     * @return an array of parsed Strings, {@code null} if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3050,col 9)-(line 3050,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.splitByCharacterType(java.lang.String, boolean)",
      "begin_line": 3067,
      "end_line": 3097,
      "comment": "\n     * \u003cp\u003eSplits a String by Character type as returned by\n     * {@code java.lang.Character.getType(char)}. Groups of contiguous\n     * characters of the same type are returned as complete tokens, with the\n     * following exception: if {@code camelCase} is {@code true},\n     * the character of type {@code Character.UPPERCASE_LETTER}, if any,\n     * immediately preceding a token of type {@code Character.LOWERCASE_LETTER}\n     * will belong to the following token rather than to the preceding, if any,\n     * {@code Character.UPPERCASE_LETTER} token.\n     * @param str the String to split, may be {@code null}\n     * @param camelCase whether to use so-called \"camel-case\" for letter types\n     * @return an array of parsed Strings, {@code null} if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3068,col 9)-(line 3070,col 9)",
        "(line 3071,col 9)-(line 3073,col 9)",
        "(line 3074,col 9)-(line 3074,col 37)",
        "(line 3075,col 9)-(line 3075,col 52)",
        "(line 3076,col 9)-(line 3076,col 27)",
        "(line 3077,col 9)-(line 3077,col 59)",
        "(line 3078,col 9)-(line 3094,col 9)",
        "(line 3095,col 9)-(line 3095,col 67)",
        "(line 3096,col 9)-(line 3096,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(T...)",
      "begin_line": 3123,
      "end_line": 3125,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo separator is added to the joined String.\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null)            \u003d null\n     * StringUtils.join([])              \u003d \"\"\n     * StringUtils.join([null])          \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"]) \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"]) \u003d \"a\"\n     * \u003c/pre\u003e\n     *\n     * @param \u003cT\u003e the specific type of values to join together\n     * @param elements  the values to join together, may be null\n     * @return the joined String, {@code null} if null array input\n     * @since 2.0\n     * @since 3.0 Changed signature to use varargs\n     ",
      "child_ranges": [
        "(line 3124,col 9)-(line 3124,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.lang.Object[], char)",
      "begin_line": 3149,
      "end_line": 3155,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null, *)               \u003d null\n     * StringUtils.join([], *)                 \u003d \"\"\n     * StringUtils.join([null], *)             \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \u0027;\u0027)  \u003d \"a;b;c\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], null) \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"], \u0027;\u0027)  \u003d \";;a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to join together, may be null\n     * @param separator  the separator character to use\n     * @return the joined String, {@code null} if null array input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 3150,col 9)-(line 3152,col 9)",
        "(line 3154,col 9)-(line 3154,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.lang.Object[], char, int, int)",
      "begin_line": 3183,
      "end_line": 3203,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null, *)               \u003d null\n     * StringUtils.join([], *)                 \u003d \"\"\n     * StringUtils.join([null], *)             \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \u0027;\u0027)  \u003d \"a;b;c\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], null) \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"], \u0027;\u0027)  \u003d \";;a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to join together, may be null\n     * @param separator  the separator character to use\n     * @param startIndex the first index to start joining from.  It is\n     * an error to pass in an end index past the end of the array\n     * @param endIndex the index to stop joining from (exclusive). It is\n     * an error to pass in an end index past the end of the array\n     * @return the joined String, {@code null} if null array input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 3184,col 9)-(line 3186,col 9)",
        "(line 3187,col 9)-(line 3187,col 46)",
        "(line 3188,col 9)-(line 3190,col 9)",
        "(line 3192,col 9)-(line 3192,col 62)",
        "(line 3194,col 9)-(line 3201,col 9)",
        "(line 3202,col 9)-(line 3202,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.lang.Object[], java.lang.String)",
      "begin_line": 3228,
      "end_line": 3233,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * A {@code null} separator is the same as an empty String (\"\").\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null, *)                \u003d null\n     * StringUtils.join([], *)                  \u003d \"\"\n     * StringUtils.join([null], *)              \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \"--\")  \u003d \"a--b--c\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], null)  \u003d \"abc\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \"\")    \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"], \u0027,\u0027)   \u003d \",,a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to join together, may be null\n     * @param separator  the separator character to use, null treated as \"\"\n     * @return the joined String, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 3229,col 9)-(line 3231,col 9)",
        "(line 3232,col 9)-(line 3232,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.lang.Object[], java.lang.String, int, int)",
      "begin_line": 3262,
      "end_line": 3288,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * A {@code null} separator is the same as an empty String (\"\").\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null, *)                \u003d null\n     * StringUtils.join([], *)                  \u003d \"\"\n     * StringUtils.join([null], *)              \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \"--\")  \u003d \"a--b--c\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], null)  \u003d \"abc\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \"\")    \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"], \u0027,\u0027)   \u003d \",,a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to join together, may be null\n     * @param separator  the separator character to use, null treated as \"\"\n     * @param startIndex the first index to start joining from.  It is\n     * an error to pass in an end index past the end of the array\n     * @param endIndex the index to stop joining from (exclusive). It is\n     * an error to pass in an end index past the end of the array\n     * @return the joined String, {@code null} if null array input\n     ",
      "child_ranges": [
        "(line 3263,col 9)-(line 3265,col 9)",
        "(line 3266,col 9)-(line 3268,col 9)",
        "(line 3272,col 9)-(line 3272,col 46)",
        "(line 3273,col 9)-(line 3275,col 9)",
        "(line 3277,col 9)-(line 3277,col 62)",
        "(line 3279,col 9)-(line 3286,col 9)",
        "(line 3287,col 9)-(line 3287,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.util.Iterator\u003c?\u003e, char)",
      "begin_line": 3304,
      "end_line": 3333,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided {@code Iterator} into\n     * a single String containing the provided elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list. Null objects or empty\n     * strings within the iteration are represented by empty strings.\u003c/p\u003e\n     *\n     * \u003cp\u003eSee the examples here: {@link #join(Object[],char)}. \u003c/p\u003e\n     *\n     * @param iterator  the {@code Iterator} of values to join together, may be null\n     * @param separator  the separator character to use\n     * @return the joined String, {@code null} if null iterator input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 3307,col 9)-(line 3309,col 9)",
        "(line 3310,col 9)-(line 3312,col 9)",
        "(line 3313,col 9)-(line 3313,col 39)",
        "(line 3314,col 9)-(line 3316,col 9)",
        "(line 3319,col 9)-(line 3319,col 51)",
        "(line 3320,col 9)-(line 3322,col 9)",
        "(line 3324,col 9)-(line 3330,col 9)",
        "(line 3332,col 9)-(line 3332,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.util.Iterator\u003c?\u003e, java.lang.String)",
      "begin_line": 3348,
      "end_line": 3378,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided {@code Iterator} into\n     * a single String containing the provided elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * A {@code null} separator is the same as an empty String (\"\").\u003c/p\u003e\n     *\n     * \u003cp\u003eSee the examples here: {@link #join(Object[],String)}. \u003c/p\u003e\n     *\n     * @param iterator  the {@code Iterator} of values to join together, may be null\n     * @param separator  the separator character to use, null treated as \"\"\n     * @return the joined String, {@code null} if null iterator input\n     ",
      "child_ranges": [
        "(line 3351,col 9)-(line 3353,col 9)",
        "(line 3354,col 9)-(line 3356,col 9)",
        "(line 3357,col 9)-(line 3357,col 39)",
        "(line 3358,col 9)-(line 3360,col 9)",
        "(line 3363,col 9)-(line 3363,col 51)",
        "(line 3364,col 9)-(line 3366,col 9)",
        "(line 3368,col 9)-(line 3376,col 9)",
        "(line 3377,col 9)-(line 3377,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.lang.Iterable\u003c?\u003e, char)",
      "begin_line": 3394,
      "end_line": 3399,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided {@code Iterable} into\n     * a single String containing the provided elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list. Null objects or empty\n     * strings within the iteration are represented by empty strings.\u003c/p\u003e\n     *\n     * \u003cp\u003eSee the examples here: {@link #join(Object[],char)}. \u003c/p\u003e\n     *\n     * @param iterable  the {@code Iterable} providing the values to join together, may be null\n     * @param separator  the separator character to use\n     * @return the joined String, {@code null} if null iterator input\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 3395,col 9)-(line 3397,col 9)",
        "(line 3398,col 9)-(line 3398,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.join(java.lang.Iterable\u003c?\u003e, java.lang.String)",
      "begin_line": 3415,
      "end_line": 3420,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided {@code Iterable} into\n     * a single String containing the provided elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * A {@code null} separator is the same as an empty String (\"\").\u003c/p\u003e\n     *\n     * \u003cp\u003eSee the examples here: {@link #join(Object[],String)}. \u003c/p\u003e\n     *\n     * @param iterable  the {@code Iterable} providing the values to join together, may be null\n     * @param separator  the separator character to use, null treated as \"\"\n     * @return the joined String, {@code null} if null iterator input\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 3416,col 9)-(line 3418,col 9)",
        "(line 3419,col 9)-(line 3419,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.deleteWhitespace(java.lang.String)",
      "begin_line": 3438,
      "end_line": 3454,
      "comment": "\n     * \u003cp\u003eDeletes all whitespaces from a String as defined by\n     * {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.deleteWhitespace(null)         \u003d null\n     * StringUtils.deleteWhitespace(\"\")           \u003d \"\"\n     * StringUtils.deleteWhitespace(\"abc\")        \u003d \"abc\"\n     * StringUtils.deleteWhitespace(\"   ab  c  \") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to delete whitespace from, may be null\n     * @return the String without whitespaces, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 3439,col 9)-(line 3441,col 9)",
        "(line 3442,col 9)-(line 3442,col 30)",
        "(line 3443,col 9)-(line 3443,col 34)",
        "(line 3444,col 9)-(line 3444,col 22)",
        "(line 3445,col 9)-(line 3449,col 9)",
        "(line 3450,col 9)-(line 3452,col 9)",
        "(line 3453,col 9)-(line 3453,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.removeStart(java.lang.String, java.lang.String)",
      "begin_line": 3482,
      "end_line": 3490,
      "comment": "\n     * \u003cp\u003eRemoves a substring only if it is at the beginning of a source string,\n     * otherwise returns the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} source string will return {@code null}.\n     * An empty (\"\") source string will return the empty string.\n     * A {@code null} search string will return the source string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.removeStart(null, *)      \u003d null\n     * StringUtils.removeStart(\"\", *)        \u003d \"\"\n     * StringUtils.removeStart(*, null)      \u003d *\n     * StringUtils.removeStart(\"www.domain.com\", \"www.\")   \u003d \"domain.com\"\n     * StringUtils.removeStart(\"domain.com\", \"www.\")       \u003d \"domain.com\"\n     * StringUtils.removeStart(\"www.domain.com\", \"domain\") \u003d \"www.domain.com\"\n     * StringUtils.removeStart(\"abc\", \"\")    \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the String to search for and remove, may be null\n     * @return the substring with the string removed if found,\n     *  {@code null} if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3483,col 9)-(line 3485,col 9)",
        "(line 3486,col 9)-(line 3488,col 9)",
        "(line 3489,col 9)-(line 3489,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.removeStartIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 3517,
      "end_line": 3525,
      "comment": "\n     * \u003cp\u003eCase insensitive removal of a substring if it is at the beginning of a source string,\n     * otherwise returns the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} source string will return {@code null}.\n     * An empty (\"\") source string will return the empty string.\n     * A {@code null} search string will return the source string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.removeStartIgnoreCase(null, *)      \u003d null\n     * StringUtils.removeStartIgnoreCase(\"\", *)        \u003d \"\"\n     * StringUtils.removeStartIgnoreCase(*, null)      \u003d *\n     * StringUtils.removeStartIgnoreCase(\"www.domain.com\", \"www.\")   \u003d \"domain.com\"\n     * StringUtils.removeStartIgnoreCase(\"www.domain.com\", \"WWW.\")   \u003d \"domain.com\"\n     * StringUtils.removeStartIgnoreCase(\"domain.com\", \"www.\")       \u003d \"domain.com\"\n     * StringUtils.removeStartIgnoreCase(\"www.domain.com\", \"domain\") \u003d \"www.domain.com\"\n     * StringUtils.removeStartIgnoreCase(\"abc\", \"\")    \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the String to search for (case insensitive) and remove, may be null\n     * @return the substring with the string removed if found,\n     *  {@code null} if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3518,col 9)-(line 3520,col 9)",
        "(line 3521,col 9)-(line 3523,col 9)",
        "(line 3524,col 9)-(line 3524,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.removeEnd(java.lang.String, java.lang.String)",
      "begin_line": 3551,
      "end_line": 3559,
      "comment": "\n     * \u003cp\u003eRemoves a substring only if it is at the end of a source string,\n     * otherwise returns the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} source string will return {@code null}.\n     * An empty (\"\") source string will return the empty string.\n     * A {@code null} search string will return the source string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.removeEnd(null, *)      \u003d null\n     * StringUtils.removeEnd(\"\", *)        \u003d \"\"\n     * StringUtils.removeEnd(*, null)      \u003d *\n     * StringUtils.removeEnd(\"www.domain.com\", \".com.\")  \u003d \"www.domain.com\"\n     * StringUtils.removeEnd(\"www.domain.com\", \".com\")   \u003d \"www.domain\"\n     * StringUtils.removeEnd(\"www.domain.com\", \"domain\") \u003d \"www.domain.com\"\n     * StringUtils.removeEnd(\"abc\", \"\")    \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the String to search for and remove, may be null\n     * @return the substring with the string removed if found,\n     *  {@code null} if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3552,col 9)-(line 3554,col 9)",
        "(line 3555,col 9)-(line 3557,col 9)",
        "(line 3558,col 9)-(line 3558,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.removeEndIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 3587,
      "end_line": 3595,
      "comment": "\n     * \u003cp\u003eCase insensitive removal of a substring if it is at the end of a source string,\n     * otherwise returns the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} source string will return {@code null}.\n     * An empty (\"\") source string will return the empty string.\n     * A {@code null} search string will return the source string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.removeEndIgnoreCase(null, *)      \u003d null\n     * StringUtils.removeEndIgnoreCase(\"\", *)        \u003d \"\"\n     * StringUtils.removeEndIgnoreCase(*, null)      \u003d *\n     * StringUtils.removeEndIgnoreCase(\"www.domain.com\", \".com.\")  \u003d \"www.domain.com\"\n     * StringUtils.removeEndIgnoreCase(\"www.domain.com\", \".com\")   \u003d \"www.domain\"\n     * StringUtils.removeEndIgnoreCase(\"www.domain.com\", \"domain\") \u003d \"www.domain.com\"\n     * StringUtils.removeEndIgnoreCase(\"abc\", \"\")    \u003d \"abc\"\n     * StringUtils.removeEndIgnoreCase(\"www.domain.com\", \".COM\") \u003d \"www.domain\")\n     * StringUtils.removeEndIgnoreCase(\"www.domain.COM\", \".com\") \u003d \"www.domain\")\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the String to search for (case insensitive) and remove, may be null\n     * @return the substring with the string removed if found,\n     *  {@code null} if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3588,col 9)-(line 3590,col 9)",
        "(line 3591,col 9)-(line 3593,col 9)",
        "(line 3594,col 9)-(line 3594,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.remove(java.lang.String, java.lang.String)",
      "begin_line": 3620,
      "end_line": 3625,
      "comment": "\n     * \u003cp\u003eRemoves all occurrences of a substring from within the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} source string will return {@code null}.\n     * An empty (\"\") source string will return the empty string.\n     * A {@code null} remove string will return the source string.\n     * An empty (\"\") remove string will return the source string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.remove(null, *)        \u003d null\n     * StringUtils.remove(\"\", *)          \u003d \"\"\n     * StringUtils.remove(*, null)        \u003d *\n     * StringUtils.remove(*, \"\")          \u003d *\n     * StringUtils.remove(\"queued\", \"ue\") \u003d \"qd\"\n     * StringUtils.remove(\"queued\", \"zz\") \u003d \"queued\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the String to search for and remove, may be null\n     * @return the substring with the string removed if found,\n     *  {@code null} if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3621,col 9)-(line 3623,col 9)",
        "(line 3624,col 9)-(line 3624,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.remove(java.lang.String, char)",
      "begin_line": 3646,
      "end_line": 3658,
      "comment": "\n     * \u003cp\u003eRemoves all occurrences of a character from within the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} source string will return {@code null}.\n     * An empty (\"\") source string will return the empty string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.remove(null, *)       \u003d null\n     * StringUtils.remove(\"\", *)         \u003d \"\"\n     * StringUtils.remove(\"queued\", \u0027u\u0027) \u003d \"qeed\"\n     * StringUtils.remove(\"queued\", \u0027z\u0027) \u003d \"queued\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the char to search for and remove, may be null\n     * @return the substring with the char removed if found,\n     *  {@code null} if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3647,col 9)-(line 3649,col 9)",
        "(line 3650,col 9)-(line 3650,col 41)",
        "(line 3651,col 9)-(line 3651,col 20)",
        "(line 3652,col 9)-(line 3656,col 9)",
        "(line 3657,col 9)-(line 3657,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replaceOnce(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 3685,
      "end_line": 3687,
      "comment": "\n     * \u003cp\u003eReplaces a String with another String inside a larger String, once.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} reference passed to this method is a no-op.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replaceOnce(null, *, *)        \u003d null\n     * StringUtils.replaceOnce(\"\", *, *)          \u003d \"\"\n     * StringUtils.replaceOnce(\"any\", null, *)    \u003d \"any\"\n     * StringUtils.replaceOnce(\"any\", *, null)    \u003d \"any\"\n     * StringUtils.replaceOnce(\"any\", \"\", *)      \u003d \"any\"\n     * StringUtils.replaceOnce(\"aba\", \"a\", null)  \u003d \"aba\"\n     * StringUtils.replaceOnce(\"aba\", \"a\", \"\")    \u003d \"ba\"\n     * StringUtils.replaceOnce(\"aba\", \"a\", \"z\")   \u003d \"zba\"\n     * \u003c/pre\u003e\n     *\n     * @see #replace(String text, String searchString, String replacement, int max)\n     * @param text  text to search and replace in, may be null\n     * @param searchString  the String to search for, may be null\n     * @param replacement  the String to replace with, may be null\n     * @return the text with any replacements processed,\n     *  {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 3686,col 9)-(line 3686,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replace(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 3712,
      "end_line": 3714,
      "comment": "\n     * \u003cp\u003eReplaces all occurrences of a String within another String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} reference passed to this method is a no-op.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replace(null, *, *)        \u003d null\n     * StringUtils.replace(\"\", *, *)          \u003d \"\"\n     * StringUtils.replace(\"any\", null, *)    \u003d \"any\"\n     * StringUtils.replace(\"any\", *, null)    \u003d \"any\"\n     * StringUtils.replace(\"any\", \"\", *)      \u003d \"any\"\n     * StringUtils.replace(\"aba\", \"a\", null)  \u003d \"aba\"\n     * StringUtils.replace(\"aba\", \"a\", \"\")    \u003d \"b\"\n     * StringUtils.replace(\"aba\", \"a\", \"z\")   \u003d \"zbz\"\n     * \u003c/pre\u003e\n     *\n     * @see #replace(String text, String searchString, String replacement, int max)\n     * @param text  text to search and replace in, may be null\n     * @param searchString  the String to search for, may be null\n     * @param replacement  the String to replace it with, may be null\n     * @return the text with any replacements processed,\n     *  {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 3713,col 9)-(line 3713,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replace(java.lang.String, java.lang.String, java.lang.String, int)",
      "begin_line": 3744,
      "end_line": 3768,
      "comment": "\n     * \u003cp\u003eReplaces a String with another String inside a larger String,\n     * for the first {@code max} values of the search String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} reference passed to this method is a no-op.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replace(null, *, *, *)         \u003d null\n     * StringUtils.replace(\"\", *, *, *)           \u003d \"\"\n     * StringUtils.replace(\"any\", null, *, *)     \u003d \"any\"\n     * StringUtils.replace(\"any\", *, null, *)     \u003d \"any\"\n     * StringUtils.replace(\"any\", \"\", *, *)       \u003d \"any\"\n     * StringUtils.replace(\"any\", *, *, 0)        \u003d \"any\"\n     * StringUtils.replace(\"abaa\", \"a\", null, -1) \u003d \"abaa\"\n     * StringUtils.replace(\"abaa\", \"a\", \"\", -1)   \u003d \"b\"\n     * StringUtils.replace(\"abaa\", \"a\", \"z\", 0)   \u003d \"abaa\"\n     * StringUtils.replace(\"abaa\", \"a\", \"z\", 1)   \u003d \"zbaa\"\n     * StringUtils.replace(\"abaa\", \"a\", \"z\", 2)   \u003d \"zbza\"\n     * StringUtils.replace(\"abaa\", \"a\", \"z\", -1)  \u003d \"zbzz\"\n     * \u003c/pre\u003e\n     *\n     * @param text  text to search and replace in, may be null\n     * @param searchString  the String to search for, may be null\n     * @param replacement  the String to replace it with, may be null\n     * @param max  maximum number of values to replace, or {@code -1} if no maximum\n     * @return the text with any replacements processed,\n     *  {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 3745,col 9)-(line 3747,col 9)",
        "(line 3748,col 9)-(line 3748,col 22)",
        "(line 3749,col 9)-(line 3749,col 52)",
        "(line 3750,col 9)-(line 3752,col 9)",
        "(line 3753,col 9)-(line 3753,col 47)",
        "(line 3754,col 9)-(line 3754,col 57)",
        "(line 3755,col 9)-(line 3755,col 47)",
        "(line 3756,col 9)-(line 3756,col 55)",
        "(line 3757,col 9)-(line 3757,col 72)",
        "(line 3758,col 9)-(line 3765,col 9)",
        "(line 3766,col 9)-(line 3766,col 42)",
        "(line 3767,col 9)-(line 3767,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replaceEach(java.lang.String, java.lang.String[], java.lang.String[])",
      "begin_line": 3809,
      "end_line": 3811,
      "comment": "\n     * \u003cp\u003e\n     * Replaces all occurrences of Strings within another String.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * A {@code null} reference passed to this method is a no-op, or if\n     * any \"search string\" or \"string to replace\" is null, that replace will be\n     * ignored. This will not repeat. For repeating replaces, call the\n     * overloaded method.\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *  StringUtils.replaceEach(null, *, *)        \u003d null\n     *  StringUtils.replaceEach(\"\", *, *)          \u003d \"\"\n     *  StringUtils.replaceEach(\"aba\", null, null) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[0], null) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", null, new String[0]) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, null)  \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, new String[]{\"\"})  \u003d \"b\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{null}, new String[]{\"a\"})  \u003d \"aba\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"w\", \"t\"})  \u003d \"wcte\"\n     *  (example of how it does not repeat)\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"t\"})  \u003d \"dcte\"\n     * \u003c/pre\u003e\n     *\n     * @param text\n     *            text to search and replace in, no-op if null\n     * @param searchList\n     *            the Strings to search for, no-op if null\n     * @param replacementList\n     *            the Strings to replace them with, no-op if null\n     * @return the text with any replacements processed, {@code null} if\n     *         null String input\n     * @throws IllegalArgumentException\n     *             if the lengths of the arrays are not the same (null is ok,\n     *             and/or size 0)\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3810,col 9)-(line 3810,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(java.lang.String, java.lang.String[], java.lang.String[])",
      "begin_line": 3857,
      "end_line": 3862,
      "comment": "\n     * \u003cp\u003e\n     * Replaces all occurrences of Strings within another String.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * A {@code null} reference passed to this method is a no-op, or if\n     * any \"search string\" or \"string to replace\" is null, that replace will be\n     * ignored. \n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *  StringUtils.replaceEach(null, *, *, *) \u003d null\n     *  StringUtils.replaceEach(\"\", *, *, *) \u003d \"\"\n     *  StringUtils.replaceEach(\"aba\", null, null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[0], null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", null, new String[0], *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, new String[]{\"\"}, *) \u003d \"b\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{null}, new String[]{\"a\"}, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"w\", \"t\"}, *) \u003d \"wcte\"\n     *  (example of how it repeats)\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"t\"}, false) \u003d \"dcte\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"t\"}, true) \u003d \"tcte\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"ab\"}, true) \u003d IllegalStateException\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"ab\"}, false) \u003d \"dcabe\"\n     * \u003c/pre\u003e\n     *\n     * @param text\n     *            text to search and replace in, no-op if null\n     * @param searchList\n     *            the Strings to search for, no-op if null\n     * @param replacementList\n     *            the Strings to replace them with, no-op if null\n     * @return the text with any replacements processed, {@code null} if\n     *         null String input\n     * @throws IllegalStateException\n     *             if the search is repeating and there is an endless loop due\n     *             to outputs of one being inputs to another\n     * @throws IllegalArgumentException\n     *             if the lengths of the arrays are not the same (null is ok,\n     *             and/or size 0)\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3860,col 9)-(line 3860,col 68)",
        "(line 3861,col 9)-(line 3861,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replaceEach(java.lang.String, java.lang.String[], java.lang.String[], boolean, int)",
      "begin_line": 3912,
      "end_line": 4038,
      "comment": "\n     * \u003cp\u003e\n     * Replaces all occurrences of Strings within another String.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * A {@code null} reference passed to this method is a no-op, or if\n     * any \"search string\" or \"string to replace\" is null, that replace will be\n     * ignored.\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     *  StringUtils.replaceEach(null, *, *, *) \u003d null\n     *  StringUtils.replaceEach(\"\", *, *, *) \u003d \"\"\n     *  StringUtils.replaceEach(\"aba\", null, null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[0], null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", null, new String[0], *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, new String[]{\"\"}, *) \u003d \"b\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{null}, new String[]{\"a\"}, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"w\", \"t\"}, *) \u003d \"wcte\"\n     *  (example of how it repeats)\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"t\"}, false) \u003d \"dcte\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"t\"}, true) \u003d \"tcte\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"ab\"}, *) \u003d IllegalStateException\n     * \u003c/pre\u003e\n     *\n     * @param text\n     *            text to search and replace in, no-op if null\n     * @param searchList\n     *            the Strings to search for, no-op if null\n     * @param replacementList\n     *            the Strings to replace them with, no-op if null\n     * @param repeat if true, then replace repeatedly\n     *       until there are no more possible replacements or timeToLive \u003c 0\n     * @param timeToLive\n     *            if less than 0 then there is a circular reference and endless\n     *            loop\n     * @return the text with any replacements processed, {@code null} if\n     *         null String input\n     * @throws IllegalStateException\n     *             if the search is repeating and there is an endless loop due\n     *             to outputs of one being inputs to another\n     * @throws IllegalArgumentException\n     *             if the lengths of the arrays are not the same (null is ok,\n     *             and/or size 0)\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3918,col 9)-(line 3921,col 9)",
        "(line 3924,col 9)-(line 3927,col 9)",
        "(line 3929,col 9)-(line 3929,col 45)",
        "(line 3930,col 9)-(line 3930,col 55)",
        "(line 3933,col 9)-(line 3938,col 9)",
        "(line 3941,col 9)-(line 3941,col 72)",
        "(line 3944,col 9)-(line 3944,col 27)",
        "(line 3945,col 9)-(line 3945,col 30)",
        "(line 3946,col 9)-(line 3946,col 27)",
        "(line 3950,col 9)-(line 3966,col 9)",
        "(line 3970,col 9)-(line 3972,col 9)",
        "(line 3974,col 9)-(line 3974,col 22)",
        "(line 3977,col 9)-(line 3977,col 25)",
        "(line 3980,col 9)-(line 3988,col 9)",
        "(line 3990,col 9)-(line 3990,col 57)",
        "(line 3992,col 9)-(line 3992,col 72)",
        "(line 3994,col 9)-(line 4027,col 9)",
        "(line 4028,col 9)-(line 4028,col 39)",
        "(line 4029,col 9)-(line 4031,col 9)",
        "(line 4032,col 9)-(line 4032,col 39)",
        "(line 4033,col 9)-(line 4035,col 9)",
        "(line 4037,col 9)-(line 4037,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replaceChars(java.lang.String, char, char)",
      "begin_line": 4062,
      "end_line": 4067,
      "comment": "\n     * \u003cp\u003eReplaces all occurrences of a character in a String with another.\n     * This is a null-safe version of {@link String#replace(char, char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} string input returns {@code null}.\n     * An empty (\"\") string input returns an empty string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replaceChars(null, *, *)        \u003d null\n     * StringUtils.replaceChars(\"\", *, *)          \u003d \"\"\n     * StringUtils.replaceChars(\"abcba\", \u0027b\u0027, \u0027y\u0027) \u003d \"aycya\"\n     * StringUtils.replaceChars(\"abcba\", \u0027z\u0027, \u0027y\u0027) \u003d \"abcba\"\n     * \u003c/pre\u003e\n     *\n     * @param str  String to replace characters in, may be null\n     * @param searchChar  the character to search for, may be null\n     * @param replaceChar  the character to replace, may be null\n     * @return modified String, {@code null} if null string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4063,col 9)-(line 4065,col 9)",
        "(line 4066,col 9)-(line 4066,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.replaceChars(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 4105,
      "end_line": 4132,
      "comment": "\n     * \u003cp\u003eReplaces multiple characters in a String in one go.\n     * This method can also be used to delete characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example:\u003cbr /\u003e\n     * \u003ccode\u003ereplaceChars(\u0026quot;hello\u0026quot;, \u0026quot;ho\u0026quot;, \u0026quot;jy\u0026quot;) \u003d jelly\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} string input returns {@code null}.\n     * An empty (\"\") string input returns an empty string.\n     * A null or empty set of search characters returns the input string.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe length of the search characters should normally equal the length\n     * of the replace characters.\n     * If the search characters is longer, then the extra search characters\n     * are deleted.\n     * If the search characters is shorter, then the extra replace characters\n     * are ignored.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replaceChars(null, *, *)           \u003d null\n     * StringUtils.replaceChars(\"\", *, *)             \u003d \"\"\n     * StringUtils.replaceChars(\"abc\", null, *)       \u003d \"abc\"\n     * StringUtils.replaceChars(\"abc\", \"\", *)         \u003d \"abc\"\n     * StringUtils.replaceChars(\"abc\", \"b\", null)     \u003d \"ac\"\n     * StringUtils.replaceChars(\"abc\", \"b\", \"\")       \u003d \"ac\"\n     * StringUtils.replaceChars(\"abcba\", \"bc\", \"yz\")  \u003d \"ayzya\"\n     * StringUtils.replaceChars(\"abcba\", \"bc\", \"y\")   \u003d \"ayya\"\n     * StringUtils.replaceChars(\"abcba\", \"bc\", \"yzx\") \u003d \"ayzya\"\n     * \u003c/pre\u003e\n     *\n     * @param str  String to replace characters in, may be null\n     * @param searchChars  a set of characters to search for, may be null\n     * @param replaceChars  a set of characters to replace, may be null\n     * @return modified String, {@code null} if null string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4106,col 9)-(line 4108,col 9)",
        "(line 4109,col 9)-(line 4111,col 9)",
        "(line 4112,col 9)-(line 4112,col 33)",
        "(line 4113,col 9)-(line 4113,col 55)",
        "(line 4114,col 9)-(line 4114,col 37)",
        "(line 4115,col 9)-(line 4115,col 57)",
        "(line 4116,col 9)-(line 4127,col 9)",
        "(line 4128,col 9)-(line 4130,col 9)",
        "(line 4131,col 9)-(line 4131,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.overlay(java.lang.String, java.lang.String, int, int)",
      "begin_line": 4165,
      "end_line": 4195,
      "comment": "\n     * \u003cp\u003eOverlays part of a String with another String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} string input returns {@code null}.\n     * A negative index is treated as zero.\n     * An index greater than the string length is treated as the string length.\n     * The start index is always the smaller of the two indices.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.overlay(null, *, *, *)            \u003d null\n     * StringUtils.overlay(\"\", \"abc\", 0, 0)          \u003d \"abc\"\n     * StringUtils.overlay(\"abcdef\", null, 2, 4)     \u003d \"abef\"\n     * StringUtils.overlay(\"abcdef\", \"\", 2, 4)       \u003d \"abef\"\n     * StringUtils.overlay(\"abcdef\", \"\", 4, 2)       \u003d \"abef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", 2, 4)   \u003d \"abzzzzef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", 4, 2)   \u003d \"abzzzzef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", -1, 4)  \u003d \"zzzzef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", 2, 8)   \u003d \"abzzzz\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", -2, -3) \u003d \"zzzzabcdef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", 8, 10)  \u003d \"abcdefzzzz\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to do overlaying in, may be null\n     * @param overlay  the String to overlay, may be null\n     * @param start  the position to start overlaying at\n     * @param end  the position to stop overlaying before\n     * @return overlayed String, {@code null} if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4166,col 9)-(line 4168,col 9)",
        "(line 4169,col 9)-(line 4171,col 9)",
        "(line 4172,col 9)-(line 4172,col 31)",
        "(line 4173,col 9)-(line 4175,col 9)",
        "(line 4176,col 9)-(line 4178,col 9)",
        "(line 4179,col 9)-(line 4181,col 9)",
        "(line 4182,col 9)-(line 4184,col 9)",
        "(line 4185,col 9)-(line 4189,col 9)",
        "(line 4190,col 9)-(line 4194,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.chomp(java.lang.String)",
      "begin_line": 4224,
      "end_line": 4248,
      "comment": "\n     * \u003cp\u003eRemoves one newline from end of a String if it\u0027s there,\n     * otherwise leave it alone.  A newline is \u0026quot;{@code \\n}\u0026quot;,\n     * \u0026quot;{@code \\r}\u0026quot;, or \u0026quot;{@code \\r\\n}\u0026quot;.\u003c/p\u003e\n     *\n     * \u003cp\u003eNOTE: This method changed in 2.0.\n     * It now more closely matches Perl chomp.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.chomp(null)          \u003d null\n     * StringUtils.chomp(\"\")            \u003d \"\"\n     * StringUtils.chomp(\"abc \\r\")      \u003d \"abc \"\n     * StringUtils.chomp(\"abc\\n\")       \u003d \"abc\"\n     * StringUtils.chomp(\"abc\\r\\n\")     \u003d \"abc\"\n     * StringUtils.chomp(\"abc\\r\\n\\r\\n\") \u003d \"abc\\r\\n\"\n     * StringUtils.chomp(\"abc\\n\\r\")     \u003d \"abc\\n\"\n     * StringUtils.chomp(\"abc\\n\\rabc\")  \u003d \"abc\\n\\rabc\"\n     * StringUtils.chomp(\"\\r\")          \u003d \"\"\n     * StringUtils.chomp(\"\\n\")          \u003d \"\"\n     * StringUtils.chomp(\"\\r\\n\")        \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to chomp a newline from, may be null\n     * @return String without newline, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 4225,col 9)-(line 4227,col 9)",
        "(line 4229,col 9)-(line 4235,col 9)",
        "(line 4237,col 9)-(line 4237,col 39)",
        "(line 4238,col 9)-(line 4238,col 40)",
        "(line 4240,col 9)-(line 4246,col 9)",
        "(line 4247,col 9)-(line 4247,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.chomp(java.lang.String, java.lang.String)",
      "begin_line": 4277,
      "end_line": 4280,
      "comment": "\n     * \u003cp\u003eRemoves {@code separator} from the end of\n     * {@code str} if it\u0027s there, otherwise leave it alone.\u003c/p\u003e\n     *\n     * \u003cp\u003eNOTE: This method changed in version 2.0.\n     * It now more closely matches Perl chomp.\n     * For the previous behavior, use {@link #substringBeforeLast(String, String)}.\n     * This method uses {@link String#endsWith(String)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.chomp(null, *)         \u003d null\n     * StringUtils.chomp(\"\", *)           \u003d \"\"\n     * StringUtils.chomp(\"foobar\", \"bar\") \u003d \"foo\"\n     * StringUtils.chomp(\"foobar\", \"baz\") \u003d \"foobar\"\n     * StringUtils.chomp(\"foo\", \"foo\")    \u003d \"\"\n     * StringUtils.chomp(\"foo \", \"foo\")   \u003d \"foo \"\n     * StringUtils.chomp(\" foo\", \"foo\")   \u003d \" \"\n     * StringUtils.chomp(\"foo\", \"foooo\")  \u003d \"foo\"\n     * StringUtils.chomp(\"foo\", \"\")       \u003d \"foo\"\n     * StringUtils.chomp(\"foo\", null)     \u003d \"foo\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to chomp from, may be null\n     * @param separator  separator String, may be null\n     * @return String without trailing separator, {@code null} if null String input\n     * @deprecated This feature will be removed in Lang 4.0, use {@link StringUtils#removeEnd(String, String)} instead\n     ",
      "child_ranges": [
        "(line 4279,col 9)-(line 4279,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.chop(java.lang.String)",
      "begin_line": 4307,
      "end_line": 4322,
      "comment": "\n     * \u003cp\u003eRemove the last character from a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the String ends in {@code \\r\\n}, then remove both\n     * of them.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.chop(null)          \u003d null\n     * StringUtils.chop(\"\")            \u003d \"\"\n     * StringUtils.chop(\"abc \\r\")      \u003d \"abc \"\n     * StringUtils.chop(\"abc\\n\")       \u003d \"abc\"\n     * StringUtils.chop(\"abc\\r\\n\")     \u003d \"abc\"\n     * StringUtils.chop(\"abc\")         \u003d \"ab\"\n     * StringUtils.chop(\"abc\\nabc\")    \u003d \"abc\\nab\"\n     * StringUtils.chop(\"a\")           \u003d \"\"\n     * StringUtils.chop(\"\\r\")          \u003d \"\"\n     * StringUtils.chop(\"\\n\")          \u003d \"\"\n     * StringUtils.chop(\"\\r\\n\")        \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to chop last character from, may be null\n     * @return String without last character, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 4308,col 9)-(line 4310,col 9)",
        "(line 4311,col 9)-(line 4311,col 34)",
        "(line 4312,col 9)-(line 4314,col 9)",
        "(line 4315,col 9)-(line 4315,col 33)",
        "(line 4316,col 9)-(line 4316,col 47)",
        "(line 4317,col 9)-(line 4317,col 40)",
        "(line 4318,col 9)-(line 4320,col 9)",
        "(line 4321,col 9)-(line 4321,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.repeat(java.lang.String, int)",
      "begin_line": 4347,
      "end_line": 4384,
      "comment": "\n     * \u003cp\u003eRepeat a String {@code repeat} times to form a\n     * new String.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.repeat(null, 2) \u003d null\n     * StringUtils.repeat(\"\", 0)   \u003d \"\"\n     * StringUtils.repeat(\"\", 2)   \u003d \"\"\n     * StringUtils.repeat(\"a\", 3)  \u003d \"aaa\"\n     * StringUtils.repeat(\"ab\", 2) \u003d \"abab\"\n     * StringUtils.repeat(\"a\", -2) \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to repeat, may be null\n     * @param repeat  number of times to repeat str, negative treated as zero\n     * @return a new String consisting of the original String repeated,\n     *  {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 4350,col 9)-(line 4352,col 9)",
        "(line 4353,col 9)-(line 4355,col 9)",
        "(line 4356,col 9)-(line 4356,col 39)",
        "(line 4357,col 9)-(line 4359,col 9)",
        "(line 4360,col 9)-(line 4362,col 9)",
        "(line 4364,col 9)-(line 4364,col 48)",
        "(line 4365,col 9)-(line 4383,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.repeat(java.lang.String, java.lang.String, int)",
      "begin_line": 4406,
      "end_line": 4414,
      "comment": "\n     * \u003cp\u003eRepeat a String {@code repeat} times to form a\n     * new String, with a String separator injected each time. \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.repeat(null, null, 2) \u003d null\n     * StringUtils.repeat(null, \"x\", 2)  \u003d null\n     * StringUtils.repeat(\"\", null, 0)   \u003d \"\"\n     * StringUtils.repeat(\"\", \"\", 2)     \u003d \"\"\n     * StringUtils.repeat(\"\", \"x\", 3)    \u003d \"xxx\"\n     * StringUtils.repeat(\"?\", \", \", 3)  \u003d \"?, ?, ?\"\n     * \u003c/pre\u003e\n     *\n     * @param str        the String to repeat, may be null\n     * @param separator  the String to inject, may be null\n     * @param repeat     number of times to repeat str, negative treated as zero\n     * @return a new String consisting of the original String repeated,\n     *  {@code null} if null String input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 4407,col 9)-(line 4413,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.repeat(char, int)",
      "begin_line": 4438,
      "end_line": 4444,
      "comment": "\n     * \u003cp\u003eReturns padding using the specified delimiter repeated\n     * to a given length.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.repeat(0, \u0027e\u0027)  \u003d \"\"\n     * StringUtils.repeat(3, \u0027e\u0027)  \u003d \"eee\"\n     * StringUtils.repeat(-2, \u0027e\u0027) \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eNote: this method doesn\u0027t not support padding with\n     * \u003ca href\u003d\"http://www.unicode.org/glossary/#supplementary_character\"\u003eUnicode Supplementary Characters\u003c/a\u003e\n     * as they require a pair of {@code char}s to be represented.\n     * If you are needing to support full I18N of your applications\n     * consider using {@link #repeat(String, int)} instead.\n     * \u003c/p\u003e\n     *\n     * @param ch  character to repeat\n     * @param repeat  number of times to repeat char, negative treated as zero\n     * @return String with repeated character\n     * @see #repeat(String, int)\n     ",
      "child_ranges": [
        "(line 4439,col 9)-(line 4439,col 38)",
        "(line 4440,col 9)-(line 4442,col 9)",
        "(line 4443,col 9)-(line 4443,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.rightPad(java.lang.String, int)",
      "begin_line": 4465,
      "end_line": 4467,
      "comment": "\n     * \u003cp\u003eRight pad a String with spaces (\u0027 \u0027).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is padded to the size of {@code size}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.rightPad(null, *)   \u003d null\n     * StringUtils.rightPad(\"\", 3)     \u003d \"   \"\n     * StringUtils.rightPad(\"bat\", 3)  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", 5)  \u003d \"bat  \"\n     * StringUtils.rightPad(\"bat\", 1)  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", -1) \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @return right padded String or original String if no padding is necessary,\n     *  {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 4466,col 9)-(line 4466,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.rightPad(java.lang.String, int, char)",
      "begin_line": 4490,
      "end_line": 4502,
      "comment": "\n     * \u003cp\u003eRight pad a String with a specified character.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is padded to the size of {@code size}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.rightPad(null, *, *)     \u003d null\n     * StringUtils.rightPad(\"\", 3, \u0027z\u0027)     \u003d \"zzz\"\n     * StringUtils.rightPad(\"bat\", 3, \u0027z\u0027)  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", 5, \u0027z\u0027)  \u003d \"batzz\"\n     * StringUtils.rightPad(\"bat\", 1, \u0027z\u0027)  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", -1, \u0027z\u0027) \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @param padChar  the character to pad with\n     * @return right padded String or original String if no padding is necessary,\n     *  {@code null} if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4491,col 9)-(line 4493,col 9)",
        "(line 4494,col 9)-(line 4494,col 39)",
        "(line 4495,col 9)-(line 4497,col 9)",
        "(line 4498,col 9)-(line 4500,col 9)",
        "(line 4501,col 9)-(line 4501,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.rightPad(java.lang.String, int, java.lang.String)",
      "begin_line": 4527,
      "end_line": 4556,
      "comment": "\n     * \u003cp\u003eRight pad a String with a specified String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is padded to the size of {@code size}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.rightPad(null, *, *)      \u003d null\n     * StringUtils.rightPad(\"\", 3, \"z\")      \u003d \"zzz\"\n     * StringUtils.rightPad(\"bat\", 3, \"yz\")  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", 5, \"yz\")  \u003d \"batyz\"\n     * StringUtils.rightPad(\"bat\", 8, \"yz\")  \u003d \"batyzyzy\"\n     * StringUtils.rightPad(\"bat\", 1, \"yz\")  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", -1, \"yz\") \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", 5, null)  \u003d \"bat  \"\n     * StringUtils.rightPad(\"bat\", 5, \"\")    \u003d \"bat  \"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @param padStr  the String to pad with, null or empty treated as single space\n     * @return right padded String or original String if no padding is necessary,\n     *  {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 4528,col 9)-(line 4530,col 9)",
        "(line 4531,col 9)-(line 4533,col 9)",
        "(line 4534,col 9)-(line 4534,col 37)",
        "(line 4535,col 9)-(line 4535,col 34)",
        "(line 4536,col 9)-(line 4536,col 33)",
        "(line 4537,col 9)-(line 4539,col 9)",
        "(line 4540,col 9)-(line 4542,col 9)",
        "(line 4544,col 9)-(line 4555,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.leftPad(java.lang.String, int)",
      "begin_line": 4577,
      "end_line": 4579,
      "comment": "\n     * \u003cp\u003eLeft pad a String with spaces (\u0027 \u0027).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is padded to the size of {@code size}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.leftPad(null, *)   \u003d null\n     * StringUtils.leftPad(\"\", 3)     \u003d \"   \"\n     * StringUtils.leftPad(\"bat\", 3)  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", 5)  \u003d \"  bat\"\n     * StringUtils.leftPad(\"bat\", 1)  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", -1) \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @return left padded String or original String if no padding is necessary,\n     *  {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 4578,col 9)-(line 4578,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.leftPad(java.lang.String, int, char)",
      "begin_line": 4602,
      "end_line": 4614,
      "comment": "\n     * \u003cp\u003eLeft pad a String with a specified character.\u003c/p\u003e\n     *\n     * \u003cp\u003ePad to a size of {@code size}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.leftPad(null, *, *)     \u003d null\n     * StringUtils.leftPad(\"\", 3, \u0027z\u0027)     \u003d \"zzz\"\n     * StringUtils.leftPad(\"bat\", 3, \u0027z\u0027)  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", 5, \u0027z\u0027)  \u003d \"zzbat\"\n     * StringUtils.leftPad(\"bat\", 1, \u0027z\u0027)  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", -1, \u0027z\u0027) \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @param padChar  the character to pad with\n     * @return left padded String or original String if no padding is necessary,\n     *  {@code null} if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4603,col 9)-(line 4605,col 9)",
        "(line 4606,col 9)-(line 4606,col 39)",
        "(line 4607,col 9)-(line 4609,col 9)",
        "(line 4610,col 9)-(line 4612,col 9)",
        "(line 4613,col 9)-(line 4613,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.leftPad(java.lang.String, int, java.lang.String)",
      "begin_line": 4639,
      "end_line": 4668,
      "comment": "\n     * \u003cp\u003eLeft pad a String with a specified String.\u003c/p\u003e\n     *\n     * \u003cp\u003ePad to a size of {@code size}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.leftPad(null, *, *)      \u003d null\n     * StringUtils.leftPad(\"\", 3, \"z\")      \u003d \"zzz\"\n     * StringUtils.leftPad(\"bat\", 3, \"yz\")  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", 5, \"yz\")  \u003d \"yzbat\"\n     * StringUtils.leftPad(\"bat\", 8, \"yz\")  \u003d \"yzyzybat\"\n     * StringUtils.leftPad(\"bat\", 1, \"yz\")  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", -1, \"yz\") \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", 5, null)  \u003d \"  bat\"\n     * StringUtils.leftPad(\"bat\", 5, \"\")    \u003d \"  bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @param padStr  the String to pad with, null or empty treated as single space\n     * @return left padded String or original String if no padding is necessary,\n     *  {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 4640,col 9)-(line 4642,col 9)",
        "(line 4643,col 9)-(line 4645,col 9)",
        "(line 4646,col 9)-(line 4646,col 37)",
        "(line 4647,col 9)-(line 4647,col 34)",
        "(line 4648,col 9)-(line 4648,col 33)",
        "(line 4649,col 9)-(line 4651,col 9)",
        "(line 4652,col 9)-(line 4654,col 9)",
        "(line 4656,col 9)-(line 4667,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.length(java.lang.CharSequence)",
      "begin_line": 4681,
      "end_line": 4683,
      "comment": "\n     * Gets a CharSequence length or {@code 0} if the CharSequence is\n     * {@code null}.\n     *\n     * @param cs\n     *            a CharSequence or {@code null}\n     * @return CharSequence length or {@code 0} if the CharSequence is\n     *         {@code null}.\n     * @since 2.4\n     * @since 3.0 Changed signature from length(String) to length(CharSequence)\n     ",
      "child_ranges": [
        "(line 4682,col 9)-(line 4682,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.center(java.lang.String, int)",
      "begin_line": 4710,
      "end_line": 4712,
      "comment": "\n     * \u003cp\u003eCenters a String in a larger String of size {@code size}\n     * using the space character (\u0027 \u0027).\u003cp\u003e\n     *\n     * \u003cp\u003eIf the size is less than the String length, the String is returned.\n     * A {@code null} String returns {@code null}.\n     * A negative size is treated as zero.\u003c/p\u003e\n     *\n     * \u003cp\u003eEquivalent to {@code center(str, size, \" \")}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.center(null, *)   \u003d null\n     * StringUtils.center(\"\", 4)     \u003d \"    \"\n     * StringUtils.center(\"ab\", -1)  \u003d \"ab\"\n     * StringUtils.center(\"ab\", 4)   \u003d \" ab \"\n     * StringUtils.center(\"abcd\", 2) \u003d \"abcd\"\n     * StringUtils.center(\"a\", 4)    \u003d \" a  \"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to center, may be null\n     * @param size  the int size of new String, negative treated as zero\n     * @return centered String, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 4711,col 9)-(line 4711,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.center(java.lang.String, int, char)",
      "begin_line": 4738,
      "end_line": 4750,
      "comment": "\n     * \u003cp\u003eCenters a String in a larger String of size {@code size}.\n     * Uses a supplied character as the value to pad the String with.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the size is less than the String length, the String is returned.\n     * A {@code null} String returns {@code null}.\n     * A negative size is treated as zero.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.center(null, *, *)     \u003d null\n     * StringUtils.center(\"\", 4, \u0027 \u0027)     \u003d \"    \"\n     * StringUtils.center(\"ab\", -1, \u0027 \u0027)  \u003d \"ab\"\n     * StringUtils.center(\"ab\", 4, \u0027 \u0027)   \u003d \" ab\"\n     * StringUtils.center(\"abcd\", 2, \u0027 \u0027) \u003d \"abcd\"\n     * StringUtils.center(\"a\", 4, \u0027 \u0027)    \u003d \" a  \"\n     * StringUtils.center(\"a\", 4, \u0027y\u0027)    \u003d \"yayy\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to center, may be null\n     * @param size  the int size of new String, negative treated as zero\n     * @param padChar  the character to pad the new String with\n     * @return centered String, {@code null} if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4739,col 9)-(line 4741,col 9)",
        "(line 4742,col 9)-(line 4742,col 34)",
        "(line 4743,col 9)-(line 4743,col 33)",
        "(line 4744,col 9)-(line 4746,col 9)",
        "(line 4747,col 9)-(line 4747,col 55)",
        "(line 4748,col 9)-(line 4748,col 43)",
        "(line 4749,col 9)-(line 4749,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.center(java.lang.String, int, java.lang.String)",
      "begin_line": 4778,
      "end_line": 4793,
      "comment": "\n     * \u003cp\u003eCenters a String in a larger String of size {@code size}.\n     * Uses a supplied String as the value to pad the String with.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the size is less than the String length, the String is returned.\n     * A {@code null} String returns {@code null}.\n     * A negative size is treated as zero.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.center(null, *, *)     \u003d null\n     * StringUtils.center(\"\", 4, \" \")     \u003d \"    \"\n     * StringUtils.center(\"ab\", -1, \" \")  \u003d \"ab\"\n     * StringUtils.center(\"ab\", 4, \" \")   \u003d \" ab\"\n     * StringUtils.center(\"abcd\", 2, \" \") \u003d \"abcd\"\n     * StringUtils.center(\"a\", 4, \" \")    \u003d \" a  \"\n     * StringUtils.center(\"a\", 4, \"yz\")   \u003d \"yayz\"\n     * StringUtils.center(\"abc\", 7, null) \u003d \"  abc  \"\n     * StringUtils.center(\"abc\", 7, \"\")   \u003d \"  abc  \"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to center, may be null\n     * @param size  the int size of new String, negative treated as zero\n     * @param padStr  the String to pad the new String with, must not be null or empty\n     * @return centered String, {@code null} if null String input\n     * @throws IllegalArgumentException if padStr is {@code null} or empty\n     ",
      "child_ranges": [
        "(line 4779,col 9)-(line 4781,col 9)",
        "(line 4782,col 9)-(line 4784,col 9)",
        "(line 4785,col 9)-(line 4785,col 34)",
        "(line 4786,col 9)-(line 4786,col 33)",
        "(line 4787,col 9)-(line 4789,col 9)",
        "(line 4790,col 9)-(line 4790,col 54)",
        "(line 4791,col 9)-(line 4791,col 42)",
        "(line 4792,col 9)-(line 4792,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.upperCase(java.lang.String)",
      "begin_line": 4816,
      "end_line": 4821,
      "comment": "\n     * \u003cp\u003eConverts a String to upper case as per {@link String#toUpperCase()}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.upperCase(null)  \u003d null\n     * StringUtils.upperCase(\"\")    \u003d \"\"\n     * StringUtils.upperCase(\"aBc\") \u003d \"ABC\"\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003e\u003cstrong\u003eNote:\u003c/strong\u003e As described in the documentation for {@link String#toUpperCase()},\n     * the result of this method is affected by the current locale.\n     * For platform-independent case transformations, the method {@link #lowerCase(String, Locale)}\n     * should be used with a specific locale (e.g. {@link Locale#ENGLISH}).\u003c/p\u003e\n     *\n     * @param str  the String to upper case, may be null\n     * @return the upper cased String, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 4817,col 9)-(line 4819,col 9)",
        "(line 4820,col 9)-(line 4820,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.upperCase(java.lang.String, java.util.Locale)",
      "begin_line": 4839,
      "end_line": 4844,
      "comment": "\n     * \u003cp\u003eConverts a String to upper case as per {@link String#toUpperCase(Locale)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.upperCase(null, Locale.ENGLISH)  \u003d null\n     * StringUtils.upperCase(\"\", Locale.ENGLISH)    \u003d \"\"\n     * StringUtils.upperCase(\"aBc\", Locale.ENGLISH) \u003d \"ABC\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to upper case, may be null\n     * @param locale  the locale that defines the case transformation rules, must not be null\n     * @return the upper cased String, {@code null} if null String input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 4840,col 9)-(line 4842,col 9)",
        "(line 4843,col 9)-(line 4843,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lowerCase(java.lang.String)",
      "begin_line": 4865,
      "end_line": 4870,
      "comment": "\n     * \u003cp\u003eConverts a String to lower case as per {@link String#toLowerCase()}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lowerCase(null)  \u003d null\n     * StringUtils.lowerCase(\"\")    \u003d \"\"\n     * StringUtils.lowerCase(\"aBc\") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003e\u003cstrong\u003eNote:\u003c/strong\u003e As described in the documentation for {@link String#toLowerCase()},\n     * the result of this method is affected by the current locale.\n     * For platform-independent case transformations, the method {@link #lowerCase(String, Locale)}\n     * should be used with a specific locale (e.g. {@link Locale#ENGLISH}).\u003c/p\u003e\n     *\n     * @param str  the String to lower case, may be null\n     * @return the lower cased String, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 4866,col 9)-(line 4868,col 9)",
        "(line 4869,col 9)-(line 4869,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.lowerCase(java.lang.String, java.util.Locale)",
      "begin_line": 4888,
      "end_line": 4893,
      "comment": "\n     * \u003cp\u003eConverts a String to lower case as per {@link String#toLowerCase(Locale)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lowerCase(null, Locale.ENGLISH)  \u003d null\n     * StringUtils.lowerCase(\"\", Locale.ENGLISH)    \u003d \"\"\n     * StringUtils.lowerCase(\"aBc\", Locale.ENGLISH) \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to lower case, may be null\n     * @param locale  the locale that defines the case transformation rules, must not be null\n     * @return the lower cased String, {@code null} if null String input\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 4889,col 9)-(line 4891,col 9)",
        "(line 4892,col 9)-(line 4892,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.capitalize(java.lang.String)",
      "begin_line": 4915,
      "end_line": 4924,
      "comment": "\n     * \u003cp\u003eCapitalizes a String changing the first letter to title case as\n     * per {@link Character#toTitleCase(char)}. No other letters are changed.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor a word based algorithm, see {@link org.apache.commons.lang3.text.WordUtils#capitalize(String)}.\n     * A {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.capitalize(null)  \u003d null\n     * StringUtils.capitalize(\"\")    \u003d \"\"\n     * StringUtils.capitalize(\"cat\") \u003d \"Cat\"\n     * StringUtils.capitalize(\"cAt\") \u003d \"CAt\"\n     * \u003c/pre\u003e\n     *\n     * @param str the String to capitalize, may be null\n     * @return the capitalized String, {@code null} if null String input\n     * @see org.apache.commons.lang3.text.WordUtils#capitalize(String)\n     * @see #uncapitalize(String)\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4916,col 9)-(line 4916,col 19)",
        "(line 4917,col 9)-(line 4919,col 9)",
        "(line 4920,col 9)-(line 4923,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.uncapitalize(java.lang.String)",
      "begin_line": 4946,
      "end_line": 4955,
      "comment": "\n     * \u003cp\u003eUncapitalizes a String changing the first letter to title case as\n     * per {@link Character#toLowerCase(char)}. No other letters are changed.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor a word based algorithm, see {@link org.apache.commons.lang3.text.WordUtils#uncapitalize(String)}.\n     * A {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.uncapitalize(null)  \u003d null\n     * StringUtils.uncapitalize(\"\")    \u003d \"\"\n     * StringUtils.uncapitalize(\"Cat\") \u003d \"cat\"\n     * StringUtils.uncapitalize(\"CAT\") \u003d \"cAT\"\n     * \u003c/pre\u003e\n     *\n     * @param str the String to uncapitalize, may be null\n     * @return the uncapitalized String, {@code null} if null String input\n     * @see org.apache.commons.lang3.text.WordUtils#uncapitalize(String)\n     * @see #capitalize(String)\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4947,col 9)-(line 4947,col 19)",
        "(line 4948,col 9)-(line 4950,col 9)",
        "(line 4951,col 9)-(line 4954,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.swapCase(java.lang.String)",
      "begin_line": 4984,
      "end_line": 5002,
      "comment": "\n     * \u003cp\u003eSwaps the case of a String changing upper and title case to\n     * lower case, and lower case to upper case.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     *  \u003cli\u003eUpper case character converts to Lower case\u003c/li\u003e\n     *  \u003cli\u003eTitle case character converts to Lower case\u003c/li\u003e\n     *  \u003cli\u003eLower case character converts to Upper case\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eFor a word based algorithm, see {@link org.apache.commons.lang3.text.WordUtils#swapCase(String)}.\n     * A {@code null} input String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.swapCase(null)                 \u003d null\n     * StringUtils.swapCase(\"\")                   \u003d \"\"\n     * StringUtils.swapCase(\"The dog has a BONE\") \u003d \"tHE DOG HAS A bone\"\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eNOTE: This method changed in Lang version 2.0.\n     * It no longer performs a word based algorithm.\n     * If you only use ASCII, you will notice no change.\n     * That functionality is available in org.apache.commons.lang3.text.WordUtils.\u003c/p\u003e\n     *\n     * @param str  the String to swap case, may be null\n     * @return the changed String, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 4985,col 9)-(line 4987,col 9)",
        "(line 4989,col 9)-(line 4989,col 42)",
        "(line 4991,col 9)-(line 5000,col 9)",
        "(line 5001,col 9)-(line 5001,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.countMatches(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 5026,
      "end_line": 5037,
      "comment": "\n     * \u003cp\u003eCounts how many times the substring appears in the larger string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} or empty (\"\") String input returns {@code 0}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.countMatches(null, *)       \u003d 0\n     * StringUtils.countMatches(\"\", *)         \u003d 0\n     * StringUtils.countMatches(\"abba\", null)  \u003d 0\n     * StringUtils.countMatches(\"abba\", \"\")    \u003d 0\n     * StringUtils.countMatches(\"abba\", \"a\")   \u003d 2\n     * StringUtils.countMatches(\"abba\", \"ab\")  \u003d 1\n     * StringUtils.countMatches(\"abba\", \"xxx\") \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param str  the CharSequence to check, may be null\n     * @param sub  the substring to count, may be null\n     * @return the number of occurrences, 0 if either CharSequence is {@code null}\n     * @since 3.0 Changed signature from countMatches(String, String) to countMatches(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 5027,col 9)-(line 5029,col 9)",
        "(line 5030,col 9)-(line 5030,col 22)",
        "(line 5031,col 9)-(line 5031,col 20)",
        "(line 5032,col 9)-(line 5035,col 9)",
        "(line 5036,col 9)-(line 5036,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAlpha(java.lang.CharSequence)",
      "begin_line": 5061,
      "end_line": 5072,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only Unicode letters.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null} will return {@code false}.\n     * An empty CharSequence (length()\u003d0) will return {@code false}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAlpha(null)   \u003d false\n     * StringUtils.isAlpha(\"\")     \u003d false\n     * StringUtils.isAlpha(\"  \")   \u003d false\n     * StringUtils.isAlpha(\"abc\")  \u003d true\n     * StringUtils.isAlpha(\"ab2c\") \u003d false\n     * StringUtils.isAlpha(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return {@code true} if only contains letters, and is non-null\n     * @since 3.0 Changed signature from isAlpha(String) to isAlpha(CharSequence)\n     * @since 3.0 Changed \"\" to return false and not true\n     ",
      "child_ranges": [
        "(line 5062,col 9)-(line 5064,col 9)",
        "(line 5065,col 9)-(line 5065,col 29)",
        "(line 5066,col 9)-(line 5070,col 9)",
        "(line 5071,col 9)-(line 5071,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAlphaSpace(java.lang.CharSequence)",
      "begin_line": 5096,
      "end_line": 5107,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only Unicode letters and\n     * space (\u0027 \u0027).\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null} will return {@code false}\n     * An empty CharSequence (length()\u003d0) will return {@code true}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAlphaSpace(null)   \u003d false\n     * StringUtils.isAlphaSpace(\"\")     \u003d true\n     * StringUtils.isAlphaSpace(\"  \")   \u003d true\n     * StringUtils.isAlphaSpace(\"abc\")  \u003d true\n     * StringUtils.isAlphaSpace(\"ab c\") \u003d true\n     * StringUtils.isAlphaSpace(\"ab2c\") \u003d false\n     * StringUtils.isAlphaSpace(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return {@code true} if only contains letters and space,\n     *  and is non-null\n     * @since 3.0 Changed signature from isAlphaSpace(String) to isAlphaSpace(CharSequence)\n     ",
      "child_ranges": [
        "(line 5097,col 9)-(line 5099,col 9)",
        "(line 5100,col 9)-(line 5100,col 29)",
        "(line 5101,col 9)-(line 5105,col 9)",
        "(line 5106,col 9)-(line 5106,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAlphanumeric(java.lang.CharSequence)",
      "begin_line": 5131,
      "end_line": 5142,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only Unicode letters or digits.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null} will return {@code false}.\n     * An empty CharSequence (length()\u003d0) will return {@code false}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAlphanumeric(null)   \u003d false\n     * StringUtils.isAlphanumeric(\"\")     \u003d false\n     * StringUtils.isAlphanumeric(\"  \")   \u003d false\n     * StringUtils.isAlphanumeric(\"abc\")  \u003d true\n     * StringUtils.isAlphanumeric(\"ab c\") \u003d false\n     * StringUtils.isAlphanumeric(\"ab2c\") \u003d true\n     * StringUtils.isAlphanumeric(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return {@code true} if only contains letters or digits,\n     *  and is non-null\n     * @since 3.0 Changed signature from isAlphanumeric(String) to isAlphanumeric(CharSequence)\n     * @since 3.0 Changed \"\" to return false and not true\n     ",
      "child_ranges": [
        "(line 5132,col 9)-(line 5134,col 9)",
        "(line 5135,col 9)-(line 5135,col 29)",
        "(line 5136,col 9)-(line 5140,col 9)",
        "(line 5141,col 9)-(line 5141,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAlphanumericSpace(java.lang.CharSequence)",
      "begin_line": 5166,
      "end_line": 5177,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only Unicode letters, digits\n     * or space ({@code \u0027 \u0027}).\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null} will return {@code false}.\n     * An empty CharSequence (length()\u003d0) will return {@code true}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAlphanumericSpace(null)   \u003d false\n     * StringUtils.isAlphanumericSpace(\"\")     \u003d true\n     * StringUtils.isAlphanumericSpace(\"  \")   \u003d true\n     * StringUtils.isAlphanumericSpace(\"abc\")  \u003d true\n     * StringUtils.isAlphanumericSpace(\"ab c\") \u003d true\n     * StringUtils.isAlphanumericSpace(\"ab2c\") \u003d true\n     * StringUtils.isAlphanumericSpace(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return {@code true} if only contains letters, digits or space,\n     *  and is non-null\n     * @since 3.0 Changed signature from isAlphanumericSpace(String) to isAlphanumericSpace(CharSequence)\n     ",
      "child_ranges": [
        "(line 5167,col 9)-(line 5169,col 9)",
        "(line 5170,col 9)-(line 5170,col 29)",
        "(line 5171,col 9)-(line 5175,col 9)",
        "(line 5176,col 9)-(line 5176,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAsciiPrintable(java.lang.CharSequence)",
      "begin_line": 5205,
      "end_line": 5216,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only ASCII printable characters.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null} will return {@code false}.\n     * An empty CharSequence (length()\u003d0) will return {@code true}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAsciiPrintable(null)     \u003d false\n     * StringUtils.isAsciiPrintable(\"\")       \u003d true\n     * StringUtils.isAsciiPrintable(\" \")      \u003d true\n     * StringUtils.isAsciiPrintable(\"Ceki\")   \u003d true\n     * StringUtils.isAsciiPrintable(\"ab2c\")   \u003d true\n     * StringUtils.isAsciiPrintable(\"!ab-c~\") \u003d true\n     * StringUtils.isAsciiPrintable(\"\\u0020\") \u003d true\n     * StringUtils.isAsciiPrintable(\"\\u0021\") \u003d true\n     * StringUtils.isAsciiPrintable(\"\\u007e\") \u003d true\n     * StringUtils.isAsciiPrintable(\"\\u007f\") \u003d false\n     * StringUtils.isAsciiPrintable(\"Ceki G\\u00fclc\\u00fc\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs the CharSequence to check, may be null\n     * @return {@code true} if every character is in the range\n     *  32 thru 126\n     * @since 2.1\n     * @since 3.0 Changed signature from isAsciiPrintable(String) to isAsciiPrintable(CharSequence)\n     ",
      "child_ranges": [
        "(line 5206,col 9)-(line 5208,col 9)",
        "(line 5209,col 9)-(line 5209,col 29)",
        "(line 5210,col 9)-(line 5214,col 9)",
        "(line 5215,col 9)-(line 5215,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isNumeric(java.lang.CharSequence)",
      "begin_line": 5241,
      "end_line": 5252,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only Unicode digits.\n     * A decimal point is not a Unicode digit and returns false.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null} will return {@code false}.\n     * An empty CharSequence (length()\u003d0) will return {@code false}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isNumeric(null)   \u003d false\n     * StringUtils.isNumeric(\"\")     \u003d false\n     * StringUtils.isNumeric(\"  \")   \u003d false\n     * StringUtils.isNumeric(\"123\")  \u003d true\n     * StringUtils.isNumeric(\"12 3\") \u003d false\n     * StringUtils.isNumeric(\"ab2c\") \u003d false\n     * StringUtils.isNumeric(\"12-3\") \u003d false\n     * StringUtils.isNumeric(\"12.3\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return {@code true} if only contains digits, and is non-null\n     * @since 3.0 Changed signature from isNumeric(String) to isNumeric(CharSequence)\n     * @since 3.0 Changed \"\" to return false and not true\n     ",
      "child_ranges": [
        "(line 5242,col 9)-(line 5244,col 9)",
        "(line 5245,col 9)-(line 5245,col 29)",
        "(line 5246,col 9)-(line 5250,col 9)",
        "(line 5251,col 9)-(line 5251,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isNumericSpace(java.lang.CharSequence)",
      "begin_line": 5278,
      "end_line": 5289,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only Unicode digits or space\n     * ({@code \u0027 \u0027}).\n     * A decimal point is not a Unicode digit and returns false.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null} will return {@code false}.\n     * An empty CharSequence (length()\u003d0) will return {@code true}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isNumericSpace(null)   \u003d false\n     * StringUtils.isNumericSpace(\"\")     \u003d true\n     * StringUtils.isNumericSpace(\"  \")   \u003d true\n     * StringUtils.isNumericSpace(\"123\")  \u003d true\n     * StringUtils.isNumericSpace(\"12 3\") \u003d true\n     * StringUtils.isNumericSpace(\"ab2c\") \u003d false\n     * StringUtils.isNumericSpace(\"12-3\") \u003d false\n     * StringUtils.isNumericSpace(\"12.3\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return {@code true} if only contains digits or space,\n     *  and is non-null\n     * @since 3.0 Changed signature from isNumericSpace(String) to isNumericSpace(CharSequence)\n     ",
      "child_ranges": [
        "(line 5279,col 9)-(line 5281,col 9)",
        "(line 5282,col 9)-(line 5282,col 29)",
        "(line 5283,col 9)-(line 5287,col 9)",
        "(line 5288,col 9)-(line 5288,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isWhitespace(java.lang.CharSequence)",
      "begin_line": 5311,
      "end_line": 5322,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only whitespace.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null} will return {@code false}.\n     * An empty CharSequence (length()\u003d0) will return {@code true}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isWhitespace(null)   \u003d false\n     * StringUtils.isWhitespace(\"\")     \u003d true\n     * StringUtils.isWhitespace(\"  \")   \u003d true\n     * StringUtils.isWhitespace(\"abc\")  \u003d false\n     * StringUtils.isWhitespace(\"ab2c\") \u003d false\n     * StringUtils.isWhitespace(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return {@code true} if only contains whitespace, and is non-null\n     * @since 2.0\n     * @since 3.0 Changed signature from isWhitespace(String) to isWhitespace(CharSequence)\n     ",
      "child_ranges": [
        "(line 5312,col 9)-(line 5314,col 9)",
        "(line 5315,col 9)-(line 5315,col 29)",
        "(line 5316,col 9)-(line 5320,col 9)",
        "(line 5321,col 9)-(line 5321,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAllLowerCase(java.lang.CharSequence)",
      "begin_line": 5343,
      "end_line": 5354,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only lowercase characters.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null} will return {@code false}.\n     * An empty CharSequence (length()\u003d0) will return {@code false}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAllLowerCase(null)   \u003d false\n     * StringUtils.isAllLowerCase(\"\")     \u003d false\n     * StringUtils.isAllLowerCase(\"  \")   \u003d false\n     * StringUtils.isAllLowerCase(\"abc\")  \u003d true\n     * StringUtils.isAllLowerCase(\"abC\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs  the CharSequence to check, may be null\n     * @return {@code true} if only contains lowercase characters, and is non-null\n     * @since 2.5\n     * @since 3.0 Changed signature from isAllLowerCase(String) to isAllLowerCase(CharSequence)\n     ",
      "child_ranges": [
        "(line 5344,col 9)-(line 5346,col 9)",
        "(line 5347,col 9)-(line 5347,col 29)",
        "(line 5348,col 9)-(line 5352,col 9)",
        "(line 5353,col 9)-(line 5353,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.isAllUpperCase(java.lang.CharSequence)",
      "begin_line": 5375,
      "end_line": 5386,
      "comment": "\n     * \u003cp\u003eChecks if the CharSequence contains only uppercase characters.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null} will return {@code false}.\n     * An empty String (length()\u003d0) will return {@code false}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAllUpperCase(null)   \u003d false\n     * StringUtils.isAllUpperCase(\"\")     \u003d false\n     * StringUtils.isAllUpperCase(\"  \")   \u003d false\n     * StringUtils.isAllUpperCase(\"ABC\")  \u003d true\n     * StringUtils.isAllUpperCase(\"aBC\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param cs the CharSequence to check, may be null\n     * @return {@code true} if only contains uppercase characters, and is non-null\n     * @since 2.5\n     * @since 3.0 Changed signature from isAllUpperCase(String) to isAllUpperCase(CharSequence)\n     ",
      "child_ranges": [
        "(line 5376,col 9)-(line 5378,col 9)",
        "(line 5379,col 9)-(line 5379,col 29)",
        "(line 5380,col 9)-(line 5384,col 9)",
        "(line 5385,col 9)-(line 5385,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.defaultString(java.lang.String)",
      "begin_line": 5406,
      "end_line": 5408,
      "comment": "\n     * \u003cp\u003eReturns either the passed in String,\n     * or if the String is {@code null}, an empty String (\"\").\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.defaultString(null)  \u003d \"\"\n     * StringUtils.defaultString(\"\")    \u003d \"\"\n     * StringUtils.defaultString(\"bat\") \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @see ObjectUtils#toString(Object)\n     * @see String#valueOf(Object)\n     * @param str  the String to check, may be null\n     * @return the passed in String, or the empty String if it\n     *  was {@code null}\n     ",
      "child_ranges": [
        "(line 5407,col 9)-(line 5407,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.defaultString(java.lang.String, java.lang.String)",
      "begin_line": 5427,
      "end_line": 5429,
      "comment": "\n     * \u003cp\u003eReturns either the passed in String, or if the String is\n     * {@code null}, the value of {@code defaultStr}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.defaultString(null, \"NULL\")  \u003d \"NULL\"\n     * StringUtils.defaultString(\"\", \"NULL\")    \u003d \"\"\n     * StringUtils.defaultString(\"bat\", \"NULL\") \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @see ObjectUtils#toString(Object,String)\n     * @see String#valueOf(Object)\n     * @param str  the String to check, may be null\n     * @param defaultStr  the default String to return\n     *  if the input is {@code null}, may be null\n     * @return the passed in String, or the default if it was {@code null}\n     ",
      "child_ranges": [
        "(line 5428,col 9)-(line 5428,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.defaultIfBlank(T, T)",
      "begin_line": 5449,
      "end_line": 5451,
      "comment": "\n     * \u003cp\u003eReturns either the passed in CharSequence, or if the CharSequence is\n     * whitespace, empty (\"\") or {@code null}, the value of {@code defaultStr}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.defaultIfBlank(null, \"NULL\")  \u003d \"NULL\"\n     * StringUtils.defaultIfBlank(\"\", \"NULL\")    \u003d \"NULL\"\n     * StringUtils.defaultIfBlank(\" \", \"NULL\")   \u003d \"NULL\"\n     * StringUtils.defaultIfBlank(\"bat\", \"NULL\") \u003d \"bat\"\n     * StringUtils.defaultIfBlank(\"\", null)      \u003d null\n     * \u003c/pre\u003e\n     * @param \u003cT\u003e the specific kind of CharSequence\n     * @param str the CharSequence to check, may be null\n     * @param defaultStr  the default CharSequence to return\n     *  if the input is whitespace, empty (\"\") or {@code null}, may be null\n     * @return the passed in CharSequence, or the default\n     * @see StringUtils#defaultString(String, String)\n     ",
      "child_ranges": [
        "(line 5450,col 9)-(line 5450,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.defaultIfEmpty(T, T)",
      "begin_line": 5471,
      "end_line": 5473,
      "comment": "\n     * \u003cp\u003eReturns either the passed in CharSequence, or if the CharSequence is\n     * empty or {@code null}, the value of {@code defaultStr}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.defaultIfEmpty(null, \"NULL\")  \u003d \"NULL\"\n     * StringUtils.defaultIfEmpty(\"\", \"NULL\")    \u003d \"NULL\"\n     * StringUtils.defaultIfEmpty(\" \", \"NULL\")   \u003d \" \"\n     * StringUtils.defaultIfEmpty(\"bat\", \"NULL\") \u003d \"bat\"\n     * StringUtils.defaultIfEmpty(\"\", null)      \u003d null\n     * \u003c/pre\u003e\n     * @param \u003cT\u003e the specific kind of CharSequence\n     * @param str  the CharSequence to check, may be null\n     * @param defaultStr  the default CharSequence to return\n     *  if the input is empty (\"\") or {@code null}, may be null\n     * @return the passed in CharSequence, or the default\n     * @see StringUtils#defaultString(String, String)\n     ",
      "child_ranges": [
        "(line 5472,col 9)-(line 5472,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.reverse(java.lang.String)",
      "begin_line": 5491,
      "end_line": 5496,
      "comment": "\n     * \u003cp\u003eReverses a String as per {@link StringBuilder#reverse()}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA {@code null} String returns {@code null}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.reverse(null)  \u003d null\n     * StringUtils.reverse(\"\")    \u003d \"\"\n     * StringUtils.reverse(\"bat\") \u003d \"tab\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to reverse, may be null\n     * @return the reversed String, {@code null} if null String input\n     ",
      "child_ranges": [
        "(line 5492,col 9)-(line 5494,col 9)",
        "(line 5495,col 9)-(line 5495,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.reverseDelimited(java.lang.String, char)",
      "begin_line": 5517,
      "end_line": 5526,
      "comment": "\n     * \u003cp\u003eReverses a String that is delimited by a specific character.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe Strings between the delimiters are not reversed.\n     * Thus java.lang.String becomes String.lang.java (if the delimiter\n     * is {@code \u0027.\u0027}).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.reverseDelimited(null, *)      \u003d null\n     * StringUtils.reverseDelimited(\"\", *)        \u003d \"\"\n     * StringUtils.reverseDelimited(\"a.b.c\", \u0027x\u0027) \u003d \"a.b.c\"\n     * StringUtils.reverseDelimited(\"a.b.c\", \".\") \u003d \"c.b.a\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to reverse, may be null\n     * @param separatorChar  the separator character to use\n     * @return the reversed String, {@code null} if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 5518,col 9)-(line 5520,col 9)",
        "(line 5523,col 9)-(line 5523,col 50)",
        "(line 5524,col 9)-(line 5524,col 33)",
        "(line 5525,col 9)-(line 5525,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.abbreviate(java.lang.String, int)",
      "begin_line": 5562,
      "end_line": 5564,
      "comment": "\n     * \u003cp\u003eAbbreviates a String using ellipses. This will turn\n     * \"Now is the time for all good men\" into \"Now is the time for...\"\u003c/p\u003e\n     *\n     * \u003cp\u003eSpecifically:\n     * \u003cul\u003e\n     *   \u003cli\u003eIf {@code str} is less than {@code maxWidth} characters\n     *       long, return it.\u003c/li\u003e\n     *   \u003cli\u003eElse abbreviate it to {@code (substring(str, 0, max-3) + \"...\")}.\u003c/li\u003e\n     *   \u003cli\u003eIf {@code maxWidth} is less than {@code 4}, throw an\n     *       {@code IllegalArgumentException}.\u003c/li\u003e\n     *   \u003cli\u003eIn no case will it return a String of length greater than\n     *       {@code maxWidth}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.abbreviate(null, *)      \u003d null\n     * StringUtils.abbreviate(\"\", 4)        \u003d \"\"\n     * StringUtils.abbreviate(\"abcdefg\", 6) \u003d \"abc...\"\n     * StringUtils.abbreviate(\"abcdefg\", 7) \u003d \"abcdefg\"\n     * StringUtils.abbreviate(\"abcdefg\", 8) \u003d \"abcdefg\"\n     * StringUtils.abbreviate(\"abcdefg\", 4) \u003d \"a...\"\n     * StringUtils.abbreviate(\"abcdefg\", 3) \u003d IllegalArgumentException\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param maxWidth  maximum length of result String, must be at least 4\n     * @return abbreviated String, {@code null} if null String input\n     * @throws IllegalArgumentException if the width is too small\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 5563,col 9)-(line 5563,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.abbreviate(java.lang.String, int, int)",
      "begin_line": 5601,
      "end_line": 5628,
      "comment": "\n     * \u003cp\u003eAbbreviates a String using ellipses. This will turn\n     * \"Now is the time for all good men\" into \"...is the time for...\"\u003c/p\u003e\n     *\n     * \u003cp\u003eWorks like {@code abbreviate(String, int)}, but allows you to specify\n     * a \"left edge\" offset.  Note that this left edge is not necessarily going to\n     * be the leftmost character in the result, or the first character following the\n     * ellipses, but it will appear somewhere in the result.\n     *\n     * \u003cp\u003eIn no case will it return a String of length greater than\n     * {@code maxWidth}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.abbreviate(null, *, *)                \u003d null\n     * StringUtils.abbreviate(\"\", 0, 4)                  \u003d \"\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", -1, 10) \u003d \"abcdefg...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 0, 10)  \u003d \"abcdefg...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 1, 10)  \u003d \"abcdefg...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 4, 10)  \u003d \"abcdefg...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 5, 10)  \u003d \"...fghi...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 6, 10)  \u003d \"...ghij...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 8, 10)  \u003d \"...ijklmno\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 10, 10) \u003d \"...ijklmno\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 12, 10) \u003d \"...ijklmno\"\n     * StringUtils.abbreviate(\"abcdefghij\", 0, 3)        \u003d IllegalArgumentException\n     * StringUtils.abbreviate(\"abcdefghij\", 5, 6)        \u003d IllegalArgumentException\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param offset  left edge of source String\n     * @param maxWidth  maximum length of result String, must be at least 4\n     * @return abbreviated String, {@code null} if null String input\n     * @throws IllegalArgumentException if the width is too small\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 5602,col 9)-(line 5604,col 9)",
        "(line 5605,col 9)-(line 5607,col 9)",
        "(line 5608,col 9)-(line 5610,col 9)",
        "(line 5611,col 9)-(line 5613,col 9)",
        "(line 5614,col 9)-(line 5616,col 9)",
        "(line 5617,col 9)-(line 5617,col 41)",
        "(line 5618,col 9)-(line 5620,col 9)",
        "(line 5621,col 9)-(line 5623,col 9)",
        "(line 5624,col 9)-(line 5626,col 9)",
        "(line 5627,col 9)-(line 5627,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.abbreviateMiddle(java.lang.String, java.lang.String, int)",
      "begin_line": 5659,
      "end_line": 5678,
      "comment": "\n     * \u003cp\u003eAbbreviates a String to the length passed, replacing the middle characters with the supplied\n     * replacement String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis abbreviation only occurs if the following criteria is met:\n     * \u003cul\u003e\n     * \u003cli\u003eNeither the String for abbreviation nor the replacement String are null or empty \u003c/li\u003e\n     * \u003cli\u003eThe length to truncate to is less than the length of the supplied String\u003c/li\u003e\n     * \u003cli\u003eThe length to truncate to is greater than 0\u003c/li\u003e\n     * \u003cli\u003eThe abbreviated String will have enough room for the length supplied replacement String\n     * and the first and last characters of the supplied String for abbreviation\u003c/li\u003e\n     * \u003c/ul\u003e\n     * Otherwise, the returned String will be the same as the supplied String for abbreviation.\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.abbreviateMiddle(null, null, 0)      \u003d null\n     * StringUtils.abbreviateMiddle(\"abc\", null, 0)      \u003d \"abc\"\n     * StringUtils.abbreviateMiddle(\"abc\", \".\", 0)      \u003d \"abc\"\n     * StringUtils.abbreviateMiddle(\"abc\", \".\", 3)      \u003d \"abc\"\n     * StringUtils.abbreviateMiddle(\"abcdef\", \".\", 4)     \u003d \"ab.f\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to abbreviate, may be null\n     * @param middle the String to replace the middle characters with, may be null\n     * @param length the length to abbreviate {@code str} to.\n     * @return the abbreviated String if the above criteria is met, or the original String supplied for abbreviation.\n     * @since 2.5\n     ",
      "child_ranges": [
        "(line 5660,col 9)-(line 5662,col 9)",
        "(line 5664,col 9)-(line 5666,col 9)",
        "(line 5668,col 9)-(line 5668,col 49)",
        "(line 5669,col 9)-(line 5669,col 54)",
        "(line 5670,col 9)-(line 5670,col 51)",
        "(line 5672,col 9)-(line 5672,col 58)",
        "(line 5673,col 9)-(line 5673,col 53)",
        "(line 5674,col 9)-(line 5674,col 31)",
        "(line 5675,col 9)-(line 5675,col 49)",
        "(line 5677,col 9)-(line 5677,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.difference(java.lang.String, java.lang.String)",
      "begin_line": 5707,
      "end_line": 5719,
      "comment": "\n     * \u003cp\u003eCompares two Strings, and returns the portion where they differ.\n     * (More precisely, return the remainder of the second String,\n     * starting from where it\u0027s different from the first.)\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example,\n     * {@code difference(\"i am a machine\", \"i am a robot\") -\u003e \"robot\"}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.difference(null, null) \u003d null\n     * StringUtils.difference(\"\", \"\") \u003d \"\"\n     * StringUtils.difference(\"\", \"abc\") \u003d \"abc\"\n     * StringUtils.difference(\"abc\", \"\") \u003d \"\"\n     * StringUtils.difference(\"abc\", \"abc\") \u003d \"\"\n     * StringUtils.difference(\"ab\", \"abxyz\") \u003d \"xyz\"\n     * StringUtils.difference(\"abcde\", \"abxyz\") \u003d \"xyz\"\n     * StringUtils.difference(\"abcde\", \"xyz\") \u003d \"xyz\"\n     * \u003c/pre\u003e\n     *\n     * @param str1  the first String, may be null\n     * @param str2  the second String, may be null\n     * @return the portion of str2 where it differs from str1; returns the\n     * empty String if they are equal\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 5708,col 9)-(line 5710,col 9)",
        "(line 5711,col 9)-(line 5713,col 9)",
        "(line 5714,col 9)-(line 5714,col 47)",
        "(line 5715,col 9)-(line 5717,col 9)",
        "(line 5718,col 9)-(line 5718,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfDifference(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 5746,
      "end_line": 5763,
      "comment": "\n     * \u003cp\u003eCompares two CharSequences, and returns the index at which the\n     * CharSequences begin to differ.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example,\n     * {@code indexOfDifference(\"i am a machine\", \"i am a robot\") -\u003e 7}\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfDifference(null, null) \u003d -1\n     * StringUtils.indexOfDifference(\"\", \"\") \u003d -1\n     * StringUtils.indexOfDifference(\"\", \"abc\") \u003d 0\n     * StringUtils.indexOfDifference(\"abc\", \"\") \u003d 0\n     * StringUtils.indexOfDifference(\"abc\", \"abc\") \u003d -1\n     * StringUtils.indexOfDifference(\"ab\", \"abxyz\") \u003d 2\n     * StringUtils.indexOfDifference(\"abcde\", \"abxyz\") \u003d 2\n     * StringUtils.indexOfDifference(\"abcde\", \"xyz\") \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param cs1  the first CharSequence, may be null\n     * @param cs2  the second CharSequence, may be null\n     * @return the index where cs1 and cs2 begin to differ; -1 if they are equal\n     * @since 2.0\n     * @since 3.0 Changed signature from indexOfDifference(String, String) to\n     * indexOfDifference(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 5747,col 9)-(line 5749,col 9)",
        "(line 5750,col 9)-(line 5752,col 9)",
        "(line 5753,col 9)-(line 5753,col 14)",
        "(line 5754,col 9)-(line 5758,col 9)",
        "(line 5759,col 9)-(line 5761,col 9)",
        "(line 5762,col 9)-(line 5762,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.indexOfDifference(java.lang.CharSequence...)",
      "begin_line": 5797,
      "end_line": 5853,
      "comment": "\n     * \u003cp\u003eCompares all CharSequences in an array and returns the index at which the\n     * CharSequences begin to differ.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example,\n     * \u003ccode\u003eindexOfDifference(new String[] {\"i am a machine\", \"i am a robot\"}) -\u003e 7\u003c/code\u003e\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfDifference(null) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {}) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {\"abc\"}) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {null, null}) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {\"\", \"\"}) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {\"\", null}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"abc\", null, null}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {null, null, \"abc\"}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"\", \"abc\"}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"abc\", \"\"}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"abc\", \"abc\"}) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {\"abc\", \"a\"}) \u003d 1\n     * StringUtils.indexOfDifference(new String[] {\"ab\", \"abxyz\"}) \u003d 2\n     * StringUtils.indexOfDifference(new String[] {\"abcde\", \"abxyz\"}) \u003d 2\n     * StringUtils.indexOfDifference(new String[] {\"abcde\", \"xyz\"}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"xyz\", \"abcde\"}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"i am a machine\", \"i am a robot\"}) \u003d 7\n     * \u003c/pre\u003e\n     *\n     * @param css  array of CharSequences, entries may be null\n     * @return the index where the strings begin to differ; -1 if they are all equal\n     * @since 2.4\n     * @since 3.0 Changed signature from indexOfDifference(String...) to indexOfDifference(CharSequence...)\n     ",
      "child_ranges": [
        "(line 5798,col 9)-(line 5800,col 9)",
        "(line 5801,col 9)-(line 5801,col 38)",
        "(line 5802,col 9)-(line 5802,col 38)",
        "(line 5803,col 9)-(line 5803,col 34)",
        "(line 5804,col 9)-(line 5804,col 47)",
        "(line 5805,col 9)-(line 5805,col 30)",
        "(line 5810,col 9)-(line 5819,col 9)",
        "(line 5822,col 9)-(line 5824,col 9)",
        "(line 5827,col 9)-(line 5829,col 9)",
        "(line 5832,col 9)-(line 5832,col 27)",
        "(line 5833,col 9)-(line 5844,col 9)",
        "(line 5846,col 9)-(line 5851,col 9)",
        "(line 5852,col 9)-(line 5852,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.getCommonPrefix(java.lang.String...)",
      "begin_line": 5888,
      "end_line": 5906,
      "comment": "\n     * \u003cp\u003eCompares all Strings in an array and returns the initial sequence of\n     * characters that is common to all of them.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example,\n     * \u003ccode\u003egetCommonPrefix(new String[] {\"i am a machine\", \"i am a robot\"}) -\u003e \"i am a \"\u003c/code\u003e\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.getCommonPrefix(null) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"abc\"}) \u003d \"abc\"\n     * StringUtils.getCommonPrefix(new String[] {null, null}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"\", \"\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"\", null}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"abc\", null, null}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {null, null, \"abc\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"\", \"abc\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"abc\", \"\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"abc\", \"abc\"}) \u003d \"abc\"\n     * StringUtils.getCommonPrefix(new String[] {\"abc\", \"a\"}) \u003d \"a\"\n     * StringUtils.getCommonPrefix(new String[] {\"ab\", \"abxyz\"}) \u003d \"ab\"\n     * StringUtils.getCommonPrefix(new String[] {\"abcde\", \"abxyz\"}) \u003d \"ab\"\n     * StringUtils.getCommonPrefix(new String[] {\"abcde\", \"xyz\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"xyz\", \"abcde\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"i am a machine\", \"i am a robot\"}) \u003d \"i am a \"\n     * \u003c/pre\u003e\n     *\n     * @param strs  array of String objects, entries may be null\n     * @return the initial sequence of characters that are common to all Strings\n     * in the array; empty String if the array is null, the elements are all null\n     * or if there is no common prefix.\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 5889,col 9)-(line 5891,col 9)",
        "(line 5892,col 9)-(line 5892,col 58)",
        "(line 5893,col 9)-(line 5905,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.getLevenshteinDistance(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 5946,
      "end_line": 6021,
      "comment": "\n     * \u003cp\u003eFind the Levenshtein distance between two Strings.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is the number of changes needed to change one String into\n     * another, where each change is a single character modification (deletion,\n     * insertion or substitution).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe previous implementation of the Levenshtein distance algorithm\n     * was from \u003ca href\u003d\"http://www.merriampark.com/ld.htm\"\u003ehttp://www.merriampark.com/ld.htm\u003c/a\u003e\u003c/p\u003e\n     *\n     * \u003cp\u003eChas Emerick has written an implementation in Java, which avoids an OutOfMemoryError\n     * which can occur when my Java implementation is used with very large strings.\u003cbr\u003e\n     * This implementation of the Levenshtein distance algorithm\n     * is from \u003ca href\u003d\"http://www.merriampark.com/ldjava.htm\"\u003ehttp://www.merriampark.com/ldjava.htm\u003c/a\u003e\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.getLevenshteinDistance(null, *)             \u003d IllegalArgumentException\n     * StringUtils.getLevenshteinDistance(*, null)             \u003d IllegalArgumentException\n     * StringUtils.getLevenshteinDistance(\"\",\"\")               \u003d 0\n     * StringUtils.getLevenshteinDistance(\"\",\"a\")              \u003d 1\n     * StringUtils.getLevenshteinDistance(\"aaapppp\", \"\")       \u003d 7\n     * StringUtils.getLevenshteinDistance(\"frog\", \"fog\")       \u003d 1\n     * StringUtils.getLevenshteinDistance(\"fly\", \"ant\")        \u003d 3\n     * StringUtils.getLevenshteinDistance(\"elephant\", \"hippo\") \u003d 7\n     * StringUtils.getLevenshteinDistance(\"hippo\", \"elephant\") \u003d 7\n     * StringUtils.getLevenshteinDistance(\"hippo\", \"zzzzzzzz\") \u003d 8\n     * StringUtils.getLevenshteinDistance(\"hello\", \"hallo\")    \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @param s  the first String, must not be null\n     * @param t  the second String, must not be null\n     * @return result distance\n     * @throws IllegalArgumentException if either String input {@code null}\n     * @since 3.0 Changed signature from getLevenshteinDistance(String, String) to\n     * getLevenshteinDistance(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 5947,col 9)-(line 5949,col 9)",
        "(line 5968,col 9)-(line 5968,col 27)",
        "(line 5969,col 9)-(line 5969,col 27)",
        "(line 5971,col 9)-(line 5975,col 9)",
        "(line 5977,col 9)-(line 5984,col 9)",
        "(line 5986,col 9)-(line 5986,col 33)",
        "(line 5987,col 9)-(line 5987,col 33)",
        "(line 5988,col 9)-(line 5988,col 17)",
        "(line 5991,col 9)-(line 5991,col 14)",
        "(line 5992,col 9)-(line 5992,col 14)",
        "(line 5994,col 9)-(line 5994,col 17)",
        "(line 5996,col 9)-(line 5996,col 17)",
        "(line 5998,col 9)-(line 6000,col 9)",
        "(line 6002,col 9)-(line 6016,col 9)",
        "(line 6020,col 9)-(line 6020,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.getLevenshteinDistance(java.lang.CharSequence, java.lang.CharSequence, int)",
      "begin_line": 6055,
      "end_line": 6183,
      "comment": "\n     * \u003cp\u003eFind the Levenshtein distance between two Strings if it\u0027s less than or equal to a given \n     * threshold.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is the number of changes needed to change one String into\n     * another, where each change is a single character modification (deletion,\n     * insertion or substitution).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis implementation follows from Algorithms on Strings, Trees and Sequences by Dan Gusfield\n     * and Chas Emerick\u0027s implementation of the Levenshtein distance algorithm from\n     * \u003ca href\u003d\"http://www.merriampark.com/ld.htm\"\u003ehttp://www.merriampark.com/ld.htm\u003c/a\u003e\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.getLevenshteinDistance(null, *, *)             \u003d IllegalArgumentException\n     * StringUtils.getLevenshteinDistance(*, null, *)             \u003d IllegalArgumentException\n     * StringUtils.getLevenshteinDistance(*, *, -1)               \u003d IllegalArgumentException\n     * StringUtils.getLevenshteinDistance(\"\",\"\", 0)               \u003d 0\n     * StringUtils.getLevenshteinDistance(\"aaapppp\", \"\", 8)       \u003d 7\n     * StringUtils.getLevenshteinDistance(\"aaapppp\", \"\", 7)       \u003d 7\n     * StringUtils.getLevenshteinDistance(\"aaapppp\", \"\", 6))      \u003d -1\n     * StringUtils.getLevenshteinDistance(\"elephant\", \"hippo\", 7) \u003d 7\n     * StringUtils.getLevenshteinDistance(\"elephant\", \"hippo\", 6) \u003d -1\n     * StringUtils.getLevenshteinDistance(\"hippo\", \"elephant\", 7) \u003d 7\n     * StringUtils.getLevenshteinDistance(\"hippo\", \"elephant\", 6) \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param s  the first String, must not be null\n     * @param t  the second String, must not be null\n     * @param threshold the target threshold, must not be negative\n     * @return result distance, or {@code -1} if the distance would be greater than the threshold\n     * @throws IllegalArgumentException if either String input {@code null} or negative threshold\n     ",
      "child_ranges": [
        "(line 6056,col 9)-(line 6058,col 9)",
        "(line 6059,col 9)-(line 6061,col 9)",
        "(line 6107,col 9)-(line 6107,col 27)",
        "(line 6108,col 9)-(line 6108,col 27)",
        "(line 6111,col 9)-(line 6115,col 9)",
        "(line 6117,col 9)-(line 6124,col 9)",
        "(line 6126,col 9)-(line 6126,col 33)",
        "(line 6127,col 9)-(line 6127,col 33)",
        "(line 6128,col 9)-(line 6128,col 17)",
        "(line 6131,col 9)-(line 6131,col 50)",
        "(line 6132,col 9)-(line 6134,col 9)",
        "(line 6137,col 9)-(line 6137,col 62)",
        "(line 6138,col 9)-(line 6138,col 42)",
        "(line 6141,col 9)-(line 6174,col 9)",
        "(line 6178,col 9)-(line 6182,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.startsWith(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 6210,
      "end_line": 6212,
      "comment": "\n     * \u003cp\u003eCheck if a CharSequence starts with a specified prefix.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null}s are handled without exceptions. Two {@code null}\n     * references are considered to be equal. The comparison is case sensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.startsWith(null, null)      \u003d true\n     * StringUtils.startsWith(null, \"abc\")     \u003d false\n     * StringUtils.startsWith(\"abcdef\", null)  \u003d false\n     * StringUtils.startsWith(\"abcdef\", \"abc\") \u003d true\n     * StringUtils.startsWith(\"ABCDEF\", \"abc\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#startsWith(String)\n     * @param str  the CharSequence to check, may be null\n     * @param prefix the prefix to find, may be null\n     * @return {@code true} if the CharSequence starts with the prefix, case sensitive, or\n     *  both {@code null}\n     * @since 2.4\n     * @since 3.0 Changed signature from startsWith(String, String) to startsWith(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 6211,col 9)-(line 6211,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 6236,
      "end_line": 6238,
      "comment": "\n     * \u003cp\u003eCase insensitive check if a CharSequence starts with a specified prefix.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null}s are handled without exceptions. Two {@code null}\n     * references are considered to be equal. The comparison is case insensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.startsWithIgnoreCase(null, null)      \u003d true\n     * StringUtils.startsWithIgnoreCase(null, \"abc\")     \u003d false\n     * StringUtils.startsWithIgnoreCase(\"abcdef\", null)  \u003d false\n     * StringUtils.startsWithIgnoreCase(\"abcdef\", \"abc\") \u003d true\n     * StringUtils.startsWithIgnoreCase(\"ABCDEF\", \"abc\") \u003d true\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#startsWith(String)\n     * @param str  the CharSequence to check, may be null\n     * @param prefix the prefix to find, may be null\n     * @return {@code true} if the CharSequence starts with the prefix, case insensitive, or\n     *  both {@code null}\n     * @since 2.4\n     * @since 3.0 Changed signature from startsWithIgnoreCase(String, String) to startsWithIgnoreCase(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 6237,col 9)-(line 6237,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.startsWith(java.lang.CharSequence, java.lang.CharSequence, boolean)",
      "begin_line": 6251,
      "end_line": 6259,
      "comment": "\n     * \u003cp\u003eCheck if a CharSequence starts with a specified prefix (optionally case insensitive).\u003c/p\u003e\n     *\n     * @see java.lang.String#startsWith(String)\n     * @param str  the CharSequence to check, may be null\n     * @param prefix the prefix to find, may be null\n     * @param ignoreCase indicates whether the compare should ignore case\n     *  (case insensitive) or not.\n     * @return {@code true} if the CharSequence starts with the prefix or\n     *  both {@code null}\n     ",
      "child_ranges": [
        "(line 6252,col 9)-(line 6254,col 9)",
        "(line 6255,col 9)-(line 6257,col 9)",
        "(line 6258,col 9)-(line 6258,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.startsWithAny(java.lang.CharSequence, java.lang.CharSequence...)",
      "begin_line": 6280,
      "end_line": 6290,
      "comment": "\n     * \u003cp\u003eCheck if a CharSequence starts with any of an array of specified strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.startsWithAny(null, null)      \u003d false\n     * StringUtils.startsWithAny(null, new String[] {\"abc\"})  \u003d false\n     * StringUtils.startsWithAny(\"abcxyz\", null)     \u003d false\n     * StringUtils.startsWithAny(\"abcxyz\", new String[] {\"\"}) \u003d false\n     * StringUtils.startsWithAny(\"abcxyz\", new String[] {\"abc\"}) \u003d true\n     * StringUtils.startsWithAny(\"abcxyz\", new String[] {null, \"xyz\", \"abc\"}) \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param string  the CharSequence to check, may be null\n     * @param searchStrings the CharSequences to find, may be null or empty\n     * @return {@code true} if the CharSequence starts with any of the the prefixes, case insensitive, or\n     *  both {@code null}\n     * @since 2.5\n     * @since 3.0 Changed signature from startsWithAny(String, String[]) to startsWithAny(CharSequence, CharSequence...)\n     ",
      "child_ranges": [
        "(line 6281,col 9)-(line 6283,col 9)",
        "(line 6284,col 9)-(line 6288,col 9)",
        "(line 6289,col 9)-(line 6289,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.endsWith(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 6318,
      "end_line": 6320,
      "comment": "\n     * \u003cp\u003eCheck if a CharSequence ends with a specified suffix.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null}s are handled without exceptions. Two {@code null}\n     * references are considered to be equal. The comparison is case sensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.endsWith(null, null)      \u003d true\n     * StringUtils.endsWith(null, \"def\")     \u003d false\n     * StringUtils.endsWith(\"abcdef\", null)  \u003d false\n     * StringUtils.endsWith(\"abcdef\", \"def\") \u003d true\n     * StringUtils.endsWith(\"ABCDEF\", \"def\") \u003d false\n     * StringUtils.endsWith(\"ABCDEF\", \"cde\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#endsWith(String)\n     * @param str  the CharSequence to check, may be null\n     * @param suffix the suffix to find, may be null\n     * @return {@code true} if the CharSequence ends with the suffix, case sensitive, or\n     *  both {@code null}\n     * @since 2.4\n     * @since 3.0 Changed signature from endsWith(String, String) to endsWith(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 6319,col 9)-(line 6319,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 6345,
      "end_line": 6347,
      "comment": "\n     * \u003cp\u003eCase insensitive check if a CharSequence ends with a specified suffix.\u003c/p\u003e\n     *\n     * \u003cp\u003e{@code null}s are handled without exceptions. Two {@code null}\n     * references are considered to be equal. The comparison is case insensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.endsWithIgnoreCase(null, null)      \u003d true\n     * StringUtils.endsWithIgnoreCase(null, \"def\")     \u003d false\n     * StringUtils.endsWithIgnoreCase(\"abcdef\", null)  \u003d false\n     * StringUtils.endsWithIgnoreCase(\"abcdef\", \"def\") \u003d true\n     * StringUtils.endsWithIgnoreCase(\"ABCDEF\", \"def\") \u003d true\n     * StringUtils.endsWithIgnoreCase(\"ABCDEF\", \"cde\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#endsWith(String)\n     * @param str  the CharSequence to check, may be null\n     * @param suffix the suffix to find, may be null\n     * @return {@code true} if the CharSequence ends with the suffix, case insensitive, or\n     *  both {@code null}\n     * @since 2.4\n     * @since 3.0 Changed signature from endsWithIgnoreCase(String, String) to endsWithIgnoreCase(CharSequence, CharSequence)\n     ",
      "child_ranges": [
        "(line 6346,col 9)-(line 6346,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.endsWith(java.lang.CharSequence, java.lang.CharSequence, boolean)",
      "begin_line": 6360,
      "end_line": 6369,
      "comment": "\n     * \u003cp\u003eCheck if a CharSequence ends with a specified suffix (optionally case insensitive).\u003c/p\u003e\n     *\n     * @see java.lang.String#endsWith(String)\n     * @param str  the CharSequence to check, may be null\n     * @param suffix the suffix to find, may be null\n     * @param ignoreCase indicates whether the compare should ignore case\n     *  (case insensitive) or not.\n     * @return {@code true} if the CharSequence starts with the prefix or\n     *  both {@code null}\n     ",
      "child_ranges": [
        "(line 6361,col 9)-(line 6363,col 9)",
        "(line 6364,col 9)-(line 6366,col 9)",
        "(line 6367,col 9)-(line 6367,col 55)",
        "(line 6368,col 9)-(line 6368,col 103)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.normalizeSpace(java.lang.String)",
      "begin_line": 6412,
      "end_line": 6417,
      "comment": "\n     * \u003cp\u003e\n     * Similar to \u003ca\n     * href\u003d\"http://www.w3.org/TR/xpath/#function-normalize-space\"\u003ehttp://www.w3.org/TR/xpath/#function-normalize\n     * -space\u003c/a\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The function returns the argument string with whitespace normalized by using\n     * \u003ccode\u003e{@link #trim(String)}\u003c/code\u003e to remove leading and trailing whitespace\n     * and then replacing sequences of whitespace characters by a single space.\n     * \u003c/p\u003e\n     * In XML Whitespace characters are the same as those allowed by the \u003ca\n     * href\u003d\"http://www.w3.org/TR/REC-xml/#NT-S\"\u003eS\u003c/a\u003e production, which is S ::\u003d (#x20 | #x9 | #xD | #xA)+\n     * \u003cp\u003e\n     * Java\u0027s regexp pattern \\s defines whitespace as [ \\t\\n\\x0B\\f\\r]\n     * \u003cp\u003e\n     * For reference:\n     * \u003cul\u003e\n     * \u003cli\u003e\\x0B \u003d vertical tab\u003c/li\u003e\n     * \u003cli\u003e\\f \u003d #xC \u003d form feed\u003c/li\u003e\n     * \u003cli\u003e#x20 \u003d space\u003c/li\u003e\n     * \u003cli\u003e#x9 \u003d \\t\u003c/li\u003e\n     * \u003cli\u003e#xA \u003d \\n\u003c/li\u003e\n     * \u003cli\u003e#xD \u003d \\r\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * The difference is that Java\u0027s whitespace includes vertical tab and form feed, which this functional will also\n     * normalize. Additionally \u003ccode\u003e{@link #trim(String)}\u003c/code\u003e removes control characters (char \u0026lt;\u003d 32) from both\n     * ends of this String.\n     * \u003c/p\u003e\n     *\n     * @see Pattern\n     * @see #trim(String)\n     * @see \u003ca\n     *      href\u003d\"http://www.w3.org/TR/xpath/#function-normalize-space\"\u003ehttp://www.w3.org/TR/xpath/#function-normalize-space\u003c/a\u003e\n     * @param str the source String to normalize whitespaces from, may be null\n     * @return the modified string with whitespace normalized, {@code null} if null String input\n     *\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 6413,col 9)-(line 6415,col 9)",
        "(line 6416,col 9)-(line 6416,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.endsWithAny(java.lang.CharSequence, java.lang.CharSequence...)",
      "begin_line": 6437,
      "end_line": 6447,
      "comment": "\n     * \u003cp\u003eCheck if a CharSequence ends with any of an array of specified strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.endsWithAny(null, null)      \u003d false\n     * StringUtils.endsWithAny(null, new String[] {\"abc\"})  \u003d false\n     * StringUtils.endsWithAny(\"abcxyz\", null)     \u003d false\n     * StringUtils.endsWithAny(\"abcxyz\", new String[] {\"\"}) \u003d true\n     * StringUtils.endsWithAny(\"abcxyz\", new String[] {\"xyz\"}) \u003d true\n     * StringUtils.endsWithAny(\"abcxyz\", new String[] {null, \"xyz\", \"abc\"}) \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param string  the CharSequence to check, may be null\n     * @param searchStrings the CharSequences to find, may be null or empty\n     * @return {@code true} if the CharSequence ends with any of the the prefixes, case insensitive, or\n     *  both {@code null}\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 6438,col 9)-(line 6440,col 9)",
        "(line 6441,col 9)-(line 6445,col 9)",
        "(line 6446,col 9)-(line 6446,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.StringUtils.toString(byte[], java.lang.String)",
      "begin_line": 6463,
      "end_line": 6465,
      "comment": "\n     * Converts a \u003ccode\u003ebyte[]\u003c/code\u003e to a String using the specified character encoding.\n     * \n     * @param bytes\n     *            the byte array to read from\n     * @param charsetName\n     *            the encoding to use, if null then use the platform default\n     * @return a new String\n     * @throws UnsupportedEncodingException\n     *             If the named charset is not supported\n     * @throws NullPointerException\n     *             if the input is null\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 6464,col 9)-(line 6464,col 88)"
      ]
    }
  ]
}