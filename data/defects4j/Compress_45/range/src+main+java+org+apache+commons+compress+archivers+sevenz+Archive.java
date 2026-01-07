{
  "filepath": "/tmp/Compress-45b/src/main/java/org/apache/commons/compress/archivers/sevenz/Archive.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Archive",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 22,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "packPos"
      ],
      "begin_line": 24,
      "end_line": 24,
      "comment": "/ Offset from beginning of file + SIGNATURE_HEADER_SIZE to packed streams."
    },
    {
      "type": "field",
      "varNames": [
        "packSizes"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": "/ Size of each packed stream."
    },
    {
      "type": "field",
      "varNames": [
        "packCrcsDefined"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": "/ Whether each particular packed streams has a CRC."
    },
    {
      "type": "field",
      "varNames": [
        "packCrcs"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": "/ CRCs for each packed stream, valid only if that packed stream has one."
    },
    {
      "type": "field",
      "varNames": [
        "folders"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": "/ Properties of solid compression blocks."
    },
    {
      "type": "field",
      "varNames": [
        "subStreamsInfo"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": "/ Temporary properties for non-empty files (subsumed into the files array later)."
    },
    {
      "type": "field",
      "varNames": [
        "files"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": "/ The files and directories in the archive."
    },
    {
      "type": "field",
      "varNames": [
        "streamMap"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "/ Mapping between folders, files and streams."
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Archive.toString()",
      "begin_line": 40,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 45,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Archive.lengthOf(long[])",
      "begin_line": 48,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.Archive.lengthOf(java.lang.Object[])",
      "begin_line": 52,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 63)"
      ]
    }
  ]
}