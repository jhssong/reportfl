{
  "filepath": "/tmp/Lang-46b/src/java/org/apache/commons/lang/StringUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StringUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 123,
      "end_line": 5965,
      "comment": "\n * \u003cp\u003eOperations on {@link java.lang.String} that are\n * \u003ccode\u003enull\u003c/code\u003e safe.\u003c/p\u003e\n *\n * \u003cul\u003e\n *  \u003cli\u003e\u003cb\u003eIsEmpty/IsBlank\u003c/b\u003e\n *      - checks if a String contains text\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eTrim/Strip\u003c/b\u003e\n *      - removes leading and trailing whitespace\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eEquals\u003c/b\u003e\n *      - compares two strings null-safe\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003estartsWith\u003c/b\u003e\n *      - check if a String starts with a prefix null-safe\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eendsWith\u003c/b\u003e\n *      - check if a String ends with a suffix null-safe\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eIndexOf/LastIndexOf/Contains\u003c/b\u003e\n *      - null-safe index-of checks\n *  \u003cli\u003e\u003cb\u003eIndexOfAny/LastIndexOfAny/IndexOfAnyBut/LastIndexOfAnyBut\u003c/b\u003e\n *      - index-of any of a set of Strings\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eContainsOnly/ContainsNone/ContainsAny\u003c/b\u003e\n *      - does String contains only/none/any of these characters\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eSubstring/Left/Right/Mid\u003c/b\u003e\n *      - null-safe substring extractions\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eSubstringBefore/SubstringAfter/SubstringBetween\u003c/b\u003e\n *      - substring extraction relative to other strings\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eSplit/Join\u003c/b\u003e\n *      - splits a String into an array of substrings and vice versa\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eRemove/Delete\u003c/b\u003e\n *      - removes part of a String\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eReplace/Overlay\u003c/b\u003e\n *      - Searches a String and replaces one String with another\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eChomp/Chop\u003c/b\u003e\n *      - removes the last part of a String\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eLeftPad/RightPad/Center/Repeat\u003c/b\u003e\n *      - pads a String\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eUpperCase/LowerCase/SwapCase/Capitalize/Uncapitalize\u003c/b\u003e\n *      - changes the case of a String\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eCountMatches\u003c/b\u003e\n *      - counts the number of occurrences of one String in another\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eIsAlpha/IsNumeric/IsWhitespace/IsAsciiPrintable\u003c/b\u003e\n *      - checks the characters in a String\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eDefaultString\u003c/b\u003e\n *      - protects against a null input String\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eReverse/ReverseDelimited\u003c/b\u003e\n *      - reverses a String\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eAbbreviate\u003c/b\u003e\n *      - abbreviates a string using ellipsis\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eDifference\u003c/b\u003e\n *      - compares Strings and reports on their differences\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eLevensteinDistance\u003c/b\u003e\n *      - the number of changes needed to change one String into another\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cp\u003eThe \u003ccode\u003eStringUtils\u003c/code\u003e class defines certain words related to\n * String handling.\u003c/p\u003e\n *\n * \u003cul\u003e\n *  \u003cli\u003enull - \u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n *  \u003cli\u003eempty - a zero-length string (\u003ccode\u003e\"\"\u003c/code\u003e)\u003c/li\u003e\n *  \u003cli\u003espace - the space character (\u003ccode\u003e\u0027 \u0027\u003c/code\u003e, char 32)\u003c/li\u003e\n *  \u003cli\u003ewhitespace - the characters defined by {@link Character#isWhitespace(char)}\u003c/li\u003e\n *  \u003cli\u003etrim - the characters \u0026lt;\u003d 32 as in {@link String#trim()}\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cp\u003e\u003ccode\u003eStringUtils\u003c/code\u003e handles \u003ccode\u003enull\u003c/code\u003e input Strings quietly.\n * That is to say that a \u003ccode\u003enull\u003c/code\u003e input will return \u003ccode\u003enull\u003c/code\u003e.\n * Where a \u003ccode\u003eboolean\u003c/code\u003e or \u003ccode\u003eint\u003c/code\u003e is being returned\n * details vary by method.\u003c/p\u003e\n *\n * \u003cp\u003eA side effect of the \u003ccode\u003enull\u003c/code\u003e handling is that a\n * \u003ccode\u003eNullPointerException\u003c/code\u003e should be considered a bug in\n * \u003ccode\u003eStringUtils\u003c/code\u003e (except for deprecated methods).\u003c/p\u003e\n *\n * \u003cp\u003eMethods in this class give sample code to explain their operation.\n * The symbol \u003ccode\u003e*\u003c/code\u003e is used to indicate any input including \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n *\n * @see java.lang.String\n * @author \u003ca href\u003d\"http://jakarta.apache.org/turbine/\"\u003eApache Jakarta Turbine\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:jon@latchkey.com\"\u003eJon S. Stevens\u003c/a\u003e\n * @author Daniel L. Rall\n * @author \u003ca href\u003d\"mailto:gcoladonato@yahoo.com\"\u003eGreg Coladonato\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:ed@apache.org\"\u003eEd Korthof\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:rand_mcneely@yahoo.com\"\u003eRand McNeely\u003c/a\u003e\n * @author Stephen Colebourne\n * @author \u003ca href\u003d\"mailto:fredrik@westermarck.com\"\u003eFredrik Westermarck\u003c/a\u003e\n * @author Holger Krauth\n * @author \u003ca href\u003d\"mailto:alex@purpletech.com\"\u003eAlexander Day Chaffee\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:hps@intermeta.de\"\u003eHenning P. Schmiedehausen\u003c/a\u003e\n * @author Arun Mammen Thomas\n * @author Gary Gregory\n * @author Phil Steitz\n * @author Al Chou\n * @author Michael Davey\n * @author Reuben Sivan\n * @author Chris Hyzer\n * @author Scott Johnson\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": "\n     * The empty String \u003ccode\u003e\"\"\u003c/code\u003e.\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INDEX_NOT_FOUND"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": "\n     * Represents a failed index search.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PAD_LIMIT"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": "\n     * \u003cp\u003eThe maximum size to which the padding constant(s) can expand.\u003c/p\u003e\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.StringUtils.StringUtils()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eStringUtils\u003c/code\u003e instances should NOT be constructed in\n     * standard programming. Instead, the class should be used as\n     * \u003ccode\u003eStringUtils.trim(\" foo \");\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.isEmpty(java.lang.String)",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\n     * \u003cp\u003eChecks if a String is empty (\"\") or null.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isEmpty(null)      \u003d true\n     * StringUtils.isEmpty(\"\")        \u003d true\n     * StringUtils.isEmpty(\" \")       \u003d false\n     * StringUtils.isEmpty(\"bob\")     \u003d false\n     * StringUtils.isEmpty(\"  bob  \") \u003d false\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eNOTE: This method changed in Lang version 2.0.\n     * It no longer trims the String.\n     * That functionality is available in isBlank().\u003c/p\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the String is empty or null\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.isNotEmpty(java.lang.String)",
      "begin_line": 207,
      "end_line": 209,
      "comment": "\n     * \u003cp\u003eChecks if a String is not empty (\"\") and not null.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isNotEmpty(null)      \u003d false\n     * StringUtils.isNotEmpty(\"\")        \u003d false\n     * StringUtils.isNotEmpty(\" \")       \u003d true\n     * StringUtils.isNotEmpty(\"bob\")     \u003d true\n     * StringUtils.isNotEmpty(\"  bob  \") \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the String is not empty and not null\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.isBlank(java.lang.String)",
      "begin_line": 226,
      "end_line": 237,
      "comment": "\n     * \u003cp\u003eChecks if a String is whitespace, empty (\"\") or null.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isBlank(null)      \u003d true\n     * StringUtils.isBlank(\"\")        \u003d true\n     * StringUtils.isBlank(\" \")       \u003d true\n     * StringUtils.isBlank(\"bob\")     \u003d false\n     * StringUtils.isBlank(\"  bob  \") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the String is null, empty or whitespace\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 19)",
        "(line 228,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.isNotBlank(java.lang.String)",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\n     * \u003cp\u003eChecks if a String is not empty (\"\"), not null and not whitespace only.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isNotBlank(null)      \u003d false\n     * StringUtils.isNotBlank(\"\")        \u003d false\n     * StringUtils.isNotBlank(\" \")       \u003d false\n     * StringUtils.isNotBlank(\"bob\")     \u003d true\n     * StringUtils.isNotBlank(\"  bob  \") \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the String is\n     *  not empty and not null and not whitespace\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.clean(java.lang.String)",
      "begin_line": 280,
      "end_line": 282,
      "comment": "\n     * \u003cp\u003eRemoves control characters (char \u0026lt;\u003d 32) from both\n     * ends of this String, handling \u003ccode\u003enull\u003c/code\u003e by returning\n     * an empty String (\"\").\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.clean(null)          \u003d \"\"\n     * StringUtils.clean(\"\")            \u003d \"\"\n     * StringUtils.clean(\"abc\")         \u003d \"abc\"\n     * StringUtils.clean(\"    abc    \") \u003d \"abc\"\n     * StringUtils.clean(\"     \")       \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#trim()\n     * @param str  the String to clean, may be null\n     * @return the trimmed text, never \u003ccode\u003enull\u003c/code\u003e\n     * @deprecated Use the clearer named {@link #trimToEmpty(String)}.\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.trim(java.lang.String)",
      "begin_line": 307,
      "end_line": 309,
      "comment": "\n     * \u003cp\u003eRemoves control characters (char \u0026lt;\u003d 32) from both\n     * ends of this String, handling \u003ccode\u003enull\u003c/code\u003e by returning\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is trimmed using {@link String#trim()}.\n     * Trim removes start and end characters \u0026lt;\u003d 32.\n     * To strip whitespace use {@link #strip(String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eTo trim your choice of characters, use the\n     * {@link #strip(String, String)} methods.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.trim(null)          \u003d null\n     * StringUtils.trim(\"\")            \u003d \"\"\n     * StringUtils.trim(\"     \")       \u003d \"\"\n     * StringUtils.trim(\"abc\")         \u003d \"abc\"\n     * StringUtils.trim(\"    abc    \") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be trimmed, may be null\n     * @return the trimmed string, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.trimToNull(java.lang.String)",
      "begin_line": 333,
      "end_line": 336,
      "comment": "\n     * \u003cp\u003eRemoves control characters (char \u0026lt;\u003d 32) from both\n     * ends of this String returning \u003ccode\u003enull\u003c/code\u003e if the String is\n     * empty (\"\") after the trim or if it is \u003ccode\u003enull\u003c/code\u003e.\n     *\n     * \u003cp\u003eThe String is trimmed using {@link String#trim()}.\n     * Trim removes start and end characters \u0026lt;\u003d 32.\n     * To strip whitespace use {@link #stripToNull(String)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.trimToNull(null)          \u003d null\n     * StringUtils.trimToNull(\"\")            \u003d null\n     * StringUtils.trimToNull(\"     \")       \u003d null\n     * StringUtils.trimToNull(\"abc\")         \u003d \"abc\"\n     * StringUtils.trimToNull(\"    abc    \") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be trimmed, may be null\n     * @return the trimmed String,\n     *  \u003ccode\u003enull\u003c/code\u003e if only chars \u0026lt;\u003d 32, empty or null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 30)",
        "(line 335,col 9)-(line 335,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.trimToEmpty(java.lang.String)",
      "begin_line": 359,
      "end_line": 361,
      "comment": "\n     * \u003cp\u003eRemoves control characters (char \u0026lt;\u003d 32) from both\n     * ends of this String returning an empty String (\"\") if the String\n     * is empty (\"\") after the trim or if it is \u003ccode\u003enull\u003c/code\u003e.\n     *\n     * \u003cp\u003eThe String is trimmed using {@link String#trim()}.\n     * Trim removes start and end characters \u0026lt;\u003d 32.\n     * To strip whitespace use {@link #stripToEmpty(String)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.trimToEmpty(null)          \u003d \"\"\n     * StringUtils.trimToEmpty(\"\")            \u003d \"\"\n     * StringUtils.trimToEmpty(\"     \")       \u003d \"\"\n     * StringUtils.trimToEmpty(\"abc\")         \u003d \"abc\"\n     * StringUtils.trimToEmpty(\"    abc    \") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be trimmed, may be null\n     * @return the trimmed String, or an empty String if \u003ccode\u003enull\u003c/code\u003e input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.strip(java.lang.String)",
      "begin_line": 387,
      "end_line": 389,
      "comment": "\n     * \u003cp\u003eStrips whitespace from the start and end of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is similar to {@link #trim(String)} but removes whitespace.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.strip(null)     \u003d null\n     * StringUtils.strip(\"\")       \u003d \"\"\n     * StringUtils.strip(\"   \")    \u003d \"\"\n     * StringUtils.strip(\"abc\")    \u003d \"abc\"\n     * StringUtils.strip(\"  abc\")  \u003d \"abc\"\n     * StringUtils.strip(\"abc  \")  \u003d \"abc\"\n     * StringUtils.strip(\" abc \")  \u003d \"abc\"\n     * StringUtils.strip(\" ab c \") \u003d \"ab c\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to remove whitespace from, may be null\n     * @return the stripped String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.stripToNull(java.lang.String)",
      "begin_line": 414,
      "end_line": 420,
      "comment": "\n     * \u003cp\u003eStrips whitespace from the start and end of a String  returning\n     * \u003ccode\u003enull\u003c/code\u003e if the String is empty (\"\") after the strip.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is similar to {@link #trimToNull(String)} but removes whitespace.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripToNull(null)     \u003d null\n     * StringUtils.stripToNull(\"\")       \u003d null\n     * StringUtils.stripToNull(\"   \")    \u003d null\n     * StringUtils.stripToNull(\"abc\")    \u003d \"abc\"\n     * StringUtils.stripToNull(\"  abc\")  \u003d \"abc\"\n     * StringUtils.stripToNull(\"abc  \")  \u003d \"abc\"\n     * StringUtils.stripToNull(\" abc \")  \u003d \"abc\"\n     * StringUtils.stripToNull(\" ab c \") \u003d \"ab c\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be stripped, may be null\n     * @return the stripped String,\n     *  \u003ccode\u003enull\u003c/code\u003e if whitespace, empty or null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 418,col 31)",
        "(line 419,col 9)-(line 419,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.stripToEmpty(java.lang.String)",
      "begin_line": 444,
      "end_line": 446,
      "comment": "\n     * \u003cp\u003eStrips whitespace from the start and end of a String  returning\n     * an empty String if \u003ccode\u003enull\u003c/code\u003e input.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is similar to {@link #trimToEmpty(String)} but removes whitespace.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripToEmpty(null)     \u003d \"\"\n     * StringUtils.stripToEmpty(\"\")       \u003d \"\"\n     * StringUtils.stripToEmpty(\"   \")    \u003d \"\"\n     * StringUtils.stripToEmpty(\"abc\")    \u003d \"abc\"\n     * StringUtils.stripToEmpty(\"  abc\")  \u003d \"abc\"\n     * StringUtils.stripToEmpty(\"abc  \")  \u003d \"abc\"\n     * StringUtils.stripToEmpty(\" abc \")  \u003d \"abc\"\n     * StringUtils.stripToEmpty(\" ab c \") \u003d \"ab c\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be stripped, may be null\n     * @return the trimmed String, or an empty String if \u003ccode\u003enull\u003c/code\u003e input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.strip(java.lang.String, java.lang.String)",
      "begin_line": 474,
      "end_line": 480,
      "comment": "\n     * \u003cp\u003eStrips any of a set of characters from the start and end of a String.\n     * This is similar to {@link String#trim()} but allows the characters\n     * to be stripped to be controlled.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * An empty string (\"\") input returns the empty string.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the stripChars String is \u003ccode\u003enull\u003c/code\u003e, whitespace is\n     * stripped as defined by {@link Character#isWhitespace(char)}.\n     * Alternatively use {@link #strip(String)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.strip(null, *)          \u003d null\n     * StringUtils.strip(\"\", *)            \u003d \"\"\n     * StringUtils.strip(\"abc\", null)      \u003d \"abc\"\n     * StringUtils.strip(\"  abc\", null)    \u003d \"abc\"\n     * StringUtils.strip(\"abc  \", null)    \u003d \"abc\"\n     * StringUtils.strip(\" abc \", null)    \u003d \"abc\"\n     * StringUtils.strip(\"  abcyx\", \"xyz\") \u003d \"  abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to remove characters from, may be null\n     * @param stripChars  the characters to remove, null treated as whitespace\n     * @return the stripped String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 478,col 42)",
        "(line 479,col 9)-(line 479,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.stripStart(java.lang.String, java.lang.String)",
      "begin_line": 506,
      "end_line": 524,
      "comment": "\n     * \u003cp\u003eStrips any of a set of characters from the start of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * An empty string (\"\") input returns the empty string.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the stripChars String is \u003ccode\u003enull\u003c/code\u003e, whitespace is\n     * stripped as defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripStart(null, *)          \u003d null\n     * StringUtils.stripStart(\"\", *)            \u003d \"\"\n     * StringUtils.stripStart(\"abc\", \"\")        \u003d \"abc\"\n     * StringUtils.stripStart(\"abc\", null)      \u003d \"abc\"\n     * StringUtils.stripStart(\"  abc\", null)    \u003d \"abc\"\n     * StringUtils.stripStart(\"abc  \", null)    \u003d \"abc  \"\n     * StringUtils.stripStart(\" abc \", null)    \u003d \"abc \"\n     * StringUtils.stripStart(\"yxabc  \", \"xyz\") \u003d \"abc  \"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to remove characters from, may be null\n     * @param stripChars  the characters to remove, null treated as whitespace\n     * @return the stripped String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 19)",
        "(line 508,col 9)-(line 510,col 9)",
        "(line 511,col 9)-(line 511,col 22)",
        "(line 512,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 523,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.stripEnd(java.lang.String, java.lang.String)",
      "begin_line": 550,
      "end_line": 568,
      "comment": "\n     * \u003cp\u003eStrips any of a set of characters from the end of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * An empty string (\"\") input returns the empty string.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the stripChars String is \u003ccode\u003enull\u003c/code\u003e, whitespace is\n     * stripped as defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripEnd(null, *)          \u003d null\n     * StringUtils.stripEnd(\"\", *)            \u003d \"\"\n     * StringUtils.stripEnd(\"abc\", \"\")        \u003d \"abc\"\n     * StringUtils.stripEnd(\"abc\", null)      \u003d \"abc\"\n     * StringUtils.stripEnd(\"  abc\", null)    \u003d \"  abc\"\n     * StringUtils.stripEnd(\"abc  \", null)    \u003d \"abc\"\n     * StringUtils.stripEnd(\" abc \", null)    \u003d \" abc\"\n     * StringUtils.stripEnd(\"  abcyx\", \"xyz\") \u003d \"  abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to remove characters from, may be null\n     * @param stripChars  the characters to remove, null treated as whitespace\n     * @return the stripped String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 551,col 9)-(line 551,col 16)",
        "(line 552,col 9)-(line 554,col 9)",
        "(line 556,col 9)-(line 566,col 9)",
        "(line 567,col 9)-(line 567,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.stripAll(java.lang.String[])",
      "begin_line": 591,
      "end_line": 593,
      "comment": "\n     * \u003cp\u003eStrips whitespace from the start and end of every String in an array.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA new array is returned each time, except for length zero.\n     * A \u003ccode\u003enull\u003c/code\u003e array will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty array will return itself.\n     * A \u003ccode\u003enull\u003c/code\u003e array entry will be ignored.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripAll(null)             \u003d null\n     * StringUtils.stripAll([])               \u003d []\n     * StringUtils.stripAll([\"abc\", \"  abc\"]) \u003d [\"abc\", \"abc\"]\n     * StringUtils.stripAll([\"abc  \", null])  \u003d [\"abc\", null]\n     * \u003c/pre\u003e\n     *\n     * @param strs  the array to remove whitespace from, may be null\n     * @return the stripped Strings, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 592,col 9)-(line 592,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.stripAll(java.lang.String[], java.lang.String)",
      "begin_line": 620,
      "end_line": 630,
      "comment": "\n     * \u003cp\u003eStrips any of a set of characters from the start and end of every\n     * String in an array.\u003c/p\u003e\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA new array is returned each time, except for length zero.\n     * A \u003ccode\u003enull\u003c/code\u003e array will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty array will return itself.\n     * A \u003ccode\u003enull\u003c/code\u003e array entry will be ignored.\n     * A \u003ccode\u003enull\u003c/code\u003e stripChars will strip whitespace as defined by\n     * {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripAll(null, *)                \u003d null\n     * StringUtils.stripAll([], *)                  \u003d []\n     * StringUtils.stripAll([\"abc\", \"  abc\"], null) \u003d [\"abc\", \"abc\"]\n     * StringUtils.stripAll([\"abc  \", null], null)  \u003d [\"abc\", null]\n     * StringUtils.stripAll([\"abc  \", null], \"yz\")  \u003d [\"abc  \", null]\n     * StringUtils.stripAll([\"yabcz\", null], \"yz\")  \u003d [\"abc\", null]\n     * \u003c/pre\u003e\n     *\n     * @param strs  the array to remove characters from, may be null\n     * @param stripChars  the characters to remove, null treated as whitespace\n     * @return the stripped Strings, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 621,col 9)-(line 621,col 20)",
        "(line 622,col 9)-(line 624,col 9)",
        "(line 625,col 9)-(line 625,col 46)",
        "(line 626,col 9)-(line 628,col 9)",
        "(line 629,col 9)-(line 629,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.equals(java.lang.String, java.lang.String)",
      "begin_line": 654,
      "end_line": 656,
      "comment": "\n     * \u003cp\u003eCompares two Strings, returning \u003ccode\u003etrue\u003c/code\u003e if they are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003es are handled without exceptions. Two \u003ccode\u003enull\u003c/code\u003e\n     * references are considered to be equal. The comparison is case sensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.equals(null, null)   \u003d true\n     * StringUtils.equals(null, \"abc\")  \u003d false\n     * StringUtils.equals(\"abc\", null)  \u003d false\n     * StringUtils.equals(\"abc\", \"abc\") \u003d true\n     * StringUtils.equals(\"abc\", \"ABC\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#equals(Object)\n     * @param str1  the first String, may be null\n     * @param str2  the second String, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the Strings are equal, case sensitive, or\n     *  both \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 655,col 9)-(line 655,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.equalsIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 679,
      "end_line": 681,
      "comment": "\n     * \u003cp\u003eCompares two Strings, returning \u003ccode\u003etrue\u003c/code\u003e if they are equal ignoring\n     * the case.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003es are handled without exceptions. Two \u003ccode\u003enull\u003c/code\u003e\n     * references are considered equal. Comparison is case insensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.equalsIgnoreCase(null, null)   \u003d true\n     * StringUtils.equalsIgnoreCase(null, \"abc\")  \u003d false\n     * StringUtils.equalsIgnoreCase(\"abc\", null)  \u003d false\n     * StringUtils.equalsIgnoreCase(\"abc\", \"abc\") \u003d true\n     * StringUtils.equalsIgnoreCase(\"abc\", \"ABC\") \u003d true\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#equalsIgnoreCase(String)\n     * @param str1  the first String, may be null\n     * @param str2  the second String, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the Strings are equal, case insensitive, or\n     *  both \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 680,col 9)-(line 680,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.indexOf(java.lang.String, char)",
      "begin_line": 704,
      "end_line": 709,
      "comment": "\n     * \u003cp\u003eFinds the first index within a String, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#indexOf(int)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e or empty (\"\") String will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOf(null, *)         \u003d -1\n     * StringUtils.indexOf(\"\", *)           \u003d -1\n     * StringUtils.indexOf(\"aabaabaa\", \u0027a\u0027) \u003d 0\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027) \u003d 2\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChar  the character to find\n     * @return the first index of the search character,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 705,col 9)-(line 707,col 9)",
        "(line 708,col 9)-(line 708,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.indexOf(java.lang.String, char, int)",
      "begin_line": 736,
      "end_line": 741,
      "comment": "\n     * \u003cp\u003eFinds the first index within a String from a start position,\n     * handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#indexOf(int, int)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e or empty (\"\") String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A negative start position is treated as zero.\n     * A start position greater than the string length returns \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOf(null, *, *)          \u003d -1\n     * StringUtils.indexOf(\"\", *, *)            \u003d -1\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027, 0)  \u003d 2\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027, 3)  \u003d 5\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027, 9)  \u003d -1\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027, -1) \u003d 2\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChar  the character to find\n     * @param startPos  the start position, negative treated as zero\n     * @return the first index of the search character,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 737,col 9)-(line 739,col 9)",
        "(line 740,col 9)-(line 740,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.indexOf(java.lang.String, java.lang.String)",
      "begin_line": 765,
      "end_line": 770,
      "comment": "\n     * \u003cp\u003eFinds the first index within a String, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#indexOf(String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOf(null, *)          \u003d -1\n     * StringUtils.indexOf(*, null)          \u003d -1\n     * StringUtils.indexOf(\"\", \"\")           \u003d 0\n     * StringUtils.indexOf(\"aabaabaa\", \"a\")  \u003d 0\n     * StringUtils.indexOf(\"aabaabaa\", \"b\")  \u003d 2\n     * StringUtils.indexOf(\"aabaabaa\", \"ab\") \u003d 1\n     * StringUtils.indexOf(\"aabaabaa\", \"\")   \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStr  the String to find, may be null\n     * @return the first index of the search String,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 766,col 9)-(line 768,col 9)",
        "(line 769,col 9)-(line 769,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.ordinalIndexOf(java.lang.String, java.lang.String, int)",
      "begin_line": 799,
      "end_line": 816,
      "comment": "\n     * \u003cp\u003eFinds the n-th index within a String, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#indexOf(String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.ordinalIndexOf(null, *, *)          \u003d -1\n     * StringUtils.ordinalIndexOf(*, null, *)          \u003d -1\n     * StringUtils.ordinalIndexOf(\"\", \"\", *)           \u003d 0\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"a\", 1)  \u003d 0\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"a\", 2)  \u003d 1\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"b\", 1)  \u003d 2\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"b\", 2)  \u003d 5\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"ab\", 1) \u003d 1\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"ab\", 2) \u003d 4\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"\", 1)   \u003d 0\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"\", 2)   \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStr  the String to find, may be null\n     * @param ordinal  the n-th \u003ccode\u003esearchStr\u003c/code\u003e to find\n     * @return the n-th index of the search String,\n     *  \u003ccode\u003e-1\u003c/code\u003e (\u003ccode\u003eINDEX_NOT_FOUND\u003c/code\u003e) if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 800,col 9)-(line 802,col 9)",
        "(line 803,col 9)-(line 805,col 9)",
        "(line 806,col 9)-(line 806,col 22)",
        "(line 807,col 9)-(line 807,col 36)",
        "(line 808,col 9)-(line 814,col 34)",
        "(line 815,col 9)-(line 815,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.indexOf(java.lang.String, java.lang.String, int)",
      "begin_line": 849,
      "end_line": 858,
      "comment": "\n     * \u003cp\u003eFinds the first index within a String, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#indexOf(String, int)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A negative start position is treated as zero.\n     * An empty (\"\") search String always matches.\n     * A start position greater than the string length only matches\n     * an empty search String.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOf(null, *, *)          \u003d -1\n     * StringUtils.indexOf(*, null, *)          \u003d -1\n     * StringUtils.indexOf(\"\", \"\", 0)           \u003d 0\n     * StringUtils.indexOf(\"aabaabaa\", \"a\", 0)  \u003d 0\n     * StringUtils.indexOf(\"aabaabaa\", \"b\", 0)  \u003d 2\n     * StringUtils.indexOf(\"aabaabaa\", \"ab\", 0) \u003d 1\n     * StringUtils.indexOf(\"aabaabaa\", \"b\", 3)  \u003d 5\n     * StringUtils.indexOf(\"aabaabaa\", \"b\", 9)  \u003d -1\n     * StringUtils.indexOf(\"aabaabaa\", \"b\", -1) \u003d 2\n     * StringUtils.indexOf(\"aabaabaa\", \"\", 2)   \u003d 2\n     * StringUtils.indexOf(\"abc\", \"\", 9)        \u003d 3\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStr  the String to find, may be null\n     * @param startPos  the start position, negative treated as zero\n     * @return the first index of the search String,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 850,col 9)-(line 852,col 9)",
        "(line 854,col 9)-(line 856,col 9)",
        "(line 857,col 9)-(line 857,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.lastIndexOf(java.lang.String, char)",
      "begin_line": 881,
      "end_line": 886,
      "comment": "\n     * \u003cp\u003eFinds the last index within a String, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#lastIndexOf(int)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e or empty (\"\") String will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOf(null, *)         \u003d -1\n     * StringUtils.lastIndexOf(\"\", *)           \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027a\u0027) \u003d 7\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027) \u003d 5\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChar  the character to find\n     * @return the last index of the search character,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 882,col 9)-(line 884,col 9)",
        "(line 885,col 9)-(line 885,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.lastIndexOf(java.lang.String, char, int)",
      "begin_line": 915,
      "end_line": 920,
      "comment": "\n     * \u003cp\u003eFinds the last index within a String from a start position,\n     * handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#lastIndexOf(int, int)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e or empty (\"\") String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A negative start position returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A start position greater than the string length searches the whole string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOf(null, *, *)          \u003d -1\n     * StringUtils.lastIndexOf(\"\", *,  *)           \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, 8)  \u003d 5\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, 4)  \u003d 2\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, 0)  \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, 9)  \u003d 5\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, -1) \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027a\u0027, 0)  \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChar  the character to find\n     * @param startPos  the start position\n     * @return the last index of the search character,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 916,col 9)-(line 918,col 9)",
        "(line 919,col 9)-(line 919,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.lastIndexOf(java.lang.String, java.lang.String)",
      "begin_line": 944,
      "end_line": 949,
      "comment": "\n     * \u003cp\u003eFinds the last index within a String, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#lastIndexOf(String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOf(null, *)          \u003d -1\n     * StringUtils.lastIndexOf(*, null)          \u003d -1\n     * StringUtils.lastIndexOf(\"\", \"\")           \u003d 0\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"a\")  \u003d 0\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\")  \u003d 2\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"ab\") \u003d 1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"\")   \u003d 8\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStr  the String to find, may be null\n     * @return the last index of the search String,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 945,col 9)-(line 947,col 9)",
        "(line 948,col 9)-(line 948,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.lastIndexOf(java.lang.String, java.lang.String, int)",
      "begin_line": 979,
      "end_line": 984,
      "comment": "\n     * \u003cp\u003eFinds the first index within a String, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#lastIndexOf(String, int)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A negative start position returns \u003ccode\u003e-1\u003c/code\u003e.\n     * An empty (\"\") search String always matches unless the start position is negative.\n     * A start position greater than the string length searches the whole string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOf(null, *, *)          \u003d -1\n     * StringUtils.lastIndexOf(*, null, *)          \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"a\", 8)  \u003d 7\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\", 8)  \u003d 5\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"ab\", 8) \u003d 4\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\", 9)  \u003d 5\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\", -1) \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"a\", 0)  \u003d 0\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\", 0)  \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStr  the String to find, may be null\n     * @param startPos  the start position, negative treated as zero\n     * @return the first index of the search String,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 980,col 9)-(line 982,col 9)",
        "(line 983,col 9)-(line 983,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.contains(java.lang.String, char)",
      "begin_line": 1007,
      "end_line": 1012,
      "comment": "\n     * \u003cp\u003eChecks if String contains a search character, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#indexOf(int)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e or empty (\"\") String will return \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.contains(null, *)    \u003d false\n     * StringUtils.contains(\"\", *)      \u003d false\n     * StringUtils.contains(\"abc\", \u0027a\u0027) \u003d true\n     * StringUtils.contains(\"abc\", \u0027z\u0027) \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChar  the character to find\n     * @return true if the String contains the search character,\n     *  false if not or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1008,col 9)-(line 1010,col 9)",
        "(line 1011,col 9)-(line 1011,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.contains(java.lang.String, java.lang.String)",
      "begin_line": 1035,
      "end_line": 1040,
      "comment": "\n     * \u003cp\u003eChecks if String contains a search String, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#indexOf(String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.contains(null, *)     \u003d false\n     * StringUtils.contains(*, null)     \u003d false\n     * StringUtils.contains(\"\", \"\")      \u003d true\n     * StringUtils.contains(\"abc\", \"\")   \u003d true\n     * StringUtils.contains(\"abc\", \"a\")  \u003d true\n     * StringUtils.contains(\"abc\", \"z\")  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStr  the String to find, may be null\n     * @return true if the String contains the search String,\n     *  false if not or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1036,col 9)-(line 1038,col 9)",
        "(line 1039,col 9)-(line 1039,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.containsIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 1065,
      "end_line": 1070,
      "comment": "\n     * \u003cp\u003eChecks if String contains a search String irrespective of case,\n     * handling \u003ccode\u003enull\u003c/code\u003e. This method uses\n     * {@link #contains(String, String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.contains(null, *) \u003d false\n     * StringUtils.contains(*, null) \u003d false\n     * StringUtils.contains(\"\", \"\") \u003d true\n     * StringUtils.contains(\"abc\", \"\") \u003d true\n     * StringUtils.contains(\"abc\", \"a\") \u003d true\n     * StringUtils.contains(\"abc\", \"z\") \u003d false\n     * StringUtils.contains(\"abc\", \"A\") \u003d true\n     * StringUtils.contains(\"abc\", \"Z\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStr  the String to find, may be null\n     * @return true if the String contains the search String irrespective of\n     * case or false if not or \u003ccode\u003enull\u003c/code\u003e string input\n     ",
      "child_ranges": [
        "(line 1066,col 9)-(line 1068,col 9)",
        "(line 1069,col 9)-(line 1069,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.indexOfAny(java.lang.String, char[])",
      "begin_line": 1096,
      "end_line": 1109,
      "comment": "\n     * \u003cp\u003eSearch a String to find the first index of any\n     * character in the given set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e or zero length search array will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAny(null, *)                \u003d -1\n     * StringUtils.indexOfAny(\"\", *)                  \u003d -1\n     * StringUtils.indexOfAny(*, null)                \u003d -1\n     * StringUtils.indexOfAny(*, [])                  \u003d -1\n     * StringUtils.indexOfAny(\"zzabyycdxx\",[\u0027z\u0027,\u0027a\u0027]) \u003d 0\n     * StringUtils.indexOfAny(\"zzabyycdxx\",[\u0027b\u0027,\u0027y\u0027]) \u003d 3\n     * StringUtils.indexOfAny(\"aba\", [\u0027z\u0027])           \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the index of any of the chars, -1 if no match or null input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1097,col 9)-(line 1099,col 9)",
        "(line 1100,col 9)-(line 1107,col 9)",
        "(line 1108,col 9)-(line 1108,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.indexOfAny(java.lang.String, java.lang.String)",
      "begin_line": 1133,
      "end_line": 1138,
      "comment": "\n     * \u003cp\u003eSearch a String to find the first index of any\n     * character in the given set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e search string will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAny(null, *)            \u003d -1\n     * StringUtils.indexOfAny(\"\", *)              \u003d -1\n     * StringUtils.indexOfAny(*, null)            \u003d -1\n     * StringUtils.indexOfAny(*, \"\")              \u003d -1\n     * StringUtils.indexOfAny(\"zzabyycdxx\", \"za\") \u003d 0\n     * StringUtils.indexOfAny(\"zzabyycdxx\", \"by\") \u003d 3\n     * StringUtils.indexOfAny(\"aba\",\"z\")          \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the index of any of the chars, -1 if no match or null input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1134,col 9)-(line 1136,col 9)",
        "(line 1137,col 9)-(line 1137,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.containsAny(java.lang.String, char[])",
      "begin_line": 1165,
      "end_line": 1178,
      "comment": "\n     * \u003cp\u003eChecks if the String contains any character in the given\n     * set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003efalse\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e or zero length search array will return \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsAny(null, *)                \u003d false\n     * StringUtils.containsAny(\"\", *)                  \u003d false\n     * StringUtils.containsAny(*, null)                \u003d false\n     * StringUtils.containsAny(*, [])                  \u003d false\n     * StringUtils.containsAny(\"zzabyycdxx\",[\u0027z\u0027,\u0027a\u0027]) \u003d true\n     * StringUtils.containsAny(\"zzabyycdxx\",[\u0027b\u0027,\u0027y\u0027]) \u003d true\n     * StringUtils.containsAny(\"aba\", [\u0027z\u0027])           \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the \u003ccode\u003etrue\u003c/code\u003e if any of the chars are found,\n     * \u003ccode\u003efalse\u003c/code\u003e if no match or null input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1166,col 9)-(line 1168,col 9)",
        "(line 1169,col 9)-(line 1176,col 9)",
        "(line 1177,col 9)-(line 1177,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.containsAny(java.lang.String, java.lang.String)",
      "begin_line": 1207,
      "end_line": 1212,
      "comment": "\n     * \u003cp\u003e\n     * Checks if the String contains any character in the given set of characters.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003efalse\u003c/code\u003e. A \u003ccode\u003enull\u003c/code\u003e search string will return\n     * \u003ccode\u003efalse\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * StringUtils.containsAny(null, *)            \u003d false\n     * StringUtils.containsAny(\"\", *)              \u003d false\n     * StringUtils.containsAny(*, null)            \u003d false\n     * StringUtils.containsAny(*, \"\")              \u003d false\n     * StringUtils.containsAny(\"zzabyycdxx\", \"za\") \u003d true\n     * StringUtils.containsAny(\"zzabyycdxx\", \"by\") \u003d true\n     * StringUtils.containsAny(\"aba\",\"z\")          \u003d false\n     * \u003c/pre\u003e\n     * \n     * @param str\n     *            the String to check, may be null\n     * @param searchChars\n     *            the chars to search for, may be null\n     * @return the \u003ccode\u003etrue\u003c/code\u003e if any of the chars are found, \u003ccode\u003efalse\u003c/code\u003e if no match or null input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 1208,col 9)-(line 1210,col 9)",
        "(line 1211,col 9)-(line 1211,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.indexOfAnyBut(java.lang.String, char[])",
      "begin_line": 1238,
      "end_line": 1252,
      "comment": "\n     * \u003cp\u003eSearch a String to find the first index of any\n     * character not in the given set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e or zero length search array will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAnyBut(null, *)           \u003d -1\n     * StringUtils.indexOfAnyBut(\"\", *)             \u003d -1\n     * StringUtils.indexOfAnyBut(*, null)           \u003d -1\n     * StringUtils.indexOfAnyBut(*, [])             \u003d -1\n     * StringUtils.indexOfAnyBut(\"zzabyycdxx\",\u0027za\u0027) \u003d 3\n     * StringUtils.indexOfAnyBut(\"zzabyycdxx\", \u0027\u0027)  \u003d 0\n     * StringUtils.indexOfAnyBut(\"aba\", \u0027ab\u0027)       \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the index of any of the chars, -1 if no match or null input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1239,col 9)-(line 1241,col 9)",
        "(line 1242,col 9)-(line 1250,col 9)",
        "(line 1251,col 9)-(line 1251,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.indexOfAnyBut(java.lang.String, java.lang.String)",
      "begin_line": 1276,
      "end_line": 1286,
      "comment": "\n     * \u003cp\u003eSearch a String to find the first index of any\n     * character not in the given set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e search string will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAnyBut(null, *)            \u003d -1\n     * StringUtils.indexOfAnyBut(\"\", *)              \u003d -1\n     * StringUtils.indexOfAnyBut(*, null)            \u003d -1\n     * StringUtils.indexOfAnyBut(*, \"\")              \u003d -1\n     * StringUtils.indexOfAnyBut(\"zzabyycdxx\", \"za\") \u003d 3\n     * StringUtils.indexOfAnyBut(\"zzabyycdxx\", \"\")   \u003d 0\n     * StringUtils.indexOfAnyBut(\"aba\",\"ab\")         \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the index of any of the chars, -1 if no match or null input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1277,col 9)-(line 1279,col 9)",
        "(line 1280,col 9)-(line 1284,col 9)",
        "(line 1285,col 9)-(line 1285,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.containsOnly(java.lang.String, char[])",
      "begin_line": 1311,
      "end_line": 1323,
      "comment": "\n     * \u003cp\u003eChecks if the String contains only certain characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003efalse\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e valid character array will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty String (\"\") always returns \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsOnly(null, *)       \u003d false\n     * StringUtils.containsOnly(*, null)       \u003d false\n     * StringUtils.containsOnly(\"\", *)         \u003d true\n     * StringUtils.containsOnly(\"ab\", \u0027\u0027)      \u003d false\n     * StringUtils.containsOnly(\"abab\", \u0027abc\u0027) \u003d true\n     * StringUtils.containsOnly(\"ab1\", \u0027abc\u0027)  \u003d false\n     * StringUtils.containsOnly(\"abz\", \u0027abc\u0027)  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param valid  an array of valid chars, may be null\n     * @return true if it only contains valid chars and is non-null\n     ",
      "child_ranges": [
        "(line 1313,col 9)-(line 1315,col 9)",
        "(line 1316,col 9)-(line 1318,col 9)",
        "(line 1319,col 9)-(line 1321,col 9)",
        "(line 1322,col 9)-(line 1322,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.containsOnly(java.lang.String, java.lang.String)",
      "begin_line": 1347,
      "end_line": 1352,
      "comment": "\n     * \u003cp\u003eChecks if the String contains only certain characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003efalse\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e valid character String will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty String (\"\") always returns \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsOnly(null, *)       \u003d false\n     * StringUtils.containsOnly(*, null)       \u003d false\n     * StringUtils.containsOnly(\"\", *)         \u003d true\n     * StringUtils.containsOnly(\"ab\", \"\")      \u003d false\n     * StringUtils.containsOnly(\"abab\", \"abc\") \u003d true\n     * StringUtils.containsOnly(\"ab1\", \"abc\")  \u003d false\n     * StringUtils.containsOnly(\"abz\", \"abc\")  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param validChars  a String of valid chars, may be null\n     * @return true if it only contains valid chars and is non-null\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1348,col 9)-(line 1350,col 9)",
        "(line 1351,col 9)-(line 1351,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.containsNone(java.lang.String, char[])",
      "begin_line": 1378,
      "end_line": 1393,
      "comment": "\n     * \u003cp\u003eChecks that the String does not contain certain characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003etrue\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e invalid character array will return \u003ccode\u003etrue\u003c/code\u003e.\n     * An empty String (\"\") always returns true.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsNone(null, *)       \u003d true\n     * StringUtils.containsNone(*, null)       \u003d true\n     * StringUtils.containsNone(\"\", *)         \u003d true\n     * StringUtils.containsNone(\"ab\", \u0027\u0027)      \u003d true\n     * StringUtils.containsNone(\"abab\", \u0027xyz\u0027) \u003d true\n     * StringUtils.containsNone(\"ab1\", \u0027xyz\u0027)  \u003d true\n     * StringUtils.containsNone(\"abz\", \u0027xyz\u0027)  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param invalidChars  an array of invalid chars, may be null\n     * @return true if it contains none of the invalid chars, or is null\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1379,col 9)-(line 1381,col 9)",
        "(line 1382,col 9)-(line 1382,col 35)",
        "(line 1383,col 9)-(line 1383,col 44)",
        "(line 1384,col 9)-(line 1391,col 9)",
        "(line 1392,col 9)-(line 1392,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.containsNone(java.lang.String, java.lang.String)",
      "begin_line": 1417,
      "end_line": 1422,
      "comment": "\n     * \u003cp\u003eChecks that the String does not contain certain characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003etrue\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e invalid character array will return \u003ccode\u003etrue\u003c/code\u003e.\n     * An empty String (\"\") always returns true.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsNone(null, *)       \u003d true\n     * StringUtils.containsNone(*, null)       \u003d true\n     * StringUtils.containsNone(\"\", *)         \u003d true\n     * StringUtils.containsNone(\"ab\", \"\")      \u003d true\n     * StringUtils.containsNone(\"abab\", \"xyz\") \u003d true\n     * StringUtils.containsNone(\"ab1\", \"xyz\")  \u003d true\n     * StringUtils.containsNone(\"abz\", \"xyz\")  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param invalidChars  a String of invalid chars, may be null\n     * @return true if it contains none of the invalid chars, or is null\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1418,col 9)-(line 1420,col 9)",
        "(line 1421,col 9)-(line 1421,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.indexOfAny(java.lang.String, java.lang.String[])",
      "begin_line": 1452,
      "end_line": 1478,
      "comment": "\n     * \u003cp\u003eFind the first index of any of a set of potential substrings.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e or zero length search array will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e search array entry will be ignored, but a search\n     * array containing \"\" will return \u003ccode\u003e0\u003c/code\u003e if \u003ccode\u003estr\u003c/code\u003e is not\n     * null. This method uses {@link String#indexOf(String)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAny(null, *)                     \u003d -1\n     * StringUtils.indexOfAny(*, null)                     \u003d -1\n     * StringUtils.indexOfAny(*, [])                       \u003d -1\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"ab\",\"cd\"])   \u003d 2\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"cd\",\"ab\"])   \u003d 2\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"mn\",\"op\"])   \u003d -1\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"zab\",\"aby\"]) \u003d 1\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"\"])          \u003d 0\n     * StringUtils.indexOfAny(\"\", [\"\"])                    \u003d 0\n     * StringUtils.indexOfAny(\"\", [\"a\"])                   \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStrs  the Strings to search for, may be null\n     * @return the first index of any of the searchStrs in str, -1 if no match\n     ",
      "child_ranges": [
        "(line 1453,col 9)-(line 1455,col 9)",
        "(line 1456,col 9)-(line 1456,col 35)",
        "(line 1459,col 9)-(line 1459,col 36)",
        "(line 1461,col 9)-(line 1461,col 20)",
        "(line 1462,col 9)-(line 1475,col 9)",
        "(line 1477,col 9)-(line 1477,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.lastIndexOfAny(java.lang.String, java.lang.String[])",
      "begin_line": 1505,
      "end_line": 1523,
      "comment": "\n     * \u003cp\u003eFind the latest index of any of a set of potential substrings.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e search array will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e or zero length search array entry will be ignored,\n     * but a search array containing \"\" will return the length of \u003ccode\u003estr\u003c/code\u003e\n     * if \u003ccode\u003estr\u003c/code\u003e is not null. This method uses {@link String#indexOf(String)}\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOfAny(null, *)                   \u003d -1\n     * StringUtils.lastIndexOfAny(*, null)                   \u003d -1\n     * StringUtils.lastIndexOfAny(*, [])                     \u003d -1\n     * StringUtils.lastIndexOfAny(*, [null])                 \u003d -1\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"ab\",\"cd\"]) \u003d 6\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"cd\",\"ab\"]) \u003d 6\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"mn\",\"op\"]) \u003d -1\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"mn\",\"op\"]) \u003d -1\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"mn\",\"\"])   \u003d 10\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStrs  the Strings to search for, may be null\n     * @return the last index of any of the Strings, -1 if no match\n     ",
      "child_ranges": [
        "(line 1506,col 9)-(line 1508,col 9)",
        "(line 1509,col 9)-(line 1509,col 35)",
        "(line 1510,col 9)-(line 1510,col 21)",
        "(line 1511,col 9)-(line 1511,col 20)",
        "(line 1512,col 9)-(line 1521,col 9)",
        "(line 1522,col 9)-(line 1522,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.substring(java.lang.String, int)",
      "begin_line": 1551,
      "end_line": 1569,
      "comment": "\n     * \u003cp\u003eGets a substring from the specified String avoiding exceptions.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative start position can be used to start \u003ccode\u003en\u003c/code\u003e\n     * characters from the end of the String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") String will return \"\".\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substring(null, *)   \u003d null\n     * StringUtils.substring(\"\", *)     \u003d \"\"\n     * StringUtils.substring(\"abc\", 0)  \u003d \"abc\"\n     * StringUtils.substring(\"abc\", 2)  \u003d \"c\"\n     * StringUtils.substring(\"abc\", 4)  \u003d \"\"\n     * StringUtils.substring(\"abc\", -2) \u003d \"bc\"\n     * StringUtils.substring(\"abc\", -4) \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the substring from, may be null\n     * @param start  the position to start from, negative means\n     *  count back from the end of the String by this many characters\n     * @return substring from start position, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 1552,col 9)-(line 1554,col 9)",
        "(line 1557,col 9)-(line 1559,col 9)",
        "(line 1561,col 9)-(line 1563,col 9)",
        "(line 1564,col 9)-(line 1566,col 9)",
        "(line 1568,col 9)-(line 1568,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.substring(java.lang.String, int, int)",
      "begin_line": 1606,
      "end_line": 1637,
      "comment": "\n     * \u003cp\u003eGets a substring from the specified String avoiding exceptions.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative start position can be used to start/end \u003ccode\u003en\u003c/code\u003e\n     * characters from the end of the String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe returned substring starts with the character in the \u003ccode\u003estart\u003c/code\u003e\n     * position and ends before the \u003ccode\u003eend\u003c/code\u003e position. All position counting is\n     * zero-based -- i.e., to start at the beginning of the string use\n     * \u003ccode\u003estart \u003d 0\u003c/code\u003e. Negative start and end positions can be used to\n     * specify offsets relative to the end of the String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf \u003ccode\u003estart\u003c/code\u003e is not strictly to the left of \u003ccode\u003eend\u003c/code\u003e, \"\"\n     * is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substring(null, *, *)    \u003d null\n     * StringUtils.substring(\"\", * ,  *)    \u003d \"\";\n     * StringUtils.substring(\"abc\", 0, 2)   \u003d \"ab\"\n     * StringUtils.substring(\"abc\", 2, 0)   \u003d \"\"\n     * StringUtils.substring(\"abc\", 2, 4)   \u003d \"c\"\n     * StringUtils.substring(\"abc\", 4, 6)   \u003d \"\"\n     * StringUtils.substring(\"abc\", 2, 2)   \u003d \"\"\n     * StringUtils.substring(\"abc\", -2, -1) \u003d \"b\"\n     * StringUtils.substring(\"abc\", -4, 2)  \u003d \"ab\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the substring from, may be null\n     * @param start  the position to start from, negative means\n     *  count back from the end of the String by this many characters\n     * @param end  the position to end at (exclusive), negative means\n     *  count back from the end of the String by this many characters\n     * @return substring from start position to end positon,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 1607,col 9)-(line 1609,col 9)",
        "(line 1612,col 9)-(line 1614,col 9)",
        "(line 1615,col 9)-(line 1617,col 9)",
        "(line 1620,col 9)-(line 1622,col 9)",
        "(line 1625,col 9)-(line 1627,col 9)",
        "(line 1629,col 9)-(line 1631,col 9)",
        "(line 1632,col 9)-(line 1634,col 9)",
        "(line 1636,col 9)-(line 1636,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.left(java.lang.String, int)",
      "begin_line": 1661,
      "end_line": 1672,
      "comment": "\n     * \u003cp\u003eGets the leftmost \u003ccode\u003elen\u003c/code\u003e characters of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf \u003ccode\u003elen\u003c/code\u003e characters are not available, or the\n     * String is \u003ccode\u003enull\u003c/code\u003e, the String will be returned without\n     * an exception. An exception is thrown if len is negative.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.left(null, *)    \u003d null\n     * StringUtils.left(*, -ve)     \u003d \"\"\n     * StringUtils.left(\"\", *)      \u003d \"\"\n     * StringUtils.left(\"abc\", 0)   \u003d \"\"\n     * StringUtils.left(\"abc\", 2)   \u003d \"ab\"\n     * StringUtils.left(\"abc\", 4)   \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the leftmost characters from, may be null\n     * @param len  the length of the required String, must be zero or positive\n     * @return the leftmost characters, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 1662,col 9)-(line 1664,col 9)",
        "(line 1665,col 9)-(line 1667,col 9)",
        "(line 1668,col 9)-(line 1670,col 9)",
        "(line 1671,col 9)-(line 1671,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.right(java.lang.String, int)",
      "begin_line": 1694,
      "end_line": 1705,
      "comment": "\n     * \u003cp\u003eGets the rightmost \u003ccode\u003elen\u003c/code\u003e characters of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf \u003ccode\u003elen\u003c/code\u003e characters are not available, or the String\n     * is \u003ccode\u003enull\u003c/code\u003e, the String will be returned without an\n     * an exception. An exception is thrown if len is negative.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.right(null, *)    \u003d null\n     * StringUtils.right(*, -ve)     \u003d \"\"\n     * StringUtils.right(\"\", *)      \u003d \"\"\n     * StringUtils.right(\"abc\", 0)   \u003d \"\"\n     * StringUtils.right(\"abc\", 2)   \u003d \"bc\"\n     * StringUtils.right(\"abc\", 4)   \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the rightmost characters from, may be null\n     * @param len  the length of the required String, must be zero or positive\n     * @return the rightmost characters, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 1695,col 9)-(line 1697,col 9)",
        "(line 1698,col 9)-(line 1700,col 9)",
        "(line 1701,col 9)-(line 1703,col 9)",
        "(line 1704,col 9)-(line 1704,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.mid(java.lang.String, int, int)",
      "begin_line": 1731,
      "end_line": 1745,
      "comment": "\n     * \u003cp\u003eGets \u003ccode\u003elen\u003c/code\u003e characters from the middle of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf \u003ccode\u003elen\u003c/code\u003e characters are not available, the remainder\n     * of the String will be returned without an exception. If the\n     * String is \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e will be returned.\n     * An exception is thrown if len is negative.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.mid(null, *, *)    \u003d null\n     * StringUtils.mid(*, *, -ve)     \u003d \"\"\n     * StringUtils.mid(\"\", 0, *)      \u003d \"\"\n     * StringUtils.mid(\"abc\", 0, 2)   \u003d \"ab\"\n     * StringUtils.mid(\"abc\", 0, 4)   \u003d \"abc\"\n     * StringUtils.mid(\"abc\", 2, 4)   \u003d \"c\"\n     * StringUtils.mid(\"abc\", 4, 2)   \u003d \"\"\n     * StringUtils.mid(\"abc\", -2, 2)  \u003d \"ab\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the characters from, may be null\n     * @param pos  the position to start from, negative treated as zero\n     * @param len  the length of the required String, must be zero or positive\n     * @return the middle characters, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 1732,col 9)-(line 1734,col 9)",
        "(line 1735,col 9)-(line 1737,col 9)",
        "(line 1738,col 9)-(line 1740,col 9)",
        "(line 1741,col 9)-(line 1743,col 9)",
        "(line 1744,col 9)-(line 1744,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.substringBefore(java.lang.String, java.lang.String)",
      "begin_line": 1774,
      "end_line": 1786,
      "comment": "\n     * \u003cp\u003eGets the substring before the first occurrence of a separator.\n     * The separator is not returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") string input will return the empty string.\n     * A \u003ccode\u003enull\u003c/code\u003e separator will return the input string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringBefore(null, *)      \u003d null\n     * StringUtils.substringBefore(\"\", *)        \u003d \"\"\n     * StringUtils.substringBefore(\"abc\", \"a\")   \u003d \"\"\n     * StringUtils.substringBefore(\"abcba\", \"b\") \u003d \"a\"\n     * StringUtils.substringBefore(\"abc\", \"c\")   \u003d \"ab\"\n     * StringUtils.substringBefore(\"abc\", \"d\")   \u003d \"abc\"\n     * StringUtils.substringBefore(\"abc\", \"\")    \u003d \"\"\n     * StringUtils.substringBefore(\"abc\", null)  \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get a substring from, may be null\n     * @param separator  the String to search for, may be null\n     * @return the substring before the first occurrence of the separator,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1775,col 9)-(line 1777,col 9)",
        "(line 1778,col 9)-(line 1780,col 9)",
        "(line 1781,col 9)-(line 1781,col 41)",
        "(line 1782,col 9)-(line 1784,col 9)",
        "(line 1785,col 9)-(line 1785,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.substringAfter(java.lang.String, java.lang.String)",
      "begin_line": 1814,
      "end_line": 1826,
      "comment": "\n     * \u003cp\u003eGets the substring after the first occurrence of a separator.\n     * The separator is not returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") string input will return the empty string.\n     * A \u003ccode\u003enull\u003c/code\u003e separator will return the empty string if the\n     * input string is not \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringAfter(null, *)      \u003d null\n     * StringUtils.substringAfter(\"\", *)        \u003d \"\"\n     * StringUtils.substringAfter(*, null)      \u003d \"\"\n     * StringUtils.substringAfter(\"abc\", \"a\")   \u003d \"bc\"\n     * StringUtils.substringAfter(\"abcba\", \"b\") \u003d \"cba\"\n     * StringUtils.substringAfter(\"abc\", \"c\")   \u003d \"\"\n     * StringUtils.substringAfter(\"abc\", \"d\")   \u003d \"\"\n     * StringUtils.substringAfter(\"abc\", \"\")    \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get a substring from, may be null\n     * @param separator  the String to search for, may be null\n     * @return the substring after the first occurrence of the separator,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1815,col 9)-(line 1817,col 9)",
        "(line 1818,col 9)-(line 1820,col 9)",
        "(line 1821,col 9)-(line 1821,col 41)",
        "(line 1822,col 9)-(line 1824,col 9)",
        "(line 1825,col 9)-(line 1825,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.substringBeforeLast(java.lang.String, java.lang.String)",
      "begin_line": 1853,
      "end_line": 1862,
      "comment": "\n     * \u003cp\u003eGets the substring before the last occurrence of a separator.\n     * The separator is not returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") string input will return the empty string.\n     * An empty or \u003ccode\u003enull\u003c/code\u003e separator will return the input string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringBeforeLast(null, *)      \u003d null\n     * StringUtils.substringBeforeLast(\"\", *)        \u003d \"\"\n     * StringUtils.substringBeforeLast(\"abcba\", \"b\") \u003d \"abc\"\n     * StringUtils.substringBeforeLast(\"abc\", \"c\")   \u003d \"ab\"\n     * StringUtils.substringBeforeLast(\"a\", \"a\")     \u003d \"\"\n     * StringUtils.substringBeforeLast(\"a\", \"z\")     \u003d \"a\"\n     * StringUtils.substringBeforeLast(\"a\", null)    \u003d \"a\"\n     * StringUtils.substringBeforeLast(\"a\", \"\")      \u003d \"a\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get a substring from, may be null\n     * @param separator  the String to search for, may be null\n     * @return the substring before the last occurrence of the separator,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1854,col 9)-(line 1856,col 9)",
        "(line 1857,col 9)-(line 1857,col 45)",
        "(line 1858,col 9)-(line 1860,col 9)",
        "(line 1861,col 9)-(line 1861,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.substringAfterLast(java.lang.String, java.lang.String)",
      "begin_line": 1891,
      "end_line": 1903,
      "comment": "\n     * \u003cp\u003eGets the substring after the last occurrence of a separator.\n     * The separator is not returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") string input will return the empty string.\n     * An empty or \u003ccode\u003enull\u003c/code\u003e separator will return the empty string if\n     * the input string is not \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringAfterLast(null, *)      \u003d null\n     * StringUtils.substringAfterLast(\"\", *)        \u003d \"\"\n     * StringUtils.substringAfterLast(*, \"\")        \u003d \"\"\n     * StringUtils.substringAfterLast(*, null)      \u003d \"\"\n     * StringUtils.substringAfterLast(\"abc\", \"a\")   \u003d \"bc\"\n     * StringUtils.substringAfterLast(\"abcba\", \"b\") \u003d \"a\"\n     * StringUtils.substringAfterLast(\"abc\", \"c\")   \u003d \"\"\n     * StringUtils.substringAfterLast(\"a\", \"a\")     \u003d \"\"\n     * StringUtils.substringAfterLast(\"a\", \"z\")     \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get a substring from, may be null\n     * @param separator  the String to search for, may be null\n     * @return the substring after the last occurrence of the separator,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1892,col 9)-(line 1894,col 9)",
        "(line 1895,col 9)-(line 1897,col 9)",
        "(line 1898,col 9)-(line 1898,col 45)",
        "(line 1899,col 9)-(line 1901,col 9)",
        "(line 1902,col 9)-(line 1902,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.substringBetween(java.lang.String, java.lang.String)",
      "begin_line": 1928,
      "end_line": 1930,
      "comment": "\n     * \u003cp\u003eGets the String that is nested in between two instances of the\n     * same String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e tag returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringBetween(null, *)            \u003d null\n     * StringUtils.substringBetween(\"\", \"\")             \u003d \"\"\n     * StringUtils.substringBetween(\"\", \"tag\")          \u003d null\n     * StringUtils.substringBetween(\"tagabctag\", null)  \u003d null\n     * StringUtils.substringBetween(\"tagabctag\", \"\")    \u003d \"\"\n     * StringUtils.substringBetween(\"tagabctag\", \"tag\") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String containing the substring, may be null\n     * @param tag  the String before and after the substring, may be null\n     * @return the substring, \u003ccode\u003enull\u003c/code\u003e if no match\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1929,col 9)-(line 1929,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.substringBetween(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 1959,
      "end_line": 1971,
      "comment": "\n     * \u003cp\u003eGets the String that is nested in between two Strings.\n     * Only the first match is returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e open/close returns \u003ccode\u003enull\u003c/code\u003e (no match).\n     * An empty (\"\") open and close returns an empty string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringBetween(\"wx[b]yz\", \"[\", \"]\") \u003d \"b\"\n     * StringUtils.substringBetween(null, *, *)          \u003d null\n     * StringUtils.substringBetween(*, null, *)          \u003d null\n     * StringUtils.substringBetween(*, *, null)          \u003d null\n     * StringUtils.substringBetween(\"\", \"\", \"\")          \u003d \"\"\n     * StringUtils.substringBetween(\"\", \"\", \"]\")         \u003d null\n     * StringUtils.substringBetween(\"\", \"[\", \"]\")        \u003d null\n     * StringUtils.substringBetween(\"yabcz\", \"\", \"\")     \u003d \"\"\n     * StringUtils.substringBetween(\"yabcz\", \"y\", \"z\")   \u003d \"abc\"\n     * StringUtils.substringBetween(\"yabczyabcz\", \"y\", \"z\")   \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String containing the substring, may be null\n     * @param open  the String before the substring, may be null\n     * @param close  the String after the substring, may be null\n     * @return the substring, \u003ccode\u003enull\u003c/code\u003e if no match\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1960,col 9)-(line 1962,col 9)",
        "(line 1963,col 9)-(line 1963,col 38)",
        "(line 1964,col 9)-(line 1969,col 9)",
        "(line 1970,col 9)-(line 1970,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.substringsBetween(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 1995,
      "end_line": 2024,
      "comment": "\n     * \u003cp\u003eSearches a String for substrings delimited by a start and end tag,\n     * returning all matching substrings in an array.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e open/close returns \u003ccode\u003enull\u003c/code\u003e (no match).\n     * An empty (\"\") open/close returns \u003ccode\u003enull\u003c/code\u003e (no match).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringsBetween(\"[a][b][c]\", \"[\", \"]\") \u003d [\"a\",\"b\",\"c\"]\n     * StringUtils.substringsBetween(null, *, *)            \u003d null\n     * StringUtils.substringsBetween(*, null, *)            \u003d null\n     * StringUtils.substringsBetween(*, *, null)            \u003d null\n     * StringUtils.substringsBetween(\"\", \"[\", \"]\")          \u003d []\n     * \u003c/pre\u003e\n     *\n     * @param str  the String containing the substrings, null returns null, empty returns empty\n     * @param open  the String identifying the start of the substring, empty returns null\n     * @param close  the String identifying the end of the substring, empty returns null\n     * @return a String Array of substrings, or \u003ccode\u003enull\u003c/code\u003e if no match\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 1996,col 9)-(line 1998,col 9)",
        "(line 1999,col 9)-(line 1999,col 34)",
        "(line 2000,col 9)-(line 2002,col 9)",
        "(line 2003,col 9)-(line 2003,col 38)",
        "(line 2004,col 9)-(line 2004,col 36)",
        "(line 2005,col 9)-(line 2005,col 36)",
        "(line 2006,col 9)-(line 2006,col 20)",
        "(line 2007,col 9)-(line 2019,col 9)",
        "(line 2020,col 9)-(line 2022,col 9)",
        "(line 2023,col 9)-(line 2023,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.getNestedString(java.lang.String, java.lang.String)",
      "begin_line": 2050,
      "end_line": 2052,
      "comment": "\n     * \u003cp\u003eGets the String that is nested in between two instances of the\n     * same String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e tag returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.getNestedString(null, *)            \u003d null\n     * StringUtils.getNestedString(\"\", \"\")             \u003d \"\"\n     * StringUtils.getNestedString(\"\", \"tag\")          \u003d null\n     * StringUtils.getNestedString(\"tagabctag\", null)  \u003d null\n     * StringUtils.getNestedString(\"tagabctag\", \"\")    \u003d \"\"\n     * StringUtils.getNestedString(\"tagabctag\", \"tag\") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String containing nested-string, may be null\n     * @param tag  the String before and after nested-string, may be null\n     * @return the nested String, \u003ccode\u003enull\u003c/code\u003e if no match\n     * @deprecated Use the better named {@link #substringBetween(String, String)}.\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 2051,col 9)-(line 2051,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.getNestedString(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 2080,
      "end_line": 2082,
      "comment": "\n     * \u003cp\u003eGets the String that is nested in between two Strings.\n     * Only the first match is returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e open/close returns \u003ccode\u003enull\u003c/code\u003e (no match).\n     * An empty (\"\") open/close returns an empty string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.getNestedString(null, *, *)          \u003d null\n     * StringUtils.getNestedString(\"\", \"\", \"\")          \u003d \"\"\n     * StringUtils.getNestedString(\"\", \"\", \"tag\")       \u003d null\n     * StringUtils.getNestedString(\"\", \"tag\", \"tag\")    \u003d null\n     * StringUtils.getNestedString(\"yabcz\", null, null) \u003d null\n     * StringUtils.getNestedString(\"yabcz\", \"\", \"\")     \u003d \"\"\n     * StringUtils.getNestedString(\"yabcz\", \"y\", \"z\")   \u003d \"abc\"\n     * StringUtils.getNestedString(\"yabczyabcz\", \"y\", \"z\")   \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String containing nested-string, may be null\n     * @param open  the String before nested-string, may be null\n     * @param close  the String after nested-string, may be null\n     * @return the nested String, \u003ccode\u003enull\u003c/code\u003e if no match\n     * @deprecated Use the better named {@link #substringBetween(String, String, String)}.\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 2081,col 9)-(line 2081,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.split(java.lang.String)",
      "begin_line": 2108,
      "end_line": 2110,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, using whitespace as the\n     * separator.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as one separator.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.split(null)       \u003d null\n     * StringUtils.split(\"\")         \u003d []\n     * StringUtils.split(\"abc def\")  \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\"abc  def\") \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\" abc \")    \u003d [\"abc\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 2109,col 9)-(line 2109,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.split(java.lang.String, char)",
      "begin_line": 2136,
      "end_line": 2138,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator specified.\n     * This is an alternative to using StringTokenizer.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as one separator.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.split(null, *)         \u003d null\n     * StringUtils.split(\"\", *)           \u003d []\n     * StringUtils.split(\"a.b.c\", \u0027.\u0027)    \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.split(\"a..b.c\", \u0027.\u0027)   \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.split(\"a:b:c\", \u0027.\u0027)    \u003d [\"a:b:c\"]\n     * StringUtils.split(\"a b c\", \u0027 \u0027)    \u003d [\"a\", \"b\", \"c\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separatorChar  the character used as the delimiter\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2137,col 9)-(line 2137,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.split(java.lang.String, java.lang.String)",
      "begin_line": 2165,
      "end_line": 2167,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separators specified.\n     * This is an alternative to using StringTokenizer.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as one separator.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e separatorChars splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.split(null, *)         \u003d null\n     * StringUtils.split(\"\", *)           \u003d []\n     * StringUtils.split(\"abc def\", null) \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\"abc def\", \" \")  \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\"abc  def\", \" \") \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\"ab:cd:ef\", \":\") \u003d [\"ab\", \"cd\", \"ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separatorChars  the characters used as the delimiters,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 2166,col 9)-(line 2166,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.split(java.lang.String, java.lang.String, int)",
      "begin_line": 2199,
      "end_line": 2201,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array with a maximum length,\n     * separators specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as one separator.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e separatorChars splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf more than \u003ccode\u003emax\u003c/code\u003e delimited substrings are found, the last\n     * returned string includes all characters after the first \u003ccode\u003emax - 1\u003c/code\u003e\n     * returned strings (including separator characters).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.split(null, *, *)            \u003d null\n     * StringUtils.split(\"\", *, *)              \u003d []\n     * StringUtils.split(\"ab de fg\", null, 0)   \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.split(\"ab   de fg\", null, 0) \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.split(\"ab:cd:ef\", \":\", 0)    \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.split(\"ab:cd:ef\", \":\", 2)    \u003d [\"ab\", \"cd:ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separatorChars  the characters used as the delimiters,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @param max  the maximum number of elements to include in the\n     *  array. A zero or negative value implies no limit\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 2200,col 9)-(line 2200,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.splitByWholeSeparator(java.lang.String, java.lang.String)",
      "begin_line": 2226,
      "end_line": 2228,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator string specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator(s) will not be included in the returned String array.\n     * Adjacent separators are treated as one separator.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e separator splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitByWholeSeparator(null, *)               \u003d null\n     * StringUtils.splitByWholeSeparator(\"\", *)                 \u003d []\n     * StringUtils.splitByWholeSeparator(\"ab de fg\", null)      \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparator(\"ab   de fg\", null)    \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparator(\"ab:cd:ef\", \":\")       \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitByWholeSeparator(\"ab-!-cd-!-ef\", \"-!-\") \u003d [\"ab\", \"cd\", \"ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separator  String containing the String to be used as a delimiter,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String was input\n     ",
      "child_ranges": [
        "(line 2227,col 9)-(line 2227,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.splitByWholeSeparator(java.lang.String, java.lang.String, int)",
      "begin_line": 2257,
      "end_line": 2259,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator string specified.\n     * Returns a maximum of \u003ccode\u003emax\u003c/code\u003e substrings.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator(s) will not be included in the returned String array.\n     * Adjacent separators are treated as one separator.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e separator splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitByWholeSeparator(null, *, *)               \u003d null\n     * StringUtils.splitByWholeSeparator(\"\", *, *)                 \u003d []\n     * StringUtils.splitByWholeSeparator(\"ab de fg\", null, 0)      \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparator(\"ab   de fg\", null, 0)    \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparator(\"ab:cd:ef\", \":\", 2)       \u003d [\"ab\", \"cd:ef\"]\n     * StringUtils.splitByWholeSeparator(\"ab-!-cd-!-ef\", \"-!-\", 5) \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitByWholeSeparator(\"ab-!-cd-!-ef\", \"-!-\", 2) \u003d [\"ab\", \"cd-!-ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separator  String containing the String to be used as a delimiter,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @param max  the maximum number of elements to include in the returned\n     *  array. A zero or negative value implies no limit.\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String was input\n     ",
      "child_ranges": [
        "(line 2258,col 9)-(line 2258,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens(java.lang.String, java.lang.String)",
      "begin_line": 2286,
      "end_line": 2288,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator string specified. \u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e separator splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(null, *)               \u003d null\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"\", *)                 \u003d []\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab de fg\", null)      \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab   de fg\", null)    \u003d [\"ab\", \"\", \"\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab:cd:ef\", \":\")       \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab-!-cd-!-ef\", \"-!-\") \u003d [\"ab\", \"cd\", \"ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separator  String containing the String to be used as a delimiter,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String was input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 2287,col 9)-(line 2287,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens(java.lang.String, java.lang.String, int)",
      "begin_line": 2319,
      "end_line": 2321,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator string specified.\n     * Returns a maximum of \u003ccode\u003emax\u003c/code\u003e substrings.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e separator splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(null, *, *)               \u003d null\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"\", *, *)                 \u003d []\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab de fg\", null, 0)      \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab   de fg\", null, 0)    \u003d [\"ab\", \"\", \"\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab:cd:ef\", \":\", 2)       \u003d [\"ab\", \"cd:ef\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab-!-cd-!-ef\", \"-!-\", 5) \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab-!-cd-!-ef\", \"-!-\", 2) \u003d [\"ab\", \"cd-!-ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separator  String containing the String to be used as a delimiter,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @param max  the maximum number of elements to include in the returned\n     *  array. A zero or negative value implies no limit.\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String was input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 2320,col 9)-(line 2320,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.splitByWholeSeparatorWorker(java.lang.String, java.lang.String, int, boolean)",
      "begin_line": 2337,
      "end_line": 2402,
      "comment": "\n     * Performs the logic for the \u003ccode\u003esplitByWholeSeparatorPreserveAllTokens\u003c/code\u003e methods.\n     *\n     * @param str  the String to parse, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param separator  String containing the String to be used as a delimiter,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @param max  the maximum number of elements to include in the returned\n     *  array. A zero or negative value implies no limit.\n     * @param preserveAllTokens if \u003ccode\u003etrue\u003c/code\u003e, adjacent separators are\n     * treated as empty token separators; if \u003ccode\u003efalse\u003c/code\u003e, adjacent\n     * separators are treated as one separator.\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 2340,col 9)-(line 2342,col 9)",
        "(line 2344,col 9)-(line 2344,col 31)",
        "(line 2346,col 9)-(line 2348,col 9)",
        "(line 2350,col 9)-(line 2353,col 9)",
        "(line 2355,col 9)-(line 2355,col 49)",
        "(line 2357,col 9)-(line 2357,col 47)",
        "(line 2358,col 9)-(line 2358,col 35)",
        "(line 2359,col 9)-(line 2359,col 20)",
        "(line 2360,col 9)-(line 2360,col 20)",
        "(line 2361,col 9)-(line 2399,col 9)",
        "(line 2401,col 9)-(line 2401,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.splitPreserveAllTokens(java.lang.String)",
      "begin_line": 2429,
      "end_line": 2431,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, using whitespace as the\n     * separator, preserving all tokens, including empty tokens created by \n     * adjacent separators. This is an alternative to using StringTokenizer.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitPreserveAllTokens(null)       \u003d null\n     * StringUtils.splitPreserveAllTokens(\"\")         \u003d []\n     * StringUtils.splitPreserveAllTokens(\"abc def\")  \u003d [\"abc\", \"def\"]\n     * StringUtils.splitPreserveAllTokens(\"abc  def\") \u003d [\"abc\", \"\", \"def\"]\n     * StringUtils.splitPreserveAllTokens(\" abc \")    \u003d [\"\", \"abc\", \"\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2430,col 9)-(line 2430,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.splitPreserveAllTokens(java.lang.String, char)",
      "begin_line": 2465,
      "end_line": 2467,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator specified,\n     * preserving all tokens, including empty tokens created by adjacent\n     * separators. This is an alternative to using StringTokenizer.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitPreserveAllTokens(null, *)         \u003d null\n     * StringUtils.splitPreserveAllTokens(\"\", *)           \u003d []\n     * StringUtils.splitPreserveAllTokens(\"a.b.c\", \u0027.\u0027)    \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"a..b.c\", \u0027.\u0027)   \u003d [\"a\", \"\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"a:b:c\", \u0027.\u0027)    \u003d [\"a:b:c\"]\n     * StringUtils.splitPreserveAllTokens(\"a\\tb\\nc\", null) \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"a b c\", \u0027 \u0027)    \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"a b c \", \u0027 \u0027)   \u003d [\"a\", \"b\", \"c\", \"\"]\n     * StringUtils.splitPreserveAllTokens(\"a b c  \", \u0027 \u0027)   \u003d [\"a\", \"b\", \"c\", \"\", \"\"]\n     * StringUtils.splitPreserveAllTokens(\" a b c\", \u0027 \u0027)   \u003d [\"\", a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"  a b c\", \u0027 \u0027)  \u003d [\"\", \"\", a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\" a b c \", \u0027 \u0027)  \u003d [\"\", a\", \"b\", \"c\", \"\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param separatorChar  the character used as the delimiter,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2466,col 9)-(line 2466,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.splitWorker(java.lang.String, char, boolean)",
      "begin_line": 2481,
      "end_line": 2513,
      "comment": "\n     * Performs the logic for the \u003ccode\u003esplit\u003c/code\u003e and \n     * \u003ccode\u003esplitPreserveAllTokens\u003c/code\u003e methods that do not return a\n     * maximum array length.\n     *\n     * @param str  the String to parse, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param separatorChar the separate character\n     * @param preserveAllTokens if \u003ccode\u003etrue\u003c/code\u003e, adjacent separators are\n     * treated as empty token separators; if \u003ccode\u003efalse\u003c/code\u003e, adjacent\n     * separators are treated as one separator.\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 2484,col 9)-(line 2486,col 9)",
        "(line 2487,col 9)-(line 2487,col 31)",
        "(line 2488,col 9)-(line 2490,col 9)",
        "(line 2491,col 9)-(line 2491,col 36)",
        "(line 2492,col 9)-(line 2492,col 29)",
        "(line 2493,col 9)-(line 2493,col 30)",
        "(line 2494,col 9)-(line 2494,col 34)",
        "(line 2495,col 9)-(line 2508,col 9)",
        "(line 2509,col 9)-(line 2511,col 9)",
        "(line 2512,col 9)-(line 2512,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.splitPreserveAllTokens(java.lang.String, java.lang.String)",
      "begin_line": 2548,
      "end_line": 2550,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separators specified, \n     * preserving all tokens, including empty tokens created by adjacent\n     * separators. This is an alternative to using StringTokenizer.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e separatorChars splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitPreserveAllTokens(null, *)           \u003d null\n     * StringUtils.splitPreserveAllTokens(\"\", *)             \u003d []\n     * StringUtils.splitPreserveAllTokens(\"abc def\", null)   \u003d [\"abc\", \"def\"]\n     * StringUtils.splitPreserveAllTokens(\"abc def\", \" \")    \u003d [\"abc\", \"def\"]\n     * StringUtils.splitPreserveAllTokens(\"abc  def\", \" \")   \u003d [\"abc\", \"\", def\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef\", \":\")   \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef:\", \":\")  \u003d [\"ab\", \"cd\", \"ef\", \"\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef::\", \":\") \u003d [\"ab\", \"cd\", \"ef\", \"\", \"\"]\n     * StringUtils.splitPreserveAllTokens(\"ab::cd:ef\", \":\")  \u003d [\"ab\", \"\", cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\":cd:ef\", \":\")     \u003d [\"\", cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"::cd:ef\", \":\")    \u003d [\"\", \"\", cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\":cd:ef:\", \":\")    \u003d [\"\", cd\", \"ef\", \"\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param separatorChars  the characters used as the delimiters,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2549,col 9)-(line 2549,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.splitPreserveAllTokens(java.lang.String, java.lang.String, int)",
      "begin_line": 2588,
      "end_line": 2590,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array with a maximum length,\n     * separators specified, preserving all tokens, including empty tokens \n     * created by adjacent separators.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * Adjacent separators are treated as one separator.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e separatorChars splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf more than \u003ccode\u003emax\u003c/code\u003e delimited substrings are found, the last\n     * returned string includes all characters after the first \u003ccode\u003emax - 1\u003c/code\u003e\n     * returned strings (including separator characters).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitPreserveAllTokens(null, *, *)            \u003d null\n     * StringUtils.splitPreserveAllTokens(\"\", *, *)              \u003d []\n     * StringUtils.splitPreserveAllTokens(\"ab de fg\", null, 0)   \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab   de fg\", null, 0) \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef\", \":\", 0)    \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef\", \":\", 2)    \u003d [\"ab\", \"cd:ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab   de fg\", null, 2) \u003d [\"ab\", \"  de fg\"]\n     * StringUtils.splitPreserveAllTokens(\"ab   de fg\", null, 3) \u003d [\"ab\", \"\", \" de fg\"]\n     * StringUtils.splitPreserveAllTokens(\"ab   de fg\", null, 4) \u003d [\"ab\", \"\", \"\", \"de fg\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param separatorChars  the characters used as the delimiters,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @param max  the maximum number of elements to include in the\n     *  array. A zero or negative value implies no limit\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2589,col 9)-(line 2589,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.splitWorker(java.lang.String, java.lang.String, int, boolean)",
      "begin_line": 2606,
      "end_line": 2689,
      "comment": "\n     * Performs the logic for the \u003ccode\u003esplit\u003c/code\u003e and \n     * \u003ccode\u003esplitPreserveAllTokens\u003c/code\u003e methods that return a maximum array \n     * length.\n     *\n     * @param str  the String to parse, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param separatorChars the separate character\n     * @param max  the maximum number of elements to include in the\n     *  array. A zero or negative value implies no limit.\n     * @param preserveAllTokens if \u003ccode\u003etrue\u003c/code\u003e, adjacent separators are\n     * treated as empty token separators; if \u003ccode\u003efalse\u003c/code\u003e, adjacent\n     * separators are treated as one separator.\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 2611,col 9)-(line 2613,col 9)",
        "(line 2614,col 9)-(line 2614,col 31)",
        "(line 2615,col 9)-(line 2617,col 9)",
        "(line 2618,col 9)-(line 2618,col 36)",
        "(line 2619,col 9)-(line 2619,col 26)",
        "(line 2620,col 9)-(line 2620,col 29)",
        "(line 2621,col 9)-(line 2621,col 30)",
        "(line 2622,col 9)-(line 2622,col 34)",
        "(line 2623,col 9)-(line 2684,col 9)",
        "(line 2685,col 9)-(line 2687,col 9)",
        "(line 2688,col 9)-(line 2688,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.splitByCharacterType(java.lang.String)",
      "begin_line": 2710,
      "end_line": 2712,
      "comment": "\n     * \u003cp\u003eSplits a String by Character type as returned by\n     * \u003ccode\u003ejava.lang.Character.getType(char)\u003c/code\u003e. Groups of contiguous\n     * characters of the same type are returned as complete tokens. \n     * \u003cpre\u003e\n     * StringUtils.splitByCharacterType(null)         \u003d null\n     * StringUtils.splitByCharacterType(\"\")           \u003d []\n     * StringUtils.splitByCharacterType(\"ab de fg\")   \u003d [\"ab\", \" \", \"de\", \" \", \"fg\"]\n     * StringUtils.splitByCharacterType(\"ab   de fg\") \u003d [\"ab\", \"   \", \"de\", \" \", \"fg\"]\n     * StringUtils.splitByCharacterType(\"ab:cd:ef\")   \u003d [\"ab\", \":\", \"cd\", \":\", \"ef\"]\n     * StringUtils.splitByCharacterType(\"number5\")    \u003d [\"number\", \"5\"]\n     * StringUtils.splitByCharacterType(\"fooBar\")     \u003d [\"foo\", \"B\", \"ar\"]\n     * StringUtils.splitByCharacterType(\"foo200Bar\")  \u003d [\"foo\", \"200\", \"B\", \"ar\"]\n     * StringUtils.splitByCharacterType(\"ASFRules\")   \u003d [\"ASFR\", \"ules\"]\n     * \u003c/pre\u003e\n     * @param str the String to split, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 2711,col 9)-(line 2711,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase(java.lang.String)",
      "begin_line": 2738,
      "end_line": 2740,
      "comment": "\n     * \u003cp\u003eSplits a String by Character type as returned by\n     * \u003ccode\u003ejava.lang.Character.getType(char)\u003c/code\u003e. Groups of contiguous\n     * characters of the same type are returned as complete tokens, with the\n     * following exception: the character of type\n     * \u003ccode\u003eCharacter.UPPERCASE_LETTER\u003c/code\u003e, if any, immediately\n     * preceding a token of type \u003ccode\u003eCharacter.LOWERCASE_LETTER\u003c/code\u003e\n     * will belong to the following token rather than to the preceding, if any,\n     * \u003ccode\u003eCharacter.UPPERCASE_LETTER\u003c/code\u003e token. \n     * \u003cpre\u003e\n     * StringUtils.splitByCharacterTypeCamelCase(null)         \u003d null\n     * StringUtils.splitByCharacterTypeCamelCase(\"\")           \u003d []\n     * StringUtils.splitByCharacterTypeCamelCase(\"ab de fg\")   \u003d [\"ab\", \" \", \"de\", \" \", \"fg\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"ab   de fg\") \u003d [\"ab\", \"   \", \"de\", \" \", \"fg\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"ab:cd:ef\")   \u003d [\"ab\", \":\", \"cd\", \":\", \"ef\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"number5\")    \u003d [\"number\", \"5\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"fooBar\")     \u003d [\"foo\", \"Bar\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"foo200Bar\")  \u003d [\"foo\", \"200\", \"Bar\"]\n     * StringUtils.splitByCharacterTypeCamelCase(\"ASFRules\")   \u003d [\"ASF\", \"Rules\"]\n     * \u003c/pre\u003e\n     * @param str the String to split, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 2739,col 9)-(line 2739,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.splitByCharacterType(java.lang.String, boolean)",
      "begin_line": 2756,
      "end_line": 2786,
      "comment": "\n     * \u003cp\u003eSplits a String by Character type as returned by\n     * \u003ccode\u003ejava.lang.Character.getType(char)\u003c/code\u003e. Groups of contiguous\n     * characters of the same type are returned as complete tokens, with the\n     * following exception: if \u003ccode\u003ecamelCase\u003c/code\u003e is \u003ccode\u003etrue\u003c/code\u003e,\n     * the character of type \u003ccode\u003eCharacter.UPPERCASE_LETTER\u003c/code\u003e, if any,\n     * immediately preceding a token of type \u003ccode\u003eCharacter.LOWERCASE_LETTER\u003c/code\u003e\n     * will belong to the following token rather than to the preceding, if any,\n     * \u003ccode\u003eCharacter.UPPERCASE_LETTER\u003c/code\u003e token. \n     * @param str the String to split, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param camelCase whether to use so-called \"camel-case\" for letter types\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 2757,col 9)-(line 2759,col 9)",
        "(line 2760,col 9)-(line 2762,col 9)",
        "(line 2763,col 9)-(line 2763,col 37)",
        "(line 2764,col 9)-(line 2764,col 36)",
        "(line 2765,col 9)-(line 2765,col 27)",
        "(line 2766,col 9)-(line 2766,col 59)",
        "(line 2767,col 9)-(line 2783,col 9)",
        "(line 2784,col 9)-(line 2784,col 67)",
        "(line 2785,col 9)-(line 2785,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.concatenate(java.lang.Object[])",
      "begin_line": 2808,
      "end_line": 2810,
      "comment": "\n     * \u003cp\u003eConcatenates elements of an array into a single String.\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.concatenate(null)            \u003d null\n     * StringUtils.concatenate([])              \u003d \"\"\n     * StringUtils.concatenate([null])          \u003d \"\"\n     * StringUtils.concatenate([\"a\", \"b\", \"c\"]) \u003d \"abc\"\n     * StringUtils.concatenate([null, \"\", \"a\"]) \u003d \"a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to concatenate, may be null\n     * @return the concatenated String, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @deprecated Use the better named {@link #join(Object[])} instead.\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 2809,col 9)-(line 2809,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.join(java.lang.Object[])",
      "begin_line": 2832,
      "end_line": 2834,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo separator is added to the joined String.\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null)            \u003d null\n     * StringUtils.join([])              \u003d \"\"\n     * StringUtils.join([null])          \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"]) \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"]) \u003d \"a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to join together, may be null\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2833,col 9)-(line 2833,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.join(java.lang.Object[], char)",
      "begin_line": 2858,
      "end_line": 2864,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null, *)               \u003d null\n     * StringUtils.join([], *)                 \u003d \"\"\n     * StringUtils.join([null], *)             \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \u0027;\u0027)  \u003d \"a;b;c\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], null) \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"], \u0027;\u0027)  \u003d \";;a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to join together, may be null\n     * @param separator  the separator character to use\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2859,col 9)-(line 2861,col 9)",
        "(line 2863,col 9)-(line 2863,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.join(java.lang.Object[], char, int, int)",
      "begin_line": 2892,
      "end_line": 2913,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null, *)               \u003d null\n     * StringUtils.join([], *)                 \u003d \"\"\n     * StringUtils.join([null], *)             \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \u0027;\u0027)  \u003d \"a;b;c\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], null) \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"], \u0027;\u0027)  \u003d \";;a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to join together, may be null\n     * @param separator  the separator character to use\n     * @param startIndex the first index to start joining from.  It is\n     * an error to pass in an end index past the end of the array\n     * @param endIndex the index to stop joining from (exclusive). It is\n     * an error to pass in an end index past the end of the array\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2893,col 9)-(line 2895,col 9)",
        "(line 2896,col 9)-(line 2896,col 46)",
        "(line 2897,col 9)-(line 2899,col 9)",
        "(line 2901,col 9)-(line 2901,col 98)",
        "(line 2902,col 9)-(line 2902,col 53)",
        "(line 2904,col 9)-(line 2911,col 9)",
        "(line 2912,col 9)-(line 2912,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.join(java.lang.Object[], java.lang.String)",
      "begin_line": 2939,
      "end_line": 2944,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * A \u003ccode\u003enull\u003c/code\u003e separator is the same as an empty String (\"\").\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null, *)                \u003d null\n     * StringUtils.join([], *)                  \u003d \"\"\n     * StringUtils.join([null], *)              \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \"--\")  \u003d \"a--b--c\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], null)  \u003d \"abc\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \"\")    \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"], \u0027,\u0027)   \u003d \",,a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to join together, may be null\n     * @param separator  the separator character to use, null treated as \"\"\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2940,col 9)-(line 2942,col 9)",
        "(line 2943,col 9)-(line 2943,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.join(java.lang.Object[], java.lang.String, int, int)",
      "begin_line": 2973,
      "end_line": 3002,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * A \u003ccode\u003enull\u003c/code\u003e separator is the same as an empty String (\"\").\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null, *)                \u003d null\n     * StringUtils.join([], *)                  \u003d \"\"\n     * StringUtils.join([null], *)              \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \"--\")  \u003d \"a--b--c\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], null)  \u003d \"abc\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \"\")    \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"], \u0027,\u0027)   \u003d \",,a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to join together, may be null\n     * @param separator  the separator character to use, null treated as \"\"\n     * @param startIndex the first index to start joining from.  It is\n     * an error to pass in an end index past the end of the array\n     * @param endIndex the index to stop joining from (exclusive). It is\n     * an error to pass in an end index past the end of the array\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2974,col 9)-(line 2976,col 9)",
        "(line 2977,col 9)-(line 2979,col 9)",
        "(line 2983,col 9)-(line 2983,col 46)",
        "(line 2984,col 9)-(line 2986,col 9)",
        "(line 2988,col 9)-(line 2989,col 46)",
        "(line 2991,col 9)-(line 2991,col 53)",
        "(line 2993,col 9)-(line 3000,col 9)",
        "(line 3001,col 9)-(line 3001,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.join(java.util.Iterator, char)",
      "begin_line": 3018,
      "end_line": 3047,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided \u003ccode\u003eIterator\u003c/code\u003e into\n     * a single String containing the provided elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list. Null objects or empty\n     * strings within the iteration are represented by empty strings.\u003c/p\u003e\n     *\n     * \u003cp\u003eSee the examples here: {@link #join(Object[],char)}. \u003c/p\u003e\n     *\n     * @param iterator  the \u003ccode\u003eIterator\u003c/code\u003e of values to join together, may be null\n     * @param separator  the separator character to use\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null iterator input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 3021,col 9)-(line 3023,col 9)",
        "(line 3024,col 9)-(line 3026,col 9)",
        "(line 3027,col 9)-(line 3027,col 39)",
        "(line 3028,col 9)-(line 3030,col 9)",
        "(line 3033,col 9)-(line 3033,col 49)",
        "(line 3034,col 9)-(line 3036,col 9)",
        "(line 3038,col 9)-(line 3044,col 9)",
        "(line 3046,col 9)-(line 3046,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.join(java.util.Iterator, java.lang.String)",
      "begin_line": 3062,
      "end_line": 3092,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided \u003ccode\u003eIterator\u003c/code\u003e into\n     * a single String containing the provided elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * A \u003ccode\u003enull\u003c/code\u003e separator is the same as an empty String (\"\").\u003c/p\u003e\n     *\n     * \u003cp\u003eSee the examples here: {@link #join(Object[],String)}. \u003c/p\u003e\n     *\n     * @param iterator  the \u003ccode\u003eIterator\u003c/code\u003e of values to join together, may be null\n     * @param separator  the separator character to use, null treated as \"\"\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null iterator input\n     ",
      "child_ranges": [
        "(line 3065,col 9)-(line 3067,col 9)",
        "(line 3068,col 9)-(line 3070,col 9)",
        "(line 3071,col 9)-(line 3071,col 39)",
        "(line 3072,col 9)-(line 3074,col 9)",
        "(line 3077,col 9)-(line 3077,col 49)",
        "(line 3078,col 9)-(line 3080,col 9)",
        "(line 3082,col 9)-(line 3090,col 9)",
        "(line 3091,col 9)-(line 3091,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.join(java.util.Collection, char)",
      "begin_line": 3108,
      "end_line": 3113,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided \u003ccode\u003eCollection\u003c/code\u003e into\n     * a single String containing the provided elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list. Null objects or empty\n     * strings within the iteration are represented by empty strings.\u003c/p\u003e\n     *\n     * \u003cp\u003eSee the examples here: {@link #join(Object[],char)}. \u003c/p\u003e\n     *\n     * @param collection  the \u003ccode\u003eCollection\u003c/code\u003e of values to join together, may be null\n     * @param separator  the separator character to use\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null iterator input\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 3109,col 9)-(line 3111,col 9)",
        "(line 3112,col 9)-(line 3112,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.join(java.util.Collection, java.lang.String)",
      "begin_line": 3129,
      "end_line": 3134,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided \u003ccode\u003eCollection\u003c/code\u003e into\n     * a single String containing the provided elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * A \u003ccode\u003enull\u003c/code\u003e separator is the same as an empty String (\"\").\u003c/p\u003e\n     *\n     * \u003cp\u003eSee the examples here: {@link #join(Object[],String)}. \u003c/p\u003e\n     *\n     * @param collection  the \u003ccode\u003eCollection\u003c/code\u003e of values to join together, may be null\n     * @param separator  the separator character to use, null treated as \"\"\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null iterator input\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 3130,col 9)-(line 3132,col 9)",
        "(line 3133,col 9)-(line 3133,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.deleteSpaces(java.lang.String)",
      "begin_line": 3164,
      "end_line": 3169,
      "comment": "\n     * \u003cp\u003eDeletes all \u0027space\u0027 characters from a String as defined by\n     * {@link Character#isSpace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is the only StringUtils method that uses the\n     * \u003ccode\u003eisSpace\u003c/code\u003e definition. You are advised to use\n     * {@link #deleteWhitespace(String)} instead as whitespace is much\n     * better localized.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.deleteSpaces(null)           \u003d null\n     * StringUtils.deleteSpaces(\"\")             \u003d \"\"\n     * StringUtils.deleteSpaces(\"abc\")          \u003d \"abc\"\n     * StringUtils.deleteSpaces(\" \\t  abc \\n \") \u003d \"abc\"\n     * StringUtils.deleteSpaces(\"ab  c\")        \u003d \"abc\"\n     * StringUtils.deleteSpaces(\"a\\nb\\tc     \") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eSpaces are defined as \u003ccode\u003e{\u0027 \u0027, \u0027\\t\u0027, \u0027\\r\u0027, \u0027\\n\u0027, \u0027\\b\u0027}\u003c/code\u003e\n     * in line with the deprecated \u003ccode\u003eisSpace\u003c/code\u003e method.\u003c/p\u003e\n     *\n     * @param str  the String to delete spaces from, may be null\n     * @return the String without \u0027spaces\u0027, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @deprecated Use the better localized {@link #deleteWhitespace(String)}.\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 3165,col 9)-(line 3167,col 9)",
        "(line 3168,col 9)-(line 3168,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.deleteWhitespace(java.lang.String)",
      "begin_line": 3185,
      "end_line": 3201,
      "comment": "\n     * \u003cp\u003eDeletes all whitespaces from a String as defined by\n     * {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.deleteWhitespace(null)         \u003d null\n     * StringUtils.deleteWhitespace(\"\")           \u003d \"\"\n     * StringUtils.deleteWhitespace(\"abc\")        \u003d \"abc\"\n     * StringUtils.deleteWhitespace(\"   ab  c  \") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to delete whitespace from, may be null\n     * @return the String without whitespaces, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 3186,col 9)-(line 3188,col 9)",
        "(line 3189,col 9)-(line 3189,col 30)",
        "(line 3190,col 9)-(line 3190,col 34)",
        "(line 3191,col 9)-(line 3191,col 22)",
        "(line 3192,col 9)-(line 3196,col 9)",
        "(line 3197,col 9)-(line 3199,col 9)",
        "(line 3200,col 9)-(line 3200,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.removeStart(java.lang.String, java.lang.String)",
      "begin_line": 3229,
      "end_line": 3237,
      "comment": "\n     * \u003cp\u003eRemoves a substring only if it is at the begining of a source string,\n     * otherwise returns the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e source string will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") source string will return the empty string.\n     * A \u003ccode\u003enull\u003c/code\u003e search string will return the source string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.removeStart(null, *)      \u003d null\n     * StringUtils.removeStart(\"\", *)        \u003d \"\"\n     * StringUtils.removeStart(*, null)      \u003d *\n     * StringUtils.removeStart(\"www.domain.com\", \"www.\")   \u003d \"domain.com\"\n     * StringUtils.removeStart(\"domain.com\", \"www.\")       \u003d \"domain.com\"\n     * StringUtils.removeStart(\"www.domain.com\", \"domain\") \u003d \"www.domain.com\"\n     * StringUtils.removeStart(\"abc\", \"\")    \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the String to search for and remove, may be null\n     * @return the substring with the string removed if found,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3230,col 9)-(line 3232,col 9)",
        "(line 3233,col 9)-(line 3235,col 9)",
        "(line 3236,col 9)-(line 3236,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.removeStartIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 3264,
      "end_line": 3272,
      "comment": "\n     * \u003cp\u003eCase insensitive removal of a substring if it is at the begining of a source string,\n     * otherwise returns the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e source string will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") source string will return the empty string.\n     * A \u003ccode\u003enull\u003c/code\u003e search string will return the source string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.removeStartIgnoreCase(null, *)      \u003d null\n     * StringUtils.removeStartIgnoreCase(\"\", *)        \u003d \"\"\n     * StringUtils.removeStartIgnoreCase(*, null)      \u003d *\n     * StringUtils.removeStartIgnoreCase(\"www.domain.com\", \"www.\")   \u003d \"domain.com\"\n     * StringUtils.removeStartIgnoreCase(\"www.domain.com\", \"WWW.\")   \u003d \"domain.com\"\n     * StringUtils.removeStartIgnoreCase(\"domain.com\", \"www.\")       \u003d \"domain.com\"\n     * StringUtils.removeStartIgnoreCase(\"www.domain.com\", \"domain\") \u003d \"www.domain.com\"\n     * StringUtils.removeStartIgnoreCase(\"abc\", \"\")    \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the String to search for (case insensitive) and remove, may be null\n     * @return the substring with the string removed if found,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3265,col 9)-(line 3267,col 9)",
        "(line 3268,col 9)-(line 3270,col 9)",
        "(line 3271,col 9)-(line 3271,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.removeEnd(java.lang.String, java.lang.String)",
      "begin_line": 3298,
      "end_line": 3306,
      "comment": "\n     * \u003cp\u003eRemoves a substring only if it is at the end of a source string,\n     * otherwise returns the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e source string will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") source string will return the empty string.\n     * A \u003ccode\u003enull\u003c/code\u003e search string will return the source string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.removeEnd(null, *)      \u003d null\n     * StringUtils.removeEnd(\"\", *)        \u003d \"\"\n     * StringUtils.removeEnd(*, null)      \u003d *\n     * StringUtils.removeEnd(\"www.domain.com\", \".com.\")  \u003d \"www.domain.com\"\n     * StringUtils.removeEnd(\"www.domain.com\", \".com\")   \u003d \"www.domain\"\n     * StringUtils.removeEnd(\"www.domain.com\", \"domain\") \u003d \"www.domain.com\"\n     * StringUtils.removeEnd(\"abc\", \"\")    \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the String to search for and remove, may be null\n     * @return the substring with the string removed if found,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3299,col 9)-(line 3301,col 9)",
        "(line 3302,col 9)-(line 3304,col 9)",
        "(line 3305,col 9)-(line 3305,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.removeEndIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 3332,
      "end_line": 3340,
      "comment": "\n     * \u003cp\u003eCase insensitive removal of a substring if it is at the end of a source string,\n     * otherwise returns the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e source string will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") source string will return the empty string.\n     * A \u003ccode\u003enull\u003c/code\u003e search string will return the source string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.removeEnd(null, *)      \u003d null\n     * StringUtils.removeEnd(\"\", *)        \u003d \"\"\n     * StringUtils.removeEnd(*, null)      \u003d *\n     * StringUtils.removeEnd(\"www.domain.com\", \".com.\")  \u003d \"www.domain.com.\"\n     * StringUtils.removeEnd(\"www.domain.com\", \".com\")   \u003d \"www.domain\"\n     * StringUtils.removeEnd(\"www.domain.com\", \"domain\") \u003d \"www.domain.com\"\n     * StringUtils.removeEnd(\"abc\", \"\")    \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the String to search for (case insensitive) and remove, may be null\n     * @return the substring with the string removed if found,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3333,col 9)-(line 3335,col 9)",
        "(line 3336,col 9)-(line 3338,col 9)",
        "(line 3339,col 9)-(line 3339,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.remove(java.lang.String, java.lang.String)",
      "begin_line": 3365,
      "end_line": 3370,
      "comment": "\n     * \u003cp\u003eRemoves all occurrences of a substring from within the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e source string will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") source string will return the empty string.\n     * A \u003ccode\u003enull\u003c/code\u003e remove string will return the source string.\n     * An empty (\"\") remove string will return the source string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.remove(null, *)        \u003d null\n     * StringUtils.remove(\"\", *)          \u003d \"\"\n     * StringUtils.remove(*, null)        \u003d *\n     * StringUtils.remove(*, \"\")          \u003d *\n     * StringUtils.remove(\"queued\", \"ue\") \u003d \"qd\"\n     * StringUtils.remove(\"queued\", \"zz\") \u003d \"queued\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the String to search for and remove, may be null\n     * @return the substring with the string removed if found,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3366,col 9)-(line 3368,col 9)",
        "(line 3369,col 9)-(line 3369,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.remove(java.lang.String, char)",
      "begin_line": 3391,
      "end_line": 3403,
      "comment": "\n     * \u003cp\u003eRemoves all occurrences of a character from within the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e source string will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") source string will return the empty string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.remove(null, *)       \u003d null\n     * StringUtils.remove(\"\", *)         \u003d \"\"\n     * StringUtils.remove(\"queued\", \u0027u\u0027) \u003d \"qeed\"\n     * StringUtils.remove(\"queued\", \u0027z\u0027) \u003d \"queued\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the char to search for and remove, may be null\n     * @return the substring with the char removed if found,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3392,col 9)-(line 3394,col 9)",
        "(line 3395,col 9)-(line 3395,col 41)",
        "(line 3396,col 9)-(line 3396,col 20)",
        "(line 3397,col 9)-(line 3401,col 9)",
        "(line 3402,col 9)-(line 3402,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.replaceOnce(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 3430,
      "end_line": 3432,
      "comment": "\n     * \u003cp\u003eReplaces a String with another String inside a larger String, once.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e reference passed to this method is a no-op.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replaceOnce(null, *, *)        \u003d null\n     * StringUtils.replaceOnce(\"\", *, *)          \u003d \"\"\n     * StringUtils.replaceOnce(\"any\", null, *)    \u003d \"any\"\n     * StringUtils.replaceOnce(\"any\", *, null)    \u003d \"any\"\n     * StringUtils.replaceOnce(\"any\", \"\", *)      \u003d \"any\"\n     * StringUtils.replaceOnce(\"aba\", \"a\", null)  \u003d \"aba\"\n     * StringUtils.replaceOnce(\"aba\", \"a\", \"\")    \u003d \"ba\"\n     * StringUtils.replaceOnce(\"aba\", \"a\", \"z\")   \u003d \"zba\"\n     * \u003c/pre\u003e\n     *\n     * @see #replace(String text, String searchString, String replacement, int max)\n     * @param text  text to search and replace in, may be null\n     * @param searchString  the String to search for, may be null\n     * @param replacement  the String to replace with, may be null\n     * @return the text with any replacements processed,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 3431,col 9)-(line 3431,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.replace(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 3457,
      "end_line": 3459,
      "comment": "\n     * \u003cp\u003eReplaces all occurrences of a String within another String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e reference passed to this method is a no-op.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replace(null, *, *)        \u003d null\n     * StringUtils.replace(\"\", *, *)          \u003d \"\"\n     * StringUtils.replace(\"any\", null, *)    \u003d \"any\"\n     * StringUtils.replace(\"any\", *, null)    \u003d \"any\"\n     * StringUtils.replace(\"any\", \"\", *)      \u003d \"any\"\n     * StringUtils.replace(\"aba\", \"a\", null)  \u003d \"aba\"\n     * StringUtils.replace(\"aba\", \"a\", \"\")    \u003d \"b\"\n     * StringUtils.replace(\"aba\", \"a\", \"z\")   \u003d \"zbz\"\n     * \u003c/pre\u003e\n     *\n     * @see #replace(String text, String searchString, String replacement, int max)\n     * @param text  text to search and replace in, may be null\n     * @param searchString  the String to search for, may be null\n     * @param replacement  the String to replace it with, may be null\n     * @return the text with any replacements processed,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 3458,col 9)-(line 3458,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.replace(java.lang.String, java.lang.String, java.lang.String, int)",
      "begin_line": 3489,
      "end_line": 3513,
      "comment": "\n     * \u003cp\u003eReplaces a String with another String inside a larger String,\n     * for the first \u003ccode\u003emax\u003c/code\u003e values of the search String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e reference passed to this method is a no-op.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replace(null, *, *, *)         \u003d null\n     * StringUtils.replace(\"\", *, *, *)           \u003d \"\"\n     * StringUtils.replace(\"any\", null, *, *)     \u003d \"any\"\n     * StringUtils.replace(\"any\", *, null, *)     \u003d \"any\"\n     * StringUtils.replace(\"any\", \"\", *, *)       \u003d \"any\"\n     * StringUtils.replace(\"any\", *, *, 0)        \u003d \"any\"\n     * StringUtils.replace(\"abaa\", \"a\", null, -1) \u003d \"abaa\"\n     * StringUtils.replace(\"abaa\", \"a\", \"\", -1)   \u003d \"b\"\n     * StringUtils.replace(\"abaa\", \"a\", \"z\", 0)   \u003d \"abaa\"\n     * StringUtils.replace(\"abaa\", \"a\", \"z\", 1)   \u003d \"zbaa\"\n     * StringUtils.replace(\"abaa\", \"a\", \"z\", 2)   \u003d \"zbza\"\n     * StringUtils.replace(\"abaa\", \"a\", \"z\", -1)  \u003d \"zbzz\"\n     * \u003c/pre\u003e\n     *\n     * @param text  text to search and replace in, may be null\n     * @param searchString  the String to search for, may be null\n     * @param replacement  the String to replace it with, may be null\n     * @param max  maximum number of values to replace, or \u003ccode\u003e-1\u003c/code\u003e if no maximum\n     * @return the text with any replacements processed,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 3490,col 9)-(line 3492,col 9)",
        "(line 3493,col 9)-(line 3493,col 22)",
        "(line 3494,col 9)-(line 3494,col 52)",
        "(line 3495,col 9)-(line 3497,col 9)",
        "(line 3498,col 9)-(line 3498,col 47)",
        "(line 3499,col 9)-(line 3499,col 57)",
        "(line 3500,col 9)-(line 3500,col 49)",
        "(line 3501,col 9)-(line 3501,col 59)",
        "(line 3502,col 9)-(line 3502,col 70)",
        "(line 3503,col 9)-(line 3510,col 9)",
        "(line 3511,col 9)-(line 3511,col 42)",
        "(line 3512,col 9)-(line 3512,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.replaceEach(java.lang.String, java.lang.String[], java.lang.String[])",
      "begin_line": 3554,
      "end_line": 3556,
      "comment": "\n     * \u003cp\u003e\n     * Replaces all occurrences of Strings within another String.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e reference passed to this method is a no-op, or if\n     * any \"search string\" or \"string to replace\" is null, that replace will be\n     * ignored. This will not repeat. For repeating replaces, call the\n     * overloaded method.\n     * \u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *  StringUtils.replaceEach(null, *, *)        \u003d null\n     *  StringUtils.replaceEach(\"\", *, *)          \u003d \"\"\n     *  StringUtils.replaceEach(\"aba\", null, null) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[0], null) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", null, new String[0]) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, null)  \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, new String[]{\"\"})  \u003d \"b\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{null}, new String[]{\"a\"})  \u003d \"aba\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"w\", \"t\"})  \u003d \"wcte\"\n     *  (example of how it does not repeat)\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"t\"})  \u003d \"dcte\"\n     * \u003c/pre\u003e\n     * \n     * @param text\n     *            text to search and replace in, no-op if null\n     * @param searchList\n     *            the Strings to search for, no-op if null\n     * @param replacementList\n     *            the Strings to replace them with, no-op if null\n     * @return the text with any replacements processed, \u003ccode\u003enull\u003c/code\u003e if\n     *         null String input\n     * @throws IndexOutOfBoundsException\n     *             if the lengths of the arrays are not the same (null is ok,\n     *             and/or size 0)\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3555,col 9)-(line 3555,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.replaceEachRepeatedly(java.lang.String, java.lang.String[], java.lang.String[])",
      "begin_line": 3603,
      "end_line": 3608,
      "comment": "\n     * \u003cp\u003e\n     * Replaces all occurrences of Strings within another String.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e reference passed to this method is a no-op, or if\n     * any \"search string\" or \"string to replace\" is null, that replace will be\n     * ignored. This will not repeat. For repeating replaces, call the\n     * overloaded method.\n     * \u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *  StringUtils.replaceEach(null, *, *, *) \u003d null\n     *  StringUtils.replaceEach(\"\", *, *, *) \u003d \"\"\n     *  StringUtils.replaceEach(\"aba\", null, null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[0], null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", null, new String[0], *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, new String[]{\"\"}, *) \u003d \"b\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{null}, new String[]{\"a\"}, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"w\", \"t\"}, *) \u003d \"wcte\"\n     *  (example of how it repeats)\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"t\"}, false) \u003d \"dcte\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"t\"}, true) \u003d \"tcte\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"ab\"}, true) \u003d IllegalArgumentException\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"ab\"}, false) \u003d \"dcabe\"\n     * \u003c/pre\u003e\n     * \n     * @param text\n     *            text to search and replace in, no-op if null\n     * @param searchList\n     *            the Strings to search for, no-op if null\n     * @param replacementList\n     *            the Strings to replace them with, no-op if null\n     * @return the text with any replacements processed, \u003ccode\u003enull\u003c/code\u003e if\n     *         null String input\n     * @throws IllegalArgumentException\n     *             if the search is repeating and there is an endless loop due\n     *             to outputs of one being inputs to another\n     * @throws IndexOutOfBoundsException\n     *             if the lengths of the arrays are not the same (null is ok,\n     *             and/or size 0)\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3606,col 9)-(line 3606,col 68)",
        "(line 3607,col 9)-(line 3607,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.replaceEach(java.lang.String, java.lang.String[], java.lang.String[], boolean, int)",
      "begin_line": 3658,
      "end_line": 3784,
      "comment": "\n     * \u003cp\u003e\n     * Replaces all occurrences of Strings within another String.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e reference passed to this method is a no-op, or if\n     * any \"search string\" or \"string to replace\" is null, that replace will be\n     * ignored. \n     * \u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     *  StringUtils.replaceEach(null, *, *, *) \u003d null\n     *  StringUtils.replaceEach(\"\", *, *, *) \u003d \"\"\n     *  StringUtils.replaceEach(\"aba\", null, null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[0], null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", null, new String[0], *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, null, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, new String[]{\"\"}, *) \u003d \"b\"\n     *  StringUtils.replaceEach(\"aba\", new String[]{null}, new String[]{\"a\"}, *) \u003d \"aba\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"w\", \"t\"}, *) \u003d \"wcte\"\n     *  (example of how it repeats)\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"t\"}, false) \u003d \"dcte\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"t\"}, true) \u003d \"tcte\"\n     *  StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"ab\"}, *) \u003d IllegalArgumentException\n     * \u003c/pre\u003e\n     * \n     * @param text\n     *            text to search and replace in, no-op if null\n     * @param searchList\n     *            the Strings to search for, no-op if null\n     * @param replacementList\n     *            the Strings to replace them with, no-op if null\n     * @param repeat if true, then replace repeatedly \n     *       until there are no more possible replacements or timeToLive \u003c 0\n     * @param timeToLive\n     *            if less than 0 then there is a circular reference and endless\n     *            loop\n     * @return the text with any replacements processed, \u003ccode\u003enull\u003c/code\u003e if\n     *         null String input\n     * @throws IllegalArgumentException\n     *             if the search is repeating and there is an endless loop due\n     *             to outputs of one being inputs to another\n     * @throws IndexOutOfBoundsException\n     *             if the lengths of the arrays are not the same (null is ok,\n     *             and/or size 0)\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 3665,col 9)-(line 3669,col 9)",
        "(line 3672,col 9)-(line 3674,col 9)",
        "(line 3676,col 9)-(line 3676,col 45)",
        "(line 3677,col 9)-(line 3677,col 55)",
        "(line 3680,col 9)-(line 3685,col 9)",
        "(line 3688,col 9)-(line 3688,col 72)",
        "(line 3691,col 9)-(line 3691,col 27)",
        "(line 3692,col 9)-(line 3692,col 30)",
        "(line 3693,col 9)-(line 3693,col 27)",
        "(line 3697,col 9)-(line 3714,col 9)",
        "(line 3718,col 9)-(line 3720,col 9)",
        "(line 3722,col 9)-(line 3722,col 22)",
        "(line 3725,col 9)-(line 3725,col 25)",
        "(line 3728,col 9)-(line 3733,col 9)",
        "(line 3735,col 9)-(line 3735,col 57)",
        "(line 3737,col 9)-(line 3737,col 70)",
        "(line 3739,col 9)-(line 3773,col 9)",
        "(line 3774,col 9)-(line 3774,col 39)",
        "(line 3775,col 9)-(line 3777,col 9)",
        "(line 3778,col 9)-(line 3778,col 39)",
        "(line 3779,col 9)-(line 3781,col 9)",
        "(line 3783,col 9)-(line 3783,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.replaceChars(java.lang.String, char, char)",
      "begin_line": 3808,
      "end_line": 3813,
      "comment": "\n     * \u003cp\u003eReplaces all occurrences of a character in a String with another.\n     * This is a null-safe version of {@link String#replace(char, char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input returns \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") string input returns an empty string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replaceChars(null, *, *)        \u003d null\n     * StringUtils.replaceChars(\"\", *, *)          \u003d \"\"\n     * StringUtils.replaceChars(\"abcba\", \u0027b\u0027, \u0027y\u0027) \u003d \"aycya\"\n     * StringUtils.replaceChars(\"abcba\", \u0027z\u0027, \u0027y\u0027) \u003d \"abcba\"\n     * \u003c/pre\u003e\n     *\n     * @param str  String to replace characters in, may be null\n     * @param searchChar  the character to search for, may be null\n     * @param replaceChar  the character to replace, may be null\n     * @return modified String, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 3809,col 9)-(line 3811,col 9)",
        "(line 3812,col 9)-(line 3812,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.replaceChars(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 3851,
      "end_line": 3878,
      "comment": "\n     * \u003cp\u003eReplaces multiple characters in a String in one go.\n     * This method can also be used to delete characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example:\u003cbr /\u003e\n     * \u003ccode\u003ereplaceChars(\u0026quot;hello\u0026quot;, \u0026quot;ho\u0026quot;, \u0026quot;jy\u0026quot;) \u003d jelly\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input returns \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") string input returns an empty string.\n     * A null or empty set of search characters returns the input string.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe length of the search characters should normally equal the length\n     * of the replace characters.\n     * If the search characters is longer, then the extra search characters\n     * are deleted.\n     * If the search characters is shorter, then the extra replace characters\n     * are ignored.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replaceChars(null, *, *)           \u003d null\n     * StringUtils.replaceChars(\"\", *, *)             \u003d \"\"\n     * StringUtils.replaceChars(\"abc\", null, *)       \u003d \"abc\"\n     * StringUtils.replaceChars(\"abc\", \"\", *)         \u003d \"abc\"\n     * StringUtils.replaceChars(\"abc\", \"b\", null)     \u003d \"ac\"\n     * StringUtils.replaceChars(\"abc\", \"b\", \"\")       \u003d \"ac\"\n     * StringUtils.replaceChars(\"abcba\", \"bc\", \"yz\")  \u003d \"ayzya\"\n     * StringUtils.replaceChars(\"abcba\", \"bc\", \"y\")   \u003d \"ayya\"\n     * StringUtils.replaceChars(\"abcba\", \"bc\", \"yzx\") \u003d \"ayzya\"\n     * \u003c/pre\u003e\n     *\n     * @param str  String to replace characters in, may be null\n     * @param searchChars  a set of characters to search for, may be null\n     * @param replaceChars  a set of characters to replace, may be null\n     * @return modified String, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 3852,col 9)-(line 3854,col 9)",
        "(line 3855,col 9)-(line 3857,col 9)",
        "(line 3858,col 9)-(line 3858,col 33)",
        "(line 3859,col 9)-(line 3859,col 55)",
        "(line 3860,col 9)-(line 3860,col 37)",
        "(line 3861,col 9)-(line 3861,col 55)",
        "(line 3862,col 9)-(line 3873,col 9)",
        "(line 3874,col 9)-(line 3876,col 9)",
        "(line 3877,col 9)-(line 3877,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.overlayString(java.lang.String, java.lang.String, int, int)",
      "begin_line": 3907,
      "end_line": 3913,
      "comment": "\n     * \u003cp\u003eOverlays part of a String with another String.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.overlayString(null, *, *, *)           \u003d NullPointerException\n     * StringUtils.overlayString(*, null, *, *)           \u003d NullPointerException\n     * StringUtils.overlayString(\"\", \"abc\", 0, 0)         \u003d \"abc\"\n     * StringUtils.overlayString(\"abcdef\", null, 2, 4)    \u003d \"abef\"\n     * StringUtils.overlayString(\"abcdef\", \"\", 2, 4)      \u003d \"abef\"\n     * StringUtils.overlayString(\"abcdef\", \"zzzz\", 2, 4)  \u003d \"abzzzzef\"\n     * StringUtils.overlayString(\"abcdef\", \"zzzz\", 4, 2)  \u003d \"abcdzzzzcdef\"\n     * StringUtils.overlayString(\"abcdef\", \"zzzz\", -1, 4) \u003d IndexOutOfBoundsException\n     * StringUtils.overlayString(\"abcdef\", \"zzzz\", 2, 8)  \u003d IndexOutOfBoundsException\n     * \u003c/pre\u003e\n     *\n     * @param text  the String to do overlaying in, may be null\n     * @param overlay  the String to overlay, may be null\n     * @param start  the position to start overlaying at, must be valid\n     * @param end  the position to stop overlaying before, must be valid\n     * @return overlayed String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @throws NullPointerException if text or overlay is null\n     * @throws IndexOutOfBoundsException if either position is invalid\n     * @deprecated Use better named {@link #overlay(String, String, int, int)} instead.\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 3908,col 9)-(line 3912,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.overlay(java.lang.String, java.lang.String, int, int)",
      "begin_line": 3944,
      "end_line": 3974,
      "comment": "\n     * \u003cp\u003eOverlays part of a String with another String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input returns \u003ccode\u003enull\u003c/code\u003e.\n     * A negative index is treated as zero.\n     * An index greater than the string length is treated as the string length.\n     * The start index is always the smaller of the two indices.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.overlay(null, *, *, *)            \u003d null\n     * StringUtils.overlay(\"\", \"abc\", 0, 0)          \u003d \"abc\"\n     * StringUtils.overlay(\"abcdef\", null, 2, 4)     \u003d \"abef\"\n     * StringUtils.overlay(\"abcdef\", \"\", 2, 4)       \u003d \"abef\"\n     * StringUtils.overlay(\"abcdef\", \"\", 4, 2)       \u003d \"abef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", 2, 4)   \u003d \"abzzzzef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", 4, 2)   \u003d \"abzzzzef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", -1, 4)  \u003d \"zzzzef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", 2, 8)   \u003d \"abzzzz\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", -2, -3) \u003d \"zzzzabcdef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", 8, 10)  \u003d \"abcdefzzzz\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to do overlaying in, may be null\n     * @param overlay  the String to overlay, may be null\n     * @param start  the position to start overlaying at\n     * @param end  the position to stop overlaying before\n     * @return overlayed String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 3945,col 9)-(line 3947,col 9)",
        "(line 3948,col 9)-(line 3950,col 9)",
        "(line 3951,col 9)-(line 3951,col 31)",
        "(line 3952,col 9)-(line 3954,col 9)",
        "(line 3955,col 9)-(line 3957,col 9)",
        "(line 3958,col 9)-(line 3960,col 9)",
        "(line 3961,col 9)-(line 3963,col 9)",
        "(line 3964,col 9)-(line 3968,col 9)",
        "(line 3969,col 9)-(line 3973,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.chomp(java.lang.String)",
      "begin_line": 4003,
      "end_line": 4027,
      "comment": "\n     * \u003cp\u003eRemoves one newline from end of a String if it\u0027s there,\n     * otherwise leave it alone.  A newline is \u0026quot;\u003ccode\u003e\\n\u003c/code\u003e\u0026quot;,\n     * \u0026quot;\u003ccode\u003e\\r\u003c/code\u003e\u0026quot;, or \u0026quot;\u003ccode\u003e\\r\\n\u003c/code\u003e\u0026quot;.\u003c/p\u003e\n     *\n     * \u003cp\u003eNOTE: This method changed in 2.0.\n     * It now more closely matches Perl chomp.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.chomp(null)          \u003d null\n     * StringUtils.chomp(\"\")            \u003d \"\"\n     * StringUtils.chomp(\"abc \\r\")      \u003d \"abc \"\n     * StringUtils.chomp(\"abc\\n\")       \u003d \"abc\"\n     * StringUtils.chomp(\"abc\\r\\n\")     \u003d \"abc\"\n     * StringUtils.chomp(\"abc\\r\\n\\r\\n\") \u003d \"abc\\r\\n\"\n     * StringUtils.chomp(\"abc\\n\\r\")     \u003d \"abc\\n\"\n     * StringUtils.chomp(\"abc\\n\\rabc\")  \u003d \"abc\\n\\rabc\"\n     * StringUtils.chomp(\"\\r\")          \u003d \"\"\n     * StringUtils.chomp(\"\\n\")          \u003d \"\"\n     * StringUtils.chomp(\"\\r\\n\")        \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to chomp a newline from, may be null\n     * @return String without newline, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4004,col 9)-(line 4006,col 9)",
        "(line 4008,col 9)-(line 4014,col 9)",
        "(line 4016,col 9)-(line 4016,col 39)",
        "(line 4017,col 9)-(line 4017,col 40)",
        "(line 4019,col 9)-(line 4025,col 9)",
        "(line 4026,col 9)-(line 4026,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.chomp(java.lang.String, java.lang.String)",
      "begin_line": 4055,
      "end_line": 4063,
      "comment": "\n     * \u003cp\u003eRemoves \u003ccode\u003eseparator\u003c/code\u003e from the end of\n     * \u003ccode\u003estr\u003c/code\u003e if it\u0027s there, otherwise leave it alone.\u003c/p\u003e\n     *\n     * \u003cp\u003eNOTE: This method changed in version 2.0.\n     * It now more closely matches Perl chomp.\n     * For the previous behavior, use {@link #substringBeforeLast(String, String)}.\n     * This method uses {@link String#endsWith(String)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.chomp(null, *)         \u003d null\n     * StringUtils.chomp(\"\", *)           \u003d \"\"\n     * StringUtils.chomp(\"foobar\", \"bar\") \u003d \"foo\"\n     * StringUtils.chomp(\"foobar\", \"baz\") \u003d \"foobar\"\n     * StringUtils.chomp(\"foo\", \"foo\")    \u003d \"\"\n     * StringUtils.chomp(\"foo \", \"foo\")   \u003d \"foo \"\n     * StringUtils.chomp(\" foo\", \"foo\")   \u003d \" \"\n     * StringUtils.chomp(\"foo\", \"foooo\")  \u003d \"foo\"\n     * StringUtils.chomp(\"foo\", \"\")       \u003d \"foo\"\n     * StringUtils.chomp(\"foo\", null)     \u003d \"foo\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to chomp from, may be null\n     * @param separator  separator String, may be null\n     * @return String without trailing separator, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4056,col 9)-(line 4058,col 9)",
        "(line 4059,col 9)-(line 4061,col 9)",
        "(line 4062,col 9)-(line 4062,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.chompLast(java.lang.String)",
      "begin_line": 4075,
      "end_line": 4077,
      "comment": "\n     * \u003cp\u003eRemove any \u0026quot;\\n\u0026quot; if and only if it is at the end\n     * of the supplied String.\u003c/p\u003e\n     *\n     * @param str  the String to chomp from, must not be null\n     * @return String without chomped ending\n     * @throws NullPointerException if str is \u003ccode\u003enull\u003c/code\u003e\n     * @deprecated Use {@link #chomp(String)} instead.\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 4076,col 9)-(line 4076,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.chompLast(java.lang.String, java.lang.String)",
      "begin_line": 4089,
      "end_line": 4098,
      "comment": "\n     * \u003cp\u003eRemove a value if and only if the String ends with that value.\u003c/p\u003e\n     *\n     * @param str  the String to chomp from, must not be null\n     * @param sep  the String to chomp, must not be null\n     * @return String without chomped ending\n     * @throws NullPointerException if str or sep is \u003ccode\u003enull\u003c/code\u003e\n     * @deprecated Use {@link #chomp(String,String)} instead.\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 4090,col 9)-(line 4092,col 9)",
        "(line 4093,col 9)-(line 4093,col 64)",
        "(line 4094,col 9)-(line 4096,col 9)",
        "(line 4097,col 9)-(line 4097,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.getChomp(java.lang.String, java.lang.String)",
      "begin_line": 4112,
      "end_line": 4121,
      "comment": "\n     * \u003cp\u003eRemove everything and return the last value of a supplied String, and\n     * everything after it from a String.\u003c/p\u003e\n     *\n     * @param str  the String to chomp from, must not be null\n     * @param sep  the String to chomp, must not be null\n     * @return String chomped\n     * @throws NullPointerException if str or sep is \u003ccode\u003enull\u003c/code\u003e\n     * @deprecated Use {@link #substringAfterLast(String, String)} instead\n     *             (although this doesn\u0027t include the separator)\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 4113,col 9)-(line 4113,col 39)",
        "(line 4114,col 9)-(line 4120,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.prechomp(java.lang.String, java.lang.String)",
      "begin_line": 4134,
      "end_line": 4140,
      "comment": "\n     * \u003cp\u003eRemove the first value of a supplied String, and everything before it\n     * from a String.\u003c/p\u003e\n     *\n     * @param str  the String to chomp from, must not be null\n     * @param sep  the String to chomp, must not be null\n     * @return String without chomped beginning\n     * @throws NullPointerException if str or sep is \u003ccode\u003enull\u003c/code\u003e\n     * @deprecated Use {@link #substringAfter(String,String)} instead.\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 4135,col 9)-(line 4135,col 35)",
        "(line 4136,col 9)-(line 4138,col 9)",
        "(line 4139,col 9)-(line 4139,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.getPrechomp(java.lang.String, java.lang.String)",
      "begin_line": 4154,
      "end_line": 4160,
      "comment": "\n     * \u003cp\u003eRemove and return everything before the first value of a\n     * supplied String from another String.\u003c/p\u003e\n     *\n     * @param str  the String to chomp from, must not be null\n     * @param sep  the String to chomp, must not be null\n     * @return String prechomped\n     * @throws NullPointerException if str or sep is \u003ccode\u003enull\u003c/code\u003e\n     * @deprecated Use {@link #substringBefore(String,String)} instead\n     *             (although this doesn\u0027t include the separator).\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 4155,col 9)-(line 4155,col 35)",
        "(line 4156,col 9)-(line 4158,col 9)",
        "(line 4159,col 9)-(line 4159,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.chop(java.lang.String)",
      "begin_line": 4187,
      "end_line": 4204,
      "comment": "\n     * \u003cp\u003eRemove the last character from a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the String ends in \u003ccode\u003e\\r\\n\u003c/code\u003e, then remove both\n     * of them.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.chop(null)          \u003d null\n     * StringUtils.chop(\"\")            \u003d \"\"\n     * StringUtils.chop(\"abc \\r\")      \u003d \"abc \"\n     * StringUtils.chop(\"abc\\n\")       \u003d \"abc\"\n     * StringUtils.chop(\"abc\\r\\n\")     \u003d \"abc\"\n     * StringUtils.chop(\"abc\")         \u003d \"ab\"\n     * StringUtils.chop(\"abc\\nabc\")    \u003d \"abc\\nab\"\n     * StringUtils.chop(\"a\")           \u003d \"\"\n     * StringUtils.chop(\"\\r\")          \u003d \"\"\n     * StringUtils.chop(\"\\n\")          \u003d \"\"\n     * StringUtils.chop(\"\\r\\n\")        \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to chop last character from, may be null\n     * @return String without last character, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4188,col 9)-(line 4190,col 9)",
        "(line 4191,col 9)-(line 4191,col 34)",
        "(line 4192,col 9)-(line 4194,col 9)",
        "(line 4195,col 9)-(line 4195,col 33)",
        "(line 4196,col 9)-(line 4196,col 47)",
        "(line 4197,col 9)-(line 4197,col 40)",
        "(line 4198,col 9)-(line 4202,col 9)",
        "(line 4203,col 9)-(line 4203,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.chopNewline(java.lang.String)",
      "begin_line": 4216,
      "end_line": 4230,
      "comment": "\n     * \u003cp\u003eRemoves \u003ccode\u003e\\n\u003c/code\u003e from end of a String if it\u0027s there.\n     * If a \u003ccode\u003e\\r\u003c/code\u003e precedes it, then remove that too.\u003c/p\u003e\n     *\n     * @param str  the String to chop a newline from, must not be null\n     * @return String without newline\n     * @throws NullPointerException if str is \u003ccode\u003enull\u003c/code\u003e\n     * @deprecated Use {@link #chomp(String)} instead.\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 4217,col 9)-(line 4217,col 39)",
        "(line 4218,col 9)-(line 4220,col 9)",
        "(line 4221,col 9)-(line 4221,col 40)",
        "(line 4222,col 9)-(line 4228,col 9)",
        "(line 4229,col 9)-(line 4229,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.escape(java.lang.String)",
      "begin_line": 4250,
      "end_line": 4252,
      "comment": "\n     * \u003cp\u003eEscapes any values it finds into their String form.\u003c/p\u003e\n     *\n     * \u003cp\u003eSo a tab becomes the characters \u003ccode\u003e\u0027\\\\\u0027\u003c/code\u003e and\n     * \u003ccode\u003e\u0027t\u0027\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs of Lang 2.0, this calls {@link StringEscapeUtils#escapeJava(String)}\n     * behind the scenes.\n     * \u003c/p\u003e\n     * @see StringEscapeUtils#escapeJava(java.lang.String)\n     * @param str String to escape values in\n     * @return String with escaped values\n     * @throws NullPointerException if str is \u003ccode\u003enull\u003c/code\u003e\n     * @deprecated Use {@link StringEscapeUtils#escapeJava(String)}\n     *             This method will be removed in Commons Lang 3.0\n     ",
      "child_ranges": [
        "(line 4251,col 9)-(line 4251,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.repeat(java.lang.String, int)",
      "begin_line": 4274,
      "end_line": 4316,
      "comment": "\n     * \u003cp\u003eRepeat a String \u003ccode\u003erepeat\u003c/code\u003e times to form a\n     * new String.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.repeat(null, 2) \u003d null\n     * StringUtils.repeat(\"\", 0)   \u003d \"\"\n     * StringUtils.repeat(\"\", 2)   \u003d \"\"\n     * StringUtils.repeat(\"a\", 3)  \u003d \"aaa\"\n     * StringUtils.repeat(\"ab\", 2) \u003d \"abab\"\n     * StringUtils.repeat(\"a\", -2) \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to repeat, may be null\n     * @param repeat  number of times to repeat str, negative treated as zero\n     * @return a new String consisting of the original String repeated,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4277,col 9)-(line 4279,col 9)",
        "(line 4280,col 9)-(line 4282,col 9)",
        "(line 4283,col 9)-(line 4283,col 39)",
        "(line 4284,col 9)-(line 4286,col 9)",
        "(line 4287,col 9)-(line 4289,col 9)",
        "(line 4291,col 9)-(line 4291,col 48)",
        "(line 4292,col 9)-(line 4315,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.padding(int, char)",
      "begin_line": 4341,
      "end_line": 4350,
      "comment": "\n     * \u003cp\u003eReturns padding using the specified delimiter repeated\n     * to a given length.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.padding(0, \u0027e\u0027)  \u003d \"\"\n     * StringUtils.padding(3, \u0027e\u0027)  \u003d \"eee\"\n     * StringUtils.padding(-2, \u0027e\u0027) \u003d IndexOutOfBoundsException\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eNote: this method doesn\u0027t not support padding with\n     * \u003ca href\u003d\"http://www.unicode.org/glossary/#supplementary_character\"\u003eUnicode Supplementary Characters\u003c/a\u003e\n     * as they require a pair of \u003ccode\u003echar\u003c/code\u003es to be represented.\n     * If you are needing to support full I18N of your applications\n     * consider using {@link #repeat(String, int)} instead. \n     * \u003c/p\u003e\n     *\n     * @param repeat  number of times to repeat delim\n     * @param padChar  character to repeat\n     * @return String with repeated character\n     * @throws IndexOutOfBoundsException if \u003ccode\u003erepeat \u0026lt; 0\u003c/code\u003e\n     * @see #repeat(String, int)\n     ",
      "child_ranges": [
        "(line 4342,col 9)-(line 4344,col 9)",
        "(line 4345,col 9)-(line 4345,col 44)",
        "(line 4346,col 9)-(line 4348,col 9)",
        "(line 4349,col 9)-(line 4349,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.rightPad(java.lang.String, int)",
      "begin_line": 4371,
      "end_line": 4373,
      "comment": "\n     * \u003cp\u003eRight pad a String with spaces (\u0027 \u0027).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is padded to the size of \u003ccode\u003esize\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.rightPad(null, *)   \u003d null\n     * StringUtils.rightPad(\"\", 3)     \u003d \"   \"\n     * StringUtils.rightPad(\"bat\", 3)  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", 5)  \u003d \"bat  \"\n     * StringUtils.rightPad(\"bat\", 1)  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", -1) \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @return right padded String or original String if no padding is necessary,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4372,col 9)-(line 4372,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.rightPad(java.lang.String, int, char)",
      "begin_line": 4396,
      "end_line": 4408,
      "comment": "\n     * \u003cp\u003eRight pad a String with a specified character.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is padded to the size of \u003ccode\u003esize\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.rightPad(null, *, *)     \u003d null\n     * StringUtils.rightPad(\"\", 3, \u0027z\u0027)     \u003d \"zzz\"\n     * StringUtils.rightPad(\"bat\", 3, \u0027z\u0027)  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", 5, \u0027z\u0027)  \u003d \"batzz\"\n     * StringUtils.rightPad(\"bat\", 1, \u0027z\u0027)  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", -1, \u0027z\u0027) \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @param padChar  the character to pad with\n     * @return right padded String or original String if no padding is necessary,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4397,col 9)-(line 4399,col 9)",
        "(line 4400,col 9)-(line 4400,col 39)",
        "(line 4401,col 9)-(line 4403,col 9)",
        "(line 4404,col 9)-(line 4406,col 9)",
        "(line 4407,col 9)-(line 4407,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.rightPad(java.lang.String, int, java.lang.String)",
      "begin_line": 4433,
      "end_line": 4462,
      "comment": "\n     * \u003cp\u003eRight pad a String with a specified String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is padded to the size of \u003ccode\u003esize\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.rightPad(null, *, *)      \u003d null\n     * StringUtils.rightPad(\"\", 3, \"z\")      \u003d \"zzz\"\n     * StringUtils.rightPad(\"bat\", 3, \"yz\")  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", 5, \"yz\")  \u003d \"batyz\"\n     * StringUtils.rightPad(\"bat\", 8, \"yz\")  \u003d \"batyzyzy\"\n     * StringUtils.rightPad(\"bat\", 1, \"yz\")  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", -1, \"yz\") \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", 5, null)  \u003d \"bat  \"\n     * StringUtils.rightPad(\"bat\", 5, \"\")    \u003d \"bat  \"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @param padStr  the String to pad with, null or empty treated as single space\n     * @return right padded String or original String if no padding is necessary,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4434,col 9)-(line 4436,col 9)",
        "(line 4437,col 9)-(line 4439,col 9)",
        "(line 4440,col 9)-(line 4440,col 37)",
        "(line 4441,col 9)-(line 4441,col 34)",
        "(line 4442,col 9)-(line 4442,col 33)",
        "(line 4443,col 9)-(line 4445,col 9)",
        "(line 4446,col 9)-(line 4448,col 9)",
        "(line 4450,col 9)-(line 4461,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.leftPad(java.lang.String, int)",
      "begin_line": 4483,
      "end_line": 4485,
      "comment": "\n     * \u003cp\u003eLeft pad a String with spaces (\u0027 \u0027).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is padded to the size of \u003ccode\u003esize\u003ccode\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.leftPad(null, *)   \u003d null\n     * StringUtils.leftPad(\"\", 3)     \u003d \"   \"\n     * StringUtils.leftPad(\"bat\", 3)  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", 5)  \u003d \"  bat\"\n     * StringUtils.leftPad(\"bat\", 1)  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", -1) \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @return left padded String or original String if no padding is necessary,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4484,col 9)-(line 4484,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.leftPad(java.lang.String, int, char)",
      "begin_line": 4508,
      "end_line": 4520,
      "comment": "\n     * \u003cp\u003eLeft pad a String with a specified character.\u003c/p\u003e\n     *\n     * \u003cp\u003ePad to a size of \u003ccode\u003esize\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.leftPad(null, *, *)     \u003d null\n     * StringUtils.leftPad(\"\", 3, \u0027z\u0027)     \u003d \"zzz\"\n     * StringUtils.leftPad(\"bat\", 3, \u0027z\u0027)  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", 5, \u0027z\u0027)  \u003d \"zzbat\"\n     * StringUtils.leftPad(\"bat\", 1, \u0027z\u0027)  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", -1, \u0027z\u0027) \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @param padChar  the character to pad with\n     * @return left padded String or original String if no padding is necessary,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4509,col 9)-(line 4511,col 9)",
        "(line 4512,col 9)-(line 4512,col 39)",
        "(line 4513,col 9)-(line 4515,col 9)",
        "(line 4516,col 9)-(line 4518,col 9)",
        "(line 4519,col 9)-(line 4519,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.leftPad(java.lang.String, int, java.lang.String)",
      "begin_line": 4545,
      "end_line": 4574,
      "comment": "\n     * \u003cp\u003eLeft pad a String with a specified String.\u003c/p\u003e\n     *\n     * \u003cp\u003ePad to a size of \u003ccode\u003esize\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.leftPad(null, *, *)      \u003d null\n     * StringUtils.leftPad(\"\", 3, \"z\")      \u003d \"zzz\"\n     * StringUtils.leftPad(\"bat\", 3, \"yz\")  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", 5, \"yz\")  \u003d \"yzbat\"\n     * StringUtils.leftPad(\"bat\", 8, \"yz\")  \u003d \"yzyzybat\"\n     * StringUtils.leftPad(\"bat\", 1, \"yz\")  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", -1, \"yz\") \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", 5, null)  \u003d \"  bat\"\n     * StringUtils.leftPad(\"bat\", 5, \"\")    \u003d \"  bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @param padStr  the String to pad with, null or empty treated as single space\n     * @return left padded String or original String if no padding is necessary,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4546,col 9)-(line 4548,col 9)",
        "(line 4549,col 9)-(line 4551,col 9)",
        "(line 4552,col 9)-(line 4552,col 37)",
        "(line 4553,col 9)-(line 4553,col 34)",
        "(line 4554,col 9)-(line 4554,col 33)",
        "(line 4555,col 9)-(line 4557,col 9)",
        "(line 4558,col 9)-(line 4560,col 9)",
        "(line 4562,col 9)-(line 4573,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.length(java.lang.String)",
      "begin_line": 4584,
      "end_line": 4586,
      "comment": "\n     * Gets a String\u0027s length or \u003ccode\u003e0\u003c/code\u003e if the String is \u003ccode\u003enull\u003c/code\u003e.\n     * \n     * @param str\n     *            a String or \u003ccode\u003enull\u003c/code\u003e\n     * @return String length or \u003ccode\u003e0\u003c/code\u003e if the String is \u003ccode\u003enull\u003c/code\u003e.\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 4585,col 9)-(line 4585,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.center(java.lang.String, int)",
      "begin_line": 4613,
      "end_line": 4615,
      "comment": "\n     * \u003cp\u003eCenters a String in a larger String of size \u003ccode\u003esize\u003c/code\u003e\n     * using the space character (\u0027 \u0027).\u003cp\u003e\n     *\n     * \u003cp\u003eIf the size is less than the String length, the String is returned.\n     * A \u003ccode\u003enull\u003c/code\u003e String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A negative size is treated as zero.\u003c/p\u003e\n     *\n     * \u003cp\u003eEquivalent to \u003ccode\u003ecenter(str, size, \" \")\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.center(null, *)   \u003d null\n     * StringUtils.center(\"\", 4)     \u003d \"    \"\n     * StringUtils.center(\"ab\", -1)  \u003d \"ab\"\n     * StringUtils.center(\"ab\", 4)   \u003d \" ab \"\n     * StringUtils.center(\"abcd\", 2) \u003d \"abcd\"\n     * StringUtils.center(\"a\", 4)    \u003d \" a  \"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to center, may be null\n     * @param size  the int size of new String, negative treated as zero\n     * @return centered String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4614,col 9)-(line 4614,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.center(java.lang.String, int, char)",
      "begin_line": 4641,
      "end_line": 4653,
      "comment": "\n     * \u003cp\u003eCenters a String in a larger String of size \u003ccode\u003esize\u003c/code\u003e.\n     * Uses a supplied character as the value to pad the String with.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the size is less than the String length, the String is returned.\n     * A \u003ccode\u003enull\u003c/code\u003e String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A negative size is treated as zero.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.center(null, *, *)     \u003d null\n     * StringUtils.center(\"\", 4, \u0027 \u0027)     \u003d \"    \"\n     * StringUtils.center(\"ab\", -1, \u0027 \u0027)  \u003d \"ab\"\n     * StringUtils.center(\"ab\", 4, \u0027 \u0027)   \u003d \" ab\"\n     * StringUtils.center(\"abcd\", 2, \u0027 \u0027) \u003d \"abcd\"\n     * StringUtils.center(\"a\", 4, \u0027 \u0027)    \u003d \" a  \"\n     * StringUtils.center(\"a\", 4, \u0027y\u0027)    \u003d \"yayy\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to center, may be null\n     * @param size  the int size of new String, negative treated as zero\n     * @param padChar  the character to pad the new String with\n     * @return centered String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4642,col 9)-(line 4644,col 9)",
        "(line 4645,col 9)-(line 4645,col 34)",
        "(line 4646,col 9)-(line 4646,col 33)",
        "(line 4647,col 9)-(line 4649,col 9)",
        "(line 4650,col 9)-(line 4650,col 55)",
        "(line 4651,col 9)-(line 4651,col 43)",
        "(line 4652,col 9)-(line 4652,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.center(java.lang.String, int, java.lang.String)",
      "begin_line": 4681,
      "end_line": 4696,
      "comment": "\n     * \u003cp\u003eCenters a String in a larger String of size \u003ccode\u003esize\u003c/code\u003e.\n     * Uses a supplied String as the value to pad the String with.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the size is less than the String length, the String is returned.\n     * A \u003ccode\u003enull\u003c/code\u003e String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A negative size is treated as zero.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.center(null, *, *)     \u003d null\n     * StringUtils.center(\"\", 4, \" \")     \u003d \"    \"\n     * StringUtils.center(\"ab\", -1, \" \")  \u003d \"ab\"\n     * StringUtils.center(\"ab\", 4, \" \")   \u003d \" ab\"\n     * StringUtils.center(\"abcd\", 2, \" \") \u003d \"abcd\"\n     * StringUtils.center(\"a\", 4, \" \")    \u003d \" a  \"\n     * StringUtils.center(\"a\", 4, \"yz\")   \u003d \"yayz\"\n     * StringUtils.center(\"abc\", 7, null) \u003d \"  abc  \"\n     * StringUtils.center(\"abc\", 7, \"\")   \u003d \"  abc  \"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to center, may be null\n     * @param size  the int size of new String, negative treated as zero\n     * @param padStr  the String to pad the new String with, must not be null or empty\n     * @return centered String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @throws IllegalArgumentException if padStr is \u003ccode\u003enull\u003c/code\u003e or empty\n     ",
      "child_ranges": [
        "(line 4682,col 9)-(line 4684,col 9)",
        "(line 4685,col 9)-(line 4687,col 9)",
        "(line 4688,col 9)-(line 4688,col 34)",
        "(line 4689,col 9)-(line 4689,col 33)",
        "(line 4690,col 9)-(line 4692,col 9)",
        "(line 4693,col 9)-(line 4693,col 54)",
        "(line 4694,col 9)-(line 4694,col 42)",
        "(line 4695,col 9)-(line 4695,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.upperCase(java.lang.String)",
      "begin_line": 4714,
      "end_line": 4719,
      "comment": "\n     * \u003cp\u003eConverts a String to upper case as per {@link String#toUpperCase()}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.upperCase(null)  \u003d null\n     * StringUtils.upperCase(\"\")    \u003d \"\"\n     * StringUtils.upperCase(\"aBc\") \u003d \"ABC\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to upper case, may be null\n     * @return the upper cased String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4715,col 9)-(line 4717,col 9)",
        "(line 4718,col 9)-(line 4718,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.lowerCase(java.lang.String)",
      "begin_line": 4735,
      "end_line": 4740,
      "comment": "\n     * \u003cp\u003eConverts a String to lower case as per {@link String#toLowerCase()}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lowerCase(null)  \u003d null\n     * StringUtils.lowerCase(\"\")    \u003d \"\"\n     * StringUtils.lowerCase(\"aBc\") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to lower case, may be null\n     * @return the lower cased String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4736,col 9)-(line 4738,col 9)",
        "(line 4739,col 9)-(line 4739,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.capitalize(java.lang.String)",
      "begin_line": 4762,
      "end_line": 4771,
      "comment": "\n     * \u003cp\u003eCapitalizes a String changing the first letter to title case as\n     * per {@link Character#toTitleCase(char)}. No other letters are changed.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor a word based algorithm, see {@link WordUtils#capitalize(String)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.capitalize(null)  \u003d null\n     * StringUtils.capitalize(\"\")    \u003d \"\"\n     * StringUtils.capitalize(\"cat\") \u003d \"Cat\"\n     * StringUtils.capitalize(\"cAt\") \u003d \"CAt\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to capitalize, may be null\n     * @return the capitalized String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @see WordUtils#capitalize(String)\n     * @see #uncapitalize(String)\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4763,col 9)-(line 4763,col 19)",
        "(line 4764,col 9)-(line 4766,col 9)",
        "(line 4767,col 9)-(line 4770,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.capitalise(java.lang.String)",
      "begin_line": 4782,
      "end_line": 4784,
      "comment": "\n     * \u003cp\u003eCapitalizes a String changing the first letter to title case as\n     * per {@link Character#toTitleCase(char)}. No other letters are changed.\u003c/p\u003e\n     *\n     * @param str  the String to capitalize, may be null\n     * @return the capitalized String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @deprecated Use the standardly named {@link #capitalize(String)}.\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 4783,col 9)-(line 4783,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.uncapitalize(java.lang.String)",
      "begin_line": 4806,
      "end_line": 4815,
      "comment": "\n     * \u003cp\u003eUncapitalizes a String changing the first letter to title case as\n     * per {@link Character#toLowerCase(char)}. No other letters are changed.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor a word based algorithm, see {@link WordUtils#uncapitalize(String)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.uncapitalize(null)  \u003d null\n     * StringUtils.uncapitalize(\"\")    \u003d \"\"\n     * StringUtils.uncapitalize(\"Cat\") \u003d \"cat\"\n     * StringUtils.uncapitalize(\"CAT\") \u003d \"cAT\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to uncapitalize, may be null\n     * @return the uncapitalized String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @see WordUtils#uncapitalize(String)\n     * @see #capitalize(String)\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4807,col 9)-(line 4807,col 19)",
        "(line 4808,col 9)-(line 4810,col 9)",
        "(line 4811,col 9)-(line 4814,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.uncapitalise(java.lang.String)",
      "begin_line": 4826,
      "end_line": 4828,
      "comment": "\n     * \u003cp\u003eUncapitalizes a String changing the first letter to title case as\n     * per {@link Character#toLowerCase(char)}. No other letters are changed.\u003c/p\u003e\n     *\n     * @param str  the String to uncapitalize, may be null\n     * @return the uncapitalized String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @deprecated Use the standardly named {@link #uncapitalize(String)}.\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 4827,col 9)-(line 4827,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.swapCase(java.lang.String)",
      "begin_line": 4857,
      "end_line": 4877,
      "comment": "\n     * \u003cp\u003eSwaps the case of a String changing upper and title case to\n     * lower case, and lower case to upper case.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     *  \u003cli\u003eUpper case character converts to Lower case\u003c/li\u003e\n     *  \u003cli\u003eTitle case character converts to Lower case\u003c/li\u003e\n     *  \u003cli\u003eLower case character converts to Upper case\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eFor a word based algorithm, see {@link WordUtils#swapCase(String)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.swapCase(null)                 \u003d null\n     * StringUtils.swapCase(\"\")                   \u003d \"\"\n     * StringUtils.swapCase(\"The dog has a BONE\") \u003d \"tHE DOG HAS A bone\"\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eNOTE: This method changed in Lang version 2.0.\n     * It no longer performs a word based algorithm.\n     * If you only use ASCII, you will notice no change.\n     * That functionality is available in WordUtils.\u003c/p\u003e\n     *\n     * @param str  the String to swap case, may be null\n     * @return the changed String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4858,col 9)-(line 4858,col 19)",
        "(line 4859,col 9)-(line 4861,col 9)",
        "(line 4862,col 9)-(line 4862,col 55)",
        "(line 4864,col 9)-(line 4864,col 20)",
        "(line 4865,col 9)-(line 4875,col 9)",
        "(line 4876,col 9)-(line 4876,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.capitaliseAllWords(java.lang.String)",
      "begin_line": 4891,
      "end_line": 4893,
      "comment": "\n     * \u003cp\u003eCapitalizes all the whitespace separated words in a String.\n     * Only the first letter of each word is changed.\u003c/p\u003e\n     *\n     * \u003cp\u003eWhitespace is defined by {@link Character#isWhitespace(char)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  the String to capitalize, may be null\n     * @return capitalized String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @deprecated Use the relocated {@link WordUtils#capitalize(String)}.\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 4892,col 9)-(line 4892,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.countMatches(java.lang.String, java.lang.String)",
      "begin_line": 4916,
      "end_line": 4927,
      "comment": "\n     * \u003cp\u003eCounts how many times the substring appears in the larger String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e or empty (\"\") String input returns \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.countMatches(null, *)       \u003d 0\n     * StringUtils.countMatches(\"\", *)         \u003d 0\n     * StringUtils.countMatches(\"abba\", null)  \u003d 0\n     * StringUtils.countMatches(\"abba\", \"\")    \u003d 0\n     * StringUtils.countMatches(\"abba\", \"a\")   \u003d 2\n     * StringUtils.countMatches(\"abba\", \"ab\")  \u003d 1\n     * StringUtils.countMatches(\"abba\", \"xxx\") \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param sub  the substring to count, may be null\n     * @return the number of occurrences, 0 if either String is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 4917,col 9)-(line 4919,col 9)",
        "(line 4920,col 9)-(line 4920,col 22)",
        "(line 4921,col 9)-(line 4921,col 20)",
        "(line 4922,col 9)-(line 4925,col 9)",
        "(line 4926,col 9)-(line 4926,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.isAlpha(java.lang.String)",
      "begin_line": 4949,
      "end_line": 4960,
      "comment": "\n     * \u003cp\u003eChecks if the String contains only unicode letters.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty String (\"\") will return \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAlpha(null)   \u003d false\n     * StringUtils.isAlpha(\"\")     \u003d true\n     * StringUtils.isAlpha(\"  \")   \u003d false\n     * StringUtils.isAlpha(\"abc\")  \u003d true\n     * StringUtils.isAlpha(\"ab2c\") \u003d false\n     * StringUtils.isAlpha(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if only contains letters, and is non-null\n     ",
      "child_ranges": [
        "(line 4950,col 9)-(line 4952,col 9)",
        "(line 4953,col 9)-(line 4953,col 30)",
        "(line 4954,col 9)-(line 4958,col 9)",
        "(line 4959,col 9)-(line 4959,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.isAlphaSpace(java.lang.String)",
      "begin_line": 4983,
      "end_line": 4994,
      "comment": "\n     * \u003cp\u003eChecks if the String contains only unicode letters and\n     * space (\u0027 \u0027).\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e\n     * An empty String (\"\") will return \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAlphaSpace(null)   \u003d false\n     * StringUtils.isAlphaSpace(\"\")     \u003d true\n     * StringUtils.isAlphaSpace(\"  \")   \u003d true\n     * StringUtils.isAlphaSpace(\"abc\")  \u003d true\n     * StringUtils.isAlphaSpace(\"ab c\") \u003d true\n     * StringUtils.isAlphaSpace(\"ab2c\") \u003d false\n     * StringUtils.isAlphaSpace(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if only contains letters and space,\n     *  and is non-null\n     ",
      "child_ranges": [
        "(line 4984,col 9)-(line 4986,col 9)",
        "(line 4987,col 9)-(line 4987,col 30)",
        "(line 4988,col 9)-(line 4992,col 9)",
        "(line 4993,col 9)-(line 4993,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.isAlphanumeric(java.lang.String)",
      "begin_line": 5016,
      "end_line": 5027,
      "comment": "\n     * \u003cp\u003eChecks if the String contains only unicode letters or digits.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty String (\"\") will return \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAlphanumeric(null)   \u003d false\n     * StringUtils.isAlphanumeric(\"\")     \u003d true\n     * StringUtils.isAlphanumeric(\"  \")   \u003d false\n     * StringUtils.isAlphanumeric(\"abc\")  \u003d true\n     * StringUtils.isAlphanumeric(\"ab c\") \u003d false\n     * StringUtils.isAlphanumeric(\"ab2c\") \u003d true\n     * StringUtils.isAlphanumeric(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if only contains letters or digits,\n     *  and is non-null\n     ",
      "child_ranges": [
        "(line 5017,col 9)-(line 5019,col 9)",
        "(line 5020,col 9)-(line 5020,col 30)",
        "(line 5021,col 9)-(line 5025,col 9)",
        "(line 5026,col 9)-(line 5026,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.isAlphanumericSpace(java.lang.String)",
      "begin_line": 5050,
      "end_line": 5061,
      "comment": "\n     * \u003cp\u003eChecks if the String contains only unicode letters, digits\n     * or space (\u003ccode\u003e\u0027 \u0027\u003c/code\u003e).\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty String (\"\") will return \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAlphanumeric(null)   \u003d false\n     * StringUtils.isAlphanumeric(\"\")     \u003d true\n     * StringUtils.isAlphanumeric(\"  \")   \u003d true\n     * StringUtils.isAlphanumeric(\"abc\")  \u003d true\n     * StringUtils.isAlphanumeric(\"ab c\") \u003d true\n     * StringUtils.isAlphanumeric(\"ab2c\") \u003d true\n     * StringUtils.isAlphanumeric(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if only contains letters, digits or space,\n     *  and is non-null\n     ",
      "child_ranges": [
        "(line 5051,col 9)-(line 5053,col 9)",
        "(line 5054,col 9)-(line 5054,col 30)",
        "(line 5055,col 9)-(line 5059,col 9)",
        "(line 5060,col 9)-(line 5060,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.isAsciiPrintable(java.lang.String)",
      "begin_line": 5088,
      "end_line": 5099,
      "comment": "\n     * \u003cp\u003eChecks if the string contains only ASCII printable characters.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty String (\"\") will return \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * StringUtils.isAsciiPrintable(null)     \u003d false\n     * StringUtils.isAsciiPrintable(\"\")       \u003d true\n     * StringUtils.isAsciiPrintable(\" \")      \u003d true\n     * StringUtils.isAsciiPrintable(\"Ceki\")   \u003d true\n     * StringUtils.isAsciiPrintable(\"ab2c\")   \u003d true\n     * StringUtils.isAsciiPrintable(\"!ab-c~\") \u003d true\n     * StringUtils.isAsciiPrintable(\"\\u0020\") \u003d true\n     * StringUtils.isAsciiPrintable(\"\\u0021\") \u003d true\n     * StringUtils.isAsciiPrintable(\"\\u007e\") \u003d true\n     * StringUtils.isAsciiPrintable(\"\\u007f\") \u003d false\n     * StringUtils.isAsciiPrintable(\"Ceki G\\u00fclc\\u00fc\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str the string to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if every character is in the range\n     *  32 thru 126\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 5089,col 9)-(line 5091,col 9)",
        "(line 5092,col 9)-(line 5092,col 30)",
        "(line 5093,col 9)-(line 5097,col 9)",
        "(line 5098,col 9)-(line 5098,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.isNumeric(java.lang.String)",
      "begin_line": 5122,
      "end_line": 5133,
      "comment": "\n     * \u003cp\u003eChecks if the String contains only unicode digits.\n     * A decimal point is not a unicode digit and returns false.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty String (\"\") will return \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isNumeric(null)   \u003d false\n     * StringUtils.isNumeric(\"\")     \u003d true\n     * StringUtils.isNumeric(\"  \")   \u003d false\n     * StringUtils.isNumeric(\"123\")  \u003d true\n     * StringUtils.isNumeric(\"12 3\") \u003d false\n     * StringUtils.isNumeric(\"ab2c\") \u003d false\n     * StringUtils.isNumeric(\"12-3\") \u003d false\n     * StringUtils.isNumeric(\"12.3\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if only contains digits, and is non-null\n     ",
      "child_ranges": [
        "(line 5123,col 9)-(line 5125,col 9)",
        "(line 5126,col 9)-(line 5126,col 30)",
        "(line 5127,col 9)-(line 5131,col 9)",
        "(line 5132,col 9)-(line 5132,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.isNumericSpace(java.lang.String)",
      "begin_line": 5158,
      "end_line": 5169,
      "comment": "\n     * \u003cp\u003eChecks if the String contains only unicode digits or space\n     * (\u003ccode\u003e\u0027 \u0027\u003c/code\u003e).\n     * A decimal point is not a unicode digit and returns false.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty String (\"\") will return \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isNumeric(null)   \u003d false\n     * StringUtils.isNumeric(\"\")     \u003d true\n     * StringUtils.isNumeric(\"  \")   \u003d true\n     * StringUtils.isNumeric(\"123\")  \u003d true\n     * StringUtils.isNumeric(\"12 3\") \u003d true\n     * StringUtils.isNumeric(\"ab2c\") \u003d false\n     * StringUtils.isNumeric(\"12-3\") \u003d false\n     * StringUtils.isNumeric(\"12.3\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if only contains digits or space,\n     *  and is non-null\n     ",
      "child_ranges": [
        "(line 5159,col 9)-(line 5161,col 9)",
        "(line 5162,col 9)-(line 5162,col 30)",
        "(line 5163,col 9)-(line 5167,col 9)",
        "(line 5168,col 9)-(line 5168,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.isWhitespace(java.lang.String)",
      "begin_line": 5190,
      "end_line": 5201,
      "comment": "\n     * \u003cp\u003eChecks if the String contains only whitespace.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty String (\"\") will return \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isWhitespace(null)   \u003d false\n     * StringUtils.isWhitespace(\"\")     \u003d true\n     * StringUtils.isWhitespace(\"  \")   \u003d true\n     * StringUtils.isWhitespace(\"abc\")  \u003d false\n     * StringUtils.isWhitespace(\"ab2c\") \u003d false\n     * StringUtils.isWhitespace(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if only contains whitespace, and is non-null\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 5191,col 9)-(line 5193,col 9)",
        "(line 5194,col 9)-(line 5194,col 30)",
        "(line 5195,col 9)-(line 5199,col 9)",
        "(line 5200,col 9)-(line 5200,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.defaultString(java.lang.String)",
      "begin_line": 5221,
      "end_line": 5223,
      "comment": "\n     * \u003cp\u003eReturns either the passed in String,\n     * or if the String is \u003ccode\u003enull\u003c/code\u003e, an empty String (\"\").\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.defaultString(null)  \u003d \"\"\n     * StringUtils.defaultString(\"\")    \u003d \"\"\n     * StringUtils.defaultString(\"bat\") \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @see ObjectUtils#toString(Object)\n     * @see String#valueOf(Object)\n     * @param str  the String to check, may be null\n     * @return the passed in String, or the empty String if it\n     *  was \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 5222,col 9)-(line 5222,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.defaultString(java.lang.String, java.lang.String)",
      "begin_line": 5242,
      "end_line": 5244,
      "comment": "\n     * \u003cp\u003eReturns either the passed in String, or if the String is\n     * \u003ccode\u003enull\u003c/code\u003e, the value of \u003ccode\u003edefaultStr\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.defaultString(null, \"NULL\")  \u003d \"NULL\"\n     * StringUtils.defaultString(\"\", \"NULL\")    \u003d \"\"\n     * StringUtils.defaultString(\"bat\", \"NULL\") \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @see ObjectUtils#toString(Object,String)\n     * @see String#valueOf(Object)\n     * @param str  the String to check, may be null\n     * @param defaultStr  the default String to return\n     *  if the input is \u003ccode\u003enull\u003c/code\u003e, may be null\n     * @return the passed in String, or the default if it was \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 5243,col 9)-(line 5243,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.defaultIfEmpty(java.lang.String, java.lang.String)",
      "begin_line": 5262,
      "end_line": 5264,
      "comment": "\n     * \u003cp\u003eReturns either the passed in String, or if the String is\n     * empty or \u003ccode\u003enull\u003c/code\u003e, the value of \u003ccode\u003edefaultStr\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.defaultIfEmpty(null, \"NULL\")  \u003d \"NULL\"\n     * StringUtils.defaultIfEmpty(\"\", \"NULL\")    \u003d \"NULL\"\n     * StringUtils.defaultIfEmpty(\"bat\", \"NULL\") \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @see StringUtils#defaultString(String, String)\n     * @param str  the String to check, may be null\n     * @param defaultStr  the default String to return\n     *  if the input is empty (\"\") or \u003ccode\u003enull\u003c/code\u003e, may be null\n     * @return the passed in String, or the default\n     ",
      "child_ranges": [
        "(line 5263,col 9)-(line 5263,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.reverse(java.lang.String)",
      "begin_line": 5282,
      "end_line": 5287,
      "comment": "\n     * \u003cp\u003eReverses a String as per {@link StringBuffer#reverse()}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.reverse(null)  \u003d null\n     * StringUtils.reverse(\"\")    \u003d \"\"\n     * StringUtils.reverse(\"bat\") \u003d \"tab\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to reverse, may be null\n     * @return the reversed String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 5283,col 9)-(line 5285,col 9)",
        "(line 5286,col 9)-(line 5286,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.reverseDelimited(java.lang.String, char)",
      "begin_line": 5308,
      "end_line": 5317,
      "comment": "\n     * \u003cp\u003eReverses a String that is delimited by a specific character.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe Strings between the delimiters are not reversed.\n     * Thus java.lang.String becomes String.lang.java (if the delimiter\n     * is \u003ccode\u003e\u0027.\u0027\u003c/code\u003e).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.reverseDelimited(null, *)      \u003d null\n     * StringUtils.reverseDelimited(\"\", *)        \u003d \"\"\n     * StringUtils.reverseDelimited(\"a.b.c\", \u0027x\u0027) \u003d \"a.b.c\"\n     * StringUtils.reverseDelimited(\"a.b.c\", \".\") \u003d \"c.b.a\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to reverse, may be null\n     * @param separatorChar  the separator character to use\n     * @return the reversed String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 5309,col 9)-(line 5311,col 9)",
        "(line 5314,col 9)-(line 5314,col 50)",
        "(line 5315,col 9)-(line 5315,col 33)",
        "(line 5316,col 9)-(line 5316,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.reverseDelimitedString(java.lang.String, java.lang.String)",
      "begin_line": 5341,
      "end_line": 5353,
      "comment": "\n     * \u003cp\u003eReverses a String that is delimited by a specific character.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe Strings between the delimiters are not reversed.\n     * Thus java.lang.String becomes String.lang.java (if the delimiter\n     * is \u003ccode\u003e\".\"\u003c/code\u003e).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.reverseDelimitedString(null, *)       \u003d null\n     * StringUtils.reverseDelimitedString(\"\",*)          \u003d \"\"\n     * StringUtils.reverseDelimitedString(\"a.b.c\", null) \u003d \"a.b.c\"\n     * StringUtils.reverseDelimitedString(\"a.b.c\", \".\")  \u003d \"c.b.a\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to reverse, may be null\n     * @param separatorChars  the separator characters to use, null treated as whitespace\n     * @return the reversed String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @deprecated Use {@link #reverseDelimited(String, char)} instead.\n     *      This method is broken as the join doesn\u0027t know which char to use.\n     *      Method will be removed in Commons Lang 3.0.\n     *\n     ",
      "child_ranges": [
        "(line 5342,col 9)-(line 5344,col 9)",
        "(line 5347,col 9)-(line 5347,col 51)",
        "(line 5348,col 9)-(line 5348,col 33)",
        "(line 5349,col 9)-(line 5351,col 9)",
        "(line 5352,col 9)-(line 5352,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.abbreviate(java.lang.String, int)",
      "begin_line": 5389,
      "end_line": 5391,
      "comment": "\n     * \u003cp\u003eAbbreviates a String using ellipses. This will turn\n     * \"Now is the time for all good men\" into \"Now is the time for...\"\u003c/p\u003e\n     *\n     * \u003cp\u003eSpecifically:\n     * \u003cul\u003e\n     *   \u003cli\u003eIf \u003ccode\u003estr\u003c/code\u003e is less than \u003ccode\u003emaxWidth\u003c/code\u003e characters\n     *       long, return it.\u003c/li\u003e\n     *   \u003cli\u003eElse abbreviate it to \u003ccode\u003e(substring(str, 0, max-3) + \"...\")\u003c/code\u003e.\u003c/li\u003e\n     *   \u003cli\u003eIf \u003ccode\u003emaxWidth\u003c/code\u003e is less than \u003ccode\u003e4\u003c/code\u003e, throw an\n     *       \u003ccode\u003eIllegalArgumentException\u003c/code\u003e.\u003c/li\u003e\n     *   \u003cli\u003eIn no case will it return a String of length greater than\n     *       \u003ccode\u003emaxWidth\u003c/code\u003e.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.abbreviate(null, *)      \u003d null\n     * StringUtils.abbreviate(\"\", 4)        \u003d \"\"\n     * StringUtils.abbreviate(\"abcdefg\", 6) \u003d \"abc...\"\n     * StringUtils.abbreviate(\"abcdefg\", 7) \u003d \"abcdefg\"\n     * StringUtils.abbreviate(\"abcdefg\", 8) \u003d \"abcdefg\"\n     * StringUtils.abbreviate(\"abcdefg\", 4) \u003d \"a...\"\n     * StringUtils.abbreviate(\"abcdefg\", 3) \u003d IllegalArgumentException\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param maxWidth  maximum length of result String, must be at least 4\n     * @return abbreviated String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @throws IllegalArgumentException if the width is too small\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 5390,col 9)-(line 5390,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.abbreviate(java.lang.String, int, int)",
      "begin_line": 5428,
      "end_line": 5454,
      "comment": "\n     * \u003cp\u003eAbbreviates a String using ellipses. This will turn\n     * \"Now is the time for all good men\" into \"...is the time for...\"\u003c/p\u003e\n     *\n     * \u003cp\u003eWorks like \u003ccode\u003eabbreviate(String, int)\u003c/code\u003e, but allows you to specify\n     * a \"left edge\" offset.  Note that this left edge is not necessarily going to\n     * be the leftmost character in the result, or the first character following the\n     * ellipses, but it will appear somewhere in the result.\n     *\n     * \u003cp\u003eIn no case will it return a String of length greater than\n     * \u003ccode\u003emaxWidth\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.abbreviate(null, *, *)                \u003d null\n     * StringUtils.abbreviate(\"\", 0, 4)                  \u003d \"\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", -1, 10) \u003d \"abcdefg...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 0, 10)  \u003d \"abcdefg...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 1, 10)  \u003d \"abcdefg...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 4, 10)  \u003d \"abcdefg...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 5, 10)  \u003d \"...fghi...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 6, 10)  \u003d \"...ghij...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 8, 10)  \u003d \"...ijklmno\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 10, 10) \u003d \"...ijklmno\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 12, 10) \u003d \"...ijklmno\"\n     * StringUtils.abbreviate(\"abcdefghij\", 0, 3)        \u003d IllegalArgumentException\n     * StringUtils.abbreviate(\"abcdefghij\", 5, 6)        \u003d IllegalArgumentException\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param offset  left edge of source String\n     * @param maxWidth  maximum length of result String, must be at least 4\n     * @return abbreviated String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @throws IllegalArgumentException if the width is too small\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 5429,col 9)-(line 5431,col 9)",
        "(line 5432,col 9)-(line 5434,col 9)",
        "(line 5435,col 9)-(line 5437,col 9)",
        "(line 5438,col 9)-(line 5440,col 9)",
        "(line 5441,col 9)-(line 5443,col 9)",
        "(line 5444,col 9)-(line 5446,col 9)",
        "(line 5447,col 9)-(line 5449,col 9)",
        "(line 5450,col 9)-(line 5452,col 9)",
        "(line 5453,col 9)-(line 5453,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.difference(java.lang.String, java.lang.String)",
      "begin_line": 5483,
      "end_line": 5495,
      "comment": "\n     * \u003cp\u003eCompares two Strings, and returns the portion where they differ.\n     * (More precisely, return the remainder of the second String,\n     * starting from where it\u0027s different from the first.)\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example,\n     * \u003ccode\u003edifference(\"i am a machine\", \"i am a robot\") -\u003e \"robot\"\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.difference(null, null) \u003d null\n     * StringUtils.difference(\"\", \"\") \u003d \"\"\n     * StringUtils.difference(\"\", \"abc\") \u003d \"abc\"\n     * StringUtils.difference(\"abc\", \"\") \u003d \"\"\n     * StringUtils.difference(\"abc\", \"abc\") \u003d \"\"\n     * StringUtils.difference(\"ab\", \"abxyz\") \u003d \"xyz\"\n     * StringUtils.difference(\"abcde\", \"abxyz\") \u003d \"xyz\"\n     * StringUtils.difference(\"abcde\", \"xyz\") \u003d \"xyz\"\n     * \u003c/pre\u003e\n     *\n     * @param str1  the first String, may be null\n     * @param str2  the second String, may be null\n     * @return the portion of str2 where it differs from str1; returns the\n     * empty String if they are equal\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 5484,col 9)-(line 5486,col 9)",
        "(line 5487,col 9)-(line 5489,col 9)",
        "(line 5490,col 9)-(line 5490,col 47)",
        "(line 5491,col 9)-(line 5493,col 9)",
        "(line 5494,col 9)-(line 5494,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.indexOfDifference(java.lang.String, java.lang.String)",
      "begin_line": 5520,
      "end_line": 5537,
      "comment": "\n     * \u003cp\u003eCompares two Strings, and returns the index at which the\n     * Strings begin to differ.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example,\n     * \u003ccode\u003eindexOfDifference(\"i am a machine\", \"i am a robot\") -\u003e 7\u003c/code\u003e\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfDifference(null, null) \u003d -1\n     * StringUtils.indexOfDifference(\"\", \"\") \u003d -1\n     * StringUtils.indexOfDifference(\"\", \"abc\") \u003d 0\n     * StringUtils.indexOfDifference(\"abc\", \"\") \u003d 0\n     * StringUtils.indexOfDifference(\"abc\", \"abc\") \u003d -1\n     * StringUtils.indexOfDifference(\"ab\", \"abxyz\") \u003d 2\n     * StringUtils.indexOfDifference(\"abcde\", \"abxyz\") \u003d 2\n     * StringUtils.indexOfDifference(\"abcde\", \"xyz\") \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param str1  the first String, may be null\n     * @param str2  the second String, may be null\n     * @return the index where str2 and str1 begin to differ; -1 if they are equal\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 5521,col 9)-(line 5523,col 9)",
        "(line 5524,col 9)-(line 5526,col 9)",
        "(line 5527,col 9)-(line 5527,col 14)",
        "(line 5528,col 9)-(line 5532,col 9)",
        "(line 5533,col 9)-(line 5535,col 9)",
        "(line 5536,col 9)-(line 5536,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.indexOfDifference(java.lang.String[])",
      "begin_line": 5570,
      "end_line": 5626,
      "comment": "\n     * \u003cp\u003eCompares all Strings in an array and returns the index at which the\n     * Strings begin to differ.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example,\n     * \u003ccode\u003eindexOfDifference(new String[] {\"i am a machine\", \"i am a robot\"}) -\u003e 7\u003c/code\u003e\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfDifference(null) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {}) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {\"abc\"}) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {null, null}) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {\"\", \"\"}) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {\"\", null}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"abc\", null, null}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {null, null, \"abc\"}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"\", \"abc\"}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"abc\", \"\"}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"abc\", \"abc\"}) \u003d -1\n     * StringUtils.indexOfDifference(new String[] {\"abc\", \"a\"}) \u003d 1\n     * StringUtils.indexOfDifference(new String[] {\"ab\", \"abxyz\"}) \u003d 2\n     * StringUtils.indexOfDifference(new String[] {\"abcde\", \"abxyz\"}) \u003d 2\n     * StringUtils.indexOfDifference(new String[] {\"abcde\", \"xyz\"}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"xyz\", \"abcde\"}) \u003d 0\n     * StringUtils.indexOfDifference(new String[] {\"i am a machine\", \"i am a robot\"}) \u003d 7\n     * \u003c/pre\u003e\n     *\n     * @param strs  array of strings, entries may be null\n     * @return the index where the strings begin to differ; -1 if they are all equal\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 5571,col 9)-(line 5573,col 9)",
        "(line 5574,col 9)-(line 5574,col 38)",
        "(line 5575,col 9)-(line 5575,col 38)",
        "(line 5576,col 9)-(line 5576,col 35)",
        "(line 5577,col 9)-(line 5577,col 47)",
        "(line 5578,col 9)-(line 5578,col 30)",
        "(line 5583,col 9)-(line 5592,col 9)",
        "(line 5595,col 9)-(line 5597,col 9)",
        "(line 5600,col 9)-(line 5602,col 9)",
        "(line 5605,col 9)-(line 5605,col 27)",
        "(line 5606,col 9)-(line 5617,col 9)",
        "(line 5619,col 9)-(line 5624,col 9)",
        "(line 5625,col 9)-(line 5625,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.getCommonPrefix(java.lang.String[])",
      "begin_line": 5661,
      "end_line": 5679,
      "comment": "\n     * \u003cp\u003eCompares all Strings in an array and returns the initial sequence of \n     * characters that is common to all of them.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example,\n     * \u003ccode\u003egetCommonPrefix(new String[] {\"i am a machine\", \"i am a robot\"}) -\u003e \"i am a \"\u003c/code\u003e\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.getCommonPrefix(null) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"abc\"}) \u003d \"abc\"\n     * StringUtils.getCommonPrefix(new String[] {null, null}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"\", \"\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"\", null}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"abc\", null, null}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {null, null, \"abc\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"\", \"abc\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"abc\", \"\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"abc\", \"abc\"}) \u003d \"abc\"\n     * StringUtils.getCommonPrefix(new String[] {\"abc\", \"a\"}) \u003d \"a\"\n     * StringUtils.getCommonPrefix(new String[] {\"ab\", \"abxyz\"}) \u003d \"ab\"\n     * StringUtils.getCommonPrefix(new String[] {\"abcde\", \"abxyz\"}) \u003d \"ab\"\n     * StringUtils.getCommonPrefix(new String[] {\"abcde\", \"xyz\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"xyz\", \"abcde\"}) \u003d \"\"\n     * StringUtils.getCommonPrefix(new String[] {\"i am a machine\", \"i am a robot\"}) \u003d \"i am a \"\n     * \u003c/pre\u003e\n     *\n     * @param strs  array of String objects, entries may be null\n     * @return the initial sequence of characters that are common to all Strings\n     * in the array; empty String if the array is null, the elements are all null \n     * or if there is no common prefix. \n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 5662,col 9)-(line 5664,col 9)",
        "(line 5665,col 9)-(line 5665,col 58)",
        "(line 5666,col 9)-(line 5678,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.getLevenshteinDistance(java.lang.String, java.lang.String)",
      "begin_line": 5717,
      "end_line": 5792,
      "comment": "\n     * \u003cp\u003eFind the Levenshtein distance between two Strings.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is the number of changes needed to change one String into\n     * another, where each change is a single character modification (deletion,\n     * insertion or substitution).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe previous implementation of the Levenshtein distance algorithm\n     * was from \u003ca href\u003d\"http://www.merriampark.com/ld.htm\"\u003ehttp://www.merriampark.com/ld.htm\u003c/a\u003e\u003c/p\u003e\n     *\n     * \u003cp\u003eChas Emerick has written an implementation in Java, which avoids an OutOfMemoryError\n     * which can occur when my Java implementation is used with very large strings.\u003cbr\u003e\n     * This implementation of the Levenshtein distance algorithm\n     * is from \u003ca href\u003d\"http://www.merriampark.com/ldjava.htm\"\u003ehttp://www.merriampark.com/ldjava.htm\u003c/a\u003e\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.getLevenshteinDistance(null, *)             \u003d IllegalArgumentException\n     * StringUtils.getLevenshteinDistance(*, null)             \u003d IllegalArgumentException\n     * StringUtils.getLevenshteinDistance(\"\",\"\")               \u003d 0\n     * StringUtils.getLevenshteinDistance(\"\",\"a\")              \u003d 1\n     * StringUtils.getLevenshteinDistance(\"aaapppp\", \"\")       \u003d 7\n     * StringUtils.getLevenshteinDistance(\"frog\", \"fog\")       \u003d 1\n     * StringUtils.getLevenshteinDistance(\"fly\", \"ant\")        \u003d 3\n     * StringUtils.getLevenshteinDistance(\"elephant\", \"hippo\") \u003d 7\n     * StringUtils.getLevenshteinDistance(\"hippo\", \"elephant\") \u003d 7\n     * StringUtils.getLevenshteinDistance(\"hippo\", \"zzzzzzzz\") \u003d 8\n     * StringUtils.getLevenshteinDistance(\"hello\", \"hallo\")    \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @param s  the first String, must not be null\n     * @param t  the second String, must not be null\n     * @return result distance\n     * @throws IllegalArgumentException if either String input \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 5718,col 9)-(line 5720,col 9)",
        "(line 5739,col 9)-(line 5739,col 27)",
        "(line 5740,col 9)-(line 5740,col 27)",
        "(line 5742,col 9)-(line 5746,col 9)",
        "(line 5748,col 9)-(line 5755,col 9)",
        "(line 5757,col 9)-(line 5757,col 31)",
        "(line 5758,col 9)-(line 5758,col 31)",
        "(line 5759,col 9)-(line 5759,col 17)",
        "(line 5762,col 9)-(line 5762,col 14)",
        "(line 5763,col 9)-(line 5763,col 14)",
        "(line 5765,col 9)-(line 5765,col 17)",
        "(line 5767,col 9)-(line 5767,col 17)",
        "(line 5769,col 9)-(line 5771,col 9)",
        "(line 5773,col 9)-(line 5787,col 9)",
        "(line 5791,col 9)-(line 5791,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.startsWith(java.lang.String, java.lang.String)",
      "begin_line": 5839,
      "end_line": 5841,
      "comment": "\n     * \u003cp\u003eCheck if a String starts with a specified prefix.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003es are handled without exceptions. Two \u003ccode\u003enull\u003c/code\u003e\n     * references are considered to be equal. The comparison is case sensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.startsWith(null, null)      \u003d true\n     * StringUtils.startsWith(null, \"abcdef\")  \u003d false\n     * StringUtils.startsWith(\"abc\", null)     \u003d false\n     * StringUtils.startsWith(\"abc\", \"abcdef\") \u003d true\n     * StringUtils.startsWith(\"abc\", \"ABCDEF\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#startsWith(String)\n     * @param str  the String to check, may be null\n     * @param prefix the prefix to find, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the String starts with the prefix, case sensitive, or\n     *  both \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 5840,col 9)-(line 5840,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.startsWithIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 5864,
      "end_line": 5866,
      "comment": "\n     * \u003cp\u003eCase insensitive check if a String starts with a specified prefix.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003es are handled without exceptions. Two \u003ccode\u003enull\u003c/code\u003e\n     * references are considered to be equal. The comparison is case insensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.startsWithIgnoreCase(null, null)      \u003d true\n     * StringUtils.startsWithIgnoreCase(null, \"abcdef\")  \u003d false\n     * StringUtils.startsWithIgnoreCase(\"abc\", null)     \u003d false\n     * StringUtils.startsWithIgnoreCase(\"abc\", \"abcdef\") \u003d true\n     * StringUtils.startsWithIgnoreCase(\"abc\", \"ABCDEF\") \u003d true\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#startsWith(String)\n     * @param str  the String to check, may be null\n     * @param prefix the prefix to find, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the String starts with the prefix, case insensitive, or\n     *  both \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 5865,col 9)-(line 5865,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.startsWith(java.lang.String, java.lang.String, boolean)",
      "begin_line": 5879,
      "end_line": 5887,
      "comment": "\n     * \u003cp\u003eCheck if a String starts with a specified prefix (optionally case insensitive).\u003c/p\u003e\n     *\n     * @see java.lang.String#startsWith(String)\n     * @param str  the String to check, may be null\n     * @param prefix the prefix to find, may be null\n     * @param ignoreCase inidicates whether the compare should ignore case\n     *  (case insensitive) or not.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the String starts with the prefix or\n     *  both \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 5880,col 9)-(line 5882,col 9)",
        "(line 5883,col 9)-(line 5885,col 9)",
        "(line 5886,col 9)-(line 5886,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.endsWith(java.lang.String, java.lang.String)",
      "begin_line": 5913,
      "end_line": 5915,
      "comment": "\n     * \u003cp\u003eCheck if a String ends with a specified suffix.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003es are handled without exceptions. Two \u003ccode\u003enull\u003c/code\u003e\n     * references are considered to be equal. The comparison is case sensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.endsWith(null, null)      \u003d true\n     * StringUtils.endsWith(null, \"abcdef\")  \u003d false\n     * StringUtils.endsWith(\"def\", null)     \u003d false\n     * StringUtils.endsWith(\"def\", \"abcdef\") \u003d true\n     * StringUtils.endsWith(\"def\", \"ABCDEF\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#endsWith(String)\n     * @param str  the String to check, may be null\n     * @param suffix the suffix to find, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the String ends with the suffix, case sensitive, or\n     *  both \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 5914,col 9)-(line 5914,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.endsWithIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 5939,
      "end_line": 5941,
      "comment": "\n     * \u003cp\u003eCase insensitive check if a String ends with a specified suffix.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003es are handled without exceptions. Two \u003ccode\u003enull\u003c/code\u003e\n     * references are considered to be equal. The comparison is case insensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.endsWithIgnoreCase(null, null)      \u003d true\n     * StringUtils.endsWithIgnoreCase(\"abcdef\", null)  \u003d false\n     * StringUtils.endsWithIgnoreCase(null, \"def\")     \u003d false\n     * StringUtils.endsWithIgnoreCase(\"abcdef\", \"def\") \u003d true\n     * StringUtils.endsWithIgnoreCase(\"ABCDEF\", \"def\") \u003d true\n     * StringUtils.endsWithIgnoreCase(\"ABCDEF\", \"cde\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#endsWith(String)\n     * @param str  the String to check, may be null\n     * @param suffix the suffix to find, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the String ends with the suffix, case insensitive, or\n     *  both \u003ccode\u003enull\u003c/code\u003e\n     * @since 2.4\n     ",
      "child_ranges": [
        "(line 5940,col 9)-(line 5940,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.endsWith(java.lang.String, java.lang.String, boolean)",
      "begin_line": 5954,
      "end_line": 5963,
      "comment": "\n     * \u003cp\u003eCheck if a String ends with a specified suffix (optionally case insensitive).\u003c/p\u003e\n     *\n     * @see java.lang.String#endsWith(String)\n     * @param str  the String to check, may be null\n     * @param suffix the suffix to find, may be null\n     * @param ignoreCase inidicates whether the compare should ignore case\n     *  (case insensitive) or not.\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the String starts with the prefix or\n     *  both \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 5955,col 9)-(line 5957,col 9)",
        "(line 5958,col 9)-(line 5960,col 9)",
        "(line 5961,col 9)-(line 5961,col 55)",
        "(line 5962,col 9)-(line 5962,col 84)"
      ]
    }
  ]
}