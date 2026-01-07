{
  "filepath": "/tmp/Compress-46b/src/test/java/org/apache/commons/compress/archivers/zip/Lister.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Lister",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 150,
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
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 43)",
        "(line 51,col 9)-(line 51,col 44)",
        "(line 52,col 9)-(line 55,col 9)",
        "(line 56,col 9)-(line 84,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Lister.list(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Lister.extract(java.lang.String, org.apache.commons.compress.archivers.zip.ZipArchiveEntry, java.io.InputStream)",
      "begin_line": 91,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 54)",
        "(line 94,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 36)",
        "(line 98,col 9)-(line 105,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Lister.parse(java.lang.String[])",
      "begin_line": 108,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 49)",
        "(line 110,col 9)-(line 110,col 30)",
        "(line 111,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Lister.usage()",
      "begin_line": 145,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 147,col 68)",
        "(line 148,col 9)-(line 148,col 23)"
      ]
    }
  ]
}