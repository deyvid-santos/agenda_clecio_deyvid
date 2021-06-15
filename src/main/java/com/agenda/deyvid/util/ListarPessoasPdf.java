package com.agenda.deyvid.util;

import java.awt.Color;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.agenda.deyvid.models.entity.Pessoa;

@Component("/tabelas/pessoa")
public class ListarPessoasPdf extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
			@SuppressWarnings("unchecked")
			/* Listar e Fontes */
			List<Pessoa> listar = (List<Pessoa>) model.get("pessoa");
			Font fonteTitulo = FontFactory.getFont("Times",16,Color.white);
			Font fonteTituloColunas = FontFactory.getFont(FontFactory.HELVETICA_BOLD,12,Color.WHITE);
			Font fonteDataCelulas = FontFactory.getFont(FontFactory.COURIER,12,Color.BLACK);
			
			document.setPageSize(PageSize.LETTER.rotate());
			document.setMargins(-20, -20, 40, 20);
			document.open();
			

			PdfPTable tabelaTitulo = new PdfPTable(1);
			PdfPCell celula = null;
			celula = new PdfPCell(new Phrase("Lista geral de Pessoas", fonteTitulo));
			celula.setBorder(0);
			celula.setBackgroundColor(new Color(0,0,0));
			celula.setHorizontalAlignment(Element.ALIGN_CENTER);
			celula.setVerticalAlignment(Element.ALIGN_CENTER);
			celula.setPadding(30);
			
			
			tabelaTitulo.addCell(celula);
			tabelaTitulo.setSpacingAfter(30);
			
			
			PdfPTable tabelaPessoa = new PdfPTable(12);
			tabelaPessoa.setWidths(new float[] {0.8f, 2f, 2f, 2f, 2f, 2f, 2f, 2f, 2f, 2f, 2f, 2f});
			
			celula = new PdfPCell(new Phrase("ID", fonteTituloColunas));
			celula.setBackgroundColor(Color.lightGray);
			celula.setHorizontalAlignment(Element.ALIGN_CENTER);
			celula.setVerticalAlignment(Element.ALIGN_CENTER);
			celula.setPadding(10);
			tabelaPessoa.addCell(celula);
			
			celula = new PdfPCell(new Phrase("NOME", fonteTituloColunas));
			celula.setBackgroundColor(Color.lightGray);
			celula.setHorizontalAlignment(Element.ALIGN_CENTER);
			celula.setVerticalAlignment(Element.ALIGN_CENTER);
			celula.setPadding(10);
			tabelaPessoa.addCell(celula);
			
			celula = new PdfPCell(new Phrase("SOBRENOME", fonteTituloColunas));
			celula.setBackgroundColor(Color.lightGray);
			celula.setHorizontalAlignment(Element.ALIGN_CENTER);
			celula.setVerticalAlignment(Element.ALIGN_CENTER);
			celula.setPadding(10);
			tabelaPessoa.addCell(celula);

			celula = new PdfPCell(new Phrase("SEXO", fonteTituloColunas));
			celula.setBackgroundColor(Color.lightGray);
			celula.setHorizontalAlignment(Element.ALIGN_CENTER);
			celula.setVerticalAlignment(Element.ALIGN_CENTER);
			celula.setPadding(10);
			tabelaPessoa.addCell(celula);
			
			celula = new PdfPCell(new Phrase("TELEFONE 1", fonteTituloColunas));
			celula.setBackgroundColor(Color.lightGray);
			celula.setHorizontalAlignment(Element.ALIGN_CENTER);
			celula.setVerticalAlignment(Element.ALIGN_CENTER);
			celula.setPadding(10);
			tabelaPessoa.addCell(celula);
			
			celula = new PdfPCell(new Phrase("TELEFONE 2", fonteTituloColunas));
			celula.setBackgroundColor(Color.lightGray);
			celula.setHorizontalAlignment(Element.ALIGN_CENTER);
			celula.setVerticalAlignment(Element.ALIGN_CENTER);
			celula.setPadding(10);
			tabelaPessoa.addCell(celula);
			
			celula = new PdfPCell(new Phrase("EMAIL", fonteTituloColunas));
			celula.setBackgroundColor(Color.lightGray);
			celula.setHorizontalAlignment(Element.ALIGN_CENTER);
			celula.setVerticalAlignment(Element.ALIGN_CENTER);
			celula.setPadding(10);
			tabelaPessoa.addCell(celula);
			
			celula = new PdfPCell(new Phrase("ESTADO", fonteTituloColunas));
			celula.setBackgroundColor(Color.lightGray);
			celula.setHorizontalAlignment(Element.ALIGN_CENTER);
			celula.setVerticalAlignment(Element.ALIGN_CENTER);
			celula.setPadding(10);
			tabelaPessoa.addCell(celula);
			
			celula = new PdfPCell(new Phrase("CIDADE", fonteTituloColunas));
			celula.setBackgroundColor(Color.lightGray);
			celula.setHorizontalAlignment(Element.ALIGN_CENTER);
			celula.setVerticalAlignment(Element.ALIGN_CENTER);
			celula.setPadding(10);
			tabelaPessoa.addCell(celula);
			
			celula = new PdfPCell(new Phrase("ENDERECO", fonteTituloColunas));
			celula.setBackgroundColor(Color.lightGray);
			celula.setHorizontalAlignment(Element.ALIGN_CENTER);
			celula.setVerticalAlignment(Element.ALIGN_CENTER);
			celula.setPadding(10);
			tabelaPessoa.addCell(celula);
			
			celula = new PdfPCell(new Phrase("SANGUE", fonteTituloColunas));
			celula.setBackgroundColor(Color.lightGray);
			celula.setHorizontalAlignment(Element.ALIGN_CENTER);
			celula.setVerticalAlignment(Element.ALIGN_CENTER);
			celula.setPadding(10);
			tabelaPessoa.addCell(celula);
			
			celula = new PdfPCell(new Phrase("SEXO", fonteTituloColunas));
			celula.setBackgroundColor(Color.lightGray);
			celula.setHorizontalAlignment(Element.ALIGN_CENTER);
			celula.setVerticalAlignment(Element.ALIGN_CENTER);
			celula.setPadding(10);
			
			tabelaPessoa.addCell(celula);
			for(Pessoa pessoa : listar) {
				celula = new PdfPCell(new Phrase(pessoa.getIdpessoa().toString(), fonteDataCelulas));
				celula.setPadding(3);
				tabelaPessoa.addCell(celula);
				
				celula = new PdfPCell(new Phrase(pessoa.getNome(), fonteDataCelulas));
				celula.setPadding(3);
				tabelaPessoa.addCell(celula);
				
				celula = new PdfPCell(new Phrase(pessoa.getSobrenome(), fonteDataCelulas));
				celula.setPadding(3);
				tabelaPessoa.addCell(celula);
				
				celula = new PdfPCell(new Phrase(pessoa.getSexo().getSexo(), fonteDataCelulas));
				celula.setPadding(3);
				tabelaPessoa.addCell(celula);
				
				celula = new PdfPCell(new Phrase(pessoa.getTelefone1(), fonteDataCelulas));
				celula.setPadding(3);
				tabelaPessoa.addCell(celula);
				
				celula = new PdfPCell(new Phrase(pessoa.getTelefone2(), fonteDataCelulas));
				celula.setPadding(3);
				tabelaPessoa.addCell(celula);
				
				celula = new PdfPCell(new Phrase(pessoa.getEmail(), fonteDataCelulas));
				celula.setPadding(3);
				tabelaPessoa.addCell(celula);
				
				celula = new PdfPCell(new Phrase(pessoa.getEstado().getEstado(), fonteDataCelulas));
				celula.setPadding(3);
				tabelaPessoa.addCell(celula);
				
				celula = new PdfPCell(new Phrase(pessoa.getCidade(), fonteDataCelulas));
				celula.setPadding(3);
				tabelaPessoa.addCell(celula);
				
				celula = new PdfPCell(new Phrase(pessoa.getEndereco(), fonteDataCelulas));
				celula.setPadding(3);
				tabelaPessoa.addCell(celula);
				
				celula = new PdfPCell(new Phrase(pessoa.getSangue().getSangue(), fonteDataCelulas));
				celula.setPadding(3);
				tabelaPessoa.addCell(celula);
				
				celula = new PdfPCell(new Phrase(pessoa.getSexo().getSexo(), fonteDataCelulas));
				celula.setPadding(3);
				tabelaPessoa.addCell(celula);
			}
			
			document.add(tabelaTitulo);
			document.add(tabelaPessoa);		
	
	
			}
	

}
