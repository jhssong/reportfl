{
  "filepath": "/tmp/Lang-4b/src/test/java/org/apache/commons/lang3/HashSetvBitSetTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HashSetvBitSetTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 174,
      "comment": "\n * Test to show whether using BitSet for removeAll() methods is faster than using HashSet.\n "
    },
    {
      "type": "field",
      "varNames": [
        "LOOPS"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " number of times to invoke methods"
    },
    {
      "type": "field",
      "varNames": [
        "LOOPS2"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.HashSetvBitSetTest.testTimes()",
      "begin_line": 33,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 24)",
        "(line 36,col 9)-(line 36,col 23)",
        "(line 37,col 9)-(line 37,col 38)",
        "(line 38,col 9)-(line 38,col 34)",
        "(line 39,col 9)-(line 39,col 35)",
        "(line 40,col 9)-(line 40,col 36)",
        "(line 41,col 9)-(line 41,col 35)",
        "(line 42,col 9)-(line 42,col 36)",
        "(line 43,col 9)-(line 43,col 37)",
        "(line 44,col 9)-(line 44,col 37)",
        "(line 45,col 9)-(line 45,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.HashSetvBitSetTest.printTimes(int)",
      "begin_line": 51,
      "end_line": 57,
      "comment": "\n     * @return bitSet - HashSet\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 48)",
        "(line 53,col 9)-(line 53,col 46)",
        "(line 55,col 9)-(line 55,col 108)",
        "(line 56,col 9)-(line 56,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.HashSetvBitSetTest.timeHashSet(int)",
      "begin_line": 59,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 35)",
        "(line 61,col 9)-(line 61,col 45)",
        "(line 62,col 9)-(line 64,col 9)",
        "(line 65,col 9)-(line 65,col 55)",
        "(line 66,col 9)-(line 66,col 50)",
        "(line 67,col 9)-(line 67,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.HashSetvBitSetTest.timeBitSet(int)",
      "begin_line": 70,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 35)",
        "(line 72,col 9)-(line 72,col 45)",
        "(line 73,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 55)",
        "(line 77,col 9)-(line 77,col 50)",
        "(line 78,col 9)-(line 78,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.HashSetvBitSetTest.testHashSet(int)",
      "begin_line": 81,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 65)",
        "(line 84,col 13)-(line 84,col 26)",
        "(line 85,col 13)-(line 87,col 13)",
        "(line 88,col 13)-(line 88,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.HashSetvBitSetTest.testBitSet(int)",
      "begin_line": 91,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 45)",
        "(line 93,col 9)-(line 93,col 22)",
        "(line 94,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.HashSetvBitSetTest.extractIndices(java.util.HashSet\u003cjava.lang.Integer\u003e)",
      "begin_line": 101,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 50)",
        "(line 103,col 9)-(line 103,col 18)",
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.HashSetvBitSetTest.extractIndices(java.util.BitSet)",
      "begin_line": 110,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 57)",
        "(line 112,col 9)-(line 112,col 18)",
        "(line 113,col 9)-(line 113,col 16)",
        "(line 114,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.HashSetvBitSetTest.testTimesExtractOrBitset()",
      "begin_line": 120,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 45)",
        "(line 123,col 9)-(line 123,col 41)",
        "(line 124,col 9)-(line 124,col 29)",
        "(line 125,col 9)-(line 125,col 45)",
        "(line 126,col 9)-(line 126,col 46)",
        "(line 127,col 9)-(line 127,col 42)",
        "(line 128,col 9)-(line 128,col 39)",
        "(line 129,col 9)-(line 129,col 39)",
        "(line 130,col 9)-(line 130,col 40)",
        "(line 131,col 9)-(line 131,col 40)",
        "(line 132,col 9)-(line 132,col 41)",
        "(line 133,col 9)-(line 133,col 41)",
        "(line 134,col 9)-(line 134,col 42)",
        "(line 135,col 9)-(line 135,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.HashSetvBitSetTest.printTimes(int, int)",
      "begin_line": 138,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 47)",
        "(line 140,col 9)-(line 140,col 43)",
        "(line 141,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 64)",
        "(line 145,col 9)-(line 145,col 65)",
        "(line 147,col 9)-(line 147,col 151)",
        "(line 148,col 9)-(line 148,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.HashSetvBitSetTest.timeBitSetRemoveAll(int[], java.util.BitSet)",
      "begin_line": 151,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 34)",
        "(line 153,col 9)-(line 153,col 45)",
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 43)",
        "(line 158,col 9)-(line 158,col 80)",
        "(line 159,col 9)-(line 159,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.HashSetvBitSetTest.timeExtractRemoveAll(int[], java.util.BitSet)",
      "begin_line": 162,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 34)",
        "(line 164,col 9)-(line 164,col 45)",
        "(line 165,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 43)",
        "(line 170,col 9)-(line 170,col 80)",
        "(line 171,col 9)-(line 171,col 27)"
      ]
    }
  ]
}