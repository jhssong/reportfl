{
  "filepath": "/tmp/Lang-60b/src/java/org/apache/commons/lang/CharSetUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharSetUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 391,
      "comment": "\n * \u003cp\u003eOperations on \u003ccode\u003eCharSet\u003c/code\u003es.\u003c/p\u003e\n *\n * \u003cp\u003eThis class handles \u003ccode\u003enull\u003c/code\u003e input gracefully.\n * An exception will not be thrown for a \u003ccode\u003enull\u003c/code\u003e input.\n * Each method documents its behaviour in more detail.\u003c/p\u003e\n * \n * @see CharSet\n * @author \u003ca href\u003d\"bayard@generationjava.com\"\u003eHenri Yandell\u003c/a\u003e\n * @author Stephen Colebourne\n * @author Phil Steitz\n * @author Gary Gregory\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.CharSetUtils.CharSetUtils()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * \u003cp\u003eCharSetUtils instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as \u003ccode\u003eCharSetUtils.evaluateSet(null);\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 44,col 7)-(line 44,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharSetUtils.evaluateSet(java.lang.String[])",
      "begin_line": 70,
      "end_line": 75,
      "comment": "\n     * \u003cp\u003eCreates a \u003ccode\u003eCharSet\u003c/code\u003e instance which allows a certain amount of\n     * set logic to be performed.\u003c/p\u003e\n     * \u003cp\u003eThe syntax is:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003e\u0026quot;aeio\u0026quot; which implies \u0027a\u0027,\u0027e\u0027,..\u003c/li\u003e\n     *  \u003cli\u003e\u0026quot;^e\u0026quot; implies not e.\u003c/li\u003e\n     *  \u003cli\u003e\u0026quot;ej-m\u0026quot; implies e,j-\u0026gt;m. e,j,k,l,m.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * \u003cpre\u003e\n     * CharSetUtils.evaluateSet(null)    \u003d null\n     * CharSetUtils.evaluateSet([])      \u003d CharSet matching nothing\n     * CharSetUtils.evaluateSet([\"a-e\"]) \u003d CharSet matching a,b,c,d,e\n     * \u003c/pre\u003e\n     *\n     * @param set  the set, may be null\n     * @return a CharSet instance, \u003ccode\u003enull\u003c/code\u003e if null input\n     * @deprecated Use {@link CharSet#getInstance(String)}.\n     *             Method will be removed in Commons Lang 3.0.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 74,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharSetUtils.squeeze(java.lang.String, java.lang.String)",
      "begin_line": 97,
      "end_line": 104,
      "comment": "\n     * \u003cp\u003eSqueezes any repetitions of a character that is mentioned in the\n     * supplied set.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * CharSetUtils.squeeze(null, *)        \u003d null\n     * CharSetUtils.squeeze(\"\", *)          \u003d \"\"\n     * CharSetUtils.squeeze(*, null)        \u003d *\n     * CharSetUtils.squeeze(*, \"\")          \u003d *\n     * CharSetUtils.squeeze(\"hello\", \"k-p\") \u003d \"helo\"\n     * CharSetUtils.squeeze(\"hello\", \"a-e\") \u003d \"hello\"\n     * \u003c/pre\u003e\n     *\n     * @see #evaluateSet(java.lang.String[]) for set-syntax.\n     * @param str  the string to squeeze, may be null\n     * @param set  the character set to use for manipulation, may be null\n     * @return modified String, \u003ccode\u003enull\u003c/code\u003e if null string input\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 38)",
        "(line 102,col 9)-(line 102,col 22)",
        "(line 103,col 9)-(line 103,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharSetUtils.squeeze(java.lang.String, java.lang.String[])",
      "begin_line": 120,
      "end_line": 141,
      "comment": "\n     * \u003cp\u003eSqueezes any repetitions of a character that is mentioned in the\n     * supplied set.\u003c/p\u003e\n     *\n     * \u003cp\u003eAn example is:\u003c/p\u003e\n     * \u003cul\u003e\n     *   \u003cli\u003esqueeze(\u0026quot;hello\u0026quot;, {\u0026quot;el\u0026quot;}) \u003d\u003e \u0026quot;helo\u0026quot;\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @see #evaluateSet(java.lang.String[]) for set-syntax.\n     * @param str  the string to squeeze, may be null\n     * @param set  the character set to use for manipulation, may be null\n     * @return modified String, \u003ccode\u003enull\u003c/code\u003e if null string input\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 41)",
        "(line 125,col 9)-(line 125,col 61)",
        "(line 126,col 9)-(line 126,col 40)",
        "(line 127,col 9)-(line 127,col 29)",
        "(line 128,col 9)-(line 128,col 28)",
        "(line 129,col 9)-(line 129,col 22)",
        "(line 130,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharSetUtils.count(java.lang.String, java.lang.String)",
      "begin_line": 163,
      "end_line": 170,
      "comment": "\n     * \u003cp\u003eTakes an argument in set-syntax, see evaluateSet,\n     * and returns the number of characters present in the specified string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * CharSetUtils.count(null, *)        \u003d 0\n     * CharSetUtils.count(\"\", *)          \u003d 0\n     * CharSetUtils.count(*, null)        \u003d 0\n     * CharSetUtils.count(*, \"\")          \u003d 0\n     * CharSetUtils.count(\"hello\", \"k-p\") \u003d 3\n     * CharSetUtils.count(\"hello\", \"a-e\") \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @see #evaluateSet(java.lang.String[]) for set-syntax.\n     * @param str  String to count characters in, may be null\n     * @param set  String set of characters to count, may be null\n     * @return character count, zero if null string input\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 38)",
        "(line 168,col 9)-(line 168,col 22)",
        "(line 169,col 9)-(line 169,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharSetUtils.count(java.lang.String, java.lang.String[])",
      "begin_line": 186,
      "end_line": 200,
      "comment": "\n     * \u003cp\u003eTakes an argument in set-syntax, see evaluateSet,\n     * and returns the number of characters present in the specified string.\u003c/p\u003e\n     *\n     * \u003cp\u003eAn example would be:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003ecount(\u0026quot;hello\u0026quot;, {\u0026quot;c-f\u0026quot;, \u0026quot;o\u0026quot;}) returns 2.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @see #evaluateSet(java.lang.String[]) for set-syntax.\n     * @param str  String to count characters in, may be null\n     * @param set  String[] set of characters to count, may be null\n     * @return character count, zero if null string input\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 41)",
        "(line 191,col 9)-(line 191,col 22)",
        "(line 192,col 9)-(line 192,col 40)",
        "(line 193,col 9)-(line 193,col 29)",
        "(line 194,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharSetUtils.keep(java.lang.String, java.lang.String)",
      "begin_line": 223,
      "end_line": 233,
      "comment": "\n     * \u003cp\u003eTakes an argument in set-syntax, see evaluateSet,\n     * and keeps any of characters present in the specified string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * CharSetUtils.keep(null, *)        \u003d null\n     * CharSetUtils.keep(\"\", *)          \u003d \"\"\n     * CharSetUtils.keep(*, null)        \u003d \"\"\n     * CharSetUtils.keep(*, \"\")          \u003d \"\"\n     * CharSetUtils.keep(\"hello\", \"hl\")  \u003d \"hll\"\n     * CharSetUtils.keep(\"hello\", \"le\")  \u003d \"ell\"\n     * \u003c/pre\u003e\n     *\n     * @see #evaluateSet(java.lang.String[]) for set-syntax.\n     * @param str  String to keep characters from, may be null\n     * @param set  String set of characters to keep, may be null\n     * @return modified String, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 230,col 38)",
        "(line 231,col 9)-(line 231,col 22)",
        "(line 232,col 9)-(line 232,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharSetUtils.keep(java.lang.String, java.lang.String[])",
      "begin_line": 251,
      "end_line": 259,
      "comment": "\n     * \u003cp\u003eTakes an argument in set-syntax, see evaluateSet,\n     * and keeps any of characters present in the specified string.\u003c/p\u003e\n     *\n     * \u003cp\u003eAn example would be:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003ekeep(\u0026quot;hello\u0026quot;, {\u0026quot;c-f\u0026quot;, \u0026quot;o\u0026quot;})\n     *   returns \u0026quot;eo\u0026quot;\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @see #evaluateSet(java.lang.String[]) for set-syntax.\n     * @param str  String to keep characters from, may be null\n     * @param set  String[] set of characters to keep, may be null\n     * @return modified String, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 258,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharSetUtils.delete(java.lang.String, java.lang.String)",
      "begin_line": 281,
      "end_line": 288,
      "comment": "\n     * \u003cp\u003eTakes an argument in set-syntax, see evaluateSet,\n     * and deletes any of characters present in the specified string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * CharSetUtils.delete(null, *)        \u003d null\n     * CharSetUtils.delete(\"\", *)          \u003d \"\"\n     * CharSetUtils.delete(*, null)        \u003d *\n     * CharSetUtils.delete(*, \"\")          \u003d *\n     * CharSetUtils.delete(\"hello\", \"hl\")  \u003d \"eo\"\n     * CharSetUtils.delete(\"hello\", \"le\")  \u003d \"ho\"\n     * \u003c/pre\u003e\n     *\n     * @see #evaluateSet(java.lang.String[]) for set-syntax.\n     * @param str  String to delete characters from, may be null\n     * @param set  String set of characters to delete, may be null\n     * @return modified String, \u003ccode\u003enull\u003c/code\u003e if null string input\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 285,col 38)",
        "(line 286,col 9)-(line 286,col 22)",
        "(line 287,col 9)-(line 287,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharSetUtils.delete(java.lang.String, java.lang.String[])",
      "begin_line": 305,
      "end_line": 310,
      "comment": "\n     * \u003cp\u003eTakes an argument in set-syntax, see evaluateSet,\n     * and deletes any of characters present in the specified string.\u003c/p\u003e\n     *\n     * \u003cp\u003eAn example would be:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003edelete(\u0026quot;hello\u0026quot;, {\u0026quot;c-f\u0026quot;, \u0026quot;o\u0026quot;}) returns\n     *   \u0026quot;hll\u0026quot;\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @see #evaluateSet(java.lang.String[]) for set-syntax.\n     * @param str  String to delete characters from, may be null\n     * @param set  String[] set of characters to delete, may be null\n     * @return modified String, \u003ccode\u003enull\u003c/code\u003e if null string input\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 309,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharSetUtils.modify(java.lang.String, java.lang.String[], boolean)",
      "begin_line": 321,
      "end_line": 332,
      "comment": "\n     * Implementation of delete and keep\n     *\n     * @param str String to modify characters within\n     * @param set String[] set of characters to modify\n     * @param expect whether to evaluate on match, or non-match\n     * @return modified String\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 41)",
        "(line 323,col 9)-(line 323,col 61)",
        "(line 324,col 9)-(line 324,col 40)",
        "(line 325,col 9)-(line 325,col 29)",
        "(line 326,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 331,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.CharSetUtils.translate(java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 368,
      "end_line": 389,
      "comment": "\n     * \u003cp\u003eTranslate characters in a String.\n     * This is a multi character search and replace routine.\u003c/p\u003e\n     *\n     * \u003cp\u003eAn example is:\u003c/p\u003e\n     * \u003cul\u003e\n     *   \u003cli\u003etranslate(\u0026quot;hello\u0026quot;, \u0026quot;ho\u0026quot;, \u0026quot;jy\u0026quot;)\n     *    \u003d\u0026gt; jelly\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eIf the length of characters to search for is greater than the\n     * length of characters to replace, then the last character is \n     * used.\u003c/p\u003e\n     * \n     * \u003cpre\u003e\n     * CharSetUtils.translate(null, *, *) \u003d null\n     * CharSetUtils.translate(\"\", *, *)   \u003d \"\"\n     * \u003c/pre\u003e\n     *\n     * @param str  String to replace characters in, may be null\n     * @param searchChars   a set of characters to search for, must not be null\n     * @param replaceChars  a set of characters to replace, must not be null or empty (\u0026quot;\u0026quot;)\n     * @return translated String, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * @throws NullPointerException if \u003ccode\u003esearchChars\u003c/code\u003e or \u003ccode\u003ereplaceChars\u003c/code\u003e \n     *  is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003ereplaceChars\u003c/code\u003e is empty (\u0026quot;\u0026quot;)\n     * @deprecated Use {@link StringUtils#replaceChars(String, String, String)}.\n     *             Method will be removed in Commons Lang 3.0.\n     *  NOTE: StringUtils#replaceChars behaves differently when \u0027searchChars\u0027 is longer\n     *  than \u0027replaceChars\u0027. CharSetUtils#translate will use the last char of the replacement\n     *  string whereas StringUtils#replaceChars will delete\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 372,col 61)",
        "(line 373,col 9)-(line 373,col 40)",
        "(line 374,col 9)-(line 374,col 53)",
        "(line 375,col 9)-(line 375,col 29)",
        "(line 376,col 9)-(line 376,col 48)",
        "(line 377,col 9)-(line 387,col 9)",
        "(line 388,col 9)-(line 388,col 33)"
      ]
    }
  ]
}