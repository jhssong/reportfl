{
  "filepath": "/tmp/Collections-26b/src/test/java/org/apache/commons/collections4/collection/PredicatedCollectionBuilderTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PredicatedCollectionBuilderTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 144,
      "comment": "\n * Tests the PredicatedCollection.Builder class.\n * \n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollectionBuilderTest.addPass()",
      "begin_line": 41,
      "end_line": 46,
      "comment": "\n     * Verify that passing the Predicate means ending up in the buffer.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 93)",
        "(line 44,col 9)-(line 44,col 28)",
        "(line 45,col 9)-(line 45,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollectionBuilderTest.addFail()",
      "begin_line": 51,
      "end_line": 58,
      "comment": "\n     * Verify that failing the Predicate means NOT ending up in the buffer.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 93)",
        "(line 54,col 9)-(line 54,col 35)",
        "(line 55,col 9)-(line 55,col 68)",
        "(line 57,col 9)-(line 57,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollectionBuilderTest.addAllPass()",
      "begin_line": 63,
      "end_line": 68,
      "comment": "\n     * Verify that only items that pass the Predicate end up in the buffer.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 93)",
        "(line 66,col 9)-(line 66,col 62)",
        "(line 67,col 9)-(line 67,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollectionBuilderTest.createPredicatedCollectionWithNotNullPredicate()",
      "begin_line": 70,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 93)",
        "(line 73,col 9)-(line 73,col 29)",
        "(line 74,col 9)-(line 74,col 35)",
        "(line 76,col 9)-(line 76,col 69)",
        "(line 77,col 9)-(line 77,col 51)",
        "(line 79,col 9)-(line 79,col 66)",
        "(line 80,col 9)-(line 80,col 50)",
        "(line 82,col 9)-(line 82,col 66)",
        "(line 83,col 9)-(line 83,col 50)",
        "(line 85,col 9)-(line 85,col 72)",
        "(line 86,col 9)-(line 86,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollectionBuilderTest.checkPredicatedCollection1(java.util.Collection\u003cjava.lang.String\u003e)",
      "begin_line": 89,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 50)",
        "(line 92,col 9)-(line 92,col 32)",
        "(line 93,col 9)-(line 93,col 50)",
        "(line 95,col 9)-(line 100,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollectionBuilderTest.createPredicatedCollectionWithPredicate()",
      "begin_line": 103,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 44)",
        "(line 106,col 9)-(line 106,col 88)",
        "(line 108,col 9)-(line 108,col 23)",
        "(line 109,col 9)-(line 109,col 23)",
        "(line 110,col 9)-(line 110,col 23)",
        "(line 112,col 9)-(line 112,col 70)",
        "(line 113,col 9)-(line 113,col 51)",
        "(line 115,col 9)-(line 115,col 67)",
        "(line 116,col 9)-(line 116,col 50)",
        "(line 118,col 9)-(line 118,col 67)",
        "(line 119,col 9)-(line 119,col 50)",
        "(line 121,col 9)-(line 121,col 73)",
        "(line 122,col 9)-(line 122,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollectionBuilderTest.checkPredicatedCollection2(java.util.Collection\u003cjava.lang.Integer\u003e)",
      "begin_line": 125,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 50)",
        "(line 128,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 50)",
        "(line 135,col 9)-(line 135,col 26)",
        "(line 136,col 9)-(line 136,col 50)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OddPredicate",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Predicate\u003cjava.lang.Integer\u003e"
      ],
      "begin_line": 139,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.PredicatedCollectionBuilderTest.OddPredicate.evaluate(java.lang.Integer)",
      "begin_line": 140,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 141,col 13)-(line 141,col 34)"
      ]
    }
  ]
}