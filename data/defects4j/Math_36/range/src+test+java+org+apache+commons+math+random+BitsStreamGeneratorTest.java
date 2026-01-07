{
  "filepath": "/tmp/Math-36b/src/test/java/org/apache/commons/math/random/BitsStreamGeneratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BitsStreamGeneratorTest",
      "is_interface": false,
      "parent_types": [
        "RandomGeneratorAbstractTest"
      ],
      "begin_line": 27,
      "end_line": 83,
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
      "end_line": 68,
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
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 49,col 12)-(line 49,col 29)",
        "(line 50,col 12)-(line 50,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGeneratorTest.TestBitStreamGenerator.setSeed(int[])",
      "begin_line": 53,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 13)-(line 55,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGeneratorTest.TestBitStreamGenerator.setSeed(long)",
      "begin_line": 58,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 60,col 13)-(line 60,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGeneratorTest.TestBitStreamGenerator.next(int)",
      "begin_line": 64,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 13)-(line 66,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BitRandom",
      "is_interface": false,
      "parent_types": [
        "java.util.Random"
      ],
      "begin_line": 73,
      "end_line": 81,
      "comment": "\n     * Extend Random to expose next(bits)\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.BitsStreamGeneratorTest.BitRandom.BitRandom()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 13)-(line 76,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.BitsStreamGeneratorTest.BitRandom.nextBits(int)",
      "begin_line": 78,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 13)-(line 79,col 30)"
      ]
    }
  ]
}