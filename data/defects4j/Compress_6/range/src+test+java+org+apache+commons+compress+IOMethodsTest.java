{
  "filepath": "/tmp/Compress-6b/src/test/java/org/apache/commons/compress/IOMethodsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IOMethodsTest",
      "is_interface": false,
      "parent_types": [
        "AbstractTestCase"
      ],
      "begin_line": 40,
      "end_line": 171,
      "comment": "\n * Check that the different write methods create the same output.\n * TODO perform the same checks for reads.\n "
    },
    {
      "type": "field",
      "varNames": [
        "bytesToTest"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "byteTest"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.IOMethodsTest.testWriteAr()",
      "begin_line": 52,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 70)",
        "(line 54,col 9)-(line 54,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.IOMethodsTest.testWriteCpio()",
      "begin_line": 56,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 72)",
        "(line 58,col 9)-(line 58,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.IOMethodsTest.testWriteJar()",
      "begin_line": 60,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 58)",
        "(line 62,col 9)-(line 62,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.IOMethodsTest.testWriteTar()",
      "begin_line": 64,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 61)",
        "(line 66,col 9)-(line 66,col 35)",
        "(line 67,col 9)-(line 67,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.IOMethodsTest.testWriteZip()",
      "begin_line": 69,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 58)",
        "(line 71,col 9)-(line 71,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.IOMethodsTest.testReadAr()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.IOMethodsTest.testReadCpio()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.IOMethodsTest.testReadJar()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.IOMethodsTest.testReadTar()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.IOMethodsTest.testReadZip()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.IOMethodsTest.compareWrites(java.lang.String, org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 94,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 56)",
        "(line 96,col 9)-(line 96,col 56)",
        "(line 97,col 9)-(line 97,col 56)",
        "(line 98,col 9)-(line 98,col 89)",
        "(line 99,col 9)-(line 99,col 36)",
        "(line 100,col 9)-(line 100,col 89)",
        "(line 101,col 9)-(line 101,col 36)",
        "(line 102,col 9)-(line 102,col 89)",
        "(line 103,col 9)-(line 103,col 36)",
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 33)",
        "(line 108,col 9)-(line 108,col 21)",
        "(line 110,col 9)-(line 110,col 29)",
        "(line 111,col 9)-(line 111,col 33)",
        "(line 112,col 9)-(line 112,col 21)",
        "(line 114,col 9)-(line 114,col 49)",
        "(line 115,col 9)-(line 115,col 33)",
        "(line 116,col 9)-(line 116,col 21)",
        "(line 117,col 9)-(line 117,col 67)",
        "(line 118,col 9)-(line 118,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.IOMethodsTest.compareReads(java.lang.String)",
      "begin_line": 121,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 56)",
        "(line 123,col 9)-(line 123,col 56)",
        "(line 124,col 9)-(line 124,col 56)",
        "(line 125,col 9)-(line 125,col 59)",
        "(line 126,col 9)-(line 126,col 28)",
        "(line 128,col 9)-(line 128,col 52)",
        "(line 129,col 9)-(line 129,col 86)",
        "(line 130,col 9)-(line 130,col 59)",
        "(line 131,col 9)-(line 131,col 33)",
        "(line 133,col 9)-(line 133,col 36)",
        "(line 134,col 9)-(line 134,col 40)",
        "(line 135,col 9)-(line 137,col 9)",
        "(line 139,col 9)-(line 139,col 52)",
        "(line 140,col 9)-(line 140,col 86)",
        "(line 141,col 9)-(line 141,col 60)",
        "(line 142,col 9)-(line 142,col 34)",
        "(line 143,col 9)-(line 143,col 77)",
        "(line 145,col 9)-(line 145,col 52)",
        "(line 146,col 9)-(line 146,col 86)",
        "(line 147,col 9)-(line 147,col 60)",
        "(line 148,col 9)-(line 148,col 34)",
        "(line 149,col 9)-(line 149,col 77)",
        "(line 151,col 9)-(line 151,col 14)",
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 21)",
        "(line 157,col 9)-(line 157,col 18)",
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 21)",
        "(line 163,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 21)",
        "(line 168,col 9)-(line 168,col 67)",
        "(line 169,col 9)-(line 169,col 67)"
      ]
    }
  ]
}