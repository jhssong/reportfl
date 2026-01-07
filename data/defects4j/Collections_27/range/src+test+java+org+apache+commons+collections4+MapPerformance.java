{
  "filepath": "/tmp/Collections-27b/src/test/java/org/apache/commons/collections4/MapPerformance.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MapPerformance",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 171,
      "comment": "\n * \u003ccode\u003eMapPerformanceTest\u003c/code\u003e is designed to perform basic Map performance tests.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "RUNS"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " The total number of runs for each test "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapPerformance.main(java.lang.String[])",
      "begin_line": 39,
      "end_line": 41,
      "comment": "\n     * Main method\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapPerformance.testAll()",
      "begin_line": 43,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 76)",
        "(line 45,col 9)-(line 45,col 74)",
        "(line 50,col 9)-(line 50,col 82)",
        "(line 51,col 9)-(line 51,col 36)",
        "(line 63,col 9)-(line 63,col 47)",
        "(line 64,col 9)-(line 64,col 47)",
        "(line 65,col 9)-(line 65,col 47)",
        "(line 66,col 9)-(line 66,col 47)",
        "(line 67,col 9)-(line 67,col 47)",
        "(line 69,col 9)-(line 69,col 47)",
        "(line 70,col 9)-(line 70,col 47)",
        "(line 71,col 9)-(line 71,col 47)",
        "(line 73,col 9)-(line 73,col 47)",
        "(line 74,col 9)-(line 74,col 47)",
        "(line 75,col 9)-(line 75,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapPerformance.test(java.util.Map\u003cjava.lang.String, java.lang.String\u003e, java.lang.String)",
      "begin_line": 110,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 32)",
        "(line 113,col 9)-(line 113,col 43)",
        "(line 114,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 41)",
        "(line 129,col 9)-(line 129,col 49)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DummyMap",
      "is_interface": false,
      "parent_types": [
        "java.util.Map\u003cK, V\u003e"
      ],
      "begin_line": 134,
      "end_line": 169,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapPerformance.DummyMap.clear()",
      "begin_line": 135,
      "end_line": 136,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapPerformance.DummyMap.containsKey(java.lang.Object)",
      "begin_line": 137,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 13)-(line 138,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapPerformance.DummyMap.containsValue(java.lang.Object)",
      "begin_line": 140,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 141,col 13)-(line 141,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapPerformance.DummyMap.entrySet()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 144,col 13)-(line 144,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapPerformance.DummyMap.get(java.lang.Object)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 147,col 13)-(line 147,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapPerformance.DummyMap.isEmpty()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 150,col 13)-(line 150,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapPerformance.DummyMap.keySet()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 13)-(line 153,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapPerformance.DummyMap.put(K, V)",
      "begin_line": 155,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 156,col 13)-(line 156,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapPerformance.DummyMap.putAll(java.util.Map\u003c? extends K, ? extends V\u003e)",
      "begin_line": 158,
      "end_line": 159,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapPerformance.DummyMap.remove(java.lang.Object)",
      "begin_line": 160,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 161,col 13)-(line 161,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapPerformance.DummyMap.size()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 13)-(line 164,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MapPerformance.DummyMap.values()",
      "begin_line": 166,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 167,col 13)-(line 167,col 24)"
      ]
    }
  ]
}