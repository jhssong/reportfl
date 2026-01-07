{
  "filepath": "/tmp/Compress-2b/src/main/java/org/apache/commons/compress/archivers/ar/ArArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArArchiveEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveEntry"
      ],
      "begin_line": 28,
      "end_line": 88,
      "comment": "\n * Represents an archive entry in the \"ar\" format.\n * \n * @Immutable\n "
    },
    {
      "type": "field",
      "varNames": [
        "HEADER"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " The header for each entry "
    },
    {
      "type": "field",
      "varNames": [
        "TRAILER"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " The trailer for each entry "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "userId"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "groupId"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MODE"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " \u003d (octal) 0100644 "
    },
    {
      "type": "field",
      "varNames": [
        "lastModified"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "length"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.ArArchiveEntry(java.lang.String, long)",
      "begin_line": 44,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 45,col 3)-(line 45,col 69)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.ArArchiveEntry(java.lang.String, long, int, int, int, long)",
      "begin_line": 48,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 49,col 3)-(line 49,col 19)",
        "(line 50,col 3)-(line 50,col 23)",
        "(line 51,col 3)-(line 51,col 23)",
        "(line 52,col 3)-(line 52,col 25)",
        "(line 53,col 3)-(line 53,col 19)",
        "(line 54,col 3)-(line 54,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.getSize()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 3)-(line 58,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.getName()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 3)-(line 62,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.getUserId()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 3)-(line 66,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.getGroupId()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 70,col 3)-(line 70,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.getMode()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 74,col 3)-(line 74,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.getLastModified()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 78,col 3)-(line 78,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.getLength()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 3)-(line 82,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveEntry.isDirectory()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 3)-(line 86,col 15)"
      ]
    }
  ]
}