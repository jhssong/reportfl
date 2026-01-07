{
  "filepath": "/tmp/Compress-27b/src/test/java/org/apache/commons/compress/archivers/zip/Lister.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Lister",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 160,
      "comment": "\n * Simple command line application that lists the contents of a ZIP archive.\n *\n * \u003cp\u003eThe name of the archive must be given as a command line argument.\u003c/p\u003e\n *\n * \u003cp\u003eOptional command line arguments specify the encoding to assume\n * and whether to use ZipFile or ZipArchiveInputStream.\u003c/p\u003e\n "
    },
    {
      "type": "class_interface",
      "name": "CommandLine",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "archive"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "useStream"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "allowStoredEntriesWithDataDescriptor"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dir"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Lister.main(java.lang.String[])",
      "begin_line": 49,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 37)",
        "(line 51,col 9)-(line 51,col 38)",
        "(line 52,col 9)-(line 55,col 9)",
        "(line 56,col 9)-(line 94,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Lister.list(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Lister.extract(java.lang.String, org.apache.commons.compress.archivers.zip.ZipArchiveEntry, java.io.InputStream)",
      "begin_line": 101,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 48)",
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 36)",
        "(line 108,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Lister.parse(java.lang.String[])",
      "begin_line": 118,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 43)",
        "(line 120,col 9)-(line 120,col 30)",
        "(line 121,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Lister.usage()",
      "begin_line": 155,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 157,col 68)",
        "(line 158,col 9)-(line 158,col 23)"
      ]
    }
  ]
}