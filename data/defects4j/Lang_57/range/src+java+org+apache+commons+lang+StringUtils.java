{
  "filepath": "/tmp/Lang-57b/src/java/org/apache/commons/lang/StringUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StringUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 118,
      "end_line": 5006,
      "comment": "\n * \u003cp\u003eOperations on {@link java.lang.String} that are\n * \u003ccode\u003enull\u003c/code\u003e safe.\u003c/p\u003e\n *\n * \u003cul\u003e\n *  \u003cli\u003e\u003cb\u003eIsEmpty/IsBlank\u003c/b\u003e\n *      - checks if a String contains text\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eTrim/Strip\u003c/b\u003e\n *      - removes leading and trailing whitespace\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eEquals\u003c/b\u003e\n *      - compares two strings null-safe\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eIndexOf/LastIndexOf/Contains\u003c/b\u003e\n *      - null-safe index-of checks\n *  \u003cli\u003e\u003cb\u003eIndexOfAny/LastIndexOfAny/IndexOfAnyBut/LastIndexOfAnyBut\u003c/b\u003e\n *      - index-of any of a set of Strings\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eContainsOnly/ContainsNone\u003c/b\u003e\n *      - does String contains only/none of these characters\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eSubstring/Left/Right/Mid\u003c/b\u003e\n *      - null-safe substring extractions\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eSubstringBefore/SubstringAfter/SubstringBetween\u003c/b\u003e\n *      - substring extraction relative to other strings\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eSplit/Join\u003c/b\u003e\n *      - splits a String into an array of substrings and vice versa\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eRemove/Delete\u003c/b\u003e\n *      - removes part of a String\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eReplace/Overlay\u003c/b\u003e\n *      - Searches a String and replaces one String with another\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eChomp/Chop\u003c/b\u003e\n *      - removes the last part of a String\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eLeftPad/RightPad/Center/Repeat\u003c/b\u003e\n *      - pads a String\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eUpperCase/LowerCase/SwapCase/Capitalize/Uncapitalize\u003c/b\u003e\n *      - changes the case of a String\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eCountMatches\u003c/b\u003e\n *      - counts the number of occurrences of one String in another\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eIsAlpha/IsNumeric/IsWhitespace/IsAsciiPrintable\u003c/b\u003e\n *      - checks the characters in a String\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eDefaultString\u003c/b\u003e\n *      - protects against a null input String\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eReverse/ReverseDelimited\u003c/b\u003e\n *      - reverses a String\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eAbbreviate\u003c/b\u003e\n *      - abbreviates a string using ellipsis\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eDifference\u003c/b\u003e\n *      - compares two Strings and reports on their differences\u003c/li\u003e\n *  \u003cli\u003e\u003cb\u003eLevensteinDistance\u003c/b\u003e\n *      - the number of changes needed to change one String into another\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cp\u003eThe \u003ccode\u003eStringUtils\u003c/code\u003e class defines certain words related to\n * String handling.\u003c/p\u003e\n *\n * \u003cul\u003e\n *  \u003cli\u003enull - \u003ccode\u003enull\u003c/code\u003e\u003c/li\u003e\n *  \u003cli\u003eempty - a zero-length string (\u003ccode\u003e\"\"\u003c/code\u003e)\u003c/li\u003e\n *  \u003cli\u003espace - the space character (\u003ccode\u003e\u0027 \u0027\u003c/code\u003e, char 32)\u003c/li\u003e\n *  \u003cli\u003ewhitespace - the characters defined by {@link Character#isWhitespace(char)}\u003c/li\u003e\n *  \u003cli\u003etrim - the characters \u0026lt;\u003d 32 as in {@link String#trim()}\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * \u003cp\u003e\u003ccode\u003eStringUtils\u003c/code\u003e handles \u003ccode\u003enull\u003c/code\u003e input Strings quietly.\n * That is to say that a \u003ccode\u003enull\u003c/code\u003e input will return \u003ccode\u003enull\u003c/code\u003e.\n * Where a \u003ccode\u003eboolean\u003c/code\u003e or \u003ccode\u003eint\u003c/code\u003e is being returned\n * details vary by method.\u003c/p\u003e\n *\n * \u003cp\u003eA side effect of the \u003ccode\u003enull\u003c/code\u003e handling is that a\n * \u003ccode\u003eNullPointerException\u003c/code\u003e should be considered a bug in\n * \u003ccode\u003eStringUtils\u003c/code\u003e (except for deprecated methods).\u003c/p\u003e\n *\n * \u003cp\u003eMethods in this class give sample code to explain their operation.\n * The symbol \u003ccode\u003e*\u003c/code\u003e is used to indicate any input including \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n *\n * @see java.lang.String\n * @author \u003ca href\u003d\"http://jakarta.apache.org/turbine/\"\u003eApache Jakarta Turbine\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:jon@latchkey.com\"\u003eJon S. Stevens\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:dlr@finemaltcoding.com\"\u003eDaniel Rall\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:gcoladonato@yahoo.com\"\u003eGreg Coladonato\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:ed@apache.org\"\u003eEd Korthof\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:rand_mcneely@yahoo.com\"\u003eRand McNeely\u003c/a\u003e\n * @author Stephen Colebourne\n * @author \u003ca href\u003d\"mailto:fredrik@westermarck.com\"\u003eFredrik Westermarck\u003c/a\u003e\n * @author Holger Krauth\n * @author \u003ca href\u003d\"mailto:alex@purpletech.com\"\u003eAlexander Day Chaffee\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:hps@intermeta.de\"\u003eHenning P. Schmiedehausen\u003c/a\u003e\n * @author Arun Mammen Thomas\n * @author Gary Gregory\n * @author Phil Steitz\n * @author Al Chou\n * @author Michael Davey\n * @author Reuben Sivan\n * @author Chris Hyzer\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": "\n     * The empty String \u003ccode\u003e\"\"\u003c/code\u003e.\n     * @since 2.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "INDEX_NOT_FOUND"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": "\n     * Represents a failed index search.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PAD_LIMIT"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": "\n     * \u003cp\u003eThe maximum size to which the padding constant(s) can expand.\u003c/p\u003e\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.StringUtils.StringUtils()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * \u003cp\u003e\u003ccode\u003eStringUtils\u003c/code\u003e instances should NOT be constructed in\n     * standard programming. Instead, the class should be used as\n     * \u003ccode\u003eStringUtils.trim(\" foo \");\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean\n     * instance to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.isEmpty(java.lang.String)",
      "begin_line": 184,
      "end_line": 186,
      "comment": "\n     * \u003cp\u003eChecks if a String is empty (\"\") or null.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isEmpty(null)      \u003d true\n     * StringUtils.isEmpty(\"\")        \u003d true\n     * StringUtils.isEmpty(\" \")       \u003d false\n     * StringUtils.isEmpty(\"bob\")     \u003d false\n     * StringUtils.isEmpty(\"  bob  \") \u003d false\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eNOTE: This method changed in Lang version 2.0.\n     * It no longer trims the String.\n     * That functionality is available in isBlank().\u003c/p\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the String is empty or null\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.isNotEmpty(java.lang.String)",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\n     * \u003cp\u003eChecks if a String is not empty (\"\") and not null.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isNotEmpty(null)      \u003d false\n     * StringUtils.isNotEmpty(\"\")        \u003d false\n     * StringUtils.isNotEmpty(\" \")       \u003d true\n     * StringUtils.isNotEmpty(\"bob\")     \u003d true\n     * StringUtils.isNotEmpty(\"  bob  \") \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the String is not empty and not null\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.isBlank(java.lang.String)",
      "begin_line": 221,
      "end_line": 232,
      "comment": "\n     * \u003cp\u003eChecks if a String is whitespace, empty (\"\") or null.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isBlank(null)      \u003d true\n     * StringUtils.isBlank(\"\")        \u003d true\n     * StringUtils.isBlank(\" \")       \u003d true\n     * StringUtils.isBlank(\"bob\")     \u003d false\n     * StringUtils.isBlank(\"  bob  \") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the String is null, empty or whitespace\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 19)",
        "(line 223,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 231,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.isNotBlank(java.lang.String)",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\n     * \u003cp\u003eChecks if a String is not empty (\"\"), not null and not whitespace only.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isNotBlank(null)      \u003d false\n     * StringUtils.isNotBlank(\"\")        \u003d false\n     * StringUtils.isNotBlank(\" \")       \u003d false\n     * StringUtils.isNotBlank(\"bob\")     \u003d true\n     * StringUtils.isNotBlank(\"  bob  \") \u003d true\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the String is\n     *  not empty and not null and not whitespace\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.clean(java.lang.String)",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\n     * \u003cp\u003eRemoves control characters (char \u0026lt;\u003d 32) from both\n     * ends of this String, handling \u003ccode\u003enull\u003c/code\u003e by returning\n     * an empty String (\"\").\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.clean(null)          \u003d \"\"\n     * StringUtils.clean(\"\")            \u003d \"\"\n     * StringUtils.clean(\"abc\")         \u003d \"abc\"\n     * StringUtils.clean(\"    abc    \") \u003d \"abc\"\n     * StringUtils.clean(\"     \")       \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#trim()\n     * @param str  the String to clean, may be null\n     * @return the trimmed text, never \u003ccode\u003enull\u003c/code\u003e\n     * @deprecated Use the clearer named {@link #trimToEmpty(String)}.\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.trim(java.lang.String)",
      "begin_line": 302,
      "end_line": 304,
      "comment": "\n     * \u003cp\u003eRemoves control characters (char \u0026lt;\u003d 32) from both\n     * ends of this String, handling \u003ccode\u003enull\u003c/code\u003e by returning\n     * \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is trimmed using {@link String#trim()}.\n     * Trim removes start and end characters \u0026lt;\u003d 32.\n     * To strip whitespace use {@link #strip(String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eTo trim your choice of characters, use the\n     * {@link #strip(String, String)} methods.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.trim(null)          \u003d null\n     * StringUtils.trim(\"\")            \u003d \"\"\n     * StringUtils.trim(\"     \")       \u003d \"\"\n     * StringUtils.trim(\"abc\")         \u003d \"abc\"\n     * StringUtils.trim(\"    abc    \") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be trimmed, may be null\n     * @return the trimmed string, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.trimToNull(java.lang.String)",
      "begin_line": 328,
      "end_line": 331,
      "comment": "\n     * \u003cp\u003eRemoves control characters (char \u0026lt;\u003d 32) from both\n     * ends of this String returning \u003ccode\u003enull\u003c/code\u003e if the String is\n     * empty (\"\") after the trim or if it is \u003ccode\u003enull\u003c/code\u003e.\n     *\n     * \u003cp\u003eThe String is trimmed using {@link String#trim()}.\n     * Trim removes start and end characters \u0026lt;\u003d 32.\n     * To strip whitespace use {@link #stripToNull(String)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.trimToNull(null)          \u003d null\n     * StringUtils.trimToNull(\"\")            \u003d null\n     * StringUtils.trimToNull(\"     \")       \u003d null\n     * StringUtils.trimToNull(\"abc\")         \u003d \"abc\"\n     * StringUtils.trimToNull(\"    abc    \") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be trimmed, may be null\n     * @return the trimmed String,\n     *  \u003ccode\u003enull\u003c/code\u003e if only chars \u0026lt;\u003d 32, empty or null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 30)",
        "(line 330,col 9)-(line 330,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.trimToEmpty(java.lang.String)",
      "begin_line": 354,
      "end_line": 356,
      "comment": "\n     * \u003cp\u003eRemoves control characters (char \u0026lt;\u003d 32) from both\n     * ends of this String returning an empty String (\"\") if the String\n     * is empty (\"\") after the trim or if it is \u003ccode\u003enull\u003c/code\u003e.\n     *\n     * \u003cp\u003eThe String is trimmed using {@link String#trim()}.\n     * Trim removes start and end characters \u0026lt;\u003d 32.\n     * To strip whitespace use {@link #stripToEmpty(String)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.trimToEmpty(null)          \u003d \"\"\n     * StringUtils.trimToEmpty(\"\")            \u003d \"\"\n     * StringUtils.trimToEmpty(\"     \")       \u003d \"\"\n     * StringUtils.trimToEmpty(\"abc\")         \u003d \"abc\"\n     * StringUtils.trimToEmpty(\"    abc    \") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be trimmed, may be null\n     * @return the trimmed String, or an empty String if \u003ccode\u003enull\u003c/code\u003e input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.strip(java.lang.String)",
      "begin_line": 382,
      "end_line": 384,
      "comment": "\n     * \u003cp\u003eStrips whitespace from the start and end of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is similar to {@link #trim(String)} but removes whitespace.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.strip(null)     \u003d null\n     * StringUtils.strip(\"\")       \u003d \"\"\n     * StringUtils.strip(\"   \")    \u003d \"\"\n     * StringUtils.strip(\"abc\")    \u003d \"abc\"\n     * StringUtils.strip(\"  abc\")  \u003d \"abc\"\n     * StringUtils.strip(\"abc  \")  \u003d \"abc\"\n     * StringUtils.strip(\" abc \")  \u003d \"abc\"\n     * StringUtils.strip(\" ab c \") \u003d \"ab c\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to remove whitespace from, may be null\n     * @return the stripped String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.stripToNull(java.lang.String)",
      "begin_line": 409,
      "end_line": 415,
      "comment": "\n     * \u003cp\u003eStrips whitespace from the start and end of a String  returning\n     * \u003ccode\u003enull\u003c/code\u003e if the String is empty (\"\") after the strip.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is similar to {@link #trimToNull(String)} but removes whitespace.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripToNull(null)     \u003d null\n     * StringUtils.stripToNull(\"\")       \u003d null\n     * StringUtils.stripToNull(\"   \")    \u003d null\n     * StringUtils.stripToNull(\"abc\")    \u003d \"abc\"\n     * StringUtils.stripToNull(\"  abc\")  \u003d \"abc\"\n     * StringUtils.stripToNull(\"abc  \")  \u003d \"abc\"\n     * StringUtils.stripToNull(\" abc \")  \u003d \"abc\"\n     * StringUtils.stripToNull(\" ab c \") \u003d \"ab c\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be stripped, may be null\n     * @return the stripped String,\n     *  \u003ccode\u003enull\u003c/code\u003e if whitespace, empty or null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 412,col 9)",
        "(line 413,col 9)-(line 413,col 31)",
        "(line 414,col 9)-(line 414,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.stripToEmpty(java.lang.String)",
      "begin_line": 439,
      "end_line": 441,
      "comment": "\n     * \u003cp\u003eStrips whitespace from the start and end of a String  returning\n     * an empty String if \u003ccode\u003enull\u003c/code\u003e input.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is similar to {@link #trimToEmpty(String)} but removes whitespace.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripToEmpty(null)     \u003d \"\"\n     * StringUtils.stripToEmpty(\"\")       \u003d \"\"\n     * StringUtils.stripToEmpty(\"   \")    \u003d \"\"\n     * StringUtils.stripToEmpty(\"abc\")    \u003d \"abc\"\n     * StringUtils.stripToEmpty(\"  abc\")  \u003d \"abc\"\n     * StringUtils.stripToEmpty(\"abc  \")  \u003d \"abc\"\n     * StringUtils.stripToEmpty(\" abc \")  \u003d \"abc\"\n     * StringUtils.stripToEmpty(\" ab c \") \u003d \"ab c\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to be stripped, may be null\n     * @return the trimmed String, or an empty String if \u003ccode\u003enull\u003c/code\u003e input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.strip(java.lang.String, java.lang.String)",
      "begin_line": 469,
      "end_line": 475,
      "comment": "\n     * \u003cp\u003eStrips any of a set of characters from the start and end of a String.\n     * This is similar to {@link String#trim()} but allows the characters\n     * to be stripped to be controlled.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * An empty string (\"\") input returns the empty string.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the stripChars String is \u003ccode\u003enull\u003c/code\u003e, whitespace is\n     * stripped as defined by {@link Character#isWhitespace(char)}.\n     * Alternatively use {@link #strip(String)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.strip(null, *)          \u003d null\n     * StringUtils.strip(\"\", *)            \u003d \"\"\n     * StringUtils.strip(\"abc\", null)      \u003d \"abc\"\n     * StringUtils.strip(\"  abc\", null)    \u003d \"abc\"\n     * StringUtils.strip(\"abc  \", null)    \u003d \"abc\"\n     * StringUtils.strip(\" abc \", null)    \u003d \"abc\"\n     * StringUtils.strip(\"  abcyx\", \"xyz\") \u003d \"  abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to remove characters from, may be null\n     * @param stripChars  the characters to remove, null treated as whitespace\n     * @return the stripped String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 472,col 9)",
        "(line 473,col 9)-(line 473,col 42)",
        "(line 474,col 9)-(line 474,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.stripStart(java.lang.String, java.lang.String)",
      "begin_line": 501,
      "end_line": 519,
      "comment": "\n     * \u003cp\u003eStrips any of a set of characters from the start of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * An empty string (\"\") input returns the empty string.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the stripChars String is \u003ccode\u003enull\u003c/code\u003e, whitespace is\n     * stripped as defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripStart(null, *)          \u003d null\n     * StringUtils.stripStart(\"\", *)            \u003d \"\"\n     * StringUtils.stripStart(\"abc\", \"\")        \u003d \"abc\"\n     * StringUtils.stripStart(\"abc\", null)      \u003d \"abc\"\n     * StringUtils.stripStart(\"  abc\", null)    \u003d \"abc\"\n     * StringUtils.stripStart(\"abc  \", null)    \u003d \"abc  \"\n     * StringUtils.stripStart(\" abc \", null)    \u003d \"abc \"\n     * StringUtils.stripStart(\"yxabc  \", \"xyz\") \u003d \"abc  \"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to remove characters from, may be null\n     * @param stripChars  the characters to remove, null treated as whitespace\n     * @return the stripped String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 19)",
        "(line 503,col 9)-(line 505,col 9)",
        "(line 506,col 9)-(line 506,col 22)",
        "(line 507,col 9)-(line 517,col 9)",
        "(line 518,col 9)-(line 518,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.stripEnd(java.lang.String, java.lang.String)",
      "begin_line": 545,
      "end_line": 563,
      "comment": "\n     * \u003cp\u003eStrips any of a set of characters from the end of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * An empty string (\"\") input returns the empty string.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the stripChars String is \u003ccode\u003enull\u003c/code\u003e, whitespace is\n     * stripped as defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripEnd(null, *)          \u003d null\n     * StringUtils.stripEnd(\"\", *)            \u003d \"\"\n     * StringUtils.stripEnd(\"abc\", \"\")        \u003d \"abc\"\n     * StringUtils.stripEnd(\"abc\", null)      \u003d \"abc\"\n     * StringUtils.stripEnd(\"  abc\", null)    \u003d \"  abc\"\n     * StringUtils.stripEnd(\"abc  \", null)    \u003d \"abc\"\n     * StringUtils.stripEnd(\" abc \", null)    \u003d \" abc\"\n     * StringUtils.stripEnd(\"  abcyx\", \"xyz\") \u003d \"  abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to remove characters from, may be null\n     * @param stripChars  the characters to remove, null treated as whitespace\n     * @return the stripped String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 16)",
        "(line 547,col 9)-(line 549,col 9)",
        "(line 551,col 9)-(line 561,col 9)",
        "(line 562,col 9)-(line 562,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.stripAll(java.lang.String[])",
      "begin_line": 586,
      "end_line": 588,
      "comment": "\n     * \u003cp\u003eStrips whitespace from the start and end of every String in an array.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA new array is returned each time, except for length zero.\n     * A \u003ccode\u003enull\u003c/code\u003e array will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty array will return itself.\n     * A \u003ccode\u003enull\u003c/code\u003e array entry will be ignored.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripAll(null)             \u003d null\n     * StringUtils.stripAll([])               \u003d []\n     * StringUtils.stripAll([\"abc\", \"  abc\"]) \u003d [\"abc\", \"abc\"]\n     * StringUtils.stripAll([\"abc  \", null])  \u003d [\"abc\", null]\n     * \u003c/pre\u003e\n     *\n     * @param strs  the array to remove whitespace from, may be null\n     * @return the stripped Strings, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.stripAll(java.lang.String[], java.lang.String)",
      "begin_line": 615,
      "end_line": 625,
      "comment": "\n     * \u003cp\u003eStrips any of a set of characters from the start and end of every\n     * String in an array.\u003c/p\u003e\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA new array is returned each time, except for length zero.\n     * A \u003ccode\u003enull\u003c/code\u003e array will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty array will return itself.\n     * A \u003ccode\u003enull\u003c/code\u003e array entry will be ignored.\n     * A \u003ccode\u003enull\u003c/code\u003e stripChars will strip whitespace as defined by\n     * {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.stripAll(null, *)                \u003d null\n     * StringUtils.stripAll([], *)                  \u003d []\n     * StringUtils.stripAll([\"abc\", \"  abc\"], null) \u003d [\"abc\", \"abc\"]\n     * StringUtils.stripAll([\"abc  \", null], null)  \u003d [\"abc\", null]\n     * StringUtils.stripAll([\"abc  \", null], \"yz\")  \u003d [\"abc  \", null]\n     * StringUtils.stripAll([\"yabcz\", null], \"yz\")  \u003d [\"abc\", null]\n     * \u003c/pre\u003e\n     *\n     * @param strs  the array to remove characters from, may be null\n     * @param stripChars  the characters to remove, null treated as whitespace\n     * @return the stripped Strings, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 616,col 9)-(line 616,col 20)",
        "(line 617,col 9)-(line 619,col 9)",
        "(line 620,col 9)-(line 620,col 46)",
        "(line 621,col 9)-(line 623,col 9)",
        "(line 624,col 9)-(line 624,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.equals(java.lang.String, java.lang.String)",
      "begin_line": 649,
      "end_line": 651,
      "comment": "\n     * \u003cp\u003eCompares two Strings, returning \u003ccode\u003etrue\u003c/code\u003e if they are equal.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003es are handled without exceptions. Two \u003ccode\u003enull\u003c/code\u003e\n     * references are considered to be equal. The comparison is case sensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.equals(null, null)   \u003d true\n     * StringUtils.equals(null, \"abc\")  \u003d false\n     * StringUtils.equals(\"abc\", null)  \u003d false\n     * StringUtils.equals(\"abc\", \"abc\") \u003d true\n     * StringUtils.equals(\"abc\", \"ABC\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#equals(Object)\n     * @param str1  the first String, may be null\n     * @param str2  the second String, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the Strings are equal, case sensitive, or\n     *  both \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 650,col 9)-(line 650,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.equalsIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 674,
      "end_line": 676,
      "comment": "\n     * \u003cp\u003eCompares two Strings, returning \u003ccode\u003etrue\u003c/code\u003e if they are equal ignoring\n     * the case.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003es are handled without exceptions. Two \u003ccode\u003enull\u003c/code\u003e\n     * references are considered equal. Comparison is case insensitive.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.equalsIgnoreCase(null, null)   \u003d true\n     * StringUtils.equalsIgnoreCase(null, \"abc\")  \u003d false\n     * StringUtils.equalsIgnoreCase(\"abc\", null)  \u003d false\n     * StringUtils.equalsIgnoreCase(\"abc\", \"abc\") \u003d true\n     * StringUtils.equalsIgnoreCase(\"abc\", \"ABC\") \u003d true\n     * \u003c/pre\u003e\n     *\n     * @see java.lang.String#equalsIgnoreCase(String)\n     * @param str1  the first String, may be null\n     * @param str2  the second String, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the Strings are equal, case insensitive, or\n     *  both \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.indexOf(java.lang.String, char)",
      "begin_line": 699,
      "end_line": 704,
      "comment": "\n     * \u003cp\u003eFinds the first index within a String, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#indexOf(int)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e or empty (\"\") String will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOf(null, *)         \u003d -1\n     * StringUtils.indexOf(\"\", *)           \u003d -1\n     * StringUtils.indexOf(\"aabaabaa\", \u0027a\u0027) \u003d 0\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027) \u003d 2\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChar  the character to find\n     * @return the first index of the search character,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 700,col 9)-(line 702,col 9)",
        "(line 703,col 9)-(line 703,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.indexOf(java.lang.String, char, int)",
      "begin_line": 731,
      "end_line": 736,
      "comment": "\n     * \u003cp\u003eFinds the first index within a String from a start position,\n     * handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#indexOf(int, int)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e or empty (\"\") String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A negative start position is treated as zero.\n     * A start position greater than the string length returns \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOf(null, *, *)          \u003d -1\n     * StringUtils.indexOf(\"\", *, *)            \u003d -1\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027, 0)  \u003d 2\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027, 3)  \u003d 5\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027, 9)  \u003d -1\n     * StringUtils.indexOf(\"aabaabaa\", \u0027b\u0027, -1) \u003d 2\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChar  the character to find\n     * @param startPos  the start position, negative treated as zero\n     * @return the first index of the search character,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 732,col 9)-(line 734,col 9)",
        "(line 735,col 9)-(line 735,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.indexOf(java.lang.String, java.lang.String)",
      "begin_line": 760,
      "end_line": 765,
      "comment": "\n     * \u003cp\u003eFinds the first index within a String, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#indexOf(String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOf(null, *)          \u003d -1\n     * StringUtils.indexOf(*, null)          \u003d -1\n     * StringUtils.indexOf(\"\", \"\")           \u003d 0\n     * StringUtils.indexOf(\"aabaabaa\", \"a\")  \u003d 0\n     * StringUtils.indexOf(\"aabaabaa\", \"b\")  \u003d 2\n     * StringUtils.indexOf(\"aabaabaa\", \"ab\") \u003d 1\n     * StringUtils.indexOf(\"aabaabaa\", \"\")   \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStr  the String to find, may be null\n     * @return the first index of the search String,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 761,col 9)-(line 763,col 9)",
        "(line 764,col 9)-(line 764,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.ordinalIndexOf(java.lang.String, java.lang.String, int)",
      "begin_line": 794,
      "end_line": 811,
      "comment": "\n     * \u003cp\u003eFinds the n-th index within a String, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#indexOf(String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.ordinalIndexOf(null, *, *)          \u003d -1\n     * StringUtils.ordinalIndexOf(*, null, *)          \u003d -1\n     * StringUtils.ordinalIndexOf(\"\", \"\", *)           \u003d 0\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"a\", 1)  \u003d 0\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"a\", 2)  \u003d 1\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"b\", 1)  \u003d 2\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"b\", 2)  \u003d 5\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"ab\", 1) \u003d 1\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"ab\", 2) \u003d 4\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"\", 1)   \u003d 0\n     * StringUtils.ordinalIndexOf(\"aabaabaa\", \"\", 2)   \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStr  the String to find, may be null\n     * @param ordinal  the n-th \u003ccode\u003esearchStr\u003c/code\u003e to find\n     * @return the n-th index of the search String,\n     *  \u003ccode\u003e-1\u003c/code\u003e (\u003ccode\u003eINDEX_NOT_FOUND\u003c/code\u003e) if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 795,col 9)-(line 797,col 9)",
        "(line 798,col 9)-(line 800,col 9)",
        "(line 801,col 9)-(line 801,col 22)",
        "(line 802,col 9)-(line 802,col 36)",
        "(line 803,col 9)-(line 809,col 34)",
        "(line 810,col 9)-(line 810,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.indexOf(java.lang.String, java.lang.String, int)",
      "begin_line": 844,
      "end_line": 853,
      "comment": "\n     * \u003cp\u003eFinds the first index within a String, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#indexOf(String, int)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A negative start position is treated as zero.\n     * An empty (\"\") search String always matches.\n     * A start position greater than the string length only matches\n     * an empty search String.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOf(null, *, *)          \u003d -1\n     * StringUtils.indexOf(*, null, *)          \u003d -1\n     * StringUtils.indexOf(\"\", \"\", 0)           \u003d 0\n     * StringUtils.indexOf(\"aabaabaa\", \"a\", 0)  \u003d 0\n     * StringUtils.indexOf(\"aabaabaa\", \"b\", 0)  \u003d 2\n     * StringUtils.indexOf(\"aabaabaa\", \"ab\", 0) \u003d 1\n     * StringUtils.indexOf(\"aabaabaa\", \"b\", 3)  \u003d 5\n     * StringUtils.indexOf(\"aabaabaa\", \"b\", 9)  \u003d -1\n     * StringUtils.indexOf(\"aabaabaa\", \"b\", -1) \u003d 2\n     * StringUtils.indexOf(\"aabaabaa\", \"\", 2)   \u003d 2\n     * StringUtils.indexOf(\"abc\", \"\", 9)        \u003d 3\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStr  the String to find, may be null\n     * @param startPos  the start position, negative treated as zero\n     * @return the first index of the search String,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 845,col 9)-(line 847,col 9)",
        "(line 849,col 9)-(line 851,col 9)",
        "(line 852,col 9)-(line 852,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.lastIndexOf(java.lang.String, char)",
      "begin_line": 876,
      "end_line": 881,
      "comment": "\n     * \u003cp\u003eFinds the last index within a String, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#lastIndexOf(int)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e or empty (\"\") String will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOf(null, *)         \u003d -1\n     * StringUtils.lastIndexOf(\"\", *)           \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027a\u0027) \u003d 7\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027) \u003d 5\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChar  the character to find\n     * @return the last index of the search character,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 877,col 9)-(line 879,col 9)",
        "(line 880,col 9)-(line 880,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.lastIndexOf(java.lang.String, char, int)",
      "begin_line": 910,
      "end_line": 915,
      "comment": "\n     * \u003cp\u003eFinds the last index within a String from a start position,\n     * handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#lastIndexOf(int, int)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e or empty (\"\") String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A negative start position returns \u003ccode\u003e-1\u003c/code\u003e.\n     * A start position greater than the string length searches the whole string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOf(null, *, *)          \u003d -1\n     * StringUtils.lastIndexOf(\"\", *,  *)           \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, 8)  \u003d 5\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, 4)  \u003d 2\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, 0)  \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, 9)  \u003d 5\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027b\u0027, -1) \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \u0027a\u0027, 0)  \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChar  the character to find\n     * @param startPos  the start position\n     * @return the last index of the search character,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 911,col 9)-(line 913,col 9)",
        "(line 914,col 9)-(line 914,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.lastIndexOf(java.lang.String, java.lang.String)",
      "begin_line": 939,
      "end_line": 944,
      "comment": "\n     * \u003cp\u003eFinds the last index within a String, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#lastIndexOf(String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOf(null, *)          \u003d -1\n     * StringUtils.lastIndexOf(*, null)          \u003d -1\n     * StringUtils.lastIndexOf(\"\", \"\")           \u003d 0\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"a\")  \u003d 0\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\")  \u003d 2\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"ab\") \u003d 1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"\")   \u003d 8\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStr  the String to find, may be null\n     * @return the last index of the search String,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 940,col 9)-(line 942,col 9)",
        "(line 943,col 9)-(line 943,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.lastIndexOf(java.lang.String, java.lang.String, int)",
      "begin_line": 974,
      "end_line": 979,
      "comment": "\n     * \u003cp\u003eFinds the first index within a String, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#lastIndexOf(String, int)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A negative start position returns \u003ccode\u003e-1\u003c/code\u003e.\n     * An empty (\"\") search String always matches unless the start position is negative.\n     * A start position greater than the string length searches the whole string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOf(null, *, *)          \u003d -1\n     * StringUtils.lastIndexOf(*, null, *)          \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"a\", 8)  \u003d 7\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\", 8)  \u003d 5\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"ab\", 8) \u003d 4\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\", 9)  \u003d 5\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\", -1) \u003d -1\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"a\", 0)  \u003d 0\n     * StringUtils.lastIndexOf(\"aabaabaa\", \"b\", 0)  \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStr  the String to find, may be null\n     * @param startPos  the start position, negative treated as zero\n     * @return the first index of the search String,\n     *  -1 if no match or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 975,col 9)-(line 977,col 9)",
        "(line 978,col 9)-(line 978,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.contains(java.lang.String, char)",
      "begin_line": 1002,
      "end_line": 1007,
      "comment": "\n     * \u003cp\u003eChecks if String contains a search character, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#indexOf(int)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e or empty (\"\") String will return \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.contains(null, *)    \u003d false\n     * StringUtils.contains(\"\", *)      \u003d false\n     * StringUtils.contains(\"abc\", \u0027a\u0027) \u003d true\n     * StringUtils.contains(\"abc\", \u0027z\u0027) \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChar  the character to find\n     * @return true if the String contains the search character,\n     *  false if not or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1003,col 9)-(line 1005,col 9)",
        "(line 1006,col 9)-(line 1006,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.contains(java.lang.String, java.lang.String)",
      "begin_line": 1030,
      "end_line": 1035,
      "comment": "\n     * \u003cp\u003eChecks if String contains a search String, handling \u003ccode\u003enull\u003c/code\u003e.\n     * This method uses {@link String#indexOf(int)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.contains(null, *)     \u003d false\n     * StringUtils.contains(*, null)     \u003d false\n     * StringUtils.contains(\"\", \"\")      \u003d true\n     * StringUtils.contains(\"abc\", \"\")   \u003d true\n     * StringUtils.contains(\"abc\", \"a\")  \u003d true\n     * StringUtils.contains(\"abc\", \"z\")  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStr  the String to find, may be null\n     * @return true if the String contains the search String,\n     *  false if not or \u003ccode\u003enull\u003c/code\u003e string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1031,col 9)-(line 1033,col 9)",
        "(line 1034,col 9)-(line 1034,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.containsIgnoreCase(java.lang.String, java.lang.String)",
      "begin_line": 1060,
      "end_line": 1065,
      "comment": "\n     * \u003cp\u003eChecks if String contains a search String irrespective of case,\n     * handling \u003ccode\u003enull\u003c/code\u003e. This method uses\n     * {@link #contains(String, String)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003efalse\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.contains(null, *) \u003d false\n     * StringUtils.contains(*, null) \u003d false\n     * StringUtils.contains(\"\", \"\") \u003d true\n     * StringUtils.contains(\"abc\", \"\") \u003d true\n     * StringUtils.contains(\"abc\", \"a\") \u003d true\n     * StringUtils.contains(\"abc\", \"z\") \u003d false\n     * StringUtils.contains(\"abc\", \"A\") \u003d true\n     * StringUtils.contains(\"abc\", \"Z\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str the String to check, may be null\n     * @param searchStr the String to find, may be null\n     * @return true if the String contains the search String irrespective of\n     * case or false if not or \u003ccode\u003enull\u003c/code\u003e string input\n     ",
      "child_ranges": [
        "(line 1061,col 9)-(line 1063,col 9)",
        "(line 1064,col 9)-(line 1064,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.indexOfAny(java.lang.String, char[])",
      "begin_line": 1091,
      "end_line": 1104,
      "comment": "\n     * \u003cp\u003eSearch a String to find the first index of any\n     * character in the given set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e or zero length search array will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAny(null, *)                \u003d -1\n     * StringUtils.indexOfAny(\"\", *)                  \u003d -1\n     * StringUtils.indexOfAny(*, null)                \u003d -1\n     * StringUtils.indexOfAny(*, [])                  \u003d -1\n     * StringUtils.indexOfAny(\"zzabyycdxx\",[\u0027z\u0027,\u0027a\u0027]) \u003d 0\n     * StringUtils.indexOfAny(\"zzabyycdxx\",[\u0027b\u0027,\u0027y\u0027]) \u003d 3\n     * StringUtils.indexOfAny(\"aba\", [\u0027z\u0027])           \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the index of any of the chars, -1 if no match or null input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1092,col 9)-(line 1094,col 9)",
        "(line 1095,col 9)-(line 1102,col 9)",
        "(line 1103,col 9)-(line 1103,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.indexOfAny(java.lang.String, java.lang.String)",
      "begin_line": 1128,
      "end_line": 1133,
      "comment": "\n     * \u003cp\u003eSearch a String to find the first index of any\n     * character in the given set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e search string will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAny(null, *)            \u003d -1\n     * StringUtils.indexOfAny(\"\", *)              \u003d -1\n     * StringUtils.indexOfAny(*, null)            \u003d -1\n     * StringUtils.indexOfAny(*, \"\")              \u003d -1\n     * StringUtils.indexOfAny(\"zzabyycdxx\", \"za\") \u003d 0\n     * StringUtils.indexOfAny(\"zzabyycdxx\", \"by\") \u003d 3\n     * StringUtils.indexOfAny(\"aba\",\"z\")          \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the index of any of the chars, -1 if no match or null input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1129,col 9)-(line 1131,col 9)",
        "(line 1132,col 9)-(line 1132,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.indexOfAnyBut(java.lang.String, char[])",
      "begin_line": 1159,
      "end_line": 1173,
      "comment": "\n     * \u003cp\u003eSearch a String to find the first index of any\n     * character not in the given set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e or zero length search array will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAnyBut(null, *)           \u003d -1\n     * StringUtils.indexOfAnyBut(\"\", *)             \u003d -1\n     * StringUtils.indexOfAnyBut(*, null)           \u003d -1\n     * StringUtils.indexOfAnyBut(*, [])             \u003d -1\n     * StringUtils.indexOfAnyBut(\"zzabyycdxx\",\u0027za\u0027) \u003d 3\n     * StringUtils.indexOfAnyBut(\"zzabyycdxx\", \u0027\u0027)  \u003d 0\n     * StringUtils.indexOfAnyBut(\"aba\", \u0027ab\u0027)       \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the index of any of the chars, -1 if no match or null input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1160,col 9)-(line 1162,col 9)",
        "(line 1163,col 9)-(line 1171,col 9)",
        "(line 1172,col 9)-(line 1172,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.indexOfAnyBut(java.lang.String, java.lang.String)",
      "begin_line": 1197,
      "end_line": 1207,
      "comment": "\n     * \u003cp\u003eSearch a String to find the first index of any\n     * character not in the given set of characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e search string will return \u003ccode\u003e-1\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAnyBut(null, *)            \u003d -1\n     * StringUtils.indexOfAnyBut(\"\", *)              \u003d -1\n     * StringUtils.indexOfAnyBut(*, null)            \u003d -1\n     * StringUtils.indexOfAnyBut(*, \"\")              \u003d -1\n     * StringUtils.indexOfAnyBut(\"zzabyycdxx\", \"za\") \u003d 3\n     * StringUtils.indexOfAnyBut(\"zzabyycdxx\", \"\")   \u003d 0\n     * StringUtils.indexOfAnyBut(\"aba\",\"ab\")         \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchChars  the chars to search for, may be null\n     * @return the index of any of the chars, -1 if no match or null input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1198,col 9)-(line 1200,col 9)",
        "(line 1201,col 9)-(line 1205,col 9)",
        "(line 1206,col 9)-(line 1206,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.containsOnly(java.lang.String, char[])",
      "begin_line": 1232,
      "end_line": 1244,
      "comment": "\n     * \u003cp\u003eChecks if the String contains only certain characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003efalse\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e valid character array will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty String (\"\") always returns \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsOnly(null, *)       \u003d false\n     * StringUtils.containsOnly(*, null)       \u003d false\n     * StringUtils.containsOnly(\"\", *)         \u003d true\n     * StringUtils.containsOnly(\"ab\", \u0027\u0027)      \u003d false\n     * StringUtils.containsOnly(\"abab\", \u0027abc\u0027) \u003d true\n     * StringUtils.containsOnly(\"ab1\", \u0027abc\u0027)  \u003d false\n     * StringUtils.containsOnly(\"abz\", \u0027abc\u0027)  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param valid  an array of valid chars, may be null\n     * @return true if it only contains valid chars and is non-null\n     ",
      "child_ranges": [
        "(line 1234,col 9)-(line 1236,col 9)",
        "(line 1237,col 9)-(line 1239,col 9)",
        "(line 1240,col 9)-(line 1242,col 9)",
        "(line 1243,col 9)-(line 1243,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.containsOnly(java.lang.String, java.lang.String)",
      "begin_line": 1268,
      "end_line": 1273,
      "comment": "\n     * \u003cp\u003eChecks if the String contains only certain characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003efalse\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e valid character String will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty String (\"\") always returns \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsOnly(null, *)       \u003d false\n     * StringUtils.containsOnly(*, null)       \u003d false\n     * StringUtils.containsOnly(\"\", *)         \u003d true\n     * StringUtils.containsOnly(\"ab\", \"\")      \u003d false\n     * StringUtils.containsOnly(\"abab\", \"abc\") \u003d true\n     * StringUtils.containsOnly(\"ab1\", \"abc\")  \u003d false\n     * StringUtils.containsOnly(\"abz\", \"abc\")  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param validChars  a String of valid chars, may be null\n     * @return true if it only contains valid chars and is non-null\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1269,col 9)-(line 1271,col 9)",
        "(line 1272,col 9)-(line 1272,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.containsNone(java.lang.String, char[])",
      "begin_line": 1299,
      "end_line": 1314,
      "comment": "\n     * \u003cp\u003eChecks that the String does not contain certain characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003etrue\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e invalid character array will return \u003ccode\u003etrue\u003c/code\u003e.\n     * An empty String (\"\") always returns true.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsNone(null, *)       \u003d true\n     * StringUtils.containsNone(*, null)       \u003d true\n     * StringUtils.containsNone(\"\", *)         \u003d true\n     * StringUtils.containsNone(\"ab\", \u0027\u0027)      \u003d true\n     * StringUtils.containsNone(\"abab\", \u0027xyz\u0027) \u003d true\n     * StringUtils.containsNone(\"ab1\", \u0027xyz\u0027)  \u003d true\n     * StringUtils.containsNone(\"abz\", \u0027xyz\u0027)  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param invalidChars  an array of invalid chars, may be null\n     * @return true if it contains none of the invalid chars, or is null\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1300,col 9)-(line 1302,col 9)",
        "(line 1303,col 9)-(line 1303,col 35)",
        "(line 1304,col 9)-(line 1304,col 44)",
        "(line 1305,col 9)-(line 1312,col 9)",
        "(line 1313,col 9)-(line 1313,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.containsNone(java.lang.String, java.lang.String)",
      "begin_line": 1338,
      "end_line": 1343,
      "comment": "\n     * \u003cp\u003eChecks that the String does not contain certain characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003etrue\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e invalid character array will return \u003ccode\u003etrue\u003c/code\u003e.\n     * An empty String (\"\") always returns true.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.containsNone(null, *)       \u003d true\n     * StringUtils.containsNone(*, null)       \u003d true\n     * StringUtils.containsNone(\"\", *)         \u003d true\n     * StringUtils.containsNone(\"ab\", \"\")      \u003d true\n     * StringUtils.containsNone(\"abab\", \"xyz\") \u003d true\n     * StringUtils.containsNone(\"ab1\", \"xyz\")  \u003d true\n     * StringUtils.containsNone(\"abz\", \"xyz\")  \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param invalidChars  a String of invalid chars, may be null\n     * @return true if it contains none of the invalid chars, or is null\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1339,col 9)-(line 1341,col 9)",
        "(line 1342,col 9)-(line 1342,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.indexOfAny(java.lang.String, java.lang.String[])",
      "begin_line": 1373,
      "end_line": 1399,
      "comment": "\n     * \u003cp\u003eFind the first index of any of a set of potential substrings.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e or zero length search array will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e search array entry will be ignored, but a search\n     * array containing \"\" will return \u003ccode\u003e0\u003c/code\u003e if \u003ccode\u003estr\u003c/code\u003e is not\n     * null. This method uses {@link String#indexOf(String)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfAny(null, *)                     \u003d -1\n     * StringUtils.indexOfAny(*, null)                     \u003d -1\n     * StringUtils.indexOfAny(*, [])                       \u003d -1\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"ab\",\"cd\"])   \u003d 2\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"cd\",\"ab\"])   \u003d 2\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"mn\",\"op\"])   \u003d -1\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"zab\",\"aby\"]) \u003d 1\n     * StringUtils.indexOfAny(\"zzabyycdxx\", [\"\"])          \u003d 0\n     * StringUtils.indexOfAny(\"\", [\"\"])                    \u003d 0\n     * StringUtils.indexOfAny(\"\", [\"a\"])                   \u003d -1\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStrs  the Strings to search for, may be null\n     * @return the first index of any of the searchStrs in str, -1 if no match\n     ",
      "child_ranges": [
        "(line 1374,col 9)-(line 1376,col 9)",
        "(line 1377,col 9)-(line 1377,col 35)",
        "(line 1380,col 9)-(line 1380,col 36)",
        "(line 1382,col 9)-(line 1382,col 20)",
        "(line 1383,col 9)-(line 1396,col 9)",
        "(line 1398,col 9)-(line 1398,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.lastIndexOfAny(java.lang.String, java.lang.String[])",
      "begin_line": 1426,
      "end_line": 1444,
      "comment": "\n     * \u003cp\u003eFind the latest index of any of a set of potential substrings.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e search array will return \u003ccode\u003e-1\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e or zero length search array entry will be ignored,\n     * but a search array containing \"\" will return the length of \u003ccode\u003estr\u003c/code\u003e\n     * if \u003ccode\u003estr\u003c/code\u003e is not null. This method uses {@link String#indexOf(String)}\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lastIndexOfAny(null, *)                   \u003d -1\n     * StringUtils.lastIndexOfAny(*, null)                   \u003d -1\n     * StringUtils.lastIndexOfAny(*, [])                     \u003d -1\n     * StringUtils.lastIndexOfAny(*, [null])                 \u003d -1\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"ab\",\"cd\"]) \u003d 6\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"cd\",\"ab\"]) \u003d 6\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"mn\",\"op\"]) \u003d -1\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"mn\",\"op\"]) \u003d -1\n     * StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"mn\",\"\"])   \u003d 10\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param searchStrs  the Strings to search for, may be null\n     * @return the last index of any of the Strings, -1 if no match\n     ",
      "child_ranges": [
        "(line 1427,col 9)-(line 1429,col 9)",
        "(line 1430,col 9)-(line 1430,col 35)",
        "(line 1431,col 9)-(line 1431,col 21)",
        "(line 1432,col 9)-(line 1432,col 20)",
        "(line 1433,col 9)-(line 1442,col 9)",
        "(line 1443,col 9)-(line 1443,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.substring(java.lang.String, int)",
      "begin_line": 1472,
      "end_line": 1490,
      "comment": "\n     * \u003cp\u003eGets a substring from the specified String avoiding exceptions.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative start position can be used to start \u003ccode\u003en\u003c/code\u003e\n     * characters from the end of the String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") String will return \"\".\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substring(null, *)   \u003d null\n     * StringUtils.substring(\"\", *)     \u003d \"\"\n     * StringUtils.substring(\"abc\", 0)  \u003d \"abc\"\n     * StringUtils.substring(\"abc\", 2)  \u003d \"c\"\n     * StringUtils.substring(\"abc\", 4)  \u003d \"\"\n     * StringUtils.substring(\"abc\", -2) \u003d \"bc\"\n     * StringUtils.substring(\"abc\", -4) \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the substring from, may be null\n     * @param start  the position to start from, negative means\n     *  count back from the end of the String by this many characters\n     * @return substring from start position, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 1473,col 9)-(line 1475,col 9)",
        "(line 1478,col 9)-(line 1480,col 9)",
        "(line 1482,col 9)-(line 1484,col 9)",
        "(line 1485,col 9)-(line 1487,col 9)",
        "(line 1489,col 9)-(line 1489,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.substring(java.lang.String, int, int)",
      "begin_line": 1527,
      "end_line": 1558,
      "comment": "\n     * \u003cp\u003eGets a substring from the specified String avoiding exceptions.\u003c/p\u003e\n     *\n     * \u003cp\u003eA negative start position can be used to start/end \u003ccode\u003en\u003c/code\u003e\n     * characters from the end of the String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe returned substring starts with the character in the \u003ccode\u003estart\u003c/code\u003e\n     * position and ends before the \u003ccode\u003eend\u003c/code\u003e position. All position counting is\n     * zero-based -- i.e., to start at the beginning of the string use\n     * \u003ccode\u003estart \u003d 0\u003c/code\u003e. Negative start and end positions can be used to\n     * specify offsets relative to the end of the String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf \u003ccode\u003estart\u003c/code\u003e is not strictly to the left of \u003ccode\u003eend\u003c/code\u003e, \"\"\n     * is returned.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substring(null, *, *)    \u003d null\n     * StringUtils.substring(\"\", * ,  *)    \u003d \"\";\n     * StringUtils.substring(\"abc\", 0, 2)   \u003d \"ab\"\n     * StringUtils.substring(\"abc\", 2, 0)   \u003d \"\"\n     * StringUtils.substring(\"abc\", 2, 4)   \u003d \"c\"\n     * StringUtils.substring(\"abc\", 4, 6)   \u003d \"\"\n     * StringUtils.substring(\"abc\", 2, 2)   \u003d \"\"\n     * StringUtils.substring(\"abc\", -2, -1) \u003d \"b\"\n     * StringUtils.substring(\"abc\", -4, 2)  \u003d \"ab\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the substring from, may be null\n     * @param start  the position to start from, negative means\n     *  count back from the end of the String by this many characters\n     * @param end  the position to end at (exclusive), negative means\n     *  count back from the end of the String by this many characters\n     * @return substring from start position to end positon,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 1528,col 9)-(line 1530,col 9)",
        "(line 1533,col 9)-(line 1535,col 9)",
        "(line 1536,col 9)-(line 1538,col 9)",
        "(line 1541,col 9)-(line 1543,col 9)",
        "(line 1546,col 9)-(line 1548,col 9)",
        "(line 1550,col 9)-(line 1552,col 9)",
        "(line 1553,col 9)-(line 1555,col 9)",
        "(line 1557,col 9)-(line 1557,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.left(java.lang.String, int)",
      "begin_line": 1582,
      "end_line": 1594,
      "comment": "\n     * \u003cp\u003eGets the leftmost \u003ccode\u003elen\u003c/code\u003e characters of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf \u003ccode\u003elen\u003c/code\u003e characters are not available, or the\n     * String is \u003ccode\u003enull\u003c/code\u003e, the String will be returned without\n     * an exception. An exception is thrown if len is negative.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.left(null, *)    \u003d null\n     * StringUtils.left(*, -ve)     \u003d \"\"\n     * StringUtils.left(\"\", *)      \u003d \"\"\n     * StringUtils.left(\"abc\", 0)   \u003d \"\"\n     * StringUtils.left(\"abc\", 2)   \u003d \"ab\"\n     * StringUtils.left(\"abc\", 4)   \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the leftmost characters from, may be null\n     * @param len  the length of the required String, must be zero or positive\n     * @return the leftmost characters, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 1583,col 9)-(line 1585,col 9)",
        "(line 1586,col 9)-(line 1588,col 9)",
        "(line 1589,col 9)-(line 1593,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.right(java.lang.String, int)",
      "begin_line": 1616,
      "end_line": 1628,
      "comment": "\n     * \u003cp\u003eGets the rightmost \u003ccode\u003elen\u003c/code\u003e characters of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf \u003ccode\u003elen\u003c/code\u003e characters are not available, or the String\n     * is \u003ccode\u003enull\u003c/code\u003e, the String will be returned without an\n     * an exception. An exception is thrown if len is negative.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.right(null, *)    \u003d null\n     * StringUtils.right(*, -ve)     \u003d \"\"\n     * StringUtils.right(\"\", *)      \u003d \"\"\n     * StringUtils.right(\"abc\", 0)   \u003d \"\"\n     * StringUtils.right(\"abc\", 2)   \u003d \"bc\"\n     * StringUtils.right(\"abc\", 4)   \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the rightmost characters from, may be null\n     * @param len  the length of the required String, must be zero or positive\n     * @return the rightmost characters, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 1617,col 9)-(line 1619,col 9)",
        "(line 1620,col 9)-(line 1622,col 9)",
        "(line 1623,col 9)-(line 1627,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.mid(java.lang.String, int, int)",
      "begin_line": 1654,
      "end_line": 1669,
      "comment": "\n     * \u003cp\u003eGets \u003ccode\u003elen\u003c/code\u003e characters from the middle of a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf \u003ccode\u003elen\u003c/code\u003e characters are not available, the remainder\n     * of the String will be returned without an exception. If the\n     * String is \u003ccode\u003enull\u003c/code\u003e, \u003ccode\u003enull\u003c/code\u003e will be returned.\n     * An exception is thrown if len is negative.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.mid(null, *, *)    \u003d null\n     * StringUtils.mid(*, *, -ve)     \u003d \"\"\n     * StringUtils.mid(\"\", 0, *)      \u003d \"\"\n     * StringUtils.mid(\"abc\", 0, 2)   \u003d \"ab\"\n     * StringUtils.mid(\"abc\", 0, 4)   \u003d \"abc\"\n     * StringUtils.mid(\"abc\", 2, 4)   \u003d \"c\"\n     * StringUtils.mid(\"abc\", 4, 2)   \u003d \"\"\n     * StringUtils.mid(\"abc\", -2, 2)  \u003d \"ab\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get the characters from, may be null\n     * @param pos  the position to start from, negative treated as zero\n     * @param len  the length of the required String, must be zero or positive\n     * @return the middle characters, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 1655,col 9)-(line 1657,col 9)",
        "(line 1658,col 9)-(line 1660,col 9)",
        "(line 1661,col 9)-(line 1663,col 9)",
        "(line 1664,col 9)-(line 1668,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.substringBefore(java.lang.String, java.lang.String)",
      "begin_line": 1698,
      "end_line": 1710,
      "comment": "\n     * \u003cp\u003eGets the substring before the first occurrence of a separator.\n     * The separator is not returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") string input will return the empty string.\n     * A \u003ccode\u003enull\u003c/code\u003e separator will return the input string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringBefore(null, *)      \u003d null\n     * StringUtils.substringBefore(\"\", *)        \u003d \"\"\n     * StringUtils.substringBefore(\"abc\", \"a\")   \u003d \"\"\n     * StringUtils.substringBefore(\"abcba\", \"b\") \u003d \"a\"\n     * StringUtils.substringBefore(\"abc\", \"c\")   \u003d \"ab\"\n     * StringUtils.substringBefore(\"abc\", \"d\")   \u003d \"abc\"\n     * StringUtils.substringBefore(\"abc\", \"\")    \u003d \"\"\n     * StringUtils.substringBefore(\"abc\", null)  \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get a substring from, may be null\n     * @param separator  the String to search for, may be null\n     * @return the substring before the first occurrence of the separator,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1699,col 9)-(line 1701,col 9)",
        "(line 1702,col 9)-(line 1704,col 9)",
        "(line 1705,col 9)-(line 1705,col 41)",
        "(line 1706,col 9)-(line 1708,col 9)",
        "(line 1709,col 9)-(line 1709,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.substringAfter(java.lang.String, java.lang.String)",
      "begin_line": 1738,
      "end_line": 1750,
      "comment": "\n     * \u003cp\u003eGets the substring after the first occurrence of a separator.\n     * The separator is not returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") string input will return the empty string.\n     * A \u003ccode\u003enull\u003c/code\u003e separator will return the empty string if the\n     * input string is not \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringAfter(null, *)      \u003d null\n     * StringUtils.substringAfter(\"\", *)        \u003d \"\"\n     * StringUtils.substringAfter(*, null)      \u003d \"\"\n     * StringUtils.substringAfter(\"abc\", \"a\")   \u003d \"bc\"\n     * StringUtils.substringAfter(\"abcba\", \"b\") \u003d \"cba\"\n     * StringUtils.substringAfter(\"abc\", \"c\")   \u003d \"\"\n     * StringUtils.substringAfter(\"abc\", \"d\")   \u003d \"\"\n     * StringUtils.substringAfter(\"abc\", \"\")    \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get a substring from, may be null\n     * @param separator  the String to search for, may be null\n     * @return the substring after the first occurrence of the separator,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1739,col 9)-(line 1741,col 9)",
        "(line 1742,col 9)-(line 1744,col 9)",
        "(line 1745,col 9)-(line 1745,col 41)",
        "(line 1746,col 9)-(line 1748,col 9)",
        "(line 1749,col 9)-(line 1749,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.substringBeforeLast(java.lang.String, java.lang.String)",
      "begin_line": 1777,
      "end_line": 1786,
      "comment": "\n     * \u003cp\u003eGets the substring before the last occurrence of a separator.\n     * The separator is not returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") string input will return the empty string.\n     * An empty or \u003ccode\u003enull\u003c/code\u003e separator will return the input string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringBeforeLast(null, *)      \u003d null\n     * StringUtils.substringBeforeLast(\"\", *)        \u003d \"\"\n     * StringUtils.substringBeforeLast(\"abcba\", \"b\") \u003d \"abc\"\n     * StringUtils.substringBeforeLast(\"abc\", \"c\")   \u003d \"ab\"\n     * StringUtils.substringBeforeLast(\"a\", \"a\")     \u003d \"\"\n     * StringUtils.substringBeforeLast(\"a\", \"z\")     \u003d \"a\"\n     * StringUtils.substringBeforeLast(\"a\", null)    \u003d \"a\"\n     * StringUtils.substringBeforeLast(\"a\", \"\")      \u003d \"a\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get a substring from, may be null\n     * @param separator  the String to search for, may be null\n     * @return the substring before the last occurrence of the separator,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1778,col 9)-(line 1780,col 9)",
        "(line 1781,col 9)-(line 1781,col 45)",
        "(line 1782,col 9)-(line 1784,col 9)",
        "(line 1785,col 9)-(line 1785,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.substringAfterLast(java.lang.String, java.lang.String)",
      "begin_line": 1815,
      "end_line": 1827,
      "comment": "\n     * \u003cp\u003eGets the substring after the last occurrence of a separator.\n     * The separator is not returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") string input will return the empty string.\n     * An empty or \u003ccode\u003enull\u003c/code\u003e separator will return the empty string if\n     * the input string is not \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringAfterLast(null, *)      \u003d null\n     * StringUtils.substringAfterLast(\"\", *)        \u003d \"\"\n     * StringUtils.substringAfterLast(*, \"\")        \u003d \"\"\n     * StringUtils.substringAfterLast(*, null)      \u003d \"\"\n     * StringUtils.substringAfterLast(\"abc\", \"a\")   \u003d \"bc\"\n     * StringUtils.substringAfterLast(\"abcba\", \"b\") \u003d \"a\"\n     * StringUtils.substringAfterLast(\"abc\", \"c\")   \u003d \"\"\n     * StringUtils.substringAfterLast(\"a\", \"a\")     \u003d \"\"\n     * StringUtils.substringAfterLast(\"a\", \"z\")     \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to get a substring from, may be null\n     * @param separator  the String to search for, may be null\n     * @return the substring after the last occurrence of the separator,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1816,col 9)-(line 1818,col 9)",
        "(line 1819,col 9)-(line 1821,col 9)",
        "(line 1822,col 9)-(line 1822,col 45)",
        "(line 1823,col 9)-(line 1825,col 9)",
        "(line 1826,col 9)-(line 1826,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.substringBetween(java.lang.String, java.lang.String)",
      "begin_line": 1852,
      "end_line": 1854,
      "comment": "\n     * \u003cp\u003eGets the String that is nested in between two instances of the\n     * same String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e tag returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringBetween(null, *)            \u003d null\n     * StringUtils.substringBetween(\"\", \"\")             \u003d \"\"\n     * StringUtils.substringBetween(\"\", \"tag\")          \u003d null\n     * StringUtils.substringBetween(\"tagabctag\", null)  \u003d null\n     * StringUtils.substringBetween(\"tagabctag\", \"\")    \u003d \"\"\n     * StringUtils.substringBetween(\"tagabctag\", \"tag\") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String containing the substring, may be null\n     * @param tag  the String before and after the substring, may be null\n     * @return the substring, \u003ccode\u003enull\u003c/code\u003e if no match\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1853,col 9)-(line 1853,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.substringBetween(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 1881,
      "end_line": 1893,
      "comment": "\n     * \u003cp\u003eGets the String that is nested in between two Strings.\n     * Only the first match is returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e open/close returns \u003ccode\u003enull\u003c/code\u003e (no match).\n     * An empty (\"\") open/close returns an empty string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.substringBetween(null, *, *)          \u003d null\n     * StringUtils.substringBetween(\"\", \"\", \"\")          \u003d \"\"\n     * StringUtils.substringBetween(\"\", \"\", \"tag\")       \u003d null\n     * StringUtils.substringBetween(\"\", \"tag\", \"tag\")    \u003d null\n     * StringUtils.substringBetween(\"yabcz\", null, null) \u003d null\n     * StringUtils.substringBetween(\"yabcz\", \"\", \"\")     \u003d \"\"\n     * StringUtils.substringBetween(\"yabcz\", \"y\", \"z\")   \u003d \"abc\"\n     * StringUtils.substringBetween(\"yabczyabcz\", \"y\", \"z\")   \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String containing the substring, may be null\n     * @param open  the String before the substring, may be null\n     * @param close  the String after the substring, may be null\n     * @return the substring, \u003ccode\u003enull\u003c/code\u003e if no match\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1882,col 9)-(line 1884,col 9)",
        "(line 1885,col 9)-(line 1885,col 38)",
        "(line 1886,col 9)-(line 1891,col 9)",
        "(line 1892,col 9)-(line 1892,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.getNestedString(java.lang.String, java.lang.String)",
      "begin_line": 1919,
      "end_line": 1921,
      "comment": "\n     * \u003cp\u003eGets the String that is nested in between two instances of the\n     * same String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e tag returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.getNestedString(null, *)            \u003d null\n     * StringUtils.getNestedString(\"\", \"\")             \u003d \"\"\n     * StringUtils.getNestedString(\"\", \"tag\")          \u003d null\n     * StringUtils.getNestedString(\"tagabctag\", null)  \u003d null\n     * StringUtils.getNestedString(\"tagabctag\", \"\")    \u003d \"\"\n     * StringUtils.getNestedString(\"tagabctag\", \"tag\") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String containing nested-string, may be null\n     * @param tag  the String before and after nested-string, may be null\n     * @return the nested String, \u003ccode\u003enull\u003c/code\u003e if no match\n     * @deprecated Use the better named {@link #substringBetween(String, String)}.\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 1920,col 9)-(line 1920,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.getNestedString(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 1949,
      "end_line": 1951,
      "comment": "\n     * \u003cp\u003eGets the String that is nested in between two Strings.\n     * Only the first match is returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e open/close returns \u003ccode\u003enull\u003c/code\u003e (no match).\n     * An empty (\"\") open/close returns an empty string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.getNestedString(null, *, *)          \u003d null\n     * StringUtils.getNestedString(\"\", \"\", \"\")          \u003d \"\"\n     * StringUtils.getNestedString(\"\", \"\", \"tag\")       \u003d null\n     * StringUtils.getNestedString(\"\", \"tag\", \"tag\")    \u003d null\n     * StringUtils.getNestedString(\"yabcz\", null, null) \u003d null\n     * StringUtils.getNestedString(\"yabcz\", \"\", \"\")     \u003d \"\"\n     * StringUtils.getNestedString(\"yabcz\", \"y\", \"z\")   \u003d \"abc\"\n     * StringUtils.getNestedString(\"yabczyabcz\", \"y\", \"z\")   \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String containing nested-string, may be null\n     * @param open  the String before nested-string, may be null\n     * @param close  the String after nested-string, may be null\n     * @return the nested String, \u003ccode\u003enull\u003c/code\u003e if no match\n     * @deprecated Use the better named {@link #substringBetween(String, String, String)}.\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 1950,col 9)-(line 1950,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.split(java.lang.String)",
      "begin_line": 1977,
      "end_line": 1979,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, using whitespace as the\n     * separator.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as one separator.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.split(null)       \u003d null\n     * StringUtils.split(\"\")         \u003d []\n     * StringUtils.split(\"abc def\")  \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\"abc  def\") \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\" abc \")    \u003d [\"abc\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 1978,col 9)-(line 1978,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.split(java.lang.String, char)",
      "begin_line": 2007,
      "end_line": 2009,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator specified.\n     * This is an alternative to using StringTokenizer.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as one separator.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.split(null, *)         \u003d null\n     * StringUtils.split(\"\", *)           \u003d []\n     * StringUtils.split(\"a.b.c\", \u0027.\u0027)    \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.split(\"a..b.c\", \u0027.\u0027)   \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.split(\"a:b:c\", \u0027.\u0027)    \u003d [\"a:b:c\"]\n     * StringUtils.split(\"a\\tb\\nc\", null) \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.split(\"a b c\", \u0027 \u0027)    \u003d [\"a\", \"b\", \"c\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separatorChar  the character used as the delimiter,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2008,col 9)-(line 2008,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.split(java.lang.String, java.lang.String)",
      "begin_line": 2036,
      "end_line": 2038,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separators specified.\n     * This is an alternative to using StringTokenizer.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as one separator.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e separatorChars splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.split(null, *)         \u003d null\n     * StringUtils.split(\"\", *)           \u003d []\n     * StringUtils.split(\"abc def\", null) \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\"abc def\", \" \")  \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\"abc  def\", \" \") \u003d [\"abc\", \"def\"]\n     * StringUtils.split(\"ab:cd:ef\", \":\") \u003d [\"ab\", \"cd\", \"ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separatorChars  the characters used as the delimiters,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 2037,col 9)-(line 2037,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.split(java.lang.String, java.lang.String, int)",
      "begin_line": 2070,
      "end_line": 2072,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array with a maximum length,\n     * separators specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as one separator.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e separatorChars splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf more than \u003ccode\u003emax\u003c/code\u003e delimited substrings are found, the last\n     * returned string includes all characters after the first \u003ccode\u003emax - 1\u003c/code\u003e\n     * returned strings (including separator characters).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.split(null, *, *)            \u003d null\n     * StringUtils.split(\"\", *, *)              \u003d []\n     * StringUtils.split(\"ab de fg\", null, 0)   \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.split(\"ab   de fg\", null, 0) \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.split(\"ab:cd:ef\", \":\", 0)    \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.split(\"ab:cd:ef\", \":\", 2)    \u003d [\"ab\", \"cd:ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separatorChars  the characters used as the delimiters,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @param max  the maximum number of elements to include in the\n     *  array. A zero or negative value implies no limit\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 2071,col 9)-(line 2071,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.splitByWholeSeparator(java.lang.String, java.lang.String)",
      "begin_line": 2097,
      "end_line": 2099,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator string specified.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator(s) will not be included in the returned String array.\n     * Adjacent separators are treated as one separator.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e separator splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitByWholeSeparator(null, *)               \u003d null\n     * StringUtils.splitByWholeSeparator(\"\", *)                 \u003d []\n     * StringUtils.splitByWholeSeparator(\"ab de fg\", null)      \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparator(\"ab   de fg\", null)    \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparator(\"ab:cd:ef\", \":\")       \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitByWholeSeparator(\"ab-!-cd-!-ef\", \"-!-\") \u003d [\"ab\", \"cd\", \"ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separator  String containing the String to be used as a delimiter,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String was input\n     ",
      "child_ranges": [
        "(line 2098,col 9)-(line 2098,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.splitByWholeSeparator(java.lang.String, java.lang.String, int)",
      "begin_line": 2128,
      "end_line": 2183,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator string specified.\n     * Returns a maximum of \u003ccode\u003emax\u003c/code\u003e substrings.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator(s) will not be included in the returned String array.\n     * Adjacent separators are treated as one separator.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e separator splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitByWholeSeparator(null, *, *)               \u003d null\n     * StringUtils.splitByWholeSeparator(\"\", *, *)                 \u003d []\n     * StringUtils.splitByWholeSeparator(\"ab de fg\", null, 0)      \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparator(\"ab   de fg\", null, 0)    \u003d [\"ab\", \"de\", \"fg\"]\n     * StringUtils.splitByWholeSeparator(\"ab:cd:ef\", \":\", 2)       \u003d [\"ab\", \"cd:ef\"]\n     * StringUtils.splitByWholeSeparator(\"ab-!-cd-!-ef\", \"-!-\", 5) \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitByWholeSeparator(\"ab-!-cd-!-ef\", \"-!-\", 2) \u003d [\"ab\", \"cd-!-ef\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be null\n     * @param separator  String containing the String to be used as a delimiter,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @param max  the maximum number of elements to include in the returned\n     *  array. A zero or negative value implies no limit.\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String was input\n     ",
      "child_ranges": [
        "(line 2129,col 9)-(line 2131,col 9)",
        "(line 2133,col 9)-(line 2133,col 32)",
        "(line 2135,col 9)-(line 2137,col 9)",
        "(line 2139,col 9)-(line 2142,col 9)",
        "(line 2145,col 9)-(line 2145,col 50)",
        "(line 2147,col 9)-(line 2147,col 48)",
        "(line 2148,col 9)-(line 2148,col 36)",
        "(line 2149,col 9)-(line 2149,col 21)",
        "(line 2150,col 9)-(line 2150,col 21)",
        "(line 2151,col 9)-(line 2180,col 9)",
        "(line 2182,col 9)-(line 2182,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.splitPreserveAllTokens(java.lang.String)",
      "begin_line": 2211,
      "end_line": 2213,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, using whitespace as the\n     * separator, preserving all tokens, including empty tokens created by \n     * adjacent separators. This is an alternative to using StringTokenizer.\n     * Whitespace is defined by {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitPreserveAllTokens(null)       \u003d null\n     * StringUtils.splitPreserveAllTokens(\"\")         \u003d []\n     * StringUtils.splitPreserveAllTokens(\"abc def\")  \u003d [\"abc\", \"def\"]\n     * StringUtils.splitPreserveAllTokens(\"abc  def\") \u003d [\"abc\", \"\", \"def\"]\n     * StringUtils.splitPreserveAllTokens(\" abc \")    \u003d [\"\", \"abc\", \"\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be \u003ccode\u003enull\u003c/code\u003e\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2212,col 9)-(line 2212,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.splitPreserveAllTokens(java.lang.String, char)",
      "begin_line": 2247,
      "end_line": 2249,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separator specified,\n     * preserving all tokens, including empty tokens created by adjacent\n     * separators. This is an alternative to using StringTokenizer.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitPreserveAllTokens(null, *)         \u003d null\n     * StringUtils.splitPreserveAllTokens(\"\", *)           \u003d []\n     * StringUtils.splitPreserveAllTokens(\"a.b.c\", \u0027.\u0027)    \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"a..b.c\", \u0027.\u0027)   \u003d [\"a\", \"\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"a:b:c\", \u0027.\u0027)    \u003d [\"a:b:c\"]\n     * StringUtils.splitPreserveAllTokens(\"a\\tb\\nc\", null) \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"a b c\", \u0027 \u0027)    \u003d [\"a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"a b c \", \u0027 \u0027)   \u003d [\"a\", \"b\", \"c\", \"\"]\n     * StringUtils.splitPreserveAllTokens(\"a b c  \", \u0027 \u0027)   \u003d [\"a\", \"b\", \"c\", \"\", \"\"]\n     * StringUtils.splitPreserveAllTokens(\" a b c\", \u0027 \u0027)   \u003d [\"\", a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\"  a b c\", \u0027 \u0027)  \u003d [\"\", \"\", a\", \"b\", \"c\"]\n     * StringUtils.splitPreserveAllTokens(\" a b c \", \u0027 \u0027)  \u003d [\"\", a\", \"b\", \"c\", \"\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param separatorChar  the character used as the delimiter,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2248,col 9)-(line 2248,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.splitWorker(java.lang.String, char, boolean)",
      "begin_line": 2263,
      "end_line": 2296,
      "comment": "\n     * Performs the logic for the \u003ccode\u003esplit\u003c/code\u003e and \n     * \u003ccode\u003esplitPreserveAllTokens\u003c/code\u003e methods that do not return a\n     * maximum array length.\n     *\n     * @param str  the String to parse, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param separatorChar the separate character\n     * @param preserveAllTokens if \u003ccode\u003etrue\u003c/code\u003e, adjacent separators are\n     * treated as empty token separators; if \u003ccode\u003efalse\u003c/code\u003e, adjacent\n     * separators are treated as one separator.\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 2266,col 9)-(line 2268,col 9)",
        "(line 2269,col 9)-(line 2269,col 31)",
        "(line 2270,col 9)-(line 2272,col 9)",
        "(line 2273,col 9)-(line 2273,col 36)",
        "(line 2274,col 9)-(line 2274,col 29)",
        "(line 2275,col 9)-(line 2275,col 30)",
        "(line 2276,col 9)-(line 2276,col 34)",
        "(line 2277,col 9)-(line 2291,col 9)",
        "(line 2292,col 9)-(line 2294,col 9)",
        "(line 2295,col 9)-(line 2295,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.splitPreserveAllTokens(java.lang.String, java.lang.String)",
      "begin_line": 2331,
      "end_line": 2333,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array, separators specified, \n     * preserving all tokens, including empty tokens created by adjacent\n     * separators. This is an alternative to using StringTokenizer.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * For more control over the split use the StrTokenizer class.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e separatorChars splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitPreserveAllTokens(null, *)           \u003d null\n     * StringUtils.splitPreserveAllTokens(\"\", *)             \u003d []\n     * StringUtils.splitPreserveAllTokens(\"abc def\", null)   \u003d [\"abc\", \"def\"]\n     * StringUtils.splitPreserveAllTokens(\"abc def\", \" \")    \u003d [\"abc\", \"def\"]\n     * StringUtils.splitPreserveAllTokens(\"abc  def\", \" \")   \u003d [\"abc\", \"\", def\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef\", \":\")   \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef:\", \":\")  \u003d [\"ab\", \"cd\", \"ef\", \"\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef::\", \":\") \u003d [\"ab\", \"cd\", \"ef\", \"\", \"\"]\n     * StringUtils.splitPreserveAllTokens(\"ab::cd:ef\", \":\")  \u003d [\"ab\", \"\", cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\":cd:ef\", \":\")     \u003d [\"\", cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"::cd:ef\", \":\")    \u003d [\"\", \"\", cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\":cd:ef:\", \":\")    \u003d [\"\", cd\", \"ef\", \"\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param separatorChars  the characters used as the delimiters,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2332,col 9)-(line 2332,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.splitPreserveAllTokens(java.lang.String, java.lang.String, int)",
      "begin_line": 2371,
      "end_line": 2373,
      "comment": "\n     * \u003cp\u003eSplits the provided text into an array with a maximum length,\n     * separators specified, preserving all tokens, including empty tokens \n     * created by adjacent separators.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe separator is not included in the returned String array.\n     * Adjacent separators are treated as separators for empty tokens.\n     * Adjacent separators are treated as one separator.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A \u003ccode\u003enull\u003c/code\u003e separatorChars splits on whitespace.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf more than \u003ccode\u003emax\u003c/code\u003e delimited substrings are found, the last\n     * returned string includes all characters after the first \u003ccode\u003emax - 1\u003c/code\u003e\n     * returned strings (including separator characters).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.splitPreserveAllTokens(null, *, *)            \u003d null\n     * StringUtils.splitPreserveAllTokens(\"\", *, *)              \u003d []\n     * StringUtils.splitPreserveAllTokens(\"ab de fg\", null, 0)   \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab   de fg\", null, 0) \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef\", \":\", 0)    \u003d [\"ab\", \"cd\", \"ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab:cd:ef\", \":\", 2)    \u003d [\"ab\", \"cd:ef\"]\n     * StringUtils.splitPreserveAllTokens(\"ab   de fg\", null, 2) \u003d [\"ab\", \"  de fg\"]\n     * StringUtils.splitPreserveAllTokens(\"ab   de fg\", null, 3) \u003d [\"ab\", \"\", \" de fg\"]\n     * StringUtils.splitPreserveAllTokens(\"ab   de fg\", null, 4) \u003d [\"ab\", \"\", \"\", \"de fg\"]\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to parse, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param separatorChars  the characters used as the delimiters,\n     *  \u003ccode\u003enull\u003c/code\u003e splits on whitespace\n     * @param max  the maximum number of elements to include in the\n     *  array. A zero or negative value implies no limit\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2372,col 9)-(line 2372,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.splitWorker(java.lang.String, java.lang.String, int, boolean)",
      "begin_line": 2389,
      "end_line": 2475,
      "comment": "\n     * Performs the logic for the \u003ccode\u003esplit\u003c/code\u003e and \n     * \u003ccode\u003esplitPreserveAllTokens\u003c/code\u003e methods that return a maximum array \n     * length.\n     *\n     * @param str  the String to parse, may be \u003ccode\u003enull\u003c/code\u003e\n     * @param separatorChars the separate character\n     * @param max  the maximum number of elements to include in the\n     *  array. A zero or negative value implies no limit.\n     * @param preserveAllTokens if \u003ccode\u003etrue\u003c/code\u003e, adjacent separators are\n     * treated as empty token separators; if \u003ccode\u003efalse\u003c/code\u003e, adjacent\n     * separators are treated as one separator.\n     * @return an array of parsed Strings, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 2394,col 9)-(line 2396,col 9)",
        "(line 2397,col 9)-(line 2397,col 31)",
        "(line 2398,col 9)-(line 2400,col 9)",
        "(line 2401,col 9)-(line 2401,col 36)",
        "(line 2402,col 9)-(line 2402,col 26)",
        "(line 2403,col 9)-(line 2403,col 29)",
        "(line 2404,col 9)-(line 2404,col 30)",
        "(line 2405,col 9)-(line 2405,col 34)",
        "(line 2406,col 9)-(line 2470,col 9)",
        "(line 2471,col 9)-(line 2473,col 9)",
        "(line 2474,col 9)-(line 2474,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.concatenate(java.lang.Object[])",
      "begin_line": 2497,
      "end_line": 2499,
      "comment": "\n     * \u003cp\u003eConcatenates elements of an array into a single String.\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.concatenate(null)            \u003d null\n     * StringUtils.concatenate([])              \u003d \"\"\n     * StringUtils.concatenate([null])          \u003d \"\"\n     * StringUtils.concatenate([\"a\", \"b\", \"c\"]) \u003d \"abc\"\n     * StringUtils.concatenate([null, \"\", \"a\"]) \u003d \"a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to concatenate, may be null\n     * @return the concatenated String, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @deprecated Use the better named {@link #join(Object[])} instead.\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 2498,col 9)-(line 2498,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.join(java.lang.Object[])",
      "begin_line": 2521,
      "end_line": 2523,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo separator is added to the joined String.\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null)            \u003d null\n     * StringUtils.join([])              \u003d \"\"\n     * StringUtils.join([null])          \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"]) \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"]) \u003d \"a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to join together, may be null\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2522,col 9)-(line 2522,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.join(java.lang.Object[], char)",
      "begin_line": 2547,
      "end_line": 2553,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null, *)               \u003d null\n     * StringUtils.join([], *)                 \u003d \"\"\n     * StringUtils.join([null], *)             \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \u0027;\u0027)  \u003d \"a;b;c\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], null) \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"], \u0027;\u0027)  \u003d \";;a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to join together, may be null\n     * @param separator  the separator character to use\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2548,col 9)-(line 2550,col 9)",
        "(line 2552,col 9)-(line 2552,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.join(java.lang.Object[], char, int, int)",
      "begin_line": 2581,
      "end_line": 2602,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null, *)               \u003d null\n     * StringUtils.join([], *)                 \u003d \"\"\n     * StringUtils.join([null], *)             \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \u0027;\u0027)  \u003d \"a;b;c\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], null) \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"], \u0027;\u0027)  \u003d \";;a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to join together, may be null\n     * @param separator  the separator character to use\n     * @param startIndex the first index to start joining from.  It is\n     * an error to pass in an end index past the end of the array\n     * @param endIndex the index to stop joining from (exclusive). It is\n     * an error to pass in an end index past the end of the array\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null array input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2582,col 9)-(line 2584,col 9)",
        "(line 2585,col 9)-(line 2585,col 46)",
        "(line 2586,col 9)-(line 2588,col 9)",
        "(line 2590,col 9)-(line 2590,col 98)",
        "(line 2591,col 9)-(line 2591,col 53)",
        "(line 2593,col 9)-(line 2600,col 9)",
        "(line 2601,col 9)-(line 2601,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.join(java.lang.Object[], java.lang.String)",
      "begin_line": 2628,
      "end_line": 2633,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * A \u003ccode\u003enull\u003c/code\u003e separator is the same as an empty String (\"\").\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null, *)                \u003d null\n     * StringUtils.join([], *)                  \u003d \"\"\n     * StringUtils.join([null], *)              \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \"--\")  \u003d \"a--b--c\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], null)  \u003d \"abc\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \"\")    \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"], \u0027,\u0027)   \u003d \",,a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to join together, may be null\n     * @param separator  the separator character to use, null treated as \"\"\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2629,col 9)-(line 2631,col 9)",
        "(line 2632,col 9)-(line 2632,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.join(java.lang.Object[], java.lang.String, int, int)",
      "begin_line": 2662,
      "end_line": 2691,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided array into a single String\n     * containing the provided list of elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * A \u003ccode\u003enull\u003c/code\u003e separator is the same as an empty String (\"\").\n     * Null objects or empty strings within the array are represented by\n     * empty strings.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.join(null, *)                \u003d null\n     * StringUtils.join([], *)                  \u003d \"\"\n     * StringUtils.join([null], *)              \u003d \"\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \"--\")  \u003d \"a--b--c\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], null)  \u003d \"abc\"\n     * StringUtils.join([\"a\", \"b\", \"c\"], \"\")    \u003d \"abc\"\n     * StringUtils.join([null, \"\", \"a\"], \u0027,\u0027)   \u003d \",,a\"\n     * \u003c/pre\u003e\n     *\n     * @param array  the array of values to join together, may be null\n     * @param separator  the separator character to use, null treated as \"\"\n     * @param startIndex the first index to start joining from.  It is\n     * an error to pass in an end index past the end of the array\n     * @param endIndex the index to stop joining from (exclusive). It is\n     * an error to pass in an end index past the end of the array\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null array input\n     ",
      "child_ranges": [
        "(line 2663,col 9)-(line 2665,col 9)",
        "(line 2666,col 9)-(line 2668,col 9)",
        "(line 2672,col 9)-(line 2672,col 46)",
        "(line 2673,col 9)-(line 2675,col 9)",
        "(line 2677,col 9)-(line 2678,col 46)",
        "(line 2680,col 9)-(line 2680,col 53)",
        "(line 2682,col 9)-(line 2689,col 9)",
        "(line 2690,col 9)-(line 2690,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.join(java.util.Iterator, char)",
      "begin_line": 2707,
      "end_line": 2736,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided \u003ccode\u003eIterator\u003c/code\u003e into\n     * a single String containing the provided elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list. Null objects or empty\n     * strings within the iteration are represented by empty strings.\u003c/p\u003e\n     *\n     * \u003cp\u003eSee the examples here: {@link #join(Object[],char)}. \u003c/p\u003e\n     *\n     * @param iterator  the \u003ccode\u003eIterator\u003c/code\u003e of values to join together, may be null\n     * @param separator  the separator character to use\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null iterator input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 2710,col 9)-(line 2712,col 9)",
        "(line 2713,col 9)-(line 2715,col 9)",
        "(line 2716,col 9)-(line 2716,col 39)",
        "(line 2717,col 9)-(line 2719,col 9)",
        "(line 2722,col 9)-(line 2722,col 49)",
        "(line 2723,col 9)-(line 2725,col 9)",
        "(line 2727,col 9)-(line 2733,col 9)",
        "(line 2735,col 9)-(line 2735,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.join(java.util.Iterator, java.lang.String)",
      "begin_line": 2751,
      "end_line": 2781,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided \u003ccode\u003eIterator\u003c/code\u003e into\n     * a single String containing the provided elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * A \u003ccode\u003enull\u003c/code\u003e separator is the same as an empty String (\"\").\u003c/p\u003e\n     *\n     * \u003cp\u003eSee the examples here: {@link #join(Object[],String)}. \u003c/p\u003e\n     *\n     * @param iterator  the \u003ccode\u003eIterator\u003c/code\u003e of values to join together, may be null\n     * @param separator  the separator character to use, null treated as \"\"\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null iterator input\n     ",
      "child_ranges": [
        "(line 2754,col 9)-(line 2756,col 9)",
        "(line 2757,col 9)-(line 2759,col 9)",
        "(line 2760,col 9)-(line 2760,col 39)",
        "(line 2761,col 9)-(line 2763,col 9)",
        "(line 2766,col 9)-(line 2766,col 49)",
        "(line 2767,col 9)-(line 2769,col 9)",
        "(line 2771,col 9)-(line 2779,col 9)",
        "(line 2780,col 9)-(line 2780,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.join(java.util.Collection, char)",
      "begin_line": 2797,
      "end_line": 2802,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided \u003ccode\u003eCollection\u003c/code\u003e into\n     * a single String containing the provided elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list. Null objects or empty\n     * strings within the iteration are represented by empty strings.\u003c/p\u003e\n     *\n     * \u003cp\u003eSee the examples here: {@link #join(Object[],char)}. \u003c/p\u003e\n     *\n     * @param collection  the \u003ccode\u003eCollection\u003c/code\u003e of values to join together, may be null\n     * @param separator  the separator character to use\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null iterator input\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 2798,col 9)-(line 2800,col 9)",
        "(line 2801,col 9)-(line 2801,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.join(java.util.Collection, java.lang.String)",
      "begin_line": 2818,
      "end_line": 2823,
      "comment": "\n     * \u003cp\u003eJoins the elements of the provided \u003ccode\u003eCollection\u003c/code\u003e into\n     * a single String containing the provided elements.\u003c/p\u003e\n     *\n     * \u003cp\u003eNo delimiter is added before or after the list.\n     * A \u003ccode\u003enull\u003c/code\u003e separator is the same as an empty String (\"\").\u003c/p\u003e\n     *\n     * \u003cp\u003eSee the examples here: {@link #join(Object[],String)}. \u003c/p\u003e\n     *\n     * @param collection  the \u003ccode\u003eCollection\u003c/code\u003e of values to join together, may be null\n     * @param separator  the separator character to use, null treated as \"\"\n     * @return the joined String, \u003ccode\u003enull\u003c/code\u003e if null iterator input\n     * @since 2.3\n     ",
      "child_ranges": [
        "(line 2819,col 9)-(line 2821,col 9)",
        "(line 2822,col 9)-(line 2822,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.deleteSpaces(java.lang.String)",
      "begin_line": 2853,
      "end_line": 2858,
      "comment": "\n     * \u003cp\u003eDeletes all \u0027space\u0027 characters from a String as defined by\n     * {@link Character#isSpace(char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is the only StringUtils method that uses the\n     * \u003ccode\u003eisSpace\u003c/code\u003e definition. You are advised to use\n     * {@link #deleteWhitespace(String)} instead as whitespace is much\n     * better localized.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.deleteSpaces(null)           \u003d null\n     * StringUtils.deleteSpaces(\"\")             \u003d \"\"\n     * StringUtils.deleteSpaces(\"abc\")          \u003d \"abc\"\n     * StringUtils.deleteSpaces(\" \\t  abc \\n \") \u003d \"abc\"\n     * StringUtils.deleteSpaces(\"ab  c\")        \u003d \"abc\"\n     * StringUtils.deleteSpaces(\"a\\nb\\tc     \") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eSpaces are defined as \u003ccode\u003e{\u0027 \u0027, \u0027\\t\u0027, \u0027\\r\u0027, \u0027\\n\u0027, \u0027\\b\u0027}\u003c/code\u003e\n     * in line with the deprecated \u003ccode\u003eisSpace\u003c/code\u003e method.\u003c/p\u003e\n     *\n     * @param str  the String to delete spaces from, may be null\n     * @return the String without \u0027spaces\u0027, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @deprecated Use the better localized {@link #deleteWhitespace(String)}.\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 2854,col 9)-(line 2856,col 9)",
        "(line 2857,col 9)-(line 2857,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.deleteWhitespace(java.lang.String)",
      "begin_line": 2874,
      "end_line": 2890,
      "comment": "\n     * \u003cp\u003eDeletes all whitespaces from a String as defined by\n     * {@link Character#isWhitespace(char)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.deleteWhitespace(null)         \u003d null\n     * StringUtils.deleteWhitespace(\"\")           \u003d \"\"\n     * StringUtils.deleteWhitespace(\"abc\")        \u003d \"abc\"\n     * StringUtils.deleteWhitespace(\"   ab  c  \") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to delete whitespace from, may be null\n     * @return the String without whitespaces, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 2875,col 9)-(line 2877,col 9)",
        "(line 2878,col 9)-(line 2878,col 30)",
        "(line 2879,col 9)-(line 2879,col 34)",
        "(line 2880,col 9)-(line 2880,col 22)",
        "(line 2881,col 9)-(line 2885,col 9)",
        "(line 2886,col 9)-(line 2888,col 9)",
        "(line 2889,col 9)-(line 2889,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.removeStart(java.lang.String, java.lang.String)",
      "begin_line": 2918,
      "end_line": 2926,
      "comment": "\n     * \u003cp\u003eRemoves a substring only if it is at the begining of a source string,\n     * otherwise returns the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e source string will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") source string will return the empty string.\n     * A \u003ccode\u003enull\u003c/code\u003e search string will return the source string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.removeStart(null, *)      \u003d null\n     * StringUtils.removeStart(\"\", *)        \u003d \"\"\n     * StringUtils.removeStart(*, null)      \u003d *\n     * StringUtils.removeStart(\"www.domain.com\", \"www.\")   \u003d \"domain.com\"\n     * StringUtils.removeStart(\"domain.com\", \"www.\")       \u003d \"domain.com\"\n     * StringUtils.removeStart(\"www.domain.com\", \"domain\") \u003d \"www.domain.com\"\n     * StringUtils.removeStart(\"abc\", \"\")    \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the String to search for and remove, may be null\n     * @return the substring with the string removed if found,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2919,col 9)-(line 2921,col 9)",
        "(line 2922,col 9)-(line 2924,col 9)",
        "(line 2925,col 9)-(line 2925,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.removeEnd(java.lang.String, java.lang.String)",
      "begin_line": 2952,
      "end_line": 2960,
      "comment": "\n     * \u003cp\u003eRemoves a substring only if it is at the end of a source string,\n     * otherwise returns the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e source string will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") source string will return the empty string.\n     * A \u003ccode\u003enull\u003c/code\u003e search string will return the source string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.removeEnd(null, *)      \u003d null\n     * StringUtils.removeEnd(\"\", *)        \u003d \"\"\n     * StringUtils.removeEnd(*, null)      \u003d *\n     * StringUtils.removeEnd(\"www.domain.com\", \".com.\")  \u003d \"www.domain.com.\"\n     * StringUtils.removeEnd(\"www.domain.com\", \".com\")   \u003d \"www.domain\"\n     * StringUtils.removeEnd(\"www.domain.com\", \"domain\") \u003d \"www.domain.com\"\n     * StringUtils.removeEnd(\"abc\", \"\")    \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the String to search for and remove, may be null\n     * @return the substring with the string removed if found,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2953,col 9)-(line 2955,col 9)",
        "(line 2956,col 9)-(line 2958,col 9)",
        "(line 2959,col 9)-(line 2959,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.remove(java.lang.String, java.lang.String)",
      "begin_line": 2985,
      "end_line": 2990,
      "comment": "\n     * \u003cp\u003eRemoves all occurances of a substring from within the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e source string will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") source string will return the empty string.\n     * A \u003ccode\u003enull\u003c/code\u003e remove string will return the source string.\n     * An empty (\"\") remove string will return the source string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.remove(null, *)        \u003d null\n     * StringUtils.remove(\"\", *)          \u003d \"\"\n     * StringUtils.remove(*, null)        \u003d *\n     * StringUtils.remove(*, \"\")          \u003d *\n     * StringUtils.remove(\"queued\", \"ue\") \u003d \"qd\"\n     * StringUtils.remove(\"queued\", \"zz\") \u003d \"queued\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the String to search for and remove, may be null\n     * @return the substring with the string removed if found,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 2986,col 9)-(line 2988,col 9)",
        "(line 2989,col 9)-(line 2989,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.remove(java.lang.String, char)",
      "begin_line": 3011,
      "end_line": 3023,
      "comment": "\n     * \u003cp\u003eRemoves all occurances of a character from within the source string.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e source string will return \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") source string will return the empty string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.remove(null, *)       \u003d null\n     * StringUtils.remove(\"\", *)         \u003d \"\"\n     * StringUtils.remove(\"queued\", \u0027u\u0027) \u003d \"qeed\"\n     * StringUtils.remove(\"queued\", \u0027z\u0027) \u003d \"queued\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the source String to search, may be null\n     * @param remove  the char to search for and remove, may be null\n     * @return the substring with the char removed if found,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 3012,col 9)-(line 3014,col 9)",
        "(line 3015,col 9)-(line 3015,col 41)",
        "(line 3016,col 9)-(line 3016,col 20)",
        "(line 3017,col 9)-(line 3021,col 9)",
        "(line 3022,col 9)-(line 3022,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.replaceOnce(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 3050,
      "end_line": 3052,
      "comment": "\n     * \u003cp\u003eReplaces a String with another String inside a larger String, once.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e reference passed to this method is a no-op.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replaceOnce(null, *, *)        \u003d null\n     * StringUtils.replaceOnce(\"\", *, *)          \u003d \"\"\n     * StringUtils.replaceOnce(\"any\", null, *)    \u003d \"any\"\n     * StringUtils.replaceOnce(\"any\", *, null)    \u003d \"any\"\n     * StringUtils.replaceOnce(\"any\", \"\", *)      \u003d \"any\"\n     * StringUtils.replaceOnce(\"aba\", \"a\", null)  \u003d \"aba\"\n     * StringUtils.replaceOnce(\"aba\", \"a\", \"\")    \u003d \"ba\"\n     * StringUtils.replaceOnce(\"aba\", \"a\", \"z\")   \u003d \"zba\"\n     * \u003c/pre\u003e\n     *\n     * @see #replace(String text, String repl, String with, int max)\n     * @param text  text to search and replace in, may be null\n     * @param repl  the String to search for, may be null\n     * @param with  the String to replace with, may be null\n     * @return the text with any replacements processed,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 3051,col 9)-(line 3051,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.replace(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 3077,
      "end_line": 3079,
      "comment": "\n     * \u003cp\u003eReplaces all occurrences of a String within another String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e reference passed to this method is a no-op.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replace(null, *, *)        \u003d null\n     * StringUtils.replace(\"\", *, *)          \u003d \"\"\n     * StringUtils.replace(\"any\", null, *)    \u003d \"any\"\n     * StringUtils.replace(\"any\", *, null)    \u003d \"any\"\n     * StringUtils.replace(\"any\", \"\", *)      \u003d \"any\"\n     * StringUtils.replace(\"aba\", \"a\", null)  \u003d \"aba\"\n     * StringUtils.replace(\"aba\", \"a\", \"\")    \u003d \"b\"\n     * StringUtils.replace(\"aba\", \"a\", \"z\")   \u003d \"zbz\"\n     * \u003c/pre\u003e\n     *\n     * @see #replace(String text, String repl, String with, int max)\n     * @param text  text to search and replace in, may be null\n     * @param repl  the String to search for, may be null\n     * @param with  the String to replace with, may be null\n     * @return the text with any replacements processed,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 3078,col 9)-(line 3078,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.replace(java.lang.String, java.lang.String, java.lang.String, int)",
      "begin_line": 3109,
      "end_line": 3133,
      "comment": "\n     * \u003cp\u003eReplaces a String with another String inside a larger String,\n     * for the first \u003ccode\u003emax\u003c/code\u003e values of the search String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e reference passed to this method is a no-op.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replace(null, *, *, *)         \u003d null\n     * StringUtils.replace(\"\", *, *, *)           \u003d \"\"\n     * StringUtils.replace(\"any\", null, *, *)     \u003d \"any\"\n     * StringUtils.replace(\"any\", *, null, *)     \u003d \"any\"\n     * StringUtils.replace(\"any\", \"\", *, *)       \u003d \"any\"\n     * StringUtils.replace(\"any\", *, *, 0)        \u003d \"any\"\n     * StringUtils.replace(\"abaa\", \"a\", null, -1) \u003d \"abaa\"\n     * StringUtils.replace(\"abaa\", \"a\", \"\", -1)   \u003d \"b\"\n     * StringUtils.replace(\"abaa\", \"a\", \"z\", 0)   \u003d \"abaa\"\n     * StringUtils.replace(\"abaa\", \"a\", \"z\", 1)   \u003d \"zbaa\"\n     * StringUtils.replace(\"abaa\", \"a\", \"z\", 2)   \u003d \"zbza\"\n     * StringUtils.replace(\"abaa\", \"a\", \"z\", -1)  \u003d \"zbzz\"\n     * \u003c/pre\u003e\n     *\n     * @param text  text to search and replace in, may be null\n     * @param repl  the String to search for, may be null\n     * @param with  the String to replace with, may be null\n     * @param max  maximum number of values to replace, or \u003ccode\u003e-1\u003c/code\u003e if no maximum\n     * @return the text with any replacements processed,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 3110,col 9)-(line 3112,col 9)",
        "(line 3113,col 9)-(line 3113,col 22)",
        "(line 3114,col 9)-(line 3114,col 44)",
        "(line 3115,col 9)-(line 3117,col 9)",
        "(line 3118,col 9)-(line 3118,col 39)",
        "(line 3119,col 9)-(line 3119,col 50)",
        "(line 3120,col 9)-(line 3120,col 49)",
        "(line 3121,col 9)-(line 3121,col 59)",
        "(line 3122,col 9)-(line 3122,col 70)",
        "(line 3123,col 9)-(line 3130,col 9)",
        "(line 3131,col 9)-(line 3131,col 42)",
        "(line 3132,col 9)-(line 3132,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.replaceChars(java.lang.String, char, char)",
      "begin_line": 3157,
      "end_line": 3162,
      "comment": "\n     * \u003cp\u003eReplaces all occurrences of a character in a String with another.\n     * This is a null-safe version of {@link String#replace(char, char)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input returns \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") string input returns an empty string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replaceChars(null, *, *)        \u003d null\n     * StringUtils.replaceChars(\"\", *, *)          \u003d \"\"\n     * StringUtils.replaceChars(\"abcba\", \u0027b\u0027, \u0027y\u0027) \u003d \"aycya\"\n     * StringUtils.replaceChars(\"abcba\", \u0027z\u0027, \u0027y\u0027) \u003d \"abcba\"\n     * \u003c/pre\u003e\n     *\n     * @param str  String to replace characters in, may be null\n     * @param searchChar  the character to search for, may be null\n     * @param replaceChar  the character to replace, may be null\n     * @return modified String, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 3158,col 9)-(line 3160,col 9)",
        "(line 3161,col 9)-(line 3161,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.replaceChars(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 3200,
      "end_line": 3228,
      "comment": "\n     * \u003cp\u003eReplaces multiple characters in a String in one go.\n     * This method can also be used to delete characters.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example:\u003cbr /\u003e\n     * \u003ccode\u003ereplaceChars(\u0026quot;hello\u0026quot;, \u0026quot;ho\u0026quot;, \u0026quot;jy\u0026quot;) \u003d jelly\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input returns \u003ccode\u003enull\u003c/code\u003e.\n     * An empty (\"\") string input returns an empty string.\n     * A null or empty set of search characters returns the input string.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe length of the search characters should normally equal the length\n     * of the replace characters.\n     * If the search characters is longer, then the extra search characters\n     * are deleted.\n     * If the search characters is shorter, then the extra replace characters\n     * are ignored.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.replaceChars(null, *, *)           \u003d null\n     * StringUtils.replaceChars(\"\", *, *)             \u003d \"\"\n     * StringUtils.replaceChars(\"abc\", null, *)       \u003d \"abc\"\n     * StringUtils.replaceChars(\"abc\", \"\", *)         \u003d \"abc\"\n     * StringUtils.replaceChars(\"abc\", \"b\", null)     \u003d \"ac\"\n     * StringUtils.replaceChars(\"abc\", \"b\", \"\")       \u003d \"ac\"\n     * StringUtils.replaceChars(\"abcba\", \"bc\", \"yz\")  \u003d \"ayzya\"\n     * StringUtils.replaceChars(\"abcba\", \"bc\", \"y\")   \u003d \"ayya\"\n     * StringUtils.replaceChars(\"abcba\", \"bc\", \"yzx\") \u003d \"ayzya\"\n     * \u003c/pre\u003e\n     *\n     * @param str  String to replace characters in, may be null\n     * @param searchChars  a set of characters to search for, may be null\n     * @param replaceChars  a set of characters to replace, may be null\n     * @return modified String, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 3201,col 9)-(line 3203,col 9)",
        "(line 3204,col 9)-(line 3206,col 9)",
        "(line 3207,col 9)-(line 3207,col 33)",
        "(line 3208,col 9)-(line 3208,col 55)",
        "(line 3209,col 9)-(line 3209,col 37)",
        "(line 3210,col 9)-(line 3210,col 55)",
        "(line 3211,col 9)-(line 3222,col 9)",
        "(line 3223,col 9)-(line 3227,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.overlayString(java.lang.String, java.lang.String, int, int)",
      "begin_line": 3257,
      "end_line": 3263,
      "comment": "\n     * \u003cp\u003eOverlays part of a String with another String.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.overlayString(null, *, *, *)           \u003d NullPointerException\n     * StringUtils.overlayString(*, null, *, *)           \u003d NullPointerException\n     * StringUtils.overlayString(\"\", \"abc\", 0, 0)         \u003d \"abc\"\n     * StringUtils.overlayString(\"abcdef\", null, 2, 4)    \u003d \"abef\"\n     * StringUtils.overlayString(\"abcdef\", \"\", 2, 4)      \u003d \"abef\"\n     * StringUtils.overlayString(\"abcdef\", \"zzzz\", 2, 4)  \u003d \"abzzzzef\"\n     * StringUtils.overlayString(\"abcdef\", \"zzzz\", 4, 2)  \u003d \"abcdzzzzcdef\"\n     * StringUtils.overlayString(\"abcdef\", \"zzzz\", -1, 4) \u003d IndexOutOfBoundsException\n     * StringUtils.overlayString(\"abcdef\", \"zzzz\", 2, 8)  \u003d IndexOutOfBoundsException\n     * \u003c/pre\u003e\n     *\n     * @param text  the String to do overlaying in, may be null\n     * @param overlay  the String to overlay, may be null\n     * @param start  the position to start overlaying at, must be valid\n     * @param end  the position to stop overlaying before, must be valid\n     * @return overlayed String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @throws NullPointerException if text or overlay is null\n     * @throws IndexOutOfBoundsException if either position is invalid\n     * @deprecated Use better named {@link #overlay(String, String, int, int)} instead.\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 3258,col 9)-(line 3262,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.overlay(java.lang.String, java.lang.String, int, int)",
      "begin_line": 3294,
      "end_line": 3324,
      "comment": "\n     * \u003cp\u003eOverlays part of a String with another String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e string input returns \u003ccode\u003enull\u003c/code\u003e.\n     * A negative index is treated as zero.\n     * An index greater than the string length is treated as the string length.\n     * The start index is always the smaller of the two indices.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.overlay(null, *, *, *)            \u003d null\n     * StringUtils.overlay(\"\", \"abc\", 0, 0)          \u003d \"abc\"\n     * StringUtils.overlay(\"abcdef\", null, 2, 4)     \u003d \"abef\"\n     * StringUtils.overlay(\"abcdef\", \"\", 2, 4)       \u003d \"abef\"\n     * StringUtils.overlay(\"abcdef\", \"\", 4, 2)       \u003d \"abef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", 2, 4)   \u003d \"abzzzzef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", 4, 2)   \u003d \"abzzzzef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", -1, 4)  \u003d \"zzzzef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", 2, 8)   \u003d \"abzzzz\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", -2, -3) \u003d \"zzzzabcdef\"\n     * StringUtils.overlay(\"abcdef\", \"zzzz\", 8, 10)  \u003d \"abcdefzzzz\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to do overlaying in, may be null\n     * @param overlay  the String to overlay, may be null\n     * @param start  the position to start overlaying at\n     * @param end  the position to stop overlaying before\n     * @return overlayed String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 3295,col 9)-(line 3297,col 9)",
        "(line 3298,col 9)-(line 3300,col 9)",
        "(line 3301,col 9)-(line 3301,col 31)",
        "(line 3302,col 9)-(line 3304,col 9)",
        "(line 3305,col 9)-(line 3307,col 9)",
        "(line 3308,col 9)-(line 3310,col 9)",
        "(line 3311,col 9)-(line 3313,col 9)",
        "(line 3314,col 9)-(line 3318,col 9)",
        "(line 3319,col 9)-(line 3323,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.chomp(java.lang.String)",
      "begin_line": 3353,
      "end_line": 3378,
      "comment": "\n     * \u003cp\u003eRemoves one newline from end of a String if it\u0027s there,\n     * otherwise leave it alone.  A newline is \u0026quot;\u003ccode\u003e\\n\u003c/code\u003e\u0026quot;,\n     * \u0026quot;\u003ccode\u003e\\r\u003c/code\u003e\u0026quot;, or \u0026quot;\u003ccode\u003e\\r\\n\u003c/code\u003e\u0026quot;.\u003c/p\u003e\n     *\n     * \u003cp\u003eNOTE: This method changed in 2.0.\n     * It now more closely matches Perl chomp.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.chomp(null)          \u003d null\n     * StringUtils.chomp(\"\")            \u003d \"\"\n     * StringUtils.chomp(\"abc \\r\")      \u003d \"abc \"\n     * StringUtils.chomp(\"abc\\n\")       \u003d \"abc\"\n     * StringUtils.chomp(\"abc\\r\\n\")     \u003d \"abc\"\n     * StringUtils.chomp(\"abc\\r\\n\\r\\n\") \u003d \"abc\\r\\n\"\n     * StringUtils.chomp(\"abc\\n\\r\")     \u003d \"abc\\n\"\n     * StringUtils.chomp(\"abc\\n\\rabc\")  \u003d \"abc\\n\\rabc\"\n     * StringUtils.chomp(\"\\r\")          \u003d \"\"\n     * StringUtils.chomp(\"\\n\")          \u003d \"\"\n     * StringUtils.chomp(\"\\r\\n\")        \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to chomp a newline from, may be null\n     * @return String without newline, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 3354,col 9)-(line 3356,col 9)",
        "(line 3358,col 9)-(line 3365,col 9)",
        "(line 3367,col 9)-(line 3367,col 39)",
        "(line 3368,col 9)-(line 3368,col 40)",
        "(line 3370,col 9)-(line 3376,col 9)",
        "(line 3377,col 9)-(line 3377,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.chomp(java.lang.String, java.lang.String)",
      "begin_line": 3406,
      "end_line": 3414,
      "comment": "\n     * \u003cp\u003eRemoves \u003ccode\u003eseparator\u003c/code\u003e from the end of\n     * \u003ccode\u003estr\u003c/code\u003e if it\u0027s there, otherwise leave it alone.\u003c/p\u003e\n     *\n     * \u003cp\u003eNOTE: This method changed in version 2.0.\n     * It now more closely matches Perl chomp.\n     * For the previous behavior, use {@link #substringBeforeLast(String, String)}.\n     * This method uses {@link String#endsWith(String)}.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.chomp(null, *)         \u003d null\n     * StringUtils.chomp(\"\", *)           \u003d \"\"\n     * StringUtils.chomp(\"foobar\", \"bar\") \u003d \"foo\"\n     * StringUtils.chomp(\"foobar\", \"baz\") \u003d \"foobar\"\n     * StringUtils.chomp(\"foo\", \"foo\")    \u003d \"\"\n     * StringUtils.chomp(\"foo \", \"foo\")   \u003d \"foo \"\n     * StringUtils.chomp(\" foo\", \"foo\")   \u003d \" \"\n     * StringUtils.chomp(\"foo\", \"foooo\")  \u003d \"foo\"\n     * StringUtils.chomp(\"foo\", \"\")       \u003d \"foo\"\n     * StringUtils.chomp(\"foo\", null)     \u003d \"foo\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to chomp from, may be null\n     * @param separator  separator String, may be null\n     * @return String without trailing separator, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 3407,col 9)-(line 3409,col 9)",
        "(line 3410,col 9)-(line 3412,col 9)",
        "(line 3413,col 9)-(line 3413,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.chompLast(java.lang.String)",
      "begin_line": 3426,
      "end_line": 3428,
      "comment": "\n     * \u003cp\u003eRemove any \u0026quot;\\n\u0026quot; if and only if it is at the end\n     * of the supplied String.\u003c/p\u003e\n     *\n     * @param str  the String to chomp from, must not be null\n     * @return String without chomped ending\n     * @throws NullPointerException if str is \u003ccode\u003enull\u003c/code\u003e\n     * @deprecated Use {@link #chomp(String)} instead.\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 3427,col 9)-(line 3427,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.chompLast(java.lang.String, java.lang.String)",
      "begin_line": 3440,
      "end_line": 3450,
      "comment": "\n     * \u003cp\u003eRemove a value if and only if the String ends with that value.\u003c/p\u003e\n     *\n     * @param str  the String to chomp from, must not be null\n     * @param sep  the String to chomp, must not be null\n     * @return String without chomped ending\n     * @throws NullPointerException if str or sep is \u003ccode\u003enull\u003c/code\u003e\n     * @deprecated Use {@link #chomp(String,String)} instead.\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 3441,col 9)-(line 3443,col 9)",
        "(line 3444,col 9)-(line 3444,col 64)",
        "(line 3445,col 9)-(line 3449,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.getChomp(java.lang.String, java.lang.String)",
      "begin_line": 3464,
      "end_line": 3473,
      "comment": "\n     * \u003cp\u003eRemove everything and return the last value of a supplied String, and\n     * everything after it from a String.\u003c/p\u003e\n     *\n     * @param str  the String to chomp from, must not be null\n     * @param sep  the String to chomp, must not be null\n     * @return String chomped\n     * @throws NullPointerException if str or sep is \u003ccode\u003enull\u003c/code\u003e\n     * @deprecated Use {@link #substringAfterLast(String, String)} instead\n     *             (although this doesn\u0027t include the separator)\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 3465,col 9)-(line 3465,col 39)",
        "(line 3466,col 9)-(line 3472,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.prechomp(java.lang.String, java.lang.String)",
      "begin_line": 3486,
      "end_line": 3493,
      "comment": "\n     * \u003cp\u003eRemove the first value of a supplied String, and everything before it\n     * from a String.\u003c/p\u003e\n     *\n     * @param str  the String to chomp from, must not be null\n     * @param sep  the String to chomp, must not be null\n     * @return String without chomped beginning\n     * @throws NullPointerException if str or sep is \u003ccode\u003enull\u003c/code\u003e\n     * @deprecated Use {@link #substringAfter(String,String)} instead.\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 3487,col 9)-(line 3487,col 35)",
        "(line 3488,col 9)-(line 3492,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.getPrechomp(java.lang.String, java.lang.String)",
      "begin_line": 3507,
      "end_line": 3514,
      "comment": "\n     * \u003cp\u003eRemove and return everything before the first value of a\n     * supplied String from another String.\u003c/p\u003e\n     *\n     * @param str  the String to chomp from, must not be null\n     * @param sep  the String to chomp, must not be null\n     * @return String prechomped\n     * @throws NullPointerException if str or sep is \u003ccode\u003enull\u003c/code\u003e\n     * @deprecated Use {@link #substringBefore(String,String)} instead\n     *             (although this doesn\u0027t include the separator).\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 3508,col 9)-(line 3508,col 35)",
        "(line 3509,col 9)-(line 3513,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.chop(java.lang.String)",
      "begin_line": 3541,
      "end_line": 3558,
      "comment": "\n     * \u003cp\u003eRemove the last character from a String.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the String ends in \u003ccode\u003e\\r\\n\u003c/code\u003e, then remove both\n     * of them.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.chop(null)          \u003d null\n     * StringUtils.chop(\"\")            \u003d \"\"\n     * StringUtils.chop(\"abc \\r\")      \u003d \"abc \"\n     * StringUtils.chop(\"abc\\n\")       \u003d \"abc\"\n     * StringUtils.chop(\"abc\\r\\n\")     \u003d \"abc\"\n     * StringUtils.chop(\"abc\")         \u003d \"ab\"\n     * StringUtils.chop(\"abc\\nabc\")    \u003d \"abc\\nab\"\n     * StringUtils.chop(\"a\")           \u003d \"\"\n     * StringUtils.chop(\"\\r\")          \u003d \"\"\n     * StringUtils.chop(\"\\n\")          \u003d \"\"\n     * StringUtils.chop(\"\\r\\n\")        \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to chop last character from, may be null\n     * @return String without last character, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 3542,col 9)-(line 3544,col 9)",
        "(line 3545,col 9)-(line 3545,col 34)",
        "(line 3546,col 9)-(line 3548,col 9)",
        "(line 3549,col 9)-(line 3549,col 33)",
        "(line 3550,col 9)-(line 3550,col 47)",
        "(line 3551,col 9)-(line 3551,col 40)",
        "(line 3552,col 9)-(line 3556,col 9)",
        "(line 3557,col 9)-(line 3557,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.chopNewline(java.lang.String)",
      "begin_line": 3570,
      "end_line": 3584,
      "comment": "\n     * \u003cp\u003eRemoves \u003ccode\u003e\\n\u003c/code\u003e from end of a String if it\u0027s there.\n     * If a \u003ccode\u003e\\r\u003c/code\u003e precedes it, then remove that too.\u003c/p\u003e\n     *\n     * @param str  the String to chop a newline from, must not be null\n     * @return String without newline\n     * @throws NullPointerException if str is \u003ccode\u003enull\u003c/code\u003e\n     * @deprecated Use {@link #chomp(String)} instead.\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 3571,col 9)-(line 3571,col 39)",
        "(line 3572,col 9)-(line 3574,col 9)",
        "(line 3575,col 9)-(line 3575,col 40)",
        "(line 3576,col 9)-(line 3582,col 9)",
        "(line 3583,col 9)-(line 3583,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.escape(java.lang.String)",
      "begin_line": 3604,
      "end_line": 3606,
      "comment": "\n     * \u003cp\u003eEscapes any values it finds into their String form.\u003c/p\u003e\n     *\n     * \u003cp\u003eSo a tab becomes the characters \u003ccode\u003e\u0027\\\\\u0027\u003c/code\u003e and\n     * \u003ccode\u003e\u0027t\u0027\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eAs of Lang 2.0, this calls {@link StringEscapeUtils#escapeJava(String)}\n     * behind the scenes.\n     * \u003c/p\u003e\n     * @see StringEscapeUtils#escapeJava(java.lang.String)\n     * @param str String to escape values in\n     * @return String with escaped values\n     * @throws NullPointerException if str is \u003ccode\u003enull\u003c/code\u003e\n     * @deprecated Use {@link StringEscapeUtils#escapeJava(String)}\n     *             This method will be removed in Commons Lang 3.0\n     ",
      "child_ranges": [
        "(line 3605,col 9)-(line 3605,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.repeat(java.lang.String, int)",
      "begin_line": 3628,
      "end_line": 3670,
      "comment": "\n     * \u003cp\u003eRepeat a String \u003ccode\u003erepeat\u003c/code\u003e times to form a\n     * new String.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.repeat(null, 2) \u003d null\n     * StringUtils.repeat(\"\", 0)   \u003d \"\"\n     * StringUtils.repeat(\"\", 2)   \u003d \"\"\n     * StringUtils.repeat(\"a\", 3)  \u003d \"aaa\"\n     * StringUtils.repeat(\"ab\", 2) \u003d \"abab\"\n     * StringUtils.repeat(\"a\", -2) \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to repeat, may be null\n     * @param repeat  number of times to repeat str, negative treated as zero\n     * @return a new String consisting of the original String repeated,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 3631,col 9)-(line 3633,col 9)",
        "(line 3634,col 9)-(line 3636,col 9)",
        "(line 3637,col 9)-(line 3637,col 39)",
        "(line 3638,col 9)-(line 3640,col 9)",
        "(line 3641,col 9)-(line 3643,col 9)",
        "(line 3645,col 9)-(line 3645,col 48)",
        "(line 3646,col 9)-(line 3669,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.padding(int, char)",
      "begin_line": 3695,
      "end_line": 3704,
      "comment": "\n     * \u003cp\u003eReturns padding using the specified delimiter repeated\n     * to a given length.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.padding(0, \u0027e\u0027)  \u003d \"\"\n     * StringUtils.padding(3, \u0027e\u0027)  \u003d \"eee\"\n     * StringUtils.padding(-2, \u0027e\u0027) \u003d IndexOutOfBoundsException\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eNote: this method doesn\u0027t not support padding with\n     * \u003ca href\u003d\"http://www.unicode.org/glossary/#supplementary_character\"\u003eUnicode Supplementary Characters\u003c/a\u003e\n     * as they require a pair of \u003ccode\u003echar\u003c/code\u003es to be represented.\n     * If you are needing to support full I18N of your applications\n     * consider using {@link #repeat(String, int)} instead. \n     * \u003c/p\u003e\n     *\n     * @param repeat  number of times to repeat delim\n     * @param padChar  character to repeat\n     * @return String with repeated character\n     * @throws IndexOutOfBoundsException if \u003ccode\u003erepeat \u0026lt; 0\u003c/code\u003e\n     * @see #repeat(String, int)\n     ",
      "child_ranges": [
        "(line 3696,col 9)-(line 3698,col 9)",
        "(line 3699,col 9)-(line 3699,col 44)",
        "(line 3700,col 9)-(line 3702,col 9)",
        "(line 3703,col 9)-(line 3703,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.rightPad(java.lang.String, int)",
      "begin_line": 3725,
      "end_line": 3727,
      "comment": "\n     * \u003cp\u003eRight pad a String with spaces (\u0027 \u0027).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is padded to the size of \u003ccode\u003esize\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.rightPad(null, *)   \u003d null\n     * StringUtils.rightPad(\"\", 3)     \u003d \"   \"\n     * StringUtils.rightPad(\"bat\", 3)  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", 5)  \u003d \"bat  \"\n     * StringUtils.rightPad(\"bat\", 1)  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", -1) \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @return right padded String or original String if no padding is necessary,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 3726,col 9)-(line 3726,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.rightPad(java.lang.String, int, char)",
      "begin_line": 3750,
      "end_line": 3762,
      "comment": "\n     * \u003cp\u003eRight pad a String with a specified character.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is padded to the size of \u003ccode\u003esize\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.rightPad(null, *, *)     \u003d null\n     * StringUtils.rightPad(\"\", 3, \u0027z\u0027)     \u003d \"zzz\"\n     * StringUtils.rightPad(\"bat\", 3, \u0027z\u0027)  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", 5, \u0027z\u0027)  \u003d \"batzz\"\n     * StringUtils.rightPad(\"bat\", 1, \u0027z\u0027)  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", -1, \u0027z\u0027) \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @param padChar  the character to pad with\n     * @return right padded String or original String if no padding is necessary,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 3751,col 9)-(line 3753,col 9)",
        "(line 3754,col 9)-(line 3754,col 39)",
        "(line 3755,col 9)-(line 3757,col 9)",
        "(line 3758,col 9)-(line 3760,col 9)",
        "(line 3761,col 9)-(line 3761,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.rightPad(java.lang.String, int, java.lang.String)",
      "begin_line": 3787,
      "end_line": 3816,
      "comment": "\n     * \u003cp\u003eRight pad a String with a specified String.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is padded to the size of \u003ccode\u003esize\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.rightPad(null, *, *)      \u003d null\n     * StringUtils.rightPad(\"\", 3, \"z\")      \u003d \"zzz\"\n     * StringUtils.rightPad(\"bat\", 3, \"yz\")  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", 5, \"yz\")  \u003d \"batyz\"\n     * StringUtils.rightPad(\"bat\", 8, \"yz\")  \u003d \"batyzyzy\"\n     * StringUtils.rightPad(\"bat\", 1, \"yz\")  \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", -1, \"yz\") \u003d \"bat\"\n     * StringUtils.rightPad(\"bat\", 5, null)  \u003d \"bat  \"\n     * StringUtils.rightPad(\"bat\", 5, \"\")    \u003d \"bat  \"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @param padStr  the String to pad with, null or empty treated as single space\n     * @return right padded String or original String if no padding is necessary,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 3788,col 9)-(line 3790,col 9)",
        "(line 3791,col 9)-(line 3793,col 9)",
        "(line 3794,col 9)-(line 3794,col 37)",
        "(line 3795,col 9)-(line 3795,col 34)",
        "(line 3796,col 9)-(line 3796,col 33)",
        "(line 3797,col 9)-(line 3799,col 9)",
        "(line 3800,col 9)-(line 3802,col 9)",
        "(line 3804,col 9)-(line 3815,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.leftPad(java.lang.String, int)",
      "begin_line": 3837,
      "end_line": 3839,
      "comment": "\n     * \u003cp\u003eLeft pad a String with spaces (\u0027 \u0027).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe String is padded to the size of \u003ccode\u003esize\u003ccode\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.leftPad(null, *)   \u003d null\n     * StringUtils.leftPad(\"\", 3)     \u003d \"   \"\n     * StringUtils.leftPad(\"bat\", 3)  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", 5)  \u003d \"  bat\"\n     * StringUtils.leftPad(\"bat\", 1)  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", -1) \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @return left padded String or original String if no padding is necessary,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 3838,col 9)-(line 3838,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.leftPad(java.lang.String, int, char)",
      "begin_line": 3862,
      "end_line": 3874,
      "comment": "\n     * \u003cp\u003eLeft pad a String with a specified character.\u003c/p\u003e\n     *\n     * \u003cp\u003ePad to a size of \u003ccode\u003esize\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.leftPad(null, *, *)     \u003d null\n     * StringUtils.leftPad(\"\", 3, \u0027z\u0027)     \u003d \"zzz\"\n     * StringUtils.leftPad(\"bat\", 3, \u0027z\u0027)  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", 5, \u0027z\u0027)  \u003d \"zzbat\"\n     * StringUtils.leftPad(\"bat\", 1, \u0027z\u0027)  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", -1, \u0027z\u0027) \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @param padChar  the character to pad with\n     * @return left padded String or original String if no padding is necessary,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 3863,col 9)-(line 3865,col 9)",
        "(line 3866,col 9)-(line 3866,col 39)",
        "(line 3867,col 9)-(line 3869,col 9)",
        "(line 3870,col 9)-(line 3872,col 9)",
        "(line 3873,col 9)-(line 3873,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.leftPad(java.lang.String, int, java.lang.String)",
      "begin_line": 3899,
      "end_line": 3928,
      "comment": "\n     * \u003cp\u003eLeft pad a String with a specified String.\u003c/p\u003e\n     *\n     * \u003cp\u003ePad to a size of \u003ccode\u003esize\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.leftPad(null, *, *)      \u003d null\n     * StringUtils.leftPad(\"\", 3, \"z\")      \u003d \"zzz\"\n     * StringUtils.leftPad(\"bat\", 3, \"yz\")  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", 5, \"yz\")  \u003d \"yzbat\"\n     * StringUtils.leftPad(\"bat\", 8, \"yz\")  \u003d \"yzyzybat\"\n     * StringUtils.leftPad(\"bat\", 1, \"yz\")  \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", -1, \"yz\") \u003d \"bat\"\n     * StringUtils.leftPad(\"bat\", 5, null)  \u003d \"  bat\"\n     * StringUtils.leftPad(\"bat\", 5, \"\")    \u003d \"  bat\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to pad out, may be null\n     * @param size  the size to pad to\n     * @param padStr  the String to pad with, null or empty treated as single space\n     * @return left padded String or original String if no padding is necessary,\n     *  \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 3900,col 9)-(line 3902,col 9)",
        "(line 3903,col 9)-(line 3905,col 9)",
        "(line 3906,col 9)-(line 3906,col 37)",
        "(line 3907,col 9)-(line 3907,col 34)",
        "(line 3908,col 9)-(line 3908,col 33)",
        "(line 3909,col 9)-(line 3911,col 9)",
        "(line 3912,col 9)-(line 3914,col 9)",
        "(line 3916,col 9)-(line 3927,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.center(java.lang.String, int)",
      "begin_line": 3955,
      "end_line": 3957,
      "comment": "\n     * \u003cp\u003eCenters a String in a larger String of size \u003ccode\u003esize\u003c/code\u003e\n     * using the space character (\u0027 \u0027).\u003cp\u003e\n     *\n     * \u003cp\u003eIf the size is less than the String length, the String is returned.\n     * A \u003ccode\u003enull\u003c/code\u003e String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A negative size is treated as zero.\u003c/p\u003e\n     *\n     * \u003cp\u003eEquivalent to \u003ccode\u003ecenter(str, size, \" \")\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.center(null, *)   \u003d null\n     * StringUtils.center(\"\", 4)     \u003d \"    \"\n     * StringUtils.center(\"ab\", -1)  \u003d \"ab\"\n     * StringUtils.center(\"ab\", 4)   \u003d \" ab \"\n     * StringUtils.center(\"abcd\", 2) \u003d \"abcd\"\n     * StringUtils.center(\"a\", 4)    \u003d \" a  \"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to center, may be null\n     * @param size  the int size of new String, negative treated as zero\n     * @return centered String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 3956,col 9)-(line 3956,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.center(java.lang.String, int, char)",
      "begin_line": 3983,
      "end_line": 3995,
      "comment": "\n     * \u003cp\u003eCenters a String in a larger String of size \u003ccode\u003esize\u003c/code\u003e.\n     * Uses a supplied character as the value to pad the String with.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the size is less than the String length, the String is returned.\n     * A \u003ccode\u003enull\u003c/code\u003e String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A negative size is treated as zero.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.center(null, *, *)     \u003d null\n     * StringUtils.center(\"\", 4, \u0027 \u0027)     \u003d \"    \"\n     * StringUtils.center(\"ab\", -1, \u0027 \u0027)  \u003d \"ab\"\n     * StringUtils.center(\"ab\", 4, \u0027 \u0027)   \u003d \" ab\"\n     * StringUtils.center(\"abcd\", 2, \u0027 \u0027) \u003d \"abcd\"\n     * StringUtils.center(\"a\", 4, \u0027 \u0027)    \u003d \" a  \"\n     * StringUtils.center(\"a\", 4, \u0027y\u0027)    \u003d \"yayy\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to center, may be null\n     * @param size  the int size of new String, negative treated as zero\n     * @param padChar  the character to pad the new String with\n     * @return centered String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 3984,col 9)-(line 3986,col 9)",
        "(line 3987,col 9)-(line 3987,col 34)",
        "(line 3988,col 9)-(line 3988,col 33)",
        "(line 3989,col 9)-(line 3991,col 9)",
        "(line 3992,col 9)-(line 3992,col 55)",
        "(line 3993,col 9)-(line 3993,col 43)",
        "(line 3994,col 9)-(line 3994,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.center(java.lang.String, int, java.lang.String)",
      "begin_line": 4023,
      "end_line": 4038,
      "comment": "\n     * \u003cp\u003eCenters a String in a larger String of size \u003ccode\u003esize\u003c/code\u003e.\n     * Uses a supplied String as the value to pad the String with.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the size is less than the String length, the String is returned.\n     * A \u003ccode\u003enull\u003c/code\u003e String returns \u003ccode\u003enull\u003c/code\u003e.\n     * A negative size is treated as zero.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.center(null, *, *)     \u003d null\n     * StringUtils.center(\"\", 4, \" \")     \u003d \"    \"\n     * StringUtils.center(\"ab\", -1, \" \")  \u003d \"ab\"\n     * StringUtils.center(\"ab\", 4, \" \")   \u003d \" ab\"\n     * StringUtils.center(\"abcd\", 2, \" \") \u003d \"abcd\"\n     * StringUtils.center(\"a\", 4, \" \")    \u003d \" a  \"\n     * StringUtils.center(\"a\", 4, \"yz\")   \u003d \"yayz\"\n     * StringUtils.center(\"abc\", 7, null) \u003d \"  abc  \"\n     * StringUtils.center(\"abc\", 7, \"\")   \u003d \"  abc  \"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to center, may be null\n     * @param size  the int size of new String, negative treated as zero\n     * @param padStr  the String to pad the new String with, must not be null or empty\n     * @return centered String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @throws IllegalArgumentException if padStr is \u003ccode\u003enull\u003c/code\u003e or empty\n     ",
      "child_ranges": [
        "(line 4024,col 9)-(line 4026,col 9)",
        "(line 4027,col 9)-(line 4029,col 9)",
        "(line 4030,col 9)-(line 4030,col 34)",
        "(line 4031,col 9)-(line 4031,col 33)",
        "(line 4032,col 9)-(line 4034,col 9)",
        "(line 4035,col 9)-(line 4035,col 54)",
        "(line 4036,col 9)-(line 4036,col 42)",
        "(line 4037,col 9)-(line 4037,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.upperCase(java.lang.String)",
      "begin_line": 4056,
      "end_line": 4061,
      "comment": "\n     * \u003cp\u003eConverts a String to upper case as per {@link String#toUpperCase()}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.upperCase(null)  \u003d null\n     * StringUtils.upperCase(\"\")    \u003d \"\"\n     * StringUtils.upperCase(\"aBc\") \u003d \"ABC\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to upper case, may be null\n     * @return the upper cased String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4057,col 9)-(line 4059,col 9)",
        "(line 4060,col 9)-(line 4060,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.lowerCase(java.lang.String)",
      "begin_line": 4077,
      "end_line": 4082,
      "comment": "\n     * \u003cp\u003eConverts a String to lower case as per {@link String#toLowerCase()}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.lowerCase(null)  \u003d null\n     * StringUtils.lowerCase(\"\")    \u003d \"\"\n     * StringUtils.lowerCase(\"aBc\") \u003d \"abc\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to lower case, may be null\n     * @return the lower cased String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4078,col 9)-(line 4080,col 9)",
        "(line 4081,col 9)-(line 4081,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.capitalize(java.lang.String)",
      "begin_line": 4104,
      "end_line": 4113,
      "comment": "\n     * \u003cp\u003eCapitalizes a String changing the first letter to title case as\n     * per {@link Character#toTitleCase(char)}. No other letters are changed.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor a word based algorithm, see {@link WordUtils#capitalize(String)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.capitalize(null)  \u003d null\n     * StringUtils.capitalize(\"\")    \u003d \"\"\n     * StringUtils.capitalize(\"cat\") \u003d \"Cat\"\n     * StringUtils.capitalize(\"cAt\") \u003d \"CAt\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to capitalize, may be null\n     * @return the capitalized String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @see WordUtils#capitalize(String)\n     * @see #uncapitalize(String)\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4105,col 9)-(line 4105,col 19)",
        "(line 4106,col 9)-(line 4108,col 9)",
        "(line 4109,col 9)-(line 4112,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.capitalise(java.lang.String)",
      "begin_line": 4124,
      "end_line": 4126,
      "comment": "\n     * \u003cp\u003eCapitalizes a String changing the first letter to title case as\n     * per {@link Character#toTitleCase(char)}. No other letters are changed.\u003c/p\u003e\n     *\n     * @param str  the String to capitalize, may be null\n     * @return the capitalized String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @deprecated Use the standardly named {@link #capitalize(String)}.\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 4125,col 9)-(line 4125,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.uncapitalize(java.lang.String)",
      "begin_line": 4148,
      "end_line": 4157,
      "comment": "\n     * \u003cp\u003eUncapitalizes a String changing the first letter to title case as\n     * per {@link Character#toLowerCase(char)}. No other letters are changed.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor a word based algorithm, see {@link WordUtils#uncapitalize(String)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.uncapitalize(null)  \u003d null\n     * StringUtils.uncapitalize(\"\")    \u003d \"\"\n     * StringUtils.uncapitalize(\"Cat\") \u003d \"cat\"\n     * StringUtils.uncapitalize(\"CAT\") \u003d \"cAT\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to uncapitalize, may be null\n     * @return the uncapitalized String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @see WordUtils#uncapitalize(String)\n     * @see #capitalize(String)\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4149,col 9)-(line 4149,col 19)",
        "(line 4150,col 9)-(line 4152,col 9)",
        "(line 4153,col 9)-(line 4156,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.uncapitalise(java.lang.String)",
      "begin_line": 4168,
      "end_line": 4170,
      "comment": "\n     * \u003cp\u003eUncapitalizes a String changing the first letter to title case as\n     * per {@link Character#toLowerCase(char)}. No other letters are changed.\u003c/p\u003e\n     *\n     * @param str  the String to uncapitalize, may be null\n     * @return the uncapitalized String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @deprecated Use the standardly named {@link #uncapitalize(String)}.\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 4169,col 9)-(line 4169,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.swapCase(java.lang.String)",
      "begin_line": 4199,
      "end_line": 4219,
      "comment": "\n     * \u003cp\u003eSwaps the case of a String changing upper and title case to\n     * lower case, and lower case to upper case.\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     *  \u003cli\u003eUpper case character converts to Lower case\u003c/li\u003e\n     *  \u003cli\u003eTitle case character converts to Lower case\u003c/li\u003e\n     *  \u003cli\u003eLower case character converts to Upper case\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eFor a word based algorithm, see {@link WordUtils#swapCase(String)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.swapCase(null)                 \u003d null\n     * StringUtils.swapCase(\"\")                   \u003d \"\"\n     * StringUtils.swapCase(\"The dog has a BONE\") \u003d \"tHE DOG HAS A bone\"\n     * \u003c/pre\u003e\n     *\n     * \u003cp\u003eNOTE: This method changed in Lang version 2.0.\n     * It no longer performs a word based algorithm.\n     * If you only use ASCII, you will notice no change.\n     * That functionality is available in WordUtils.\u003c/p\u003e\n     *\n     * @param str  the String to swap case, may be null\n     * @return the changed String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4200,col 9)-(line 4200,col 19)",
        "(line 4201,col 9)-(line 4203,col 9)",
        "(line 4204,col 9)-(line 4204,col 55)",
        "(line 4206,col 9)-(line 4206,col 20)",
        "(line 4207,col 9)-(line 4217,col 9)",
        "(line 4218,col 9)-(line 4218,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.capitaliseAllWords(java.lang.String)",
      "begin_line": 4233,
      "end_line": 4235,
      "comment": "\n     * \u003cp\u003eCapitalizes all the whitespace separated words in a String.\n     * Only the first letter of each word is changed.\u003c/p\u003e\n     *\n     * \u003cp\u003eWhitespace is defined by {@link Character#isWhitespace(char)}.\n     * A \u003ccode\u003enull\u003c/code\u003e input String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str  the String to capitalize, may be null\n     * @return capitalized String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @deprecated Use the relocated {@link WordUtils#capitalize(String)}.\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 4234,col 9)-(line 4234,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.countMatches(java.lang.String, java.lang.String)",
      "begin_line": 4258,
      "end_line": 4269,
      "comment": "\n     * \u003cp\u003eCounts how many times the substring appears in the larger String.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e or empty (\"\") String input returns \u003ccode\u003e0\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.countMatches(null, *)       \u003d 0\n     * StringUtils.countMatches(\"\", *)         \u003d 0\n     * StringUtils.countMatches(\"abba\", null)  \u003d 0\n     * StringUtils.countMatches(\"abba\", \"\")    \u003d 0\n     * StringUtils.countMatches(\"abba\", \"a\")   \u003d 2\n     * StringUtils.countMatches(\"abba\", \"ab\")  \u003d 1\n     * StringUtils.countMatches(\"abba\", \"xxx\") \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param sub  the substring to count, may be null\n     * @return the number of occurrences, 0 if either String is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 4259,col 9)-(line 4261,col 9)",
        "(line 4262,col 9)-(line 4262,col 22)",
        "(line 4263,col 9)-(line 4263,col 20)",
        "(line 4264,col 9)-(line 4267,col 9)",
        "(line 4268,col 9)-(line 4268,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.isAlpha(java.lang.String)",
      "begin_line": 4291,
      "end_line": 4302,
      "comment": "\n     * \u003cp\u003eChecks if the String contains only unicode letters.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty String (\"\") will return \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAlpha(null)   \u003d false\n     * StringUtils.isAlpha(\"\")     \u003d true\n     * StringUtils.isAlpha(\"  \")   \u003d false\n     * StringUtils.isAlpha(\"abc\")  \u003d true\n     * StringUtils.isAlpha(\"ab2c\") \u003d false\n     * StringUtils.isAlpha(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if only contains letters, and is non-null\n     ",
      "child_ranges": [
        "(line 4292,col 9)-(line 4294,col 9)",
        "(line 4295,col 9)-(line 4295,col 30)",
        "(line 4296,col 9)-(line 4300,col 9)",
        "(line 4301,col 9)-(line 4301,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.isAlphaSpace(java.lang.String)",
      "begin_line": 4325,
      "end_line": 4336,
      "comment": "\n     * \u003cp\u003eChecks if the String contains only unicode letters and\n     * space (\u0027 \u0027).\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e\n     * An empty String (\"\") will return \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAlphaSpace(null)   \u003d false\n     * StringUtils.isAlphaSpace(\"\")     \u003d true\n     * StringUtils.isAlphaSpace(\"  \")   \u003d true\n     * StringUtils.isAlphaSpace(\"abc\")  \u003d true\n     * StringUtils.isAlphaSpace(\"ab c\") \u003d true\n     * StringUtils.isAlphaSpace(\"ab2c\") \u003d false\n     * StringUtils.isAlphaSpace(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if only contains letters and space,\n     *  and is non-null\n     ",
      "child_ranges": [
        "(line 4326,col 9)-(line 4328,col 9)",
        "(line 4329,col 9)-(line 4329,col 30)",
        "(line 4330,col 9)-(line 4334,col 9)",
        "(line 4335,col 9)-(line 4335,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.isAlphanumeric(java.lang.String)",
      "begin_line": 4358,
      "end_line": 4369,
      "comment": "\n     * \u003cp\u003eChecks if the String contains only unicode letters or digits.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty String (\"\") will return \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAlphanumeric(null)   \u003d false\n     * StringUtils.isAlphanumeric(\"\")     \u003d true\n     * StringUtils.isAlphanumeric(\"  \")   \u003d false\n     * StringUtils.isAlphanumeric(\"abc\")  \u003d true\n     * StringUtils.isAlphanumeric(\"ab c\") \u003d false\n     * StringUtils.isAlphanumeric(\"ab2c\") \u003d true\n     * StringUtils.isAlphanumeric(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if only contains letters or digits,\n     *  and is non-null\n     ",
      "child_ranges": [
        "(line 4359,col 9)-(line 4361,col 9)",
        "(line 4362,col 9)-(line 4362,col 30)",
        "(line 4363,col 9)-(line 4367,col 9)",
        "(line 4368,col 9)-(line 4368,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.isAlphanumericSpace(java.lang.String)",
      "begin_line": 4392,
      "end_line": 4403,
      "comment": "\n     * \u003cp\u003eChecks if the String contains only unicode letters, digits\n     * or space (\u003ccode\u003e\u0027 \u0027\u003c/code\u003e).\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty String (\"\") will return \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isAlphanumeric(null)   \u003d false\n     * StringUtils.isAlphanumeric(\"\")     \u003d true\n     * StringUtils.isAlphanumeric(\"  \")   \u003d true\n     * StringUtils.isAlphanumeric(\"abc\")  \u003d true\n     * StringUtils.isAlphanumeric(\"ab c\") \u003d true\n     * StringUtils.isAlphanumeric(\"ab2c\") \u003d true\n     * StringUtils.isAlphanumeric(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if only contains letters, digits or space,\n     *  and is non-null\n     ",
      "child_ranges": [
        "(line 4393,col 9)-(line 4395,col 9)",
        "(line 4396,col 9)-(line 4396,col 30)",
        "(line 4397,col 9)-(line 4401,col 9)",
        "(line 4402,col 9)-(line 4402,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.isAsciiPrintable(java.lang.String)",
      "begin_line": 4430,
      "end_line": 4441,
      "comment": "\n     * \u003cp\u003eChecks if the string contains only ASCII printable characters.\u003c/p\u003e\n     * \n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty String (\"\") will return \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * StringUtils.isAsciiPrintable(null)     \u003d false\n     * StringUtils.isAsciiPrintable(\"\")       \u003d true\n     * StringUtils.isAsciiPrintable(\" \")      \u003d true\n     * StringUtils.isAsciiPrintable(\"Ceki\")   \u003d true\n     * StringUtils.isAsciiPrintable(\"ab2c\")   \u003d true\n     * StringUtils.isAsciiPrintable(\"!ab-c~\") \u003d true\n     * StringUtils.isAsciiPrintable(\"\\u0020\") \u003d true\n     * StringUtils.isAsciiPrintable(\"\\u0021\") \u003d true\n     * StringUtils.isAsciiPrintable(\"\\u007e\") \u003d true\n     * StringUtils.isAsciiPrintable(\"\\u007f\") \u003d false\n     * StringUtils.isAsciiPrintable(\"Ceki G\\u00fclc\\u00fc\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str the string to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if every character is in the range\n     *  32 thru 126\n     * @since 2.1\n     ",
      "child_ranges": [
        "(line 4431,col 9)-(line 4433,col 9)",
        "(line 4434,col 9)-(line 4434,col 30)",
        "(line 4435,col 9)-(line 4439,col 9)",
        "(line 4440,col 9)-(line 4440,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.isNumeric(java.lang.String)",
      "begin_line": 4464,
      "end_line": 4475,
      "comment": "\n     * \u003cp\u003eChecks if the String contains only unicode digits.\n     * A decimal point is not a unicode digit and returns false.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty String (\"\") will return \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isNumeric(null)   \u003d false\n     * StringUtils.isNumeric(\"\")     \u003d true\n     * StringUtils.isNumeric(\"  \")   \u003d false\n     * StringUtils.isNumeric(\"123\")  \u003d true\n     * StringUtils.isNumeric(\"12 3\") \u003d false\n     * StringUtils.isNumeric(\"ab2c\") \u003d false\n     * StringUtils.isNumeric(\"12-3\") \u003d false\n     * StringUtils.isNumeric(\"12.3\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if only contains digits, and is non-null\n     ",
      "child_ranges": [
        "(line 4465,col 9)-(line 4467,col 9)",
        "(line 4468,col 9)-(line 4468,col 30)",
        "(line 4469,col 9)-(line 4473,col 9)",
        "(line 4474,col 9)-(line 4474,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.isNumericSpace(java.lang.String)",
      "begin_line": 4500,
      "end_line": 4511,
      "comment": "\n     * \u003cp\u003eChecks if the String contains only unicode digits or space\n     * (\u003ccode\u003e\u0027 \u0027\u003c/code\u003e).\n     * A decimal point is not a unicode digit and returns false.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty String (\"\") will return \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isNumeric(null)   \u003d false\n     * StringUtils.isNumeric(\"\")     \u003d true\n     * StringUtils.isNumeric(\"  \")   \u003d true\n     * StringUtils.isNumeric(\"123\")  \u003d true\n     * StringUtils.isNumeric(\"12 3\") \u003d true\n     * StringUtils.isNumeric(\"ab2c\") \u003d false\n     * StringUtils.isNumeric(\"12-3\") \u003d false\n     * StringUtils.isNumeric(\"12.3\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if only contains digits or space,\n     *  and is non-null\n     ",
      "child_ranges": [
        "(line 4501,col 9)-(line 4503,col 9)",
        "(line 4504,col 9)-(line 4504,col 30)",
        "(line 4505,col 9)-(line 4509,col 9)",
        "(line 4510,col 9)-(line 4510,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.isWhitespace(java.lang.String)",
      "begin_line": 4532,
      "end_line": 4543,
      "comment": "\n     * \u003cp\u003eChecks if the String contains only whitespace.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003ccode\u003enull\u003c/code\u003e will return \u003ccode\u003efalse\u003c/code\u003e.\n     * An empty String (\"\") will return \u003ccode\u003etrue\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.isWhitespace(null)   \u003d false\n     * StringUtils.isWhitespace(\"\")     \u003d true\n     * StringUtils.isWhitespace(\"  \")   \u003d true\n     * StringUtils.isWhitespace(\"abc\")  \u003d false\n     * StringUtils.isWhitespace(\"ab2c\") \u003d false\n     * StringUtils.isWhitespace(\"ab-c\") \u003d false\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e if only contains whitespace, and is non-null\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4533,col 9)-(line 4535,col 9)",
        "(line 4536,col 9)-(line 4536,col 30)",
        "(line 4537,col 9)-(line 4541,col 9)",
        "(line 4542,col 9)-(line 4542,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.defaultString(java.lang.String)",
      "begin_line": 4563,
      "end_line": 4565,
      "comment": "\n     * \u003cp\u003eReturns either the passed in String,\n     * or if the String is \u003ccode\u003enull\u003c/code\u003e, an empty String (\"\").\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.defaultString(null)  \u003d \"\"\n     * StringUtils.defaultString(\"\")    \u003d \"\"\n     * StringUtils.defaultString(\"bat\") \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @see ObjectUtils#toString(Object)\n     * @see String#valueOf(Object)\n     * @param str  the String to check, may be null\n     * @return the passed in String, or the empty String if it\n     *  was \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 4564,col 9)-(line 4564,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.defaultString(java.lang.String, java.lang.String)",
      "begin_line": 4584,
      "end_line": 4586,
      "comment": "\n     * \u003cp\u003eReturns either the passed in String, or if the String is\n     * \u003ccode\u003enull\u003c/code\u003e, the value of \u003ccode\u003edefaultStr\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.defaultString(null, \"NULL\")  \u003d \"NULL\"\n     * StringUtils.defaultString(\"\", \"NULL\")    \u003d \"\"\n     * StringUtils.defaultString(\"bat\", \"NULL\") \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @see ObjectUtils#toString(Object,String)\n     * @see String#valueOf(Object)\n     * @param str  the String to check, may be null\n     * @param defaultStr  the default String to return\n     *  if the input is \u003ccode\u003enull\u003c/code\u003e, may be null\n     * @return the passed in String, or the default if it was \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 4585,col 9)-(line 4585,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.defaultIfEmpty(java.lang.String, java.lang.String)",
      "begin_line": 4604,
      "end_line": 4606,
      "comment": "\n     * \u003cp\u003eReturns either the passed in String, or if the String is\n     * empty or \u003ccode\u003enull\u003c/code\u003e, the value of \u003ccode\u003edefaultStr\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.defaultIfEmpty(null, \"NULL\")  \u003d \"NULL\"\n     * StringUtils.defaultIfEmpty(\"\", \"NULL\")    \u003d \"NULL\"\n     * StringUtils.defaultIfEmpty(\"bat\", \"NULL\") \u003d \"bat\"\n     * \u003c/pre\u003e\n     *\n     * @see StringUtils#defaultString(String, String)\n     * @param str  the String to check, may be null\n     * @param defaultStr  the default String to return\n     *  if the input is empty (\"\") or \u003ccode\u003enull\u003c/code\u003e, may be null\n     * @return the passed in String, or the default\n     ",
      "child_ranges": [
        "(line 4605,col 9)-(line 4605,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.reverse(java.lang.String)",
      "begin_line": 4624,
      "end_line": 4629,
      "comment": "\n     * \u003cp\u003eReverses a String as per {@link StringBuffer#reverse()}.\u003c/p\u003e\n     *\n     * \u003cp\u003eA \u003ccode\u003enull\u003c/code\u003e String returns \u003ccode\u003enull\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.reverse(null)  \u003d null\n     * StringUtils.reverse(\"\")    \u003d \"\"\n     * StringUtils.reverse(\"bat\") \u003d \"tab\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to reverse, may be null\n     * @return the reversed String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     ",
      "child_ranges": [
        "(line 4625,col 9)-(line 4627,col 9)",
        "(line 4628,col 9)-(line 4628,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.reverseDelimited(java.lang.String, char)",
      "begin_line": 4650,
      "end_line": 4659,
      "comment": "\n     * \u003cp\u003eReverses a String that is delimited by a specific character.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe Strings between the delimiters are not reversed.\n     * Thus java.lang.String becomes String.lang.java (if the delimiter\n     * is \u003ccode\u003e\u0027.\u0027\u003c/code\u003e).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.reverseDelimited(null, *)      \u003d null\n     * StringUtils.reverseDelimited(\"\", *)        \u003d \"\"\n     * StringUtils.reverseDelimited(\"a.b.c\", \u0027x\u0027) \u003d \"a.b.c\"\n     * StringUtils.reverseDelimited(\"a.b.c\", \".\") \u003d \"c.b.a\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to reverse, may be null\n     * @param separatorChar  the separator character to use\n     * @return the reversed String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4651,col 9)-(line 4653,col 9)",
        "(line 4656,col 9)-(line 4656,col 50)",
        "(line 4657,col 9)-(line 4657,col 33)",
        "(line 4658,col 9)-(line 4658,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.reverseDelimitedString(java.lang.String, java.lang.String)",
      "begin_line": 4683,
      "end_line": 4695,
      "comment": "\n     * \u003cp\u003eReverses a String that is delimited by a specific character.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe Strings between the delimiters are not reversed.\n     * Thus java.lang.String becomes String.lang.java (if the delimiter\n     * is \u003ccode\u003e\".\"\u003c/code\u003e).\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.reverseDelimitedString(null, *)       \u003d null\n     * StringUtils.reverseDelimitedString(\"\",*)          \u003d \"\"\n     * StringUtils.reverseDelimitedString(\"a.b.c\", null) \u003d \"a.b.c\"\n     * StringUtils.reverseDelimitedString(\"a.b.c\", \".\")  \u003d \"c.b.a\"\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to reverse, may be null\n     * @param separatorChars  the separator characters to use, null treated as whitespace\n     * @return the reversed String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @deprecated Use {@link #reverseDelimited(String, char)} instead.\n     *      This method is broken as the join doesn\u0027t know which char to use.\n     *      Method will be removed in Commons Lang 3.0.\n     *\n     ",
      "child_ranges": [
        "(line 4684,col 9)-(line 4686,col 9)",
        "(line 4689,col 9)-(line 4689,col 51)",
        "(line 4690,col 9)-(line 4690,col 33)",
        "(line 4691,col 9)-(line 4693,col 9)",
        "(line 4694,col 9)-(line 4694,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.abbreviate(java.lang.String, int)",
      "begin_line": 4731,
      "end_line": 4733,
      "comment": "\n     * \u003cp\u003eAbbreviates a String using ellipses. This will turn\n     * \"Now is the time for all good men\" into \"Now is the time for...\"\u003c/p\u003e\n     *\n     * \u003cp\u003eSpecifically:\n     * \u003cul\u003e\n     *   \u003cli\u003eIf \u003ccode\u003estr\u003c/code\u003e is less than \u003ccode\u003emaxWidth\u003c/code\u003e characters\n     *       long, return it.\u003c/li\u003e\n     *   \u003cli\u003eElse abbreviate it to \u003ccode\u003e(substring(str, 0, max-3) + \"...\")\u003c/code\u003e.\u003c/li\u003e\n     *   \u003cli\u003eIf \u003ccode\u003emaxWidth\u003c/code\u003e is less than \u003ccode\u003e4\u003c/code\u003e, throw an\n     *       \u003ccode\u003eIllegalArgumentException\u003c/code\u003e.\u003c/li\u003e\n     *   \u003cli\u003eIn no case will it return a String of length greater than\n     *       \u003ccode\u003emaxWidth\u003c/code\u003e.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.abbreviate(null, *)      \u003d null\n     * StringUtils.abbreviate(\"\", 4)        \u003d \"\"\n     * StringUtils.abbreviate(\"abcdefg\", 6) \u003d \"abc...\"\n     * StringUtils.abbreviate(\"abcdefg\", 7) \u003d \"abcdefg\"\n     * StringUtils.abbreviate(\"abcdefg\", 8) \u003d \"abcdefg\"\n     * StringUtils.abbreviate(\"abcdefg\", 4) \u003d \"a...\"\n     * StringUtils.abbreviate(\"abcdefg\", 3) \u003d IllegalArgumentException\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param maxWidth  maximum length of result String, must be at least 4\n     * @return abbreviated String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @throws IllegalArgumentException if the width is too small\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4732,col 9)-(line 4732,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.abbreviate(java.lang.String, int, int)",
      "begin_line": 4770,
      "end_line": 4796,
      "comment": "\n     * \u003cp\u003eAbbreviates a String using ellipses. This will turn\n     * \"Now is the time for all good men\" into \"...is the time for...\"\u003c/p\u003e\n     *\n     * \u003cp\u003eWorks like \u003ccode\u003eabbreviate(String, int)\u003c/code\u003e, but allows you to specify\n     * a \"left edge\" offset.  Note that this left edge is not necessarily going to\n     * be the leftmost character in the result, or the first character following the\n     * ellipses, but it will appear somewhere in the result.\n     *\n     * \u003cp\u003eIn no case will it return a String of length greater than\n     * \u003ccode\u003emaxWidth\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.abbreviate(null, *, *)                \u003d null\n     * StringUtils.abbreviate(\"\", 0, 4)                  \u003d \"\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", -1, 10) \u003d \"abcdefg...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 0, 10)  \u003d \"abcdefg...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 1, 10)  \u003d \"abcdefg...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 4, 10)  \u003d \"abcdefg...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 5, 10)  \u003d \"...fghi...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 6, 10)  \u003d \"...ghij...\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 8, 10)  \u003d \"...ijklmno\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 10, 10) \u003d \"...ijklmno\"\n     * StringUtils.abbreviate(\"abcdefghijklmno\", 12, 10) \u003d \"...ijklmno\"\n     * StringUtils.abbreviate(\"abcdefghij\", 0, 3)        \u003d IllegalArgumentException\n     * StringUtils.abbreviate(\"abcdefghij\", 5, 6)        \u003d IllegalArgumentException\n     * \u003c/pre\u003e\n     *\n     * @param str  the String to check, may be null\n     * @param offset  left edge of source String\n     * @param maxWidth  maximum length of result String, must be at least 4\n     * @return abbreviated String, \u003ccode\u003enull\u003c/code\u003e if null String input\n     * @throws IllegalArgumentException if the width is too small\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4771,col 9)-(line 4773,col 9)",
        "(line 4774,col 9)-(line 4776,col 9)",
        "(line 4777,col 9)-(line 4779,col 9)",
        "(line 4780,col 9)-(line 4782,col 9)",
        "(line 4783,col 9)-(line 4785,col 9)",
        "(line 4786,col 9)-(line 4788,col 9)",
        "(line 4789,col 9)-(line 4791,col 9)",
        "(line 4792,col 9)-(line 4794,col 9)",
        "(line 4795,col 9)-(line 4795,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.difference(java.lang.String, java.lang.String)",
      "begin_line": 4825,
      "end_line": 4837,
      "comment": "\n     * \u003cp\u003eCompares two Strings, and returns the portion where they differ.\n     * (More precisely, return the remainder of the second String,\n     * starting from where it\u0027s different from the first.)\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example,\n     * \u003ccode\u003edifference(\"i am a machine\", \"i am a robot\") -\u003e \"robot\"\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.difference(null, null) \u003d null\n     * StringUtils.difference(\"\", \"\") \u003d \"\"\n     * StringUtils.difference(\"\", \"abc\") \u003d \"abc\"\n     * StringUtils.difference(\"abc\", \"\") \u003d \"\"\n     * StringUtils.difference(\"abc\", \"abc\") \u003d \"\"\n     * StringUtils.difference(\"ab\", \"abxyz\") \u003d \"xyz\"\n     * StringUtils.difference(\"abcde\", \"abxyz\") \u003d \"xyz\"\n     * StringUtils.difference(\"abcde\", \"xyz\") \u003d \"xyz\"\n     * \u003c/pre\u003e\n     *\n     * @param str1  the first String, may be null\n     * @param str2  the second String, may be null\n     * @return the portion of str2 where it differs from str1; returns the\n     * empty String if they are equal\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4826,col 9)-(line 4828,col 9)",
        "(line 4829,col 9)-(line 4831,col 9)",
        "(line 4832,col 9)-(line 4832,col 47)",
        "(line 4833,col 9)-(line 4835,col 9)",
        "(line 4836,col 9)-(line 4836,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.indexOfDifference(java.lang.String, java.lang.String)",
      "begin_line": 4862,
      "end_line": 4879,
      "comment": "\n     * \u003cp\u003eCompares two Strings, and returns the index at which the\n     * Strings begin to differ.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example,\n     * \u003ccode\u003eindexOfDifference(\"i am a machine\", \"i am a robot\") -\u003e 7\u003c/code\u003e\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.indexOfDifference(null, null) \u003d -1\n     * StringUtils.indexOfDifference(\"\", \"\") \u003d -1\n     * StringUtils.indexOfDifference(\"\", \"abc\") \u003d 0\n     * StringUtils.indexOfDifference(\"abc\", \"\") \u003d 0\n     * StringUtils.indexOfDifference(\"abc\", \"abc\") \u003d -1\n     * StringUtils.indexOfDifference(\"ab\", \"abxyz\") \u003d 2\n     * StringUtils.indexOfDifference(\"abcde\", \"abxyz\") \u003d 2\n     * StringUtils.indexOfDifference(\"abcde\", \"xyz\") \u003d 0\n     * \u003c/pre\u003e\n     *\n     * @param str1  the first String, may be null\n     * @param str2  the second String, may be null\n     * @return the index where str2 and str1 begin to differ; -1 if they are equal\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 4863,col 9)-(line 4865,col 9)",
        "(line 4866,col 9)-(line 4868,col 9)",
        "(line 4869,col 9)-(line 4869,col 14)",
        "(line 4870,col 9)-(line 4874,col 9)",
        "(line 4875,col 9)-(line 4877,col 9)",
        "(line 4878,col 9)-(line 4878,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.StringUtils.getLevenshteinDistance(java.lang.String, java.lang.String)",
      "begin_line": 4917,
      "end_line": 4983,
      "comment": "\n     * \u003cp\u003eFind the Levenshtein distance between two Strings.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is the number of changes needed to change one String into\n     * another, where each change is a single character modification (deletion,\n     * insertion or substitution).\u003c/p\u003e\n     *\n     * \u003cp\u003eThe previous implementation of the Levenshtein distance algorithm\n     * was from \u003ca href\u003d\"http://www.merriampark.com/ld.htm\"\u003ehttp://www.merriampark.com/ld.htm\u003c/a\u003e\u003c/p\u003e\n     *\n     * \u003cp\u003eChas Emerick has written an implementation in Java, which avoids an OutOfMemoryError\n     * which can occur when my Java implementation is used with very large strings.\u003cbr\u003e\n     * This implementation of the Levenshtein distance algorithm\n     * is from \u003ca href\u003d\"http://www.merriampark.com/ldjava.htm\"\u003ehttp://www.merriampark.com/ldjava.htm\u003c/a\u003e\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * StringUtils.getLevenshteinDistance(null, *)             \u003d IllegalArgumentException\n     * StringUtils.getLevenshteinDistance(*, null)             \u003d IllegalArgumentException\n     * StringUtils.getLevenshteinDistance(\"\",\"\")               \u003d 0\n     * StringUtils.getLevenshteinDistance(\"\",\"a\")              \u003d 1\n     * StringUtils.getLevenshteinDistance(\"aaapppp\", \"\")       \u003d 7\n     * StringUtils.getLevenshteinDistance(\"frog\", \"fog\")       \u003d 1\n     * StringUtils.getLevenshteinDistance(\"fly\", \"ant\")        \u003d 3\n     * StringUtils.getLevenshteinDistance(\"elephant\", \"hippo\") \u003d 7\n     * StringUtils.getLevenshteinDistance(\"hippo\", \"elephant\") \u003d 7\n     * StringUtils.getLevenshteinDistance(\"hippo\", \"zzzzzzzz\") \u003d 8\n     * StringUtils.getLevenshteinDistance(\"hello\", \"hallo\")    \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @param s  the first String, must not be null\n     * @param t  the second String, must not be null\n     * @return result distance\n     * @throws IllegalArgumentException if either String input \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 4918,col 9)-(line 4920,col 9)",
        "(line 4939,col 9)-(line 4939,col 27)",
        "(line 4940,col 9)-(line 4940,col 27)",
        "(line 4942,col 9)-(line 4946,col 9)",
        "(line 4948,col 9)-(line 4948,col 31)",
        "(line 4949,col 9)-(line 4949,col 31)",
        "(line 4950,col 9)-(line 4950,col 17)",
        "(line 4953,col 9)-(line 4953,col 14)",
        "(line 4954,col 9)-(line 4954,col 14)",
        "(line 4956,col 9)-(line 4956,col 17)",
        "(line 4958,col 9)-(line 4958,col 17)",
        "(line 4960,col 9)-(line 4962,col 9)",
        "(line 4964,col 9)-(line 4978,col 9)",
        "(line 4982,col 9)-(line 4982,col 20)"
      ]
    }
  ]
}