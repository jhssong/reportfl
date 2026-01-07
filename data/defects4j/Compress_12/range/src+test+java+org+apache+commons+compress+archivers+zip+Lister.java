{
  "filepath": "/tmp/Compress-12b/src/test/java/org/apache/commons/compress/archivers/zip/Lister.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Lister",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 159,
      "comment": "\n * Simple command line application that lists the contents of a ZIP archive.\n *\n * \u003cp\u003eThe name of the archive must be given as a command line argument.\u003c/p\u003e\n *\n * \u003cp\u003eOptional command line arguments specify the encoding to assume\n * and whether to use ZipFile or ZipArchiveInputStream.\u003c/p\u003e\n "
    },
    {
      "type": "class_interface",
      "name": "CommandLine",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "archive"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "useStream"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "allowStoredEntriesWithDataDescriptor"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dir"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Lister.main(java.lang.String[])",
      "begin_line": 48,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 37)",
        "(line 50,col 9)-(line 50,col 38)",
        "(line 51,col 9)-(line 54,col 9)",
        "(line 55,col 9)-(line 93,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Lister.list(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Lister.extract(java.lang.String, org.apache.commons.compress.archivers.zip.ZipArchiveEntry, java.io.InputStream)",
      "begin_line": 100,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 48)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 36)",
        "(line 107,col 9)-(line 114,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Lister.parse(java.lang.String[])",
      "begin_line": 117,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 43)",
        "(line 119,col 9)-(line 119,col 30)",
        "(line 120,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Lister.usage()",
      "begin_line": 154,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 155,col 9)-(line 156,col 68)",
        "(line 157,col 9)-(line 157,col 23)"
      ]
    }
  ]
}