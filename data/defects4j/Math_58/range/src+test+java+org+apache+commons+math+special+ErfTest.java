{
  "filepath": "/tmp/Math-58b/src/test/java/org/apache/commons/math/special/ErfTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ErfTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 29,
      "end_line": 190,
      "comment": "\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.ErfTest.testErf0()",
      "begin_line": 31,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 32,col 9)-(line 32,col 37)",
        "(line 33,col 9)-(line 33,col 30)",
        "(line 34,col 9)-(line 34,col 48)",
        "(line 35,col 9)-(line 35,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.ErfTest.testErf1960()",
      "begin_line": 38,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 46)",
        "(line 40,col 9)-(line 40,col 35)",
        "(line 41,col 9)-(line 41,col 31)",
        "(line 42,col 9)-(line 42,col 47)",
        "(line 43,col 9)-(line 43,col 55)",
        "(line 45,col 9)-(line 45,col 29)",
        "(line 46,col 9)-(line 46,col 29)",
        "(line 47,col 9)-(line 47,col 47)",
        "(line 48,col 9)-(line 48,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.ErfTest.testErf2576()",
      "begin_line": 51,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 46)",
        "(line 53,col 9)-(line 53,col 35)",
        "(line 54,col 9)-(line 54,col 31)",
        "(line 55,col 9)-(line 55,col 47)",
        "(line 56,col 9)-(line 56,col 53)",
        "(line 58,col 9)-(line 58,col 29)",
        "(line 59,col 9)-(line 59,col 29)",
        "(line 60,col 9)-(line 60,col 47)",
        "(line 61,col 9)-(line 61,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.ErfTest.testErf2807()",
      "begin_line": 64,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 46)",
        "(line 66,col 9)-(line 66,col 35)",
        "(line 67,col 9)-(line 67,col 32)",
        "(line 68,col 9)-(line 68,col 47)",
        "(line 69,col 9)-(line 69,col 55)",
        "(line 71,col 9)-(line 71,col 29)",
        "(line 72,col 9)-(line 72,col 29)",
        "(line 73,col 9)-(line 73,col 47)",
        "(line 74,col 9)-(line 74,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.ErfTest.testErf3291()",
      "begin_line": 77,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 46)",
        "(line 79,col 9)-(line 79,col 35)",
        "(line 80,col 9)-(line 80,col 32)",
        "(line 81,col 9)-(line 81,col 47)",
        "(line 82,col 9)-(line 82,col 56)",
        "(line 84,col 9)-(line 84,col 29)",
        "(line 85,col 9)-(line 85,col 29)",
        "(line 86,col 9)-(line 86,col 47)",
        "(line 87,col 9)-(line 87,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.ErfTest.testLargeValues()",
      "begin_line": 93,
      "end_line": 112,
      "comment": "\n     * MATH-301, MATH-456\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 63)",
        "(line 109,col 9)-(line 109,col 62)",
        "(line 110,col 9)-(line 110,col 63)",
        "(line 111,col 9)-(line 111,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.ErfTest.testErfGnu()",
      "begin_line": 118,
      "end_line": 135,
      "comment": "\n     * Compare Erf.erf against reference values computed using GCC 4.2.1 (Apple OSX packaged version)\n     * erfl (extended precision erf).\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 33)",
        "(line 120,col 9)-(line 129,col 24)",
        "(line 130,col 9)-(line 130,col 24)",
        "(line 131,col 9)-(line 134,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.ErfTest.testErfcGnu()",
      "begin_line": 141,
      "end_line": 158,
      "comment": "\n     * Compare Erf.erfc against reference values computed using GCC 4.2.1 (Apple OSX packaged version)\n     * erfcl (extended precision erfc).\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 33)",
        "(line 143,col 9)-(line 152,col 116)",
        "(line 153,col 9)-(line 153,col 24)",
        "(line 154,col 9)-(line 157,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.special.ErfTest.testErfcMaple()",
      "begin_line": 165,
      "end_line": 189,
      "comment": "\n     * Tests erfc against reference data computed using Maple reported in Marsaglia, G,, \n     * \"Evaluating the Normal Distribution,\" Journal of Statistical Software, July, 2004.\n     * http//www.jstatsoft.org/v11/a05/paper\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 183,col 10)",
        "(line 184,col 9)-(line 188,col 9)"
      ]
    }
  ]
}