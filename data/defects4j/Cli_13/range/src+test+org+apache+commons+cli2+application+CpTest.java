{
  "filepath": "/tmp/Cli-13b/src/test/org/apache/commons/cli2/application/CpTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CpTest",
      "is_interface": false,
      "parent_types": [
        "junit.framework.TestCase"
      ],
      "begin_line": 110,
      "end_line": 471,
      "comment": "\n * \u003cp\u003eTest the \u003ccode\u003ecp\u003c/code\u003e command. Duplicated Option types are not\n * tested e.g. -a and -d are the same Option type.\u003c/p\u003e\n *\n * \u003cp\u003eThe following is the man output for \u0027cp\u0027. See\n * \u003ca href\u003d\"http://www.rt.com/man/cp.1.html\"\u003ehttp://www.rt.com/man/cp.1.html\u003c/a\u003e.\u003c/p\u003e\n *\n * \u003cpre\u003e\n *  CP(1) FSF CP(1)\n *\n *  NAME cp - copy files and directories\n *\n *  SYNOPSIS cp [OPTION]... SOURCE DEST cp [OPTION]... SOURCE... DIRECTORY\n *\n *  DESCRIPTION Copy SOURCE to DEST, or multiple SOURCE(s) to DIRECTORY.\n *\n *  -a, --archive same as -dpR\n *\n *  -b, --backup make backup before removal\n *\n *  -d, --no-dereference preserve links\n *\n *  -f, --force remove existing destinations, never prompt\n *\n *  -i, --interactive prompt before overwrite\n *\n *  -l, --link link files instead of copying\n *\n *  -p, --preserve preserve file attributes if possible\n *\n *  -P, --parents append source path to DIRECTORY\n * -r copy recursively, non-directories as files\n *\n *  --sparse\u003dWHEN control creation of sparse files\n *\n *  -R, --recursive copy directories recursively\n *\n *  -s, --symbolic-link make symbolic links instead of copying\n *\n *  -S, --suffix\u003dSUFFIX override the usual backup suffix\n *\n *  -u, --update copy only when the SOURCE file is newer than the destination file or when the destination file is missing\n *\n *  -v, --verbose explain what is being done\n *\n *  -V, --version-control\u003dWORD override the usual version control\n *\n *  -x, --one-file-system stay on this file system\n *\n *  --help display this help and exit\n *\n *  --version output version information and exit\n *\n *  By default, sparse SOURCE files are detected by a crude heuristic and the corresponding DEST file is made sparse as well. That is the behavior selected by --sparse\u003dauto. Specify --sparse\u003dalways to create a sparse DEST file when- ever the SOURCE file contains a long enough sequence of zero bytes. Use --sparse\u003dnever to inhibit creation of sparse files.\n *\n *  The backup suffix is ~, unless set with SIMPLE_BACKUP_SUF- FIX. The version control may be set with VERSION_CONTROL, values are:\n * t, numbered make numbered backups\n *\n *  nil, existing numbered if numbered backups exist, simple other- wise\n *\n *  never, simple always make simple backups\n *\n *  As a special case, cp makes a backup of SOURCE when the force and backup options are given and SOURCE and DEST are the same name for an existing, regular file. * \u003c/pre\u003e\n * \u003c/pre\u003e\n *\n * @author Rob Oxspring\n * @author John Keyes\n "
    },
    {
      "type": "field",
      "varNames": [
        "oBuilder"
      ],
      "begin_line": 113,
      "end_line": 114,
      "comment": " Option Builder "
    },
    {
      "type": "field",
      "varNames": [
        "aBuilder"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " Argument Builder "
    },
    {
      "type": "field",
      "varNames": [
        "gBuilder"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " Group Builder "
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.application.CpTest.suite()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 43)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "source"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dest"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "targets"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "archive"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "backup"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "noDereference"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "force"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "interactive"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "link"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "preserve"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parents"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recursive1"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sparse"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recursive2"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "symbolicLink"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "suffix"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "update"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "verbose"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "versionControl"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "oneFileSystem"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "help"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "version"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.application.CpTest.setUp()",
      "begin_line": 152,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 154,col 78)",
        "(line 155,col 9)-(line 160,col 26)",
        "(line 161,col 9)-(line 161,col 55)",
        "(line 163,col 9)-(line 168,col 26)",
        "(line 170,col 9)-(line 175,col 26)",
        "(line 177,col 9)-(line 182,col 26)",
        "(line 184,col 9)-(line 189,col 26)",
        "(line 191,col 9)-(line 196,col 26)",
        "(line 198,col 9)-(line 203,col 26)",
        "(line 205,col 9)-(line 210,col 26)",
        "(line 212,col 9)-(line 217,col 26)",
        "(line 219,col 9)-(line 223,col 26)",
        "(line 225,col 9)-(line 236,col 26)",
        "(line 238,col 9)-(line 243,col 26)",
        "(line 245,col 9)-(line 250,col 26)",
        "(line 252,col 9)-(line 263,col 26)",
        "(line 265,col 9)-(line 270,col 26)",
        "(line 272,col 9)-(line 277,col 26)",
        "(line 279,col 9)-(line 291,col 26)",
        "(line 293,col 9)-(line 298,col 26)",
        "(line 300,col 9)-(line 304,col 26)",
        "(line 306,col 9)-(line 310,col 26)",
        "(line 312,col 9)-(line 335,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.application.CpTest.testNoSource()",
      "begin_line": 338,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 37)",
        "(line 340,col 9)-(line 340,col 33)",
        "(line 341,col 9)-(line 348,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.application.CpTest.testOneSource()",
      "begin_line": 351,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 66)",
        "(line 353,col 9)-(line 353,col 43)",
        "(line 354,col 9)-(line 354,col 33)",
        "(line 355,col 9)-(line 355,col 59)",
        "(line 357,col 9)-(line 357,col 70)",
        "(line 358,col 9)-(line 358,col 62)",
        "(line 359,col 9)-(line 359,col 66)",
        "(line 360,col 9)-(line 360,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.application.CpTest.testMultiSource()",
      "begin_line": 363,
      "end_line": 377,
      "comment": "",
      "child_ranges": [
        "(line 364,col 9)-(line 365,col 70)",
        "(line 366,col 9)-(line 366,col 43)",
        "(line 367,col 9)-(line 367,col 33)",
        "(line 368,col 9)-(line 368,col 59)",
        "(line 370,col 9)-(line 370,col 70)",
        "(line 371,col 9)-(line 371,col 70)",
        "(line 372,col 9)-(line 372,col 70)",
        "(line 373,col 9)-(line 373,col 62)",
        "(line 375,col 9)-(line 375,col 66)",
        "(line 376,col 9)-(line 376,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.application.CpTest.testHelp()",
      "begin_line": 379,
      "end_line": 470,
      "comment": "",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 52)",
        "(line 381,col 9)-(line 381,col 64)",
        "(line 382,col 9)-(line 382,col 40)",
        "(line 383,col 9)-(line 383,col 59)",
        "(line 384,col 9)-(line 384,col 30)",
        "(line 386,col 9)-(line 387,col 65)",
        "(line 388,col 9)-(line 390,col 27)",
        "(line 391,col 9)-(line 393,col 27)",
        "(line 394,col 9)-(line 396,col 27)",
        "(line 397,col 9)-(line 399,col 27)",
        "(line 400,col 9)-(line 402,col 27)",
        "(line 403,col 9)-(line 405,col 27)",
        "(line 406,col 9)-(line 408,col 27)",
        "(line 409,col 9)-(line 411,col 27)",
        "(line 412,col 9)-(line 414,col 27)",
        "(line 415,col 9)-(line 417,col 27)",
        "(line 418,col 9)-(line 420,col 27)",
        "(line 421,col 9)-(line 423,col 27)",
        "(line 424,col 9)-(line 426,col 27)",
        "(line 427,col 9)-(line 429,col 27)",
        "(line 430,col 9)-(line 432,col 27)",
        "(line 433,col 9)-(line 435,col 27)",
        "(line 436,col 9)-(line 438,col 27)",
        "(line 439,col 9)-(line 441,col 27)",
        "(line 442,col 9)-(line 444,col 27)",
        "(line 445,col 9)-(line 447,col 27)",
        "(line 448,col 9)-(line 450,col 27)",
        "(line 451,col 9)-(line 453,col 27)",
        "(line 454,col 9)-(line 456,col 27)",
        "(line 457,col 9)-(line 459,col 27)",
        "(line 460,col 9)-(line 462,col 27)",
        "(line 463,col 9)-(line 465,col 27)",
        "(line 466,col 9)-(line 468,col 27)",
        "(line 469,col 9)-(line 469,col 34)"
      ]
    }
  ]
}