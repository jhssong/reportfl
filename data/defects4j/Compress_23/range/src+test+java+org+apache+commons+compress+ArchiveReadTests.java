{
  "filepath": "/tmp/Compress-23b/src/test/java/org/apache/commons/compress/ArchiveReadTests.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArchiveReadTests",
      "is_interface": false,
      "parent_types": [
        "AbstractTestCase"
      ],
      "begin_line": 44,
      "end_line": 104,
      "comment": "\n * Test that can read various archive file examples.\n * \n * This is a very simple implementation.\n * \n * Files must be in resources/archives, and there must be a file.txt containing\n * the list of files in the archives.\n * \n * The class uses nested suites in order to be able to name the test after the file name,\n * as JUnit does not allow one to change the display name of a test.\n "
    },
    {
      "type": "field",
      "varNames": [
        "classLoader"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "file"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fileList"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.ArchiveReadTests.ArchiveReadTests(java.lang.String)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 20)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.ArchiveReadTests.ArchiveReadTests(java.lang.String, java.io.File)",
      "begin_line": 55,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 20)",
        "(line 57,col 9)-(line 57,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.ArchiveReadTests.suite()",
      "begin_line": 60,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 60)",
        "(line 62,col 9)-(line 62,col 77)",
        "(line 63,col 9)-(line 63,col 36)",
        "(line 64,col 9)-(line 64,col 51)",
        "(line 65,col 9)-(line 65,col 62)",
        "(line 66,col 9)-(line 66,col 72)",
        "(line 67,col 9)-(line 67,col 20)",
        "(line 68,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 74,col 19)",
        "(line 75,col 9)-(line 75,col 39)",
        "(line 76,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.ArchiveReadTests.getExpectedString(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 90,
      "end_line": 93,
      "comment": " files.txt contains size and filename",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.ArchiveReadTests.testArchive()",
      "begin_line": 95,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 97,col 73)",
        "(line 98,col 9)-(line 102,col 9)"
      ]
    }
  ]
}