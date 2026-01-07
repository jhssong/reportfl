{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/random/BitsStreamGeneratorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BitsStreamGeneratorTest",
      "is_interface": false,
      "parent_types": [
        "RandomGeneratorAbstractTest"
      ],
      "begin_line": 27,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.BitsStreamGeneratorTest.BitsStreamGeneratorTest()",
      "begin_line": 29,
      "end_line": 31,
      "comment": "",
      "child_ranges": [
        "(line 30,col 9)-(line 30,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGeneratorTest.makeGenerator()",
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
        "org.apache.commons.math3.random.BitsStreamGenerator"
      ],
      "begin_line": 43,
      "end_line": 69,
      "comment": "\n     * Test BitStreamGenerator using a Random as bit source.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ran"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGeneratorTest.TestBitStreamGenerator.setSeed(int)",
      "begin_line": 48,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 50,col 12)-(line 50,col 29)",
        "(line 51,col 12)-(line 51,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGeneratorTest.TestBitStreamGenerator.setSeed(int[])",
      "begin_line": 54,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 13)-(line 56,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGeneratorTest.TestBitStreamGenerator.setSeed(long)",
      "begin_line": 59,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 61,col 13)-(line 61,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGeneratorTest.TestBitStreamGenerator.next(int)",
      "begin_line": 65,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 13)-(line 67,col 38)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BitRandom",
      "is_interface": false,
      "parent_types": [
        "java.util.Random"
      ],
      "begin_line": 74,
      "end_line": 82,
      "comment": "\n     * Extend Random to expose next(bits)\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.BitsStreamGeneratorTest.BitRandom.BitRandom()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 13)-(line 77,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.BitsStreamGeneratorTest.BitRandom.nextBits(int)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 13)-(line 80,col 30)"
      ]
    }
  ]
}