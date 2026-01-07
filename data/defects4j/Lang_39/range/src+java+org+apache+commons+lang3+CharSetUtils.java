{
  "filepath": "/tmp/Lang-39b/src/java/org/apache/commons/lang3/CharSetUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CharSetUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 303,
      "comment": "\n * \u003cp\u003eOperations on \u003ccode\u003eCharSet\u003c/code\u003es.\u003c/p\u003e\n *\n * \u003cp\u003eThis class handles \u003ccode\u003enull\u003c/code\u003e input gracefully.\n * An exception will not be thrown for a \u003ccode\u003enull\u003c/code\u003e input.\n * Each method documents its behaviour in more detail.\u003c/p\u003e\n * \n * @see CharSet\n * @author Apache Software Foundation\n * @author Phil Steitz\n * @author Gary Gregory\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.CharSetUtils.CharSetUtils()",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * \u003cp\u003eCharSetUtils instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as \u003ccode\u003eCharSetUtils.evaluateSet(null);\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 43,col 7)-(line 43,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSetUtils.squeeze(java.lang.String, java.lang.String)",
      "begin_line": 66,
      "end_line": 73,
      "comment": "\n     * \u003cp\u003eSqueezes any repetitions of a character that is mentioned in the\n     * supplied set.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * CharSetUtils.squeeze(null, *)        \u003d null\n     * CharSetUtils.squeeze(\"\", *)          \u003d \"\"\n     * CharSetUtils.squeeze(*, null)        \u003d *\n     * CharSetUtils.squeeze(*, \"\")          \u003d *\n     * CharSetUtils.squeeze(\"hello\", \"k-p\") \u003d \"helo\"\n     * CharSetUtils.squeeze(\"hello\", \"a-e\") \u003d \"hello\"\n     * \u003c/pre\u003e\n     *\n     * @see CharSet#getInstance(java.lang.String) for set-syntax.\n     * @param str  the string to squeeze, may be null\n     * @param set  the character set to use for manipulation, may be null\n     * @return modified String, \u003ccode\u003enull\u003c/code\u003e if null string input\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 70,col 38)",
        "(line 71,col 9)-(line 71,col 22)",
        "(line 72,col 9)-(line 72,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSetUtils.squeeze(java.lang.String, java.lang.String[])",
      "begin_line": 89,
      "end_line": 110,
      "comment": "\n     * \u003cp\u003eSqueezes any repetitions of a character that is mentioned in the\n     * supplied set.\u003c/p\u003e\n     *\n     * \u003cp\u003eAn example is:\u003c/p\u003e\n     * \u003cul\u003e\n     *   \u003cli\u003esqueeze(\u0026quot;hello\u0026quot;, {\u0026quot;el\u0026quot;}) \u003d\u003e \u0026quot;helo\u0026quot;\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @see CharSet#getInstance(java.lang.String) for set-syntax.\n     * @param str  the string to squeeze, may be null\n     * @param set  the character set to use for manipulation, may be null\n     * @return modified String, \u003ccode\u003enull\u003c/code\u003e if null string input\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 49)",
        "(line 94,col 9)-(line 94,col 63)",
        "(line 95,col 9)-(line 95,col 40)",
        "(line 96,col 9)-(line 96,col 29)",
        "(line 97,col 9)-(line 97,col 28)",
        "(line 98,col 9)-(line 98,col 22)",
        "(line 99,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSetUtils.count(java.lang.String, java.lang.String)",
      "begin_line": 132,
      "end_line": 139,
      "comment": "\n     * \u003cp\u003eTakes an argument in set-syntax, see evaluateSet,\n     * and returns the number of characters present in the specified string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * CharSetUtils.count(null, *)        \u003d 0\n     * CharSetUtils.count(\"\", *)          \u003d 0\n     * CharSetUtils.count(*, null)        \u003d 0\n     * CharSetUtils.count(*, \"\")          \u003d 0\n     * CharSetUtils.count(\"hello\", \"k-p\") \u003d 3\n     * CharSetUtils.count(\"hello\", \"a-e\") \u003d 1\n     * \u003c/pre\u003e\n     *\n     * @see CharSet#getInstance(java.lang.String) for set-syntax.\n     * @param str  String to count characters in, may be null\n     * @param set  String set of characters to count, may be null\n     * @return character count, zero if null string input\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 38)",
        "(line 137,col 9)-(line 137,col 22)",
        "(line 138,col 9)-(line 138,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSetUtils.count(java.lang.String, java.lang.String[])",
      "begin_line": 155,
      "end_line": 169,
      "comment": "\n     * \u003cp\u003eTakes an argument in set-syntax, see evaluateSet,\n     * and returns the number of characters present in the specified string.\u003c/p\u003e\n     *\n     * \u003cp\u003eAn example would be:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003ecount(\u0026quot;hello\u0026quot;, {\u0026quot;c-f\u0026quot;, \u0026quot;o\u0026quot;}) returns 2.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @see CharSet#getInstance(java.lang.String) for set-syntax.\n     * @param str  String to count characters in, may be null\n     * @param set  String[] set of characters to count, may be null\n     * @return character count, zero if null string input\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 49)",
        "(line 160,col 9)-(line 160,col 22)",
        "(line 161,col 9)-(line 161,col 40)",
        "(line 162,col 9)-(line 162,col 29)",
        "(line 163,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSetUtils.keep(java.lang.String, java.lang.String)",
      "begin_line": 192,
      "end_line": 202,
      "comment": "\n     * \u003cp\u003eTakes an argument in set-syntax, see evaluateSet,\n     * and keeps any of characters present in the specified string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * CharSetUtils.keep(null, *)        \u003d null\n     * CharSetUtils.keep(\"\", *)          \u003d \"\"\n     * CharSetUtils.keep(*, null)        \u003d \"\"\n     * CharSetUtils.keep(*, \"\")          \u003d \"\"\n     * CharSetUtils.keep(\"hello\", \"hl\")  \u003d \"hll\"\n     * CharSetUtils.keep(\"hello\", \"le\")  \u003d \"ell\"\n     * \u003c/pre\u003e\n     *\n     * @see CharSet#getInstance(java.lang.String) for set-syntax.\n     * @param str  String to keep characters from, may be null\n     * @param set  String set of characters to keep, may be null\n     * @return modified String, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 38)",
        "(line 200,col 9)-(line 200,col 22)",
        "(line 201,col 9)-(line 201,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSetUtils.keep(java.lang.String, java.lang.String[])",
      "begin_line": 220,
      "end_line": 228,
      "comment": "\n     * \u003cp\u003eTakes an argument in set-syntax, see evaluateSet,\n     * and keeps any of characters present in the specified string.\u003c/p\u003e\n     *\n     * \u003cp\u003eAn example would be:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003ekeep(\u0026quot;hello\u0026quot;, {\u0026quot;c-f\u0026quot;, \u0026quot;o\u0026quot;})\n     *   returns \u0026quot;eo\u0026quot;\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @see CharSet#getInstance(java.lang.String) for set-syntax.\n     * @param str  String to keep characters from, may be null\n     * @param set  String[] set of characters to keep, may be null\n     * @return modified String, \u003ccode\u003enull\u003c/code\u003e if null string input\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 227,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSetUtils.delete(java.lang.String, java.lang.String)",
      "begin_line": 250,
      "end_line": 257,
      "comment": "\n     * \u003cp\u003eTakes an argument in set-syntax, see evaluateSet,\n     * and deletes any of characters present in the specified string.\u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * CharSetUtils.delete(null, *)        \u003d null\n     * CharSetUtils.delete(\"\", *)          \u003d \"\"\n     * CharSetUtils.delete(*, null)        \u003d *\n     * CharSetUtils.delete(*, \"\")          \u003d *\n     * CharSetUtils.delete(\"hello\", \"hl\")  \u003d \"eo\"\n     * CharSetUtils.delete(\"hello\", \"le\")  \u003d \"ho\"\n     * \u003c/pre\u003e\n     *\n     * @see CharSet#getInstance(java.lang.String) for set-syntax.\n     * @param str  String to delete characters from, may be null\n     * @param set  String set of characters to delete, may be null\n     * @return modified String, \u003ccode\u003enull\u003c/code\u003e if null string input\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 254,col 38)",
        "(line 255,col 9)-(line 255,col 22)",
        "(line 256,col 9)-(line 256,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSetUtils.delete(java.lang.String, java.lang.String[])",
      "begin_line": 274,
      "end_line": 279,
      "comment": "\n     * \u003cp\u003eTakes an argument in set-syntax, see evaluateSet,\n     * and deletes any of characters present in the specified string.\u003c/p\u003e\n     *\n     * \u003cp\u003eAn example would be:\u003c/p\u003e\n     * \u003cul\u003e\n     *  \u003cli\u003edelete(\u0026quot;hello\u0026quot;, {\u0026quot;c-f\u0026quot;, \u0026quot;o\u0026quot;}) returns\n     *   \u0026quot;hll\u0026quot;\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @see CharSet#getInstance(java.lang.String) for set-syntax.\n     * @param str  String to delete characters from, may be null\n     * @param set  String[] set of characters to delete, may be null\n     * @return modified String, \u003ccode\u003enull\u003c/code\u003e if null string input\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 278,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.CharSetUtils.modify(java.lang.String, java.lang.String[], boolean)",
      "begin_line": 290,
      "end_line": 301,
      "comment": "\n     * Implementation of delete and keep\n     *\n     * @param str String to modify characters within\n     * @param set String[] set of characters to modify\n     * @param expect whether to evaluate on match, or non-match\n     * @return modified String\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 49)",
        "(line 292,col 9)-(line 292,col 63)",
        "(line 293,col 9)-(line 293,col 40)",
        "(line 294,col 9)-(line 294,col 29)",
        "(line 295,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 300,col 33)"
      ]
    }
  ]
}