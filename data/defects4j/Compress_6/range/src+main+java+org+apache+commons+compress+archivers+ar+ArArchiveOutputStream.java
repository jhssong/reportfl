{
  "filepath": "/tmp/Compress-6b/src/main/java/org/apache/commons/compress/archivers/ar/ArArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveOutputStream"
      ],
      "begin_line": 34,
      "end_line": 198,
      "comment": "\n * Implements the \"ar\" archive format as an output stream.\n * \n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "archiveOffset"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entryOffset"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prevEntry"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "haveUnclosedEntry"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "finished"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " indicates if this archive is finished "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.ArArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 45,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.writeArchiveHeader()",
      "begin_line": 49,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 74)",
        "(line 51,col 9)-(line 51,col 26)",
        "(line 52,col 9)-(line 52,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 55,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 58,col 9)",
        "(line 59,col 9)-(line 61,col 9)",
        "(line 62,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 66,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 69,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 72,col 9)",
        "(line 74,col 9)-(line 74,col 57)",
        "(line 75,col 9)-(line 85,col 9)",
        "(line 87,col 9)-(line 87,col 29)",
        "(line 89,col 9)-(line 89,col 52)",
        "(line 91,col 9)-(line 91,col 24)",
        "(line 92,col 9)-(line 92,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.fill(long, long, char)",
      "begin_line": 95,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 47)",
        "(line 98,col 9)-(line 102,col 9)",
        "(line 104,col 9)-(line 104,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.write(java.lang.String)",
      "begin_line": 107,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 52)",
        "(line 109,col 9)-(line 109,col 21)",
        "(line 110,col 9)-(line 110,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.writeEntryHeader(org.apache.commons.compress.archivers.ar.ArArchiveEntry)",
      "begin_line": 113,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 24)",
        "(line 117,col 9)-(line 117,col 42)",
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 27)",
        "(line 123,col 9)-(line 123,col 39)",
        "(line 124,col 9)-(line 124,col 57)",
        "(line 125,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 27)",
        "(line 130,col 9)-(line 130,col 39)",
        "(line 131,col 9)-(line 131,col 49)",
        "(line 132,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 27)",
        "(line 137,col 9)-(line 137,col 39)",
        "(line 138,col 9)-(line 138,col 50)",
        "(line 139,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 27)",
        "(line 144,col 9)-(line 144,col 39)",
        "(line 145,col 9)-(line 145,col 69)",
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 28)",
        "(line 151,col 9)-(line 151,col 39)",
        "(line 152,col 9)-(line 152,col 49)",
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 27)",
        "(line 158,col 9)-(line 158,col 39)",
        "(line 160,col 9)-(line 160,col 48)",
        "(line 162,col 9)-(line 162,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 165,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 31)",
        "(line 167,col 9)-(line 167,col 19)",
        "(line 168,col 9)-(line 168,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.close()",
      "begin_line": 171,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 20)",
        "(line 176,col 9)-(line 176,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 179,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.finish()",
      "begin_line": 190,
      "end_line": 197,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.compress.archivers.ArchiveOutputStream#finish()\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 24)"
      ]
    }
  ]
}