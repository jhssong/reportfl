{
  "filepath": "/tmp/Math-40b/src/test/java/org/apache/commons/math/random/BitsStreamGeneratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BitsStreamGeneratorTest",
      "is_interface": false,
      "parent_types": [
        "RandomGeneratorAbstractTest"
      ],
      "begin_line": 27,
      "end_line": 82,
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
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 65)",
        "(line 36,col 9)-(line 36,col 32)",
        "(line 37,col 9)-(line 37,col 25)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestBitStreamGenerator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.random.BitsStreamGenerator"
      ],
      "begin_line": 43,
      "end_line": 67,
      "comment": "\n     * Test BitStreamGenerator using a Random as bit source.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ran"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGeneratorTest.TestBitStreamGenerator.setSeed(int)",
      "begin_line": 47,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 12)-(line 49,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGeneratorTest.TestBitStreamGenerator.setSeed(int[])",
      "begin_line": 52,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 13)-(line 54,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGeneratorTest.TestBitStreamGenerator.setSeed(long)",
      "begin_line": 57,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 59,col 13)-(line 59,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGeneratorTest.TestBitStreamGenerator.next(int)",
      "begin_line": 63,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 13)-(line 65,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BitRandom",
      "is_interface": false,
      "parent_types": [
        "java.util.Random"
      ],
      "begin_line": 72,
      "end_line": 80,
      "comment": "\n     * Extend Random to expose next(bits)\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.BitsStreamGeneratorTest.BitRandom.BitRandom()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 13)-(line 75,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGeneratorTest.BitRandom.nextBits(int)",
      "begin_line": 77,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 78,col 13)-(line 78,col 30)"
      ]
    }
  ]
}