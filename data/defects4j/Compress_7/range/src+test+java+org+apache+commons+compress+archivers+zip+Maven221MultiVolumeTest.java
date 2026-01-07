{
  "filepath": "/tmp/Compress-7b/src/test/java/org/apache/commons/compress/archivers/zip/Maven221MultiVolumeTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Maven221MultiVolumeTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 46,
      "end_line": 128,
      "comment": "\n * JUnit 3 testcase for a multi-volume zip file.\n *\n * Some tools (like 7-zip) allow users to split a large archives into \u0027volumes\u0027\n * with a given size to fit them into multiple cds, usb drives, or emails with\n * an attachment size limit. It\u0027s basically the same file split into chunks of\n * exactly 65536 bytes length. Concatenating volumes yields exactly the original\n * file. There is no mechanism in the ZIP algorithm to accommodate for this.\n * Before commons-compress used to enter an infinite loop on the last entry for\n * such a file. This test is intended to prove that this error doesn\u0027t occur\n * anymore. All entries but the last one are returned correctly, the last entry\n * yields an exception.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "ENTRIES"
      ],
      "begin_line": 48,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LAST_ENTRY_NAME"
      ],
      "begin_line": 66,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Maven221MultiVolumeTest.testRead7ZipMultiVolumeArchiveForStream()",
      "begin_line": 69,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 72)",
        "(line 73,col 9)-(line 74,col 47)",
        "(line 75,col 9)-(line 75,col 40)",
        "(line 76,col 9)-(line 114,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Maven221MultiVolumeTest.testRead7ZipMultiVolumeArchiveForFile()",
      "begin_line": 117,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 72)",
        "(line 120,col 9)-(line 120,col 54)",
        "(line 121,col 9)-(line 126,col 9)"
      ]
    }
  ]
}