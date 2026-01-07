{
  "filepath": "/tmp/Math-46b/src/test/java/org/apache/commons/math/random/BitsStreamGeneratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BitsStreamGeneratorTest",
      "is_interface": false,
      "parent_types": [
        "RandomGeneratorAbstractTest"
      ],
      "begin_line": 27,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.BitsStreamGeneratorTest.BitsStreamGeneratorTest()",
      "begin_line": 29,
      "end_line": 31,
      "comment": "",
      "child_ranges": [
        "(line 30,col 9)-(line 30,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGeneratorTest.makeGenerator()",
      "begin_line": 33,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 65)",
        "(line 35,col 9)-(line 35,col 32)",
        "(line 36,col 9)-(line 36,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestBitStreamGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.BitsStreamGenerator"
      ],
      "begin_line": 42,
      "end_line": 66,
      "comment": "\n     * Test BitStreamGenerator using a Random as bit source.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ran"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGeneratorTest.TestBitStreamGenerator.setSeed(int)",
      "begin_line": 46,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 12)-(line 48,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGeneratorTest.TestBitStreamGenerator.setSeed(int[])",
      "begin_line": 51,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 13)-(line 53,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGeneratorTest.TestBitStreamGenerator.setSeed(long)",
      "begin_line": 56,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 58,col 13)-(line 58,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGeneratorTest.TestBitStreamGenerator.next(int)",
      "begin_line": 62,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 13)-(line 64,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BitRandom",
      "is_interface": false,
      "parent_types": [
        "java.util.Random"
      ],
      "begin_line": 71,
      "end_line": 79,
      "comment": "\n     * Extend Random to expose next(bits)\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.BitsStreamGeneratorTest.BitRandom.BitRandom()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 13)-(line 74,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGeneratorTest.BitRandom.nextBits(int)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 13)-(line 77,col 30)"
      ]
    }
  ]
}