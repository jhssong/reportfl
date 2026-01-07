{
  "filepath": "/tmp/Compress-41b/src/test/java/org/apache/commons/compress/ArchiveReadTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArchiveReadTest",
      "is_interface": false,
      "parent_types": [
        "AbstractTestCase"
      ],
      "begin_line": 47,
      "end_line": 110,
      "comment": "\n * Test that can read various archive file examples.\n * \n * This is a very simple implementation.\n * \n * Files must be in resources/archives, and there must be a file.txt containing\n * the list of files in the archives.\n "
    },
    {
      "type": "field",
      "varNames": [
        "CLASSLOADER"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ARCDIR"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "FILELIST"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "file"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.ArchiveReadTest.ArchiveReadTest(java.lang.String)",
      "begin_line": 56,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.ArchiveReadTest.setUpFileList()",
      "begin_line": 60,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 36)",
        "(line 63,col 9)-(line 63,col 57)",
        "(line 64,col 9)-(line 64,col 62)",
        "(line 65,col 9)-(line 65,col 78)",
        "(line 66,col 9)-(line 66,col 20)",
        "(line 67,col 9)-(line 71,col 9)",
        "(line 72,col 9)-(line 72,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.ArchiveReadTest.data()",
      "begin_line": 75,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 36)",
        "(line 78,col 9)-(line 78,col 62)",
        "(line 79,col 9)-(line 87,col 9)",
        "(line 88,col 7)-(line 88,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.ArchiveReadTest.Anonymous-4d4618a2-9cc2-434d-ad0a-f53d3a8702ef.accept(java.io.File, java.lang.String)",
      "begin_line": 80,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 17)-(line 82,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.ArchiveReadTest.getExpectedString(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 92,
      "end_line": 95,
      "comment": " files.txt contains size and filename",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.ArchiveReadTest.testArchive()",
      "begin_line": 97,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 101,col 73)",
        "(line 102,col 9)-(line 108,col 9)"
      ]
    }
  ]
}