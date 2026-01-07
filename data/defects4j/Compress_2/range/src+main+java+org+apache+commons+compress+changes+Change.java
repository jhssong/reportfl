{
  "filepath": "/tmp/Compress-2b/src/main/java/org/apache/commons/compress/changes/Change.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Change",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 95,
      "comment": "\n * @Immutable\n "
    },
    {
      "type": "field",
      "varNames": [
        "targetFile"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": " entry name to delete"
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " new entry to add"
    },
    {
      "type": "field",
      "varNames": [
        "input"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " source for new entry"
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " Type of change"
    },
    {
      "type": "field",
      "varNames": [
        "TYPE_DELETE"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Possible type values"
    },
    {
      "type": "field",
      "varNames": [
        "TYPE_ADD"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TYPE_MOVE"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " NOT USED"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.changes.Change.Change(java.lang.String)",
      "begin_line": 45,
      "end_line": 53,
      "comment": "\n\t * Constructor. Takes the filename of the file to be deleted\n\t * from the stream as argument.\n\t * @param pFilename the filename of the file to delete\n\t ",
      "child_ranges": [
        "(line 46,col 3)-(line 48,col 3)",
        "(line 49,col 3)-(line 49,col 25)",
        "(line 50,col 3)-(line 50,col 21)",
        "(line 51,col 3)-(line 51,col 15)",
        "(line 52,col 3)-(line 52,col 15)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.changes.Change.Change(org.apache.commons.compress.archivers.ArchiveEntry, java.io.InputStream)",
      "begin_line": 70,
      "end_line": 78,
      "comment": "\n\t * Construct a change which adds an entry.\n\t * \n\t * @param pEntry the entry details\n\t * @param pInput the InputStream for the entry data\n\t ",
      "child_ranges": [
        "(line 71,col 3)-(line 73,col 3)",
        "(line 74,col 3)-(line 74,col 22)",
        "(line 75,col 3)-(line 75,col 22)",
        "(line 76,col 3)-(line 76,col 18)",
        "(line 77,col 3)-(line 77,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.Change.getEntry()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 3)-(line 81,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.Change.getInput()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 3)-(line 85,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.Change.targetFile()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 3)-(line 89,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.Change.type()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 3)-(line 93,col 14)"
      ]
    }
  ]
}