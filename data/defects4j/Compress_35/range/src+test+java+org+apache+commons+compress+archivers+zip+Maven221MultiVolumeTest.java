{
  "filepath": "/tmp/Compress-35b/src/test/java/org/apache/commons/compress/archivers/zip/Maven221MultiVolumeTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Maven221MultiVolumeTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 45,
      "end_line": 125,
      "comment": "\n * JUnit testcase for a multi-volume zip file.\n *\n * Some tools (like 7-zip) allow users to split a large archives into \u0027volumes\u0027\n * with a given size to fit them into multiple cds, usb drives, or emails with\n * an attachment size limit. It\u0027s basically the same file split into chunks of\n * exactly 65536 bytes length. Concatenating volumes yields exactly the original\n * file. There is no mechanism in the ZIP algorithm to accommodate for this.\n * Before commons-compress used to enter an infinite loop on the last entry for\n * such a file. This test is intended to prove that this error doesn\u0027t occur\n * anymore. All entries but the last one are returned correctly, the last entry\n * yields an exception.\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "ENTRIES"
      ],
      "begin_line": 47,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LAST_ENTRY_NAME"
      ],
      "begin_line": 65,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Maven221MultiVolumeTest.testRead7ZipMultiVolumeArchiveForStream()",
      "begin_line": 68,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 72,col 71)",
        "(line 73,col 9)-(line 73,col 40)",
        "(line 74,col 9)-(line 112,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Maven221MultiVolumeTest.testRead7ZipMultiVolumeArchiveForFile()",
      "begin_line": 115,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 58)",
        "(line 118,col 9)-(line 123,col 9)"
      ]
    }
  ]
}