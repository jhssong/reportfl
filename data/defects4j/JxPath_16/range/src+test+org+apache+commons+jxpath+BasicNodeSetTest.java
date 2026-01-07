{
  "filepath": "/tmp/JxPath-16b/src/test/org/apache/commons/jxpath/BasicNodeSetTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BasicNodeSetTest",
      "is_interface": false,
      "parent_types": [
        "JXPathTestCase"
      ],
      "begin_line": 31,
      "end_line": 161,
      "comment": "\n * Test BasicNodeSet\n * \n * @author Matt Benson\n * @version $Revision$ $Date: 2007-12-10 15:15:27 -0600 (Mon, 10 Dec\n *          2007) $\n "
    },
    {
      "type": "field",
      "varNames": [
        "context"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " JXPathContext "
    },
    {
      "type": "field",
      "varNames": [
        "nodeSet"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " BasicNodeSet "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.BasicNodeSetTest.BasicNodeSetTest(java.lang.String)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Create a new BasicNodeSetTest.\n     * \n     * @param name testcase name\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.BasicNodeSetTest.setUp()",
      "begin_line": 51,
      "end_line": 55,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 22)",
        "(line 53,col 9)-(line 53,col 69)",
        "(line 54,col 9)-(line 54,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.BasicNodeSetTest.addPointers(java.lang.String)",
      "begin_line": 62,
      "end_line": 67,
      "comment": "\n     * Add the pointers for the specified path to \u003ccode\u003enodeSet\u003c/code\u003e.\n     * \n     * @param xpath\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 66,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.BasicNodeSetTest.removePointers(java.lang.String)",
      "begin_line": 74,
      "end_line": 79,
      "comment": "\n     * Remove the pointers for the specified path from \u003ccode\u003enodeSet\u003c/code\u003e.\n     * \n     * @param xpath\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 78,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.BasicNodeSetTest.nudge()",
      "begin_line": 84,
      "end_line": 88,
      "comment": "\n     * \"Nudge\" the nodeSet.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 30)",
        "(line 86,col 9)-(line 86,col 28)",
        "(line 87,col 9)-(line 87,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.BasicNodeSetTest.testAdd()",
      "begin_line": 93,
      "end_line": 101,
      "comment": "\n     * Test adding pointers.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 38)",
        "(line 95,col 9)-(line 96,col 91)",
        "(line 97,col 9)-(line 98,col 54)",
        "(line 99,col 9)-(line 100,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.BasicNodeSetTest.testRemove()",
      "begin_line": 106,
      "end_line": 115,
      "comment": "\n     * Test removing a pointer.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 38)",
        "(line 108,col 9)-(line 108,col 44)",
        "(line 109,col 9)-(line 110,col 63)",
        "(line 111,col 9)-(line 112,col 37)",
        "(line 113,col 9)-(line 114,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.BasicNodeSetTest.testNodes()",
      "begin_line": 120,
      "end_line": 131,
      "comment": "\n     * Demonstrate when nodes !\u003d values:  in XML models.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 48)",
        "(line 122,col 9)-(line 126,col 50)",
        "(line 127,col 9)-(line 128,col 37)",
        "(line 129,col 9)-(line 129,col 97)",
        "(line 130,col 9)-(line 130,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.BasicNodeSetTest.assertElementNames(java.util.List, java.util.List)",
      "begin_line": 138,
      "end_line": 145,
      "comment": "\n     * Do assertions on DOM element names.\n     * @param names List of expected names\n     * @param elements List of DOM elements\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 52)",
        "(line 140,col 9)-(line 140,col 45)",
        "(line 141,col 9)-(line 141,col 51)",
        "(line 142,col 9)-(line 144,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.BasicNodeSetTest.assertElementValues(java.util.List, java.util.List)",
      "begin_line": 152,
      "end_line": 160,
      "comment": "\n     * Do assertions on DOM element values.\n     * @param values List of expected values\n     * @param elements List of DOM elements\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 53)",
        "(line 154,col 9)-(line 154,col 47)",
        "(line 155,col 9)-(line 155,col 51)",
        "(line 156,col 9)-(line 158,col 9)"
      ]
    }
  ]
}