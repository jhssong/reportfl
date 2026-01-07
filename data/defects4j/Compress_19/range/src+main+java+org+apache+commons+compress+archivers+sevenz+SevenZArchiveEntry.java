{
  "filepath": "/tmp/Compress-19b/src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SevenZArchiveEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveEntry"
      ],
      "begin_line": 31,
      "end_line": 235,
      "comment": "\n * An entry in a 7z archive.\n * \n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasStream"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isDirectory"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isAntiItem"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasCreationDate"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasLastModifiedDate"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasAccessDate"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "creationDate"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastModifiedDate"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "accessDate"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasWindowsAttributes"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "windowsAttributes"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasCrc"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.SevenZArchiveEntry()",
      "begin_line": 48,
      "end_line": 49,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getName()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setName(java.lang.String)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.hasStream()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setHasStream(boolean)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.isDirectory()",
      "begin_line": 67,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setDirectory(boolean)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.isAntiItem()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Indicates whether this is an \"anti-item\" used in differential backups,\n     * meaning it should delete the same file from a previous backup. \n     * @return true if it is an anti-item, false otherwise\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setAntiItem(boolean)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Sets whether this is an \"anti-item\" used in differential backups,\n     * meaning it should delete the same file from a previous backup.\n     * @param isAntiItem true if it is an ait-item, false otherwise \n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getHasCreationDate()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setHasCreationDate(boolean)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getCreationDate()",
      "begin_line": 101,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 107,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setCreationDate(long)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setCreationDate(java.util.Date)",
      "begin_line": 114,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getHasLastModifiedDate()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setHasLastModifiedDate(boolean)",
      "begin_line": 122,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getLastModifiedDate()",
      "begin_line": 126,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 132,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setLastModifiedDate(long)",
      "begin_line": 135,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setLastModifiedDate(java.util.Date)",
      "begin_line": 139,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getHasAccessDate()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setHasAccessDate(boolean)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getAccessDate()",
      "begin_line": 151,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 152,col 9)-(line 157,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setAccessDate(long)",
      "begin_line": 160,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setAccessDate(java.util.Date)",
      "begin_line": 164,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getHasWindowsAttributes()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setHasWindowsAttributes(boolean)",
      "begin_line": 172,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getWindowsAttributes()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setWindowsAttributes(int)",
      "begin_line": 180,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getHasCrc()",
      "begin_line": 184,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setHasCrc(boolean)",
      "begin_line": 188,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getCrc()",
      "begin_line": 192,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setCrc(int)",
      "begin_line": 196,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.getSize()",
      "begin_line": 200,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.setSize(long)",
      "begin_line": 204,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.ntfsTimeToJavaTime(long)",
      "begin_line": 214,
      "end_line": 221,
      "comment": "\n     * Converts NTFS time (100 nanosecond units since 1 January 1601)\n     * to Java time.\n     * @param ntfsTime the NTFS time in 100 nanosecond units\n     * @return the Java time\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 58)",
        "(line 216,col 9)-(line 216,col 61)",
        "(line 217,col 9)-(line 217,col 43)",
        "(line 218,col 9)-(line 218,col 47)",
        "(line 219,col 9)-(line 219,col 83)",
        "(line 220,col 9)-(line 220,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.javaTimeToNtfsTime(java.util.Date)",
      "begin_line": 228,
      "end_line": 234,
      "comment": "\n     * Converts Java time to NTFS time.\n     * @param date the Java time\n     * @return the NTFS time\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 58)",
        "(line 230,col 9)-(line 230,col 61)",
        "(line 231,col 9)-(line 231,col 43)",
        "(line 232,col 9)-(line 232,col 47)",
        "(line 233,col 9)-(line 233,col 75)"
      ]
    }
  ]
}