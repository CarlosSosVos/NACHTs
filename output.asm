.data
.text
.globl main
_puchaDouglas:
	sw $fp, -4($sp)
	sw $ra, -8($sp)
	sw $s0 -12($sp)
	sw $s1 -16($sp)
	sw $s2 -20($sp)
	move $fp, $sp
	move $s0,$a0
	move $s1,$a1
	move $s2,$a2
	sub $sp,$sp,0
	add $t0,a,b
	li $t0, T0
	sw T0, -0($fp)
_Etiq0:
	blt 2,7 Etiq1
	b _Etiq3

_Etiq1:
	blt 5,9 Etiq2
	b _Etiq3

_Etiq2:
_Etiq3:
_Etiq4:
	li $v0, 'c'
_finpuchaDouglas
	move $sp, $fp
	sw $fp, -4($sp)
	sw $ra, -8($sp)
	lw $s0 -12($sp)
	lw $s1 -16($sp)
	lw $s2 -20($sp)
	Jr $ra
main:
	move $fp, $sp
	move $s0,$a0
	move $s0,$a0
	move $s0,$a0
	li $t0, RET
	sw RET, -0($fp)
	li $v0, 0
_finalo
	move $sp, $fp
	sw $fp, -4($sp)
	sw $ra, -8($sp)
	Jr $ra