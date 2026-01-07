{
  "filepath": "/tmp/Compress-35b/src/test/java/org/apache/commons/compress/IOMethodsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IOMethodsTest",
      "is_interface": false,
      "parent_types": [
        "AbstractTestCase"
      ],
      "begin_line": 43,
      "end_line": 194,
      "comment": "\n * Check that the different write methods create the same output.\n * TODO perform the same checks for reads.\n "
    },
    {
      "type": "field",
      "varNames": [
        "bytesToTest"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "byteTest"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.IOMethodsTest.testWriteAr()",
      "begin_line": 55,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 70)",
        "(line 58,col 9)-(line 58,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.IOMethodsTest.testWriteCpio()",
      "begin_line": 61,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 72)",
        "(line 64,col 9)-(line 64,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.IOMethodsTest.testWriteJar()",
      "begin_line": 67,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 58)",
        "(line 70,col 9)-(line 70,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.IOMethodsTest.testWriteTar()",
      "begin_line": 73,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 61)",
        "(line 76,col 9)-(line 76,col 35)",
        "(line 77,col 9)-(line 77,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.IOMethodsTest.testWriteZip()",
      "begin_line": 80,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 58)",
        "(line 83,col 9)-(line 83,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.IOMethodsTest.testReadAr()",
      "begin_line": 86,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.IOMethodsTest.testReadCpio()",
      "begin_line": 91,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.IOMethodsTest.testReadJar()",
      "begin_line": 96,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.IOMethodsTest.testReadTar()",
      "begin_line": 101,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.IOMethodsTest.testReadZip()",
      "begin_line": 106,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.IOMethodsTest.compareWrites(java.lang.String, org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 111,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 56)",
        "(line 113,col 9)-(line 113,col 56)",
        "(line 114,col 9)-(line 114,col 56)",
        "(line 115,col 9)-(line 115,col 89)",
        "(line 116,col 9)-(line 116,col 36)",
        "(line 117,col 9)-(line 117,col 89)",
        "(line 118,col 9)-(line 118,col 36)",
        "(line 119,col 9)-(line 119,col 89)",
        "(line 120,col 9)-(line 120,col 36)",
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 33)",
        "(line 125,col 9)-(line 125,col 21)",
        "(line 127,col 9)-(line 127,col 29)",
        "(line 128,col 9)-(line 128,col 33)",
        "(line 129,col 9)-(line 129,col 21)",
        "(line 131,col 9)-(line 131,col 49)",
        "(line 132,col 9)-(line 132,col 33)",
        "(line 133,col 9)-(line 133,col 21)",
        "(line 134,col 9)-(line 134,col 91)",
        "(line 135,col 9)-(line 135,col 91)",
        "(line 136,col 9)-(line 136,col 91)",
        "(line 137,col 9)-(line 137,col 91)",
        "(line 138,col 9)-(line 138,col 67)",
        "(line 139,col 9)-(line 139,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.IOMethodsTest.compareReads(java.lang.String)",
      "begin_line": 142,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 56)",
        "(line 144,col 9)-(line 144,col 56)",
        "(line 145,col 9)-(line 145,col 56)",
        "(line 146,col 9)-(line 146,col 59)",
        "(line 147,col 9)-(line 147,col 28)",
        "(line 149,col 9)-(line 149,col 52)",
        "(line 150,col 9)-(line 150,col 86)",
        "(line 151,col 9)-(line 151,col 59)",
        "(line 152,col 9)-(line 152,col 33)",
        "(line 154,col 9)-(line 154,col 36)",
        "(line 155,col 9)-(line 155,col 40)",
        "(line 156,col 9)-(line 158,col 9)",
        "(line 160,col 9)-(line 160,col 52)",
        "(line 161,col 9)-(line 161,col 86)",
        "(line 162,col 9)-(line 162,col 60)",
        "(line 163,col 9)-(line 163,col 34)",
        "(line 164,col 9)-(line 164,col 77)",
        "(line 166,col 9)-(line 166,col 52)",
        "(line 167,col 9)-(line 167,col 86)",
        "(line 168,col 9)-(line 168,col 60)",
        "(line 169,col 9)-(line 169,col 34)",
        "(line 170,col 9)-(line 170,col 77)",
        "(line 172,col 9)-(line 172,col 14)",
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 21)",
        "(line 178,col 9)-(line 178,col 18)",
        "(line 179,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 21)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 21)",
        "(line 189,col 9)-(line 189,col 91)",
        "(line 190,col 9)-(line 190,col 91)",
        "(line 191,col 9)-(line 191,col 67)",
        "(line 192,col 9)-(line 192,col 67)"
      ]
    }
  ]
}